/*
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import eu.stamp.mfts.mFTS.Model
import eu.stamp.mfts.mFTS.TestSequence
import eu.stamp.mfts.mFTS.Action
import eu.stamp.mfts.mFTS.Seq
import eu.stamp.mfts.mFTS.Send
import eu.stamp.mfts.mFTS.Service

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UMLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(Model).forEach[ m, i | 
			val builder = new StringBuilder();
			generate(m, builder)
			fsa.generateFile('test' + i + '.mfts', builder.toString)	
		]
	}
	
	private def void generate(Model m, StringBuilder builder) {
		builder.append("@startuml");
		m.tests.forEach[ t | 
			generate(t, builder)
		]
		builder.append("@stopuml");
	}
	
	private def void generate(TestSequence t, StringBuilder builder) {
		generate(t.actions, builder)
	}
	
	private def void generate(Action t, StringBuilder builder) {
		throw new UnsupportedOperationException("Action " + t.class.name + " is not implemented yet. Please contact Franck Fleurey!")
	}
	
	private def void generate(Seq s, StringBuilder builder) {
		s.actions.forEach[ a | 
			generate(a, builder)
		]
	}
	
	private def void generate(Send s, StringBuilder builder) {
		val from = s.eContainer as Service
		builder.append(from.name)
		builder.append(" -> ")
		builder.append(s.service.name)
	}
}
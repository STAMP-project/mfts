/*
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMFTSValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(eu.stamp.mfts.mFTS.MFTSPackage.eINSTANCE);
		return result;
	}
	
}

/*
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.parser.antlr;

import com.google.inject.Inject;
import eu.stamp.mfts.parser.antlr.internal.InternalMFTSParser;
import eu.stamp.mfts.services.MFTSGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MFTSParser extends AbstractAntlrParser {

	@Inject
	private MFTSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMFTSParser createParser(XtextTokenStream stream) {
		return new InternalMFTSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MFTSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MFTSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
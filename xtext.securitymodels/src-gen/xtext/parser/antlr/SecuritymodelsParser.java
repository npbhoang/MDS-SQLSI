/*
 * generated by Xtext 2.15.0
 */
package xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.parser.antlr.internal.InternalSecuritymodelsParser;
import xtext.services.SecuritymodelsGrammarAccess;

public class SecuritymodelsParser extends AbstractAntlrParser {

	@Inject
	private SecuritymodelsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSecuritymodelsParser createParser(XtextTokenStream stream) {
		return new InternalSecuritymodelsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SecurityModel";
	}

	public SecuritymodelsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SecuritymodelsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

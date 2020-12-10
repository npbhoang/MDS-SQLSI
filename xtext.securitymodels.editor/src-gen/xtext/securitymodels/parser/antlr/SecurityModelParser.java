/*
 * generated by Xtext 2.15.0
 */
package xtext.securitymodels.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.securitymodels.parser.antlr.internal.InternalSecurityModelParser;
import xtext.securitymodels.services.SecurityModelGrammarAccess;

public class SecurityModelParser extends AbstractAntlrParser {

	@Inject
	private SecurityModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSecurityModelParser createParser(XtextTokenStream stream) {
		return new InternalSecurityModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SecurityModel";
	}

	public SecurityModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SecurityModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

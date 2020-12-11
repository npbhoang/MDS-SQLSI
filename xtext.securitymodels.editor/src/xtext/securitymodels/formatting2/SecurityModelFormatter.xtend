/*
 * generated by Xtext 2.15.0
 */
package xtext.securitymodels.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import securitymodels.Rule
import securitymodels.SecurityModel
import xtext.securitymodels.services.SecurityModelGrammarAccess

class SecurityModelFormatter extends AbstractFormatter2 {
	
	@Inject extension SecurityModelGrammarAccess

	def dispatch void format(SecurityModel securityModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (role : securityModel.roles) {
			role.format
		}
		for (rule : securityModel.rules) {
			rule.format
		}
	}

	def dispatch void format(Rule rule, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (auth : rule.auths) {
			auth.format
		}
	}
	
	// TODO: implement for 
}
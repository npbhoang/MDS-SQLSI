/*
 * generated by Xtext 2.15.0
 */
grammar InternalSecurityModel;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package xtext.securitymodels.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package xtext.securitymodels.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.securitymodels.services.SecurityModelGrammarAccess;

}

@parser::members {

 	private SecurityModelGrammarAccess grammarAccess;

    public InternalSecurityModelParser(TokenStream input, SecurityModelGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SecurityModel";
   	}

   	@Override
   	protected SecurityModelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSecurityModel
entryRuleSecurityModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSecurityModelRule()); }
	iv_ruleSecurityModel=ruleSecurityModel
	{ $current=$iv_ruleSecurityModel.current; }
	EOF;

// Rule SecurityModel
ruleSecurityModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSecurityModelAccess().getSecurityModelAction_0(),
					$current);
			}
		)
		otherlv_1='name:'
		{
			newLeafNode(otherlv_1, grammarAccess.getSecurityModelAccess().getNameKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecurityModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"xtext.securitymodels.SecurityModel.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='roles:'
		{
			newLeafNode(otherlv_3, grammarAccess.getSecurityModelAccess().getRolesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_4_0());
				}
				lv_roles_4_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecurityModelRule());
					}
					add(
						$current,
						"roles",
						lv_roles_4_0,
						"xtext.securitymodels.SecurityModel.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='protected:'
		{
			newLeafNode(otherlv_5, grammarAccess.getSecurityModelAccess().getProtectedKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_6_0());
				}
				lv_resources_6_0=ruleProtectedResource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecurityModelRule());
					}
					add(
						$current,
						"resources",
						lv_resources_6_0,
						"xtext.securitymodels.SecurityModel.ProtectedResource");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getSecurityModelAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_7_1_0());
					}
					lv_resources_8_0=ruleProtectedResource
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSecurityModelRule());
						}
						add(
							$current,
							"resources",
							lv_resources_8_0,
							"xtext.securitymodels.SecurityModel.ProtectedResource");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_9='rules:'
			{
				newLeafNode(otherlv_9, grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_1_0());
					}
					lv_rules_10_0=ruleRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSecurityModelRule());
						}
						add(
							$current,
							"rules",
							lv_rules_10_0,
							"xtext.securitymodels.SecurityModel.Rule");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"xtext.securitymodels.SecurityModel.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_2_0());
				}
				lv_action_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"action",
						lv_action_2_0,
						"xtext.securitymodels.SecurityModel.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='conditions'
		{
			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getConditionsKeyword_3());
		}
		(
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_1_0());
					}
					lv_auths_5_0=ruleAuth
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"auths",
							lv_auths_5_0,
							"xtext.securitymodels.SecurityModel.Auth");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6='or'
				{
					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getOrKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_2_1_0());
						}
						lv_auths_7_0=ruleAuth
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleRule());
							}
							add(
								$current,
								"auths",
								lv_auths_7_0,
								"xtext.securitymodels.SecurityModel.Auth");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	iv_ruleRole=ruleRole
	{ $current=$iv_ruleRole.current; }
	EOF;

// Rule Role
ruleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0());
			}
			lv_name_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRoleRule());
				}
				set(
					$current,
					"name",
					lv_name_0_0,
					"xtext.securitymodels.SecurityModel.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleAuth
entryRuleAuth returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAuthRule()); }
	iv_ruleAuth=ruleAuth
	{ $current=$iv_ruleAuth.current; }
	EOF;

// Rule Auth
ruleAuth returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0());
		}
		otherlv_1='roles'
		{
			newLeafNode(otherlv_1, grammarAccess.getAuthAccess().getRolesKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAuthRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getAuthAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAuthRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAuthAccess().getRightParenthesisKeyword_5());
		}
		otherlv_7='context:'
		{
			newLeafNode(otherlv_7, grammarAccess.getAuthAccess().getContextKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_7_0());
				}
				lv_textual_8_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAuthRule());
					}
					set(
						$current,
						"textual",
						lv_textual_8_0,
						"xtext.securitymodels.SecurityModel.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='ocl:'
		{
			newLeafNode(otherlv_9, grammarAccess.getAuthAccess().getOclKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_9_0());
				}
				lv_oclExp_10_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAuthRule());
					}
					set(
						$current,
						"oclExp",
						lv_oclExp_10_0,
						"xtext.securitymodels.SecurityModel.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='sql:'
		{
			newLeafNode(otherlv_11, grammarAccess.getAuthAccess().getSqlKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_11_0());
				}
				lv_sqlStm_12_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAuthRule());
					}
					set(
						$current,
						"sqlStm",
						lv_sqlStm_12_0,
						"xtext.securitymodels.SecurityModel.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleProtectedResource
entryRuleProtectedResource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProtectedResourceRule()); }
	iv_ruleProtectedResource=ruleProtectedResource
	{ $current=$iv_ruleProtectedResource.current; }
	EOF;

// Rule ProtectedResource
ruleProtectedResource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProtectedResourceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0());
				}
			)
		)
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getProtectedResourceAccess().getAsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProtectedResourceRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"xtext.securitymodels.SecurityModel.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Rule Action
ruleAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='READ'
			{
				$current = grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='CREATE'
			{
				$current = grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='UPDATE'
			{
				$current = grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DELETE'
			{
				$current = grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

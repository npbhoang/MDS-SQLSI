/*
 * generated by Xtext 2.15.0
 */
grammar InternalSecurityModel;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package xtext.securitymodels.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package xtext.securitymodels.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import xtext.securitymodels.services.SecurityModelGrammarAccess;

}
@parser::members {
	private SecurityModelGrammarAccess grammarAccess;

	public void setGrammarAccess(SecurityModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleSecurityModel
entryRuleSecurityModel
:
{ before(grammarAccess.getSecurityModelRule()); }
	 ruleSecurityModel
{ after(grammarAccess.getSecurityModelRule()); } 
	 EOF 
;

// Rule SecurityModel
ruleSecurityModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSecurityModelAccess().getGroup()); }
		(rule__SecurityModel__Group__0)
		{ after(grammarAccess.getSecurityModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRole
entryRuleRole
:
{ before(grammarAccess.getRoleRule()); }
	 ruleRole
{ after(grammarAccess.getRoleRule()); } 
	 EOF 
;

// Rule Role
ruleRole 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoleAccess().getNameAssignment()); }
		(rule__Role__NameAssignment)
		{ after(grammarAccess.getRoleAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAuth
entryRuleAuth
:
{ before(grammarAccess.getAuthRule()); }
	 ruleAuth
{ after(grammarAccess.getAuthRule()); } 
	 EOF 
;

// Rule Auth
ruleAuth 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAuthAccess().getGroup()); }
		(rule__Auth__Group__0)
		{ after(grammarAccess.getAuthAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProtectedResource
entryRuleProtectedResource
:
{ before(grammarAccess.getProtectedResourceRule()); }
	 ruleProtectedResource
{ after(grammarAccess.getProtectedResourceRule()); } 
	 EOF 
;

// Rule ProtectedResource
ruleProtectedResource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProtectedResourceAccess().getGroup()); }
		(rule__ProtectedResource__Group__0)
		{ after(grammarAccess.getProtectedResourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Action
ruleAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); }
		('READ')
		{ after(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); }
		('CREATE')
		{ after(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); }
		('UPDATE')
		{ after(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3()); }
		('DELETE')
		{ after(grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__0__Impl
	rule__SecurityModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getSecurityModelAction_0()); }
	()
	{ after(grammarAccess.getSecurityModelAccess().getSecurityModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__1__Impl
	rule__SecurityModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getNameKeyword_1()); }
	'name:'
	{ after(grammarAccess.getSecurityModelAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__2__Impl
	rule__SecurityModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getNameAssignment_2()); }
	(rule__SecurityModel__NameAssignment_2)
	{ after(grammarAccess.getSecurityModelAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__3__Impl
	rule__SecurityModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getRolesKeyword_3()); }
	'roles:'
	{ after(grammarAccess.getSecurityModelAccess().getRolesKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__4__Impl
	rule__SecurityModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); }
		(rule__SecurityModel__RolesAssignment_4)
		{ after(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); }
	)
	(
		{ before(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); }
		(rule__SecurityModel__RolesAssignment_4)*
		{ after(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__5__Impl
	rule__SecurityModel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getProtectedKeyword_5()); }
	'protected:'
	{ after(grammarAccess.getSecurityModelAccess().getProtectedKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__6__Impl
	rule__SecurityModel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_6()); }
	(rule__SecurityModel__ResourcesAssignment_6)
	{ after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__7__Impl
	rule__SecurityModel__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getGroup_7()); }
	(rule__SecurityModel__Group_7__0)*
	{ after(grammarAccess.getSecurityModelAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getGroup_8()); }
	(rule__SecurityModel__Group_8__0)?
	{ after(grammarAccess.getSecurityModelAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecurityModel__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group_7__0__Impl
	rule__SecurityModel__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getSecurityModelAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_7_1()); }
	(rule__SecurityModel__ResourcesAssignment_7_1)
	{ after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecurityModel__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group_8__0__Impl
	rule__SecurityModel__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0()); }
	'rules:'
	{ after(grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecurityModel__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); }
		(rule__SecurityModel__RulesAssignment_8_1)
		{ after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); }
	)
	(
		{ before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); }
		(rule__SecurityModel__RulesAssignment_8_1)*
		{ after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getNameAssignment_0()); }
	(rule__Rule__NameAssignment_0)
	{ after(grammarAccess.getRuleAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getRuleAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getActionAssignment_2()); }
	(rule__Rule__ActionAssignment_2)
	{ after(grammarAccess.getRuleAccess().getActionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__3__Impl
	rule__Rule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getConditionsKeyword_3()); }
	'conditions'
	{ after(grammarAccess.getRuleAccess().getConditionsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getGroup_4()); }
	(rule__Rule__Group_4__0)?
	{ after(grammarAccess.getRuleAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_4__0__Impl
	rule__Rule__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4_0()); }
	'{'
	{ after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_4__1__Impl
	rule__Rule__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getAuthsAssignment_4_1()); }
	(rule__Rule__AuthsAssignment_4_1)
	{ after(grammarAccess.getRuleAccess().getAuthsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_4__2__Impl
	rule__Rule__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getGroup_4_2()); }
	(rule__Rule__Group_4_2__0)*
	{ after(grammarAccess.getRuleAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4_3()); }
	'}'
	{ after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_4_2__0__Impl
	rule__Rule__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getOrKeyword_4_2_0()); }
	'or'
	{ after(grammarAccess.getRuleAccess().getOrKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getAuthsAssignment_4_2_1()); }
	(rule__Rule__AuthsAssignment_4_2_1)
	{ after(grammarAccess.getRuleAccess().getAuthsAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Auth__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__0__Impl
	rule__Auth__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__1__Impl
	rule__Auth__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getRolesKeyword_1()); }
	'roles'
	{ after(grammarAccess.getAuthAccess().getRolesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__2__Impl
	rule__Auth__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__3__Impl
	rule__Auth__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getRolesAssignment_3()); }
	(rule__Auth__RolesAssignment_3)
	{ after(grammarAccess.getAuthAccess().getRolesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__4__Impl
	rule__Auth__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getGroup_4()); }
	(rule__Auth__Group_4__0)*
	{ after(grammarAccess.getAuthAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__5__Impl
	rule__Auth__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getAuthAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__6__Impl
	rule__Auth__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getContextKeyword_6()); }
	'context:'
	{ after(grammarAccess.getAuthAccess().getContextKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__7__Impl
	rule__Auth__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getTextualAssignment_7()); }
	(rule__Auth__TextualAssignment_7)
	{ after(grammarAccess.getAuthAccess().getTextualAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__8__Impl
	rule__Auth__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getOclKeyword_8()); }
	'ocl:'
	{ after(grammarAccess.getAuthAccess().getOclKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__9__Impl
	rule__Auth__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getOclExpAssignment_9()); }
	(rule__Auth__OclExpAssignment_9)
	{ after(grammarAccess.getAuthAccess().getOclExpAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__10__Impl
	rule__Auth__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getSqlKeyword_10()); }
	'sql:'
	{ after(grammarAccess.getAuthAccess().getSqlKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__11__Impl
	rule__Auth__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getSqlStmAssignment_11()); }
	(rule__Auth__SqlStmAssignment_11)
	{ after(grammarAccess.getAuthAccess().getSqlStmAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Auth__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group_4__0__Impl
	rule__Auth__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getAuthAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Auth__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAuthAccess().getRolesAssignment_4_1()); }
	(rule__Auth__RolesAssignment_4_1)
	{ after(grammarAccess.getAuthAccess().getRolesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProtectedResource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProtectedResource__Group__0__Impl
	rule__ProtectedResource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProtectedResource__Group__1__Impl
	rule__ProtectedResource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_1()); }
	(rule__ProtectedResource__PropertyAssignment_1)
	{ after(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProtectedResource__Group__2__Impl
	rule__ProtectedResource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtectedResourceAccess().getAsKeyword_2()); }
	'as'
	{ after(grammarAccess.getProtectedResourceAccess().getAsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProtectedResource__Group__3__Impl
	rule__ProtectedResource__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtectedResourceAccess().getNameAssignment_3()); }
	(rule__ProtectedResource__NameAssignment_3)
	{ after(grammarAccess.getProtectedResourceAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProtectedResource__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecurityModel__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__RolesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_4_0()); }
		ruleRole
		{ after(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__ResourcesAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_6_0()); }
		ruleProtectedResource
		{ after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__ResourcesAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_7_1_0()); }
		ruleProtectedResource
		{ after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecurityModel__RulesAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_1_0()); }
		ruleRule
		{ after(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ActionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_2_0()); }
		ruleAction
		{ after(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__AuthsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_1_0()); }
		ruleAuth
		{ after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__AuthsAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_2_1_0()); }
		ruleAuth
		{ after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Role__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0()); }
		ruleEString
		{ after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__RolesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0()); }
		(
			{ before(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__RolesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_4_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__TextualAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_7_0()); }
		ruleEString
		{ after(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__OclExpAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_9_0()); }
		ruleEString
		{ after(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Auth__SqlStmAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_11_0()); }
		ruleEString
		{ after(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__PropertyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0()); }
		(
			{ before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProtectedResource__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

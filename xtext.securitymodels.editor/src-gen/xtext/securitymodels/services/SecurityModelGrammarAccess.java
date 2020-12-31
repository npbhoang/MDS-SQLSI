/*
 * generated by Xtext 2.15.0
 */
package xtext.securitymodels.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SecurityModelGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SecurityModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.SecurityModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSecurityModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRolesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRolesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRolesRoleParserRuleCall_4_0 = (RuleCall)cRolesAssignment_4.eContents().get(0);
		private final Keyword cProtectedKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cResourcesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cResourcesProtectedResourceParserRuleCall_6_0 = (RuleCall)cResourcesAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cResourcesAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cResourcesProtectedResourceParserRuleCall_7_1_0 = (RuleCall)cResourcesAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cRulesKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cRulesAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_8_1_0 = (RuleCall)cRulesAssignment_8_1.eContents().get(0);
		
		//SecurityModel:
		//	{SecurityModel}
		//	'name:' name=EString
		//	'roles:' roles+=Role+
		//	'protected:' resources+=ProtectedResource ("," resources+=ProtectedResource)* ('rules:' rules+=Rule+)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{SecurityModel} 'name:' name=EString 'roles:' roles+=Role+ 'protected:' resources+=ProtectedResource (","
		//resources+=ProtectedResource)* ('rules:' rules+=Rule+)?
		public Group getGroup() { return cGroup; }
		
		//{SecurityModel}
		public Action getSecurityModelAction_0() { return cSecurityModelAction_0; }
		
		//'name:'
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'roles:'
		public Keyword getRolesKeyword_3() { return cRolesKeyword_3; }
		
		//roles+=Role+
		public Assignment getRolesAssignment_4() { return cRolesAssignment_4; }
		
		//Role
		public RuleCall getRolesRoleParserRuleCall_4_0() { return cRolesRoleParserRuleCall_4_0; }
		
		//'protected:'
		public Keyword getProtectedKeyword_5() { return cProtectedKeyword_5; }
		
		//resources+=ProtectedResource
		public Assignment getResourcesAssignment_6() { return cResourcesAssignment_6; }
		
		//ProtectedResource
		public RuleCall getResourcesProtectedResourceParserRuleCall_6_0() { return cResourcesProtectedResourceParserRuleCall_6_0; }
		
		//("," resources+=ProtectedResource)*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//resources+=ProtectedResource
		public Assignment getResourcesAssignment_7_1() { return cResourcesAssignment_7_1; }
		
		//ProtectedResource
		public RuleCall getResourcesProtectedResourceParserRuleCall_7_1_0() { return cResourcesProtectedResourceParserRuleCall_7_1_0; }
		
		//('rules:' rules+=Rule+)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'rules:'
		public Keyword getRulesKeyword_8_0() { return cRulesKeyword_8_0; }
		
		//rules+=Rule+
		public Assignment getRulesAssignment_8_1() { return cRulesAssignment_8_1; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_8_1_0() { return cRulesRuleParserRuleCall_8_1_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionActionEnumRuleCall_2_0 = (RuleCall)cActionAssignment_2.eContents().get(0);
		private final Keyword cConditionsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAuthsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAuthsAuthParserRuleCall_4_1_0 = (RuleCall)cAuthsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cOrKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cAuthsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cAuthsAuthParserRuleCall_4_2_1_0 = (RuleCall)cAuthsAssignment_4_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		
		//Rule:
		//	name=EString
		//	':'
		//	action=Action
		//	'conditions' ('{' auths+=Auth ("or" auths+=Auth)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString ':' action=Action 'conditions' ('{' auths+=Auth ("or" auths+=Auth)* '}')?
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//action=Action
		public Assignment getActionAssignment_2() { return cActionAssignment_2; }
		
		//Action
		public RuleCall getActionActionEnumRuleCall_2_0() { return cActionActionEnumRuleCall_2_0; }
		
		//'conditions'
		public Keyword getConditionsKeyword_3() { return cConditionsKeyword_3; }
		
		//('{' auths+=Auth ("or" auths+=Auth)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_0() { return cLeftCurlyBracketKeyword_4_0; }
		
		//auths+=Auth
		public Assignment getAuthsAssignment_4_1() { return cAuthsAssignment_4_1; }
		
		//Auth
		public RuleCall getAuthsAuthParserRuleCall_4_1_0() { return cAuthsAuthParserRuleCall_4_1_0; }
		
		//("or" auths+=Auth)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//"or"
		public Keyword getOrKeyword_4_2_0() { return cOrKeyword_4_2_0; }
		
		//auths+=Auth
		public Assignment getAuthsAssignment_4_2_1() { return cAuthsAssignment_4_2_1; }
		
		//Auth
		public RuleCall getAuthsAuthParserRuleCall_4_2_1_0() { return cAuthsAuthParserRuleCall_4_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }
	}
	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.Role");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Role:
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0() { return cNameEStringParserRuleCall_0; }
	}
	public class AuthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.Auth");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cRolesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRolesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRolesRoleCrossReference_3_0 = (CrossReference)cRolesAssignment_3.eContents().get(0);
		private final RuleCall cRolesRoleEStringParserRuleCall_3_0_1 = (RuleCall)cRolesRoleCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRolesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cRolesRoleCrossReference_4_1_0 = (CrossReference)cRolesAssignment_4_1.eContents().get(0);
		private final RuleCall cRolesRoleEStringParserRuleCall_4_1_0_1 = (RuleCall)cRolesRoleCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cContextKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTextualAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTextualEStringParserRuleCall_7_0 = (RuleCall)cTextualAssignment_7.eContents().get(0);
		private final Keyword cOclKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cOclExpAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cOclExpEStringParserRuleCall_9_0 = (RuleCall)cOclExpAssignment_9.eContents().get(0);
		private final Keyword cSqlKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cSqlStmAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cSqlStmEStringParserRuleCall_11_0 = (RuleCall)cSqlStmAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//Auth:
		//	'{'
		//	'roles' '(' roles+=[Role|EString] ("," roles+=[Role|EString])* ')'
		//	'context:' textual=EString
		//	'ocl:' oclExp=EString
		//	'sql:' sqlStm=EString
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' 'roles' '(' roles+=[Role|EString] ("," roles+=[Role|EString])* ')' 'context:' textual=EString 'ocl:' oclExp=EString
		//'sql:' sqlStm=EString '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//'roles'
		public Keyword getRolesKeyword_1() { return cRolesKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//roles+=[Role|EString]
		public Assignment getRolesAssignment_3() { return cRolesAssignment_3; }
		
		//[Role|EString]
		public CrossReference getRolesRoleCrossReference_3_0() { return cRolesRoleCrossReference_3_0; }
		
		//EString
		public RuleCall getRolesRoleEStringParserRuleCall_3_0_1() { return cRolesRoleEStringParserRuleCall_3_0_1; }
		
		//("," roles+=[Role|EString])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//roles+=[Role|EString]
		public Assignment getRolesAssignment_4_1() { return cRolesAssignment_4_1; }
		
		//[Role|EString]
		public CrossReference getRolesRoleCrossReference_4_1_0() { return cRolesRoleCrossReference_4_1_0; }
		
		//EString
		public RuleCall getRolesRoleEStringParserRuleCall_4_1_0_1() { return cRolesRoleEStringParserRuleCall_4_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'context:'
		public Keyword getContextKeyword_6() { return cContextKeyword_6; }
		
		//textual=EString
		public Assignment getTextualAssignment_7() { return cTextualAssignment_7; }
		
		//EString
		public RuleCall getTextualEStringParserRuleCall_7_0() { return cTextualEStringParserRuleCall_7_0; }
		
		//'ocl:'
		public Keyword getOclKeyword_8() { return cOclKeyword_8; }
		
		//oclExp=EString
		public Assignment getOclExpAssignment_9() { return cOclExpAssignment_9; }
		
		//EString
		public RuleCall getOclExpEStringParserRuleCall_9_0() { return cOclExpEStringParserRuleCall_9_0; }
		
		//'sql:'
		public Keyword getSqlKeyword_10() { return cSqlKeyword_10; }
		
		//sqlStm=EString
		public Assignment getSqlStmAssignment_11() { return cSqlStmAssignment_11; }
		
		//EString
		public RuleCall getSqlStmEStringParserRuleCall_11_0() { return cSqlStmEStringParserRuleCall_11_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}
	public class ProtectedResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.ProtectedResource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPropertyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPropertyPropertyCrossReference_1_0 = (CrossReference)cPropertyAssignment_1.eContents().get(0);
		private final RuleCall cPropertyPropertyIDTerminalRuleCall_1_0_1 = (RuleCall)cPropertyPropertyCrossReference_1_0.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ProtectedResource:
		//	'('
		//	property=[datamodels::Property]
		//	'as'
		//	name=EString
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' property=[datamodels::Property] 'as' name=EString ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//property=[datamodels::Property]
		public Assignment getPropertyAssignment_1() { return cPropertyAssignment_1; }
		
		//[datamodels::Property]
		public CrossReference getPropertyPropertyCrossReference_1_0() { return cPropertyPropertyCrossReference_1_0; }
		
		//ID
		public RuleCall getPropertyPropertyIDTerminalRuleCall_1_0_1() { return cPropertyPropertyIDTerminalRuleCall_1_0_1; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	
	public class ActionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.securitymodels.SecurityModel.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cREADEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cREADREADKeyword_0_0 = (Keyword)cREADEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCREATEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCREATECREATEKeyword_1_0 = (Keyword)cCREATEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cUPDATEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cUPDATEUPDATEKeyword_2_0 = (Keyword)cUPDATEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDELETEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDELETEDELETEKeyword_3_0 = (Keyword)cDELETEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Action:
		//	READ | CREATE | UPDATE | DELETE;
		public EnumRule getRule() { return rule; }
		
		//READ | CREATE | UPDATE | DELETE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//READ
		public EnumLiteralDeclaration getREADEnumLiteralDeclaration_0() { return cREADEnumLiteralDeclaration_0; }
		
		//'READ'
		public Keyword getREADREADKeyword_0_0() { return cREADREADKeyword_0_0; }
		
		//CREATE
		public EnumLiteralDeclaration getCREATEEnumLiteralDeclaration_1() { return cCREATEEnumLiteralDeclaration_1; }
		
		//'CREATE'
		public Keyword getCREATECREATEKeyword_1_0() { return cCREATECREATEKeyword_1_0; }
		
		//UPDATE
		public EnumLiteralDeclaration getUPDATEEnumLiteralDeclaration_2() { return cUPDATEEnumLiteralDeclaration_2; }
		
		//'UPDATE'
		public Keyword getUPDATEUPDATEKeyword_2_0() { return cUPDATEUPDATEKeyword_2_0; }
		
		//DELETE
		public EnumLiteralDeclaration getDELETEEnumLiteralDeclaration_3() { return cDELETEEnumLiteralDeclaration_3; }
		
		//'DELETE'
		public Keyword getDELETEDELETEKeyword_3_0() { return cDELETEDELETEKeyword_3_0; }
	}
	
	private final SecurityModelElements pSecurityModel;
	private final EStringElements pEString;
	private final RuleElements pRule;
	private final RoleElements pRole;
	private final ActionElements eAction;
	private final AuthElements pAuth;
	private final ProtectedResourceElements pProtectedResource;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SecurityModelGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSecurityModel = new SecurityModelElements();
		this.pEString = new EStringElements();
		this.pRule = new RuleElements();
		this.pRole = new RoleElements();
		this.eAction = new ActionElements();
		this.pAuth = new AuthElements();
		this.pProtectedResource = new ProtectedResourceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xtext.securitymodels.SecurityModel".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SecurityModel:
	//	{SecurityModel}
	//	'name:' name=EString
	//	'roles:' roles+=Role+
	//	'protected:' resources+=ProtectedResource ("," resources+=ProtectedResource)* ('rules:' rules+=Rule+)?;
	public SecurityModelElements getSecurityModelAccess() {
		return pSecurityModel;
	}
	
	public ParserRule getSecurityModelRule() {
		return getSecurityModelAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Rule:
	//	name=EString
	//	':'
	//	action=Action
	//	'conditions' ('{' auths+=Auth ("or" auths+=Auth)* '}')?;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Role:
	//	name=EString;
	public RoleElements getRoleAccess() {
		return pRole;
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}
	
	//enum Action:
	//	READ | CREATE | UPDATE | DELETE;
	public ActionElements getActionAccess() {
		return eAction;
	}
	
	public EnumRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Auth:
	//	'{'
	//	'roles' '(' roles+=[Role|EString] ("," roles+=[Role|EString])* ')'
	//	'context:' textual=EString
	//	'ocl:' oclExp=EString
	//	'sql:' sqlStm=EString
	//	'}';
	public AuthElements getAuthAccess() {
		return pAuth;
	}
	
	public ParserRule getAuthRule() {
		return getAuthAccess().getRule();
	}
	
	//ProtectedResource:
	//	'('
	//	property=[datamodels::Property]
	//	'as'
	//	name=EString
	//	')';
	public ProtectedResourceElements getProtectedResourceAccess() {
		return pProtectedResource;
	}
	
	public ParserRule getProtectedResourceRule() {
		return getProtectedResourceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

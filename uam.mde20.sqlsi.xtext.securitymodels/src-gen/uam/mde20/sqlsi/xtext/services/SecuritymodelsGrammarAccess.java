/*
 * generated by Xtext 2.15.0
 */
package uam.mde20.sqlsi.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class SecuritymodelsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SecurityModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.SecurityModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSecurityModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cProtectKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cResourcesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cResourcesProtectedResourceParserRuleCall_2_1_0 = (RuleCall)cResourcesAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cProtectKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cResourcesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cResourcesProtectedResourceParserRuleCall_2_2_1_0 = (RuleCall)cResourcesAssignment_2_2_1.eContents().get(0);
		private final Keyword cRolesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRolesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRolesRoleParserRuleCall_5_0 = (RuleCall)cRolesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cRolesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cRolesRoleParserRuleCall_6_1_0 = (RuleCall)cRolesAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cRulesKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cRulesAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cRulesRuleParserRuleCall_8_2_0 = (RuleCall)cRulesAssignment_8_2.eContents().get(0);
		private final Group cGroup_8_3 = (Group)cGroup_8.eContents().get(3);
		private final Keyword cCommaKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Assignment cRulesAssignment_8_3_1 = (Assignment)cGroup_8_3.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_8_3_1_0 = (RuleCall)cRulesAssignment_8_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_4 = (Keyword)cGroup_8.eContents().get(4);
		
		//SecurityModel:
		//	'SecurityModel'
		//	name=EString ('protect' resources+=ProtectedResource ("protect" resources+=ProtectedResource)*)?
		//	'roles' '{' roles+=Role ("," roles+=Role)* '}' ('rules' '{' rules+=Rule ("," rules+=Rule)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'SecurityModel' name=EString ('protect' resources+=ProtectedResource ("protect" resources+=ProtectedResource)*)? 'roles'
		//'{' roles+=Role ("," roles+=Role)* '}' ('rules' '{' rules+=Rule ("," rules+=Rule)* '}')?
		public Group getGroup() { return cGroup; }
		
		//'SecurityModel'
		public Keyword getSecurityModelKeyword_0() { return cSecurityModelKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//('protect' resources+=ProtectedResource ("protect" resources+=ProtectedResource)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'protect'
		public Keyword getProtectKeyword_2_0() { return cProtectKeyword_2_0; }
		
		//resources+=ProtectedResource
		public Assignment getResourcesAssignment_2_1() { return cResourcesAssignment_2_1; }
		
		//ProtectedResource
		public RuleCall getResourcesProtectedResourceParserRuleCall_2_1_0() { return cResourcesProtectedResourceParserRuleCall_2_1_0; }
		
		//("protect" resources+=ProtectedResource)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//"protect"
		public Keyword getProtectKeyword_2_2_0() { return cProtectKeyword_2_2_0; }
		
		//resources+=ProtectedResource
		public Assignment getResourcesAssignment_2_2_1() { return cResourcesAssignment_2_2_1; }
		
		//ProtectedResource
		public RuleCall getResourcesProtectedResourceParserRuleCall_2_2_1_0() { return cResourcesProtectedResourceParserRuleCall_2_2_1_0; }
		
		//'roles'
		public Keyword getRolesKeyword_3() { return cRolesKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//roles+=Role
		public Assignment getRolesAssignment_5() { return cRolesAssignment_5; }
		
		//Role
		public RuleCall getRolesRoleParserRuleCall_5_0() { return cRolesRoleParserRuleCall_5_0; }
		
		//("," roles+=Role)*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//roles+=Role
		public Assignment getRolesAssignment_6_1() { return cRolesAssignment_6_1; }
		
		//Role
		public RuleCall getRolesRoleParserRuleCall_6_1_0() { return cRolesRoleParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//('rules' '{' rules+=Rule ("," rules+=Rule)* '}')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'rules'
		public Keyword getRulesKeyword_8_0() { return cRulesKeyword_8_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_1() { return cLeftCurlyBracketKeyword_8_1; }
		
		//rules+=Rule
		public Assignment getRulesAssignment_8_2() { return cRulesAssignment_8_2; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_8_2_0() { return cRulesRuleParserRuleCall_8_2_0; }
		
		//("," rules+=Rule)*
		public Group getGroup_8_3() { return cGroup_8_3; }
		
		//","
		public Keyword getCommaKeyword_8_3_0() { return cCommaKeyword_8_3_0; }
		
		//rules+=Rule
		public Assignment getRulesAssignment_8_3_1() { return cRulesAssignment_8_3_1; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_8_3_1_0() { return cRulesRuleParserRuleCall_8_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8_4() { return cRightCurlyBracketKeyword_8_4; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.EString");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cActionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionActionEnumRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cProtectedResourcesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cProtectedResourcesProtectedResourceCrossReference_6_0 = (CrossReference)cProtectedResourcesAssignment_6.eContents().get(0);
		private final RuleCall cProtectedResourcesProtectedResourceEStringParserRuleCall_6_0_1 = (RuleCall)cProtectedResourcesProtectedResourceCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cProtectedResourcesAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cProtectedResourcesProtectedResourceCrossReference_7_1_0 = (CrossReference)cProtectedResourcesAssignment_7_1.eContents().get(0);
		private final RuleCall cProtectedResourcesProtectedResourceEStringParserRuleCall_7_1_0_1 = (RuleCall)cProtectedResourcesProtectedResourceCrossReference_7_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cAuthsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cLeftCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cAuthsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cAuthsAuthParserRuleCall_11_0 = (RuleCall)cAuthsAssignment_11.eContents().get(0);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cCommaKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cAuthsAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final RuleCall cAuthsAuthParserRuleCall_12_1_0 = (RuleCall)cAuthsAssignment_12_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//Rule:
		//	'Rule'
		//	name=EString
		//	'{'
		//	'action' action=Action
		//	'(' protectedResources+=[ProtectedResource|EString] ("," protectedResources+=[ProtectedResource|EString])* ')'
		//	'auths' '{' auths+=Auth ("," auths+=Auth)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Rule' name=EString '{' 'action' action=Action '(' protectedResources+=[ProtectedResource|EString] (","
		//protectedResources+=[ProtectedResource|EString])* ')' 'auths' '{' auths+=Auth ("," auths+=Auth)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'Rule'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'action'
		public Keyword getActionKeyword_3() { return cActionKeyword_3; }
		
		//action=Action
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//Action
		public RuleCall getActionActionEnumRuleCall_4_0() { return cActionActionEnumRuleCall_4_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }
		
		//protectedResources+=[ProtectedResource|EString]
		public Assignment getProtectedResourcesAssignment_6() { return cProtectedResourcesAssignment_6; }
		
		//[ProtectedResource|EString]
		public CrossReference getProtectedResourcesProtectedResourceCrossReference_6_0() { return cProtectedResourcesProtectedResourceCrossReference_6_0; }
		
		//EString
		public RuleCall getProtectedResourcesProtectedResourceEStringParserRuleCall_6_0_1() { return cProtectedResourcesProtectedResourceEStringParserRuleCall_6_0_1; }
		
		//("," protectedResources+=[ProtectedResource|EString])*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//protectedResources+=[ProtectedResource|EString]
		public Assignment getProtectedResourcesAssignment_7_1() { return cProtectedResourcesAssignment_7_1; }
		
		//[ProtectedResource|EString]
		public CrossReference getProtectedResourcesProtectedResourceCrossReference_7_1_0() { return cProtectedResourcesProtectedResourceCrossReference_7_1_0; }
		
		//EString
		public RuleCall getProtectedResourcesProtectedResourceEStringParserRuleCall_7_1_0_1() { return cProtectedResourcesProtectedResourceEStringParserRuleCall_7_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
		
		//'auths'
		public Keyword getAuthsKeyword_9() { return cAuthsKeyword_9; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_10() { return cLeftCurlyBracketKeyword_10; }
		
		//auths+=Auth
		public Assignment getAuthsAssignment_11() { return cAuthsAssignment_11; }
		
		//Auth
		public RuleCall getAuthsAuthParserRuleCall_11_0() { return cAuthsAuthParserRuleCall_11_0; }
		
		//("," auths+=Auth)*
		public Group getGroup_12() { return cGroup_12; }
		
		//","
		public Keyword getCommaKeyword_12_0() { return cCommaKeyword_12_0; }
		
		//auths+=Auth
		public Assignment getAuthsAssignment_12_1() { return cAuthsAssignment_12_1; }
		
		//Auth
		public RuleCall getAuthsAuthParserRuleCall_12_1_0() { return cAuthsAuthParserRuleCall_12_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
	}
	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.Role");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLessThanSignHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUserEntityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUserEntityEStringParserRuleCall_2_0 = (RuleCall)cUserEntityAssignment_2.eContents().get(0);
		
		//Role:
		//	name=EString
		//	'<-'
		//	userEntity=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString '<-' userEntity=EString
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//'<-'
		public Keyword getLessThanSignHyphenMinusKeyword_1() { return cLessThanSignHyphenMinusKeyword_1; }
		
		//userEntity=EString
		public Assignment getUserEntityAssignment_2() { return cUserEntityAssignment_2; }
		
		//EString
		public RuleCall getUserEntityEStringParserRuleCall_2_0() { return cUserEntityEStringParserRuleCall_2_0; }
	}
	public class ProtectedResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.ProtectedResource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyEStringParserRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Keyword cAsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ProtectedResource:
		//	property=[datamodels::Property|EString]
		//	'as' name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//property=[datamodels::Property|EString] 'as' name=EString
		public Group getGroup() { return cGroup; }
		
		//property=[datamodels::Property|EString]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }
		
		//[datamodels::Property|EString]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }
		
		//EString
		public RuleCall getPropertyPropertyEStringParserRuleCall_0_0_1() { return cPropertyPropertyEStringParserRuleCall_0_0_1; }
		
		//'as'
		public Keyword getAsKeyword_1() { return cAsKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class AuthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.Auth");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRolesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRolesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRolesRoleCrossReference_2_0 = (CrossReference)cRolesAssignment_2.eContents().get(0);
		private final RuleCall cRolesRoleEStringParserRuleCall_2_0_1 = (RuleCall)cRolesRoleCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRolesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRolesRoleCrossReference_3_1_0 = (CrossReference)cRolesAssignment_3_1.eContents().get(0);
		private final RuleCall cRolesRoleEStringParserRuleCall_3_1_0_1 = (RuleCall)cRolesRoleCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cConditionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cTextualKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTextualAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTextualEStringParserRuleCall_8_0 = (RuleCall)cTextualAssignment_8.eContents().get(0);
		private final Keyword cOclExpKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cOclExpAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cOclExpEStringParserRuleCall_10_0 = (RuleCall)cOclExpAssignment_10.eContents().get(0);
		private final Keyword cSqlStmKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cSqlStmAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSqlStmEStringParserRuleCall_12_0 = (RuleCall)cSqlStmAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Auth:
		//	'roles' '(' roles+=[Role|EString] ("," roles+=[Role|EString])* ')'
		//	'condition:' '{'
		//	'textual' textual=EString
		//	'oclExp' oclExp=EString
		//	'sqlStm' sqlStm=EString
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'roles' '(' roles+=[Role|EString] ("," roles+=[Role|EString])* ')' 'condition:' '{' 'textual' textual=EString 'oclExp'
		//oclExp=EString 'sqlStm' sqlStm=EString '}'
		public Group getGroup() { return cGroup; }
		
		//'roles'
		public Keyword getRolesKeyword_0() { return cRolesKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//roles+=[Role|EString]
		public Assignment getRolesAssignment_2() { return cRolesAssignment_2; }
		
		//[Role|EString]
		public CrossReference getRolesRoleCrossReference_2_0() { return cRolesRoleCrossReference_2_0; }
		
		//EString
		public RuleCall getRolesRoleEStringParserRuleCall_2_0_1() { return cRolesRoleEStringParserRuleCall_2_0_1; }
		
		//("," roles+=[Role|EString])*
		public Group getGroup_3() { return cGroup_3; }
		
		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//roles+=[Role|EString]
		public Assignment getRolesAssignment_3_1() { return cRolesAssignment_3_1; }
		
		//[Role|EString]
		public CrossReference getRolesRoleCrossReference_3_1_0() { return cRolesRoleCrossReference_3_1_0; }
		
		//EString
		public RuleCall getRolesRoleEStringParserRuleCall_3_1_0_1() { return cRolesRoleEStringParserRuleCall_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'condition:'
		public Keyword getConditionKeyword_5() { return cConditionKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//'textual'
		public Keyword getTextualKeyword_7() { return cTextualKeyword_7; }
		
		//textual=EString
		public Assignment getTextualAssignment_8() { return cTextualAssignment_8; }
		
		//EString
		public RuleCall getTextualEStringParserRuleCall_8_0() { return cTextualEStringParserRuleCall_8_0; }
		
		//'oclExp'
		public Keyword getOclExpKeyword_9() { return cOclExpKeyword_9; }
		
		//oclExp=EString
		public Assignment getOclExpAssignment_10() { return cOclExpAssignment_10; }
		
		//EString
		public RuleCall getOclExpEStringParserRuleCall_10_0() { return cOclExpEStringParserRuleCall_10_0; }
		
		//'sqlStm'
		public Keyword getSqlStmKeyword_11() { return cSqlStmKeyword_11; }
		
		//sqlStm=EString
		public Assignment getSqlStmAssignment_12() { return cSqlStmAssignment_12; }
		
		//EString
		public RuleCall getSqlStmEStringParserRuleCall_12_0() { return cSqlStmEStringParserRuleCall_12_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}
	
	public class ActionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uam.mde20.sqlsi.xtext.Securitymodels.Action");
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
	private final ProtectedResourceElements pProtectedResource;
	private final ActionElements eAction;
	private final AuthElements pAuth;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SecuritymodelsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSecurityModel = new SecurityModelElements();
		this.pEString = new EStringElements();
		this.pRule = new RuleElements();
		this.pRole = new RoleElements();
		this.pProtectedResource = new ProtectedResourceElements();
		this.eAction = new ActionElements();
		this.pAuth = new AuthElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uam.mde20.sqlsi.xtext.Securitymodels".equals(grammar.getName())) {
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
	//	'SecurityModel'
	//	name=EString ('protect' resources+=ProtectedResource ("protect" resources+=ProtectedResource)*)?
	//	'roles' '{' roles+=Role ("," roles+=Role)* '}' ('rules' '{' rules+=Rule ("," rules+=Rule)* '}')?;
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
	//	'Rule'
	//	name=EString
	//	'{'
	//	'action' action=Action
	//	'(' protectedResources+=[ProtectedResource|EString] ("," protectedResources+=[ProtectedResource|EString])* ')'
	//	'auths' '{' auths+=Auth ("," auths+=Auth)* '}'
	//	'}';
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Role:
	//	name=EString
	//	'<-'
	//	userEntity=EString;
	public RoleElements getRoleAccess() {
		return pRole;
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}
	
	//ProtectedResource:
	//	property=[datamodels::Property|EString]
	//	'as' name=EString;
	public ProtectedResourceElements getProtectedResourceAccess() {
		return pProtectedResource;
	}
	
	public ParserRule getProtectedResourceRule() {
		return getProtectedResourceAccess().getRule();
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
	//	'roles' '(' roles+=[Role|EString] ("," roles+=[Role|EString])* ')'
	//	'condition:' '{'
	//	'textual' textual=EString
	//	'oclExp' oclExp=EString
	//	'sqlStm' sqlStm=EString
	//	'}';
	public AuthElements getAuthAccess() {
		return pAuth;
	}
	
	public ParserRule getAuthRule() {
		return getAuthAccess().getRule();
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

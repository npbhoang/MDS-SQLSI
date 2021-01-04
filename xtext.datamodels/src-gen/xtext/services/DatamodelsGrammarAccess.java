/*
 * generated by Xtext 2.15.0
 */
package xtext.services;

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
public class DatamodelsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DataModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.DataModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDataModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIsSecuredAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsSecuredSecuredKeyword_1_0 = (Keyword)cIsSecuredAssignment_1.eContents().get(0);
		private final Keyword cDataModelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cEntitiesAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cEntitiesEntityParserRuleCall_5_0_0 = (RuleCall)cEntitiesAssignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cEntitiesAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_5_1_1_0 = (RuleCall)cEntitiesAssignment_5_1_1.eContents().get(0);
		
		//DataModel:
		//	{DataModel} isSecured?='Secured'?
		//	'DataModel' name=EString
		//	':' (entities+=Entity ("," entities+=Entity)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{DataModel} isSecured?='Secured'? 'DataModel' name=EString ':' (entities+=Entity ("," entities+=Entity)*)?
		public Group getGroup() { return cGroup; }
		
		//{DataModel}
		public Action getDataModelAction_0() { return cDataModelAction_0; }
		
		//isSecured?='Secured'?
		public Assignment getIsSecuredAssignment_1() { return cIsSecuredAssignment_1; }
		
		//'Secured'
		public Keyword getIsSecuredSecuredKeyword_1_0() { return cIsSecuredSecuredKeyword_1_0; }
		
		//'DataModel'
		public Keyword getDataModelKeyword_2() { return cDataModelKeyword_2; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//(entities+=Entity ("," entities+=Entity)*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//entities+=Entity
		public Assignment getEntitiesAssignment_5_0() { return cEntitiesAssignment_5_0; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_5_0_0() { return cEntitiesEntityParserRuleCall_5_0_0; }
		
		//("," entities+=Entity)*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//","
		public Keyword getCommaKeyword_5_1_0() { return cCommaKeyword_5_1_0; }
		
		//entities+=Entity
		public Assignment getEntitiesAssignment_5_1_1() { return cEntitiesAssignment_5_1_1; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_5_1_1_0() { return cEntitiesEntityParserRuleCall_5_1_1_0; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.Property");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAssociationEndParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Property:
		//	AssociationEnd | Attribute;
		@Override public ParserRule getRule() { return rule; }
		
		//AssociationEnd | Attribute
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AssociationEnd
		public RuleCall getAssociationEndParserRuleCall_0() { return cAssociationEndParserRuleCall_0; }
		
		//Attribute
		public RuleCall getAttributeParserRuleCall_1() { return cAttributeParserRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.EString");
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
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntityAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIsUserClassAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsUserClassUserKeyword_1_0 = (Keyword)cIsUserClassAssignment_1.eContents().get(0);
		private final Keyword cEntityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSuperEntityAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cSuperEntityEntityCrossReference_4_1_0 = (CrossReference)cSuperEntityAssignment_4_1.eContents().get(0);
		private final RuleCall cSuperEntityEntityEStringParserRuleCall_4_1_0_1 = (RuleCall)cSuperEntityEntityCrossReference_4_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cPropertiesAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final RuleCall cPropertiesPropertyParserRuleCall_6_0_0 = (RuleCall)cPropertiesAssignment_6_0.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Keyword cCommaKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cPropertiesPropertyParserRuleCall_6_1_1_0 = (RuleCall)cPropertiesAssignment_6_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Entity:
		//	{Entity} isUserClass?='user'?
		//	'entity'
		//	name=EString ('extends' superEntity=[Entity|EString])?
		//	'{' (properties+=Property ("," properties+=Property)*)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Entity} isUserClass?='user'? 'entity' name=EString ('extends' superEntity=[Entity|EString])? '{' (properties+=Property
		//("," properties+=Property)*)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Entity}
		public Action getEntityAction_0() { return cEntityAction_0; }
		
		//isUserClass?='user'?
		public Assignment getIsUserClassAssignment_1() { return cIsUserClassAssignment_1; }
		
		//'user'
		public Keyword getIsUserClassUserKeyword_1_0() { return cIsUserClassUserKeyword_1_0; }
		
		//'entity'
		public Keyword getEntityKeyword_2() { return cEntityKeyword_2; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//('extends' superEntity=[Entity|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//superEntity=[Entity|EString]
		public Assignment getSuperEntityAssignment_4_1() { return cSuperEntityAssignment_4_1; }
		
		//[Entity|EString]
		public CrossReference getSuperEntityEntityCrossReference_4_1_0() { return cSuperEntityEntityCrossReference_4_1_0; }
		
		//EString
		public RuleCall getSuperEntityEntityEStringParserRuleCall_4_1_0_1() { return cSuperEntityEntityEStringParserRuleCall_4_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//(properties+=Property ("," properties+=Property)*)?
		public Group getGroup_6() { return cGroup_6; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_6_0() { return cPropertiesAssignment_6_0; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_6_0_0() { return cPropertiesPropertyParserRuleCall_6_0_0; }
		
		//("," properties+=Property)*
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//","
		public Keyword getCommaKeyword_6_1_0() { return cCommaKeyword_6_1_0; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_6_1_1() { return cPropertiesAssignment_6_1_1; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_6_1_1_0() { return cPropertiesPropertyParserRuleCall_6_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class AssociationEndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.AssociationEnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssociationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTargetEntityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTargetEntityEntityCrossReference_1_0 = (CrossReference)cTargetEntityAssignment_1.eContents().get(0);
		private final RuleCall cTargetEntityEntityEStringParserRuleCall_1_0_1 = (RuleCall)cTargetEntityEntityCrossReference_1_0.eContents().get(1);
		private final Assignment cMultiplicityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMultiplicityMultiplicityEnumRuleCall_2_0 = (RuleCall)cMultiplicityAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cOppositeToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cOtherEndAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cOtherEndAssociationEndCrossReference_5_0 = (CrossReference)cOtherEndAssignment_5.eContents().get(0);
		private final RuleCall cOtherEndAssociationEndEStringParserRuleCall_5_0_1 = (RuleCall)cOtherEndAssociationEndCrossReference_5_0.eContents().get(1);
		private final Keyword cInKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cAssociationNameAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAssociationNameEStringParserRuleCall_7_0 = (RuleCall)cAssociationNameAssignment_7.eContents().get(0);
		
		//AssociationEnd:
		//	"association"
		//	targetEntity=[Entity|EString] multiplicity=Multiplicity
		//	name=EString
		//	'oppositeTo'
		//	otherEnd=[AssociationEnd|EString]
		//	'in'
		//	associationName=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//"association" targetEntity=[Entity|EString] multiplicity=Multiplicity name=EString 'oppositeTo'
		//otherEnd=[AssociationEnd|EString] 'in' associationName=EString
		public Group getGroup() { return cGroup; }
		
		//"association"
		public Keyword getAssociationKeyword_0() { return cAssociationKeyword_0; }
		
		//targetEntity=[Entity|EString]
		public Assignment getTargetEntityAssignment_1() { return cTargetEntityAssignment_1; }
		
		//[Entity|EString]
		public CrossReference getTargetEntityEntityCrossReference_1_0() { return cTargetEntityEntityCrossReference_1_0; }
		
		//EString
		public RuleCall getTargetEntityEntityEStringParserRuleCall_1_0_1() { return cTargetEntityEntityEStringParserRuleCall_1_0_1; }
		
		//multiplicity=Multiplicity
		public Assignment getMultiplicityAssignment_2() { return cMultiplicityAssignment_2; }
		
		//Multiplicity
		public RuleCall getMultiplicityMultiplicityEnumRuleCall_2_0() { return cMultiplicityMultiplicityEnumRuleCall_2_0; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//'oppositeTo'
		public Keyword getOppositeToKeyword_4() { return cOppositeToKeyword_4; }
		
		//otherEnd=[AssociationEnd|EString]
		public Assignment getOtherEndAssignment_5() { return cOtherEndAssignment_5; }
		
		//[AssociationEnd|EString]
		public CrossReference getOtherEndAssociationEndCrossReference_5_0() { return cOtherEndAssociationEndCrossReference_5_0; }
		
		//EString
		public RuleCall getOtherEndAssociationEndEStringParserRuleCall_5_0_1() { return cOtherEndAssociationEndEStringParserRuleCall_5_0_1; }
		
		//'in'
		public Keyword getInKeyword_6() { return cInKeyword_6; }
		
		//associationName=EString
		public Assignment getAssociationNameAssignment_7() { return cAssociationNameAssignment_7; }
		
		//EString
		public RuleCall getAssociationNameEStringParserRuleCall_7_0() { return cAssociationNameEStringParserRuleCall_7_0; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cIsUniqueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsUniqueUniqueKeyword_2_0 = (Keyword)cIsUniqueAssignment_2.eContents().get(0);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeDataTypeEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//Attribute:
		//	"attribute"
		//	name=EString
		//	isUnique?='unique'?
		//	type=DataType;
		@Override public ParserRule getRule() { return rule; }
		
		//"attribute" name=EString isUnique?='unique'? type=DataType
		public Group getGroup() { return cGroup; }
		
		//"attribute"
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//isUnique?='unique'?
		public Assignment getIsUniqueAssignment_2() { return cIsUniqueAssignment_2; }
		
		//'unique'
		public Keyword getIsUniqueUniqueKeyword_2_0() { return cIsUniqueUniqueKeyword_2_0; }
		
		//type=DataType
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//DataType
		public RuleCall getTypeDataTypeEnumRuleCall_3_0() { return cTypeDataTypeEnumRuleCall_3_0; }
	}
	
	public class MultiplicityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.Multiplicity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMANYEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMANYLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0 = (Keyword)cMANYEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cONEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cONE1Keyword_1_0 = (Keyword)cONEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Multiplicity:
		//	MANY='[*]' | ONE='[1]';
		public EnumRule getRule() { return rule; }
		
		//MANY='[*]' | ONE='[1]'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MANY='[*]'
		public EnumLiteralDeclaration getMANYEnumLiteralDeclaration_0() { return cMANYEnumLiteralDeclaration_0; }
		
		//'[*]'
		public Keyword getMANYLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0() { return cMANYLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0; }
		
		//ONE='[1]'
		public EnumLiteralDeclaration getONEEnumLiteralDeclaration_1() { return cONEEnumLiteralDeclaration_1; }
		
		//'[1]'
		public Keyword getONE1Keyword_1_0() { return cONE1Keyword_1_0; }
	}
	public class DataTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Datamodels.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntegerIntegerKeyword_1_0 = (Keyword)cIntegerEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DataType:
		//	String | Integer;
		public EnumRule getRule() { return rule; }
		
		//String | Integer
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//String
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }
		
		//'String'
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }
		
		//Integer
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_1() { return cIntegerEnumLiteralDeclaration_1; }
		
		//'Integer'
		public Keyword getIntegerIntegerKeyword_1_0() { return cIntegerIntegerKeyword_1_0; }
	}
	
	private final DataModelElements pDataModel;
	private final PropertyElements pProperty;
	private final EStringElements pEString;
	private final EntityElements pEntity;
	private final AssociationEndElements pAssociationEnd;
	private final AttributeElements pAttribute;
	private final MultiplicityElements eMultiplicity;
	private final DataTypeElements eDataType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DatamodelsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDataModel = new DataModelElements();
		this.pProperty = new PropertyElements();
		this.pEString = new EStringElements();
		this.pEntity = new EntityElements();
		this.pAssociationEnd = new AssociationEndElements();
		this.pAttribute = new AttributeElements();
		this.eMultiplicity = new MultiplicityElements();
		this.eDataType = new DataTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xtext.Datamodels".equals(grammar.getName())) {
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

	
	//DataModel:
	//	{DataModel} isSecured?='Secured'?
	//	'DataModel' name=EString
	//	':' (entities+=Entity ("," entities+=Entity)*)?;
	public DataModelElements getDataModelAccess() {
		return pDataModel;
	}
	
	public ParserRule getDataModelRule() {
		return getDataModelAccess().getRule();
	}
	
	//Property:
	//	AssociationEnd | Attribute;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Entity:
	//	{Entity} isUserClass?='user'?
	//	'entity'
	//	name=EString ('extends' superEntity=[Entity|EString])?
	//	'{' (properties+=Property ("," properties+=Property)*)?
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//AssociationEnd:
	//	"association"
	//	targetEntity=[Entity|EString] multiplicity=Multiplicity
	//	name=EString
	//	'oppositeTo'
	//	otherEnd=[AssociationEnd|EString]
	//	'in'
	//	associationName=EString;
	public AssociationEndElements getAssociationEndAccess() {
		return pAssociationEnd;
	}
	
	public ParserRule getAssociationEndRule() {
		return getAssociationEndAccess().getRule();
	}
	
	//Attribute:
	//	"attribute"
	//	name=EString
	//	isUnique?='unique'?
	//	type=DataType;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//enum Multiplicity:
	//	MANY='[*]' | ONE='[1]';
	public MultiplicityElements getMultiplicityAccess() {
		return eMultiplicity;
	}
	
	public EnumRule getMultiplicityRule() {
		return getMultiplicityAccess().getRule();
	}
	
	//enum DataType:
	//	String | Integer;
	public DataTypeElements getDataTypeAccess() {
		return eDataType;
	}
	
	public EnumRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
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
package xtext.datamodels.parser.antlr.internal;

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
import xtext.datamodels.services.DatamodelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatamodelsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataModel'", "':'", "','", "'entity'", "'extends'", "'{'", "'}'", "'association'", "'oppositeTo'", "'in'", "'attribute'", "'unique'", "'[*]'", "'[1]'", "'String'", "'Integer'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDatamodelsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatamodelsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatamodelsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDatamodels.g"; }



     	private DatamodelsGrammarAccess grammarAccess;

        public InternalDatamodelsParser(TokenStream input, DatamodelsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModel";
       	}

       	@Override
       	protected DatamodelsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModel"
    // InternalDatamodels.g:65:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalDatamodels.g:65:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalDatamodels.g:66:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalDatamodels.g:72:1: ruleDataModel returns [EObject current=null] : ( () otherlv_1= 'DataModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )? ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_entities_6_0 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:78:2: ( ( () otherlv_1= 'DataModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )? ) )
            // InternalDatamodels.g:79:2: ( () otherlv_1= 'DataModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )? )
            {
            // InternalDatamodels.g:79:2: ( () otherlv_1= 'DataModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )? )
            // InternalDatamodels.g:80:3: () otherlv_1= 'DataModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )?
            {
            // InternalDatamodels.g:80:3: ()
            // InternalDatamodels.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataModelAccess().getDataModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataModelAccess().getDataModelKeyword_1());
            		
            // InternalDatamodels.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDatamodels.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalDatamodels.g:92:4: (lv_name_2_0= ruleEString )
            // InternalDatamodels.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.datamodels.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getColonKeyword_3());
            		
            // InternalDatamodels.g:114:3: ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDatamodels.g:115:4: ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )*
                    {
                    // InternalDatamodels.g:115:4: ( (lv_entities_4_0= ruleEntity ) )
                    // InternalDatamodels.g:116:5: (lv_entities_4_0= ruleEntity )
                    {
                    // InternalDatamodels.g:116:5: (lv_entities_4_0= ruleEntity )
                    // InternalDatamodels.g:117:6: lv_entities_4_0= ruleEntity
                    {

                    						newCompositeNode(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_entities_4_0=ruleEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataModelRule());
                    						}
                    						add(
                    							current,
                    							"entities",
                    							lv_entities_4_0,
                    							"xtext.datamodels.Datamodels.Entity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDatamodels.g:134:4: (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDatamodels.g:135:5: otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataModelAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDatamodels.g:139:5: ( (lv_entities_6_0= ruleEntity ) )
                    	    // InternalDatamodels.g:140:6: (lv_entities_6_0= ruleEntity )
                    	    {
                    	    // InternalDatamodels.g:140:6: (lv_entities_6_0= ruleEntity )
                    	    // InternalDatamodels.g:141:7: lv_entities_6_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_entities_6_0=ruleEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entities",
                    	    								lv_entities_6_0,
                    	    								"xtext.datamodels.Datamodels.Entity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleProperty"
    // InternalDatamodels.g:164:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDatamodels.g:164:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDatamodels.g:165:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDatamodels.g:171:1: ruleProperty returns [EObject current=null] : (this_AssociationEnd_0= ruleAssociationEnd | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationEnd_0 = null;

        EObject this_Attribute_1 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:177:2: ( (this_AssociationEnd_0= ruleAssociationEnd | this_Attribute_1= ruleAttribute ) )
            // InternalDatamodels.g:178:2: (this_AssociationEnd_0= ruleAssociationEnd | this_Attribute_1= ruleAttribute )
            {
            // InternalDatamodels.g:178:2: (this_AssociationEnd_0= ruleAssociationEnd | this_Attribute_1= ruleAttribute )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDatamodels.g:179:3: this_AssociationEnd_0= ruleAssociationEnd
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getAssociationEndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationEnd_0=ruleAssociationEnd();

                    state._fsp--;


                    			current = this_AssociationEnd_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:188:3: this_Attribute_1= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEString"
    // InternalDatamodels.g:200:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDatamodels.g:200:47: (iv_ruleEString= ruleEString EOF )
            // InternalDatamodels.g:201:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDatamodels.g:207:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDatamodels.g:213:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDatamodels.g:214:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDatamodels.g:214:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDatamodels.g:215:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:223:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntity"
    // InternalDatamodels.g:234:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDatamodels.g:234:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDatamodels.g:235:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDatamodels.g:241:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:247:2: ( ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* )? otherlv_9= '}' ) )
            // InternalDatamodels.g:248:2: ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* )? otherlv_9= '}' )
            {
            // InternalDatamodels.g:248:2: ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* )? otherlv_9= '}' )
            // InternalDatamodels.g:249:3: () otherlv_1= 'entity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* )? otherlv_9= '}'
            {
            // InternalDatamodels.g:249:3: ()
            // InternalDatamodels.g:250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalDatamodels.g:260:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDatamodels.g:261:4: (lv_name_2_0= ruleEString )
            {
            // InternalDatamodels.g:261:4: (lv_name_2_0= ruleEString )
            // InternalDatamodels.g:262:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.datamodels.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:279:3: (otherlv_3= 'extends' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDatamodels.g:280:4: otherlv_3= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalDatamodels.g:284:4: ( ( ruleEString ) )
                    // InternalDatamodels.g:285:5: ( ruleEString )
                    {
                    // InternalDatamodels.g:285:5: ( ruleEString )
                    // InternalDatamodels.g:286:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDatamodels.g:305:3: ( ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18||LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDatamodels.g:306:4: ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    {
                    // InternalDatamodels.g:306:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalDatamodels.g:307:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalDatamodels.g:307:5: (lv_properties_6_0= ruleProperty )
                    // InternalDatamodels.g:308:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"xtext.datamodels.Datamodels.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDatamodels.g:325:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDatamodels.g:326:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalDatamodels.g:330:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalDatamodels.g:331:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalDatamodels.g:331:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalDatamodels.g:332:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_8_0,
                    	    								"xtext.datamodels.Datamodels.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalDatamodels.g:359:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalDatamodels.g:359:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalDatamodels.g:360:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalDatamodels.g:366:1: ruleAssociationEnd returns [EObject current=null] : (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_multiplicity_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_associationName_7_0 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:372:2: ( (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) ) )
            // InternalDatamodels.g:373:2: (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) )
            {
            // InternalDatamodels.g:373:2: (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) )
            // InternalDatamodels.g:374:3: otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getAssociationKeyword_0());
            		
            // InternalDatamodels.g:378:3: ( ( ruleEString ) )
            // InternalDatamodels.g:379:4: ( ruleEString )
            {
            // InternalDatamodels.g:379:4: ( ruleEString )
            // InternalDatamodels.g:380:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getTargetEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:394:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )
            // InternalDatamodels.g:395:4: (lv_multiplicity_2_0= ruleMultiplicity )
            {
            // InternalDatamodels.g:395:4: (lv_multiplicity_2_0= ruleMultiplicity )
            // InternalDatamodels.g:396:5: lv_multiplicity_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_multiplicity_2_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_2_0,
            						"xtext.datamodels.Datamodels.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:413:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDatamodels.g:414:4: (lv_name_3_0= ruleEString )
            {
            // InternalDatamodels.g:414:4: (lv_name_3_0= ruleEString )
            // InternalDatamodels.g:415:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"xtext.datamodels.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getOppositeToKeyword_4());
            		
            // InternalDatamodels.g:436:3: ( ( ruleEString ) )
            // InternalDatamodels.g:437:4: ( ruleEString )
            {
            // InternalDatamodels.g:437:4: ( ruleEString )
            // InternalDatamodels.g:438:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getOtherEndAssociationEndCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getAssociationEndAccess().getInKeyword_6());
            		
            // InternalDatamodels.g:456:3: ( (lv_associationName_7_0= ruleEString ) )
            // InternalDatamodels.g:457:4: (lv_associationName_7_0= ruleEString )
            {
            // InternalDatamodels.g:457:4: (lv_associationName_7_0= ruleEString )
            // InternalDatamodels.g:458:5: lv_associationName_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getAssociationNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_associationName_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            					}
            					set(
            						current,
            						"associationName",
            						lv_associationName_7_0,
            						"xtext.datamodels.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleAttribute"
    // InternalDatamodels.g:479:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDatamodels.g:479:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDatamodels.g:480:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDatamodels.g:486:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isUnique_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:492:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalDatamodels.g:493:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalDatamodels.g:493:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) )
            // InternalDatamodels.g:494:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalDatamodels.g:498:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDatamodels.g:499:4: (lv_name_1_0= ruleEString )
            {
            // InternalDatamodels.g:499:4: (lv_name_1_0= ruleEString )
            // InternalDatamodels.g:500:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.datamodels.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:517:3: ( (lv_isUnique_2_0= 'unique' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDatamodels.g:518:4: (lv_isUnique_2_0= 'unique' )
                    {
                    // InternalDatamodels.g:518:4: (lv_isUnique_2_0= 'unique' )
                    // InternalDatamodels.g:519:5: lv_isUnique_2_0= 'unique'
                    {
                    lv_isUnique_2_0=(Token)match(input,22,FOLLOW_16); 

                    					newLeafNode(lv_isUnique_2_0, grammarAccess.getAttributeAccess().getIsUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isUnique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalDatamodels.g:531:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDatamodels.g:532:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDatamodels.g:532:4: (lv_type_3_0= ruleDataType )
            // InternalDatamodels.g:533:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"xtext.datamodels.Datamodels.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleMultiplicity"
    // InternalDatamodels.g:554:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDatamodels.g:560:2: ( ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) ) )
            // InternalDatamodels.g:561:2: ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) )
            {
            // InternalDatamodels.g:561:2: ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDatamodels.g:562:3: (enumLiteral_0= '[*]' )
                    {
                    // InternalDatamodels.g:562:3: (enumLiteral_0= '[*]' )
                    // InternalDatamodels.g:563:4: enumLiteral_0= '[*]'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:570:3: (enumLiteral_1= '[1]' )
                    {
                    // InternalDatamodels.g:570:3: (enumLiteral_1= '[1]' )
                    // InternalDatamodels.g:571:4: enumLiteral_1= '[1]'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "ruleDataType"
    // InternalDatamodels.g:581:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDatamodels.g:587:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) ) )
            // InternalDatamodels.g:588:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) )
            {
            // InternalDatamodels.g:588:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDatamodels.g:589:3: (enumLiteral_0= 'String' )
                    {
                    // InternalDatamodels.g:589:3: (enumLiteral_0= 'String' )
                    // InternalDatamodels.g:590:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:597:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalDatamodels.g:597:3: (enumLiteral_1= 'Integer' )
                    // InternalDatamodels.g:598:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000260000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006400000L});

}
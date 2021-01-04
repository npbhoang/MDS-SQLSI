package uam.mde20.sqlsi.xtext.parser.antlr.internal;

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
import uam.mde20.sqlsi.xtext.services.DatamodelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatamodelsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataModel'", "':'", "','", "'user'", "'entity'", "'extends'", "'{'", "'}'", "'association'", "'oppositeTo'", "'in'", "'attribute'", "'unique'", "'[*]'", "'[1]'", "'String'", "'Integer'"
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
    public static final int T__27=27;
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
            						"uam.mde20.sqlsi.xtext.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getColonKeyword_3());
            		
            // InternalDatamodels.g:114:3: ( ( (lv_entities_4_0= ruleEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleEntity ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
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
                    							"uam.mde20.sqlsi.xtext.Datamodels.Entity");
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
                    	    								"uam.mde20.sqlsi.xtext.Datamodels.Entity");
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

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
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
    // InternalDatamodels.g:241:1: ruleEntity returns [EObject current=null] : ( () ( (lv_isUserClass_1_0= 'user' ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_isUserClass_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:247:2: ( ( () ( (lv_isUserClass_1_0= 'user' ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* )? otherlv_10= '}' ) )
            // InternalDatamodels.g:248:2: ( () ( (lv_isUserClass_1_0= 'user' ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* )? otherlv_10= '}' )
            {
            // InternalDatamodels.g:248:2: ( () ( (lv_isUserClass_1_0= 'user' ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* )? otherlv_10= '}' )
            // InternalDatamodels.g:249:3: () ( (lv_isUserClass_1_0= 'user' ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* )? otherlv_10= '}'
            {
            // InternalDatamodels.g:249:3: ()
            // InternalDatamodels.g:250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            // InternalDatamodels.g:256:3: ( (lv_isUserClass_1_0= 'user' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDatamodels.g:257:4: (lv_isUserClass_1_0= 'user' )
                    {
                    // InternalDatamodels.g:257:4: (lv_isUserClass_1_0= 'user' )
                    // InternalDatamodels.g:258:5: lv_isUserClass_1_0= 'user'
                    {
                    lv_isUserClass_1_0=(Token)match(input,14,FOLLOW_8); 

                    					newLeafNode(lv_isUserClass_1_0, grammarAccess.getEntityAccess().getIsUserClassUserKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(current, "isUserClass", true, "user");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getEntityKeyword_2());
            		
            // InternalDatamodels.g:274:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDatamodels.g:275:4: (lv_name_3_0= ruleEString )
            {
            // InternalDatamodels.g:275:4: (lv_name_3_0= ruleEString )
            // InternalDatamodels.g:276:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uam.mde20.sqlsi.xtext.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:293:3: (otherlv_4= 'extends' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDatamodels.g:294:4: otherlv_4= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getExtendsKeyword_4_0());
                    			
                    // InternalDatamodels.g:298:4: ( ( ruleEString ) )
                    // InternalDatamodels.g:299:5: ( ruleEString )
                    {
                    // InternalDatamodels.g:299:5: ( ruleEString )
                    // InternalDatamodels.g:300:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDatamodels.g:319:3: ( ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19||LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDatamodels.g:320:4: ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )*
                    {
                    // InternalDatamodels.g:320:4: ( (lv_properties_7_0= ruleProperty ) )
                    // InternalDatamodels.g:321:5: (lv_properties_7_0= ruleProperty )
                    {
                    // InternalDatamodels.g:321:5: (lv_properties_7_0= ruleProperty )
                    // InternalDatamodels.g:322:6: lv_properties_7_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_properties_7_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_7_0,
                    							"uam.mde20.sqlsi.xtext.Datamodels.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDatamodels.g:339:4: (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDatamodels.g:340:5: otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalDatamodels.g:344:5: ( (lv_properties_9_0= ruleProperty ) )
                    	    // InternalDatamodels.g:345:6: (lv_properties_9_0= ruleProperty )
                    	    {
                    	    // InternalDatamodels.g:345:6: (lv_properties_9_0= ruleProperty )
                    	    // InternalDatamodels.g:346:7: lv_properties_9_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_9_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_9_0,
                    	    								"uam.mde20.sqlsi.xtext.Datamodels.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalDatamodels.g:373:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalDatamodels.g:373:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalDatamodels.g:374:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
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
    // InternalDatamodels.g:380:1: ruleAssociationEnd returns [EObject current=null] : (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) ) ;
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
            // InternalDatamodels.g:386:2: ( (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) ) )
            // InternalDatamodels.g:387:2: (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) )
            {
            // InternalDatamodels.g:387:2: (otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) ) )
            // InternalDatamodels.g:388:3: otherlv_0= 'association' ( ( ruleEString ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'oppositeTo' ( ( ruleEString ) ) otherlv_6= 'in' ( (lv_associationName_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getAssociationKeyword_0());
            		
            // InternalDatamodels.g:392:3: ( ( ruleEString ) )
            // InternalDatamodels.g:393:4: ( ruleEString )
            {
            // InternalDatamodels.g:393:4: ( ruleEString )
            // InternalDatamodels.g:394:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getTargetEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:408:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )
            // InternalDatamodels.g:409:4: (lv_multiplicity_2_0= ruleMultiplicity )
            {
            // InternalDatamodels.g:409:4: (lv_multiplicity_2_0= ruleMultiplicity )
            // InternalDatamodels.g:410:5: lv_multiplicity_2_0= ruleMultiplicity
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
            						"uam.mde20.sqlsi.xtext.Datamodels.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:427:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDatamodels.g:428:4: (lv_name_3_0= ruleEString )
            {
            // InternalDatamodels.g:428:4: (lv_name_3_0= ruleEString )
            // InternalDatamodels.g:429:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uam.mde20.sqlsi.xtext.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getOppositeToKeyword_4());
            		
            // InternalDatamodels.g:450:3: ( ( ruleEString ) )
            // InternalDatamodels.g:451:4: ( ruleEString )
            {
            // InternalDatamodels.g:451:4: ( ruleEString )
            // InternalDatamodels.g:452:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getOtherEndAssociationEndCrossReference_5_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getAssociationEndAccess().getInKeyword_6());
            		
            // InternalDatamodels.g:470:3: ( (lv_associationName_7_0= ruleEString ) )
            // InternalDatamodels.g:471:4: (lv_associationName_7_0= ruleEString )
            {
            // InternalDatamodels.g:471:4: (lv_associationName_7_0= ruleEString )
            // InternalDatamodels.g:472:5: lv_associationName_7_0= ruleEString
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
            						"uam.mde20.sqlsi.xtext.Datamodels.EString");
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
    // InternalDatamodels.g:493:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDatamodels.g:493:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDatamodels.g:494:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalDatamodels.g:500:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isUnique_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDatamodels.g:506:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalDatamodels.g:507:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalDatamodels.g:507:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) ) )
            // InternalDatamodels.g:508:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( (lv_isUnique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalDatamodels.g:512:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDatamodels.g:513:4: (lv_name_1_0= ruleEString )
            {
            // InternalDatamodels.g:513:4: (lv_name_1_0= ruleEString )
            // InternalDatamodels.g:514:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.mde20.sqlsi.xtext.Datamodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatamodels.g:531:3: ( (lv_isUnique_2_0= 'unique' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDatamodels.g:532:4: (lv_isUnique_2_0= 'unique' )
                    {
                    // InternalDatamodels.g:532:4: (lv_isUnique_2_0= 'unique' )
                    // InternalDatamodels.g:533:5: lv_isUnique_2_0= 'unique'
                    {
                    lv_isUnique_2_0=(Token)match(input,23,FOLLOW_17); 

                    					newLeafNode(lv_isUnique_2_0, grammarAccess.getAttributeAccess().getIsUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isUnique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalDatamodels.g:545:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDatamodels.g:546:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDatamodels.g:546:4: (lv_type_3_0= ruleDataType )
            // InternalDatamodels.g:547:5: lv_type_3_0= ruleDataType
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
            						"uam.mde20.sqlsi.xtext.Datamodels.DataType");
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
    // InternalDatamodels.g:568:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDatamodels.g:574:2: ( ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) ) )
            // InternalDatamodels.g:575:2: ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) )
            {
            // InternalDatamodels.g:575:2: ( (enumLiteral_0= '[*]' ) | (enumLiteral_1= '[1]' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDatamodels.g:576:3: (enumLiteral_0= '[*]' )
                    {
                    // InternalDatamodels.g:576:3: (enumLiteral_0= '[*]' )
                    // InternalDatamodels.g:577:4: enumLiteral_0= '[*]'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:584:3: (enumLiteral_1= '[1]' )
                    {
                    // InternalDatamodels.g:584:3: (enumLiteral_1= '[1]' )
                    // InternalDatamodels.g:585:4: enumLiteral_1= '[1]'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalDatamodels.g:595:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDatamodels.g:601:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) ) )
            // InternalDatamodels.g:602:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) )
            {
            // InternalDatamodels.g:602:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDatamodels.g:603:3: (enumLiteral_0= 'String' )
                    {
                    // InternalDatamodels.g:603:3: (enumLiteral_0= 'String' )
                    // InternalDatamodels.g:604:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:611:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalDatamodels.g:611:3: (enumLiteral_1= 'Integer' )
                    // InternalDatamodels.g:612:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000004C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C800000L});

}
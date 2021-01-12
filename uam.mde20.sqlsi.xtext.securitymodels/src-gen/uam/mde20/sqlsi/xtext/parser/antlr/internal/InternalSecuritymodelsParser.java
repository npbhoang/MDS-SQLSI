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
import uam.mde20.sqlsi.xtext.services.SecuritymodelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecuritymodelsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SecurityModel'", "'protect'", "'roles'", "'{'", "','", "'}'", "'rules'", "'Rule'", "'action'", "'('", "')'", "'auths'", "'<-'", "'as'", "'condition:'", "'textual'", "'oclExp'", "'sqlStm'", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSecuritymodelsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecuritymodelsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecuritymodelsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSecuritymodels.g"; }



     	private SecuritymodelsGrammarAccess grammarAccess;

        public InternalSecuritymodelsParser(TokenStream input, SecuritymodelsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SecurityModel";
       	}

       	@Override
       	protected SecuritymodelsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSecurityModel"
    // InternalSecuritymodels.g:65:1: entryRuleSecurityModel returns [EObject current=null] : iv_ruleSecurityModel= ruleSecurityModel EOF ;
    public final EObject entryRuleSecurityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityModel = null;


        try {
            // InternalSecuritymodels.g:65:54: (iv_ruleSecurityModel= ruleSecurityModel EOF )
            // InternalSecuritymodels.g:66:2: iv_ruleSecurityModel= ruleSecurityModel EOF
            {
             newCompositeNode(grammarAccess.getSecurityModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityModel=ruleSecurityModel();

            state._fsp--;

             current =iv_ruleSecurityModel; 
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
    // $ANTLR end "entryRuleSecurityModel"


    // $ANTLR start "ruleSecurityModel"
    // InternalSecuritymodels.g:72:1: ruleSecurityModel returns [EObject current=null] : (otherlv_0= 'SecurityModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )* )? otherlv_6= 'roles' otherlv_7= '{' ( (lv_roles_8_0= ruleRole ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) ) )* otherlv_11= '}' (otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleSecurityModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_resources_3_0 = null;

        EObject lv_resources_5_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_roles_10_0 = null;

        EObject lv_rules_14_0 = null;

        EObject lv_rules_16_0 = null;



        	enterRule();

        try {
            // InternalSecuritymodels.g:78:2: ( (otherlv_0= 'SecurityModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )* )? otherlv_6= 'roles' otherlv_7= '{' ( (lv_roles_8_0= ruleRole ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) ) )* otherlv_11= '}' (otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}' )? ) )
            // InternalSecuritymodels.g:79:2: (otherlv_0= 'SecurityModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )* )? otherlv_6= 'roles' otherlv_7= '{' ( (lv_roles_8_0= ruleRole ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) ) )* otherlv_11= '}' (otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}' )? )
            {
            // InternalSecuritymodels.g:79:2: (otherlv_0= 'SecurityModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )* )? otherlv_6= 'roles' otherlv_7= '{' ( (lv_roles_8_0= ruleRole ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) ) )* otherlv_11= '}' (otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}' )? )
            // InternalSecuritymodels.g:80:3: otherlv_0= 'SecurityModel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )* )? otherlv_6= 'roles' otherlv_7= '{' ( (lv_roles_8_0= ruleRole ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) ) )* otherlv_11= '}' (otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSecurityModelAccess().getSecurityModelKeyword_0());
            		
            // InternalSecuritymodels.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecuritymodels.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecuritymodels.g:85:4: (lv_name_1_0= ruleEString )
            // InternalSecuritymodels.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecuritymodels.g:103:3: (otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecuritymodels.g:104:4: otherlv_2= 'protect' ( (lv_resources_3_0= ruleProtectedResource ) ) (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSecurityModelAccess().getProtectKeyword_2_0());
                    			
                    // InternalSecuritymodels.g:108:4: ( (lv_resources_3_0= ruleProtectedResource ) )
                    // InternalSecuritymodels.g:109:5: (lv_resources_3_0= ruleProtectedResource )
                    {
                    // InternalSecuritymodels.g:109:5: (lv_resources_3_0= ruleProtectedResource )
                    // InternalSecuritymodels.g:110:6: lv_resources_3_0= ruleProtectedResource
                    {

                    						newCompositeNode(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_resources_3_0=ruleProtectedResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityModelRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_3_0,
                    							"uam.mde20.sqlsi.xtext.Securitymodels.ProtectedResource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecuritymodels.g:127:4: (otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSecuritymodels.g:128:5: otherlv_4= 'protect' ( (lv_resources_5_0= ruleProtectedResource ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSecurityModelAccess().getProtectKeyword_2_2_0());
                    	    				
                    	    // InternalSecuritymodels.g:132:5: ( (lv_resources_5_0= ruleProtectedResource ) )
                    	    // InternalSecuritymodels.g:133:6: (lv_resources_5_0= ruleProtectedResource )
                    	    {
                    	    // InternalSecuritymodels.g:133:6: (lv_resources_5_0= ruleProtectedResource )
                    	    // InternalSecuritymodels.g:134:7: lv_resources_5_0= ruleProtectedResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_resources_5_0=ruleProtectedResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSecurityModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_5_0,
                    	    								"uam.mde20.sqlsi.xtext.Securitymodels.ProtectedResource");
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

            otherlv_6=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSecurityModelAccess().getRolesKeyword_3());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSecurityModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSecuritymodels.g:161:3: ( (lv_roles_8_0= ruleRole ) )
            // InternalSecuritymodels.g:162:4: (lv_roles_8_0= ruleRole )
            {
            // InternalSecuritymodels.g:162:4: (lv_roles_8_0= ruleRole )
            // InternalSecuritymodels.g:163:5: lv_roles_8_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_roles_8_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_8_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecuritymodels.g:180:3: (otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecuritymodels.g:181:4: otherlv_9= ',' ( (lv_roles_10_0= ruleRole ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSecurityModelAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSecuritymodels.g:185:4: ( (lv_roles_10_0= ruleRole ) )
            	    // InternalSecuritymodels.g:186:5: (lv_roles_10_0= ruleRole )
            	    {
            	    // InternalSecuritymodels.g:186:5: (lv_roles_10_0= ruleRole )
            	    // InternalSecuritymodels.g:187:6: lv_roles_10_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_roles_10_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_10_0,
            	    							"uam.mde20.sqlsi.xtext.Securitymodels.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getSecurityModelAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalSecuritymodels.g:209:3: (otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecuritymodels.g:210:4: otherlv_12= 'rules' otherlv_13= '{' ( (lv_rules_14_0= ruleRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getSecurityModelAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSecuritymodels.g:218:4: ( (lv_rules_14_0= ruleRule ) )
                    // InternalSecuritymodels.g:219:5: (lv_rules_14_0= ruleRule )
                    {
                    // InternalSecuritymodels.g:219:5: (lv_rules_14_0= ruleRule )
                    // InternalSecuritymodels.g:220:6: lv_rules_14_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_rules_14_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityModelRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_14_0,
                    							"uam.mde20.sqlsi.xtext.Securitymodels.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecuritymodels.g:237:4: (otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSecuritymodels.g:238:5: otherlv_15= ',' ( (lv_rules_16_0= ruleRule ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSecurityModelAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSecuritymodels.g:242:5: ( (lv_rules_16_0= ruleRule ) )
                    	    // InternalSecuritymodels.g:243:6: (lv_rules_16_0= ruleRule )
                    	    {
                    	    // InternalSecuritymodels.g:243:6: (lv_rules_16_0= ruleRule )
                    	    // InternalSecuritymodels.g:244:7: lv_rules_16_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_rules_16_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSecurityModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_16_0,
                    	    								"uam.mde20.sqlsi.xtext.Securitymodels.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getSecurityModelAccess().getRightCurlyBracketKeyword_8_4());
                    			

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
    // $ANTLR end "ruleSecurityModel"


    // $ANTLR start "entryRuleEString"
    // InternalSecuritymodels.g:271:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecuritymodels.g:271:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecuritymodels.g:272:2: iv_ruleEString= ruleEString EOF
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
    // InternalSecuritymodels.g:278:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecuritymodels.g:284:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecuritymodels.g:285:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecuritymodels.g:285:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSecuritymodels.g:286:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecuritymodels.g:294:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRule"
    // InternalSecuritymodels.g:305:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSecuritymodels.g:305:45: (iv_ruleRule= ruleRule EOF )
            // InternalSecuritymodels.g:306:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSecuritymodels.g:312:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'action' ( (lv_action_4_0= ruleAction ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'auths' otherlv_11= '{' ( (lv_auths_12_0= ruleAuth ) ) (otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_action_4_0 = null;

        EObject lv_auths_12_0 = null;

        EObject lv_auths_14_0 = null;



        	enterRule();

        try {
            // InternalSecuritymodels.g:318:2: ( (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'action' ( (lv_action_4_0= ruleAction ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'auths' otherlv_11= '{' ( (lv_auths_12_0= ruleAuth ) ) (otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalSecuritymodels.g:319:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'action' ( (lv_action_4_0= ruleAction ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'auths' otherlv_11= '{' ( (lv_auths_12_0= ruleAuth ) ) (otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalSecuritymodels.g:319:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'action' ( (lv_action_4_0= ruleAction ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'auths' otherlv_11= '{' ( (lv_auths_12_0= ruleAuth ) ) (otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalSecuritymodels.g:320:3: otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'action' ( (lv_action_4_0= ruleAction ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'auths' otherlv_11= '{' ( (lv_auths_12_0= ruleAuth ) ) (otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalSecuritymodels.g:324:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSecuritymodels.g:325:4: (lv_name_1_0= ruleEString )
            {
            // InternalSecuritymodels.g:325:4: (lv_name_1_0= ruleEString )
            // InternalSecuritymodels.g:326:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getActionKeyword_3());
            		
            // InternalSecuritymodels.g:351:3: ( (lv_action_4_0= ruleAction ) )
            // InternalSecuritymodels.g:352:4: (lv_action_4_0= ruleAction )
            {
            // InternalSecuritymodels.g:352:4: (lv_action_4_0= ruleAction )
            // InternalSecuritymodels.g:353:5: lv_action_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_action_4_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_4_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSecuritymodels.g:374:3: ( ( ruleEString ) )
            // InternalSecuritymodels.g:375:4: ( ruleEString )
            {
            // InternalSecuritymodels.g:375:4: ( ruleEString )
            // InternalSecuritymodels.g:376:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceCrossReference_6_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecuritymodels.g:390:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSecuritymodels.g:391:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSecuritymodels.g:395:4: ( ( ruleEString ) )
            	    // InternalSecuritymodels.g:396:5: ( ruleEString )
            	    {
            	    // InternalSecuritymodels.g:396:5: ( ruleEString )
            	    // InternalSecuritymodels.g:397:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getAuthsKeyword_9());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSecuritymodels.g:424:3: ( (lv_auths_12_0= ruleAuth ) )
            // InternalSecuritymodels.g:425:4: (lv_auths_12_0= ruleAuth )
            {
            // InternalSecuritymodels.g:425:4: (lv_auths_12_0= ruleAuth )
            // InternalSecuritymodels.g:426:5: lv_auths_12_0= ruleAuth
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_6);
            lv_auths_12_0=ruleAuth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"auths",
            						lv_auths_12_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.Auth");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecuritymodels.g:443:3: (otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecuritymodels.g:444:4: otherlv_13= ',' ( (lv_auths_14_0= ruleAuth ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_14); 

            	    				newLeafNode(otherlv_13, grammarAccess.getRuleAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalSecuritymodels.g:448:4: ( (lv_auths_14_0= ruleAuth ) )
            	    // InternalSecuritymodels.g:449:5: (lv_auths_14_0= ruleAuth )
            	    {
            	    // InternalSecuritymodels.g:449:5: (lv_auths_14_0= ruleAuth )
            	    // InternalSecuritymodels.g:450:6: lv_auths_14_0= ruleAuth
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_auths_14_0=ruleAuth();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"auths",
            	    							lv_auths_14_0,
            	    							"uam.mde20.sqlsi.xtext.Securitymodels.Auth");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRole"
    // InternalSecuritymodels.g:480:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecuritymodels.g:480:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecuritymodels.g:481:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSecuritymodels.g:487:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_userEntity_2_0= ruleEString ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_userEntity_2_0 = null;



        	enterRule();

        try {
            // InternalSecuritymodels.g:493:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_userEntity_2_0= ruleEString ) ) ) )
            // InternalSecuritymodels.g:494:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_userEntity_2_0= ruleEString ) ) )
            {
            // InternalSecuritymodels.g:494:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_userEntity_2_0= ruleEString ) ) )
            // InternalSecuritymodels.g:495:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_userEntity_2_0= ruleEString ) )
            {
            // InternalSecuritymodels.g:495:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSecuritymodels.g:496:4: (lv_name_0_0= ruleEString )
            {
            // InternalSecuritymodels.g:496:4: (lv_name_0_0= ruleEString )
            // InternalSecuritymodels.g:497:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalSecuritymodels.g:518:3: ( (lv_userEntity_2_0= ruleEString ) )
            // InternalSecuritymodels.g:519:4: (lv_userEntity_2_0= ruleEString )
            {
            // InternalSecuritymodels.g:519:4: (lv_userEntity_2_0= ruleEString )
            // InternalSecuritymodels.g:520:5: lv_userEntity_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getUserEntityEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_userEntity_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"userEntity",
            						lv_userEntity_2_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleProtectedResource"
    // InternalSecuritymodels.g:541:1: entryRuleProtectedResource returns [EObject current=null] : iv_ruleProtectedResource= ruleProtectedResource EOF ;
    public final EObject entryRuleProtectedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectedResource = null;


        try {
            // InternalSecuritymodels.g:541:58: (iv_ruleProtectedResource= ruleProtectedResource EOF )
            // InternalSecuritymodels.g:542:2: iv_ruleProtectedResource= ruleProtectedResource EOF
            {
             newCompositeNode(grammarAccess.getProtectedResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtectedResource=ruleProtectedResource();

            state._fsp--;

             current =iv_ruleProtectedResource; 
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
    // $ANTLR end "entryRuleProtectedResource"


    // $ANTLR start "ruleProtectedResource"
    // InternalSecuritymodels.g:548:1: ruleProtectedResource returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProtectedResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSecuritymodels.g:554:2: ( ( ( ( ruleEString ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSecuritymodels.g:555:2: ( ( ( ruleEString ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSecuritymodels.g:555:2: ( ( ( ruleEString ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSecuritymodels.g:556:3: ( ( ruleEString ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSecuritymodels.g:556:3: ( ( ruleEString ) )
            // InternalSecuritymodels.g:557:4: ( ruleEString )
            {
            // InternalSecuritymodels.g:557:4: ( ruleEString )
            // InternalSecuritymodels.g:558:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectedResourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_0_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProtectedResourceAccess().getAsKeyword_1());
            		
            // InternalSecuritymodels.g:576:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecuritymodels.g:577:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecuritymodels.g:577:4: (lv_name_2_0= ruleEString )
            // InternalSecuritymodels.g:578:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProtectedResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
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
    // $ANTLR end "ruleProtectedResource"


    // $ANTLR start "entryRuleAuth"
    // InternalSecuritymodels.g:599:1: entryRuleAuth returns [EObject current=null] : iv_ruleAuth= ruleAuth EOF ;
    public final EObject entryRuleAuth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuth = null;


        try {
            // InternalSecuritymodels.g:599:45: (iv_ruleAuth= ruleAuth EOF )
            // InternalSecuritymodels.g:600:2: iv_ruleAuth= ruleAuth EOF
            {
             newCompositeNode(grammarAccess.getAuthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuth=ruleAuth();

            state._fsp--;

             current =iv_ruleAuth; 
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
    // $ANTLR end "entryRuleAuth"


    // $ANTLR start "ruleAuth"
    // InternalSecuritymodels.g:606:1: ruleAuth returns [EObject current=null] : (otherlv_0= 'roles' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' otherlv_6= 'condition:' otherlv_7= '{' otherlv_8= 'textual' ( (lv_textual_9_0= ruleEString ) ) otherlv_10= 'oclExp' ( (lv_oclExp_11_0= ruleEString ) ) otherlv_12= 'sqlStm' ( (lv_sqlStm_13_0= ruleEString ) ) otherlv_14= '}' ) ;
    public final EObject ruleAuth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_textual_9_0 = null;

        AntlrDatatypeRuleToken lv_oclExp_11_0 = null;

        AntlrDatatypeRuleToken lv_sqlStm_13_0 = null;



        	enterRule();

        try {
            // InternalSecuritymodels.g:612:2: ( (otherlv_0= 'roles' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' otherlv_6= 'condition:' otherlv_7= '{' otherlv_8= 'textual' ( (lv_textual_9_0= ruleEString ) ) otherlv_10= 'oclExp' ( (lv_oclExp_11_0= ruleEString ) ) otherlv_12= 'sqlStm' ( (lv_sqlStm_13_0= ruleEString ) ) otherlv_14= '}' ) )
            // InternalSecuritymodels.g:613:2: (otherlv_0= 'roles' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' otherlv_6= 'condition:' otherlv_7= '{' otherlv_8= 'textual' ( (lv_textual_9_0= ruleEString ) ) otherlv_10= 'oclExp' ( (lv_oclExp_11_0= ruleEString ) ) otherlv_12= 'sqlStm' ( (lv_sqlStm_13_0= ruleEString ) ) otherlv_14= '}' )
            {
            // InternalSecuritymodels.g:613:2: (otherlv_0= 'roles' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' otherlv_6= 'condition:' otherlv_7= '{' otherlv_8= 'textual' ( (lv_textual_9_0= ruleEString ) ) otherlv_10= 'oclExp' ( (lv_oclExp_11_0= ruleEString ) ) otherlv_12= 'sqlStm' ( (lv_sqlStm_13_0= ruleEString ) ) otherlv_14= '}' )
            // InternalSecuritymodels.g:614:3: otherlv_0= 'roles' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' otherlv_6= 'condition:' otherlv_7= '{' otherlv_8= 'textual' ( (lv_textual_9_0= ruleEString ) ) otherlv_10= 'oclExp' ( (lv_oclExp_11_0= ruleEString ) ) otherlv_12= 'sqlStm' ( (lv_sqlStm_13_0= ruleEString ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthAccess().getRolesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecuritymodels.g:622:3: ( ( ruleEString ) )
            // InternalSecuritymodels.g:623:4: ( ruleEString )
            {
            // InternalSecuritymodels.g:623:4: ( ruleEString )
            // InternalSecuritymodels.g:624:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthAccess().getRolesRoleCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecuritymodels.g:638:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecuritymodels.g:639:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAuthAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSecuritymodels.g:643:4: ( ( ruleEString ) )
            	    // InternalSecuritymodels.g:644:5: ( ruleEString )
            	    {
            	    // InternalSecuritymodels.g:644:5: ( ruleEString )
            	    // InternalSecuritymodels.g:645:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAuthRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getAuthAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getAuthAccess().getConditionKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAuthAccess().getTextualKeyword_7());
            		
            // InternalSecuritymodels.g:676:3: ( (lv_textual_9_0= ruleEString ) )
            // InternalSecuritymodels.g:677:4: (lv_textual_9_0= ruleEString )
            {
            // InternalSecuritymodels.g:677:4: (lv_textual_9_0= ruleEString )
            // InternalSecuritymodels.g:678:5: lv_textual_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_textual_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthRule());
            					}
            					set(
            						current,
            						"textual",
            						lv_textual_9_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getAuthAccess().getOclExpKeyword_9());
            		
            // InternalSecuritymodels.g:699:3: ( (lv_oclExp_11_0= ruleEString ) )
            // InternalSecuritymodels.g:700:4: (lv_oclExp_11_0= ruleEString )
            {
            // InternalSecuritymodels.g:700:4: (lv_oclExp_11_0= ruleEString )
            // InternalSecuritymodels.g:701:5: lv_oclExp_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_21);
            lv_oclExp_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthRule());
            					}
            					set(
            						current,
            						"oclExp",
            						lv_oclExp_11_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getAuthAccess().getSqlStmKeyword_11());
            		
            // InternalSecuritymodels.g:722:3: ( (lv_sqlStm_13_0= ruleEString ) )
            // InternalSecuritymodels.g:723:4: (lv_sqlStm_13_0= ruleEString )
            {
            // InternalSecuritymodels.g:723:4: (lv_sqlStm_13_0= ruleEString )
            // InternalSecuritymodels.g:724:5: lv_sqlStm_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_15);
            lv_sqlStm_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthRule());
            					}
            					set(
            						current,
            						"sqlStm",
            						lv_sqlStm_13_0,
            						"uam.mde20.sqlsi.xtext.Securitymodels.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleAuth"


    // $ANTLR start "ruleAction"
    // InternalSecuritymodels.g:749:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecuritymodels.g:755:2: ( ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecuritymodels.g:756:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecuritymodels.g:756:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSecuritymodels.g:757:3: (enumLiteral_0= 'READ' )
                    {
                    // InternalSecuritymodels.g:757:3: (enumLiteral_0= 'READ' )
                    // InternalSecuritymodels.g:758:4: enumLiteral_0= 'READ'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecuritymodels.g:765:3: (enumLiteral_1= 'CREATE' )
                    {
                    // InternalSecuritymodels.g:765:3: (enumLiteral_1= 'CREATE' )
                    // InternalSecuritymodels.g:766:4: enumLiteral_1= 'CREATE'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecuritymodels.g:773:3: (enumLiteral_2= 'UPDATE' )
                    {
                    // InternalSecuritymodels.g:773:3: (enumLiteral_2= 'UPDATE' )
                    // InternalSecuritymodels.g:774:4: enumLiteral_2= 'UPDATE'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecuritymodels.g:781:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecuritymodels.g:781:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecuritymodels.g:782:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});

}
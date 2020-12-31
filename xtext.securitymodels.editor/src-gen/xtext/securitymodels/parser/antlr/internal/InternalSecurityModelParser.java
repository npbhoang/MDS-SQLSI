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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name:'", "'roles:'", "'protected:'", "','", "'rules:'", "':'", "'conditions'", "'{'", "'or'", "'}'", "'<-'", "'roles'", "'('", "')'", "'context:'", "'ocl:'", "'sql:'", "'as'", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'"
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


        public InternalSecurityModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecurityModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecurityModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSecurityModel.g"; }



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




    // $ANTLR start "entryRuleSecurityModel"
    // InternalSecurityModel.g:65:1: entryRuleSecurityModel returns [EObject current=null] : iv_ruleSecurityModel= ruleSecurityModel EOF ;
    public final EObject entryRuleSecurityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityModel = null;


        try {
            // InternalSecurityModel.g:65:54: (iv_ruleSecurityModel= ruleSecurityModel EOF )
            // InternalSecurityModel.g:66:2: iv_ruleSecurityModel= ruleSecurityModel EOF
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
    // InternalSecurityModel.g:72:1: ruleSecurityModel returns [EObject current=null] : ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'roles:' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= 'protected:' ( (lv_resources_6_0= ruleProtectedResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) ) )* (otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+ )? ) ;
    public final EObject ruleSecurityModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_roles_4_0 = null;

        EObject lv_resources_6_0 = null;

        EObject lv_resources_8_0 = null;

        EObject lv_rules_10_0 = null;



        	enterRule();

        try {
            // InternalSecurityModel.g:78:2: ( ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'roles:' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= 'protected:' ( (lv_resources_6_0= ruleProtectedResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) ) )* (otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+ )? ) )
            // InternalSecurityModel.g:79:2: ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'roles:' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= 'protected:' ( (lv_resources_6_0= ruleProtectedResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) ) )* (otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+ )? )
            {
            // InternalSecurityModel.g:79:2: ( () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'roles:' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= 'protected:' ( (lv_resources_6_0= ruleProtectedResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) ) )* (otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+ )? )
            // InternalSecurityModel.g:80:3: () otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'roles:' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= 'protected:' ( (lv_resources_6_0= ruleProtectedResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) ) )* (otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+ )?
            {
            // InternalSecurityModel.g:80:3: ()
            // InternalSecurityModel.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecurityModelAccess().getSecurityModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSecurityModelAccess().getNameKeyword_1());
            		
            // InternalSecurityModel.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSecurityModel.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalSecurityModel.g:92:4: (lv_name_2_0= ruleEString )
            // InternalSecurityModel.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSecurityModelAccess().getRolesKeyword_3());
            		
            // InternalSecurityModel.g:114:3: ( (lv_roles_4_0= ruleRole ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSecurityModel.g:115:4: (lv_roles_4_0= ruleRole )
            	    {
            	    // InternalSecurityModel.g:115:4: (lv_roles_4_0= ruleRole )
            	    // InternalSecurityModel.g:116:5: lv_roles_4_0= ruleRole
            	    {

            	    					newCompositeNode(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_roles_4_0=ruleRole();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roles",
            	    						lv_roles_4_0,
            	    						"xtext.securitymodels.SecurityModel.Role");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSecurityModelAccess().getProtectedKeyword_5());
            		
            // InternalSecurityModel.g:137:3: ( (lv_resources_6_0= ruleProtectedResource ) )
            // InternalSecurityModel.g:138:4: (lv_resources_6_0= ruleProtectedResource )
            {
            // InternalSecurityModel.g:138:4: (lv_resources_6_0= ruleProtectedResource )
            // InternalSecurityModel.g:139:5: lv_resources_6_0= ruleProtectedResource
            {

            					newCompositeNode(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_resources_6_0=ruleProtectedResource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            					}
            					add(
            						current,
            						"resources",
            						lv_resources_6_0,
            						"xtext.securitymodels.SecurityModel.ProtectedResource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityModel.g:156:3: (otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSecurityModel.g:157:4: otherlv_7= ',' ( (lv_resources_8_0= ruleProtectedResource ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSecurityModelAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSecurityModel.g:161:4: ( (lv_resources_8_0= ruleProtectedResource ) )
            	    // InternalSecurityModel.g:162:5: (lv_resources_8_0= ruleProtectedResource )
            	    {
            	    // InternalSecurityModel.g:162:5: (lv_resources_8_0= ruleProtectedResource )
            	    // InternalSecurityModel.g:163:6: lv_resources_8_0= ruleProtectedResource
            	    {

            	    						newCompositeNode(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_resources_8_0=ruleProtectedResource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSecurityModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"resources",
            	    							lv_resources_8_0,
            	    							"xtext.securitymodels.SecurityModel.ProtectedResource");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSecurityModel.g:181:3: (otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecurityModel.g:182:4: otherlv_9= 'rules:' ( (lv_rules_10_0= ruleRule ) )+
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0());
                    			
                    // InternalSecurityModel.g:186:4: ( (lv_rules_10_0= ruleRule ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSecurityModel.g:187:5: (lv_rules_10_0= ruleRule )
                    	    {
                    	    // InternalSecurityModel.g:187:5: (lv_rules_10_0= ruleRule )
                    	    // InternalSecurityModel.g:188:6: lv_rules_10_0= ruleRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_rules_10_0=ruleRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSecurityModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rules",
                    	    							lv_rules_10_0,
                    	    							"xtext.securitymodels.SecurityModel.Rule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
    // $ANTLR end "ruleSecurityModel"


    // $ANTLR start "entryRuleEString"
    // InternalSecurityModel.g:210:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSecurityModel.g:210:47: (iv_ruleEString= ruleEString EOF )
            // InternalSecurityModel.g:211:2: iv_ruleEString= ruleEString EOF
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
    // InternalSecurityModel.g:217:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSecurityModel.g:223:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSecurityModel.g:224:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSecurityModel.g:224:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityModel.g:225:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecurityModel.g:233:3: this_ID_1= RULE_ID
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
    // InternalSecurityModel.g:244:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSecurityModel.g:244:45: (iv_ruleRule= ruleRule EOF )
            // InternalSecurityModel.g:245:2: iv_ruleRule= ruleRule EOF
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
    // InternalSecurityModel.g:251:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'conditions' (otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_action_2_0 = null;

        EObject lv_auths_5_0 = null;

        EObject lv_auths_7_0 = null;



        	enterRule();

        try {
            // InternalSecurityModel.g:257:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'conditions' (otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}' )? ) )
            // InternalSecurityModel.g:258:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'conditions' (otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}' )? )
            {
            // InternalSecurityModel.g:258:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'conditions' (otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}' )? )
            // InternalSecurityModel.g:259:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_action_2_0= ruleAction ) ) otherlv_3= 'conditions' (otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}' )?
            {
            // InternalSecurityModel.g:259:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSecurityModel.g:260:4: (lv_name_0_0= ruleEString )
            {
            // InternalSecurityModel.g:260:4: (lv_name_0_0= ruleEString )
            // InternalSecurityModel.g:261:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonKeyword_1());
            		
            // InternalSecurityModel.g:282:3: ( (lv_action_2_0= ruleAction ) )
            // InternalSecurityModel.g:283:4: (lv_action_2_0= ruleAction )
            {
            // InternalSecurityModel.g:283:4: (lv_action_2_0= ruleAction )
            // InternalSecurityModel.g:284:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_action_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"xtext.securitymodels.SecurityModel.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getConditionsKeyword_3());
            		
            // InternalSecurityModel.g:305:3: (otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityModel.g:306:4: otherlv_4= '{' ( (lv_auths_5_0= ruleAuth ) ) (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSecurityModel.g:310:4: ( (lv_auths_5_0= ruleAuth ) )
                    // InternalSecurityModel.g:311:5: (lv_auths_5_0= ruleAuth )
                    {
                    // InternalSecurityModel.g:311:5: (lv_auths_5_0= ruleAuth )
                    // InternalSecurityModel.g:312:6: lv_auths_5_0= ruleAuth
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_auths_5_0=ruleAuth();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"auths",
                    							lv_auths_5_0,
                    							"xtext.securitymodels.SecurityModel.Auth");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSecurityModel.g:329:4: (otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSecurityModel.g:330:5: otherlv_6= 'or' ( (lv_auths_7_0= ruleAuth ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getOrKeyword_4_2_0());
                    	    				
                    	    // InternalSecurityModel.g:334:5: ( (lv_auths_7_0= ruleAuth ) )
                    	    // InternalSecurityModel.g:335:6: (lv_auths_7_0= ruleAuth )
                    	    {
                    	    // InternalSecurityModel.g:335:6: (lv_auths_7_0= ruleAuth )
                    	    // InternalSecurityModel.g:336:7: lv_auths_7_0= ruleAuth
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_auths_7_0=ruleAuth();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"auths",
                    	    								lv_auths_7_0,
                    	    								"xtext.securitymodels.SecurityModel.Auth");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRole"
    // InternalSecurityModel.g:363:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSecurityModel.g:363:45: (iv_ruleRole= ruleRole EOF )
            // InternalSecurityModel.g:364:2: iv_ruleRole= ruleRole EOF
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
    // InternalSecurityModel.g:370:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSecurityModel.g:376:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSecurityModel.g:377:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSecurityModel.g:377:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (otherlv_2= RULE_ID ) ) )
            // InternalSecurityModel.g:378:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '<-' ( (otherlv_2= RULE_ID ) )
            {
            // InternalSecurityModel.g:378:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSecurityModel.g:379:4: (lv_name_0_0= ruleEString )
            {
            // InternalSecurityModel.g:379:4: (lv_name_0_0= ruleEString )
            // InternalSecurityModel.g:380:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalSecurityModel.g:401:3: ( (otherlv_2= RULE_ID ) )
            // InternalSecurityModel.g:402:4: (otherlv_2= RULE_ID )
            {
            // InternalSecurityModel.g:402:4: (otherlv_2= RULE_ID )
            // InternalSecurityModel.g:403:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getUserEntityEntityCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleAuth"
    // InternalSecurityModel.g:418:1: entryRuleAuth returns [EObject current=null] : iv_ruleAuth= ruleAuth EOF ;
    public final EObject entryRuleAuth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuth = null;


        try {
            // InternalSecurityModel.g:418:45: (iv_ruleAuth= ruleAuth EOF )
            // InternalSecurityModel.g:419:2: iv_ruleAuth= ruleAuth EOF
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
    // InternalSecurityModel.g:425:1: ruleAuth returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'roles' otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'context:' ( (lv_textual_8_0= ruleEString ) ) otherlv_9= 'ocl:' ( (lv_oclExp_10_0= ruleEString ) ) otherlv_11= 'sql:' ( (lv_sqlStm_12_0= ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleAuth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_textual_8_0 = null;

        AntlrDatatypeRuleToken lv_oclExp_10_0 = null;

        AntlrDatatypeRuleToken lv_sqlStm_12_0 = null;



        	enterRule();

        try {
            // InternalSecurityModel.g:431:2: ( (otherlv_0= '{' otherlv_1= 'roles' otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'context:' ( (lv_textual_8_0= ruleEString ) ) otherlv_9= 'ocl:' ( (lv_oclExp_10_0= ruleEString ) ) otherlv_11= 'sql:' ( (lv_sqlStm_12_0= ruleEString ) ) otherlv_13= '}' ) )
            // InternalSecurityModel.g:432:2: (otherlv_0= '{' otherlv_1= 'roles' otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'context:' ( (lv_textual_8_0= ruleEString ) ) otherlv_9= 'ocl:' ( (lv_oclExp_10_0= ruleEString ) ) otherlv_11= 'sql:' ( (lv_sqlStm_12_0= ruleEString ) ) otherlv_13= '}' )
            {
            // InternalSecurityModel.g:432:2: (otherlv_0= '{' otherlv_1= 'roles' otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'context:' ( (lv_textual_8_0= ruleEString ) ) otherlv_9= 'ocl:' ( (lv_oclExp_10_0= ruleEString ) ) otherlv_11= 'sql:' ( (lv_sqlStm_12_0= ruleEString ) ) otherlv_13= '}' )
            // InternalSecurityModel.g:433:3: otherlv_0= '{' otherlv_1= 'roles' otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'context:' ( (lv_textual_8_0= ruleEString ) ) otherlv_9= 'ocl:' ( (lv_oclExp_10_0= ruleEString ) ) otherlv_11= 'sql:' ( (lv_sqlStm_12_0= ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthAccess().getRolesKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSecurityModel.g:445:3: ( ( ruleEString ) )
            // InternalSecurityModel.g:446:4: ( ruleEString )
            {
            // InternalSecurityModel.g:446:4: ( ruleEString )
            // InternalSecurityModel.g:447:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecurityModel.g:461:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecurityModel.g:462:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAuthAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSecurityModel.g:466:4: ( ( ruleEString ) )
            	    // InternalSecurityModel.g:467:5: ( ruleEString )
            	    {
            	    // InternalSecurityModel.g:467:5: ( ruleEString )
            	    // InternalSecurityModel.g:468:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAuthRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getAuthAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAuthAccess().getContextKeyword_6());
            		
            // InternalSecurityModel.g:491:3: ( (lv_textual_8_0= ruleEString ) )
            // InternalSecurityModel.g:492:4: (lv_textual_8_0= ruleEString )
            {
            // InternalSecurityModel.g:492:4: (lv_textual_8_0= ruleEString )
            // InternalSecurityModel.g:493:5: lv_textual_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_textual_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthRule());
            					}
            					set(
            						current,
            						"textual",
            						lv_textual_8_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getAuthAccess().getOclKeyword_8());
            		
            // InternalSecurityModel.g:514:3: ( (lv_oclExp_10_0= ruleEString ) )
            // InternalSecurityModel.g:515:4: (lv_oclExp_10_0= ruleEString )
            {
            // InternalSecurityModel.g:515:4: (lv_oclExp_10_0= ruleEString )
            // InternalSecurityModel.g:516:5: lv_oclExp_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_oclExp_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthRule());
            					}
            					set(
            						current,
            						"oclExp",
            						lv_oclExp_10_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getAuthAccess().getSqlKeyword_10());
            		
            // InternalSecurityModel.g:537:3: ( (lv_sqlStm_12_0= ruleEString ) )
            // InternalSecurityModel.g:538:4: (lv_sqlStm_12_0= ruleEString )
            {
            // InternalSecurityModel.g:538:4: (lv_sqlStm_12_0= ruleEString )
            // InternalSecurityModel.g:539:5: lv_sqlStm_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_sqlStm_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthRule());
            					}
            					set(
            						current,
            						"sqlStm",
            						lv_sqlStm_12_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleProtectedResource"
    // InternalSecurityModel.g:564:1: entryRuleProtectedResource returns [EObject current=null] : iv_ruleProtectedResource= ruleProtectedResource EOF ;
    public final EObject entryRuleProtectedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectedResource = null;


        try {
            // InternalSecurityModel.g:564:58: (iv_ruleProtectedResource= ruleProtectedResource EOF )
            // InternalSecurityModel.g:565:2: iv_ruleProtectedResource= ruleProtectedResource EOF
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
    // InternalSecurityModel.g:571:1: ruleProtectedResource returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleProtectedResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalSecurityModel.g:577:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // InternalSecurityModel.g:578:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // InternalSecurityModel.g:578:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' )
            // InternalSecurityModel.g:579:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSecurityModel.g:583:3: ( (otherlv_1= RULE_ID ) )
            // InternalSecurityModel.g:584:4: (otherlv_1= RULE_ID )
            {
            // InternalSecurityModel.g:584:4: (otherlv_1= RULE_ID )
            // InternalSecurityModel.g:585:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectedResourceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProtectedResourceAccess().getAsKeyword_2());
            		
            // InternalSecurityModel.g:600:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSecurityModel.g:601:4: (lv_name_3_0= ruleEString )
            {
            // InternalSecurityModel.g:601:4: (lv_name_3_0= ruleEString )
            // InternalSecurityModel.g:602:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProtectedResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"xtext.securitymodels.SecurityModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "ruleAction"
    // InternalSecurityModel.g:627:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSecurityModel.g:633:2: ( ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalSecurityModel.g:634:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalSecurityModel.g:634:2: ( (enumLiteral_0= 'READ' ) | (enumLiteral_1= 'CREATE' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSecurityModel.g:635:3: (enumLiteral_0= 'READ' )
                    {
                    // InternalSecurityModel.g:635:3: (enumLiteral_0= 'READ' )
                    // InternalSecurityModel.g:636:4: enumLiteral_0= 'READ'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityModel.g:643:3: (enumLiteral_1= 'CREATE' )
                    {
                    // InternalSecurityModel.g:643:3: (enumLiteral_1= 'CREATE' )
                    // InternalSecurityModel.g:644:4: enumLiteral_1= 'CREATE'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityModel.g:651:3: (enumLiteral_2= 'UPDATE' )
                    {
                    // InternalSecurityModel.g:651:3: (enumLiteral_2= 'UPDATE' )
                    // InternalSecurityModel.g:652:4: enumLiteral_2= 'UPDATE'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityModel.g:659:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalSecurityModel.g:659:3: (enumLiteral_3= 'DELETE' )
                    // InternalSecurityModel.g:660:4: enumLiteral_3= 'DELETE'
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});

}
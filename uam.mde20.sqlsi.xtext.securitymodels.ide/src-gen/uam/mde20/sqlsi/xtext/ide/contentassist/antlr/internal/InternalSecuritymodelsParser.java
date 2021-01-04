package uam.mde20.sqlsi.xtext.ide.contentassist.antlr.internal;

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
import uam.mde20.sqlsi.xtext.services.SecuritymodelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecuritymodelsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'", "'SecurityModel'", "'roles'", "'{'", "'}'", "'protect'", "','", "'rules'", "'Rule'", "'action'", "'('", "')'", "'auths'", "'<-'", "'as'", "'condition:'", "'textual'", "'oclExp'", "'sqlStm'"
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

    	public void setGrammarAccess(SecuritymodelsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSecurityModel"
    // InternalSecuritymodels.g:53:1: entryRuleSecurityModel : ruleSecurityModel EOF ;
    public final void entryRuleSecurityModel() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:54:1: ( ruleSecurityModel EOF )
            // InternalSecuritymodels.g:55:1: ruleSecurityModel EOF
            {
             before(grammarAccess.getSecurityModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSecurityModel();

            state._fsp--;

             after(grammarAccess.getSecurityModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityModel"


    // $ANTLR start "ruleSecurityModel"
    // InternalSecuritymodels.g:62:1: ruleSecurityModel : ( ( rule__SecurityModel__Group__0 ) ) ;
    public final void ruleSecurityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:66:2: ( ( ( rule__SecurityModel__Group__0 ) ) )
            // InternalSecuritymodels.g:67:2: ( ( rule__SecurityModel__Group__0 ) )
            {
            // InternalSecuritymodels.g:67:2: ( ( rule__SecurityModel__Group__0 ) )
            // InternalSecuritymodels.g:68:3: ( rule__SecurityModel__Group__0 )
            {
             before(grammarAccess.getSecurityModelAccess().getGroup()); 
            // InternalSecuritymodels.g:69:3: ( rule__SecurityModel__Group__0 )
            // InternalSecuritymodels.g:69:4: rule__SecurityModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityModel"


    // $ANTLR start "entryRuleEString"
    // InternalSecuritymodels.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:79:1: ( ruleEString EOF )
            // InternalSecuritymodels.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSecuritymodels.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSecuritymodels.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSecuritymodels.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSecuritymodels.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSecuritymodels.g:94:3: ( rule__EString__Alternatives )
            // InternalSecuritymodels.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRule"
    // InternalSecuritymodels.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:104:1: ( ruleRule EOF )
            // InternalSecuritymodels.g:105:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSecuritymodels.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSecuritymodels.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSecuritymodels.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalSecuritymodels.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalSecuritymodels.g:119:3: ( rule__Rule__Group__0 )
            // InternalSecuritymodels.g:119:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRole"
    // InternalSecuritymodels.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:129:1: ( ruleRole EOF )
            // InternalSecuritymodels.g:130:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSecuritymodels.g:137:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:141:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSecuritymodels.g:142:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSecuritymodels.g:142:2: ( ( rule__Role__Group__0 ) )
            // InternalSecuritymodels.g:143:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSecuritymodels.g:144:3: ( rule__Role__Group__0 )
            // InternalSecuritymodels.g:144:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleProtectedResource"
    // InternalSecuritymodels.g:153:1: entryRuleProtectedResource : ruleProtectedResource EOF ;
    public final void entryRuleProtectedResource() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:154:1: ( ruleProtectedResource EOF )
            // InternalSecuritymodels.g:155:1: ruleProtectedResource EOF
            {
             before(grammarAccess.getProtectedResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getProtectedResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtectedResource"


    // $ANTLR start "ruleProtectedResource"
    // InternalSecuritymodels.g:162:1: ruleProtectedResource : ( ( rule__ProtectedResource__Group__0 ) ) ;
    public final void ruleProtectedResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:166:2: ( ( ( rule__ProtectedResource__Group__0 ) ) )
            // InternalSecuritymodels.g:167:2: ( ( rule__ProtectedResource__Group__0 ) )
            {
            // InternalSecuritymodels.g:167:2: ( ( rule__ProtectedResource__Group__0 ) )
            // InternalSecuritymodels.g:168:3: ( rule__ProtectedResource__Group__0 )
            {
             before(grammarAccess.getProtectedResourceAccess().getGroup()); 
            // InternalSecuritymodels.g:169:3: ( rule__ProtectedResource__Group__0 )
            // InternalSecuritymodels.g:169:4: rule__ProtectedResource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtectedResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtectedResource"


    // $ANTLR start "entryRuleAuth"
    // InternalSecuritymodels.g:178:1: entryRuleAuth : ruleAuth EOF ;
    public final void entryRuleAuth() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:179:1: ( ruleAuth EOF )
            // InternalSecuritymodels.g:180:1: ruleAuth EOF
            {
             before(grammarAccess.getAuthRule()); 
            pushFollow(FOLLOW_1);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getAuthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuth"


    // $ANTLR start "ruleAuth"
    // InternalSecuritymodels.g:187:1: ruleAuth : ( ( rule__Auth__Group__0 ) ) ;
    public final void ruleAuth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:191:2: ( ( ( rule__Auth__Group__0 ) ) )
            // InternalSecuritymodels.g:192:2: ( ( rule__Auth__Group__0 ) )
            {
            // InternalSecuritymodels.g:192:2: ( ( rule__Auth__Group__0 ) )
            // InternalSecuritymodels.g:193:3: ( rule__Auth__Group__0 )
            {
             before(grammarAccess.getAuthAccess().getGroup()); 
            // InternalSecuritymodels.g:194:3: ( rule__Auth__Group__0 )
            // InternalSecuritymodels.g:194:4: rule__Auth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Auth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuth"


    // $ANTLR start "ruleAction"
    // InternalSecuritymodels.g:203:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:207:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalSecuritymodels.g:208:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalSecuritymodels.g:208:2: ( ( rule__Action__Alternatives ) )
            // InternalSecuritymodels.g:209:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalSecuritymodels.g:210:3: ( rule__Action__Alternatives )
            // InternalSecuritymodels.g:210:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSecuritymodels.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSecuritymodels.g:223:2: ( RULE_STRING )
                    {
                    // InternalSecuritymodels.g:223:2: ( RULE_STRING )
                    // InternalSecuritymodels.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecuritymodels.g:229:2: ( RULE_ID )
                    {
                    // InternalSecuritymodels.g:229:2: ( RULE_ID )
                    // InternalSecuritymodels.g:230:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalSecuritymodels.g:239:1: rule__Action__Alternatives : ( ( ( 'READ' ) ) | ( ( 'CREATE' ) ) | ( ( 'UPDATE' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:243:1: ( ( ( 'READ' ) ) | ( ( 'CREATE' ) ) | ( ( 'UPDATE' ) ) | ( ( 'DELETE' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSecuritymodels.g:244:2: ( ( 'READ' ) )
                    {
                    // InternalSecuritymodels.g:244:2: ( ( 'READ' ) )
                    // InternalSecuritymodels.g:245:3: ( 'READ' )
                    {
                     before(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalSecuritymodels.g:246:3: ( 'READ' )
                    // InternalSecuritymodels.g:246:4: 'READ'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecuritymodels.g:250:2: ( ( 'CREATE' ) )
                    {
                    // InternalSecuritymodels.g:250:2: ( ( 'CREATE' ) )
                    // InternalSecuritymodels.g:251:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); 
                    // InternalSecuritymodels.g:252:3: ( 'CREATE' )
                    // InternalSecuritymodels.g:252:4: 'CREATE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecuritymodels.g:256:2: ( ( 'UPDATE' ) )
                    {
                    // InternalSecuritymodels.g:256:2: ( ( 'UPDATE' ) )
                    // InternalSecuritymodels.g:257:3: ( 'UPDATE' )
                    {
                     before(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); 
                    // InternalSecuritymodels.g:258:3: ( 'UPDATE' )
                    // InternalSecuritymodels.g:258:4: 'UPDATE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecuritymodels.g:262:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecuritymodels.g:262:2: ( ( 'DELETE' ) )
                    // InternalSecuritymodels.g:263:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecuritymodels.g:264:3: ( 'DELETE' )
                    // InternalSecuritymodels.g:264:4: 'DELETE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__SecurityModel__Group__0"
    // InternalSecuritymodels.g:272:1: rule__SecurityModel__Group__0 : rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1 ;
    public final void rule__SecurityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:276:1: ( rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1 )
            // InternalSecuritymodels.g:277:2: rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SecurityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__0"


    // $ANTLR start "rule__SecurityModel__Group__0__Impl"
    // InternalSecuritymodels.g:284:1: rule__SecurityModel__Group__0__Impl : ( 'SecurityModel' ) ;
    public final void rule__SecurityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:288:1: ( ( 'SecurityModel' ) )
            // InternalSecuritymodels.g:289:1: ( 'SecurityModel' )
            {
            // InternalSecuritymodels.g:289:1: ( 'SecurityModel' )
            // InternalSecuritymodels.g:290:2: 'SecurityModel'
            {
             before(grammarAccess.getSecurityModelAccess().getSecurityModelKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getSecurityModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group__1"
    // InternalSecuritymodels.g:299:1: rule__SecurityModel__Group__1 : rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2 ;
    public final void rule__SecurityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:303:1: ( rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2 )
            // InternalSecuritymodels.g:304:2: rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SecurityModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__1"


    // $ANTLR start "rule__SecurityModel__Group__1__Impl"
    // InternalSecuritymodels.g:311:1: rule__SecurityModel__Group__1__Impl : ( ( rule__SecurityModel__NameAssignment_1 ) ) ;
    public final void rule__SecurityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:315:1: ( ( ( rule__SecurityModel__NameAssignment_1 ) ) )
            // InternalSecuritymodels.g:316:1: ( ( rule__SecurityModel__NameAssignment_1 ) )
            {
            // InternalSecuritymodels.g:316:1: ( ( rule__SecurityModel__NameAssignment_1 ) )
            // InternalSecuritymodels.g:317:2: ( rule__SecurityModel__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getNameAssignment_1()); 
            // InternalSecuritymodels.g:318:2: ( rule__SecurityModel__NameAssignment_1 )
            // InternalSecuritymodels.g:318:3: rule__SecurityModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group__2"
    // InternalSecuritymodels.g:326:1: rule__SecurityModel__Group__2 : rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3 ;
    public final void rule__SecurityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:330:1: ( rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3 )
            // InternalSecuritymodels.g:331:2: rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SecurityModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__2"


    // $ANTLR start "rule__SecurityModel__Group__2__Impl"
    // InternalSecuritymodels.g:338:1: rule__SecurityModel__Group__2__Impl : ( ( rule__SecurityModel__Group_2__0 )? ) ;
    public final void rule__SecurityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:342:1: ( ( ( rule__SecurityModel__Group_2__0 )? ) )
            // InternalSecuritymodels.g:343:1: ( ( rule__SecurityModel__Group_2__0 )? )
            {
            // InternalSecuritymodels.g:343:1: ( ( rule__SecurityModel__Group_2__0 )? )
            // InternalSecuritymodels.g:344:2: ( rule__SecurityModel__Group_2__0 )?
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_2()); 
            // InternalSecuritymodels.g:345:2: ( rule__SecurityModel__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSecuritymodels.g:345:3: rule__SecurityModel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecurityModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__2__Impl"


    // $ANTLR start "rule__SecurityModel__Group__3"
    // InternalSecuritymodels.g:353:1: rule__SecurityModel__Group__3 : rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4 ;
    public final void rule__SecurityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:357:1: ( rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4 )
            // InternalSecuritymodels.g:358:2: rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SecurityModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__3"


    // $ANTLR start "rule__SecurityModel__Group__3__Impl"
    // InternalSecuritymodels.g:365:1: rule__SecurityModel__Group__3__Impl : ( 'roles' ) ;
    public final void rule__SecurityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:369:1: ( ( 'roles' ) )
            // InternalSecuritymodels.g:370:1: ( 'roles' )
            {
            // InternalSecuritymodels.g:370:1: ( 'roles' )
            // InternalSecuritymodels.g:371:2: 'roles'
            {
             before(grammarAccess.getSecurityModelAccess().getRolesKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getRolesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__3__Impl"


    // $ANTLR start "rule__SecurityModel__Group__4"
    // InternalSecuritymodels.g:380:1: rule__SecurityModel__Group__4 : rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5 ;
    public final void rule__SecurityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:384:1: ( rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5 )
            // InternalSecuritymodels.g:385:2: rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__SecurityModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__4"


    // $ANTLR start "rule__SecurityModel__Group__4__Impl"
    // InternalSecuritymodels.g:392:1: rule__SecurityModel__Group__4__Impl : ( '{' ) ;
    public final void rule__SecurityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:396:1: ( ( '{' ) )
            // InternalSecuritymodels.g:397:1: ( '{' )
            {
            // InternalSecuritymodels.g:397:1: ( '{' )
            // InternalSecuritymodels.g:398:2: '{'
            {
             before(grammarAccess.getSecurityModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__4__Impl"


    // $ANTLR start "rule__SecurityModel__Group__5"
    // InternalSecuritymodels.g:407:1: rule__SecurityModel__Group__5 : rule__SecurityModel__Group__5__Impl rule__SecurityModel__Group__6 ;
    public final void rule__SecurityModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:411:1: ( rule__SecurityModel__Group__5__Impl rule__SecurityModel__Group__6 )
            // InternalSecuritymodels.g:412:2: rule__SecurityModel__Group__5__Impl rule__SecurityModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SecurityModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__5"


    // $ANTLR start "rule__SecurityModel__Group__5__Impl"
    // InternalSecuritymodels.g:419:1: rule__SecurityModel__Group__5__Impl : ( ( rule__SecurityModel__RolesAssignment_5 ) ) ;
    public final void rule__SecurityModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:423:1: ( ( ( rule__SecurityModel__RolesAssignment_5 ) ) )
            // InternalSecuritymodels.g:424:1: ( ( rule__SecurityModel__RolesAssignment_5 ) )
            {
            // InternalSecuritymodels.g:424:1: ( ( rule__SecurityModel__RolesAssignment_5 ) )
            // InternalSecuritymodels.g:425:2: ( rule__SecurityModel__RolesAssignment_5 )
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_5()); 
            // InternalSecuritymodels.g:426:2: ( rule__SecurityModel__RolesAssignment_5 )
            // InternalSecuritymodels.g:426:3: rule__SecurityModel__RolesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__RolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__5__Impl"


    // $ANTLR start "rule__SecurityModel__Group__6"
    // InternalSecuritymodels.g:434:1: rule__SecurityModel__Group__6 : rule__SecurityModel__Group__6__Impl rule__SecurityModel__Group__7 ;
    public final void rule__SecurityModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:438:1: ( rule__SecurityModel__Group__6__Impl rule__SecurityModel__Group__7 )
            // InternalSecuritymodels.g:439:2: rule__SecurityModel__Group__6__Impl rule__SecurityModel__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SecurityModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__6"


    // $ANTLR start "rule__SecurityModel__Group__6__Impl"
    // InternalSecuritymodels.g:446:1: rule__SecurityModel__Group__6__Impl : ( ( rule__SecurityModel__Group_6__0 )* ) ;
    public final void rule__SecurityModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:450:1: ( ( ( rule__SecurityModel__Group_6__0 )* ) )
            // InternalSecuritymodels.g:451:1: ( ( rule__SecurityModel__Group_6__0 )* )
            {
            // InternalSecuritymodels.g:451:1: ( ( rule__SecurityModel__Group_6__0 )* )
            // InternalSecuritymodels.g:452:2: ( rule__SecurityModel__Group_6__0 )*
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_6()); 
            // InternalSecuritymodels.g:453:2: ( rule__SecurityModel__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSecuritymodels.g:453:3: rule__SecurityModel__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SecurityModel__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__6__Impl"


    // $ANTLR start "rule__SecurityModel__Group__7"
    // InternalSecuritymodels.g:461:1: rule__SecurityModel__Group__7 : rule__SecurityModel__Group__7__Impl rule__SecurityModel__Group__8 ;
    public final void rule__SecurityModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:465:1: ( rule__SecurityModel__Group__7__Impl rule__SecurityModel__Group__8 )
            // InternalSecuritymodels.g:466:2: rule__SecurityModel__Group__7__Impl rule__SecurityModel__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__SecurityModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__7"


    // $ANTLR start "rule__SecurityModel__Group__7__Impl"
    // InternalSecuritymodels.g:473:1: rule__SecurityModel__Group__7__Impl : ( '}' ) ;
    public final void rule__SecurityModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:477:1: ( ( '}' ) )
            // InternalSecuritymodels.g:478:1: ( '}' )
            {
            // InternalSecuritymodels.g:478:1: ( '}' )
            // InternalSecuritymodels.g:479:2: '}'
            {
             before(grammarAccess.getSecurityModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__7__Impl"


    // $ANTLR start "rule__SecurityModel__Group__8"
    // InternalSecuritymodels.g:488:1: rule__SecurityModel__Group__8 : rule__SecurityModel__Group__8__Impl ;
    public final void rule__SecurityModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:492:1: ( rule__SecurityModel__Group__8__Impl )
            // InternalSecuritymodels.g:493:2: rule__SecurityModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__8"


    // $ANTLR start "rule__SecurityModel__Group__8__Impl"
    // InternalSecuritymodels.g:499:1: rule__SecurityModel__Group__8__Impl : ( ( rule__SecurityModel__Group_8__0 )? ) ;
    public final void rule__SecurityModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:503:1: ( ( ( rule__SecurityModel__Group_8__0 )? ) )
            // InternalSecuritymodels.g:504:1: ( ( rule__SecurityModel__Group_8__0 )? )
            {
            // InternalSecuritymodels.g:504:1: ( ( rule__SecurityModel__Group_8__0 )? )
            // InternalSecuritymodels.g:505:2: ( rule__SecurityModel__Group_8__0 )?
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_8()); 
            // InternalSecuritymodels.g:506:2: ( rule__SecurityModel__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecuritymodels.g:506:3: rule__SecurityModel__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecurityModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group__8__Impl"


    // $ANTLR start "rule__SecurityModel__Group_2__0"
    // InternalSecuritymodels.g:515:1: rule__SecurityModel__Group_2__0 : rule__SecurityModel__Group_2__0__Impl rule__SecurityModel__Group_2__1 ;
    public final void rule__SecurityModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:519:1: ( rule__SecurityModel__Group_2__0__Impl rule__SecurityModel__Group_2__1 )
            // InternalSecuritymodels.g:520:2: rule__SecurityModel__Group_2__0__Impl rule__SecurityModel__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SecurityModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2__0"


    // $ANTLR start "rule__SecurityModel__Group_2__0__Impl"
    // InternalSecuritymodels.g:527:1: rule__SecurityModel__Group_2__0__Impl : ( 'protect' ) ;
    public final void rule__SecurityModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:531:1: ( ( 'protect' ) )
            // InternalSecuritymodels.g:532:1: ( 'protect' )
            {
            // InternalSecuritymodels.g:532:1: ( 'protect' )
            // InternalSecuritymodels.g:533:2: 'protect'
            {
             before(grammarAccess.getSecurityModelAccess().getProtectKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getProtectKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_2__1"
    // InternalSecuritymodels.g:542:1: rule__SecurityModel__Group_2__1 : rule__SecurityModel__Group_2__1__Impl rule__SecurityModel__Group_2__2 ;
    public final void rule__SecurityModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:546:1: ( rule__SecurityModel__Group_2__1__Impl rule__SecurityModel__Group_2__2 )
            // InternalSecuritymodels.g:547:2: rule__SecurityModel__Group_2__1__Impl rule__SecurityModel__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__SecurityModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2__1"


    // $ANTLR start "rule__SecurityModel__Group_2__1__Impl"
    // InternalSecuritymodels.g:554:1: rule__SecurityModel__Group_2__1__Impl : ( ( rule__SecurityModel__ResourcesAssignment_2_1 ) ) ;
    public final void rule__SecurityModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:558:1: ( ( ( rule__SecurityModel__ResourcesAssignment_2_1 ) ) )
            // InternalSecuritymodels.g:559:1: ( ( rule__SecurityModel__ResourcesAssignment_2_1 ) )
            {
            // InternalSecuritymodels.g:559:1: ( ( rule__SecurityModel__ResourcesAssignment_2_1 ) )
            // InternalSecuritymodels.g:560:2: ( rule__SecurityModel__ResourcesAssignment_2_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_2_1()); 
            // InternalSecuritymodels.g:561:2: ( rule__SecurityModel__ResourcesAssignment_2_1 )
            // InternalSecuritymodels.g:561:3: rule__SecurityModel__ResourcesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__ResourcesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group_2__2"
    // InternalSecuritymodels.g:569:1: rule__SecurityModel__Group_2__2 : rule__SecurityModel__Group_2__2__Impl ;
    public final void rule__SecurityModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:573:1: ( rule__SecurityModel__Group_2__2__Impl )
            // InternalSecuritymodels.g:574:2: rule__SecurityModel__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2__2"


    // $ANTLR start "rule__SecurityModel__Group_2__2__Impl"
    // InternalSecuritymodels.g:580:1: rule__SecurityModel__Group_2__2__Impl : ( ( rule__SecurityModel__Group_2_2__0 )* ) ;
    public final void rule__SecurityModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:584:1: ( ( ( rule__SecurityModel__Group_2_2__0 )* ) )
            // InternalSecuritymodels.g:585:1: ( ( rule__SecurityModel__Group_2_2__0 )* )
            {
            // InternalSecuritymodels.g:585:1: ( ( rule__SecurityModel__Group_2_2__0 )* )
            // InternalSecuritymodels.g:586:2: ( rule__SecurityModel__Group_2_2__0 )*
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_2_2()); 
            // InternalSecuritymodels.g:587:2: ( rule__SecurityModel__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSecuritymodels.g:587:3: rule__SecurityModel__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SecurityModel__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2__2__Impl"


    // $ANTLR start "rule__SecurityModel__Group_2_2__0"
    // InternalSecuritymodels.g:596:1: rule__SecurityModel__Group_2_2__0 : rule__SecurityModel__Group_2_2__0__Impl rule__SecurityModel__Group_2_2__1 ;
    public final void rule__SecurityModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:600:1: ( rule__SecurityModel__Group_2_2__0__Impl rule__SecurityModel__Group_2_2__1 )
            // InternalSecuritymodels.g:601:2: rule__SecurityModel__Group_2_2__0__Impl rule__SecurityModel__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SecurityModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2_2__0"


    // $ANTLR start "rule__SecurityModel__Group_2_2__0__Impl"
    // InternalSecuritymodels.g:608:1: rule__SecurityModel__Group_2_2__0__Impl : ( 'protect' ) ;
    public final void rule__SecurityModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:612:1: ( ( 'protect' ) )
            // InternalSecuritymodels.g:613:1: ( 'protect' )
            {
            // InternalSecuritymodels.g:613:1: ( 'protect' )
            // InternalSecuritymodels.g:614:2: 'protect'
            {
             before(grammarAccess.getSecurityModelAccess().getProtectKeyword_2_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getProtectKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2_2__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_2_2__1"
    // InternalSecuritymodels.g:623:1: rule__SecurityModel__Group_2_2__1 : rule__SecurityModel__Group_2_2__1__Impl ;
    public final void rule__SecurityModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:627:1: ( rule__SecurityModel__Group_2_2__1__Impl )
            // InternalSecuritymodels.g:628:2: rule__SecurityModel__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2_2__1"


    // $ANTLR start "rule__SecurityModel__Group_2_2__1__Impl"
    // InternalSecuritymodels.g:634:1: rule__SecurityModel__Group_2_2__1__Impl : ( ( rule__SecurityModel__ResourcesAssignment_2_2_1 ) ) ;
    public final void rule__SecurityModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:638:1: ( ( ( rule__SecurityModel__ResourcesAssignment_2_2_1 ) ) )
            // InternalSecuritymodels.g:639:1: ( ( rule__SecurityModel__ResourcesAssignment_2_2_1 ) )
            {
            // InternalSecuritymodels.g:639:1: ( ( rule__SecurityModel__ResourcesAssignment_2_2_1 ) )
            // InternalSecuritymodels.g:640:2: ( rule__SecurityModel__ResourcesAssignment_2_2_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_2_2_1()); 
            // InternalSecuritymodels.g:641:2: ( rule__SecurityModel__ResourcesAssignment_2_2_1 )
            // InternalSecuritymodels.g:641:3: rule__SecurityModel__ResourcesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__ResourcesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_2_2__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group_6__0"
    // InternalSecuritymodels.g:650:1: rule__SecurityModel__Group_6__0 : rule__SecurityModel__Group_6__0__Impl rule__SecurityModel__Group_6__1 ;
    public final void rule__SecurityModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:654:1: ( rule__SecurityModel__Group_6__0__Impl rule__SecurityModel__Group_6__1 )
            // InternalSecuritymodels.g:655:2: rule__SecurityModel__Group_6__0__Impl rule__SecurityModel__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__SecurityModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_6__0"


    // $ANTLR start "rule__SecurityModel__Group_6__0__Impl"
    // InternalSecuritymodels.g:662:1: rule__SecurityModel__Group_6__0__Impl : ( ',' ) ;
    public final void rule__SecurityModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:666:1: ( ( ',' ) )
            // InternalSecuritymodels.g:667:1: ( ',' )
            {
            // InternalSecuritymodels.g:667:1: ( ',' )
            // InternalSecuritymodels.g:668:2: ','
            {
             before(grammarAccess.getSecurityModelAccess().getCommaKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_6__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_6__1"
    // InternalSecuritymodels.g:677:1: rule__SecurityModel__Group_6__1 : rule__SecurityModel__Group_6__1__Impl ;
    public final void rule__SecurityModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:681:1: ( rule__SecurityModel__Group_6__1__Impl )
            // InternalSecuritymodels.g:682:2: rule__SecurityModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_6__1"


    // $ANTLR start "rule__SecurityModel__Group_6__1__Impl"
    // InternalSecuritymodels.g:688:1: rule__SecurityModel__Group_6__1__Impl : ( ( rule__SecurityModel__RolesAssignment_6_1 ) ) ;
    public final void rule__SecurityModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:692:1: ( ( ( rule__SecurityModel__RolesAssignment_6_1 ) ) )
            // InternalSecuritymodels.g:693:1: ( ( rule__SecurityModel__RolesAssignment_6_1 ) )
            {
            // InternalSecuritymodels.g:693:1: ( ( rule__SecurityModel__RolesAssignment_6_1 ) )
            // InternalSecuritymodels.g:694:2: ( rule__SecurityModel__RolesAssignment_6_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_6_1()); 
            // InternalSecuritymodels.g:695:2: ( rule__SecurityModel__RolesAssignment_6_1 )
            // InternalSecuritymodels.g:695:3: rule__SecurityModel__RolesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__RolesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_6__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__0"
    // InternalSecuritymodels.g:704:1: rule__SecurityModel__Group_8__0 : rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1 ;
    public final void rule__SecurityModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:708:1: ( rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1 )
            // InternalSecuritymodels.g:709:2: rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__SecurityModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__0"


    // $ANTLR start "rule__SecurityModel__Group_8__0__Impl"
    // InternalSecuritymodels.g:716:1: rule__SecurityModel__Group_8__0__Impl : ( 'rules' ) ;
    public final void rule__SecurityModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:720:1: ( ( 'rules' ) )
            // InternalSecuritymodels.g:721:1: ( 'rules' )
            {
            // InternalSecuritymodels.g:721:1: ( 'rules' )
            // InternalSecuritymodels.g:722:2: 'rules'
            {
             before(grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__1"
    // InternalSecuritymodels.g:731:1: rule__SecurityModel__Group_8__1 : rule__SecurityModel__Group_8__1__Impl rule__SecurityModel__Group_8__2 ;
    public final void rule__SecurityModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:735:1: ( rule__SecurityModel__Group_8__1__Impl rule__SecurityModel__Group_8__2 )
            // InternalSecuritymodels.g:736:2: rule__SecurityModel__Group_8__1__Impl rule__SecurityModel__Group_8__2
            {
            pushFollow(FOLLOW_11);
            rule__SecurityModel__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__1"


    // $ANTLR start "rule__SecurityModel__Group_8__1__Impl"
    // InternalSecuritymodels.g:743:1: rule__SecurityModel__Group_8__1__Impl : ( '{' ) ;
    public final void rule__SecurityModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:747:1: ( ( '{' ) )
            // InternalSecuritymodels.g:748:1: ( '{' )
            {
            // InternalSecuritymodels.g:748:1: ( '{' )
            // InternalSecuritymodels.g:749:2: '{'
            {
             before(grammarAccess.getSecurityModelAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__2"
    // InternalSecuritymodels.g:758:1: rule__SecurityModel__Group_8__2 : rule__SecurityModel__Group_8__2__Impl rule__SecurityModel__Group_8__3 ;
    public final void rule__SecurityModel__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:762:1: ( rule__SecurityModel__Group_8__2__Impl rule__SecurityModel__Group_8__3 )
            // InternalSecuritymodels.g:763:2: rule__SecurityModel__Group_8__2__Impl rule__SecurityModel__Group_8__3
            {
            pushFollow(FOLLOW_6);
            rule__SecurityModel__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__2"


    // $ANTLR start "rule__SecurityModel__Group_8__2__Impl"
    // InternalSecuritymodels.g:770:1: rule__SecurityModel__Group_8__2__Impl : ( ( rule__SecurityModel__RulesAssignment_8_2 ) ) ;
    public final void rule__SecurityModel__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:774:1: ( ( ( rule__SecurityModel__RulesAssignment_8_2 ) ) )
            // InternalSecuritymodels.g:775:1: ( ( rule__SecurityModel__RulesAssignment_8_2 ) )
            {
            // InternalSecuritymodels.g:775:1: ( ( rule__SecurityModel__RulesAssignment_8_2 ) )
            // InternalSecuritymodels.g:776:2: ( rule__SecurityModel__RulesAssignment_8_2 )
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_2()); 
            // InternalSecuritymodels.g:777:2: ( rule__SecurityModel__RulesAssignment_8_2 )
            // InternalSecuritymodels.g:777:3: rule__SecurityModel__RulesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__RulesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__2__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__3"
    // InternalSecuritymodels.g:785:1: rule__SecurityModel__Group_8__3 : rule__SecurityModel__Group_8__3__Impl rule__SecurityModel__Group_8__4 ;
    public final void rule__SecurityModel__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:789:1: ( rule__SecurityModel__Group_8__3__Impl rule__SecurityModel__Group_8__4 )
            // InternalSecuritymodels.g:790:2: rule__SecurityModel__Group_8__3__Impl rule__SecurityModel__Group_8__4
            {
            pushFollow(FOLLOW_6);
            rule__SecurityModel__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__3"


    // $ANTLR start "rule__SecurityModel__Group_8__3__Impl"
    // InternalSecuritymodels.g:797:1: rule__SecurityModel__Group_8__3__Impl : ( ( rule__SecurityModel__Group_8_3__0 )* ) ;
    public final void rule__SecurityModel__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:801:1: ( ( ( rule__SecurityModel__Group_8_3__0 )* ) )
            // InternalSecuritymodels.g:802:1: ( ( rule__SecurityModel__Group_8_3__0 )* )
            {
            // InternalSecuritymodels.g:802:1: ( ( rule__SecurityModel__Group_8_3__0 )* )
            // InternalSecuritymodels.g:803:2: ( rule__SecurityModel__Group_8_3__0 )*
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_8_3()); 
            // InternalSecuritymodels.g:804:2: ( rule__SecurityModel__Group_8_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSecuritymodels.g:804:3: rule__SecurityModel__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SecurityModel__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__3__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__4"
    // InternalSecuritymodels.g:812:1: rule__SecurityModel__Group_8__4 : rule__SecurityModel__Group_8__4__Impl ;
    public final void rule__SecurityModel__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:816:1: ( rule__SecurityModel__Group_8__4__Impl )
            // InternalSecuritymodels.g:817:2: rule__SecurityModel__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__4"


    // $ANTLR start "rule__SecurityModel__Group_8__4__Impl"
    // InternalSecuritymodels.g:823:1: rule__SecurityModel__Group_8__4__Impl : ( '}' ) ;
    public final void rule__SecurityModel__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:827:1: ( ( '}' ) )
            // InternalSecuritymodels.g:828:1: ( '}' )
            {
            // InternalSecuritymodels.g:828:1: ( '}' )
            // InternalSecuritymodels.g:829:2: '}'
            {
             before(grammarAccess.getSecurityModelAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8__4__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8_3__0"
    // InternalSecuritymodels.g:839:1: rule__SecurityModel__Group_8_3__0 : rule__SecurityModel__Group_8_3__0__Impl rule__SecurityModel__Group_8_3__1 ;
    public final void rule__SecurityModel__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:843:1: ( rule__SecurityModel__Group_8_3__0__Impl rule__SecurityModel__Group_8_3__1 )
            // InternalSecuritymodels.g:844:2: rule__SecurityModel__Group_8_3__0__Impl rule__SecurityModel__Group_8_3__1
            {
            pushFollow(FOLLOW_11);
            rule__SecurityModel__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8_3__0"


    // $ANTLR start "rule__SecurityModel__Group_8_3__0__Impl"
    // InternalSecuritymodels.g:851:1: rule__SecurityModel__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__SecurityModel__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:855:1: ( ( ',' ) )
            // InternalSecuritymodels.g:856:1: ( ',' )
            {
            // InternalSecuritymodels.g:856:1: ( ',' )
            // InternalSecuritymodels.g:857:2: ','
            {
             before(grammarAccess.getSecurityModelAccess().getCommaKeyword_8_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8_3__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8_3__1"
    // InternalSecuritymodels.g:866:1: rule__SecurityModel__Group_8_3__1 : rule__SecurityModel__Group_8_3__1__Impl ;
    public final void rule__SecurityModel__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:870:1: ( rule__SecurityModel__Group_8_3__1__Impl )
            // InternalSecuritymodels.g:871:2: rule__SecurityModel__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8_3__1"


    // $ANTLR start "rule__SecurityModel__Group_8_3__1__Impl"
    // InternalSecuritymodels.g:877:1: rule__SecurityModel__Group_8_3__1__Impl : ( ( rule__SecurityModel__RulesAssignment_8_3_1 ) ) ;
    public final void rule__SecurityModel__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:881:1: ( ( ( rule__SecurityModel__RulesAssignment_8_3_1 ) ) )
            // InternalSecuritymodels.g:882:1: ( ( rule__SecurityModel__RulesAssignment_8_3_1 ) )
            {
            // InternalSecuritymodels.g:882:1: ( ( rule__SecurityModel__RulesAssignment_8_3_1 ) )
            // InternalSecuritymodels.g:883:2: ( rule__SecurityModel__RulesAssignment_8_3_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_3_1()); 
            // InternalSecuritymodels.g:884:2: ( rule__SecurityModel__RulesAssignment_8_3_1 )
            // InternalSecuritymodels.g:884:3: rule__SecurityModel__RulesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__RulesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__Group_8_3__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalSecuritymodels.g:893:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:897:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSecuritymodels.g:898:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalSecuritymodels.g:905:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:909:1: ( ( 'Rule' ) )
            // InternalSecuritymodels.g:910:1: ( 'Rule' )
            {
            // InternalSecuritymodels.g:910:1: ( 'Rule' )
            // InternalSecuritymodels.g:911:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalSecuritymodels.g:920:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:924:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSecuritymodels.g:925:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalSecuritymodels.g:932:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:936:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalSecuritymodels.g:937:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalSecuritymodels.g:937:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalSecuritymodels.g:938:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalSecuritymodels.g:939:2: ( rule__Rule__NameAssignment_1 )
            // InternalSecuritymodels.g:939:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalSecuritymodels.g:947:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:951:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSecuritymodels.g:952:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalSecuritymodels.g:959:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:963:1: ( ( '{' ) )
            // InternalSecuritymodels.g:964:1: ( '{' )
            {
            // InternalSecuritymodels.g:964:1: ( '{' )
            // InternalSecuritymodels.g:965:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalSecuritymodels.g:974:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:978:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSecuritymodels.g:979:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalSecuritymodels.g:986:1: rule__Rule__Group__3__Impl : ( 'action' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:990:1: ( ( 'action' ) )
            // InternalSecuritymodels.g:991:1: ( 'action' )
            {
            // InternalSecuritymodels.g:991:1: ( 'action' )
            // InternalSecuritymodels.g:992:2: 'action'
            {
             before(grammarAccess.getRuleAccess().getActionKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getActionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalSecuritymodels.g:1001:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1005:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSecuritymodels.g:1006:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalSecuritymodels.g:1013:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ActionAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1017:1: ( ( ( rule__Rule__ActionAssignment_4 ) ) )
            // InternalSecuritymodels.g:1018:1: ( ( rule__Rule__ActionAssignment_4 ) )
            {
            // InternalSecuritymodels.g:1018:1: ( ( rule__Rule__ActionAssignment_4 ) )
            // InternalSecuritymodels.g:1019:2: ( rule__Rule__ActionAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_4()); 
            // InternalSecuritymodels.g:1020:2: ( rule__Rule__ActionAssignment_4 )
            // InternalSecuritymodels.g:1020:3: rule__Rule__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalSecuritymodels.g:1028:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1032:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalSecuritymodels.g:1033:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalSecuritymodels.g:1040:1: rule__Rule__Group__5__Impl : ( '(' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1044:1: ( ( '(' ) )
            // InternalSecuritymodels.g:1045:1: ( '(' )
            {
            // InternalSecuritymodels.g:1045:1: ( '(' )
            // InternalSecuritymodels.g:1046:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalSecuritymodels.g:1055:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1059:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalSecuritymodels.g:1060:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalSecuritymodels.g:1067:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ProtectedResourcesAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1071:1: ( ( ( rule__Rule__ProtectedResourcesAssignment_6 ) ) )
            // InternalSecuritymodels.g:1072:1: ( ( rule__Rule__ProtectedResourcesAssignment_6 ) )
            {
            // InternalSecuritymodels.g:1072:1: ( ( rule__Rule__ProtectedResourcesAssignment_6 ) )
            // InternalSecuritymodels.g:1073:2: ( rule__Rule__ProtectedResourcesAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getProtectedResourcesAssignment_6()); 
            // InternalSecuritymodels.g:1074:2: ( rule__Rule__ProtectedResourcesAssignment_6 )
            // InternalSecuritymodels.g:1074:3: rule__Rule__ProtectedResourcesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ProtectedResourcesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getProtectedResourcesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalSecuritymodels.g:1082:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1086:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalSecuritymodels.g:1087:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalSecuritymodels.g:1094:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )* ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1098:1: ( ( ( rule__Rule__Group_7__0 )* ) )
            // InternalSecuritymodels.g:1099:1: ( ( rule__Rule__Group_7__0 )* )
            {
            // InternalSecuritymodels.g:1099:1: ( ( rule__Rule__Group_7__0 )* )
            // InternalSecuritymodels.g:1100:2: ( rule__Rule__Group_7__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7()); 
            // InternalSecuritymodels.g:1101:2: ( rule__Rule__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecuritymodels.g:1101:3: rule__Rule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Rule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalSecuritymodels.g:1109:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1113:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalSecuritymodels.g:1114:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalSecuritymodels.g:1121:1: rule__Rule__Group__8__Impl : ( ')' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1125:1: ( ( ')' ) )
            // InternalSecuritymodels.g:1126:1: ( ')' )
            {
            // InternalSecuritymodels.g:1126:1: ( ')' )
            // InternalSecuritymodels.g:1127:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalSecuritymodels.g:1136:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1140:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalSecuritymodels.g:1141:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalSecuritymodels.g:1148:1: rule__Rule__Group__9__Impl : ( 'auths' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1152:1: ( ( 'auths' ) )
            // InternalSecuritymodels.g:1153:1: ( 'auths' )
            {
            // InternalSecuritymodels.g:1153:1: ( 'auths' )
            // InternalSecuritymodels.g:1154:2: 'auths'
            {
             before(grammarAccess.getRuleAccess().getAuthsKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAuthsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalSecuritymodels.g:1163:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1167:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalSecuritymodels.g:1168:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalSecuritymodels.g:1175:1: rule__Rule__Group__10__Impl : ( '{' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1179:1: ( ( '{' ) )
            // InternalSecuritymodels.g:1180:1: ( '{' )
            {
            // InternalSecuritymodels.g:1180:1: ( '{' )
            // InternalSecuritymodels.g:1181:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__11"
    // InternalSecuritymodels.g:1190:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1194:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalSecuritymodels.g:1195:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__11"


    // $ANTLR start "rule__Rule__Group__11__Impl"
    // InternalSecuritymodels.g:1202:1: rule__Rule__Group__11__Impl : ( ( rule__Rule__AuthsAssignment_11 ) ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1206:1: ( ( ( rule__Rule__AuthsAssignment_11 ) ) )
            // InternalSecuritymodels.g:1207:1: ( ( rule__Rule__AuthsAssignment_11 ) )
            {
            // InternalSecuritymodels.g:1207:1: ( ( rule__Rule__AuthsAssignment_11 ) )
            // InternalSecuritymodels.g:1208:2: ( rule__Rule__AuthsAssignment_11 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_11()); 
            // InternalSecuritymodels.g:1209:2: ( rule__Rule__AuthsAssignment_11 )
            // InternalSecuritymodels.g:1209:3: rule__Rule__AuthsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AuthsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuthsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__12"
    // InternalSecuritymodels.g:1217:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1221:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalSecuritymodels.g:1222:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__12"


    // $ANTLR start "rule__Rule__Group__12__Impl"
    // InternalSecuritymodels.g:1229:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__Group_12__0 )* ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1233:1: ( ( ( rule__Rule__Group_12__0 )* ) )
            // InternalSecuritymodels.g:1234:1: ( ( rule__Rule__Group_12__0 )* )
            {
            // InternalSecuritymodels.g:1234:1: ( ( rule__Rule__Group_12__0 )* )
            // InternalSecuritymodels.g:1235:2: ( rule__Rule__Group_12__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_12()); 
            // InternalSecuritymodels.g:1236:2: ( rule__Rule__Group_12__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecuritymodels.g:1236:3: rule__Rule__Group_12__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Rule__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__12__Impl"


    // $ANTLR start "rule__Rule__Group__13"
    // InternalSecuritymodels.g:1244:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1248:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalSecuritymodels.g:1249:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__13"


    // $ANTLR start "rule__Rule__Group__13__Impl"
    // InternalSecuritymodels.g:1256:1: rule__Rule__Group__13__Impl : ( '}' ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1260:1: ( ( '}' ) )
            // InternalSecuritymodels.g:1261:1: ( '}' )
            {
            // InternalSecuritymodels.g:1261:1: ( '}' )
            // InternalSecuritymodels.g:1262:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__13__Impl"


    // $ANTLR start "rule__Rule__Group__14"
    // InternalSecuritymodels.g:1271:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1275:1: ( rule__Rule__Group__14__Impl )
            // InternalSecuritymodels.g:1276:2: rule__Rule__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__14"


    // $ANTLR start "rule__Rule__Group__14__Impl"
    // InternalSecuritymodels.g:1282:1: rule__Rule__Group__14__Impl : ( '}' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1286:1: ( ( '}' ) )
            // InternalSecuritymodels.g:1287:1: ( '}' )
            {
            // InternalSecuritymodels.g:1287:1: ( '}' )
            // InternalSecuritymodels.g:1288:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__14__Impl"


    // $ANTLR start "rule__Rule__Group_7__0"
    // InternalSecuritymodels.g:1298:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1302:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalSecuritymodels.g:1303:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0"


    // $ANTLR start "rule__Rule__Group_7__0__Impl"
    // InternalSecuritymodels.g:1310:1: rule__Rule__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1314:1: ( ( ',' ) )
            // InternalSecuritymodels.g:1315:1: ( ',' )
            {
            // InternalSecuritymodels.g:1315:1: ( ',' )
            // InternalSecuritymodels.g:1316:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0__Impl"


    // $ANTLR start "rule__Rule__Group_7__1"
    // InternalSecuritymodels.g:1325:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1329:1: ( rule__Rule__Group_7__1__Impl )
            // InternalSecuritymodels.g:1330:2: rule__Rule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1"


    // $ANTLR start "rule__Rule__Group_7__1__Impl"
    // InternalSecuritymodels.g:1336:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__ProtectedResourcesAssignment_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1340:1: ( ( ( rule__Rule__ProtectedResourcesAssignment_7_1 ) ) )
            // InternalSecuritymodels.g:1341:1: ( ( rule__Rule__ProtectedResourcesAssignment_7_1 ) )
            {
            // InternalSecuritymodels.g:1341:1: ( ( rule__Rule__ProtectedResourcesAssignment_7_1 ) )
            // InternalSecuritymodels.g:1342:2: ( rule__Rule__ProtectedResourcesAssignment_7_1 )
            {
             before(grammarAccess.getRuleAccess().getProtectedResourcesAssignment_7_1()); 
            // InternalSecuritymodels.g:1343:2: ( rule__Rule__ProtectedResourcesAssignment_7_1 )
            // InternalSecuritymodels.g:1343:3: rule__Rule__ProtectedResourcesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ProtectedResourcesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getProtectedResourcesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1__Impl"


    // $ANTLR start "rule__Rule__Group_12__0"
    // InternalSecuritymodels.g:1352:1: rule__Rule__Group_12__0 : rule__Rule__Group_12__0__Impl rule__Rule__Group_12__1 ;
    public final void rule__Rule__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1356:1: ( rule__Rule__Group_12__0__Impl rule__Rule__Group_12__1 )
            // InternalSecuritymodels.g:1357:2: rule__Rule__Group_12__0__Impl rule__Rule__Group_12__1
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_12__0"


    // $ANTLR start "rule__Rule__Group_12__0__Impl"
    // InternalSecuritymodels.g:1364:1: rule__Rule__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1368:1: ( ( ',' ) )
            // InternalSecuritymodels.g:1369:1: ( ',' )
            {
            // InternalSecuritymodels.g:1369:1: ( ',' )
            // InternalSecuritymodels.g:1370:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_12_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_12__0__Impl"


    // $ANTLR start "rule__Rule__Group_12__1"
    // InternalSecuritymodels.g:1379:1: rule__Rule__Group_12__1 : rule__Rule__Group_12__1__Impl ;
    public final void rule__Rule__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1383:1: ( rule__Rule__Group_12__1__Impl )
            // InternalSecuritymodels.g:1384:2: rule__Rule__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_12__1"


    // $ANTLR start "rule__Rule__Group_12__1__Impl"
    // InternalSecuritymodels.g:1390:1: rule__Rule__Group_12__1__Impl : ( ( rule__Rule__AuthsAssignment_12_1 ) ) ;
    public final void rule__Rule__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1394:1: ( ( ( rule__Rule__AuthsAssignment_12_1 ) ) )
            // InternalSecuritymodels.g:1395:1: ( ( rule__Rule__AuthsAssignment_12_1 ) )
            {
            // InternalSecuritymodels.g:1395:1: ( ( rule__Rule__AuthsAssignment_12_1 ) )
            // InternalSecuritymodels.g:1396:2: ( rule__Rule__AuthsAssignment_12_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_12_1()); 
            // InternalSecuritymodels.g:1397:2: ( rule__Rule__AuthsAssignment_12_1 )
            // InternalSecuritymodels.g:1397:3: rule__Rule__AuthsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AuthsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuthsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_12__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecuritymodels.g:1406:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1410:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecuritymodels.g:1411:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalSecuritymodels.g:1418:1: rule__Role__Group__0__Impl : ( ( rule__Role__NameAssignment_0 ) ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1422:1: ( ( ( rule__Role__NameAssignment_0 ) ) )
            // InternalSecuritymodels.g:1423:1: ( ( rule__Role__NameAssignment_0 ) )
            {
            // InternalSecuritymodels.g:1423:1: ( ( rule__Role__NameAssignment_0 ) )
            // InternalSecuritymodels.g:1424:2: ( rule__Role__NameAssignment_0 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_0()); 
            // InternalSecuritymodels.g:1425:2: ( rule__Role__NameAssignment_0 )
            // InternalSecuritymodels.g:1425:3: rule__Role__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalSecuritymodels.g:1433:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1437:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecuritymodels.g:1438:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalSecuritymodels.g:1445:1: rule__Role__Group__1__Impl : ( '<-' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1449:1: ( ( '<-' ) )
            // InternalSecuritymodels.g:1450:1: ( '<-' )
            {
            // InternalSecuritymodels.g:1450:1: ( '<-' )
            // InternalSecuritymodels.g:1451:2: '<-'
            {
             before(grammarAccess.getRoleAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLessThanSignHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalSecuritymodels.g:1460:1: rule__Role__Group__2 : rule__Role__Group__2__Impl ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1464:1: ( rule__Role__Group__2__Impl )
            // InternalSecuritymodels.g:1465:2: rule__Role__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalSecuritymodels.g:1471:1: rule__Role__Group__2__Impl : ( ( rule__Role__UserEntityAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1475:1: ( ( ( rule__Role__UserEntityAssignment_2 ) ) )
            // InternalSecuritymodels.g:1476:1: ( ( rule__Role__UserEntityAssignment_2 ) )
            {
            // InternalSecuritymodels.g:1476:1: ( ( rule__Role__UserEntityAssignment_2 ) )
            // InternalSecuritymodels.g:1477:2: ( rule__Role__UserEntityAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getUserEntityAssignment_2()); 
            // InternalSecuritymodels.g:1478:2: ( rule__Role__UserEntityAssignment_2 )
            // InternalSecuritymodels.g:1478:3: rule__Role__UserEntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__UserEntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getUserEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__ProtectedResource__Group__0"
    // InternalSecuritymodels.g:1487:1: rule__ProtectedResource__Group__0 : rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1 ;
    public final void rule__ProtectedResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1491:1: ( rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1 )
            // InternalSecuritymodels.g:1492:2: rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ProtectedResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__Group__0"


    // $ANTLR start "rule__ProtectedResource__Group__0__Impl"
    // InternalSecuritymodels.g:1499:1: rule__ProtectedResource__Group__0__Impl : ( ( rule__ProtectedResource__PropertyAssignment_0 ) ) ;
    public final void rule__ProtectedResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1503:1: ( ( ( rule__ProtectedResource__PropertyAssignment_0 ) ) )
            // InternalSecuritymodels.g:1504:1: ( ( rule__ProtectedResource__PropertyAssignment_0 ) )
            {
            // InternalSecuritymodels.g:1504:1: ( ( rule__ProtectedResource__PropertyAssignment_0 ) )
            // InternalSecuritymodels.g:1505:2: ( rule__ProtectedResource__PropertyAssignment_0 )
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_0()); 
            // InternalSecuritymodels.g:1506:2: ( rule__ProtectedResource__PropertyAssignment_0 )
            // InternalSecuritymodels.g:1506:3: rule__ProtectedResource__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__Group__0__Impl"


    // $ANTLR start "rule__ProtectedResource__Group__1"
    // InternalSecuritymodels.g:1514:1: rule__ProtectedResource__Group__1 : rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2 ;
    public final void rule__ProtectedResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1518:1: ( rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2 )
            // InternalSecuritymodels.g:1519:2: rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ProtectedResource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__Group__1"


    // $ANTLR start "rule__ProtectedResource__Group__1__Impl"
    // InternalSecuritymodels.g:1526:1: rule__ProtectedResource__Group__1__Impl : ( 'as' ) ;
    public final void rule__ProtectedResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1530:1: ( ( 'as' ) )
            // InternalSecuritymodels.g:1531:1: ( 'as' )
            {
            // InternalSecuritymodels.g:1531:1: ( 'as' )
            // InternalSecuritymodels.g:1532:2: 'as'
            {
             before(grammarAccess.getProtectedResourceAccess().getAsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProtectedResourceAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__Group__1__Impl"


    // $ANTLR start "rule__ProtectedResource__Group__2"
    // InternalSecuritymodels.g:1541:1: rule__ProtectedResource__Group__2 : rule__ProtectedResource__Group__2__Impl ;
    public final void rule__ProtectedResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1545:1: ( rule__ProtectedResource__Group__2__Impl )
            // InternalSecuritymodels.g:1546:2: rule__ProtectedResource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__Group__2"


    // $ANTLR start "rule__ProtectedResource__Group__2__Impl"
    // InternalSecuritymodels.g:1552:1: rule__ProtectedResource__Group__2__Impl : ( ( rule__ProtectedResource__NameAssignment_2 ) ) ;
    public final void rule__ProtectedResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1556:1: ( ( ( rule__ProtectedResource__NameAssignment_2 ) ) )
            // InternalSecuritymodels.g:1557:1: ( ( rule__ProtectedResource__NameAssignment_2 ) )
            {
            // InternalSecuritymodels.g:1557:1: ( ( rule__ProtectedResource__NameAssignment_2 ) )
            // InternalSecuritymodels.g:1558:2: ( rule__ProtectedResource__NameAssignment_2 )
            {
             before(grammarAccess.getProtectedResourceAccess().getNameAssignment_2()); 
            // InternalSecuritymodels.g:1559:2: ( rule__ProtectedResource__NameAssignment_2 )
            // InternalSecuritymodels.g:1559:3: rule__ProtectedResource__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProtectedResourceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__Group__2__Impl"


    // $ANTLR start "rule__Auth__Group__0"
    // InternalSecuritymodels.g:1568:1: rule__Auth__Group__0 : rule__Auth__Group__0__Impl rule__Auth__Group__1 ;
    public final void rule__Auth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1572:1: ( rule__Auth__Group__0__Impl rule__Auth__Group__1 )
            // InternalSecuritymodels.g:1573:2: rule__Auth__Group__0__Impl rule__Auth__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Auth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__0"


    // $ANTLR start "rule__Auth__Group__0__Impl"
    // InternalSecuritymodels.g:1580:1: rule__Auth__Group__0__Impl : ( 'roles' ) ;
    public final void rule__Auth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1584:1: ( ( 'roles' ) )
            // InternalSecuritymodels.g:1585:1: ( 'roles' )
            {
            // InternalSecuritymodels.g:1585:1: ( 'roles' )
            // InternalSecuritymodels.g:1586:2: 'roles'
            {
             before(grammarAccess.getAuthAccess().getRolesKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getRolesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__0__Impl"


    // $ANTLR start "rule__Auth__Group__1"
    // InternalSecuritymodels.g:1595:1: rule__Auth__Group__1 : rule__Auth__Group__1__Impl rule__Auth__Group__2 ;
    public final void rule__Auth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1599:1: ( rule__Auth__Group__1__Impl rule__Auth__Group__2 )
            // InternalSecuritymodels.g:1600:2: rule__Auth__Group__1__Impl rule__Auth__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Auth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__1"


    // $ANTLR start "rule__Auth__Group__1__Impl"
    // InternalSecuritymodels.g:1607:1: rule__Auth__Group__1__Impl : ( '(' ) ;
    public final void rule__Auth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1611:1: ( ( '(' ) )
            // InternalSecuritymodels.g:1612:1: ( '(' )
            {
            // InternalSecuritymodels.g:1612:1: ( '(' )
            // InternalSecuritymodels.g:1613:2: '('
            {
             before(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__1__Impl"


    // $ANTLR start "rule__Auth__Group__2"
    // InternalSecuritymodels.g:1622:1: rule__Auth__Group__2 : rule__Auth__Group__2__Impl rule__Auth__Group__3 ;
    public final void rule__Auth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1626:1: ( rule__Auth__Group__2__Impl rule__Auth__Group__3 )
            // InternalSecuritymodels.g:1627:2: rule__Auth__Group__2__Impl rule__Auth__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Auth__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__2"


    // $ANTLR start "rule__Auth__Group__2__Impl"
    // InternalSecuritymodels.g:1634:1: rule__Auth__Group__2__Impl : ( ( rule__Auth__RolesAssignment_2 ) ) ;
    public final void rule__Auth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1638:1: ( ( ( rule__Auth__RolesAssignment_2 ) ) )
            // InternalSecuritymodels.g:1639:1: ( ( rule__Auth__RolesAssignment_2 ) )
            {
            // InternalSecuritymodels.g:1639:1: ( ( rule__Auth__RolesAssignment_2 ) )
            // InternalSecuritymodels.g:1640:2: ( rule__Auth__RolesAssignment_2 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_2()); 
            // InternalSecuritymodels.g:1641:2: ( rule__Auth__RolesAssignment_2 )
            // InternalSecuritymodels.g:1641:3: rule__Auth__RolesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Auth__RolesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getRolesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__2__Impl"


    // $ANTLR start "rule__Auth__Group__3"
    // InternalSecuritymodels.g:1649:1: rule__Auth__Group__3 : rule__Auth__Group__3__Impl rule__Auth__Group__4 ;
    public final void rule__Auth__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1653:1: ( rule__Auth__Group__3__Impl rule__Auth__Group__4 )
            // InternalSecuritymodels.g:1654:2: rule__Auth__Group__3__Impl rule__Auth__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Auth__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__3"


    // $ANTLR start "rule__Auth__Group__3__Impl"
    // InternalSecuritymodels.g:1661:1: rule__Auth__Group__3__Impl : ( ( rule__Auth__Group_3__0 )* ) ;
    public final void rule__Auth__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1665:1: ( ( ( rule__Auth__Group_3__0 )* ) )
            // InternalSecuritymodels.g:1666:1: ( ( rule__Auth__Group_3__0 )* )
            {
            // InternalSecuritymodels.g:1666:1: ( ( rule__Auth__Group_3__0 )* )
            // InternalSecuritymodels.g:1667:2: ( rule__Auth__Group_3__0 )*
            {
             before(grammarAccess.getAuthAccess().getGroup_3()); 
            // InternalSecuritymodels.g:1668:2: ( rule__Auth__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSecuritymodels.g:1668:3: rule__Auth__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Auth__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAuthAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__3__Impl"


    // $ANTLR start "rule__Auth__Group__4"
    // InternalSecuritymodels.g:1676:1: rule__Auth__Group__4 : rule__Auth__Group__4__Impl rule__Auth__Group__5 ;
    public final void rule__Auth__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1680:1: ( rule__Auth__Group__4__Impl rule__Auth__Group__5 )
            // InternalSecuritymodels.g:1681:2: rule__Auth__Group__4__Impl rule__Auth__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Auth__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__4"


    // $ANTLR start "rule__Auth__Group__4__Impl"
    // InternalSecuritymodels.g:1688:1: rule__Auth__Group__4__Impl : ( ')' ) ;
    public final void rule__Auth__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1692:1: ( ( ')' ) )
            // InternalSecuritymodels.g:1693:1: ( ')' )
            {
            // InternalSecuritymodels.g:1693:1: ( ')' )
            // InternalSecuritymodels.g:1694:2: ')'
            {
             before(grammarAccess.getAuthAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__4__Impl"


    // $ANTLR start "rule__Auth__Group__5"
    // InternalSecuritymodels.g:1703:1: rule__Auth__Group__5 : rule__Auth__Group__5__Impl rule__Auth__Group__6 ;
    public final void rule__Auth__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1707:1: ( rule__Auth__Group__5__Impl rule__Auth__Group__6 )
            // InternalSecuritymodels.g:1708:2: rule__Auth__Group__5__Impl rule__Auth__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Auth__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__5"


    // $ANTLR start "rule__Auth__Group__5__Impl"
    // InternalSecuritymodels.g:1715:1: rule__Auth__Group__5__Impl : ( 'condition:' ) ;
    public final void rule__Auth__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1719:1: ( ( 'condition:' ) )
            // InternalSecuritymodels.g:1720:1: ( 'condition:' )
            {
            // InternalSecuritymodels.g:1720:1: ( 'condition:' )
            // InternalSecuritymodels.g:1721:2: 'condition:'
            {
             before(grammarAccess.getAuthAccess().getConditionKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getConditionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__5__Impl"


    // $ANTLR start "rule__Auth__Group__6"
    // InternalSecuritymodels.g:1730:1: rule__Auth__Group__6 : rule__Auth__Group__6__Impl rule__Auth__Group__7 ;
    public final void rule__Auth__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1734:1: ( rule__Auth__Group__6__Impl rule__Auth__Group__7 )
            // InternalSecuritymodels.g:1735:2: rule__Auth__Group__6__Impl rule__Auth__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Auth__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__6"


    // $ANTLR start "rule__Auth__Group__6__Impl"
    // InternalSecuritymodels.g:1742:1: rule__Auth__Group__6__Impl : ( '{' ) ;
    public final void rule__Auth__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1746:1: ( ( '{' ) )
            // InternalSecuritymodels.g:1747:1: ( '{' )
            {
            // InternalSecuritymodels.g:1747:1: ( '{' )
            // InternalSecuritymodels.g:1748:2: '{'
            {
             before(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__6__Impl"


    // $ANTLR start "rule__Auth__Group__7"
    // InternalSecuritymodels.g:1757:1: rule__Auth__Group__7 : rule__Auth__Group__7__Impl rule__Auth__Group__8 ;
    public final void rule__Auth__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1761:1: ( rule__Auth__Group__7__Impl rule__Auth__Group__8 )
            // InternalSecuritymodels.g:1762:2: rule__Auth__Group__7__Impl rule__Auth__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Auth__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__7"


    // $ANTLR start "rule__Auth__Group__7__Impl"
    // InternalSecuritymodels.g:1769:1: rule__Auth__Group__7__Impl : ( 'textual' ) ;
    public final void rule__Auth__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1773:1: ( ( 'textual' ) )
            // InternalSecuritymodels.g:1774:1: ( 'textual' )
            {
            // InternalSecuritymodels.g:1774:1: ( 'textual' )
            // InternalSecuritymodels.g:1775:2: 'textual'
            {
             before(grammarAccess.getAuthAccess().getTextualKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getTextualKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__7__Impl"


    // $ANTLR start "rule__Auth__Group__8"
    // InternalSecuritymodels.g:1784:1: rule__Auth__Group__8 : rule__Auth__Group__8__Impl rule__Auth__Group__9 ;
    public final void rule__Auth__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1788:1: ( rule__Auth__Group__8__Impl rule__Auth__Group__9 )
            // InternalSecuritymodels.g:1789:2: rule__Auth__Group__8__Impl rule__Auth__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Auth__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__8"


    // $ANTLR start "rule__Auth__Group__8__Impl"
    // InternalSecuritymodels.g:1796:1: rule__Auth__Group__8__Impl : ( ( rule__Auth__TextualAssignment_8 ) ) ;
    public final void rule__Auth__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1800:1: ( ( ( rule__Auth__TextualAssignment_8 ) ) )
            // InternalSecuritymodels.g:1801:1: ( ( rule__Auth__TextualAssignment_8 ) )
            {
            // InternalSecuritymodels.g:1801:1: ( ( rule__Auth__TextualAssignment_8 ) )
            // InternalSecuritymodels.g:1802:2: ( rule__Auth__TextualAssignment_8 )
            {
             before(grammarAccess.getAuthAccess().getTextualAssignment_8()); 
            // InternalSecuritymodels.g:1803:2: ( rule__Auth__TextualAssignment_8 )
            // InternalSecuritymodels.g:1803:3: rule__Auth__TextualAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Auth__TextualAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getTextualAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__8__Impl"


    // $ANTLR start "rule__Auth__Group__9"
    // InternalSecuritymodels.g:1811:1: rule__Auth__Group__9 : rule__Auth__Group__9__Impl rule__Auth__Group__10 ;
    public final void rule__Auth__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1815:1: ( rule__Auth__Group__9__Impl rule__Auth__Group__10 )
            // InternalSecuritymodels.g:1816:2: rule__Auth__Group__9__Impl rule__Auth__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Auth__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__9"


    // $ANTLR start "rule__Auth__Group__9__Impl"
    // InternalSecuritymodels.g:1823:1: rule__Auth__Group__9__Impl : ( 'oclExp' ) ;
    public final void rule__Auth__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1827:1: ( ( 'oclExp' ) )
            // InternalSecuritymodels.g:1828:1: ( 'oclExp' )
            {
            // InternalSecuritymodels.g:1828:1: ( 'oclExp' )
            // InternalSecuritymodels.g:1829:2: 'oclExp'
            {
             before(grammarAccess.getAuthAccess().getOclExpKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getOclExpKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__9__Impl"


    // $ANTLR start "rule__Auth__Group__10"
    // InternalSecuritymodels.g:1838:1: rule__Auth__Group__10 : rule__Auth__Group__10__Impl rule__Auth__Group__11 ;
    public final void rule__Auth__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1842:1: ( rule__Auth__Group__10__Impl rule__Auth__Group__11 )
            // InternalSecuritymodels.g:1843:2: rule__Auth__Group__10__Impl rule__Auth__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Auth__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__10"


    // $ANTLR start "rule__Auth__Group__10__Impl"
    // InternalSecuritymodels.g:1850:1: rule__Auth__Group__10__Impl : ( ( rule__Auth__OclExpAssignment_10 ) ) ;
    public final void rule__Auth__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1854:1: ( ( ( rule__Auth__OclExpAssignment_10 ) ) )
            // InternalSecuritymodels.g:1855:1: ( ( rule__Auth__OclExpAssignment_10 ) )
            {
            // InternalSecuritymodels.g:1855:1: ( ( rule__Auth__OclExpAssignment_10 ) )
            // InternalSecuritymodels.g:1856:2: ( rule__Auth__OclExpAssignment_10 )
            {
             before(grammarAccess.getAuthAccess().getOclExpAssignment_10()); 
            // InternalSecuritymodels.g:1857:2: ( rule__Auth__OclExpAssignment_10 )
            // InternalSecuritymodels.g:1857:3: rule__Auth__OclExpAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Auth__OclExpAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getOclExpAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__10__Impl"


    // $ANTLR start "rule__Auth__Group__11"
    // InternalSecuritymodels.g:1865:1: rule__Auth__Group__11 : rule__Auth__Group__11__Impl rule__Auth__Group__12 ;
    public final void rule__Auth__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1869:1: ( rule__Auth__Group__11__Impl rule__Auth__Group__12 )
            // InternalSecuritymodels.g:1870:2: rule__Auth__Group__11__Impl rule__Auth__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Auth__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__11"


    // $ANTLR start "rule__Auth__Group__11__Impl"
    // InternalSecuritymodels.g:1877:1: rule__Auth__Group__11__Impl : ( 'sqlStm' ) ;
    public final void rule__Auth__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1881:1: ( ( 'sqlStm' ) )
            // InternalSecuritymodels.g:1882:1: ( 'sqlStm' )
            {
            // InternalSecuritymodels.g:1882:1: ( 'sqlStm' )
            // InternalSecuritymodels.g:1883:2: 'sqlStm'
            {
             before(grammarAccess.getAuthAccess().getSqlStmKeyword_11()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getSqlStmKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__11__Impl"


    // $ANTLR start "rule__Auth__Group__12"
    // InternalSecuritymodels.g:1892:1: rule__Auth__Group__12 : rule__Auth__Group__12__Impl rule__Auth__Group__13 ;
    public final void rule__Auth__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1896:1: ( rule__Auth__Group__12__Impl rule__Auth__Group__13 )
            // InternalSecuritymodels.g:1897:2: rule__Auth__Group__12__Impl rule__Auth__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Auth__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__12"


    // $ANTLR start "rule__Auth__Group__12__Impl"
    // InternalSecuritymodels.g:1904:1: rule__Auth__Group__12__Impl : ( ( rule__Auth__SqlStmAssignment_12 ) ) ;
    public final void rule__Auth__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1908:1: ( ( ( rule__Auth__SqlStmAssignment_12 ) ) )
            // InternalSecuritymodels.g:1909:1: ( ( rule__Auth__SqlStmAssignment_12 ) )
            {
            // InternalSecuritymodels.g:1909:1: ( ( rule__Auth__SqlStmAssignment_12 ) )
            // InternalSecuritymodels.g:1910:2: ( rule__Auth__SqlStmAssignment_12 )
            {
             before(grammarAccess.getAuthAccess().getSqlStmAssignment_12()); 
            // InternalSecuritymodels.g:1911:2: ( rule__Auth__SqlStmAssignment_12 )
            // InternalSecuritymodels.g:1911:3: rule__Auth__SqlStmAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Auth__SqlStmAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getSqlStmAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__12__Impl"


    // $ANTLR start "rule__Auth__Group__13"
    // InternalSecuritymodels.g:1919:1: rule__Auth__Group__13 : rule__Auth__Group__13__Impl ;
    public final void rule__Auth__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1923:1: ( rule__Auth__Group__13__Impl )
            // InternalSecuritymodels.g:1924:2: rule__Auth__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Auth__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__13"


    // $ANTLR start "rule__Auth__Group__13__Impl"
    // InternalSecuritymodels.g:1930:1: rule__Auth__Group__13__Impl : ( '}' ) ;
    public final void rule__Auth__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1934:1: ( ( '}' ) )
            // InternalSecuritymodels.g:1935:1: ( '}' )
            {
            // InternalSecuritymodels.g:1935:1: ( '}' )
            // InternalSecuritymodels.g:1936:2: '}'
            {
             before(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group__13__Impl"


    // $ANTLR start "rule__Auth__Group_3__0"
    // InternalSecuritymodels.g:1946:1: rule__Auth__Group_3__0 : rule__Auth__Group_3__0__Impl rule__Auth__Group_3__1 ;
    public final void rule__Auth__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1950:1: ( rule__Auth__Group_3__0__Impl rule__Auth__Group_3__1 )
            // InternalSecuritymodels.g:1951:2: rule__Auth__Group_3__0__Impl rule__Auth__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Auth__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group_3__0"


    // $ANTLR start "rule__Auth__Group_3__0__Impl"
    // InternalSecuritymodels.g:1958:1: rule__Auth__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Auth__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1962:1: ( ( ',' ) )
            // InternalSecuritymodels.g:1963:1: ( ',' )
            {
            // InternalSecuritymodels.g:1963:1: ( ',' )
            // InternalSecuritymodels.g:1964:2: ','
            {
             before(grammarAccess.getAuthAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group_3__0__Impl"


    // $ANTLR start "rule__Auth__Group_3__1"
    // InternalSecuritymodels.g:1973:1: rule__Auth__Group_3__1 : rule__Auth__Group_3__1__Impl ;
    public final void rule__Auth__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1977:1: ( rule__Auth__Group_3__1__Impl )
            // InternalSecuritymodels.g:1978:2: rule__Auth__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Auth__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group_3__1"


    // $ANTLR start "rule__Auth__Group_3__1__Impl"
    // InternalSecuritymodels.g:1984:1: rule__Auth__Group_3__1__Impl : ( ( rule__Auth__RolesAssignment_3_1 ) ) ;
    public final void rule__Auth__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1988:1: ( ( ( rule__Auth__RolesAssignment_3_1 ) ) )
            // InternalSecuritymodels.g:1989:1: ( ( rule__Auth__RolesAssignment_3_1 ) )
            {
            // InternalSecuritymodels.g:1989:1: ( ( rule__Auth__RolesAssignment_3_1 ) )
            // InternalSecuritymodels.g:1990:2: ( rule__Auth__RolesAssignment_3_1 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_3_1()); 
            // InternalSecuritymodels.g:1991:2: ( rule__Auth__RolesAssignment_3_1 )
            // InternalSecuritymodels.g:1991:3: rule__Auth__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Auth__RolesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getRolesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__Group_3__1__Impl"


    // $ANTLR start "rule__SecurityModel__NameAssignment_1"
    // InternalSecuritymodels.g:2000:1: rule__SecurityModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SecurityModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2004:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2005:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2005:2: ( ruleEString )
            // InternalSecuritymodels.g:2006:3: ruleEString
            {
             before(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__NameAssignment_1"


    // $ANTLR start "rule__SecurityModel__ResourcesAssignment_2_1"
    // InternalSecuritymodels.g:2015:1: rule__SecurityModel__ResourcesAssignment_2_1 : ( ruleProtectedResource ) ;
    public final void rule__SecurityModel__ResourcesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2019:1: ( ( ruleProtectedResource ) )
            // InternalSecuritymodels.g:2020:2: ( ruleProtectedResource )
            {
            // InternalSecuritymodels.g:2020:2: ( ruleProtectedResource )
            // InternalSecuritymodels.g:2021:3: ruleProtectedResource
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__ResourcesAssignment_2_1"


    // $ANTLR start "rule__SecurityModel__ResourcesAssignment_2_2_1"
    // InternalSecuritymodels.g:2030:1: rule__SecurityModel__ResourcesAssignment_2_2_1 : ( ruleProtectedResource ) ;
    public final void rule__SecurityModel__ResourcesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2034:1: ( ( ruleProtectedResource ) )
            // InternalSecuritymodels.g:2035:2: ( ruleProtectedResource )
            {
            // InternalSecuritymodels.g:2035:2: ( ruleProtectedResource )
            // InternalSecuritymodels.g:2036:3: ruleProtectedResource
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__ResourcesAssignment_2_2_1"


    // $ANTLR start "rule__SecurityModel__RolesAssignment_5"
    // InternalSecuritymodels.g:2045:1: rule__SecurityModel__RolesAssignment_5 : ( ruleRole ) ;
    public final void rule__SecurityModel__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2049:1: ( ( ruleRole ) )
            // InternalSecuritymodels.g:2050:2: ( ruleRole )
            {
            // InternalSecuritymodels.g:2050:2: ( ruleRole )
            // InternalSecuritymodels.g:2051:3: ruleRole
            {
             before(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__RolesAssignment_5"


    // $ANTLR start "rule__SecurityModel__RolesAssignment_6_1"
    // InternalSecuritymodels.g:2060:1: rule__SecurityModel__RolesAssignment_6_1 : ( ruleRole ) ;
    public final void rule__SecurityModel__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2064:1: ( ( ruleRole ) )
            // InternalSecuritymodels.g:2065:2: ( ruleRole )
            {
            // InternalSecuritymodels.g:2065:2: ( ruleRole )
            // InternalSecuritymodels.g:2066:3: ruleRole
            {
             before(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__RolesAssignment_6_1"


    // $ANTLR start "rule__SecurityModel__RulesAssignment_8_2"
    // InternalSecuritymodels.g:2075:1: rule__SecurityModel__RulesAssignment_8_2 : ( ruleRule ) ;
    public final void rule__SecurityModel__RulesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2079:1: ( ( ruleRule ) )
            // InternalSecuritymodels.g:2080:2: ( ruleRule )
            {
            // InternalSecuritymodels.g:2080:2: ( ruleRule )
            // InternalSecuritymodels.g:2081:3: ruleRule
            {
             before(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__RulesAssignment_8_2"


    // $ANTLR start "rule__SecurityModel__RulesAssignment_8_3_1"
    // InternalSecuritymodels.g:2090:1: rule__SecurityModel__RulesAssignment_8_3_1 : ( ruleRule ) ;
    public final void rule__SecurityModel__RulesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2094:1: ( ( ruleRule ) )
            // InternalSecuritymodels.g:2095:2: ( ruleRule )
            {
            // InternalSecuritymodels.g:2095:2: ( ruleRule )
            // InternalSecuritymodels.g:2096:3: ruleRule
            {
             before(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityModel__RulesAssignment_8_3_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalSecuritymodels.g:2105:1: rule__Rule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2109:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2110:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2110:2: ( ruleEString )
            // InternalSecuritymodels.g:2111:3: ruleEString
            {
             before(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__ActionAssignment_4"
    // InternalSecuritymodels.g:2120:1: rule__Rule__ActionAssignment_4 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2124:1: ( ( ruleAction ) )
            // InternalSecuritymodels.g:2125:2: ( ruleAction )
            {
            // InternalSecuritymodels.g:2125:2: ( ruleAction )
            // InternalSecuritymodels.g:2126:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_4"


    // $ANTLR start "rule__Rule__ProtectedResourcesAssignment_6"
    // InternalSecuritymodels.g:2135:1: rule__Rule__ProtectedResourcesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Rule__ProtectedResourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2139:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:2140:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:2140:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2141:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceCrossReference_6_0()); 
            // InternalSecuritymodels.g:2142:3: ( ruleEString )
            // InternalSecuritymodels.g:2143:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ProtectedResourcesAssignment_6"


    // $ANTLR start "rule__Rule__ProtectedResourcesAssignment_7_1"
    // InternalSecuritymodels.g:2154:1: rule__Rule__ProtectedResourcesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__ProtectedResourcesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2158:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:2159:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:2159:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2160:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceCrossReference_7_1_0()); 
            // InternalSecuritymodels.g:2161:3: ( ruleEString )
            // InternalSecuritymodels.g:2162:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getProtectedResourcesProtectedResourceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ProtectedResourcesAssignment_7_1"


    // $ANTLR start "rule__Rule__AuthsAssignment_11"
    // InternalSecuritymodels.g:2173:1: rule__Rule__AuthsAssignment_11 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2177:1: ( ( ruleAuth ) )
            // InternalSecuritymodels.g:2178:2: ( ruleAuth )
            {
            // InternalSecuritymodels.g:2178:2: ( ruleAuth )
            // InternalSecuritymodels.g:2179:3: ruleAuth
            {
             before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AuthsAssignment_11"


    // $ANTLR start "rule__Rule__AuthsAssignment_12_1"
    // InternalSecuritymodels.g:2188:1: rule__Rule__AuthsAssignment_12_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2192:1: ( ( ruleAuth ) )
            // InternalSecuritymodels.g:2193:2: ( ruleAuth )
            {
            // InternalSecuritymodels.g:2193:2: ( ruleAuth )
            // InternalSecuritymodels.g:2194:3: ruleAuth
            {
             before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AuthsAssignment_12_1"


    // $ANTLR start "rule__Role__NameAssignment_0"
    // InternalSecuritymodels.g:2203:1: rule__Role__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2207:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2208:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2208:2: ( ruleEString )
            // InternalSecuritymodels.g:2209:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_0"


    // $ANTLR start "rule__Role__UserEntityAssignment_2"
    // InternalSecuritymodels.g:2218:1: rule__Role__UserEntityAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__UserEntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2222:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:2223:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:2223:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2224:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getUserEntityEntityCrossReference_2_0()); 
            // InternalSecuritymodels.g:2225:3: ( ruleEString )
            // InternalSecuritymodels.g:2226:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getUserEntityEntityEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getUserEntityEntityEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getUserEntityEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__UserEntityAssignment_2"


    // $ANTLR start "rule__ProtectedResource__PropertyAssignment_0"
    // InternalSecuritymodels.g:2237:1: rule__ProtectedResource__PropertyAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ProtectedResource__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2241:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:2242:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:2242:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2243:3: ( ruleEString )
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_0_0()); 
            // InternalSecuritymodels.g:2244:3: ( ruleEString )
            // InternalSecuritymodels.g:2245:4: ruleEString
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__PropertyAssignment_0"


    // $ANTLR start "rule__ProtectedResource__NameAssignment_2"
    // InternalSecuritymodels.g:2256:1: rule__ProtectedResource__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProtectedResource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2260:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2261:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2261:2: ( ruleEString )
            // InternalSecuritymodels.g:2262:3: ruleEString
            {
             before(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtectedResource__NameAssignment_2"


    // $ANTLR start "rule__Auth__RolesAssignment_2"
    // InternalSecuritymodels.g:2271:1: rule__Auth__RolesAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2275:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:2276:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:2276:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2277:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_2_0()); 
            // InternalSecuritymodels.g:2278:3: ( ruleEString )
            // InternalSecuritymodels.g:2279:4: ruleEString
            {
             before(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAuthAccess().getRolesRoleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__RolesAssignment_2"


    // $ANTLR start "rule__Auth__RolesAssignment_3_1"
    // InternalSecuritymodels.g:2290:1: rule__Auth__RolesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2294:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:2295:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:2295:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2296:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_1_0()); 
            // InternalSecuritymodels.g:2297:3: ( ruleEString )
            // InternalSecuritymodels.g:2298:4: ruleEString
            {
             before(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__RolesAssignment_3_1"


    // $ANTLR start "rule__Auth__TextualAssignment_8"
    // InternalSecuritymodels.g:2309:1: rule__Auth__TextualAssignment_8 : ( ruleEString ) ;
    public final void rule__Auth__TextualAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2313:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2314:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2314:2: ( ruleEString )
            // InternalSecuritymodels.g:2315:3: ruleEString
            {
             before(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__TextualAssignment_8"


    // $ANTLR start "rule__Auth__OclExpAssignment_10"
    // InternalSecuritymodels.g:2324:1: rule__Auth__OclExpAssignment_10 : ( ruleEString ) ;
    public final void rule__Auth__OclExpAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2328:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2329:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2329:2: ( ruleEString )
            // InternalSecuritymodels.g:2330:3: ruleEString
            {
             before(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__OclExpAssignment_10"


    // $ANTLR start "rule__Auth__SqlStmAssignment_12"
    // InternalSecuritymodels.g:2339:1: rule__Auth__SqlStmAssignment_12 : ( ruleEString ) ;
    public final void rule__Auth__SqlStmAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:2343:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:2344:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:2344:2: ( ruleEString )
            // InternalSecuritymodels.g:2345:3: ruleEString
            {
             before(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auth__SqlStmAssignment_12"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});

}
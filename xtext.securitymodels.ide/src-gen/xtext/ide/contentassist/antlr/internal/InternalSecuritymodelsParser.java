package xtext.ide.contentassist.antlr.internal;

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
import xtext.services.SecuritymodelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecuritymodelsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'", "'name:'", "'protected:'", "'roles:'", "','", "'rules:'", "':'", "'conditions'", "'{'", "'}'", "'or'", "'<-'", "'roles'", "'('", "')'", "'context:'", "'ocl:'", "'sql:'", "'as'"
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


    // $ANTLR start "entryRuleAuth"
    // InternalSecuritymodels.g:153:1: entryRuleAuth : ruleAuth EOF ;
    public final void entryRuleAuth() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:154:1: ( ruleAuth EOF )
            // InternalSecuritymodels.g:155:1: ruleAuth EOF
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
    // InternalSecuritymodels.g:162:1: ruleAuth : ( ( rule__Auth__Group__0 ) ) ;
    public final void ruleAuth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:166:2: ( ( ( rule__Auth__Group__0 ) ) )
            // InternalSecuritymodels.g:167:2: ( ( rule__Auth__Group__0 ) )
            {
            // InternalSecuritymodels.g:167:2: ( ( rule__Auth__Group__0 ) )
            // InternalSecuritymodels.g:168:3: ( rule__Auth__Group__0 )
            {
             before(grammarAccess.getAuthAccess().getGroup()); 
            // InternalSecuritymodels.g:169:3: ( rule__Auth__Group__0 )
            // InternalSecuritymodels.g:169:4: rule__Auth__Group__0
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


    // $ANTLR start "entryRuleProtectedResource"
    // InternalSecuritymodels.g:178:1: entryRuleProtectedResource : ruleProtectedResource EOF ;
    public final void entryRuleProtectedResource() throws RecognitionException {
        try {
            // InternalSecuritymodels.g:179:1: ( ruleProtectedResource EOF )
            // InternalSecuritymodels.g:180:1: ruleProtectedResource EOF
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
    // InternalSecuritymodels.g:187:1: ruleProtectedResource : ( ( rule__ProtectedResource__Group__0 ) ) ;
    public final void ruleProtectedResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:191:2: ( ( ( rule__ProtectedResource__Group__0 ) ) )
            // InternalSecuritymodels.g:192:2: ( ( rule__ProtectedResource__Group__0 ) )
            {
            // InternalSecuritymodels.g:192:2: ( ( rule__ProtectedResource__Group__0 ) )
            // InternalSecuritymodels.g:193:3: ( rule__ProtectedResource__Group__0 )
            {
             before(grammarAccess.getProtectedResourceAccess().getGroup()); 
            // InternalSecuritymodels.g:194:3: ( rule__ProtectedResource__Group__0 )
            // InternalSecuritymodels.g:194:4: rule__ProtectedResource__Group__0
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
    // InternalSecuritymodels.g:284:1: rule__SecurityModel__Group__0__Impl : ( () ) ;
    public final void rule__SecurityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:288:1: ( ( () ) )
            // InternalSecuritymodels.g:289:1: ( () )
            {
            // InternalSecuritymodels.g:289:1: ( () )
            // InternalSecuritymodels.g:290:2: ()
            {
             before(grammarAccess.getSecurityModelAccess().getSecurityModelAction_0()); 
            // InternalSecuritymodels.g:291:2: ()
            // InternalSecuritymodels.g:291:3: 
            {
            }

             after(grammarAccess.getSecurityModelAccess().getSecurityModelAction_0()); 

            }


            }

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
    // InternalSecuritymodels.g:311:1: rule__SecurityModel__Group__1__Impl : ( 'name:' ) ;
    public final void rule__SecurityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:315:1: ( ( 'name:' ) )
            // InternalSecuritymodels.g:316:1: ( 'name:' )
            {
            // InternalSecuritymodels.g:316:1: ( 'name:' )
            // InternalSecuritymodels.g:317:2: 'name:'
            {
             before(grammarAccess.getSecurityModelAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getNameKeyword_1()); 

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
            pushFollow(FOLLOW_5);
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
    // InternalSecuritymodels.g:338:1: rule__SecurityModel__Group__2__Impl : ( ( rule__SecurityModel__NameAssignment_2 ) ) ;
    public final void rule__SecurityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:342:1: ( ( ( rule__SecurityModel__NameAssignment_2 ) ) )
            // InternalSecuritymodels.g:343:1: ( ( rule__SecurityModel__NameAssignment_2 ) )
            {
            // InternalSecuritymodels.g:343:1: ( ( rule__SecurityModel__NameAssignment_2 ) )
            // InternalSecuritymodels.g:344:2: ( rule__SecurityModel__NameAssignment_2 )
            {
             before(grammarAccess.getSecurityModelAccess().getNameAssignment_2()); 
            // InternalSecuritymodels.g:345:2: ( rule__SecurityModel__NameAssignment_2 )
            // InternalSecuritymodels.g:345:3: rule__SecurityModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getNameAssignment_2()); 

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
            pushFollow(FOLLOW_6);
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
    // InternalSecuritymodels.g:365:1: rule__SecurityModel__Group__3__Impl : ( 'protected:' ) ;
    public final void rule__SecurityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:369:1: ( ( 'protected:' ) )
            // InternalSecuritymodels.g:370:1: ( 'protected:' )
            {
            // InternalSecuritymodels.g:370:1: ( 'protected:' )
            // InternalSecuritymodels.g:371:2: 'protected:'
            {
             before(grammarAccess.getSecurityModelAccess().getProtectedKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getProtectedKeyword_3()); 

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
            pushFollow(FOLLOW_7);
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
    // InternalSecuritymodels.g:392:1: rule__SecurityModel__Group__4__Impl : ( ( rule__SecurityModel__ResourcesAssignment_4 ) ) ;
    public final void rule__SecurityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:396:1: ( ( ( rule__SecurityModel__ResourcesAssignment_4 ) ) )
            // InternalSecuritymodels.g:397:1: ( ( rule__SecurityModel__ResourcesAssignment_4 ) )
            {
            // InternalSecuritymodels.g:397:1: ( ( rule__SecurityModel__ResourcesAssignment_4 ) )
            // InternalSecuritymodels.g:398:2: ( rule__SecurityModel__ResourcesAssignment_4 )
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_4()); 
            // InternalSecuritymodels.g:399:2: ( rule__SecurityModel__ResourcesAssignment_4 )
            // InternalSecuritymodels.g:399:3: rule__SecurityModel__ResourcesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__ResourcesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_4()); 

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
            pushFollow(FOLLOW_7);
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
    // InternalSecuritymodels.g:419:1: rule__SecurityModel__Group__5__Impl : ( ( rule__SecurityModel__Group_5__0 )* ) ;
    public final void rule__SecurityModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:423:1: ( ( ( rule__SecurityModel__Group_5__0 )* ) )
            // InternalSecuritymodels.g:424:1: ( ( rule__SecurityModel__Group_5__0 )* )
            {
            // InternalSecuritymodels.g:424:1: ( ( rule__SecurityModel__Group_5__0 )* )
            // InternalSecuritymodels.g:425:2: ( rule__SecurityModel__Group_5__0 )*
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_5()); 
            // InternalSecuritymodels.g:426:2: ( rule__SecurityModel__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecuritymodels.g:426:3: rule__SecurityModel__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SecurityModel__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getGroup_5()); 

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
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:446:1: rule__SecurityModel__Group__6__Impl : ( 'roles:' ) ;
    public final void rule__SecurityModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:450:1: ( ( 'roles:' ) )
            // InternalSecuritymodels.g:451:1: ( 'roles:' )
            {
            // InternalSecuritymodels.g:451:1: ( 'roles:' )
            // InternalSecuritymodels.g:452:2: 'roles:'
            {
             before(grammarAccess.getSecurityModelAccess().getRolesKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getRolesKeyword_6()); 

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
            pushFollow(FOLLOW_9);
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
    // InternalSecuritymodels.g:473:1: rule__SecurityModel__Group__7__Impl : ( ( ( rule__SecurityModel__RolesAssignment_7 ) ) ( ( rule__SecurityModel__RolesAssignment_7 )* ) ) ;
    public final void rule__SecurityModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:477:1: ( ( ( ( rule__SecurityModel__RolesAssignment_7 ) ) ( ( rule__SecurityModel__RolesAssignment_7 )* ) ) )
            // InternalSecuritymodels.g:478:1: ( ( ( rule__SecurityModel__RolesAssignment_7 ) ) ( ( rule__SecurityModel__RolesAssignment_7 )* ) )
            {
            // InternalSecuritymodels.g:478:1: ( ( ( rule__SecurityModel__RolesAssignment_7 ) ) ( ( rule__SecurityModel__RolesAssignment_7 )* ) )
            // InternalSecuritymodels.g:479:2: ( ( rule__SecurityModel__RolesAssignment_7 ) ) ( ( rule__SecurityModel__RolesAssignment_7 )* )
            {
            // InternalSecuritymodels.g:479:2: ( ( rule__SecurityModel__RolesAssignment_7 ) )
            // InternalSecuritymodels.g:480:3: ( rule__SecurityModel__RolesAssignment_7 )
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_7()); 
            // InternalSecuritymodels.g:481:3: ( rule__SecurityModel__RolesAssignment_7 )
            // InternalSecuritymodels.g:481:4: rule__SecurityModel__RolesAssignment_7
            {
            pushFollow(FOLLOW_10);
            rule__SecurityModel__RolesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_7()); 

            }

            // InternalSecuritymodels.g:484:2: ( ( rule__SecurityModel__RolesAssignment_7 )* )
            // InternalSecuritymodels.g:485:3: ( rule__SecurityModel__RolesAssignment_7 )*
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_7()); 
            // InternalSecuritymodels.g:486:3: ( rule__SecurityModel__RolesAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSecuritymodels.g:486:4: rule__SecurityModel__RolesAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SecurityModel__RolesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_7()); 

            }


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
    // InternalSecuritymodels.g:495:1: rule__SecurityModel__Group__8 : rule__SecurityModel__Group__8__Impl ;
    public final void rule__SecurityModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:499:1: ( rule__SecurityModel__Group__8__Impl )
            // InternalSecuritymodels.g:500:2: rule__SecurityModel__Group__8__Impl
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
    // InternalSecuritymodels.g:506:1: rule__SecurityModel__Group__8__Impl : ( ( rule__SecurityModel__Group_8__0 )? ) ;
    public final void rule__SecurityModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:510:1: ( ( ( rule__SecurityModel__Group_8__0 )? ) )
            // InternalSecuritymodels.g:511:1: ( ( rule__SecurityModel__Group_8__0 )? )
            {
            // InternalSecuritymodels.g:511:1: ( ( rule__SecurityModel__Group_8__0 )? )
            // InternalSecuritymodels.g:512:2: ( rule__SecurityModel__Group_8__0 )?
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_8()); 
            // InternalSecuritymodels.g:513:2: ( rule__SecurityModel__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecuritymodels.g:513:3: rule__SecurityModel__Group_8__0
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


    // $ANTLR start "rule__SecurityModel__Group_5__0"
    // InternalSecuritymodels.g:522:1: rule__SecurityModel__Group_5__0 : rule__SecurityModel__Group_5__0__Impl rule__SecurityModel__Group_5__1 ;
    public final void rule__SecurityModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:526:1: ( rule__SecurityModel__Group_5__0__Impl rule__SecurityModel__Group_5__1 )
            // InternalSecuritymodels.g:527:2: rule__SecurityModel__Group_5__0__Impl rule__SecurityModel__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__SecurityModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_5__1();

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
    // $ANTLR end "rule__SecurityModel__Group_5__0"


    // $ANTLR start "rule__SecurityModel__Group_5__0__Impl"
    // InternalSecuritymodels.g:534:1: rule__SecurityModel__Group_5__0__Impl : ( ',' ) ;
    public final void rule__SecurityModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:538:1: ( ( ',' ) )
            // InternalSecuritymodels.g:539:1: ( ',' )
            {
            // InternalSecuritymodels.g:539:1: ( ',' )
            // InternalSecuritymodels.g:540:2: ','
            {
             before(grammarAccess.getSecurityModelAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__SecurityModel__Group_5__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_5__1"
    // InternalSecuritymodels.g:549:1: rule__SecurityModel__Group_5__1 : rule__SecurityModel__Group_5__1__Impl ;
    public final void rule__SecurityModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:553:1: ( rule__SecurityModel__Group_5__1__Impl )
            // InternalSecuritymodels.g:554:2: rule__SecurityModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_5__1__Impl();

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
    // $ANTLR end "rule__SecurityModel__Group_5__1"


    // $ANTLR start "rule__SecurityModel__Group_5__1__Impl"
    // InternalSecuritymodels.g:560:1: rule__SecurityModel__Group_5__1__Impl : ( ( rule__SecurityModel__ResourcesAssignment_5_1 ) ) ;
    public final void rule__SecurityModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:564:1: ( ( ( rule__SecurityModel__ResourcesAssignment_5_1 ) ) )
            // InternalSecuritymodels.g:565:1: ( ( rule__SecurityModel__ResourcesAssignment_5_1 ) )
            {
            // InternalSecuritymodels.g:565:1: ( ( rule__SecurityModel__ResourcesAssignment_5_1 ) )
            // InternalSecuritymodels.g:566:2: ( rule__SecurityModel__ResourcesAssignment_5_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_5_1()); 
            // InternalSecuritymodels.g:567:2: ( rule__SecurityModel__ResourcesAssignment_5_1 )
            // InternalSecuritymodels.g:567:3: rule__SecurityModel__ResourcesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__ResourcesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_5_1()); 

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
    // $ANTLR end "rule__SecurityModel__Group_5__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__0"
    // InternalSecuritymodels.g:576:1: rule__SecurityModel__Group_8__0 : rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1 ;
    public final void rule__SecurityModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:580:1: ( rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1 )
            // InternalSecuritymodels.g:581:2: rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:588:1: rule__SecurityModel__Group_8__0__Impl : ( 'rules:' ) ;
    public final void rule__SecurityModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:592:1: ( ( 'rules:' ) )
            // InternalSecuritymodels.g:593:1: ( 'rules:' )
            {
            // InternalSecuritymodels.g:593:1: ( 'rules:' )
            // InternalSecuritymodels.g:594:2: 'rules:'
            {
             before(grammarAccess.getSecurityModelAccess().getRulesKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSecuritymodels.g:603:1: rule__SecurityModel__Group_8__1 : rule__SecurityModel__Group_8__1__Impl ;
    public final void rule__SecurityModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:607:1: ( rule__SecurityModel__Group_8__1__Impl )
            // InternalSecuritymodels.g:608:2: rule__SecurityModel__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_8__1__Impl();

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
    // InternalSecuritymodels.g:614:1: rule__SecurityModel__Group_8__1__Impl : ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) ) ;
    public final void rule__SecurityModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:618:1: ( ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) ) )
            // InternalSecuritymodels.g:619:1: ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) )
            {
            // InternalSecuritymodels.g:619:1: ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) )
            // InternalSecuritymodels.g:620:2: ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* )
            {
            // InternalSecuritymodels.g:620:2: ( ( rule__SecurityModel__RulesAssignment_8_1 ) )
            // InternalSecuritymodels.g:621:3: ( rule__SecurityModel__RulesAssignment_8_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 
            // InternalSecuritymodels.g:622:3: ( rule__SecurityModel__RulesAssignment_8_1 )
            // InternalSecuritymodels.g:622:4: rule__SecurityModel__RulesAssignment_8_1
            {
            pushFollow(FOLLOW_10);
            rule__SecurityModel__RulesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 

            }

            // InternalSecuritymodels.g:625:2: ( ( rule__SecurityModel__RulesAssignment_8_1 )* )
            // InternalSecuritymodels.g:626:3: ( rule__SecurityModel__RulesAssignment_8_1 )*
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 
            // InternalSecuritymodels.g:627:3: ( rule__SecurityModel__RulesAssignment_8_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSecuritymodels.g:627:4: rule__SecurityModel__RulesAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SecurityModel__RulesAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 

            }


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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalSecuritymodels.g:637:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:641:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSecuritymodels.g:642:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecuritymodels.g:649:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:653:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalSecuritymodels.g:654:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalSecuritymodels.g:654:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalSecuritymodels.g:655:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalSecuritymodels.g:656:2: ( rule__Rule__NameAssignment_0 )
            // InternalSecuritymodels.g:656:3: rule__Rule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_0()); 

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
    // InternalSecuritymodels.g:664:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:668:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSecuritymodels.g:669:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSecuritymodels.g:676:1: rule__Rule__Group__1__Impl : ( ':' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:680:1: ( ( ':' ) )
            // InternalSecuritymodels.g:681:1: ( ':' )
            {
            // InternalSecuritymodels.g:681:1: ( ':' )
            // InternalSecuritymodels.g:682:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_1()); 

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
    // InternalSecuritymodels.g:691:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:695:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSecuritymodels.g:696:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecuritymodels.g:703:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:707:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalSecuritymodels.g:708:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalSecuritymodels.g:708:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalSecuritymodels.g:709:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalSecuritymodels.g:710:2: ( rule__Rule__ActionAssignment_2 )
            // InternalSecuritymodels.g:710:3: rule__Rule__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_2()); 

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
    // InternalSecuritymodels.g:718:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:722:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSecuritymodels.g:723:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSecuritymodels.g:730:1: rule__Rule__Group__3__Impl : ( 'conditions' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:734:1: ( ( 'conditions' ) )
            // InternalSecuritymodels.g:735:1: ( 'conditions' )
            {
            // InternalSecuritymodels.g:735:1: ( 'conditions' )
            // InternalSecuritymodels.g:736:2: 'conditions'
            {
             before(grammarAccess.getRuleAccess().getConditionsKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getConditionsKeyword_3()); 

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
    // InternalSecuritymodels.g:745:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:749:1: ( rule__Rule__Group__4__Impl )
            // InternalSecuritymodels.g:750:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // InternalSecuritymodels.g:756:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:760:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalSecuritymodels.g:761:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalSecuritymodels.g:761:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalSecuritymodels.g:762:2: ( rule__Rule__Group_4__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalSecuritymodels.g:763:2: ( rule__Rule__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecuritymodels.g:763:3: rule__Rule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Rule__Group_4__0"
    // InternalSecuritymodels.g:772:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:776:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalSecuritymodels.g:777:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__1();

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
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // InternalSecuritymodels.g:784:1: rule__Rule__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:788:1: ( ( '{' ) )
            // InternalSecuritymodels.g:789:1: ( '{' )
            {
            // InternalSecuritymodels.g:789:1: ( '{' )
            // InternalSecuritymodels.g:790:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // InternalSecuritymodels.g:799:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:803:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalSecuritymodels.g:804:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__2();

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
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // InternalSecuritymodels.g:811:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__AuthsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:815:1: ( ( ( rule__Rule__AuthsAssignment_4_1 ) ) )
            // InternalSecuritymodels.g:816:1: ( ( rule__Rule__AuthsAssignment_4_1 ) )
            {
            // InternalSecuritymodels.g:816:1: ( ( rule__Rule__AuthsAssignment_4_1 ) )
            // InternalSecuritymodels.g:817:2: ( rule__Rule__AuthsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_4_1()); 
            // InternalSecuritymodels.g:818:2: ( rule__Rule__AuthsAssignment_4_1 )
            // InternalSecuritymodels.g:818:3: rule__Rule__AuthsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AuthsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuthsAssignment_4_1()); 

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
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group_4__2"
    // InternalSecuritymodels.g:826:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl rule__Rule__Group_4__3 ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:830:1: ( rule__Rule__Group_4__2__Impl rule__Rule__Group_4__3 )
            // InternalSecuritymodels.g:831:2: rule__Rule__Group_4__2__Impl rule__Rule__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__3();

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
    // $ANTLR end "rule__Rule__Group_4__2"


    // $ANTLR start "rule__Rule__Group_4__2__Impl"
    // InternalSecuritymodels.g:838:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:842:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalSecuritymodels.g:843:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalSecuritymodels.g:843:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalSecuritymodels.g:844:2: ( rule__Rule__Group_4_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            // InternalSecuritymodels.g:845:2: ( rule__Rule__Group_4_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecuritymodels.g:845:3: rule__Rule__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Rule__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Rule__Group_4__2__Impl"


    // $ANTLR start "rule__Rule__Group_4__3"
    // InternalSecuritymodels.g:853:1: rule__Rule__Group_4__3 : rule__Rule__Group_4__3__Impl ;
    public final void rule__Rule__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:857:1: ( rule__Rule__Group_4__3__Impl )
            // InternalSecuritymodels.g:858:2: rule__Rule__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_4__3"


    // $ANTLR start "rule__Rule__Group_4__3__Impl"
    // InternalSecuritymodels.g:864:1: rule__Rule__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:868:1: ( ( '}' ) )
            // InternalSecuritymodels.g:869:1: ( '}' )
            {
            // InternalSecuritymodels.g:869:1: ( '}' )
            // InternalSecuritymodels.g:870:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__Rule__Group_4__3__Impl"


    // $ANTLR start "rule__Rule__Group_4_2__0"
    // InternalSecuritymodels.g:880:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:884:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalSecuritymodels.g:885:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_4_2__1();

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
    // $ANTLR end "rule__Rule__Group_4_2__0"


    // $ANTLR start "rule__Rule__Group_4_2__0__Impl"
    // InternalSecuritymodels.g:892:1: rule__Rule__Group_4_2__0__Impl : ( 'or' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:896:1: ( ( 'or' ) )
            // InternalSecuritymodels.g:897:1: ( 'or' )
            {
            // InternalSecuritymodels.g:897:1: ( 'or' )
            // InternalSecuritymodels.g:898:2: 'or'
            {
             before(grammarAccess.getRuleAccess().getOrKeyword_4_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getOrKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_4_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_4_2__1"
    // InternalSecuritymodels.g:907:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:911:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalSecuritymodels.g:912:2: rule__Rule__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_4_2__1"


    // $ANTLR start "rule__Rule__Group_4_2__1__Impl"
    // InternalSecuritymodels.g:918:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__AuthsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:922:1: ( ( ( rule__Rule__AuthsAssignment_4_2_1 ) ) )
            // InternalSecuritymodels.g:923:1: ( ( rule__Rule__AuthsAssignment_4_2_1 ) )
            {
            // InternalSecuritymodels.g:923:1: ( ( rule__Rule__AuthsAssignment_4_2_1 ) )
            // InternalSecuritymodels.g:924:2: ( rule__Rule__AuthsAssignment_4_2_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_4_2_1()); 
            // InternalSecuritymodels.g:925:2: ( rule__Rule__AuthsAssignment_4_2_1 )
            // InternalSecuritymodels.g:925:3: rule__Rule__AuthsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AuthsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuthsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_4_2__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecuritymodels.g:934:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:938:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecuritymodels.g:939:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecuritymodels.g:946:1: rule__Role__Group__0__Impl : ( ( rule__Role__NameAssignment_0 ) ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:950:1: ( ( ( rule__Role__NameAssignment_0 ) ) )
            // InternalSecuritymodels.g:951:1: ( ( rule__Role__NameAssignment_0 ) )
            {
            // InternalSecuritymodels.g:951:1: ( ( rule__Role__NameAssignment_0 ) )
            // InternalSecuritymodels.g:952:2: ( rule__Role__NameAssignment_0 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_0()); 
            // InternalSecuritymodels.g:953:2: ( rule__Role__NameAssignment_0 )
            // InternalSecuritymodels.g:953:3: rule__Role__NameAssignment_0
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
    // InternalSecuritymodels.g:961:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:965:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecuritymodels.g:966:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:973:1: rule__Role__Group__1__Impl : ( '<-' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:977:1: ( ( '<-' ) )
            // InternalSecuritymodels.g:978:1: ( '<-' )
            {
            // InternalSecuritymodels.g:978:1: ( '<-' )
            // InternalSecuritymodels.g:979:2: '<-'
            {
             before(grammarAccess.getRoleAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSecuritymodels.g:988:1: rule__Role__Group__2 : rule__Role__Group__2__Impl ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:992:1: ( rule__Role__Group__2__Impl )
            // InternalSecuritymodels.g:993:2: rule__Role__Group__2__Impl
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
    // InternalSecuritymodels.g:999:1: rule__Role__Group__2__Impl : ( ( rule__Role__UserEntityAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1003:1: ( ( ( rule__Role__UserEntityAssignment_2 ) ) )
            // InternalSecuritymodels.g:1004:1: ( ( rule__Role__UserEntityAssignment_2 ) )
            {
            // InternalSecuritymodels.g:1004:1: ( ( rule__Role__UserEntityAssignment_2 ) )
            // InternalSecuritymodels.g:1005:2: ( rule__Role__UserEntityAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getUserEntityAssignment_2()); 
            // InternalSecuritymodels.g:1006:2: ( rule__Role__UserEntityAssignment_2 )
            // InternalSecuritymodels.g:1006:3: rule__Role__UserEntityAssignment_2
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


    // $ANTLR start "rule__Auth__Group__0"
    // InternalSecuritymodels.g:1015:1: rule__Auth__Group__0 : rule__Auth__Group__0__Impl rule__Auth__Group__1 ;
    public final void rule__Auth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1019:1: ( rule__Auth__Group__0__Impl rule__Auth__Group__1 )
            // InternalSecuritymodels.g:1020:2: rule__Auth__Group__0__Impl rule__Auth__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecuritymodels.g:1027:1: rule__Auth__Group__0__Impl : ( '{' ) ;
    public final void rule__Auth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1031:1: ( ( '{' ) )
            // InternalSecuritymodels.g:1032:1: ( '{' )
            {
            // InternalSecuritymodels.g:1032:1: ( '{' )
            // InternalSecuritymodels.g:1033:2: '{'
            {
             before(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalSecuritymodels.g:1042:1: rule__Auth__Group__1 : rule__Auth__Group__1__Impl rule__Auth__Group__2 ;
    public final void rule__Auth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1046:1: ( rule__Auth__Group__1__Impl rule__Auth__Group__2 )
            // InternalSecuritymodels.g:1047:2: rule__Auth__Group__1__Impl rule__Auth__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSecuritymodels.g:1054:1: rule__Auth__Group__1__Impl : ( 'roles' ) ;
    public final void rule__Auth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1058:1: ( ( 'roles' ) )
            // InternalSecuritymodels.g:1059:1: ( 'roles' )
            {
            // InternalSecuritymodels.g:1059:1: ( 'roles' )
            // InternalSecuritymodels.g:1060:2: 'roles'
            {
             before(grammarAccess.getAuthAccess().getRolesKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getRolesKeyword_1()); 

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
    // InternalSecuritymodels.g:1069:1: rule__Auth__Group__2 : rule__Auth__Group__2__Impl rule__Auth__Group__3 ;
    public final void rule__Auth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1073:1: ( rule__Auth__Group__2__Impl rule__Auth__Group__3 )
            // InternalSecuritymodels.g:1074:2: rule__Auth__Group__2__Impl rule__Auth__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:1081:1: rule__Auth__Group__2__Impl : ( '(' ) ;
    public final void rule__Auth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1085:1: ( ( '(' ) )
            // InternalSecuritymodels.g:1086:1: ( '(' )
            {
            // InternalSecuritymodels.g:1086:1: ( '(' )
            // InternalSecuritymodels.g:1087:2: '('
            {
             before(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalSecuritymodels.g:1096:1: rule__Auth__Group__3 : rule__Auth__Group__3__Impl rule__Auth__Group__4 ;
    public final void rule__Auth__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1100:1: ( rule__Auth__Group__3__Impl rule__Auth__Group__4 )
            // InternalSecuritymodels.g:1101:2: rule__Auth__Group__3__Impl rule__Auth__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalSecuritymodels.g:1108:1: rule__Auth__Group__3__Impl : ( ( rule__Auth__RolesAssignment_3 ) ) ;
    public final void rule__Auth__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1112:1: ( ( ( rule__Auth__RolesAssignment_3 ) ) )
            // InternalSecuritymodels.g:1113:1: ( ( rule__Auth__RolesAssignment_3 ) )
            {
            // InternalSecuritymodels.g:1113:1: ( ( rule__Auth__RolesAssignment_3 ) )
            // InternalSecuritymodels.g:1114:2: ( rule__Auth__RolesAssignment_3 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_3()); 
            // InternalSecuritymodels.g:1115:2: ( rule__Auth__RolesAssignment_3 )
            // InternalSecuritymodels.g:1115:3: rule__Auth__RolesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Auth__RolesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getRolesAssignment_3()); 

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
    // InternalSecuritymodels.g:1123:1: rule__Auth__Group__4 : rule__Auth__Group__4__Impl rule__Auth__Group__5 ;
    public final void rule__Auth__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1127:1: ( rule__Auth__Group__4__Impl rule__Auth__Group__5 )
            // InternalSecuritymodels.g:1128:2: rule__Auth__Group__4__Impl rule__Auth__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSecuritymodels.g:1135:1: rule__Auth__Group__4__Impl : ( ( rule__Auth__Group_4__0 )* ) ;
    public final void rule__Auth__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1139:1: ( ( ( rule__Auth__Group_4__0 )* ) )
            // InternalSecuritymodels.g:1140:1: ( ( rule__Auth__Group_4__0 )* )
            {
            // InternalSecuritymodels.g:1140:1: ( ( rule__Auth__Group_4__0 )* )
            // InternalSecuritymodels.g:1141:2: ( rule__Auth__Group_4__0 )*
            {
             before(grammarAccess.getAuthAccess().getGroup_4()); 
            // InternalSecuritymodels.g:1142:2: ( rule__Auth__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecuritymodels.g:1142:3: rule__Auth__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Auth__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAuthAccess().getGroup_4()); 

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
    // InternalSecuritymodels.g:1150:1: rule__Auth__Group__5 : rule__Auth__Group__5__Impl rule__Auth__Group__6 ;
    public final void rule__Auth__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1154:1: ( rule__Auth__Group__5__Impl rule__Auth__Group__6 )
            // InternalSecuritymodels.g:1155:2: rule__Auth__Group__5__Impl rule__Auth__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecuritymodels.g:1162:1: rule__Auth__Group__5__Impl : ( ')' ) ;
    public final void rule__Auth__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1166:1: ( ( ')' ) )
            // InternalSecuritymodels.g:1167:1: ( ')' )
            {
            // InternalSecuritymodels.g:1167:1: ( ')' )
            // InternalSecuritymodels.g:1168:2: ')'
            {
             before(grammarAccess.getAuthAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getRightParenthesisKeyword_5()); 

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
    // InternalSecuritymodels.g:1177:1: rule__Auth__Group__6 : rule__Auth__Group__6__Impl rule__Auth__Group__7 ;
    public final void rule__Auth__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1181:1: ( rule__Auth__Group__6__Impl rule__Auth__Group__7 )
            // InternalSecuritymodels.g:1182:2: rule__Auth__Group__6__Impl rule__Auth__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:1189:1: rule__Auth__Group__6__Impl : ( 'context:' ) ;
    public final void rule__Auth__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1193:1: ( ( 'context:' ) )
            // InternalSecuritymodels.g:1194:1: ( 'context:' )
            {
            // InternalSecuritymodels.g:1194:1: ( 'context:' )
            // InternalSecuritymodels.g:1195:2: 'context:'
            {
             before(grammarAccess.getAuthAccess().getContextKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getContextKeyword_6()); 

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
    // InternalSecuritymodels.g:1204:1: rule__Auth__Group__7 : rule__Auth__Group__7__Impl rule__Auth__Group__8 ;
    public final void rule__Auth__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1208:1: ( rule__Auth__Group__7__Impl rule__Auth__Group__8 )
            // InternalSecuritymodels.g:1209:2: rule__Auth__Group__7__Impl rule__Auth__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecuritymodels.g:1216:1: rule__Auth__Group__7__Impl : ( ( rule__Auth__TextualAssignment_7 ) ) ;
    public final void rule__Auth__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1220:1: ( ( ( rule__Auth__TextualAssignment_7 ) ) )
            // InternalSecuritymodels.g:1221:1: ( ( rule__Auth__TextualAssignment_7 ) )
            {
            // InternalSecuritymodels.g:1221:1: ( ( rule__Auth__TextualAssignment_7 ) )
            // InternalSecuritymodels.g:1222:2: ( rule__Auth__TextualAssignment_7 )
            {
             before(grammarAccess.getAuthAccess().getTextualAssignment_7()); 
            // InternalSecuritymodels.g:1223:2: ( rule__Auth__TextualAssignment_7 )
            // InternalSecuritymodels.g:1223:3: rule__Auth__TextualAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Auth__TextualAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getTextualAssignment_7()); 

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
    // InternalSecuritymodels.g:1231:1: rule__Auth__Group__8 : rule__Auth__Group__8__Impl rule__Auth__Group__9 ;
    public final void rule__Auth__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1235:1: ( rule__Auth__Group__8__Impl rule__Auth__Group__9 )
            // InternalSecuritymodels.g:1236:2: rule__Auth__Group__8__Impl rule__Auth__Group__9
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:1243:1: rule__Auth__Group__8__Impl : ( 'ocl:' ) ;
    public final void rule__Auth__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1247:1: ( ( 'ocl:' ) )
            // InternalSecuritymodels.g:1248:1: ( 'ocl:' )
            {
            // InternalSecuritymodels.g:1248:1: ( 'ocl:' )
            // InternalSecuritymodels.g:1249:2: 'ocl:'
            {
             before(grammarAccess.getAuthAccess().getOclKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getOclKeyword_8()); 

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
    // InternalSecuritymodels.g:1258:1: rule__Auth__Group__9 : rule__Auth__Group__9__Impl rule__Auth__Group__10 ;
    public final void rule__Auth__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1262:1: ( rule__Auth__Group__9__Impl rule__Auth__Group__10 )
            // InternalSecuritymodels.g:1263:2: rule__Auth__Group__9__Impl rule__Auth__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecuritymodels.g:1270:1: rule__Auth__Group__9__Impl : ( ( rule__Auth__OclExpAssignment_9 ) ) ;
    public final void rule__Auth__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1274:1: ( ( ( rule__Auth__OclExpAssignment_9 ) ) )
            // InternalSecuritymodels.g:1275:1: ( ( rule__Auth__OclExpAssignment_9 ) )
            {
            // InternalSecuritymodels.g:1275:1: ( ( rule__Auth__OclExpAssignment_9 ) )
            // InternalSecuritymodels.g:1276:2: ( rule__Auth__OclExpAssignment_9 )
            {
             before(grammarAccess.getAuthAccess().getOclExpAssignment_9()); 
            // InternalSecuritymodels.g:1277:2: ( rule__Auth__OclExpAssignment_9 )
            // InternalSecuritymodels.g:1277:3: rule__Auth__OclExpAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Auth__OclExpAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getOclExpAssignment_9()); 

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
    // InternalSecuritymodels.g:1285:1: rule__Auth__Group__10 : rule__Auth__Group__10__Impl rule__Auth__Group__11 ;
    public final void rule__Auth__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1289:1: ( rule__Auth__Group__10__Impl rule__Auth__Group__11 )
            // InternalSecuritymodels.g:1290:2: rule__Auth__Group__10__Impl rule__Auth__Group__11
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:1297:1: rule__Auth__Group__10__Impl : ( 'sql:' ) ;
    public final void rule__Auth__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1301:1: ( ( 'sql:' ) )
            // InternalSecuritymodels.g:1302:1: ( 'sql:' )
            {
            // InternalSecuritymodels.g:1302:1: ( 'sql:' )
            // InternalSecuritymodels.g:1303:2: 'sql:'
            {
             before(grammarAccess.getAuthAccess().getSqlKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getSqlKeyword_10()); 

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
    // InternalSecuritymodels.g:1312:1: rule__Auth__Group__11 : rule__Auth__Group__11__Impl rule__Auth__Group__12 ;
    public final void rule__Auth__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1316:1: ( rule__Auth__Group__11__Impl rule__Auth__Group__12 )
            // InternalSecuritymodels.g:1317:2: rule__Auth__Group__11__Impl rule__Auth__Group__12
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecuritymodels.g:1324:1: rule__Auth__Group__11__Impl : ( ( rule__Auth__SqlStmAssignment_11 ) ) ;
    public final void rule__Auth__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1328:1: ( ( ( rule__Auth__SqlStmAssignment_11 ) ) )
            // InternalSecuritymodels.g:1329:1: ( ( rule__Auth__SqlStmAssignment_11 ) )
            {
            // InternalSecuritymodels.g:1329:1: ( ( rule__Auth__SqlStmAssignment_11 ) )
            // InternalSecuritymodels.g:1330:2: ( rule__Auth__SqlStmAssignment_11 )
            {
             before(grammarAccess.getAuthAccess().getSqlStmAssignment_11()); 
            // InternalSecuritymodels.g:1331:2: ( rule__Auth__SqlStmAssignment_11 )
            // InternalSecuritymodels.g:1331:3: rule__Auth__SqlStmAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Auth__SqlStmAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getSqlStmAssignment_11()); 

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
    // InternalSecuritymodels.g:1339:1: rule__Auth__Group__12 : rule__Auth__Group__12__Impl ;
    public final void rule__Auth__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1343:1: ( rule__Auth__Group__12__Impl )
            // InternalSecuritymodels.g:1344:2: rule__Auth__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Auth__Group__12__Impl();

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
    // InternalSecuritymodels.g:1350:1: rule__Auth__Group__12__Impl : ( '}' ) ;
    public final void rule__Auth__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1354:1: ( ( '}' ) )
            // InternalSecuritymodels.g:1355:1: ( '}' )
            {
            // InternalSecuritymodels.g:1355:1: ( '}' )
            // InternalSecuritymodels.g:1356:2: '}'
            {
             before(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12()); 

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


    // $ANTLR start "rule__Auth__Group_4__0"
    // InternalSecuritymodels.g:1366:1: rule__Auth__Group_4__0 : rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1 ;
    public final void rule__Auth__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1370:1: ( rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1 )
            // InternalSecuritymodels.g:1371:2: rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Auth__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Auth__Group_4__1();

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
    // $ANTLR end "rule__Auth__Group_4__0"


    // $ANTLR start "rule__Auth__Group_4__0__Impl"
    // InternalSecuritymodels.g:1378:1: rule__Auth__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Auth__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1382:1: ( ( ',' ) )
            // InternalSecuritymodels.g:1383:1: ( ',' )
            {
            // InternalSecuritymodels.g:1383:1: ( ',' )
            // InternalSecuritymodels.g:1384:2: ','
            {
             before(grammarAccess.getAuthAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAuthAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Auth__Group_4__0__Impl"


    // $ANTLR start "rule__Auth__Group_4__1"
    // InternalSecuritymodels.g:1393:1: rule__Auth__Group_4__1 : rule__Auth__Group_4__1__Impl ;
    public final void rule__Auth__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1397:1: ( rule__Auth__Group_4__1__Impl )
            // InternalSecuritymodels.g:1398:2: rule__Auth__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Auth__Group_4__1__Impl();

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
    // $ANTLR end "rule__Auth__Group_4__1"


    // $ANTLR start "rule__Auth__Group_4__1__Impl"
    // InternalSecuritymodels.g:1404:1: rule__Auth__Group_4__1__Impl : ( ( rule__Auth__RolesAssignment_4_1 ) ) ;
    public final void rule__Auth__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1408:1: ( ( ( rule__Auth__RolesAssignment_4_1 ) ) )
            // InternalSecuritymodels.g:1409:1: ( ( rule__Auth__RolesAssignment_4_1 ) )
            {
            // InternalSecuritymodels.g:1409:1: ( ( rule__Auth__RolesAssignment_4_1 ) )
            // InternalSecuritymodels.g:1410:2: ( rule__Auth__RolesAssignment_4_1 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_4_1()); 
            // InternalSecuritymodels.g:1411:2: ( rule__Auth__RolesAssignment_4_1 )
            // InternalSecuritymodels.g:1411:3: rule__Auth__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Auth__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthAccess().getRolesAssignment_4_1()); 

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
    // $ANTLR end "rule__Auth__Group_4__1__Impl"


    // $ANTLR start "rule__ProtectedResource__Group__0"
    // InternalSecuritymodels.g:1420:1: rule__ProtectedResource__Group__0 : rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1 ;
    public final void rule__ProtectedResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1424:1: ( rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1 )
            // InternalSecuritymodels.g:1425:2: rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecuritymodels.g:1432:1: rule__ProtectedResource__Group__0__Impl : ( '(' ) ;
    public final void rule__ProtectedResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1436:1: ( ( '(' ) )
            // InternalSecuritymodels.g:1437:1: ( '(' )
            {
            // InternalSecuritymodels.g:1437:1: ( '(' )
            // InternalSecuritymodels.g:1438:2: '('
            {
             before(grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0()); 

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
    // InternalSecuritymodels.g:1447:1: rule__ProtectedResource__Group__1 : rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2 ;
    public final void rule__ProtectedResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1451:1: ( rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2 )
            // InternalSecuritymodels.g:1452:2: rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSecuritymodels.g:1459:1: rule__ProtectedResource__Group__1__Impl : ( ( rule__ProtectedResource__PropertyAssignment_1 ) ) ;
    public final void rule__ProtectedResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1463:1: ( ( ( rule__ProtectedResource__PropertyAssignment_1 ) ) )
            // InternalSecuritymodels.g:1464:1: ( ( rule__ProtectedResource__PropertyAssignment_1 ) )
            {
            // InternalSecuritymodels.g:1464:1: ( ( rule__ProtectedResource__PropertyAssignment_1 ) )
            // InternalSecuritymodels.g:1465:2: ( rule__ProtectedResource__PropertyAssignment_1 )
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_1()); 
            // InternalSecuritymodels.g:1466:2: ( rule__ProtectedResource__PropertyAssignment_1 )
            // InternalSecuritymodels.g:1466:3: rule__ProtectedResource__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_1()); 

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
    // InternalSecuritymodels.g:1474:1: rule__ProtectedResource__Group__2 : rule__ProtectedResource__Group__2__Impl rule__ProtectedResource__Group__3 ;
    public final void rule__ProtectedResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1478:1: ( rule__ProtectedResource__Group__2__Impl rule__ProtectedResource__Group__3 )
            // InternalSecuritymodels.g:1479:2: rule__ProtectedResource__Group__2__Impl rule__ProtectedResource__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ProtectedResource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__3();

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
    // InternalSecuritymodels.g:1486:1: rule__ProtectedResource__Group__2__Impl : ( 'as' ) ;
    public final void rule__ProtectedResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1490:1: ( ( 'as' ) )
            // InternalSecuritymodels.g:1491:1: ( 'as' )
            {
            // InternalSecuritymodels.g:1491:1: ( 'as' )
            // InternalSecuritymodels.g:1492:2: 'as'
            {
             before(grammarAccess.getProtectedResourceAccess().getAsKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProtectedResourceAccess().getAsKeyword_2()); 

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


    // $ANTLR start "rule__ProtectedResource__Group__3"
    // InternalSecuritymodels.g:1501:1: rule__ProtectedResource__Group__3 : rule__ProtectedResource__Group__3__Impl rule__ProtectedResource__Group__4 ;
    public final void rule__ProtectedResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1505:1: ( rule__ProtectedResource__Group__3__Impl rule__ProtectedResource__Group__4 )
            // InternalSecuritymodels.g:1506:2: rule__ProtectedResource__Group__3__Impl rule__ProtectedResource__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ProtectedResource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__4();

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
    // $ANTLR end "rule__ProtectedResource__Group__3"


    // $ANTLR start "rule__ProtectedResource__Group__3__Impl"
    // InternalSecuritymodels.g:1513:1: rule__ProtectedResource__Group__3__Impl : ( ( rule__ProtectedResource__NameAssignment_3 ) ) ;
    public final void rule__ProtectedResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1517:1: ( ( ( rule__ProtectedResource__NameAssignment_3 ) ) )
            // InternalSecuritymodels.g:1518:1: ( ( rule__ProtectedResource__NameAssignment_3 ) )
            {
            // InternalSecuritymodels.g:1518:1: ( ( rule__ProtectedResource__NameAssignment_3 ) )
            // InternalSecuritymodels.g:1519:2: ( rule__ProtectedResource__NameAssignment_3 )
            {
             before(grammarAccess.getProtectedResourceAccess().getNameAssignment_3()); 
            // InternalSecuritymodels.g:1520:2: ( rule__ProtectedResource__NameAssignment_3 )
            // InternalSecuritymodels.g:1520:3: rule__ProtectedResource__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProtectedResourceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ProtectedResource__Group__3__Impl"


    // $ANTLR start "rule__ProtectedResource__Group__4"
    // InternalSecuritymodels.g:1528:1: rule__ProtectedResource__Group__4 : rule__ProtectedResource__Group__4__Impl ;
    public final void rule__ProtectedResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1532:1: ( rule__ProtectedResource__Group__4__Impl )
            // InternalSecuritymodels.g:1533:2: rule__ProtectedResource__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtectedResource__Group__4__Impl();

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
    // $ANTLR end "rule__ProtectedResource__Group__4"


    // $ANTLR start "rule__ProtectedResource__Group__4__Impl"
    // InternalSecuritymodels.g:1539:1: rule__ProtectedResource__Group__4__Impl : ( ')' ) ;
    public final void rule__ProtectedResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1543:1: ( ( ')' ) )
            // InternalSecuritymodels.g:1544:1: ( ')' )
            {
            // InternalSecuritymodels.g:1544:1: ( ')' )
            // InternalSecuritymodels.g:1545:2: ')'
            {
             before(grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__ProtectedResource__Group__4__Impl"


    // $ANTLR start "rule__SecurityModel__NameAssignment_2"
    // InternalSecuritymodels.g:1555:1: rule__SecurityModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SecurityModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1559:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1560:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1560:2: ( ruleEString )
            // InternalSecuritymodels.g:1561:3: ruleEString
            {
             before(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SecurityModel__NameAssignment_2"


    // $ANTLR start "rule__SecurityModel__ResourcesAssignment_4"
    // InternalSecuritymodels.g:1570:1: rule__SecurityModel__ResourcesAssignment_4 : ( ruleProtectedResource ) ;
    public final void rule__SecurityModel__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1574:1: ( ( ruleProtectedResource ) )
            // InternalSecuritymodels.g:1575:2: ( ruleProtectedResource )
            {
            // InternalSecuritymodels.g:1575:2: ( ruleProtectedResource )
            // InternalSecuritymodels.g:1576:3: ruleProtectedResource
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SecurityModel__ResourcesAssignment_4"


    // $ANTLR start "rule__SecurityModel__ResourcesAssignment_5_1"
    // InternalSecuritymodels.g:1585:1: rule__SecurityModel__ResourcesAssignment_5_1 : ( ruleProtectedResource ) ;
    public final void rule__SecurityModel__ResourcesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1589:1: ( ( ruleProtectedResource ) )
            // InternalSecuritymodels.g:1590:2: ( ruleProtectedResource )
            {
            // InternalSecuritymodels.g:1590:2: ( ruleProtectedResource )
            // InternalSecuritymodels.g:1591:3: ruleProtectedResource
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SecurityModel__ResourcesAssignment_5_1"


    // $ANTLR start "rule__SecurityModel__RolesAssignment_7"
    // InternalSecuritymodels.g:1600:1: rule__SecurityModel__RolesAssignment_7 : ( ruleRole ) ;
    public final void rule__SecurityModel__RolesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1604:1: ( ( ruleRole ) )
            // InternalSecuritymodels.g:1605:2: ( ruleRole )
            {
            // InternalSecuritymodels.g:1605:2: ( ruleRole )
            // InternalSecuritymodels.g:1606:3: ruleRole
            {
             before(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SecurityModel__RolesAssignment_7"


    // $ANTLR start "rule__SecurityModel__RulesAssignment_8_1"
    // InternalSecuritymodels.g:1615:1: rule__SecurityModel__RulesAssignment_8_1 : ( ruleRule ) ;
    public final void rule__SecurityModel__RulesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1619:1: ( ( ruleRule ) )
            // InternalSecuritymodels.g:1620:2: ( ruleRule )
            {
            // InternalSecuritymodels.g:1620:2: ( ruleRule )
            // InternalSecuritymodels.g:1621:3: ruleRule
            {
             before(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__SecurityModel__RulesAssignment_8_1"


    // $ANTLR start "rule__Rule__NameAssignment_0"
    // InternalSecuritymodels.g:1630:1: rule__Rule__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1634:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1635:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1635:2: ( ruleEString )
            // InternalSecuritymodels.g:1636:3: ruleEString
            {
             before(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_0"


    // $ANTLR start "rule__Rule__ActionAssignment_2"
    // InternalSecuritymodels.g:1645:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1649:1: ( ( ruleAction ) )
            // InternalSecuritymodels.g:1650:2: ( ruleAction )
            {
            // InternalSecuritymodels.g:1650:2: ( ruleAction )
            // InternalSecuritymodels.g:1651:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__ActionAssignment_2"


    // $ANTLR start "rule__Rule__AuthsAssignment_4_1"
    // InternalSecuritymodels.g:1660:1: rule__Rule__AuthsAssignment_4_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1664:1: ( ( ruleAuth ) )
            // InternalSecuritymodels.g:1665:2: ( ruleAuth )
            {
            // InternalSecuritymodels.g:1665:2: ( ruleAuth )
            // InternalSecuritymodels.g:1666:3: ruleAuth
            {
             before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Rule__AuthsAssignment_4_1"


    // $ANTLR start "rule__Rule__AuthsAssignment_4_2_1"
    // InternalSecuritymodels.g:1675:1: rule__Rule__AuthsAssignment_4_2_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1679:1: ( ( ruleAuth ) )
            // InternalSecuritymodels.g:1680:2: ( ruleAuth )
            {
            // InternalSecuritymodels.g:1680:2: ( ruleAuth )
            // InternalSecuritymodels.g:1681:3: ruleAuth
            {
             before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Rule__AuthsAssignment_4_2_1"


    // $ANTLR start "rule__Role__NameAssignment_0"
    // InternalSecuritymodels.g:1690:1: rule__Role__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1694:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1695:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1695:2: ( ruleEString )
            // InternalSecuritymodels.g:1696:3: ruleEString
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
    // InternalSecuritymodels.g:1705:1: rule__Role__UserEntityAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__UserEntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1709:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:1710:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:1710:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1711:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getUserEntityEntityCrossReference_2_0()); 
            // InternalSecuritymodels.g:1712:3: ( ruleEString )
            // InternalSecuritymodels.g:1713:4: ruleEString
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


    // $ANTLR start "rule__Auth__RolesAssignment_3"
    // InternalSecuritymodels.g:1724:1: rule__Auth__RolesAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1728:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:1729:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:1729:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1730:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0()); 
            // InternalSecuritymodels.g:1731:3: ( ruleEString )
            // InternalSecuritymodels.g:1732:4: ruleEString
            {
             before(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0()); 

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
    // $ANTLR end "rule__Auth__RolesAssignment_3"


    // $ANTLR start "rule__Auth__RolesAssignment_4_1"
    // InternalSecuritymodels.g:1743:1: rule__Auth__RolesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1747:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:1748:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:1748:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1749:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalSecuritymodels.g:1750:3: ( ruleEString )
            // InternalSecuritymodels.g:1751:4: ruleEString
            {
             before(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getRolesRoleEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Auth__RolesAssignment_4_1"


    // $ANTLR start "rule__Auth__TextualAssignment_7"
    // InternalSecuritymodels.g:1762:1: rule__Auth__TextualAssignment_7 : ( ruleEString ) ;
    public final void rule__Auth__TextualAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1766:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1767:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1767:2: ( ruleEString )
            // InternalSecuritymodels.g:1768:3: ruleEString
            {
             before(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getTextualEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Auth__TextualAssignment_7"


    // $ANTLR start "rule__Auth__OclExpAssignment_9"
    // InternalSecuritymodels.g:1777:1: rule__Auth__OclExpAssignment_9 : ( ruleEString ) ;
    public final void rule__Auth__OclExpAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1781:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1782:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1782:2: ( ruleEString )
            // InternalSecuritymodels.g:1783:3: ruleEString
            {
             before(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getOclExpEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Auth__OclExpAssignment_9"


    // $ANTLR start "rule__Auth__SqlStmAssignment_11"
    // InternalSecuritymodels.g:1792:1: rule__Auth__SqlStmAssignment_11 : ( ruleEString ) ;
    public final void rule__Auth__SqlStmAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1796:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1797:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1797:2: ( ruleEString )
            // InternalSecuritymodels.g:1798:3: ruleEString
            {
             before(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAuthAccess().getSqlStmEStringParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Auth__SqlStmAssignment_11"


    // $ANTLR start "rule__ProtectedResource__PropertyAssignment_1"
    // InternalSecuritymodels.g:1807:1: rule__ProtectedResource__PropertyAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ProtectedResource__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1811:1: ( ( ( ruleEString ) ) )
            // InternalSecuritymodels.g:1812:2: ( ( ruleEString ) )
            {
            // InternalSecuritymodels.g:1812:2: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1813:3: ( ruleEString )
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0()); 
            // InternalSecuritymodels.g:1814:3: ( ruleEString )
            // InternalSecuritymodels.g:1815:4: ruleEString
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0()); 

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
    // $ANTLR end "rule__ProtectedResource__PropertyAssignment_1"


    // $ANTLR start "rule__ProtectedResource__NameAssignment_3"
    // InternalSecuritymodels.g:1826:1: rule__ProtectedResource__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ProtectedResource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecuritymodels.g:1830:1: ( ( ruleEString ) )
            // InternalSecuritymodels.g:1831:2: ( ruleEString )
            {
            // InternalSecuritymodels.g:1831:2: ( ruleEString )
            // InternalSecuritymodels.g:1832:3: ruleEString
            {
             before(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ProtectedResource__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}
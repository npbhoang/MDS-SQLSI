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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'", "'name:'", "'roles:'", "'protected:'", "','", "'rules:'", "':'", "'conditions'", "'{'", "'}'", "'or'", "'roles'", "'('", "')'", "'context:'", "'ocl:'", "'sql:'", "'as'"
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



    // $ANTLR start "entryRuleSecurityModel"
    // InternalSecurityModel.g:53:1: entryRuleSecurityModel : ruleSecurityModel EOF ;
    public final void entryRuleSecurityModel() throws RecognitionException {
        try {
            // InternalSecurityModel.g:54:1: ( ruleSecurityModel EOF )
            // InternalSecurityModel.g:55:1: ruleSecurityModel EOF
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
    // InternalSecurityModel.g:62:1: ruleSecurityModel : ( ( rule__SecurityModel__Group__0 ) ) ;
    public final void ruleSecurityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:66:2: ( ( ( rule__SecurityModel__Group__0 ) ) )
            // InternalSecurityModel.g:67:2: ( ( rule__SecurityModel__Group__0 ) )
            {
            // InternalSecurityModel.g:67:2: ( ( rule__SecurityModel__Group__0 ) )
            // InternalSecurityModel.g:68:3: ( rule__SecurityModel__Group__0 )
            {
             before(grammarAccess.getSecurityModelAccess().getGroup()); 
            // InternalSecurityModel.g:69:3: ( rule__SecurityModel__Group__0 )
            // InternalSecurityModel.g:69:4: rule__SecurityModel__Group__0
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
    // InternalSecurityModel.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSecurityModel.g:79:1: ( ruleEString EOF )
            // InternalSecurityModel.g:80:1: ruleEString EOF
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
    // InternalSecurityModel.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSecurityModel.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSecurityModel.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSecurityModel.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSecurityModel.g:94:3: ( rule__EString__Alternatives )
            // InternalSecurityModel.g:94:4: rule__EString__Alternatives
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
    // InternalSecurityModel.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSecurityModel.g:104:1: ( ruleRule EOF )
            // InternalSecurityModel.g:105:1: ruleRule EOF
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
    // InternalSecurityModel.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSecurityModel.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSecurityModel.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalSecurityModel.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalSecurityModel.g:119:3: ( rule__Rule__Group__0 )
            // InternalSecurityModel.g:119:4: rule__Rule__Group__0
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
    // InternalSecurityModel.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSecurityModel.g:129:1: ( ruleRole EOF )
            // InternalSecurityModel.g:130:1: ruleRole EOF
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
    // InternalSecurityModel.g:137:1: ruleRole : ( ( rule__Role__NameAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:141:2: ( ( ( rule__Role__NameAssignment ) ) )
            // InternalSecurityModel.g:142:2: ( ( rule__Role__NameAssignment ) )
            {
            // InternalSecurityModel.g:142:2: ( ( rule__Role__NameAssignment ) )
            // InternalSecurityModel.g:143:3: ( rule__Role__NameAssignment )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment()); 
            // InternalSecurityModel.g:144:3: ( rule__Role__NameAssignment )
            // InternalSecurityModel.g:144:4: rule__Role__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment()); 

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
    // InternalSecurityModel.g:153:1: entryRuleAuth : ruleAuth EOF ;
    public final void entryRuleAuth() throws RecognitionException {
        try {
            // InternalSecurityModel.g:154:1: ( ruleAuth EOF )
            // InternalSecurityModel.g:155:1: ruleAuth EOF
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
    // InternalSecurityModel.g:162:1: ruleAuth : ( ( rule__Auth__Group__0 ) ) ;
    public final void ruleAuth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:166:2: ( ( ( rule__Auth__Group__0 ) ) )
            // InternalSecurityModel.g:167:2: ( ( rule__Auth__Group__0 ) )
            {
            // InternalSecurityModel.g:167:2: ( ( rule__Auth__Group__0 ) )
            // InternalSecurityModel.g:168:3: ( rule__Auth__Group__0 )
            {
             before(grammarAccess.getAuthAccess().getGroup()); 
            // InternalSecurityModel.g:169:3: ( rule__Auth__Group__0 )
            // InternalSecurityModel.g:169:4: rule__Auth__Group__0
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
    // InternalSecurityModel.g:178:1: entryRuleProtectedResource : ruleProtectedResource EOF ;
    public final void entryRuleProtectedResource() throws RecognitionException {
        try {
            // InternalSecurityModel.g:179:1: ( ruleProtectedResource EOF )
            // InternalSecurityModel.g:180:1: ruleProtectedResource EOF
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
    // InternalSecurityModel.g:187:1: ruleProtectedResource : ( ( rule__ProtectedResource__Group__0 ) ) ;
    public final void ruleProtectedResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:191:2: ( ( ( rule__ProtectedResource__Group__0 ) ) )
            // InternalSecurityModel.g:192:2: ( ( rule__ProtectedResource__Group__0 ) )
            {
            // InternalSecurityModel.g:192:2: ( ( rule__ProtectedResource__Group__0 ) )
            // InternalSecurityModel.g:193:3: ( rule__ProtectedResource__Group__0 )
            {
             before(grammarAccess.getProtectedResourceAccess().getGroup()); 
            // InternalSecurityModel.g:194:3: ( rule__ProtectedResource__Group__0 )
            // InternalSecurityModel.g:194:4: rule__ProtectedResource__Group__0
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
    // InternalSecurityModel.g:203:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:207:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalSecurityModel.g:208:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalSecurityModel.g:208:2: ( ( rule__Action__Alternatives ) )
            // InternalSecurityModel.g:209:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalSecurityModel.g:210:3: ( rule__Action__Alternatives )
            // InternalSecurityModel.g:210:4: rule__Action__Alternatives
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
    // InternalSecurityModel.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityModel.g:223:2: ( RULE_STRING )
                    {
                    // InternalSecurityModel.g:223:2: ( RULE_STRING )
                    // InternalSecurityModel.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityModel.g:229:2: ( RULE_ID )
                    {
                    // InternalSecurityModel.g:229:2: ( RULE_ID )
                    // InternalSecurityModel.g:230:3: RULE_ID
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
    // InternalSecurityModel.g:239:1: rule__Action__Alternatives : ( ( ( 'READ' ) ) | ( ( 'CREATE' ) ) | ( ( 'UPDATE' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:243:1: ( ( ( 'READ' ) ) | ( ( 'CREATE' ) ) | ( ( 'UPDATE' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityModel.g:244:2: ( ( 'READ' ) )
                    {
                    // InternalSecurityModel.g:244:2: ( ( 'READ' ) )
                    // InternalSecurityModel.g:245:3: ( 'READ' )
                    {
                     before(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalSecurityModel.g:246:3: ( 'READ' )
                    // InternalSecurityModel.g:246:4: 'READ'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityModel.g:250:2: ( ( 'CREATE' ) )
                    {
                    // InternalSecurityModel.g:250:2: ( ( 'CREATE' ) )
                    // InternalSecurityModel.g:251:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); 
                    // InternalSecurityModel.g:252:3: ( 'CREATE' )
                    // InternalSecurityModel.g:252:4: 'CREATE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityModel.g:256:2: ( ( 'UPDATE' ) )
                    {
                    // InternalSecurityModel.g:256:2: ( ( 'UPDATE' ) )
                    // InternalSecurityModel.g:257:3: ( 'UPDATE' )
                    {
                     before(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); 
                    // InternalSecurityModel.g:258:3: ( 'UPDATE' )
                    // InternalSecurityModel.g:258:4: 'UPDATE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityModel.g:262:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityModel.g:262:2: ( ( 'DELETE' ) )
                    // InternalSecurityModel.g:263:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityModel.g:264:3: ( 'DELETE' )
                    // InternalSecurityModel.g:264:4: 'DELETE'
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
    // InternalSecurityModel.g:272:1: rule__SecurityModel__Group__0 : rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1 ;
    public final void rule__SecurityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:276:1: ( rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1 )
            // InternalSecurityModel.g:277:2: rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1
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
    // InternalSecurityModel.g:284:1: rule__SecurityModel__Group__0__Impl : ( () ) ;
    public final void rule__SecurityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:288:1: ( ( () ) )
            // InternalSecurityModel.g:289:1: ( () )
            {
            // InternalSecurityModel.g:289:1: ( () )
            // InternalSecurityModel.g:290:2: ()
            {
             before(grammarAccess.getSecurityModelAccess().getSecurityModelAction_0()); 
            // InternalSecurityModel.g:291:2: ()
            // InternalSecurityModel.g:291:3: 
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
    // InternalSecurityModel.g:299:1: rule__SecurityModel__Group__1 : rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2 ;
    public final void rule__SecurityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:303:1: ( rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2 )
            // InternalSecurityModel.g:304:2: rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2
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
    // InternalSecurityModel.g:311:1: rule__SecurityModel__Group__1__Impl : ( 'name:' ) ;
    public final void rule__SecurityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:315:1: ( ( 'name:' ) )
            // InternalSecurityModel.g:316:1: ( 'name:' )
            {
            // InternalSecurityModel.g:316:1: ( 'name:' )
            // InternalSecurityModel.g:317:2: 'name:'
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
    // InternalSecurityModel.g:326:1: rule__SecurityModel__Group__2 : rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3 ;
    public final void rule__SecurityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:330:1: ( rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3 )
            // InternalSecurityModel.g:331:2: rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3
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
    // InternalSecurityModel.g:338:1: rule__SecurityModel__Group__2__Impl : ( ( rule__SecurityModel__NameAssignment_2 ) ) ;
    public final void rule__SecurityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:342:1: ( ( ( rule__SecurityModel__NameAssignment_2 ) ) )
            // InternalSecurityModel.g:343:1: ( ( rule__SecurityModel__NameAssignment_2 ) )
            {
            // InternalSecurityModel.g:343:1: ( ( rule__SecurityModel__NameAssignment_2 ) )
            // InternalSecurityModel.g:344:2: ( rule__SecurityModel__NameAssignment_2 )
            {
             before(grammarAccess.getSecurityModelAccess().getNameAssignment_2()); 
            // InternalSecurityModel.g:345:2: ( rule__SecurityModel__NameAssignment_2 )
            // InternalSecurityModel.g:345:3: rule__SecurityModel__NameAssignment_2
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
    // InternalSecurityModel.g:353:1: rule__SecurityModel__Group__3 : rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4 ;
    public final void rule__SecurityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:357:1: ( rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4 )
            // InternalSecurityModel.g:358:2: rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityModel.g:365:1: rule__SecurityModel__Group__3__Impl : ( 'roles:' ) ;
    public final void rule__SecurityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:369:1: ( ( 'roles:' ) )
            // InternalSecurityModel.g:370:1: ( 'roles:' )
            {
            // InternalSecurityModel.g:370:1: ( 'roles:' )
            // InternalSecurityModel.g:371:2: 'roles:'
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
    // InternalSecurityModel.g:380:1: rule__SecurityModel__Group__4 : rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5 ;
    public final void rule__SecurityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:384:1: ( rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5 )
            // InternalSecurityModel.g:385:2: rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalSecurityModel.g:392:1: rule__SecurityModel__Group__4__Impl : ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) ) ;
    public final void rule__SecurityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:396:1: ( ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) ) )
            // InternalSecurityModel.g:397:1: ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) )
            {
            // InternalSecurityModel.g:397:1: ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) )
            // InternalSecurityModel.g:398:2: ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* )
            {
            // InternalSecurityModel.g:398:2: ( ( rule__SecurityModel__RolesAssignment_4 ) )
            // InternalSecurityModel.g:399:3: ( rule__SecurityModel__RolesAssignment_4 )
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 
            // InternalSecurityModel.g:400:3: ( rule__SecurityModel__RolesAssignment_4 )
            // InternalSecurityModel.g:400:4: rule__SecurityModel__RolesAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__SecurityModel__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 

            }

            // InternalSecurityModel.g:403:2: ( ( rule__SecurityModel__RolesAssignment_4 )* )
            // InternalSecurityModel.g:404:3: ( rule__SecurityModel__RolesAssignment_4 )*
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 
            // InternalSecurityModel.g:405:3: ( rule__SecurityModel__RolesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecurityModel.g:405:4: rule__SecurityModel__RolesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SecurityModel__RolesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 

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
    // $ANTLR end "rule__SecurityModel__Group__4__Impl"


    // $ANTLR start "rule__SecurityModel__Group__5"
    // InternalSecurityModel.g:414:1: rule__SecurityModel__Group__5 : rule__SecurityModel__Group__5__Impl rule__SecurityModel__Group__6 ;
    public final void rule__SecurityModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:418:1: ( rule__SecurityModel__Group__5__Impl rule__SecurityModel__Group__6 )
            // InternalSecurityModel.g:419:2: rule__SecurityModel__Group__5__Impl rule__SecurityModel__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecurityModel.g:426:1: rule__SecurityModel__Group__5__Impl : ( 'protected:' ) ;
    public final void rule__SecurityModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:430:1: ( ( 'protected:' ) )
            // InternalSecurityModel.g:431:1: ( 'protected:' )
            {
            // InternalSecurityModel.g:431:1: ( 'protected:' )
            // InternalSecurityModel.g:432:2: 'protected:'
            {
             before(grammarAccess.getSecurityModelAccess().getProtectedKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getProtectedKeyword_5()); 

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
    // InternalSecurityModel.g:441:1: rule__SecurityModel__Group__6 : rule__SecurityModel__Group__6__Impl rule__SecurityModel__Group__7 ;
    public final void rule__SecurityModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:445:1: ( rule__SecurityModel__Group__6__Impl rule__SecurityModel__Group__7 )
            // InternalSecurityModel.g:446:2: rule__SecurityModel__Group__6__Impl rule__SecurityModel__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalSecurityModel.g:453:1: rule__SecurityModel__Group__6__Impl : ( ( rule__SecurityModel__ResourcesAssignment_6 ) ) ;
    public final void rule__SecurityModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:457:1: ( ( ( rule__SecurityModel__ResourcesAssignment_6 ) ) )
            // InternalSecurityModel.g:458:1: ( ( rule__SecurityModel__ResourcesAssignment_6 ) )
            {
            // InternalSecurityModel.g:458:1: ( ( rule__SecurityModel__ResourcesAssignment_6 ) )
            // InternalSecurityModel.g:459:2: ( rule__SecurityModel__ResourcesAssignment_6 )
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_6()); 
            // InternalSecurityModel.g:460:2: ( rule__SecurityModel__ResourcesAssignment_6 )
            // InternalSecurityModel.g:460:3: rule__SecurityModel__ResourcesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__ResourcesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_6()); 

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
    // InternalSecurityModel.g:468:1: rule__SecurityModel__Group__7 : rule__SecurityModel__Group__7__Impl rule__SecurityModel__Group__8 ;
    public final void rule__SecurityModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:472:1: ( rule__SecurityModel__Group__7__Impl rule__SecurityModel__Group__8 )
            // InternalSecurityModel.g:473:2: rule__SecurityModel__Group__7__Impl rule__SecurityModel__Group__8
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
    // InternalSecurityModel.g:480:1: rule__SecurityModel__Group__7__Impl : ( ( rule__SecurityModel__Group_7__0 )* ) ;
    public final void rule__SecurityModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:484:1: ( ( ( rule__SecurityModel__Group_7__0 )* ) )
            // InternalSecurityModel.g:485:1: ( ( rule__SecurityModel__Group_7__0 )* )
            {
            // InternalSecurityModel.g:485:1: ( ( rule__SecurityModel__Group_7__0 )* )
            // InternalSecurityModel.g:486:2: ( rule__SecurityModel__Group_7__0 )*
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_7()); 
            // InternalSecurityModel.g:487:2: ( rule__SecurityModel__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSecurityModel.g:487:3: rule__SecurityModel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SecurityModel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getGroup_7()); 

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
    // InternalSecurityModel.g:495:1: rule__SecurityModel__Group__8 : rule__SecurityModel__Group__8__Impl ;
    public final void rule__SecurityModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:499:1: ( rule__SecurityModel__Group__8__Impl )
            // InternalSecurityModel.g:500:2: rule__SecurityModel__Group__8__Impl
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
    // InternalSecurityModel.g:506:1: rule__SecurityModel__Group__8__Impl : ( ( rule__SecurityModel__Group_8__0 )? ) ;
    public final void rule__SecurityModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:510:1: ( ( ( rule__SecurityModel__Group_8__0 )? ) )
            // InternalSecurityModel.g:511:1: ( ( rule__SecurityModel__Group_8__0 )? )
            {
            // InternalSecurityModel.g:511:1: ( ( rule__SecurityModel__Group_8__0 )? )
            // InternalSecurityModel.g:512:2: ( rule__SecurityModel__Group_8__0 )?
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_8()); 
            // InternalSecurityModel.g:513:2: ( rule__SecurityModel__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSecurityModel.g:513:3: rule__SecurityModel__Group_8__0
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


    // $ANTLR start "rule__SecurityModel__Group_7__0"
    // InternalSecurityModel.g:522:1: rule__SecurityModel__Group_7__0 : rule__SecurityModel__Group_7__0__Impl rule__SecurityModel__Group_7__1 ;
    public final void rule__SecurityModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:526:1: ( rule__SecurityModel__Group_7__0__Impl rule__SecurityModel__Group_7__1 )
            // InternalSecurityModel.g:527:2: rule__SecurityModel__Group_7__0__Impl rule__SecurityModel__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__SecurityModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_7__1();

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
    // $ANTLR end "rule__SecurityModel__Group_7__0"


    // $ANTLR start "rule__SecurityModel__Group_7__0__Impl"
    // InternalSecurityModel.g:534:1: rule__SecurityModel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__SecurityModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:538:1: ( ( ',' ) )
            // InternalSecurityModel.g:539:1: ( ',' )
            {
            // InternalSecurityModel.g:539:1: ( ',' )
            // InternalSecurityModel.g:540:2: ','
            {
             before(grammarAccess.getSecurityModelAccess().getCommaKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__SecurityModel__Group_7__0__Impl"


    // $ANTLR start "rule__SecurityModel__Group_7__1"
    // InternalSecurityModel.g:549:1: rule__SecurityModel__Group_7__1 : rule__SecurityModel__Group_7__1__Impl ;
    public final void rule__SecurityModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:553:1: ( rule__SecurityModel__Group_7__1__Impl )
            // InternalSecurityModel.g:554:2: rule__SecurityModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group_7__1__Impl();

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
    // $ANTLR end "rule__SecurityModel__Group_7__1"


    // $ANTLR start "rule__SecurityModel__Group_7__1__Impl"
    // InternalSecurityModel.g:560:1: rule__SecurityModel__Group_7__1__Impl : ( ( rule__SecurityModel__ResourcesAssignment_7_1 ) ) ;
    public final void rule__SecurityModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:564:1: ( ( ( rule__SecurityModel__ResourcesAssignment_7_1 ) ) )
            // InternalSecurityModel.g:565:1: ( ( rule__SecurityModel__ResourcesAssignment_7_1 ) )
            {
            // InternalSecurityModel.g:565:1: ( ( rule__SecurityModel__ResourcesAssignment_7_1 ) )
            // InternalSecurityModel.g:566:2: ( rule__SecurityModel__ResourcesAssignment_7_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesAssignment_7_1()); 
            // InternalSecurityModel.g:567:2: ( rule__SecurityModel__ResourcesAssignment_7_1 )
            // InternalSecurityModel.g:567:3: rule__SecurityModel__ResourcesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__ResourcesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getResourcesAssignment_7_1()); 

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
    // $ANTLR end "rule__SecurityModel__Group_7__1__Impl"


    // $ANTLR start "rule__SecurityModel__Group_8__0"
    // InternalSecurityModel.g:576:1: rule__SecurityModel__Group_8__0 : rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1 ;
    public final void rule__SecurityModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:580:1: ( rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1 )
            // InternalSecurityModel.g:581:2: rule__SecurityModel__Group_8__0__Impl rule__SecurityModel__Group_8__1
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
    // InternalSecurityModel.g:588:1: rule__SecurityModel__Group_8__0__Impl : ( 'rules:' ) ;
    public final void rule__SecurityModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:592:1: ( ( 'rules:' ) )
            // InternalSecurityModel.g:593:1: ( 'rules:' )
            {
            // InternalSecurityModel.g:593:1: ( 'rules:' )
            // InternalSecurityModel.g:594:2: 'rules:'
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
    // InternalSecurityModel.g:603:1: rule__SecurityModel__Group_8__1 : rule__SecurityModel__Group_8__1__Impl ;
    public final void rule__SecurityModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:607:1: ( rule__SecurityModel__Group_8__1__Impl )
            // InternalSecurityModel.g:608:2: rule__SecurityModel__Group_8__1__Impl
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
    // InternalSecurityModel.g:614:1: rule__SecurityModel__Group_8__1__Impl : ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) ) ;
    public final void rule__SecurityModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:618:1: ( ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) ) )
            // InternalSecurityModel.g:619:1: ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) )
            {
            // InternalSecurityModel.g:619:1: ( ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* ) )
            // InternalSecurityModel.g:620:2: ( ( rule__SecurityModel__RulesAssignment_8_1 ) ) ( ( rule__SecurityModel__RulesAssignment_8_1 )* )
            {
            // InternalSecurityModel.g:620:2: ( ( rule__SecurityModel__RulesAssignment_8_1 ) )
            // InternalSecurityModel.g:621:3: ( rule__SecurityModel__RulesAssignment_8_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 
            // InternalSecurityModel.g:622:3: ( rule__SecurityModel__RulesAssignment_8_1 )
            // InternalSecurityModel.g:622:4: rule__SecurityModel__RulesAssignment_8_1
            {
            pushFollow(FOLLOW_7);
            rule__SecurityModel__RulesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 

            }

            // InternalSecurityModel.g:625:2: ( ( rule__SecurityModel__RulesAssignment_8_1 )* )
            // InternalSecurityModel.g:626:3: ( rule__SecurityModel__RulesAssignment_8_1 )*
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_1()); 
            // InternalSecurityModel.g:627:3: ( rule__SecurityModel__RulesAssignment_8_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSecurityModel.g:627:4: rule__SecurityModel__RulesAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalSecurityModel.g:637:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:641:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSecurityModel.g:642:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalSecurityModel.g:649:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:653:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalSecurityModel.g:654:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalSecurityModel.g:654:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalSecurityModel.g:655:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalSecurityModel.g:656:2: ( rule__Rule__NameAssignment_0 )
            // InternalSecurityModel.g:656:3: rule__Rule__NameAssignment_0
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
    // InternalSecurityModel.g:664:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:668:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSecurityModel.g:669:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalSecurityModel.g:676:1: rule__Rule__Group__1__Impl : ( ':' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:680:1: ( ( ':' ) )
            // InternalSecurityModel.g:681:1: ( ':' )
            {
            // InternalSecurityModel.g:681:1: ( ':' )
            // InternalSecurityModel.g:682:2: ':'
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
    // InternalSecurityModel.g:691:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:695:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSecurityModel.g:696:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalSecurityModel.g:703:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:707:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalSecurityModel.g:708:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalSecurityModel.g:708:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalSecurityModel.g:709:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalSecurityModel.g:710:2: ( rule__Rule__ActionAssignment_2 )
            // InternalSecurityModel.g:710:3: rule__Rule__ActionAssignment_2
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
    // InternalSecurityModel.g:718:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:722:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSecurityModel.g:723:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalSecurityModel.g:730:1: rule__Rule__Group__3__Impl : ( 'conditions' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:734:1: ( ( 'conditions' ) )
            // InternalSecurityModel.g:735:1: ( 'conditions' )
            {
            // InternalSecurityModel.g:735:1: ( 'conditions' )
            // InternalSecurityModel.g:736:2: 'conditions'
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
    // InternalSecurityModel.g:745:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:749:1: ( rule__Rule__Group__4__Impl )
            // InternalSecurityModel.g:750:2: rule__Rule__Group__4__Impl
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
    // InternalSecurityModel.g:756:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:760:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalSecurityModel.g:761:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalSecurityModel.g:761:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalSecurityModel.g:762:2: ( rule__Rule__Group_4__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalSecurityModel.g:763:2: ( rule__Rule__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityModel.g:763:3: rule__Rule__Group_4__0
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
    // InternalSecurityModel.g:772:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:776:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalSecurityModel.g:777:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
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
    // InternalSecurityModel.g:784:1: rule__Rule__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:788:1: ( ( '{' ) )
            // InternalSecurityModel.g:789:1: ( '{' )
            {
            // InternalSecurityModel.g:789:1: ( '{' )
            // InternalSecurityModel.g:790:2: '{'
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
    // InternalSecurityModel.g:799:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:803:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalSecurityModel.g:804:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
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
    // InternalSecurityModel.g:811:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__AuthsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:815:1: ( ( ( rule__Rule__AuthsAssignment_4_1 ) ) )
            // InternalSecurityModel.g:816:1: ( ( rule__Rule__AuthsAssignment_4_1 ) )
            {
            // InternalSecurityModel.g:816:1: ( ( rule__Rule__AuthsAssignment_4_1 ) )
            // InternalSecurityModel.g:817:2: ( rule__Rule__AuthsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_4_1()); 
            // InternalSecurityModel.g:818:2: ( rule__Rule__AuthsAssignment_4_1 )
            // InternalSecurityModel.g:818:3: rule__Rule__AuthsAssignment_4_1
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
    // InternalSecurityModel.g:826:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl rule__Rule__Group_4__3 ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:830:1: ( rule__Rule__Group_4__2__Impl rule__Rule__Group_4__3 )
            // InternalSecurityModel.g:831:2: rule__Rule__Group_4__2__Impl rule__Rule__Group_4__3
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
    // InternalSecurityModel.g:838:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:842:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalSecurityModel.g:843:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalSecurityModel.g:843:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalSecurityModel.g:844:2: ( rule__Rule__Group_4_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            // InternalSecurityModel.g:845:2: ( rule__Rule__Group_4_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecurityModel.g:845:3: rule__Rule__Group_4_2__0
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
    // InternalSecurityModel.g:853:1: rule__Rule__Group_4__3 : rule__Rule__Group_4__3__Impl ;
    public final void rule__Rule__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:857:1: ( rule__Rule__Group_4__3__Impl )
            // InternalSecurityModel.g:858:2: rule__Rule__Group_4__3__Impl
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
    // InternalSecurityModel.g:864:1: rule__Rule__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:868:1: ( ( '}' ) )
            // InternalSecurityModel.g:869:1: ( '}' )
            {
            // InternalSecurityModel.g:869:1: ( '}' )
            // InternalSecurityModel.g:870:2: '}'
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
    // InternalSecurityModel.g:880:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:884:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalSecurityModel.g:885:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
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
    // InternalSecurityModel.g:892:1: rule__Rule__Group_4_2__0__Impl : ( 'or' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:896:1: ( ( 'or' ) )
            // InternalSecurityModel.g:897:1: ( 'or' )
            {
            // InternalSecurityModel.g:897:1: ( 'or' )
            // InternalSecurityModel.g:898:2: 'or'
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
    // InternalSecurityModel.g:907:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:911:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalSecurityModel.g:912:2: rule__Rule__Group_4_2__1__Impl
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
    // InternalSecurityModel.g:918:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__AuthsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:922:1: ( ( ( rule__Rule__AuthsAssignment_4_2_1 ) ) )
            // InternalSecurityModel.g:923:1: ( ( rule__Rule__AuthsAssignment_4_2_1 ) )
            {
            // InternalSecurityModel.g:923:1: ( ( rule__Rule__AuthsAssignment_4_2_1 ) )
            // InternalSecurityModel.g:924:2: ( rule__Rule__AuthsAssignment_4_2_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_4_2_1()); 
            // InternalSecurityModel.g:925:2: ( rule__Rule__AuthsAssignment_4_2_1 )
            // InternalSecurityModel.g:925:3: rule__Rule__AuthsAssignment_4_2_1
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


    // $ANTLR start "rule__Auth__Group__0"
    // InternalSecurityModel.g:934:1: rule__Auth__Group__0 : rule__Auth__Group__0__Impl rule__Auth__Group__1 ;
    public final void rule__Auth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:938:1: ( rule__Auth__Group__0__Impl rule__Auth__Group__1 )
            // InternalSecurityModel.g:939:2: rule__Auth__Group__0__Impl rule__Auth__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSecurityModel.g:946:1: rule__Auth__Group__0__Impl : ( '{' ) ;
    public final void rule__Auth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:950:1: ( ( '{' ) )
            // InternalSecurityModel.g:951:1: ( '{' )
            {
            // InternalSecurityModel.g:951:1: ( '{' )
            // InternalSecurityModel.g:952:2: '{'
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
    // InternalSecurityModel.g:961:1: rule__Auth__Group__1 : rule__Auth__Group__1__Impl rule__Auth__Group__2 ;
    public final void rule__Auth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:965:1: ( rule__Auth__Group__1__Impl rule__Auth__Group__2 )
            // InternalSecurityModel.g:966:2: rule__Auth__Group__1__Impl rule__Auth__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecurityModel.g:973:1: rule__Auth__Group__1__Impl : ( 'roles' ) ;
    public final void rule__Auth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:977:1: ( ( 'roles' ) )
            // InternalSecurityModel.g:978:1: ( 'roles' )
            {
            // InternalSecurityModel.g:978:1: ( 'roles' )
            // InternalSecurityModel.g:979:2: 'roles'
            {
             before(grammarAccess.getAuthAccess().getRolesKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSecurityModel.g:988:1: rule__Auth__Group__2 : rule__Auth__Group__2__Impl rule__Auth__Group__3 ;
    public final void rule__Auth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:992:1: ( rule__Auth__Group__2__Impl rule__Auth__Group__3 )
            // InternalSecurityModel.g:993:2: rule__Auth__Group__2__Impl rule__Auth__Group__3
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
    // InternalSecurityModel.g:1000:1: rule__Auth__Group__2__Impl : ( '(' ) ;
    public final void rule__Auth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1004:1: ( ( '(' ) )
            // InternalSecurityModel.g:1005:1: ( '(' )
            {
            // InternalSecurityModel.g:1005:1: ( '(' )
            // InternalSecurityModel.g:1006:2: '('
            {
             before(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSecurityModel.g:1015:1: rule__Auth__Group__3 : rule__Auth__Group__3__Impl rule__Auth__Group__4 ;
    public final void rule__Auth__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1019:1: ( rule__Auth__Group__3__Impl rule__Auth__Group__4 )
            // InternalSecurityModel.g:1020:2: rule__Auth__Group__3__Impl rule__Auth__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecurityModel.g:1027:1: rule__Auth__Group__3__Impl : ( ( rule__Auth__RolesAssignment_3 ) ) ;
    public final void rule__Auth__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1031:1: ( ( ( rule__Auth__RolesAssignment_3 ) ) )
            // InternalSecurityModel.g:1032:1: ( ( rule__Auth__RolesAssignment_3 ) )
            {
            // InternalSecurityModel.g:1032:1: ( ( rule__Auth__RolesAssignment_3 ) )
            // InternalSecurityModel.g:1033:2: ( rule__Auth__RolesAssignment_3 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_3()); 
            // InternalSecurityModel.g:1034:2: ( rule__Auth__RolesAssignment_3 )
            // InternalSecurityModel.g:1034:3: rule__Auth__RolesAssignment_3
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
    // InternalSecurityModel.g:1042:1: rule__Auth__Group__4 : rule__Auth__Group__4__Impl rule__Auth__Group__5 ;
    public final void rule__Auth__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1046:1: ( rule__Auth__Group__4__Impl rule__Auth__Group__5 )
            // InternalSecurityModel.g:1047:2: rule__Auth__Group__4__Impl rule__Auth__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSecurityModel.g:1054:1: rule__Auth__Group__4__Impl : ( ( rule__Auth__Group_4__0 )* ) ;
    public final void rule__Auth__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1058:1: ( ( ( rule__Auth__Group_4__0 )* ) )
            // InternalSecurityModel.g:1059:1: ( ( rule__Auth__Group_4__0 )* )
            {
            // InternalSecurityModel.g:1059:1: ( ( rule__Auth__Group_4__0 )* )
            // InternalSecurityModel.g:1060:2: ( rule__Auth__Group_4__0 )*
            {
             before(grammarAccess.getAuthAccess().getGroup_4()); 
            // InternalSecurityModel.g:1061:2: ( rule__Auth__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecurityModel.g:1061:3: rule__Auth__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalSecurityModel.g:1069:1: rule__Auth__Group__5 : rule__Auth__Group__5__Impl rule__Auth__Group__6 ;
    public final void rule__Auth__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1073:1: ( rule__Auth__Group__5__Impl rule__Auth__Group__6 )
            // InternalSecurityModel.g:1074:2: rule__Auth__Group__5__Impl rule__Auth__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalSecurityModel.g:1081:1: rule__Auth__Group__5__Impl : ( ')' ) ;
    public final void rule__Auth__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1085:1: ( ( ')' ) )
            // InternalSecurityModel.g:1086:1: ( ')' )
            {
            // InternalSecurityModel.g:1086:1: ( ')' )
            // InternalSecurityModel.g:1087:2: ')'
            {
             before(grammarAccess.getAuthAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSecurityModel.g:1096:1: rule__Auth__Group__6 : rule__Auth__Group__6__Impl rule__Auth__Group__7 ;
    public final void rule__Auth__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1100:1: ( rule__Auth__Group__6__Impl rule__Auth__Group__7 )
            // InternalSecurityModel.g:1101:2: rule__Auth__Group__6__Impl rule__Auth__Group__7
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
    // InternalSecurityModel.g:1108:1: rule__Auth__Group__6__Impl : ( 'context:' ) ;
    public final void rule__Auth__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1112:1: ( ( 'context:' ) )
            // InternalSecurityModel.g:1113:1: ( 'context:' )
            {
            // InternalSecurityModel.g:1113:1: ( 'context:' )
            // InternalSecurityModel.g:1114:2: 'context:'
            {
             before(grammarAccess.getAuthAccess().getContextKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSecurityModel.g:1123:1: rule__Auth__Group__7 : rule__Auth__Group__7__Impl rule__Auth__Group__8 ;
    public final void rule__Auth__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1127:1: ( rule__Auth__Group__7__Impl rule__Auth__Group__8 )
            // InternalSecurityModel.g:1128:2: rule__Auth__Group__7__Impl rule__Auth__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalSecurityModel.g:1135:1: rule__Auth__Group__7__Impl : ( ( rule__Auth__TextualAssignment_7 ) ) ;
    public final void rule__Auth__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1139:1: ( ( ( rule__Auth__TextualAssignment_7 ) ) )
            // InternalSecurityModel.g:1140:1: ( ( rule__Auth__TextualAssignment_7 ) )
            {
            // InternalSecurityModel.g:1140:1: ( ( rule__Auth__TextualAssignment_7 ) )
            // InternalSecurityModel.g:1141:2: ( rule__Auth__TextualAssignment_7 )
            {
             before(grammarAccess.getAuthAccess().getTextualAssignment_7()); 
            // InternalSecurityModel.g:1142:2: ( rule__Auth__TextualAssignment_7 )
            // InternalSecurityModel.g:1142:3: rule__Auth__TextualAssignment_7
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
    // InternalSecurityModel.g:1150:1: rule__Auth__Group__8 : rule__Auth__Group__8__Impl rule__Auth__Group__9 ;
    public final void rule__Auth__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1154:1: ( rule__Auth__Group__8__Impl rule__Auth__Group__9 )
            // InternalSecurityModel.g:1155:2: rule__Auth__Group__8__Impl rule__Auth__Group__9
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
    // InternalSecurityModel.g:1162:1: rule__Auth__Group__8__Impl : ( 'ocl:' ) ;
    public final void rule__Auth__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1166:1: ( ( 'ocl:' ) )
            // InternalSecurityModel.g:1167:1: ( 'ocl:' )
            {
            // InternalSecurityModel.g:1167:1: ( 'ocl:' )
            // InternalSecurityModel.g:1168:2: 'ocl:'
            {
             before(grammarAccess.getAuthAccess().getOclKeyword_8()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSecurityModel.g:1177:1: rule__Auth__Group__9 : rule__Auth__Group__9__Impl rule__Auth__Group__10 ;
    public final void rule__Auth__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1181:1: ( rule__Auth__Group__9__Impl rule__Auth__Group__10 )
            // InternalSecurityModel.g:1182:2: rule__Auth__Group__9__Impl rule__Auth__Group__10
            {
            pushFollow(FOLLOW_21);
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
    // InternalSecurityModel.g:1189:1: rule__Auth__Group__9__Impl : ( ( rule__Auth__OclExpAssignment_9 ) ) ;
    public final void rule__Auth__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1193:1: ( ( ( rule__Auth__OclExpAssignment_9 ) ) )
            // InternalSecurityModel.g:1194:1: ( ( rule__Auth__OclExpAssignment_9 ) )
            {
            // InternalSecurityModel.g:1194:1: ( ( rule__Auth__OclExpAssignment_9 ) )
            // InternalSecurityModel.g:1195:2: ( rule__Auth__OclExpAssignment_9 )
            {
             before(grammarAccess.getAuthAccess().getOclExpAssignment_9()); 
            // InternalSecurityModel.g:1196:2: ( rule__Auth__OclExpAssignment_9 )
            // InternalSecurityModel.g:1196:3: rule__Auth__OclExpAssignment_9
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
    // InternalSecurityModel.g:1204:1: rule__Auth__Group__10 : rule__Auth__Group__10__Impl rule__Auth__Group__11 ;
    public final void rule__Auth__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1208:1: ( rule__Auth__Group__10__Impl rule__Auth__Group__11 )
            // InternalSecurityModel.g:1209:2: rule__Auth__Group__10__Impl rule__Auth__Group__11
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
    // InternalSecurityModel.g:1216:1: rule__Auth__Group__10__Impl : ( 'sql:' ) ;
    public final void rule__Auth__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1220:1: ( ( 'sql:' ) )
            // InternalSecurityModel.g:1221:1: ( 'sql:' )
            {
            // InternalSecurityModel.g:1221:1: ( 'sql:' )
            // InternalSecurityModel.g:1222:2: 'sql:'
            {
             before(grammarAccess.getAuthAccess().getSqlKeyword_10()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSecurityModel.g:1231:1: rule__Auth__Group__11 : rule__Auth__Group__11__Impl rule__Auth__Group__12 ;
    public final void rule__Auth__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1235:1: ( rule__Auth__Group__11__Impl rule__Auth__Group__12 )
            // InternalSecurityModel.g:1236:2: rule__Auth__Group__11__Impl rule__Auth__Group__12
            {
            pushFollow(FOLLOW_22);
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
    // InternalSecurityModel.g:1243:1: rule__Auth__Group__11__Impl : ( ( rule__Auth__SqlStmAssignment_11 ) ) ;
    public final void rule__Auth__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1247:1: ( ( ( rule__Auth__SqlStmAssignment_11 ) ) )
            // InternalSecurityModel.g:1248:1: ( ( rule__Auth__SqlStmAssignment_11 ) )
            {
            // InternalSecurityModel.g:1248:1: ( ( rule__Auth__SqlStmAssignment_11 ) )
            // InternalSecurityModel.g:1249:2: ( rule__Auth__SqlStmAssignment_11 )
            {
             before(grammarAccess.getAuthAccess().getSqlStmAssignment_11()); 
            // InternalSecurityModel.g:1250:2: ( rule__Auth__SqlStmAssignment_11 )
            // InternalSecurityModel.g:1250:3: rule__Auth__SqlStmAssignment_11
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
    // InternalSecurityModel.g:1258:1: rule__Auth__Group__12 : rule__Auth__Group__12__Impl ;
    public final void rule__Auth__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1262:1: ( rule__Auth__Group__12__Impl )
            // InternalSecurityModel.g:1263:2: rule__Auth__Group__12__Impl
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
    // InternalSecurityModel.g:1269:1: rule__Auth__Group__12__Impl : ( '}' ) ;
    public final void rule__Auth__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1273:1: ( ( '}' ) )
            // InternalSecurityModel.g:1274:1: ( '}' )
            {
            // InternalSecurityModel.g:1274:1: ( '}' )
            // InternalSecurityModel.g:1275:2: '}'
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
    // InternalSecurityModel.g:1285:1: rule__Auth__Group_4__0 : rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1 ;
    public final void rule__Auth__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1289:1: ( rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1 )
            // InternalSecurityModel.g:1290:2: rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1
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
    // InternalSecurityModel.g:1297:1: rule__Auth__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Auth__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1301:1: ( ( ',' ) )
            // InternalSecurityModel.g:1302:1: ( ',' )
            {
            // InternalSecurityModel.g:1302:1: ( ',' )
            // InternalSecurityModel.g:1303:2: ','
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
    // InternalSecurityModel.g:1312:1: rule__Auth__Group_4__1 : rule__Auth__Group_4__1__Impl ;
    public final void rule__Auth__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1316:1: ( rule__Auth__Group_4__1__Impl )
            // InternalSecurityModel.g:1317:2: rule__Auth__Group_4__1__Impl
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
    // InternalSecurityModel.g:1323:1: rule__Auth__Group_4__1__Impl : ( ( rule__Auth__RolesAssignment_4_1 ) ) ;
    public final void rule__Auth__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1327:1: ( ( ( rule__Auth__RolesAssignment_4_1 ) ) )
            // InternalSecurityModel.g:1328:1: ( ( rule__Auth__RolesAssignment_4_1 ) )
            {
            // InternalSecurityModel.g:1328:1: ( ( rule__Auth__RolesAssignment_4_1 ) )
            // InternalSecurityModel.g:1329:2: ( rule__Auth__RolesAssignment_4_1 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_4_1()); 
            // InternalSecurityModel.g:1330:2: ( rule__Auth__RolesAssignment_4_1 )
            // InternalSecurityModel.g:1330:3: rule__Auth__RolesAssignment_4_1
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
    // InternalSecurityModel.g:1339:1: rule__ProtectedResource__Group__0 : rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1 ;
    public final void rule__ProtectedResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1343:1: ( rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1 )
            // InternalSecurityModel.g:1344:2: rule__ProtectedResource__Group__0__Impl rule__ProtectedResource__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSecurityModel.g:1351:1: rule__ProtectedResource__Group__0__Impl : ( '(' ) ;
    public final void rule__ProtectedResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1355:1: ( ( '(' ) )
            // InternalSecurityModel.g:1356:1: ( '(' )
            {
            // InternalSecurityModel.g:1356:1: ( '(' )
            // InternalSecurityModel.g:1357:2: '('
            {
             before(grammarAccess.getProtectedResourceAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSecurityModel.g:1366:1: rule__ProtectedResource__Group__1 : rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2 ;
    public final void rule__ProtectedResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1370:1: ( rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2 )
            // InternalSecurityModel.g:1371:2: rule__ProtectedResource__Group__1__Impl rule__ProtectedResource__Group__2
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
    // InternalSecurityModel.g:1378:1: rule__ProtectedResource__Group__1__Impl : ( ( rule__ProtectedResource__PropertyAssignment_1 ) ) ;
    public final void rule__ProtectedResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1382:1: ( ( ( rule__ProtectedResource__PropertyAssignment_1 ) ) )
            // InternalSecurityModel.g:1383:1: ( ( rule__ProtectedResource__PropertyAssignment_1 ) )
            {
            // InternalSecurityModel.g:1383:1: ( ( rule__ProtectedResource__PropertyAssignment_1 ) )
            // InternalSecurityModel.g:1384:2: ( rule__ProtectedResource__PropertyAssignment_1 )
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_1()); 
            // InternalSecurityModel.g:1385:2: ( rule__ProtectedResource__PropertyAssignment_1 )
            // InternalSecurityModel.g:1385:3: rule__ProtectedResource__PropertyAssignment_1
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
    // InternalSecurityModel.g:1393:1: rule__ProtectedResource__Group__2 : rule__ProtectedResource__Group__2__Impl rule__ProtectedResource__Group__3 ;
    public final void rule__ProtectedResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1397:1: ( rule__ProtectedResource__Group__2__Impl rule__ProtectedResource__Group__3 )
            // InternalSecurityModel.g:1398:2: rule__ProtectedResource__Group__2__Impl rule__ProtectedResource__Group__3
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
    // InternalSecurityModel.g:1405:1: rule__ProtectedResource__Group__2__Impl : ( 'as' ) ;
    public final void rule__ProtectedResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1409:1: ( ( 'as' ) )
            // InternalSecurityModel.g:1410:1: ( 'as' )
            {
            // InternalSecurityModel.g:1410:1: ( 'as' )
            // InternalSecurityModel.g:1411:2: 'as'
            {
             before(grammarAccess.getProtectedResourceAccess().getAsKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSecurityModel.g:1420:1: rule__ProtectedResource__Group__3 : rule__ProtectedResource__Group__3__Impl rule__ProtectedResource__Group__4 ;
    public final void rule__ProtectedResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1424:1: ( rule__ProtectedResource__Group__3__Impl rule__ProtectedResource__Group__4 )
            // InternalSecurityModel.g:1425:2: rule__ProtectedResource__Group__3__Impl rule__ProtectedResource__Group__4
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
    // InternalSecurityModel.g:1432:1: rule__ProtectedResource__Group__3__Impl : ( ( rule__ProtectedResource__NameAssignment_3 ) ) ;
    public final void rule__ProtectedResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1436:1: ( ( ( rule__ProtectedResource__NameAssignment_3 ) ) )
            // InternalSecurityModel.g:1437:1: ( ( rule__ProtectedResource__NameAssignment_3 ) )
            {
            // InternalSecurityModel.g:1437:1: ( ( rule__ProtectedResource__NameAssignment_3 ) )
            // InternalSecurityModel.g:1438:2: ( rule__ProtectedResource__NameAssignment_3 )
            {
             before(grammarAccess.getProtectedResourceAccess().getNameAssignment_3()); 
            // InternalSecurityModel.g:1439:2: ( rule__ProtectedResource__NameAssignment_3 )
            // InternalSecurityModel.g:1439:3: rule__ProtectedResource__NameAssignment_3
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
    // InternalSecurityModel.g:1447:1: rule__ProtectedResource__Group__4 : rule__ProtectedResource__Group__4__Impl ;
    public final void rule__ProtectedResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1451:1: ( rule__ProtectedResource__Group__4__Impl )
            // InternalSecurityModel.g:1452:2: rule__ProtectedResource__Group__4__Impl
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
    // InternalSecurityModel.g:1458:1: rule__ProtectedResource__Group__4__Impl : ( ')' ) ;
    public final void rule__ProtectedResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1462:1: ( ( ')' ) )
            // InternalSecurityModel.g:1463:1: ( ')' )
            {
            // InternalSecurityModel.g:1463:1: ( ')' )
            // InternalSecurityModel.g:1464:2: ')'
            {
             before(grammarAccess.getProtectedResourceAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSecurityModel.g:1474:1: rule__SecurityModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SecurityModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1478:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1479:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1479:2: ( ruleEString )
            // InternalSecurityModel.g:1480:3: ruleEString
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


    // $ANTLR start "rule__SecurityModel__RolesAssignment_4"
    // InternalSecurityModel.g:1489:1: rule__SecurityModel__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__SecurityModel__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1493:1: ( ( ruleRole ) )
            // InternalSecurityModel.g:1494:2: ( ruleRole )
            {
            // InternalSecurityModel.g:1494:2: ( ruleRole )
            // InternalSecurityModel.g:1495:3: ruleRole
            {
             before(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRolesRoleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SecurityModel__RolesAssignment_4"


    // $ANTLR start "rule__SecurityModel__ResourcesAssignment_6"
    // InternalSecurityModel.g:1504:1: rule__SecurityModel__ResourcesAssignment_6 : ( ruleProtectedResource ) ;
    public final void rule__SecurityModel__ResourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1508:1: ( ( ruleProtectedResource ) )
            // InternalSecurityModel.g:1509:2: ( ruleProtectedResource )
            {
            // InternalSecurityModel.g:1509:2: ( ruleProtectedResource )
            // InternalSecurityModel.g:1510:3: ruleProtectedResource
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SecurityModel__ResourcesAssignment_6"


    // $ANTLR start "rule__SecurityModel__ResourcesAssignment_7_1"
    // InternalSecurityModel.g:1519:1: rule__SecurityModel__ResourcesAssignment_7_1 : ( ruleProtectedResource ) ;
    public final void rule__SecurityModel__ResourcesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1523:1: ( ( ruleProtectedResource ) )
            // InternalSecurityModel.g:1524:2: ( ruleProtectedResource )
            {
            // InternalSecurityModel.g:1524:2: ( ruleProtectedResource )
            // InternalSecurityModel.g:1525:3: ruleProtectedResource
            {
             before(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtectedResource();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getResourcesProtectedResourceParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__SecurityModel__ResourcesAssignment_7_1"


    // $ANTLR start "rule__SecurityModel__RulesAssignment_8_1"
    // InternalSecurityModel.g:1534:1: rule__SecurityModel__RulesAssignment_8_1 : ( ruleRule ) ;
    public final void rule__SecurityModel__RulesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1538:1: ( ( ruleRule ) )
            // InternalSecurityModel.g:1539:2: ( ruleRule )
            {
            // InternalSecurityModel.g:1539:2: ( ruleRule )
            // InternalSecurityModel.g:1540:3: ruleRule
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
    // InternalSecurityModel.g:1549:1: rule__Rule__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1553:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1554:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1554:2: ( ruleEString )
            // InternalSecurityModel.g:1555:3: ruleEString
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
    // InternalSecurityModel.g:1564:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1568:1: ( ( ruleAction ) )
            // InternalSecurityModel.g:1569:2: ( ruleAction )
            {
            // InternalSecurityModel.g:1569:2: ( ruleAction )
            // InternalSecurityModel.g:1570:3: ruleAction
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
    // InternalSecurityModel.g:1579:1: rule__Rule__AuthsAssignment_4_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1583:1: ( ( ruleAuth ) )
            // InternalSecurityModel.g:1584:2: ( ruleAuth )
            {
            // InternalSecurityModel.g:1584:2: ( ruleAuth )
            // InternalSecurityModel.g:1585:3: ruleAuth
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
    // InternalSecurityModel.g:1594:1: rule__Rule__AuthsAssignment_4_2_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1598:1: ( ( ruleAuth ) )
            // InternalSecurityModel.g:1599:2: ( ruleAuth )
            {
            // InternalSecurityModel.g:1599:2: ( ruleAuth )
            // InternalSecurityModel.g:1600:3: ruleAuth
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


    // $ANTLR start "rule__Role__NameAssignment"
    // InternalSecurityModel.g:1609:1: rule__Role__NameAssignment : ( ruleEString ) ;
    public final void rule__Role__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1613:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1614:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1614:2: ( ruleEString )
            // InternalSecurityModel.g:1615:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__Role__NameAssignment"


    // $ANTLR start "rule__Auth__RolesAssignment_3"
    // InternalSecurityModel.g:1624:1: rule__Auth__RolesAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1628:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1629:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1629:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1630:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0()); 
            // InternalSecurityModel.g:1631:3: ( ruleEString )
            // InternalSecurityModel.g:1632:4: ruleEString
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
    // InternalSecurityModel.g:1643:1: rule__Auth__RolesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1647:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1648:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1648:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1649:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalSecurityModel.g:1650:3: ( ruleEString )
            // InternalSecurityModel.g:1651:4: ruleEString
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
    // InternalSecurityModel.g:1662:1: rule__Auth__TextualAssignment_7 : ( ruleEString ) ;
    public final void rule__Auth__TextualAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1666:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1667:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1667:2: ( ruleEString )
            // InternalSecurityModel.g:1668:3: ruleEString
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
    // InternalSecurityModel.g:1677:1: rule__Auth__OclExpAssignment_9 : ( ruleEString ) ;
    public final void rule__Auth__OclExpAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1681:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1682:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1682:2: ( ruleEString )
            // InternalSecurityModel.g:1683:3: ruleEString
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
    // InternalSecurityModel.g:1692:1: rule__Auth__SqlStmAssignment_11 : ( ruleEString ) ;
    public final void rule__Auth__SqlStmAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1696:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1697:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1697:2: ( ruleEString )
            // InternalSecurityModel.g:1698:3: ruleEString
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
    // InternalSecurityModel.g:1707:1: rule__ProtectedResource__PropertyAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProtectedResource__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1711:1: ( ( ( RULE_ID ) ) )
            // InternalSecurityModel.g:1712:2: ( ( RULE_ID ) )
            {
            // InternalSecurityModel.g:1712:2: ( ( RULE_ID ) )
            // InternalSecurityModel.g:1713:3: ( RULE_ID )
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyCrossReference_1_0()); 
            // InternalSecurityModel.g:1714:3: ( RULE_ID )
            // InternalSecurityModel.g:1715:4: RULE_ID
            {
             before(grammarAccess.getProtectedResourceAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProtectedResourceAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); 

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
    // InternalSecurityModel.g:1726:1: rule__ProtectedResource__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ProtectedResource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1730:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1731:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1731:2: ( ruleEString )
            // InternalSecurityModel.g:1732:3: ruleEString
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'READ'", "'CREATE'", "'UPDATE'", "'DELETE'", "'name:'", "'roles:'", "'rules:'", "':'", "'('", "')'", "'conditions'", "','", "'{'", "'}'", "',or'", "'<-'", "'roles'", "'context:'", "'ocl:'", "'sql:'"
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
    // InternalSecurityModel.g:137:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:141:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSecurityModel.g:142:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSecurityModel.g:142:2: ( ( rule__Role__Group__0 ) )
            // InternalSecurityModel.g:143:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSecurityModel.g:144:3: ( rule__Role__Group__0 )
            // InternalSecurityModel.g:144:4: rule__Role__Group__0
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


    // $ANTLR start "ruleAction"
    // InternalSecurityModel.g:178:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:182:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalSecurityModel.g:183:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalSecurityModel.g:183:2: ( ( rule__Action__Alternatives ) )
            // InternalSecurityModel.g:184:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalSecurityModel.g:185:3: ( rule__Action__Alternatives )
            // InternalSecurityModel.g:185:4: rule__Action__Alternatives
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
    // InternalSecurityModel.g:193:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:197:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSecurityModel.g:198:2: ( RULE_STRING )
                    {
                    // InternalSecurityModel.g:198:2: ( RULE_STRING )
                    // InternalSecurityModel.g:199:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityModel.g:204:2: ( RULE_ID )
                    {
                    // InternalSecurityModel.g:204:2: ( RULE_ID )
                    // InternalSecurityModel.g:205:3: RULE_ID
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
    // InternalSecurityModel.g:214:1: rule__Action__Alternatives : ( ( ( 'READ' ) ) | ( ( 'CREATE' ) ) | ( ( 'UPDATE' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:218:1: ( ( ( 'READ' ) ) | ( ( 'CREATE' ) ) | ( ( 'UPDATE' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalSecurityModel.g:219:2: ( ( 'READ' ) )
                    {
                    // InternalSecurityModel.g:219:2: ( ( 'READ' ) )
                    // InternalSecurityModel.g:220:3: ( 'READ' )
                    {
                     before(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalSecurityModel.g:221:3: ( 'READ' )
                    // InternalSecurityModel.g:221:4: 'READ'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSecurityModel.g:225:2: ( ( 'CREATE' ) )
                    {
                    // InternalSecurityModel.g:225:2: ( ( 'CREATE' ) )
                    // InternalSecurityModel.g:226:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); 
                    // InternalSecurityModel.g:227:3: ( 'CREATE' )
                    // InternalSecurityModel.g:227:4: 'CREATE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getCREATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSecurityModel.g:231:2: ( ( 'UPDATE' ) )
                    {
                    // InternalSecurityModel.g:231:2: ( ( 'UPDATE' ) )
                    // InternalSecurityModel.g:232:3: ( 'UPDATE' )
                    {
                     before(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); 
                    // InternalSecurityModel.g:233:3: ( 'UPDATE' )
                    // InternalSecurityModel.g:233:4: 'UPDATE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getUPDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSecurityModel.g:237:2: ( ( 'DELETE' ) )
                    {
                    // InternalSecurityModel.g:237:2: ( ( 'DELETE' ) )
                    // InternalSecurityModel.g:238:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getActionAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalSecurityModel.g:239:3: ( 'DELETE' )
                    // InternalSecurityModel.g:239:4: 'DELETE'
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
    // InternalSecurityModel.g:247:1: rule__SecurityModel__Group__0 : rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1 ;
    public final void rule__SecurityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:251:1: ( rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1 )
            // InternalSecurityModel.g:252:2: rule__SecurityModel__Group__0__Impl rule__SecurityModel__Group__1
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
    // InternalSecurityModel.g:259:1: rule__SecurityModel__Group__0__Impl : ( () ) ;
    public final void rule__SecurityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:263:1: ( ( () ) )
            // InternalSecurityModel.g:264:1: ( () )
            {
            // InternalSecurityModel.g:264:1: ( () )
            // InternalSecurityModel.g:265:2: ()
            {
             before(grammarAccess.getSecurityModelAccess().getSecurityModelAction_0()); 
            // InternalSecurityModel.g:266:2: ()
            // InternalSecurityModel.g:266:3: 
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
    // InternalSecurityModel.g:274:1: rule__SecurityModel__Group__1 : rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2 ;
    public final void rule__SecurityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:278:1: ( rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2 )
            // InternalSecurityModel.g:279:2: rule__SecurityModel__Group__1__Impl rule__SecurityModel__Group__2
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
    // InternalSecurityModel.g:286:1: rule__SecurityModel__Group__1__Impl : ( 'name:' ) ;
    public final void rule__SecurityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:290:1: ( ( 'name:' ) )
            // InternalSecurityModel.g:291:1: ( 'name:' )
            {
            // InternalSecurityModel.g:291:1: ( 'name:' )
            // InternalSecurityModel.g:292:2: 'name:'
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
    // InternalSecurityModel.g:301:1: rule__SecurityModel__Group__2 : rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3 ;
    public final void rule__SecurityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:305:1: ( rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3 )
            // InternalSecurityModel.g:306:2: rule__SecurityModel__Group__2__Impl rule__SecurityModel__Group__3
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
    // InternalSecurityModel.g:313:1: rule__SecurityModel__Group__2__Impl : ( ( rule__SecurityModel__NameAssignment_2 ) ) ;
    public final void rule__SecurityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:317:1: ( ( ( rule__SecurityModel__NameAssignment_2 ) ) )
            // InternalSecurityModel.g:318:1: ( ( rule__SecurityModel__NameAssignment_2 ) )
            {
            // InternalSecurityModel.g:318:1: ( ( rule__SecurityModel__NameAssignment_2 ) )
            // InternalSecurityModel.g:319:2: ( rule__SecurityModel__NameAssignment_2 )
            {
             before(grammarAccess.getSecurityModelAccess().getNameAssignment_2()); 
            // InternalSecurityModel.g:320:2: ( rule__SecurityModel__NameAssignment_2 )
            // InternalSecurityModel.g:320:3: rule__SecurityModel__NameAssignment_2
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
    // InternalSecurityModel.g:328:1: rule__SecurityModel__Group__3 : rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4 ;
    public final void rule__SecurityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:332:1: ( rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4 )
            // InternalSecurityModel.g:333:2: rule__SecurityModel__Group__3__Impl rule__SecurityModel__Group__4
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
    // InternalSecurityModel.g:340:1: rule__SecurityModel__Group__3__Impl : ( 'roles:' ) ;
    public final void rule__SecurityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:344:1: ( ( 'roles:' ) )
            // InternalSecurityModel.g:345:1: ( 'roles:' )
            {
            // InternalSecurityModel.g:345:1: ( 'roles:' )
            // InternalSecurityModel.g:346:2: 'roles:'
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
    // InternalSecurityModel.g:355:1: rule__SecurityModel__Group__4 : rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5 ;
    public final void rule__SecurityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:359:1: ( rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5 )
            // InternalSecurityModel.g:360:2: rule__SecurityModel__Group__4__Impl rule__SecurityModel__Group__5
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
    // InternalSecurityModel.g:367:1: rule__SecurityModel__Group__4__Impl : ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) ) ;
    public final void rule__SecurityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:371:1: ( ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) ) )
            // InternalSecurityModel.g:372:1: ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) )
            {
            // InternalSecurityModel.g:372:1: ( ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* ) )
            // InternalSecurityModel.g:373:2: ( ( rule__SecurityModel__RolesAssignment_4 ) ) ( ( rule__SecurityModel__RolesAssignment_4 )* )
            {
            // InternalSecurityModel.g:373:2: ( ( rule__SecurityModel__RolesAssignment_4 ) )
            // InternalSecurityModel.g:374:3: ( rule__SecurityModel__RolesAssignment_4 )
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 
            // InternalSecurityModel.g:375:3: ( rule__SecurityModel__RolesAssignment_4 )
            // InternalSecurityModel.g:375:4: rule__SecurityModel__RolesAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__SecurityModel__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 

            }

            // InternalSecurityModel.g:378:2: ( ( rule__SecurityModel__RolesAssignment_4 )* )
            // InternalSecurityModel.g:379:3: ( rule__SecurityModel__RolesAssignment_4 )*
            {
             before(grammarAccess.getSecurityModelAccess().getRolesAssignment_4()); 
            // InternalSecurityModel.g:380:3: ( rule__SecurityModel__RolesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSecurityModel.g:380:4: rule__SecurityModel__RolesAssignment_4
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
    // InternalSecurityModel.g:389:1: rule__SecurityModel__Group__5 : rule__SecurityModel__Group__5__Impl ;
    public final void rule__SecurityModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:393:1: ( rule__SecurityModel__Group__5__Impl )
            // InternalSecurityModel.g:394:2: rule__SecurityModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityModel__Group__5__Impl();

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
    // InternalSecurityModel.g:400:1: rule__SecurityModel__Group__5__Impl : ( ( rule__SecurityModel__Group_5__0 )? ) ;
    public final void rule__SecurityModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:404:1: ( ( ( rule__SecurityModel__Group_5__0 )? ) )
            // InternalSecurityModel.g:405:1: ( ( rule__SecurityModel__Group_5__0 )? )
            {
            // InternalSecurityModel.g:405:1: ( ( rule__SecurityModel__Group_5__0 )? )
            // InternalSecurityModel.g:406:2: ( rule__SecurityModel__Group_5__0 )?
            {
             before(grammarAccess.getSecurityModelAccess().getGroup_5()); 
            // InternalSecurityModel.g:407:2: ( rule__SecurityModel__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecurityModel.g:407:3: rule__SecurityModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecurityModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__SecurityModel__Group_5__0"
    // InternalSecurityModel.g:416:1: rule__SecurityModel__Group_5__0 : rule__SecurityModel__Group_5__0__Impl rule__SecurityModel__Group_5__1 ;
    public final void rule__SecurityModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:420:1: ( rule__SecurityModel__Group_5__0__Impl rule__SecurityModel__Group_5__1 )
            // InternalSecurityModel.g:421:2: rule__SecurityModel__Group_5__0__Impl rule__SecurityModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityModel.g:428:1: rule__SecurityModel__Group_5__0__Impl : ( 'rules:' ) ;
    public final void rule__SecurityModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:432:1: ( ( 'rules:' ) )
            // InternalSecurityModel.g:433:1: ( 'rules:' )
            {
            // InternalSecurityModel.g:433:1: ( 'rules:' )
            // InternalSecurityModel.g:434:2: 'rules:'
            {
             before(grammarAccess.getSecurityModelAccess().getRulesKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecurityModelAccess().getRulesKeyword_5_0()); 

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
    // InternalSecurityModel.g:443:1: rule__SecurityModel__Group_5__1 : rule__SecurityModel__Group_5__1__Impl ;
    public final void rule__SecurityModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:447:1: ( rule__SecurityModel__Group_5__1__Impl )
            // InternalSecurityModel.g:448:2: rule__SecurityModel__Group_5__1__Impl
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
    // InternalSecurityModel.g:454:1: rule__SecurityModel__Group_5__1__Impl : ( ( ( rule__SecurityModel__RulesAssignment_5_1 ) ) ( ( rule__SecurityModel__RulesAssignment_5_1 )* ) ) ;
    public final void rule__SecurityModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:458:1: ( ( ( ( rule__SecurityModel__RulesAssignment_5_1 ) ) ( ( rule__SecurityModel__RulesAssignment_5_1 )* ) ) )
            // InternalSecurityModel.g:459:1: ( ( ( rule__SecurityModel__RulesAssignment_5_1 ) ) ( ( rule__SecurityModel__RulesAssignment_5_1 )* ) )
            {
            // InternalSecurityModel.g:459:1: ( ( ( rule__SecurityModel__RulesAssignment_5_1 ) ) ( ( rule__SecurityModel__RulesAssignment_5_1 )* ) )
            // InternalSecurityModel.g:460:2: ( ( rule__SecurityModel__RulesAssignment_5_1 ) ) ( ( rule__SecurityModel__RulesAssignment_5_1 )* )
            {
            // InternalSecurityModel.g:460:2: ( ( rule__SecurityModel__RulesAssignment_5_1 ) )
            // InternalSecurityModel.g:461:3: ( rule__SecurityModel__RulesAssignment_5_1 )
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_5_1()); 
            // InternalSecurityModel.g:462:3: ( rule__SecurityModel__RulesAssignment_5_1 )
            // InternalSecurityModel.g:462:4: rule__SecurityModel__RulesAssignment_5_1
            {
            pushFollow(FOLLOW_7);
            rule__SecurityModel__RulesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_5_1()); 

            }

            // InternalSecurityModel.g:465:2: ( ( rule__SecurityModel__RulesAssignment_5_1 )* )
            // InternalSecurityModel.g:466:3: ( rule__SecurityModel__RulesAssignment_5_1 )*
            {
             before(grammarAccess.getSecurityModelAccess().getRulesAssignment_5_1()); 
            // InternalSecurityModel.g:467:3: ( rule__SecurityModel__RulesAssignment_5_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSecurityModel.g:467:4: rule__SecurityModel__RulesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SecurityModel__RulesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSecurityModelAccess().getRulesAssignment_5_1()); 

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
    // $ANTLR end "rule__SecurityModel__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalSecurityModel.g:477:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:481:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSecurityModel.g:482:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSecurityModel.g:489:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:493:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalSecurityModel.g:494:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalSecurityModel.g:494:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalSecurityModel.g:495:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalSecurityModel.g:496:2: ( rule__Rule__NameAssignment_0 )
            // InternalSecurityModel.g:496:3: rule__Rule__NameAssignment_0
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
    // InternalSecurityModel.g:504:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:508:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSecurityModel.g:509:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSecurityModel.g:516:1: rule__Rule__Group__1__Impl : ( ':' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:520:1: ( ( ':' ) )
            // InternalSecurityModel.g:521:1: ( ':' )
            {
            // InternalSecurityModel.g:521:1: ( ':' )
            // InternalSecurityModel.g:522:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSecurityModel.g:531:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:535:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSecurityModel.g:536:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityModel.g:543:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:547:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalSecurityModel.g:548:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalSecurityModel.g:548:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalSecurityModel.g:549:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalSecurityModel.g:550:2: ( rule__Rule__ActionAssignment_2 )
            // InternalSecurityModel.g:550:3: rule__Rule__ActionAssignment_2
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
    // InternalSecurityModel.g:558:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:562:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSecurityModel.g:563:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalSecurityModel.g:570:1: rule__Rule__Group__3__Impl : ( '(' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:574:1: ( ( '(' ) )
            // InternalSecurityModel.g:575:1: ( '(' )
            {
            // InternalSecurityModel.g:575:1: ( '(' )
            // InternalSecurityModel.g:576:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3()); 

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
    // InternalSecurityModel.g:585:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:589:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSecurityModel.g:590:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityModel.g:597:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ResourcesAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:601:1: ( ( ( rule__Rule__ResourcesAssignment_4 ) ) )
            // InternalSecurityModel.g:602:1: ( ( rule__Rule__ResourcesAssignment_4 ) )
            {
            // InternalSecurityModel.g:602:1: ( ( rule__Rule__ResourcesAssignment_4 ) )
            // InternalSecurityModel.g:603:2: ( rule__Rule__ResourcesAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getResourcesAssignment_4()); 
            // InternalSecurityModel.g:604:2: ( rule__Rule__ResourcesAssignment_4 )
            // InternalSecurityModel.g:604:3: rule__Rule__ResourcesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResourcesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResourcesAssignment_4()); 

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
    // InternalSecurityModel.g:612:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:616:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalSecurityModel.g:617:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityModel.g:624:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:628:1: ( ( ( rule__Rule__Group_5__0 )* ) )
            // InternalSecurityModel.g:629:1: ( ( rule__Rule__Group_5__0 )* )
            {
            // InternalSecurityModel.g:629:1: ( ( rule__Rule__Group_5__0 )* )
            // InternalSecurityModel.g:630:2: ( rule__Rule__Group_5__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalSecurityModel.g:631:2: ( rule__Rule__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSecurityModel.g:631:3: rule__Rule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Rule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_5()); 

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
    // InternalSecurityModel.g:639:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:643:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalSecurityModel.g:644:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalSecurityModel.g:651:1: rule__Rule__Group__6__Impl : ( ')' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:655:1: ( ( ')' ) )
            // InternalSecurityModel.g:656:1: ( ')' )
            {
            // InternalSecurityModel.g:656:1: ( ')' )
            // InternalSecurityModel.g:657:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_6()); 

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
    // InternalSecurityModel.g:666:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:670:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalSecurityModel.g:671:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalSecurityModel.g:678:1: rule__Rule__Group__7__Impl : ( 'conditions' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:682:1: ( ( 'conditions' ) )
            // InternalSecurityModel.g:683:1: ( 'conditions' )
            {
            // InternalSecurityModel.g:683:1: ( 'conditions' )
            // InternalSecurityModel.g:684:2: 'conditions'
            {
             before(grammarAccess.getRuleAccess().getConditionsKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getConditionsKeyword_7()); 

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
    // InternalSecurityModel.g:693:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:697:1: ( rule__Rule__Group__8__Impl )
            // InternalSecurityModel.g:698:2: rule__Rule__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__8__Impl();

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
    // InternalSecurityModel.g:704:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__Group_8__0 )? ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:708:1: ( ( ( rule__Rule__Group_8__0 )? ) )
            // InternalSecurityModel.g:709:1: ( ( rule__Rule__Group_8__0 )? )
            {
            // InternalSecurityModel.g:709:1: ( ( rule__Rule__Group_8__0 )? )
            // InternalSecurityModel.g:710:2: ( rule__Rule__Group_8__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_8()); 
            // InternalSecurityModel.g:711:2: ( rule__Rule__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSecurityModel.g:711:3: rule__Rule__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_8()); 

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


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalSecurityModel.g:720:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:724:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalSecurityModel.g:725:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1();

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
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // InternalSecurityModel.g:732:1: rule__Rule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:736:1: ( ( ',' ) )
            // InternalSecurityModel.g:737:1: ( ',' )
            {
            // InternalSecurityModel.g:737:1: ( ',' )
            // InternalSecurityModel.g:738:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // InternalSecurityModel.g:747:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:751:1: ( rule__Rule__Group_5__1__Impl )
            // InternalSecurityModel.g:752:2: rule__Rule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // InternalSecurityModel.g:758:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__ResourcesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:762:1: ( ( ( rule__Rule__ResourcesAssignment_5_1 ) ) )
            // InternalSecurityModel.g:763:1: ( ( rule__Rule__ResourcesAssignment_5_1 ) )
            {
            // InternalSecurityModel.g:763:1: ( ( rule__Rule__ResourcesAssignment_5_1 ) )
            // InternalSecurityModel.g:764:2: ( rule__Rule__ResourcesAssignment_5_1 )
            {
             before(grammarAccess.getRuleAccess().getResourcesAssignment_5_1()); 
            // InternalSecurityModel.g:765:2: ( rule__Rule__ResourcesAssignment_5_1 )
            // InternalSecurityModel.g:765:3: rule__Rule__ResourcesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResourcesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResourcesAssignment_5_1()); 

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
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_8__0"
    // InternalSecurityModel.g:774:1: rule__Rule__Group_8__0 : rule__Rule__Group_8__0__Impl rule__Rule__Group_8__1 ;
    public final void rule__Rule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:778:1: ( rule__Rule__Group_8__0__Impl rule__Rule__Group_8__1 )
            // InternalSecurityModel.g:779:2: rule__Rule__Group_8__0__Impl rule__Rule__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__1();

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
    // $ANTLR end "rule__Rule__Group_8__0"


    // $ANTLR start "rule__Rule__Group_8__0__Impl"
    // InternalSecurityModel.g:786:1: rule__Rule__Group_8__0__Impl : ( '{' ) ;
    public final void rule__Rule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:790:1: ( ( '{' ) )
            // InternalSecurityModel.g:791:1: ( '{' )
            {
            // InternalSecurityModel.g:791:1: ( '{' )
            // InternalSecurityModel.g:792:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8_0()); 

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
    // $ANTLR end "rule__Rule__Group_8__0__Impl"


    // $ANTLR start "rule__Rule__Group_8__1"
    // InternalSecurityModel.g:801:1: rule__Rule__Group_8__1 : rule__Rule__Group_8__1__Impl rule__Rule__Group_8__2 ;
    public final void rule__Rule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:805:1: ( rule__Rule__Group_8__1__Impl rule__Rule__Group_8__2 )
            // InternalSecurityModel.g:806:2: rule__Rule__Group_8__1__Impl rule__Rule__Group_8__2
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__2();

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
    // $ANTLR end "rule__Rule__Group_8__1"


    // $ANTLR start "rule__Rule__Group_8__1__Impl"
    // InternalSecurityModel.g:813:1: rule__Rule__Group_8__1__Impl : ( ( rule__Rule__AuthsAssignment_8_1 ) ) ;
    public final void rule__Rule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:817:1: ( ( ( rule__Rule__AuthsAssignment_8_1 ) ) )
            // InternalSecurityModel.g:818:1: ( ( rule__Rule__AuthsAssignment_8_1 ) )
            {
            // InternalSecurityModel.g:818:1: ( ( rule__Rule__AuthsAssignment_8_1 ) )
            // InternalSecurityModel.g:819:2: ( rule__Rule__AuthsAssignment_8_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_8_1()); 
            // InternalSecurityModel.g:820:2: ( rule__Rule__AuthsAssignment_8_1 )
            // InternalSecurityModel.g:820:3: rule__Rule__AuthsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AuthsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuthsAssignment_8_1()); 

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
    // $ANTLR end "rule__Rule__Group_8__1__Impl"


    // $ANTLR start "rule__Rule__Group_8__2"
    // InternalSecurityModel.g:828:1: rule__Rule__Group_8__2 : rule__Rule__Group_8__2__Impl rule__Rule__Group_8__3 ;
    public final void rule__Rule__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:832:1: ( rule__Rule__Group_8__2__Impl rule__Rule__Group_8__3 )
            // InternalSecurityModel.g:833:2: rule__Rule__Group_8__2__Impl rule__Rule__Group_8__3
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__3();

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
    // $ANTLR end "rule__Rule__Group_8__2"


    // $ANTLR start "rule__Rule__Group_8__2__Impl"
    // InternalSecurityModel.g:840:1: rule__Rule__Group_8__2__Impl : ( ( rule__Rule__Group_8_2__0 )* ) ;
    public final void rule__Rule__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:844:1: ( ( ( rule__Rule__Group_8_2__0 )* ) )
            // InternalSecurityModel.g:845:1: ( ( rule__Rule__Group_8_2__0 )* )
            {
            // InternalSecurityModel.g:845:1: ( ( rule__Rule__Group_8_2__0 )* )
            // InternalSecurityModel.g:846:2: ( rule__Rule__Group_8_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_8_2()); 
            // InternalSecurityModel.g:847:2: ( rule__Rule__Group_8_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSecurityModel.g:847:3: rule__Rule__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Rule__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_8_2()); 

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
    // $ANTLR end "rule__Rule__Group_8__2__Impl"


    // $ANTLR start "rule__Rule__Group_8__3"
    // InternalSecurityModel.g:855:1: rule__Rule__Group_8__3 : rule__Rule__Group_8__3__Impl ;
    public final void rule__Rule__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:859:1: ( rule__Rule__Group_8__3__Impl )
            // InternalSecurityModel.g:860:2: rule__Rule__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_8__3"


    // $ANTLR start "rule__Rule__Group_8__3__Impl"
    // InternalSecurityModel.g:866:1: rule__Rule__Group_8__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:870:1: ( ( '}' ) )
            // InternalSecurityModel.g:871:1: ( '}' )
            {
            // InternalSecurityModel.g:871:1: ( '}' )
            // InternalSecurityModel.g:872:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8_3()); 

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
    // $ANTLR end "rule__Rule__Group_8__3__Impl"


    // $ANTLR start "rule__Rule__Group_8_2__0"
    // InternalSecurityModel.g:882:1: rule__Rule__Group_8_2__0 : rule__Rule__Group_8_2__0__Impl rule__Rule__Group_8_2__1 ;
    public final void rule__Rule__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:886:1: ( rule__Rule__Group_8_2__0__Impl rule__Rule__Group_8_2__1 )
            // InternalSecurityModel.g:887:2: rule__Rule__Group_8_2__0__Impl rule__Rule__Group_8_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_8_2__1();

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
    // $ANTLR end "rule__Rule__Group_8_2__0"


    // $ANTLR start "rule__Rule__Group_8_2__0__Impl"
    // InternalSecurityModel.g:894:1: rule__Rule__Group_8_2__0__Impl : ( ',or' ) ;
    public final void rule__Rule__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:898:1: ( ( ',or' ) )
            // InternalSecurityModel.g:899:1: ( ',or' )
            {
            // InternalSecurityModel.g:899:1: ( ',or' )
            // InternalSecurityModel.g:900:2: ',or'
            {
             before(grammarAccess.getRuleAccess().getOrKeyword_8_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getOrKeyword_8_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_8_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_8_2__1"
    // InternalSecurityModel.g:909:1: rule__Rule__Group_8_2__1 : rule__Rule__Group_8_2__1__Impl ;
    public final void rule__Rule__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:913:1: ( rule__Rule__Group_8_2__1__Impl )
            // InternalSecurityModel.g:914:2: rule__Rule__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_8_2__1"


    // $ANTLR start "rule__Rule__Group_8_2__1__Impl"
    // InternalSecurityModel.g:920:1: rule__Rule__Group_8_2__1__Impl : ( ( rule__Rule__AuthsAssignment_8_2_1 ) ) ;
    public final void rule__Rule__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:924:1: ( ( ( rule__Rule__AuthsAssignment_8_2_1 ) ) )
            // InternalSecurityModel.g:925:1: ( ( rule__Rule__AuthsAssignment_8_2_1 ) )
            {
            // InternalSecurityModel.g:925:1: ( ( rule__Rule__AuthsAssignment_8_2_1 ) )
            // InternalSecurityModel.g:926:2: ( rule__Rule__AuthsAssignment_8_2_1 )
            {
             before(grammarAccess.getRuleAccess().getAuthsAssignment_8_2_1()); 
            // InternalSecurityModel.g:927:2: ( rule__Rule__AuthsAssignment_8_2_1 )
            // InternalSecurityModel.g:927:3: rule__Rule__AuthsAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AuthsAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuthsAssignment_8_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_8_2__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSecurityModel.g:936:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:940:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSecurityModel.g:941:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSecurityModel.g:948:1: rule__Role__Group__0__Impl : ( ( rule__Role__NameAssignment_0 ) ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:952:1: ( ( ( rule__Role__NameAssignment_0 ) ) )
            // InternalSecurityModel.g:953:1: ( ( rule__Role__NameAssignment_0 ) )
            {
            // InternalSecurityModel.g:953:1: ( ( rule__Role__NameAssignment_0 ) )
            // InternalSecurityModel.g:954:2: ( rule__Role__NameAssignment_0 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_0()); 
            // InternalSecurityModel.g:955:2: ( rule__Role__NameAssignment_0 )
            // InternalSecurityModel.g:955:3: rule__Role__NameAssignment_0
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
    // InternalSecurityModel.g:963:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:967:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSecurityModel.g:968:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSecurityModel.g:975:1: rule__Role__Group__1__Impl : ( '<-' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:979:1: ( ( '<-' ) )
            // InternalSecurityModel.g:980:1: ( '<-' )
            {
            // InternalSecurityModel.g:980:1: ( '<-' )
            // InternalSecurityModel.g:981:2: '<-'
            {
             before(grammarAccess.getRoleAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSecurityModel.g:990:1: rule__Role__Group__2 : rule__Role__Group__2__Impl ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:994:1: ( rule__Role__Group__2__Impl )
            // InternalSecurityModel.g:995:2: rule__Role__Group__2__Impl
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
    // InternalSecurityModel.g:1001:1: rule__Role__Group__2__Impl : ( ( rule__Role__EntityAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1005:1: ( ( ( rule__Role__EntityAssignment_2 ) ) )
            // InternalSecurityModel.g:1006:1: ( ( rule__Role__EntityAssignment_2 ) )
            {
            // InternalSecurityModel.g:1006:1: ( ( rule__Role__EntityAssignment_2 ) )
            // InternalSecurityModel.g:1007:2: ( rule__Role__EntityAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getEntityAssignment_2()); 
            // InternalSecurityModel.g:1008:2: ( rule__Role__EntityAssignment_2 )
            // InternalSecurityModel.g:1008:3: rule__Role__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getEntityAssignment_2()); 

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
    // InternalSecurityModel.g:1017:1: rule__Auth__Group__0 : rule__Auth__Group__0__Impl rule__Auth__Group__1 ;
    public final void rule__Auth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1021:1: ( rule__Auth__Group__0__Impl rule__Auth__Group__1 )
            // InternalSecurityModel.g:1022:2: rule__Auth__Group__0__Impl rule__Auth__Group__1
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
    // InternalSecurityModel.g:1029:1: rule__Auth__Group__0__Impl : ( '{' ) ;
    public final void rule__Auth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1033:1: ( ( '{' ) )
            // InternalSecurityModel.g:1034:1: ( '{' )
            {
            // InternalSecurityModel.g:1034:1: ( '{' )
            // InternalSecurityModel.g:1035:2: '{'
            {
             before(grammarAccess.getAuthAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSecurityModel.g:1044:1: rule__Auth__Group__1 : rule__Auth__Group__1__Impl rule__Auth__Group__2 ;
    public final void rule__Auth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1048:1: ( rule__Auth__Group__1__Impl rule__Auth__Group__2 )
            // InternalSecurityModel.g:1049:2: rule__Auth__Group__1__Impl rule__Auth__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSecurityModel.g:1056:1: rule__Auth__Group__1__Impl : ( 'roles' ) ;
    public final void rule__Auth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1060:1: ( ( 'roles' ) )
            // InternalSecurityModel.g:1061:1: ( 'roles' )
            {
            // InternalSecurityModel.g:1061:1: ( 'roles' )
            // InternalSecurityModel.g:1062:2: 'roles'
            {
             before(grammarAccess.getAuthAccess().getRolesKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSecurityModel.g:1071:1: rule__Auth__Group__2 : rule__Auth__Group__2__Impl rule__Auth__Group__3 ;
    public final void rule__Auth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1075:1: ( rule__Auth__Group__2__Impl rule__Auth__Group__3 )
            // InternalSecurityModel.g:1076:2: rule__Auth__Group__2__Impl rule__Auth__Group__3
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
    // InternalSecurityModel.g:1083:1: rule__Auth__Group__2__Impl : ( '(' ) ;
    public final void rule__Auth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1087:1: ( ( '(' ) )
            // InternalSecurityModel.g:1088:1: ( '(' )
            {
            // InternalSecurityModel.g:1088:1: ( '(' )
            // InternalSecurityModel.g:1089:2: '('
            {
             before(grammarAccess.getAuthAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSecurityModel.g:1098:1: rule__Auth__Group__3 : rule__Auth__Group__3__Impl rule__Auth__Group__4 ;
    public final void rule__Auth__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1102:1: ( rule__Auth__Group__3__Impl rule__Auth__Group__4 )
            // InternalSecurityModel.g:1103:2: rule__Auth__Group__3__Impl rule__Auth__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityModel.g:1110:1: rule__Auth__Group__3__Impl : ( ( rule__Auth__RolesAssignment_3 ) ) ;
    public final void rule__Auth__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1114:1: ( ( ( rule__Auth__RolesAssignment_3 ) ) )
            // InternalSecurityModel.g:1115:1: ( ( rule__Auth__RolesAssignment_3 ) )
            {
            // InternalSecurityModel.g:1115:1: ( ( rule__Auth__RolesAssignment_3 ) )
            // InternalSecurityModel.g:1116:2: ( rule__Auth__RolesAssignment_3 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_3()); 
            // InternalSecurityModel.g:1117:2: ( rule__Auth__RolesAssignment_3 )
            // InternalSecurityModel.g:1117:3: rule__Auth__RolesAssignment_3
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
    // InternalSecurityModel.g:1125:1: rule__Auth__Group__4 : rule__Auth__Group__4__Impl rule__Auth__Group__5 ;
    public final void rule__Auth__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1129:1: ( rule__Auth__Group__4__Impl rule__Auth__Group__5 )
            // InternalSecurityModel.g:1130:2: rule__Auth__Group__4__Impl rule__Auth__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSecurityModel.g:1137:1: rule__Auth__Group__4__Impl : ( ( rule__Auth__Group_4__0 )* ) ;
    public final void rule__Auth__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1141:1: ( ( ( rule__Auth__Group_4__0 )* ) )
            // InternalSecurityModel.g:1142:1: ( ( rule__Auth__Group_4__0 )* )
            {
            // InternalSecurityModel.g:1142:1: ( ( rule__Auth__Group_4__0 )* )
            // InternalSecurityModel.g:1143:2: ( rule__Auth__Group_4__0 )*
            {
             before(grammarAccess.getAuthAccess().getGroup_4()); 
            // InternalSecurityModel.g:1144:2: ( rule__Auth__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSecurityModel.g:1144:3: rule__Auth__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSecurityModel.g:1152:1: rule__Auth__Group__5 : rule__Auth__Group__5__Impl rule__Auth__Group__6 ;
    public final void rule__Auth__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1156:1: ( rule__Auth__Group__5__Impl rule__Auth__Group__6 )
            // InternalSecurityModel.g:1157:2: rule__Auth__Group__5__Impl rule__Auth__Group__6
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
    // InternalSecurityModel.g:1164:1: rule__Auth__Group__5__Impl : ( ')' ) ;
    public final void rule__Auth__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1168:1: ( ( ')' ) )
            // InternalSecurityModel.g:1169:1: ( ')' )
            {
            // InternalSecurityModel.g:1169:1: ( ')' )
            // InternalSecurityModel.g:1170:2: ')'
            {
             before(grammarAccess.getAuthAccess().getRightParenthesisKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSecurityModel.g:1179:1: rule__Auth__Group__6 : rule__Auth__Group__6__Impl rule__Auth__Group__7 ;
    public final void rule__Auth__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1183:1: ( rule__Auth__Group__6__Impl rule__Auth__Group__7 )
            // InternalSecurityModel.g:1184:2: rule__Auth__Group__6__Impl rule__Auth__Group__7
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
    // InternalSecurityModel.g:1191:1: rule__Auth__Group__6__Impl : ( 'context:' ) ;
    public final void rule__Auth__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1195:1: ( ( 'context:' ) )
            // InternalSecurityModel.g:1196:1: ( 'context:' )
            {
            // InternalSecurityModel.g:1196:1: ( 'context:' )
            // InternalSecurityModel.g:1197:2: 'context:'
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
    // InternalSecurityModel.g:1206:1: rule__Auth__Group__7 : rule__Auth__Group__7__Impl rule__Auth__Group__8 ;
    public final void rule__Auth__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1210:1: ( rule__Auth__Group__7__Impl rule__Auth__Group__8 )
            // InternalSecurityModel.g:1211:2: rule__Auth__Group__7__Impl rule__Auth__Group__8
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
    // InternalSecurityModel.g:1218:1: rule__Auth__Group__7__Impl : ( ( rule__Auth__TextualAssignment_7 ) ) ;
    public final void rule__Auth__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1222:1: ( ( ( rule__Auth__TextualAssignment_7 ) ) )
            // InternalSecurityModel.g:1223:1: ( ( rule__Auth__TextualAssignment_7 ) )
            {
            // InternalSecurityModel.g:1223:1: ( ( rule__Auth__TextualAssignment_7 ) )
            // InternalSecurityModel.g:1224:2: ( rule__Auth__TextualAssignment_7 )
            {
             before(grammarAccess.getAuthAccess().getTextualAssignment_7()); 
            // InternalSecurityModel.g:1225:2: ( rule__Auth__TextualAssignment_7 )
            // InternalSecurityModel.g:1225:3: rule__Auth__TextualAssignment_7
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
    // InternalSecurityModel.g:1233:1: rule__Auth__Group__8 : rule__Auth__Group__8__Impl rule__Auth__Group__9 ;
    public final void rule__Auth__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1237:1: ( rule__Auth__Group__8__Impl rule__Auth__Group__9 )
            // InternalSecurityModel.g:1238:2: rule__Auth__Group__8__Impl rule__Auth__Group__9
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
    // InternalSecurityModel.g:1245:1: rule__Auth__Group__8__Impl : ( 'ocl:' ) ;
    public final void rule__Auth__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1249:1: ( ( 'ocl:' ) )
            // InternalSecurityModel.g:1250:1: ( 'ocl:' )
            {
            // InternalSecurityModel.g:1250:1: ( 'ocl:' )
            // InternalSecurityModel.g:1251:2: 'ocl:'
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
    // InternalSecurityModel.g:1260:1: rule__Auth__Group__9 : rule__Auth__Group__9__Impl rule__Auth__Group__10 ;
    public final void rule__Auth__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1264:1: ( rule__Auth__Group__9__Impl rule__Auth__Group__10 )
            // InternalSecurityModel.g:1265:2: rule__Auth__Group__9__Impl rule__Auth__Group__10
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
    // InternalSecurityModel.g:1272:1: rule__Auth__Group__9__Impl : ( ( rule__Auth__OclExpAssignment_9 ) ) ;
    public final void rule__Auth__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1276:1: ( ( ( rule__Auth__OclExpAssignment_9 ) ) )
            // InternalSecurityModel.g:1277:1: ( ( rule__Auth__OclExpAssignment_9 ) )
            {
            // InternalSecurityModel.g:1277:1: ( ( rule__Auth__OclExpAssignment_9 ) )
            // InternalSecurityModel.g:1278:2: ( rule__Auth__OclExpAssignment_9 )
            {
             before(grammarAccess.getAuthAccess().getOclExpAssignment_9()); 
            // InternalSecurityModel.g:1279:2: ( rule__Auth__OclExpAssignment_9 )
            // InternalSecurityModel.g:1279:3: rule__Auth__OclExpAssignment_9
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
    // InternalSecurityModel.g:1287:1: rule__Auth__Group__10 : rule__Auth__Group__10__Impl rule__Auth__Group__11 ;
    public final void rule__Auth__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1291:1: ( rule__Auth__Group__10__Impl rule__Auth__Group__11 )
            // InternalSecurityModel.g:1292:2: rule__Auth__Group__10__Impl rule__Auth__Group__11
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
    // InternalSecurityModel.g:1299:1: rule__Auth__Group__10__Impl : ( 'sql:' ) ;
    public final void rule__Auth__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1303:1: ( ( 'sql:' ) )
            // InternalSecurityModel.g:1304:1: ( 'sql:' )
            {
            // InternalSecurityModel.g:1304:1: ( 'sql:' )
            // InternalSecurityModel.g:1305:2: 'sql:'
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
    // InternalSecurityModel.g:1314:1: rule__Auth__Group__11 : rule__Auth__Group__11__Impl rule__Auth__Group__12 ;
    public final void rule__Auth__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1318:1: ( rule__Auth__Group__11__Impl rule__Auth__Group__12 )
            // InternalSecurityModel.g:1319:2: rule__Auth__Group__11__Impl rule__Auth__Group__12
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
    // InternalSecurityModel.g:1326:1: rule__Auth__Group__11__Impl : ( ( rule__Auth__SqlStmAssignment_11 ) ) ;
    public final void rule__Auth__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1330:1: ( ( ( rule__Auth__SqlStmAssignment_11 ) ) )
            // InternalSecurityModel.g:1331:1: ( ( rule__Auth__SqlStmAssignment_11 ) )
            {
            // InternalSecurityModel.g:1331:1: ( ( rule__Auth__SqlStmAssignment_11 ) )
            // InternalSecurityModel.g:1332:2: ( rule__Auth__SqlStmAssignment_11 )
            {
             before(grammarAccess.getAuthAccess().getSqlStmAssignment_11()); 
            // InternalSecurityModel.g:1333:2: ( rule__Auth__SqlStmAssignment_11 )
            // InternalSecurityModel.g:1333:3: rule__Auth__SqlStmAssignment_11
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
    // InternalSecurityModel.g:1341:1: rule__Auth__Group__12 : rule__Auth__Group__12__Impl ;
    public final void rule__Auth__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1345:1: ( rule__Auth__Group__12__Impl )
            // InternalSecurityModel.g:1346:2: rule__Auth__Group__12__Impl
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
    // InternalSecurityModel.g:1352:1: rule__Auth__Group__12__Impl : ( '}' ) ;
    public final void rule__Auth__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1356:1: ( ( '}' ) )
            // InternalSecurityModel.g:1357:1: ( '}' )
            {
            // InternalSecurityModel.g:1357:1: ( '}' )
            // InternalSecurityModel.g:1358:2: '}'
            {
             before(grammarAccess.getAuthAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSecurityModel.g:1368:1: rule__Auth__Group_4__0 : rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1 ;
    public final void rule__Auth__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1372:1: ( rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1 )
            // InternalSecurityModel.g:1373:2: rule__Auth__Group_4__0__Impl rule__Auth__Group_4__1
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
    // InternalSecurityModel.g:1380:1: rule__Auth__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Auth__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1384:1: ( ( ',' ) )
            // InternalSecurityModel.g:1385:1: ( ',' )
            {
            // InternalSecurityModel.g:1385:1: ( ',' )
            // InternalSecurityModel.g:1386:2: ','
            {
             before(grammarAccess.getAuthAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSecurityModel.g:1395:1: rule__Auth__Group_4__1 : rule__Auth__Group_4__1__Impl ;
    public final void rule__Auth__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1399:1: ( rule__Auth__Group_4__1__Impl )
            // InternalSecurityModel.g:1400:2: rule__Auth__Group_4__1__Impl
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
    // InternalSecurityModel.g:1406:1: rule__Auth__Group_4__1__Impl : ( ( rule__Auth__RolesAssignment_4_1 ) ) ;
    public final void rule__Auth__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1410:1: ( ( ( rule__Auth__RolesAssignment_4_1 ) ) )
            // InternalSecurityModel.g:1411:1: ( ( rule__Auth__RolesAssignment_4_1 ) )
            {
            // InternalSecurityModel.g:1411:1: ( ( rule__Auth__RolesAssignment_4_1 ) )
            // InternalSecurityModel.g:1412:2: ( rule__Auth__RolesAssignment_4_1 )
            {
             before(grammarAccess.getAuthAccess().getRolesAssignment_4_1()); 
            // InternalSecurityModel.g:1413:2: ( rule__Auth__RolesAssignment_4_1 )
            // InternalSecurityModel.g:1413:3: rule__Auth__RolesAssignment_4_1
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


    // $ANTLR start "rule__SecurityModel__NameAssignment_2"
    // InternalSecurityModel.g:1422:1: rule__SecurityModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SecurityModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1426:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1427:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1427:2: ( ruleEString )
            // InternalSecurityModel.g:1428:3: ruleEString
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
    // InternalSecurityModel.g:1437:1: rule__SecurityModel__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__SecurityModel__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1441:1: ( ( ruleRole ) )
            // InternalSecurityModel.g:1442:2: ( ruleRole )
            {
            // InternalSecurityModel.g:1442:2: ( ruleRole )
            // InternalSecurityModel.g:1443:3: ruleRole
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


    // $ANTLR start "rule__SecurityModel__RulesAssignment_5_1"
    // InternalSecurityModel.g:1452:1: rule__SecurityModel__RulesAssignment_5_1 : ( ruleRule ) ;
    public final void rule__SecurityModel__RulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1456:1: ( ( ruleRule ) )
            // InternalSecurityModel.g:1457:2: ( ruleRule )
            {
            // InternalSecurityModel.g:1457:2: ( ruleRule )
            // InternalSecurityModel.g:1458:3: ruleRule
            {
             before(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSecurityModelAccess().getRulesRuleParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SecurityModel__RulesAssignment_5_1"


    // $ANTLR start "rule__Rule__NameAssignment_0"
    // InternalSecurityModel.g:1467:1: rule__Rule__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1471:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1472:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1472:2: ( ruleEString )
            // InternalSecurityModel.g:1473:3: ruleEString
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
    // InternalSecurityModel.g:1482:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1486:1: ( ( ruleAction ) )
            // InternalSecurityModel.g:1487:2: ( ruleAction )
            {
            // InternalSecurityModel.g:1487:2: ( ruleAction )
            // InternalSecurityModel.g:1488:3: ruleAction
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


    // $ANTLR start "rule__Rule__ResourcesAssignment_4"
    // InternalSecurityModel.g:1497:1: rule__Rule__ResourcesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Rule__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1501:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1502:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1502:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1503:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getResourcesPropertyCrossReference_4_0()); 
            // InternalSecurityModel.g:1504:3: ( ruleEString )
            // InternalSecurityModel.g:1505:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getResourcesPropertyEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResourcesPropertyEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getResourcesPropertyCrossReference_4_0()); 

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
    // $ANTLR end "rule__Rule__ResourcesAssignment_4"


    // $ANTLR start "rule__Rule__ResourcesAssignment_5_1"
    // InternalSecurityModel.g:1516:1: rule__Rule__ResourcesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__ResourcesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1520:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1521:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1521:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1522:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getResourcesPropertyCrossReference_5_1_0()); 
            // InternalSecurityModel.g:1523:3: ( ruleEString )
            // InternalSecurityModel.g:1524:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getResourcesPropertyEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResourcesPropertyEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getResourcesPropertyCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Rule__ResourcesAssignment_5_1"


    // $ANTLR start "rule__Rule__AuthsAssignment_8_1"
    // InternalSecurityModel.g:1535:1: rule__Rule__AuthsAssignment_8_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1539:1: ( ( ruleAuth ) )
            // InternalSecurityModel.g:1540:2: ( ruleAuth )
            {
            // InternalSecurityModel.g:1540:2: ( ruleAuth )
            // InternalSecurityModel.g:1541:3: ruleAuth
            {
             before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Rule__AuthsAssignment_8_1"


    // $ANTLR start "rule__Rule__AuthsAssignment_8_2_1"
    // InternalSecurityModel.g:1550:1: rule__Rule__AuthsAssignment_8_2_1 : ( ruleAuth ) ;
    public final void rule__Rule__AuthsAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1554:1: ( ( ruleAuth ) )
            // InternalSecurityModel.g:1555:2: ( ruleAuth )
            {
            // InternalSecurityModel.g:1555:2: ( ruleAuth )
            // InternalSecurityModel.g:1556:3: ruleAuth
            {
             before(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuth();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuthsAuthParserRuleCall_8_2_1_0()); 

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
    // $ANTLR end "rule__Rule__AuthsAssignment_8_2_1"


    // $ANTLR start "rule__Role__NameAssignment_0"
    // InternalSecurityModel.g:1565:1: rule__Role__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1569:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1570:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1570:2: ( ruleEString )
            // InternalSecurityModel.g:1571:3: ruleEString
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


    // $ANTLR start "rule__Role__EntityAssignment_2"
    // InternalSecurityModel.g:1580:1: rule__Role__EntityAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1584:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1585:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1585:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1586:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getEntityEntityCrossReference_2_0()); 
            // InternalSecurityModel.g:1587:3: ( ruleEString )
            // InternalSecurityModel.g:1588:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getEntityEntityEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getEntityEntityEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getEntityEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__Role__EntityAssignment_2"


    // $ANTLR start "rule__Auth__RolesAssignment_3"
    // InternalSecurityModel.g:1599:1: rule__Auth__RolesAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1603:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1604:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1604:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1605:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_3_0()); 
            // InternalSecurityModel.g:1606:3: ( ruleEString )
            // InternalSecurityModel.g:1607:4: ruleEString
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
    // InternalSecurityModel.g:1618:1: rule__Auth__RolesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Auth__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1622:1: ( ( ( ruleEString ) ) )
            // InternalSecurityModel.g:1623:2: ( ( ruleEString ) )
            {
            // InternalSecurityModel.g:1623:2: ( ( ruleEString ) )
            // InternalSecurityModel.g:1624:3: ( ruleEString )
            {
             before(grammarAccess.getAuthAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalSecurityModel.g:1625:3: ( ruleEString )
            // InternalSecurityModel.g:1626:4: ruleEString
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
    // InternalSecurityModel.g:1637:1: rule__Auth__TextualAssignment_7 : ( ruleEString ) ;
    public final void rule__Auth__TextualAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1641:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1642:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1642:2: ( ruleEString )
            // InternalSecurityModel.g:1643:3: ruleEString
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
    // InternalSecurityModel.g:1652:1: rule__Auth__OclExpAssignment_9 : ( ruleEString ) ;
    public final void rule__Auth__OclExpAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1656:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1657:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1657:2: ( ruleEString )
            // InternalSecurityModel.g:1658:3: ruleEString
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
    // InternalSecurityModel.g:1667:1: rule__Auth__SqlStmAssignment_11 : ( ruleEString ) ;
    public final void rule__Auth__SqlStmAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSecurityModel.g:1671:1: ( ( ruleEString ) )
            // InternalSecurityModel.g:1672:2: ( ruleEString )
            {
            // InternalSecurityModel.g:1672:2: ( ruleEString )
            // InternalSecurityModel.g:1673:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});

}
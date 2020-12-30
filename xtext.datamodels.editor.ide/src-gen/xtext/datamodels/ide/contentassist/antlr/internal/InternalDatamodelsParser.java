package xtext.datamodels.ide.contentassist.antlr.internal;

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
import xtext.datamodels.services.DatamodelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatamodelsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[*]'", "'[1]'", "'String'", "'Integer'", "'DataModel'", "':'", "','", "'entity'", "'{'", "'}'", "'extends'", "'association'", "'oppositeTo'", "'in'", "'attribute'", "'unique'"
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

    	public void setGrammarAccess(DatamodelsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDataModel"
    // InternalDatamodels.g:53:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalDatamodels.g:54:1: ( ruleDataModel EOF )
            // InternalDatamodels.g:55:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalDatamodels.g:62:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:66:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalDatamodels.g:67:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalDatamodels.g:67:2: ( ( rule__DataModel__Group__0 ) )
            // InternalDatamodels.g:68:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalDatamodels.g:69:3: ( rule__DataModel__Group__0 )
            // InternalDatamodels.g:69:4: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleProperty"
    // InternalDatamodels.g:78:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDatamodels.g:79:1: ( ruleProperty EOF )
            // InternalDatamodels.g:80:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDatamodels.g:87:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:91:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalDatamodels.g:92:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalDatamodels.g:92:2: ( ( rule__Property__Alternatives ) )
            // InternalDatamodels.g:93:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalDatamodels.g:94:3: ( rule__Property__Alternatives )
            // InternalDatamodels.g:94:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEString"
    // InternalDatamodels.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDatamodels.g:104:1: ( ruleEString EOF )
            // InternalDatamodels.g:105:1: ruleEString EOF
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
    // InternalDatamodels.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDatamodels.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDatamodels.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalDatamodels.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDatamodels.g:119:3: ( rule__EString__Alternatives )
            // InternalDatamodels.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEntity"
    // InternalDatamodels.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDatamodels.g:129:1: ( ruleEntity EOF )
            // InternalDatamodels.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDatamodels.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDatamodels.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDatamodels.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalDatamodels.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDatamodels.g:144:3: ( rule__Entity__Group__0 )
            // InternalDatamodels.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalDatamodels.g:153:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalDatamodels.g:154:1: ( ruleAssociationEnd EOF )
            // InternalDatamodels.g:155:1: ruleAssociationEnd EOF
            {
             before(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationEndRule()); 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalDatamodels.g:162:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:166:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalDatamodels.g:167:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalDatamodels.g:167:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalDatamodels.g:168:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalDatamodels.g:169:3: ( rule__AssociationEnd__Group__0 )
            // InternalDatamodels.g:169:4: rule__AssociationEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleAttribute"
    // InternalDatamodels.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDatamodels.g:179:1: ( ruleAttribute EOF )
            // InternalDatamodels.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDatamodels.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDatamodels.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDatamodels.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDatamodels.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDatamodels.g:194:3: ( rule__Attribute__Group__0 )
            // InternalDatamodels.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleMultiplicity"
    // InternalDatamodels.g:203:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:207:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalDatamodels.g:208:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalDatamodels.g:208:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalDatamodels.g:209:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalDatamodels.g:210:3: ( rule__Multiplicity__Alternatives )
            // InternalDatamodels.g:210:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "ruleDataType"
    // InternalDatamodels.g:219:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:223:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDatamodels.g:224:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDatamodels.g:224:2: ( ( rule__DataType__Alternatives ) )
            // InternalDatamodels.g:225:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalDatamodels.g:226:3: ( rule__DataType__Alternatives )
            // InternalDatamodels.g:226:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalDatamodels.g:234:1: rule__Property__Alternatives : ( ( ruleAssociationEnd ) | ( ruleAttribute ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:238:1: ( ( ruleAssociationEnd ) | ( ruleAttribute ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDatamodels.g:239:2: ( ruleAssociationEnd )
                    {
                    // InternalDatamodels.g:239:2: ( ruleAssociationEnd )
                    // InternalDatamodels.g:240:3: ruleAssociationEnd
                    {
                     before(grammarAccess.getPropertyAccess().getAssociationEndParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationEnd();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAssociationEndParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:245:2: ( ruleAttribute )
                    {
                    // InternalDatamodels.g:245:2: ( ruleAttribute )
                    // InternalDatamodels.g:246:3: ruleAttribute
                    {
                     before(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDatamodels.g:255:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:259:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDatamodels.g:260:2: ( RULE_STRING )
                    {
                    // InternalDatamodels.g:260:2: ( RULE_STRING )
                    // InternalDatamodels.g:261:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:266:2: ( RULE_ID )
                    {
                    // InternalDatamodels.g:266:2: ( RULE_ID )
                    // InternalDatamodels.g:267:3: RULE_ID
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


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalDatamodels.g:276:1: rule__Multiplicity__Alternatives : ( ( ( '[*]' ) ) | ( ( '[1]' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:280:1: ( ( ( '[*]' ) ) | ( ( '[1]' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDatamodels.g:281:2: ( ( '[*]' ) )
                    {
                    // InternalDatamodels.g:281:2: ( ( '[*]' ) )
                    // InternalDatamodels.g:282:3: ( '[*]' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_0()); 
                    // InternalDatamodels.g:283:3: ( '[*]' )
                    // InternalDatamodels.g:283:4: '[*]'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:287:2: ( ( '[1]' ) )
                    {
                    // InternalDatamodels.g:287:2: ( ( '[1]' ) )
                    // InternalDatamodels.g:288:3: ( '[1]' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalDatamodels.g:289:3: ( '[1]' )
                    // InternalDatamodels.g:289:4: '[1]'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Multiplicity__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalDatamodels.g:297:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:301:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDatamodels.g:302:2: ( ( 'String' ) )
                    {
                    // InternalDatamodels.g:302:2: ( ( 'String' ) )
                    // InternalDatamodels.g:303:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDatamodels.g:304:3: ( 'String' )
                    // InternalDatamodels.g:304:4: 'String'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatamodels.g:308:2: ( ( 'Integer' ) )
                    {
                    // InternalDatamodels.g:308:2: ( ( 'Integer' ) )
                    // InternalDatamodels.g:309:3: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalDatamodels.g:310:3: ( 'Integer' )
                    // InternalDatamodels.g:310:4: 'Integer'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalDatamodels.g:318:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:322:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDatamodels.g:323:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1();

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
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // InternalDatamodels.g:330:1: rule__DataModel__Group__0__Impl : ( () ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:334:1: ( ( () ) )
            // InternalDatamodels.g:335:1: ( () )
            {
            // InternalDatamodels.g:335:1: ( () )
            // InternalDatamodels.g:336:2: ()
            {
             before(grammarAccess.getDataModelAccess().getDataModelAction_0()); 
            // InternalDatamodels.g:337:2: ()
            // InternalDatamodels.g:337:3: 
            {
            }

             after(grammarAccess.getDataModelAccess().getDataModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalDatamodels.g:345:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:349:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalDatamodels.g:350:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2();

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
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // InternalDatamodels.g:357:1: rule__DataModel__Group__1__Impl : ( 'DataModel' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:361:1: ( ( 'DataModel' ) )
            // InternalDatamodels.g:362:1: ( 'DataModel' )
            {
            // InternalDatamodels.g:362:1: ( 'DataModel' )
            // InternalDatamodels.g:363:2: 'DataModel'
            {
             before(grammarAccess.getDataModelAccess().getDataModelKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getDataModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // InternalDatamodels.g:372:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:376:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // InternalDatamodels.g:377:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__3();

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
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // InternalDatamodels.g:384:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__NameAssignment_2 ) ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:388:1: ( ( ( rule__DataModel__NameAssignment_2 ) ) )
            // InternalDatamodels.g:389:1: ( ( rule__DataModel__NameAssignment_2 ) )
            {
            // InternalDatamodels.g:389:1: ( ( rule__DataModel__NameAssignment_2 ) )
            // InternalDatamodels.g:390:2: ( rule__DataModel__NameAssignment_2 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_2()); 
            // InternalDatamodels.g:391:2: ( rule__DataModel__NameAssignment_2 )
            // InternalDatamodels.g:391:3: rule__DataModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // InternalDatamodels.g:399:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:403:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // InternalDatamodels.g:404:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4();

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
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // InternalDatamodels.g:411:1: rule__DataModel__Group__3__Impl : ( ':' ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:415:1: ( ( ':' ) )
            // InternalDatamodels.g:416:1: ( ':' )
            {
            // InternalDatamodels.g:416:1: ( ':' )
            // InternalDatamodels.g:417:2: ':'
            {
             before(grammarAccess.getDataModelAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // InternalDatamodels.g:426:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:430:1: ( rule__DataModel__Group__4__Impl )
            // InternalDatamodels.g:431:2: rule__DataModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4__Impl();

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
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // InternalDatamodels.g:437:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__Group_4__0 )? ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:441:1: ( ( ( rule__DataModel__Group_4__0 )? ) )
            // InternalDatamodels.g:442:1: ( ( rule__DataModel__Group_4__0 )? )
            {
            // InternalDatamodels.g:442:1: ( ( rule__DataModel__Group_4__0 )? )
            // InternalDatamodels.g:443:2: ( rule__DataModel__Group_4__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_4()); 
            // InternalDatamodels.g:444:2: ( rule__DataModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDatamodels.g:444:3: rule__DataModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DataModel__Group_4__0"
    // InternalDatamodels.g:453:1: rule__DataModel__Group_4__0 : rule__DataModel__Group_4__0__Impl rule__DataModel__Group_4__1 ;
    public final void rule__DataModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:457:1: ( rule__DataModel__Group_4__0__Impl rule__DataModel__Group_4__1 )
            // InternalDatamodels.g:458:2: rule__DataModel__Group_4__0__Impl rule__DataModel__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__DataModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_4__1();

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
    // $ANTLR end "rule__DataModel__Group_4__0"


    // $ANTLR start "rule__DataModel__Group_4__0__Impl"
    // InternalDatamodels.g:465:1: rule__DataModel__Group_4__0__Impl : ( ( rule__DataModel__EntitiesAssignment_4_0 ) ) ;
    public final void rule__DataModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:469:1: ( ( ( rule__DataModel__EntitiesAssignment_4_0 ) ) )
            // InternalDatamodels.g:470:1: ( ( rule__DataModel__EntitiesAssignment_4_0 ) )
            {
            // InternalDatamodels.g:470:1: ( ( rule__DataModel__EntitiesAssignment_4_0 ) )
            // InternalDatamodels.g:471:2: ( rule__DataModel__EntitiesAssignment_4_0 )
            {
             before(grammarAccess.getDataModelAccess().getEntitiesAssignment_4_0()); 
            // InternalDatamodels.g:472:2: ( rule__DataModel__EntitiesAssignment_4_0 )
            // InternalDatamodels.g:472:3: rule__DataModel__EntitiesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__EntitiesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getEntitiesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4__0__Impl"


    // $ANTLR start "rule__DataModel__Group_4__1"
    // InternalDatamodels.g:480:1: rule__DataModel__Group_4__1 : rule__DataModel__Group_4__1__Impl ;
    public final void rule__DataModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:484:1: ( rule__DataModel__Group_4__1__Impl )
            // InternalDatamodels.g:485:2: rule__DataModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataModel__Group_4__1"


    // $ANTLR start "rule__DataModel__Group_4__1__Impl"
    // InternalDatamodels.g:491:1: rule__DataModel__Group_4__1__Impl : ( ( rule__DataModel__Group_4_1__0 )* ) ;
    public final void rule__DataModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:495:1: ( ( ( rule__DataModel__Group_4_1__0 )* ) )
            // InternalDatamodels.g:496:1: ( ( rule__DataModel__Group_4_1__0 )* )
            {
            // InternalDatamodels.g:496:1: ( ( rule__DataModel__Group_4_1__0 )* )
            // InternalDatamodels.g:497:2: ( rule__DataModel__Group_4_1__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_4_1()); 
            // InternalDatamodels.g:498:2: ( rule__DataModel__Group_4_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDatamodels.g:498:3: rule__DataModel__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DataModel__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4__1__Impl"


    // $ANTLR start "rule__DataModel__Group_4_1__0"
    // InternalDatamodels.g:507:1: rule__DataModel__Group_4_1__0 : rule__DataModel__Group_4_1__0__Impl rule__DataModel__Group_4_1__1 ;
    public final void rule__DataModel__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:511:1: ( rule__DataModel__Group_4_1__0__Impl rule__DataModel__Group_4_1__1 )
            // InternalDatamodels.g:512:2: rule__DataModel__Group_4_1__0__Impl rule__DataModel__Group_4_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DataModel__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_4_1__1();

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
    // $ANTLR end "rule__DataModel__Group_4_1__0"


    // $ANTLR start "rule__DataModel__Group_4_1__0__Impl"
    // InternalDatamodels.g:519:1: rule__DataModel__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:523:1: ( ( ',' ) )
            // InternalDatamodels.g:524:1: ( ',' )
            {
            // InternalDatamodels.g:524:1: ( ',' )
            // InternalDatamodels.g:525:2: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_4_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4_1__0__Impl"


    // $ANTLR start "rule__DataModel__Group_4_1__1"
    // InternalDatamodels.g:534:1: rule__DataModel__Group_4_1__1 : rule__DataModel__Group_4_1__1__Impl ;
    public final void rule__DataModel__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:538:1: ( rule__DataModel__Group_4_1__1__Impl )
            // InternalDatamodels.g:539:2: rule__DataModel__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__DataModel__Group_4_1__1"


    // $ANTLR start "rule__DataModel__Group_4_1__1__Impl"
    // InternalDatamodels.g:545:1: rule__DataModel__Group_4_1__1__Impl : ( ( rule__DataModel__EntitiesAssignment_4_1_1 ) ) ;
    public final void rule__DataModel__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:549:1: ( ( ( rule__DataModel__EntitiesAssignment_4_1_1 ) ) )
            // InternalDatamodels.g:550:1: ( ( rule__DataModel__EntitiesAssignment_4_1_1 ) )
            {
            // InternalDatamodels.g:550:1: ( ( rule__DataModel__EntitiesAssignment_4_1_1 ) )
            // InternalDatamodels.g:551:2: ( rule__DataModel__EntitiesAssignment_4_1_1 )
            {
             before(grammarAccess.getDataModelAccess().getEntitiesAssignment_4_1_1()); 
            // InternalDatamodels.g:552:2: ( rule__DataModel__EntitiesAssignment_4_1_1 )
            // InternalDatamodels.g:552:3: rule__DataModel__EntitiesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__EntitiesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getEntitiesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDatamodels.g:561:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:565:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDatamodels.g:566:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDatamodels.g:573:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:577:1: ( ( () ) )
            // InternalDatamodels.g:578:1: ( () )
            {
            // InternalDatamodels.g:578:1: ( () )
            // InternalDatamodels.g:579:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalDatamodels.g:580:2: ()
            // InternalDatamodels.g:580:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDatamodels.g:588:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:592:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDatamodels.g:593:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDatamodels.g:600:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:604:1: ( ( 'entity' ) )
            // InternalDatamodels.g:605:1: ( 'entity' )
            {
            // InternalDatamodels.g:605:1: ( 'entity' )
            // InternalDatamodels.g:606:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDatamodels.g:615:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:619:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDatamodels.g:620:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDatamodels.g:627:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:631:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalDatamodels.g:632:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalDatamodels.g:632:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalDatamodels.g:633:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalDatamodels.g:634:2: ( rule__Entity__NameAssignment_2 )
            // InternalDatamodels.g:634:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDatamodels.g:642:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:646:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDatamodels.g:647:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDatamodels.g:654:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:658:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalDatamodels.g:659:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalDatamodels.g:659:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalDatamodels.g:660:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalDatamodels.g:661:2: ( rule__Entity__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDatamodels.g:661:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDatamodels.g:669:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:673:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDatamodels.g:674:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDatamodels.g:681:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:685:1: ( ( '{' ) )
            // InternalDatamodels.g:686:1: ( '{' )
            {
            // InternalDatamodels.g:686:1: ( '{' )
            // InternalDatamodels.g:687:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDatamodels.g:696:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:700:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDatamodels.g:701:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDatamodels.g:708:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:712:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // InternalDatamodels.g:713:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // InternalDatamodels.g:713:1: ( ( rule__Entity__Group_5__0 )? )
            // InternalDatamodels.g:714:2: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // InternalDatamodels.g:715:2: ( rule__Entity__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22||LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDatamodels.g:715:3: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDatamodels.g:723:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:727:1: ( rule__Entity__Group__6__Impl )
            // InternalDatamodels.g:728:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDatamodels.g:734:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:738:1: ( ( '}' ) )
            // InternalDatamodels.g:739:1: ( '}' )
            {
            // InternalDatamodels.g:739:1: ( '}' )
            // InternalDatamodels.g:740:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalDatamodels.g:750:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:754:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalDatamodels.g:755:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalDatamodels.g:762:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:766:1: ( ( 'extends' ) )
            // InternalDatamodels.g:767:1: ( 'extends' )
            {
            // InternalDatamodels.g:767:1: ( 'extends' )
            // InternalDatamodels.g:768:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalDatamodels.g:777:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:781:1: ( rule__Entity__Group_3__1__Impl )
            // InternalDatamodels.g:782:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalDatamodels.g:788:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:792:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // InternalDatamodels.g:793:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // InternalDatamodels.g:793:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // InternalDatamodels.g:794:2: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // InternalDatamodels.g:795:2: ( rule__Entity__SuperEntityAssignment_3_1 )
            // InternalDatamodels.g:795:3: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperEntityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // InternalDatamodels.g:804:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:808:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // InternalDatamodels.g:809:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // InternalDatamodels.g:816:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__PropertiesAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:820:1: ( ( ( rule__Entity__PropertiesAssignment_5_0 ) ) )
            // InternalDatamodels.g:821:1: ( ( rule__Entity__PropertiesAssignment_5_0 ) )
            {
            // InternalDatamodels.g:821:1: ( ( rule__Entity__PropertiesAssignment_5_0 ) )
            // InternalDatamodels.g:822:2: ( rule__Entity__PropertiesAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_5_0()); 
            // InternalDatamodels.g:823:2: ( rule__Entity__PropertiesAssignment_5_0 )
            // InternalDatamodels.g:823:3: rule__Entity__PropertiesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__PropertiesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // InternalDatamodels.g:831:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:835:1: ( rule__Entity__Group_5__1__Impl )
            // InternalDatamodels.g:836:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // InternalDatamodels.g:842:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__Group_5_1__0 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:846:1: ( ( ( rule__Entity__Group_5_1__0 )* ) )
            // InternalDatamodels.g:847:1: ( ( rule__Entity__Group_5_1__0 )* )
            {
            // InternalDatamodels.g:847:1: ( ( rule__Entity__Group_5_1__0 )* )
            // InternalDatamodels.g:848:2: ( rule__Entity__Group_5_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_5_1()); 
            // InternalDatamodels.g:849:2: ( rule__Entity__Group_5_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDatamodels.g:849:3: rule__Entity__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group_5_1__0"
    // InternalDatamodels.g:858:1: rule__Entity__Group_5_1__0 : rule__Entity__Group_5_1__0__Impl rule__Entity__Group_5_1__1 ;
    public final void rule__Entity__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:862:1: ( rule__Entity__Group_5_1__0__Impl rule__Entity__Group_5_1__1 )
            // InternalDatamodels.g:863:2: rule__Entity__Group_5_1__0__Impl rule__Entity__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_1__1();

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
    // $ANTLR end "rule__Entity__Group_5_1__0"


    // $ANTLR start "rule__Entity__Group_5_1__0__Impl"
    // InternalDatamodels.g:870:1: rule__Entity__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:874:1: ( ( ',' ) )
            // InternalDatamodels.g:875:1: ( ',' )
            {
            // InternalDatamodels.g:875:1: ( ',' )
            // InternalDatamodels.g:876:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_5_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_5_1__1"
    // InternalDatamodels.g:885:1: rule__Entity__Group_5_1__1 : rule__Entity__Group_5_1__1__Impl ;
    public final void rule__Entity__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:889:1: ( rule__Entity__Group_5_1__1__Impl )
            // InternalDatamodels.g:890:2: rule__Entity__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5_1__1"


    // $ANTLR start "rule__Entity__Group_5_1__1__Impl"
    // InternalDatamodels.g:896:1: rule__Entity__Group_5_1__1__Impl : ( ( rule__Entity__PropertiesAssignment_5_1_1 ) ) ;
    public final void rule__Entity__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:900:1: ( ( ( rule__Entity__PropertiesAssignment_5_1_1 ) ) )
            // InternalDatamodels.g:901:1: ( ( rule__Entity__PropertiesAssignment_5_1_1 ) )
            {
            // InternalDatamodels.g:901:1: ( ( rule__Entity__PropertiesAssignment_5_1_1 ) )
            // InternalDatamodels.g:902:2: ( rule__Entity__PropertiesAssignment_5_1_1 )
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_5_1_1()); 
            // InternalDatamodels.g:903:2: ( rule__Entity__PropertiesAssignment_5_1_1 )
            // InternalDatamodels.g:903:3: rule__Entity__PropertiesAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__PropertiesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5_1__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__0"
    // InternalDatamodels.g:912:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:916:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalDatamodels.g:917:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AssociationEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__1();

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
    // $ANTLR end "rule__AssociationEnd__Group__0"


    // $ANTLR start "rule__AssociationEnd__Group__0__Impl"
    // InternalDatamodels.g:924:1: rule__AssociationEnd__Group__0__Impl : ( 'association' ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:928:1: ( ( 'association' ) )
            // InternalDatamodels.g:929:1: ( 'association' )
            {
            // InternalDatamodels.g:929:1: ( 'association' )
            // InternalDatamodels.g:930:2: 'association'
            {
             before(grammarAccess.getAssociationEndAccess().getAssociationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__1"
    // InternalDatamodels.g:939:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:943:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalDatamodels.g:944:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AssociationEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__2();

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
    // $ANTLR end "rule__AssociationEnd__Group__1"


    // $ANTLR start "rule__AssociationEnd__Group__1__Impl"
    // InternalDatamodels.g:951:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__TargetEntityAssignment_1 ) ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:955:1: ( ( ( rule__AssociationEnd__TargetEntityAssignment_1 ) ) )
            // InternalDatamodels.g:956:1: ( ( rule__AssociationEnd__TargetEntityAssignment_1 ) )
            {
            // InternalDatamodels.g:956:1: ( ( rule__AssociationEnd__TargetEntityAssignment_1 ) )
            // InternalDatamodels.g:957:2: ( rule__AssociationEnd__TargetEntityAssignment_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getTargetEntityAssignment_1()); 
            // InternalDatamodels.g:958:2: ( rule__AssociationEnd__TargetEntityAssignment_1 )
            // InternalDatamodels.g:958:3: rule__AssociationEnd__TargetEntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__TargetEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getTargetEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__2"
    // InternalDatamodels.g:966:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:970:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalDatamodels.g:971:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AssociationEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__3();

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
    // $ANTLR end "rule__AssociationEnd__Group__2"


    // $ANTLR start "rule__AssociationEnd__Group__2__Impl"
    // InternalDatamodels.g:978:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:982:1: ( ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) ) )
            // InternalDatamodels.g:983:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) )
            {
            // InternalDatamodels.g:983:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) )
            // InternalDatamodels.g:984:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_2()); 
            // InternalDatamodels.g:985:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )
            // InternalDatamodels.g:985:3: rule__AssociationEnd__MultiplicityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__MultiplicityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__3"
    // InternalDatamodels.g:993:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:997:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalDatamodels.g:998:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__AssociationEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__4();

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
    // $ANTLR end "rule__AssociationEnd__Group__3"


    // $ANTLR start "rule__AssociationEnd__Group__3__Impl"
    // InternalDatamodels.g:1005:1: rule__AssociationEnd__Group__3__Impl : ( ( rule__AssociationEnd__NameAssignment_3 ) ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1009:1: ( ( ( rule__AssociationEnd__NameAssignment_3 ) ) )
            // InternalDatamodels.g:1010:1: ( ( rule__AssociationEnd__NameAssignment_3 ) )
            {
            // InternalDatamodels.g:1010:1: ( ( rule__AssociationEnd__NameAssignment_3 ) )
            // InternalDatamodels.g:1011:2: ( rule__AssociationEnd__NameAssignment_3 )
            {
             before(grammarAccess.getAssociationEndAccess().getNameAssignment_3()); 
            // InternalDatamodels.g:1012:2: ( rule__AssociationEnd__NameAssignment_3 )
            // InternalDatamodels.g:1012:3: rule__AssociationEnd__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__3__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__4"
    // InternalDatamodels.g:1020:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1024:1: ( rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 )
            // InternalDatamodels.g:1025:2: rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__AssociationEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__5();

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
    // $ANTLR end "rule__AssociationEnd__Group__4"


    // $ANTLR start "rule__AssociationEnd__Group__4__Impl"
    // InternalDatamodels.g:1032:1: rule__AssociationEnd__Group__4__Impl : ( 'oppositeTo' ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1036:1: ( ( 'oppositeTo' ) )
            // InternalDatamodels.g:1037:1: ( 'oppositeTo' )
            {
            // InternalDatamodels.g:1037:1: ( 'oppositeTo' )
            // InternalDatamodels.g:1038:2: 'oppositeTo'
            {
             before(grammarAccess.getAssociationEndAccess().getOppositeToKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getOppositeToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__4__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__5"
    // InternalDatamodels.g:1047:1: rule__AssociationEnd__Group__5 : rule__AssociationEnd__Group__5__Impl rule__AssociationEnd__Group__6 ;
    public final void rule__AssociationEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1051:1: ( rule__AssociationEnd__Group__5__Impl rule__AssociationEnd__Group__6 )
            // InternalDatamodels.g:1052:2: rule__AssociationEnd__Group__5__Impl rule__AssociationEnd__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__AssociationEnd__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__6();

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
    // $ANTLR end "rule__AssociationEnd__Group__5"


    // $ANTLR start "rule__AssociationEnd__Group__5__Impl"
    // InternalDatamodels.g:1059:1: rule__AssociationEnd__Group__5__Impl : ( ( rule__AssociationEnd__OtherEndAssignment_5 ) ) ;
    public final void rule__AssociationEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1063:1: ( ( ( rule__AssociationEnd__OtherEndAssignment_5 ) ) )
            // InternalDatamodels.g:1064:1: ( ( rule__AssociationEnd__OtherEndAssignment_5 ) )
            {
            // InternalDatamodels.g:1064:1: ( ( rule__AssociationEnd__OtherEndAssignment_5 ) )
            // InternalDatamodels.g:1065:2: ( rule__AssociationEnd__OtherEndAssignment_5 )
            {
             before(grammarAccess.getAssociationEndAccess().getOtherEndAssignment_5()); 
            // InternalDatamodels.g:1066:2: ( rule__AssociationEnd__OtherEndAssignment_5 )
            // InternalDatamodels.g:1066:3: rule__AssociationEnd__OtherEndAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__OtherEndAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getOtherEndAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__5__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__6"
    // InternalDatamodels.g:1074:1: rule__AssociationEnd__Group__6 : rule__AssociationEnd__Group__6__Impl rule__AssociationEnd__Group__7 ;
    public final void rule__AssociationEnd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1078:1: ( rule__AssociationEnd__Group__6__Impl rule__AssociationEnd__Group__7 )
            // InternalDatamodels.g:1079:2: rule__AssociationEnd__Group__6__Impl rule__AssociationEnd__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__AssociationEnd__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__7();

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
    // $ANTLR end "rule__AssociationEnd__Group__6"


    // $ANTLR start "rule__AssociationEnd__Group__6__Impl"
    // InternalDatamodels.g:1086:1: rule__AssociationEnd__Group__6__Impl : ( 'in' ) ;
    public final void rule__AssociationEnd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1090:1: ( ( 'in' ) )
            // InternalDatamodels.g:1091:1: ( 'in' )
            {
            // InternalDatamodels.g:1091:1: ( 'in' )
            // InternalDatamodels.g:1092:2: 'in'
            {
             before(grammarAccess.getAssociationEndAccess().getInKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getInKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__6__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__7"
    // InternalDatamodels.g:1101:1: rule__AssociationEnd__Group__7 : rule__AssociationEnd__Group__7__Impl ;
    public final void rule__AssociationEnd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1105:1: ( rule__AssociationEnd__Group__7__Impl )
            // InternalDatamodels.g:1106:2: rule__AssociationEnd__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__7__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group__7"


    // $ANTLR start "rule__AssociationEnd__Group__7__Impl"
    // InternalDatamodels.g:1112:1: rule__AssociationEnd__Group__7__Impl : ( ( rule__AssociationEnd__AssociationNameAssignment_7 ) ) ;
    public final void rule__AssociationEnd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1116:1: ( ( ( rule__AssociationEnd__AssociationNameAssignment_7 ) ) )
            // InternalDatamodels.g:1117:1: ( ( rule__AssociationEnd__AssociationNameAssignment_7 ) )
            {
            // InternalDatamodels.g:1117:1: ( ( rule__AssociationEnd__AssociationNameAssignment_7 ) )
            // InternalDatamodels.g:1118:2: ( rule__AssociationEnd__AssociationNameAssignment_7 )
            {
             before(grammarAccess.getAssociationEndAccess().getAssociationNameAssignment_7()); 
            // InternalDatamodels.g:1119:2: ( rule__AssociationEnd__AssociationNameAssignment_7 )
            // InternalDatamodels.g:1119:3: rule__AssociationEnd__AssociationNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__AssociationNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getAssociationNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDatamodels.g:1128:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1132:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDatamodels.g:1133:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDatamodels.g:1140:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1144:1: ( ( 'attribute' ) )
            // InternalDatamodels.g:1145:1: ( 'attribute' )
            {
            // InternalDatamodels.g:1145:1: ( 'attribute' )
            // InternalDatamodels.g:1146:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDatamodels.g:1155:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1159:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDatamodels.g:1160:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDatamodels.g:1167:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1171:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDatamodels.g:1172:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDatamodels.g:1172:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDatamodels.g:1173:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDatamodels.g:1174:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDatamodels.g:1174:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDatamodels.g:1182:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1186:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDatamodels.g:1187:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDatamodels.g:1194:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__IsUniqueAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1198:1: ( ( ( rule__Attribute__IsUniqueAssignment_2 )? ) )
            // InternalDatamodels.g:1199:1: ( ( rule__Attribute__IsUniqueAssignment_2 )? )
            {
            // InternalDatamodels.g:1199:1: ( ( rule__Attribute__IsUniqueAssignment_2 )? )
            // InternalDatamodels.g:1200:2: ( rule__Attribute__IsUniqueAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getIsUniqueAssignment_2()); 
            // InternalDatamodels.g:1201:2: ( rule__Attribute__IsUniqueAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDatamodels.g:1201:3: rule__Attribute__IsUniqueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsUniqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsUniqueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalDatamodels.g:1209:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1213:1: ( rule__Attribute__Group__3__Impl )
            // InternalDatamodels.g:1214:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalDatamodels.g:1220:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1224:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalDatamodels.g:1225:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalDatamodels.g:1225:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalDatamodels.g:1226:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalDatamodels.g:1227:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalDatamodels.g:1227:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__DataModel__NameAssignment_2"
    // InternalDatamodels.g:1236:1: rule__DataModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DataModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1240:1: ( ( ruleEString ) )
            // InternalDatamodels.g:1241:2: ( ruleEString )
            {
            // InternalDatamodels.g:1241:2: ( ruleEString )
            // InternalDatamodels.g:1242:3: ruleEString
            {
             before(grammarAccess.getDataModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__NameAssignment_2"


    // $ANTLR start "rule__DataModel__EntitiesAssignment_4_0"
    // InternalDatamodels.g:1251:1: rule__DataModel__EntitiesAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__DataModel__EntitiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1255:1: ( ( ruleEntity ) )
            // InternalDatamodels.g:1256:2: ( ruleEntity )
            {
            // InternalDatamodels.g:1256:2: ( ruleEntity )
            // InternalDatamodels.g:1257:3: ruleEntity
            {
             before(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__EntitiesAssignment_4_0"


    // $ANTLR start "rule__DataModel__EntitiesAssignment_4_1_1"
    // InternalDatamodels.g:1266:1: rule__DataModel__EntitiesAssignment_4_1_1 : ( ruleEntity ) ;
    public final void rule__DataModel__EntitiesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1270:1: ( ( ruleEntity ) )
            // InternalDatamodels.g:1271:2: ( ruleEntity )
            {
            // InternalDatamodels.g:1271:2: ( ruleEntity )
            // InternalDatamodels.g:1272:3: ruleEntity
            {
             before(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__EntitiesAssignment_4_1_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalDatamodels.g:1281:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1285:1: ( ( ruleEString ) )
            // InternalDatamodels.g:1286:2: ( ruleEString )
            {
            // InternalDatamodels.g:1286:2: ( ruleEString )
            // InternalDatamodels.g:1287:3: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_3_1"
    // InternalDatamodels.g:1296:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1300:1: ( ( ( ruleEString ) ) )
            // InternalDatamodels.g:1301:2: ( ( ruleEString ) )
            {
            // InternalDatamodels.g:1301:2: ( ( ruleEString ) )
            // InternalDatamodels.g:1302:3: ( ruleEString )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // InternalDatamodels.g:1303:3: ( ruleEString )
            // InternalDatamodels.g:1304:4: ruleEString
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperEntityEntityEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperEntityAssignment_3_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_5_0"
    // InternalDatamodels.g:1315:1: rule__Entity__PropertiesAssignment_5_0 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1319:1: ( ( ruleProperty ) )
            // InternalDatamodels.g:1320:2: ( ruleProperty )
            {
            // InternalDatamodels.g:1320:2: ( ruleProperty )
            // InternalDatamodels.g:1321:3: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertiesAssignment_5_0"


    // $ANTLR start "rule__Entity__PropertiesAssignment_5_1_1"
    // InternalDatamodels.g:1330:1: rule__Entity__PropertiesAssignment_5_1_1 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1334:1: ( ( ruleProperty ) )
            // InternalDatamodels.g:1335:2: ( ruleProperty )
            {
            // InternalDatamodels.g:1335:2: ( ruleProperty )
            // InternalDatamodels.g:1336:3: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertiesAssignment_5_1_1"


    // $ANTLR start "rule__AssociationEnd__TargetEntityAssignment_1"
    // InternalDatamodels.g:1345:1: rule__AssociationEnd__TargetEntityAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__AssociationEnd__TargetEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1349:1: ( ( ( ruleEString ) ) )
            // InternalDatamodels.g:1350:2: ( ( ruleEString ) )
            {
            // InternalDatamodels.g:1350:2: ( ( ruleEString ) )
            // InternalDatamodels.g:1351:3: ( ruleEString )
            {
             before(grammarAccess.getAssociationEndAccess().getTargetEntityEntityCrossReference_1_0()); 
            // InternalDatamodels.g:1352:3: ( ruleEString )
            // InternalDatamodels.g:1353:4: ruleEString
            {
             before(grammarAccess.getAssociationEndAccess().getTargetEntityEntityEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getTargetEntityEntityEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAssociationEndAccess().getTargetEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__TargetEntityAssignment_1"


    // $ANTLR start "rule__AssociationEnd__MultiplicityAssignment_2"
    // InternalDatamodels.g:1364:1: rule__AssociationEnd__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1368:1: ( ( ruleMultiplicity ) )
            // InternalDatamodels.g:1369:2: ( ruleMultiplicity )
            {
            // InternalDatamodels.g:1369:2: ( ruleMultiplicity )
            // InternalDatamodels.g:1370:3: ruleMultiplicity
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__MultiplicityAssignment_2"


    // $ANTLR start "rule__AssociationEnd__NameAssignment_3"
    // InternalDatamodels.g:1379:1: rule__AssociationEnd__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__AssociationEnd__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1383:1: ( ( ruleEString ) )
            // InternalDatamodels.g:1384:2: ( ruleEString )
            {
            // InternalDatamodels.g:1384:2: ( ruleEString )
            // InternalDatamodels.g:1385:3: ruleEString
            {
             before(grammarAccess.getAssociationEndAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__NameAssignment_3"


    // $ANTLR start "rule__AssociationEnd__OtherEndAssignment_5"
    // InternalDatamodels.g:1394:1: rule__AssociationEnd__OtherEndAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AssociationEnd__OtherEndAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1398:1: ( ( ( ruleEString ) ) )
            // InternalDatamodels.g:1399:2: ( ( ruleEString ) )
            {
            // InternalDatamodels.g:1399:2: ( ( ruleEString ) )
            // InternalDatamodels.g:1400:3: ( ruleEString )
            {
             before(grammarAccess.getAssociationEndAccess().getOtherEndAssociationEndCrossReference_5_0()); 
            // InternalDatamodels.g:1401:3: ( ruleEString )
            // InternalDatamodels.g:1402:4: ruleEString
            {
             before(grammarAccess.getAssociationEndAccess().getOtherEndAssociationEndEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getOtherEndAssociationEndEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAssociationEndAccess().getOtherEndAssociationEndCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__OtherEndAssignment_5"


    // $ANTLR start "rule__AssociationEnd__AssociationNameAssignment_7"
    // InternalDatamodels.g:1413:1: rule__AssociationEnd__AssociationNameAssignment_7 : ( ruleEString ) ;
    public final void rule__AssociationEnd__AssociationNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1417:1: ( ( ruleEString ) )
            // InternalDatamodels.g:1418:2: ( ruleEString )
            {
            // InternalDatamodels.g:1418:2: ( ruleEString )
            // InternalDatamodels.g:1419:3: ruleEString
            {
             before(grammarAccess.getAssociationEndAccess().getAssociationNameEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getAssociationNameEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__AssociationNameAssignment_7"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalDatamodels.g:1428:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1432:1: ( ( ruleEString ) )
            // InternalDatamodels.g:1433:2: ( ruleEString )
            {
            // InternalDatamodels.g:1433:2: ( ruleEString )
            // InternalDatamodels.g:1434:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__IsUniqueAssignment_2"
    // InternalDatamodels.g:1443:1: rule__Attribute__IsUniqueAssignment_2 : ( ( 'unique' ) ) ;
    public final void rule__Attribute__IsUniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1447:1: ( ( ( 'unique' ) ) )
            // InternalDatamodels.g:1448:2: ( ( 'unique' ) )
            {
            // InternalDatamodels.g:1448:2: ( ( 'unique' ) )
            // InternalDatamodels.g:1449:3: ( 'unique' )
            {
             before(grammarAccess.getAttributeAccess().getIsUniqueUniqueKeyword_2_0()); 
            // InternalDatamodels.g:1450:3: ( 'unique' )
            // InternalDatamodels.g:1451:4: 'unique'
            {
             before(grammarAccess.getAttributeAccess().getIsUniqueUniqueKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsUniqueUniqueKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsUniqueUniqueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsUniqueAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalDatamodels.g:1462:1: rule__Attribute__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatamodels.g:1466:1: ( ( ruleDataType ) )
            // InternalDatamodels.g:1467:2: ( ruleDataType )
            {
            // InternalDatamodels.g:1467:2: ( ruleDataType )
            // InternalDatamodels.g:1468:3: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004006000L});

}
package org.smalluml.ide.contentassist.antlr.internal;

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
import org.smalluml.services.SMallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'}'", "'super'", "'method'", "','", "'attribute'", "'role'", "'Method'", "'parameter'", "'returnType'", "'Attribute'", "'type'", "'Role'", "'relation'", "'Parameter'", "'String'", "'Integer'", "'Bool'", "'Real'", "'UnlimitedNatural'", "'Enumeration'", "'value'", "'-'", "'Composition'", "'upperBound'", "'lowerBound'", "'('", "')'", "'Reference'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSMallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSMallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSMallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSMallUML.g"; }


    	private SMallUMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SMallUMLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleClass"
    // InternalSMallUML.g:53:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSMallUML.g:54:1: ( ruleClass EOF )
            // InternalSMallUML.g:55:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSMallUML.g:62:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:66:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSMallUML.g:67:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSMallUML.g:67:2: ( ( rule__Class__Group__0 ) )
            // InternalSMallUML.g:68:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSMallUML.g:69:3: ( rule__Class__Group__0 )
            // InternalSMallUML.g:69:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleType"
    // InternalSMallUML.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSMallUML.g:79:1: ( ruleType EOF )
            // InternalSMallUML.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSMallUML.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSMallUML.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSMallUML.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSMallUML.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSMallUML.g:94:3: ( rule__Type__Alternatives )
            // InternalSMallUML.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalSMallUML.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSMallUML.g:104:1: ( ruleEString EOF )
            // InternalSMallUML.g:105:1: ruleEString EOF
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
    // InternalSMallUML.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSMallUML.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSMallUML.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSMallUML.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSMallUML.g:119:3: ( rule__EString__Alternatives )
            // InternalSMallUML.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleMethod"
    // InternalSMallUML.g:128:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSMallUML.g:129:1: ( ruleMethod EOF )
            // InternalSMallUML.g:130:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSMallUML.g:137:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:141:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSMallUML.g:142:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSMallUML.g:142:2: ( ( rule__Method__Group__0 ) )
            // InternalSMallUML.g:143:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSMallUML.g:144:3: ( rule__Method__Group__0 )
            // InternalSMallUML.g:144:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleAttribute"
    // InternalSMallUML.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSMallUML.g:154:1: ( ruleAttribute EOF )
            // InternalSMallUML.g:155:1: ruleAttribute EOF
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
    // InternalSMallUML.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSMallUML.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSMallUML.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSMallUML.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSMallUML.g:169:3: ( rule__Attribute__Group__0 )
            // InternalSMallUML.g:169:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleRole"
    // InternalSMallUML.g:178:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSMallUML.g:179:1: ( ruleRole EOF )
            // InternalSMallUML.g:180:1: ruleRole EOF
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
    // InternalSMallUML.g:187:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:191:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSMallUML.g:192:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSMallUML.g:192:2: ( ( rule__Role__Group__0 ) )
            // InternalSMallUML.g:193:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSMallUML.g:194:3: ( rule__Role__Group__0 )
            // InternalSMallUML.g:194:4: rule__Role__Group__0
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


    // $ANTLR start "entryRuleParameter"
    // InternalSMallUML.g:203:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSMallUML.g:204:1: ( ruleParameter EOF )
            // InternalSMallUML.g:205:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSMallUML.g:212:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:216:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSMallUML.g:217:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSMallUML.g:217:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSMallUML.g:218:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSMallUML.g:219:3: ( rule__Parameter__Group__0 )
            // InternalSMallUML.g:219:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleString0"
    // InternalSMallUML.g:228:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSMallUML.g:229:1: ( ruleString0 EOF )
            // InternalSMallUML.g:230:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSMallUML.g:237:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:241:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSMallUML.g:242:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSMallUML.g:242:2: ( ( rule__String0__Group__0 ) )
            // InternalSMallUML.g:243:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSMallUML.g:244:3: ( rule__String0__Group__0 )
            // InternalSMallUML.g:244:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInteger"
    // InternalSMallUML.g:253:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSMallUML.g:254:1: ( ruleInteger EOF )
            // InternalSMallUML.g:255:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSMallUML.g:262:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:266:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSMallUML.g:267:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSMallUML.g:267:2: ( ( rule__Integer__Group__0 ) )
            // InternalSMallUML.g:268:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSMallUML.g:269:3: ( rule__Integer__Group__0 )
            // InternalSMallUML.g:269:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBool"
    // InternalSMallUML.g:278:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalSMallUML.g:279:1: ( ruleBool EOF )
            // InternalSMallUML.g:280:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalSMallUML.g:287:1: ruleBool : ( ( rule__Bool__Group__0 ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:291:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalSMallUML.g:292:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalSMallUML.g:292:2: ( ( rule__Bool__Group__0 ) )
            // InternalSMallUML.g:293:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalSMallUML.g:294:3: ( rule__Bool__Group__0 )
            // InternalSMallUML.g:294:4: rule__Bool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleReal"
    // InternalSMallUML.g:303:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalSMallUML.g:304:1: ( ruleReal EOF )
            // InternalSMallUML.g:305:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSMallUML.g:312:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:316:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalSMallUML.g:317:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalSMallUML.g:317:2: ( ( rule__Real__Group__0 ) )
            // InternalSMallUML.g:318:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalSMallUML.g:319:3: ( rule__Real__Group__0 )
            // InternalSMallUML.g:319:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalSMallUML.g:328:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // InternalSMallUML.g:329:1: ( ruleUnlimitedNatural EOF )
            // InternalSMallUML.g:330:1: ruleUnlimitedNatural EOF
            {
             before(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            ruleUnlimitedNatural();

            state._fsp--;

             after(grammarAccess.getUnlimitedNaturalRule()); 
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
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalSMallUML.g:337:1: ruleUnlimitedNatural : ( ( rule__UnlimitedNatural__Group__0 ) ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:341:2: ( ( ( rule__UnlimitedNatural__Group__0 ) ) )
            // InternalSMallUML.g:342:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            {
            // InternalSMallUML.g:342:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            // InternalSMallUML.g:343:3: ( rule__UnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getGroup()); 
            // InternalSMallUML.g:344:3: ( rule__UnlimitedNatural__Group__0 )
            // InternalSMallUML.g:344:4: rule__UnlimitedNatural__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnlimitedNaturalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSMallUML.g:353:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSMallUML.g:354:1: ( ruleEnumeration EOF )
            // InternalSMallUML.g:355:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSMallUML.g:362:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:366:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSMallUML.g:367:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSMallUML.g:367:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSMallUML.g:368:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSMallUML.g:369:3: ( rule__Enumeration__Group__0 )
            // InternalSMallUML.g:369:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEInt"
    // InternalSMallUML.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSMallUML.g:379:1: ( ruleEInt EOF )
            // InternalSMallUML.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSMallUML.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSMallUML.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSMallUML.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalSMallUML.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSMallUML.g:394:3: ( rule__EInt__Group__0 )
            // InternalSMallUML.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleComposition"
    // InternalSMallUML.g:403:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalSMallUML.g:404:1: ( ruleComposition EOF )
            // InternalSMallUML.g:405:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalSMallUML.g:412:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:416:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalSMallUML.g:417:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalSMallUML.g:417:2: ( ( rule__Composition__Group__0 ) )
            // InternalSMallUML.g:418:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalSMallUML.g:419:3: ( rule__Composition__Group__0 )
            // InternalSMallUML.g:419:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleReference"
    // InternalSMallUML.g:428:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalSMallUML.g:429:1: ( ruleReference EOF )
            // InternalSMallUML.g:430:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalSMallUML.g:437:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:441:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalSMallUML.g:442:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalSMallUML.g:442:2: ( ( rule__Reference__Group__0 ) )
            // InternalSMallUML.g:443:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalSMallUML.g:444:3: ( rule__Reference__Group__0 )
            // InternalSMallUML.g:444:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSMallUML.g:452:1: rule__Type__Alternatives : ( ( ruleString0 ) | ( ruleInteger ) | ( ruleBool ) | ( ruleReal ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:456:1: ( ( ruleString0 ) | ( ruleInteger ) | ( ruleBool ) | ( ruleReal ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSMallUML.g:457:2: ( ruleString0 )
                    {
                    // InternalSMallUML.g:457:2: ( ruleString0 )
                    // InternalSMallUML.g:458:3: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSMallUML.g:463:2: ( ruleInteger )
                    {
                    // InternalSMallUML.g:463:2: ( ruleInteger )
                    // InternalSMallUML.g:464:3: ruleInteger
                    {
                     before(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSMallUML.g:469:2: ( ruleBool )
                    {
                    // InternalSMallUML.g:469:2: ( ruleBool )
                    // InternalSMallUML.g:470:3: ruleBool
                    {
                     before(grammarAccess.getTypeAccess().getBoolParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBool();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBoolParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSMallUML.g:475:2: ( ruleReal )
                    {
                    // InternalSMallUML.g:475:2: ( ruleReal )
                    // InternalSMallUML.g:476:3: ruleReal
                    {
                     before(grammarAccess.getTypeAccess().getRealParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRealParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSMallUML.g:481:2: ( ruleUnlimitedNatural )
                    {
                    // InternalSMallUML.g:481:2: ( ruleUnlimitedNatural )
                    // InternalSMallUML.g:482:3: ruleUnlimitedNatural
                    {
                     before(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUnlimitedNatural();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSMallUML.g:487:2: ( ruleEnumeration )
                    {
                    // InternalSMallUML.g:487:2: ( ruleEnumeration )
                    // InternalSMallUML.g:488:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSMallUML.g:497:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:501:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSMallUML.g:502:2: ( RULE_STRING )
                    {
                    // InternalSMallUML.g:502:2: ( RULE_STRING )
                    // InternalSMallUML.g:503:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSMallUML.g:508:2: ( RULE_ID )
                    {
                    // InternalSMallUML.g:508:2: ( RULE_ID )
                    // InternalSMallUML.g:509:3: RULE_ID
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


    // $ANTLR start "rule__Class__Group__0"
    // InternalSMallUML.g:518:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:522:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSMallUML.g:523:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalSMallUML.g:530:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:534:1: ( ( () ) )
            // InternalSMallUML.g:535:1: ( () )
            {
            // InternalSMallUML.g:535:1: ( () )
            // InternalSMallUML.g:536:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalSMallUML.g:537:2: ()
            // InternalSMallUML.g:537:3: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalSMallUML.g:545:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:549:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSMallUML.g:550:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalSMallUML.g:557:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:561:1: ( ( 'Class' ) )
            // InternalSMallUML.g:562:1: ( 'Class' )
            {
            // InternalSMallUML.g:562:1: ( 'Class' )
            // InternalSMallUML.g:563:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalSMallUML.g:572:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:576:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSMallUML.g:577:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

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
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalSMallUML.g:584:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:588:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSMallUML.g:589:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSMallUML.g:589:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSMallUML.g:590:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSMallUML.g:591:2: ( rule__Class__NameAssignment_2 )
            // InternalSMallUML.g:591:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalSMallUML.g:599:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:603:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSMallUML.g:604:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

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
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalSMallUML.g:611:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:615:1: ( ( '{' ) )
            // InternalSMallUML.g:616:1: ( '{' )
            {
            // InternalSMallUML.g:616:1: ( '{' )
            // InternalSMallUML.g:617:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalSMallUML.g:626:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:630:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSMallUML.g:631:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalSMallUML.g:638:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:642:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSMallUML.g:643:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSMallUML.g:643:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSMallUML.g:644:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSMallUML.g:645:2: ( rule__Class__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSMallUML.g:645:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalSMallUML.g:653:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:657:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSMallUML.g:658:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalSMallUML.g:665:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:669:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSMallUML.g:670:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSMallUML.g:670:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSMallUML.g:671:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSMallUML.g:672:2: ( rule__Class__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSMallUML.g:672:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalSMallUML.g:680:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:684:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSMallUML.g:685:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalSMallUML.g:692:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:696:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSMallUML.g:697:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSMallUML.g:697:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSMallUML.g:698:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSMallUML.g:699:2: ( rule__Class__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSMallUML.g:699:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalSMallUML.g:707:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:711:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalSMallUML.g:712:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

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
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalSMallUML.g:719:1: rule__Class__Group__7__Impl : ( ( rule__Class__Group_7__0 )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:723:1: ( ( ( rule__Class__Group_7__0 )? ) )
            // InternalSMallUML.g:724:1: ( ( rule__Class__Group_7__0 )? )
            {
            // InternalSMallUML.g:724:1: ( ( rule__Class__Group_7__0 )? )
            // InternalSMallUML.g:725:2: ( rule__Class__Group_7__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_7()); 
            // InternalSMallUML.g:726:2: ( rule__Class__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSMallUML.g:726:3: rule__Class__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalSMallUML.g:734:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:738:1: ( rule__Class__Group__8__Impl )
            // InternalSMallUML.g:739:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

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
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalSMallUML.g:745:1: rule__Class__Group__8__Impl : ( '}' ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:749:1: ( ( '}' ) )
            // InternalSMallUML.g:750:1: ( '}' )
            {
            // InternalSMallUML.g:750:1: ( '}' )
            // InternalSMallUML.g:751:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalSMallUML.g:761:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:765:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSMallUML.g:766:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

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
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalSMallUML.g:773:1: rule__Class__Group_4__0__Impl : ( 'super' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:777:1: ( ( 'super' ) )
            // InternalSMallUML.g:778:1: ( 'super' )
            {
            // InternalSMallUML.g:778:1: ( 'super' )
            // InternalSMallUML.g:779:2: 'super'
            {
             before(grammarAccess.getClassAccess().getSuperKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getSuperKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalSMallUML.g:788:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:792:1: ( rule__Class__Group_4__1__Impl )
            // InternalSMallUML.g:793:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

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
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalSMallUML.g:799:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__SuperAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:803:1: ( ( ( rule__Class__SuperAssignment_4_1 ) ) )
            // InternalSMallUML.g:804:1: ( ( rule__Class__SuperAssignment_4_1 ) )
            {
            // InternalSMallUML.g:804:1: ( ( rule__Class__SuperAssignment_4_1 ) )
            // InternalSMallUML.g:805:2: ( rule__Class__SuperAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getSuperAssignment_4_1()); 
            // InternalSMallUML.g:806:2: ( rule__Class__SuperAssignment_4_1 )
            // InternalSMallUML.g:806:3: rule__Class__SuperAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalSMallUML.g:815:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:819:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSMallUML.g:820:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

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
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalSMallUML.g:827:1: rule__Class__Group_5__0__Impl : ( 'method' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:831:1: ( ( 'method' ) )
            // InternalSMallUML.g:832:1: ( 'method' )
            {
            // InternalSMallUML.g:832:1: ( 'method' )
            // InternalSMallUML.g:833:2: 'method'
            {
             before(grammarAccess.getClassAccess().getMethodKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getMethodKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalSMallUML.g:842:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:846:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSMallUML.g:847:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

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
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalSMallUML.g:854:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:858:1: ( ( '{' ) )
            // InternalSMallUML.g:859:1: ( '{' )
            {
            // InternalSMallUML.g:859:1: ( '{' )
            // InternalSMallUML.g:860:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalSMallUML.g:869:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:873:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSMallUML.g:874:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__3();

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
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalSMallUML.g:881:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__MethodAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:885:1: ( ( ( rule__Class__MethodAssignment_5_2 ) ) )
            // InternalSMallUML.g:886:1: ( ( rule__Class__MethodAssignment_5_2 ) )
            {
            // InternalSMallUML.g:886:1: ( ( rule__Class__MethodAssignment_5_2 ) )
            // InternalSMallUML.g:887:2: ( rule__Class__MethodAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getMethodAssignment_5_2()); 
            // InternalSMallUML.g:888:2: ( rule__Class__MethodAssignment_5_2 )
            // InternalSMallUML.g:888:3: rule__Class__MethodAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5__3"
    // InternalSMallUML.g:896:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:900:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSMallUML.g:901:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4();

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
    // $ANTLR end "rule__Class__Group_5__3"


    // $ANTLR start "rule__Class__Group_5__3__Impl"
    // InternalSMallUML.g:908:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__Group_5_3__0 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:912:1: ( ( ( rule__Class__Group_5_3__0 )* ) )
            // InternalSMallUML.g:913:1: ( ( rule__Class__Group_5_3__0 )* )
            {
            // InternalSMallUML.g:913:1: ( ( rule__Class__Group_5_3__0 )* )
            // InternalSMallUML.g:914:2: ( rule__Class__Group_5_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_3()); 
            // InternalSMallUML.g:915:2: ( rule__Class__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSMallUML.g:915:3: rule__Class__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Class__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3__Impl"


    // $ANTLR start "rule__Class__Group_5__4"
    // InternalSMallUML.g:923:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:927:1: ( rule__Class__Group_5__4__Impl )
            // InternalSMallUML.g:928:2: rule__Class__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4__Impl();

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
    // $ANTLR end "rule__Class__Group_5__4"


    // $ANTLR start "rule__Class__Group_5__4__Impl"
    // InternalSMallUML.g:934:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:938:1: ( ( '}' ) )
            // InternalSMallUML.g:939:1: ( '}' )
            {
            // InternalSMallUML.g:939:1: ( '}' )
            // InternalSMallUML.g:940:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4__Impl"


    // $ANTLR start "rule__Class__Group_5_3__0"
    // InternalSMallUML.g:950:1: rule__Class__Group_5_3__0 : rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 ;
    public final void rule__Class__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:954:1: ( rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 )
            // InternalSMallUML.g:955:2: rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_3__1();

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
    // $ANTLR end "rule__Class__Group_5_3__0"


    // $ANTLR start "rule__Class__Group_5_3__0__Impl"
    // InternalSMallUML.g:962:1: rule__Class__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:966:1: ( ( ',' ) )
            // InternalSMallUML.g:967:1: ( ',' )
            {
            // InternalSMallUML.g:967:1: ( ',' )
            // InternalSMallUML.g:968:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__0__Impl"


    // $ANTLR start "rule__Class__Group_5_3__1"
    // InternalSMallUML.g:977:1: rule__Class__Group_5_3__1 : rule__Class__Group_5_3__1__Impl ;
    public final void rule__Class__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:981:1: ( rule__Class__Group_5_3__1__Impl )
            // InternalSMallUML.g:982:2: rule__Class__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Class__Group_5_3__1"


    // $ANTLR start "rule__Class__Group_5_3__1__Impl"
    // InternalSMallUML.g:988:1: rule__Class__Group_5_3__1__Impl : ( ( rule__Class__MethodAssignment_5_3_1 ) ) ;
    public final void rule__Class__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:992:1: ( ( ( rule__Class__MethodAssignment_5_3_1 ) ) )
            // InternalSMallUML.g:993:1: ( ( rule__Class__MethodAssignment_5_3_1 ) )
            {
            // InternalSMallUML.g:993:1: ( ( rule__Class__MethodAssignment_5_3_1 ) )
            // InternalSMallUML.g:994:2: ( rule__Class__MethodAssignment_5_3_1 )
            {
             before(grammarAccess.getClassAccess().getMethodAssignment_5_3_1()); 
            // InternalSMallUML.g:995:2: ( rule__Class__MethodAssignment_5_3_1 )
            // InternalSMallUML.g:995:3: rule__Class__MethodAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__MethodAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMethodAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalSMallUML.g:1004:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1008:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSMallUML.g:1009:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

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
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalSMallUML.g:1016:1: rule__Class__Group_6__0__Impl : ( 'attribute' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1020:1: ( ( 'attribute' ) )
            // InternalSMallUML.g:1021:1: ( 'attribute' )
            {
            // InternalSMallUML.g:1021:1: ( 'attribute' )
            // InternalSMallUML.g:1022:2: 'attribute'
            {
             before(grammarAccess.getClassAccess().getAttributeKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalSMallUML.g:1031:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1035:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSMallUML.g:1036:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

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
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalSMallUML.g:1043:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1047:1: ( ( '{' ) )
            // InternalSMallUML.g:1048:1: ( '{' )
            {
            // InternalSMallUML.g:1048:1: ( '{' )
            // InternalSMallUML.g:1049:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalSMallUML.g:1058:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1062:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSMallUML.g:1063:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

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
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalSMallUML.g:1070:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__AttributeAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1074:1: ( ( ( rule__Class__AttributeAssignment_6_2 ) ) )
            // InternalSMallUML.g:1075:1: ( ( rule__Class__AttributeAssignment_6_2 ) )
            {
            // InternalSMallUML.g:1075:1: ( ( rule__Class__AttributeAssignment_6_2 ) )
            // InternalSMallUML.g:1076:2: ( rule__Class__AttributeAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getAttributeAssignment_6_2()); 
            // InternalSMallUML.g:1077:2: ( rule__Class__AttributeAssignment_6_2 )
            // InternalSMallUML.g:1077:3: rule__Class__AttributeAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributeAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalSMallUML.g:1085:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1089:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSMallUML.g:1090:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

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
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalSMallUML.g:1097:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1101:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalSMallUML.g:1102:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalSMallUML.g:1102:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalSMallUML.g:1103:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalSMallUML.g:1104:2: ( rule__Class__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSMallUML.g:1104:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalSMallUML.g:1112:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1116:1: ( rule__Class__Group_6__4__Impl )
            // InternalSMallUML.g:1117:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

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
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalSMallUML.g:1123:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1127:1: ( ( '}' ) )
            // InternalSMallUML.g:1128:1: ( '}' )
            {
            // InternalSMallUML.g:1128:1: ( '}' )
            // InternalSMallUML.g:1129:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Class__Group_6_3__0"
    // InternalSMallUML.g:1139:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1143:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalSMallUML.g:1144:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1();

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
    // $ANTLR end "rule__Class__Group_6_3__0"


    // $ANTLR start "rule__Class__Group_6_3__0__Impl"
    // InternalSMallUML.g:1151:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1155:1: ( ( ',' ) )
            // InternalSMallUML.g:1156:1: ( ',' )
            {
            // InternalSMallUML.g:1156:1: ( ',' )
            // InternalSMallUML.g:1157:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0__Impl"


    // $ANTLR start "rule__Class__Group_6_3__1"
    // InternalSMallUML.g:1166:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1170:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalSMallUML.g:1171:2: rule__Class__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Class__Group_6_3__1"


    // $ANTLR start "rule__Class__Group_6_3__1__Impl"
    // InternalSMallUML.g:1177:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__AttributeAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1181:1: ( ( ( rule__Class__AttributeAssignment_6_3_1 ) ) )
            // InternalSMallUML.g:1182:1: ( ( rule__Class__AttributeAssignment_6_3_1 ) )
            {
            // InternalSMallUML.g:1182:1: ( ( rule__Class__AttributeAssignment_6_3_1 ) )
            // InternalSMallUML.g:1183:2: ( rule__Class__AttributeAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributeAssignment_6_3_1()); 
            // InternalSMallUML.g:1184:2: ( rule__Class__AttributeAssignment_6_3_1 )
            // InternalSMallUML.g:1184:3: rule__Class__AttributeAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributeAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributeAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1__Impl"


    // $ANTLR start "rule__Class__Group_7__0"
    // InternalSMallUML.g:1193:1: rule__Class__Group_7__0 : rule__Class__Group_7__0__Impl rule__Class__Group_7__1 ;
    public final void rule__Class__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1197:1: ( rule__Class__Group_7__0__Impl rule__Class__Group_7__1 )
            // InternalSMallUML.g:1198:2: rule__Class__Group_7__0__Impl rule__Class__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__1();

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
    // $ANTLR end "rule__Class__Group_7__0"


    // $ANTLR start "rule__Class__Group_7__0__Impl"
    // InternalSMallUML.g:1205:1: rule__Class__Group_7__0__Impl : ( 'role' ) ;
    public final void rule__Class__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1209:1: ( ( 'role' ) )
            // InternalSMallUML.g:1210:1: ( 'role' )
            {
            // InternalSMallUML.g:1210:1: ( 'role' )
            // InternalSMallUML.g:1211:2: 'role'
            {
             before(grammarAccess.getClassAccess().getRoleKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRoleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0__Impl"


    // $ANTLR start "rule__Class__Group_7__1"
    // InternalSMallUML.g:1220:1: rule__Class__Group_7__1 : rule__Class__Group_7__1__Impl rule__Class__Group_7__2 ;
    public final void rule__Class__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1224:1: ( rule__Class__Group_7__1__Impl rule__Class__Group_7__2 )
            // InternalSMallUML.g:1225:2: rule__Class__Group_7__1__Impl rule__Class__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__2();

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
    // $ANTLR end "rule__Class__Group_7__1"


    // $ANTLR start "rule__Class__Group_7__1__Impl"
    // InternalSMallUML.g:1232:1: rule__Class__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1236:1: ( ( '{' ) )
            // InternalSMallUML.g:1237:1: ( '{' )
            {
            // InternalSMallUML.g:1237:1: ( '{' )
            // InternalSMallUML.g:1238:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1__Impl"


    // $ANTLR start "rule__Class__Group_7__2"
    // InternalSMallUML.g:1247:1: rule__Class__Group_7__2 : rule__Class__Group_7__2__Impl rule__Class__Group_7__3 ;
    public final void rule__Class__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1251:1: ( rule__Class__Group_7__2__Impl rule__Class__Group_7__3 )
            // InternalSMallUML.g:1252:2: rule__Class__Group_7__2__Impl rule__Class__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__3();

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
    // $ANTLR end "rule__Class__Group_7__2"


    // $ANTLR start "rule__Class__Group_7__2__Impl"
    // InternalSMallUML.g:1259:1: rule__Class__Group_7__2__Impl : ( ( rule__Class__RoleAssignment_7_2 ) ) ;
    public final void rule__Class__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1263:1: ( ( ( rule__Class__RoleAssignment_7_2 ) ) )
            // InternalSMallUML.g:1264:1: ( ( rule__Class__RoleAssignment_7_2 ) )
            {
            // InternalSMallUML.g:1264:1: ( ( rule__Class__RoleAssignment_7_2 ) )
            // InternalSMallUML.g:1265:2: ( rule__Class__RoleAssignment_7_2 )
            {
             before(grammarAccess.getClassAccess().getRoleAssignment_7_2()); 
            // InternalSMallUML.g:1266:2: ( rule__Class__RoleAssignment_7_2 )
            // InternalSMallUML.g:1266:3: rule__Class__RoleAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__RoleAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getRoleAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2__Impl"


    // $ANTLR start "rule__Class__Group_7__3"
    // InternalSMallUML.g:1274:1: rule__Class__Group_7__3 : rule__Class__Group_7__3__Impl rule__Class__Group_7__4 ;
    public final void rule__Class__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1278:1: ( rule__Class__Group_7__3__Impl rule__Class__Group_7__4 )
            // InternalSMallUML.g:1279:2: rule__Class__Group_7__3__Impl rule__Class__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4();

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
    // $ANTLR end "rule__Class__Group_7__3"


    // $ANTLR start "rule__Class__Group_7__3__Impl"
    // InternalSMallUML.g:1286:1: rule__Class__Group_7__3__Impl : ( ( rule__Class__Group_7_3__0 )* ) ;
    public final void rule__Class__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1290:1: ( ( ( rule__Class__Group_7_3__0 )* ) )
            // InternalSMallUML.g:1291:1: ( ( rule__Class__Group_7_3__0 )* )
            {
            // InternalSMallUML.g:1291:1: ( ( rule__Class__Group_7_3__0 )* )
            // InternalSMallUML.g:1292:2: ( rule__Class__Group_7_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_7_3()); 
            // InternalSMallUML.g:1293:2: ( rule__Class__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSMallUML.g:1293:3: rule__Class__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Class__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3__Impl"


    // $ANTLR start "rule__Class__Group_7__4"
    // InternalSMallUML.g:1301:1: rule__Class__Group_7__4 : rule__Class__Group_7__4__Impl ;
    public final void rule__Class__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1305:1: ( rule__Class__Group_7__4__Impl )
            // InternalSMallUML.g:1306:2: rule__Class__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4__Impl();

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
    // $ANTLR end "rule__Class__Group_7__4"


    // $ANTLR start "rule__Class__Group_7__4__Impl"
    // InternalSMallUML.g:1312:1: rule__Class__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1316:1: ( ( '}' ) )
            // InternalSMallUML.g:1317:1: ( '}' )
            {
            // InternalSMallUML.g:1317:1: ( '}' )
            // InternalSMallUML.g:1318:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4__Impl"


    // $ANTLR start "rule__Class__Group_7_3__0"
    // InternalSMallUML.g:1328:1: rule__Class__Group_7_3__0 : rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 ;
    public final void rule__Class__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1332:1: ( rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 )
            // InternalSMallUML.g:1333:2: rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1();

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
    // $ANTLR end "rule__Class__Group_7_3__0"


    // $ANTLR start "rule__Class__Group_7_3__0__Impl"
    // InternalSMallUML.g:1340:1: rule__Class__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1344:1: ( ( ',' ) )
            // InternalSMallUML.g:1345:1: ( ',' )
            {
            // InternalSMallUML.g:1345:1: ( ',' )
            // InternalSMallUML.g:1346:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0__Impl"


    // $ANTLR start "rule__Class__Group_7_3__1"
    // InternalSMallUML.g:1355:1: rule__Class__Group_7_3__1 : rule__Class__Group_7_3__1__Impl ;
    public final void rule__Class__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1359:1: ( rule__Class__Group_7_3__1__Impl )
            // InternalSMallUML.g:1360:2: rule__Class__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Class__Group_7_3__1"


    // $ANTLR start "rule__Class__Group_7_3__1__Impl"
    // InternalSMallUML.g:1366:1: rule__Class__Group_7_3__1__Impl : ( ( rule__Class__RoleAssignment_7_3_1 ) ) ;
    public final void rule__Class__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1370:1: ( ( ( rule__Class__RoleAssignment_7_3_1 ) ) )
            // InternalSMallUML.g:1371:1: ( ( rule__Class__RoleAssignment_7_3_1 ) )
            {
            // InternalSMallUML.g:1371:1: ( ( rule__Class__RoleAssignment_7_3_1 ) )
            // InternalSMallUML.g:1372:2: ( rule__Class__RoleAssignment_7_3_1 )
            {
             before(grammarAccess.getClassAccess().getRoleAssignment_7_3_1()); 
            // InternalSMallUML.g:1373:2: ( rule__Class__RoleAssignment_7_3_1 )
            // InternalSMallUML.g:1373:3: rule__Class__RoleAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__RoleAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getRoleAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalSMallUML.g:1382:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1386:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSMallUML.g:1387:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalSMallUML.g:1394:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1398:1: ( ( () ) )
            // InternalSMallUML.g:1399:1: ( () )
            {
            // InternalSMallUML.g:1399:1: ( () )
            // InternalSMallUML.g:1400:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSMallUML.g:1401:2: ()
            // InternalSMallUML.g:1401:3: 
            {
            }

             after(grammarAccess.getMethodAccess().getMethodAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalSMallUML.g:1409:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1413:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSMallUML.g:1414:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalSMallUML.g:1421:1: rule__Method__Group__1__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1425:1: ( ( 'Method' ) )
            // InternalSMallUML.g:1426:1: ( 'Method' )
            {
            // InternalSMallUML.g:1426:1: ( 'Method' )
            // InternalSMallUML.g:1427:2: 'Method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalSMallUML.g:1436:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1440:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSMallUML.g:1441:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalSMallUML.g:1448:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1452:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalSMallUML.g:1453:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalSMallUML.g:1453:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalSMallUML.g:1454:2: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // InternalSMallUML.g:1455:2: ( rule__Method__NameAssignment_2 )
            // InternalSMallUML.g:1455:3: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalSMallUML.g:1463:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1467:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSMallUML.g:1468:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalSMallUML.g:1475:1: rule__Method__Group__3__Impl : ( '{' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1479:1: ( ( '{' ) )
            // InternalSMallUML.g:1480:1: ( '{' )
            {
            // InternalSMallUML.g:1480:1: ( '{' )
            // InternalSMallUML.g:1481:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalSMallUML.g:1490:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1494:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSMallUML.g:1495:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalSMallUML.g:1502:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1506:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalSMallUML.g:1507:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalSMallUML.g:1507:1: ( ( rule__Method__Group_4__0 )? )
            // InternalSMallUML.g:1508:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSMallUML.g:1509:2: ( rule__Method__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSMallUML.g:1509:3: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalSMallUML.g:1517:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1521:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSMallUML.g:1522:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalSMallUML.g:1529:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1533:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalSMallUML.g:1534:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalSMallUML.g:1534:1: ( ( rule__Method__Group_5__0 )? )
            // InternalSMallUML.g:1535:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalSMallUML.g:1536:2: ( rule__Method__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSMallUML.g:1536:3: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalSMallUML.g:1544:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1548:1: ( rule__Method__Group__6__Impl )
            // InternalSMallUML.g:1549:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__6__Impl();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalSMallUML.g:1555:1: rule__Method__Group__6__Impl : ( '}' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1559:1: ( ( '}' ) )
            // InternalSMallUML.g:1560:1: ( '}' )
            {
            // InternalSMallUML.g:1560:1: ( '}' )
            // InternalSMallUML.g:1561:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // InternalSMallUML.g:1571:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1575:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSMallUML.g:1576:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1();

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
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // InternalSMallUML.g:1583:1: rule__Method__Group_4__0__Impl : ( 'parameter' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1587:1: ( ( 'parameter' ) )
            // InternalSMallUML.g:1588:1: ( 'parameter' )
            {
            // InternalSMallUML.g:1588:1: ( 'parameter' )
            // InternalSMallUML.g:1589:2: 'parameter'
            {
             before(grammarAccess.getMethodAccess().getParameterKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getParameterKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // InternalSMallUML.g:1598:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl rule__Method__Group_4__2 ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1602:1: ( rule__Method__Group_4__1__Impl rule__Method__Group_4__2 )
            // InternalSMallUML.g:1603:2: rule__Method__Group_4__1__Impl rule__Method__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Method__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__2();

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
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // InternalSMallUML.g:1610:1: rule__Method__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1614:1: ( ( '{' ) )
            // InternalSMallUML.g:1615:1: ( '{' )
            {
            // InternalSMallUML.g:1615:1: ( '{' )
            // InternalSMallUML.g:1616:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group_4__2"
    // InternalSMallUML.g:1625:1: rule__Method__Group_4__2 : rule__Method__Group_4__2__Impl rule__Method__Group_4__3 ;
    public final void rule__Method__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1629:1: ( rule__Method__Group_4__2__Impl rule__Method__Group_4__3 )
            // InternalSMallUML.g:1630:2: rule__Method__Group_4__2__Impl rule__Method__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Method__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__3();

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
    // $ANTLR end "rule__Method__Group_4__2"


    // $ANTLR start "rule__Method__Group_4__2__Impl"
    // InternalSMallUML.g:1637:1: rule__Method__Group_4__2__Impl : ( ( rule__Method__ParameterAssignment_4_2 ) ) ;
    public final void rule__Method__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1641:1: ( ( ( rule__Method__ParameterAssignment_4_2 ) ) )
            // InternalSMallUML.g:1642:1: ( ( rule__Method__ParameterAssignment_4_2 ) )
            {
            // InternalSMallUML.g:1642:1: ( ( rule__Method__ParameterAssignment_4_2 ) )
            // InternalSMallUML.g:1643:2: ( rule__Method__ParameterAssignment_4_2 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_2()); 
            // InternalSMallUML.g:1644:2: ( rule__Method__ParameterAssignment_4_2 )
            // InternalSMallUML.g:1644:3: rule__Method__ParameterAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParameterAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__2__Impl"


    // $ANTLR start "rule__Method__Group_4__3"
    // InternalSMallUML.g:1652:1: rule__Method__Group_4__3 : rule__Method__Group_4__3__Impl rule__Method__Group_4__4 ;
    public final void rule__Method__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1656:1: ( rule__Method__Group_4__3__Impl rule__Method__Group_4__4 )
            // InternalSMallUML.g:1657:2: rule__Method__Group_4__3__Impl rule__Method__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Method__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__4();

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
    // $ANTLR end "rule__Method__Group_4__3"


    // $ANTLR start "rule__Method__Group_4__3__Impl"
    // InternalSMallUML.g:1664:1: rule__Method__Group_4__3__Impl : ( ( rule__Method__Group_4_3__0 )* ) ;
    public final void rule__Method__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1668:1: ( ( ( rule__Method__Group_4_3__0 )* ) )
            // InternalSMallUML.g:1669:1: ( ( rule__Method__Group_4_3__0 )* )
            {
            // InternalSMallUML.g:1669:1: ( ( rule__Method__Group_4_3__0 )* )
            // InternalSMallUML.g:1670:2: ( rule__Method__Group_4_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4_3()); 
            // InternalSMallUML.g:1671:2: ( rule__Method__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSMallUML.g:1671:3: rule__Method__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Method__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__3__Impl"


    // $ANTLR start "rule__Method__Group_4__4"
    // InternalSMallUML.g:1679:1: rule__Method__Group_4__4 : rule__Method__Group_4__4__Impl ;
    public final void rule__Method__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1683:1: ( rule__Method__Group_4__4__Impl )
            // InternalSMallUML.g:1684:2: rule__Method__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4__4__Impl();

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
    // $ANTLR end "rule__Method__Group_4__4"


    // $ANTLR start "rule__Method__Group_4__4__Impl"
    // InternalSMallUML.g:1690:1: rule__Method__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Method__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1694:1: ( ( '}' ) )
            // InternalSMallUML.g:1695:1: ( '}' )
            {
            // InternalSMallUML.g:1695:1: ( '}' )
            // InternalSMallUML.g:1696:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__4__Impl"


    // $ANTLR start "rule__Method__Group_4_3__0"
    // InternalSMallUML.g:1706:1: rule__Method__Group_4_3__0 : rule__Method__Group_4_3__0__Impl rule__Method__Group_4_3__1 ;
    public final void rule__Method__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1710:1: ( rule__Method__Group_4_3__0__Impl rule__Method__Group_4_3__1 )
            // InternalSMallUML.g:1711:2: rule__Method__Group_4_3__0__Impl rule__Method__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Method__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4_3__1();

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
    // $ANTLR end "rule__Method__Group_4_3__0"


    // $ANTLR start "rule__Method__Group_4_3__0__Impl"
    // InternalSMallUML.g:1718:1: rule__Method__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1722:1: ( ( ',' ) )
            // InternalSMallUML.g:1723:1: ( ',' )
            {
            // InternalSMallUML.g:1723:1: ( ',' )
            // InternalSMallUML.g:1724:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4_3__0__Impl"


    // $ANTLR start "rule__Method__Group_4_3__1"
    // InternalSMallUML.g:1733:1: rule__Method__Group_4_3__1 : rule__Method__Group_4_3__1__Impl ;
    public final void rule__Method__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1737:1: ( rule__Method__Group_4_3__1__Impl )
            // InternalSMallUML.g:1738:2: rule__Method__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Method__Group_4_3__1"


    // $ANTLR start "rule__Method__Group_4_3__1__Impl"
    // InternalSMallUML.g:1744:1: rule__Method__Group_4_3__1__Impl : ( ( rule__Method__ParameterAssignment_4_3_1 ) ) ;
    public final void rule__Method__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1748:1: ( ( ( rule__Method__ParameterAssignment_4_3_1 ) ) )
            // InternalSMallUML.g:1749:1: ( ( rule__Method__ParameterAssignment_4_3_1 ) )
            {
            // InternalSMallUML.g:1749:1: ( ( rule__Method__ParameterAssignment_4_3_1 ) )
            // InternalSMallUML.g:1750:2: ( rule__Method__ParameterAssignment_4_3_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_3_1()); 
            // InternalSMallUML.g:1751:2: ( rule__Method__ParameterAssignment_4_3_1 )
            // InternalSMallUML.g:1751:3: rule__Method__ParameterAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParameterAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4_3__1__Impl"


    // $ANTLR start "rule__Method__Group_5__0"
    // InternalSMallUML.g:1760:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1764:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalSMallUML.g:1765:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1();

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
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // InternalSMallUML.g:1772:1: rule__Method__Group_5__0__Impl : ( 'returnType' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1776:1: ( ( 'returnType' ) )
            // InternalSMallUML.g:1777:1: ( 'returnType' )
            {
            // InternalSMallUML.g:1777:1: ( 'returnType' )
            // InternalSMallUML.g:1778:2: 'returnType'
            {
             before(grammarAccess.getMethodAccess().getReturnTypeKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getReturnTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // InternalSMallUML.g:1787:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1791:1: ( rule__Method__Group_5__1__Impl )
            // InternalSMallUML.g:1792:2: rule__Method__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1__Impl();

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
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // InternalSMallUML.g:1798:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1802:1: ( ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) )
            // InternalSMallUML.g:1803:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            {
            // InternalSMallUML.g:1803:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            // InternalSMallUML.g:1804:2: ( rule__Method__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1()); 
            // InternalSMallUML.g:1805:2: ( rule__Method__ReturnTypeAssignment_5_1 )
            // InternalSMallUML.g:1805:3: rule__Method__ReturnTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturnTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSMallUML.g:1814:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1818:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSMallUML.g:1819:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSMallUML.g:1826:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1830:1: ( ( 'Attribute' ) )
            // InternalSMallUML.g:1831:1: ( 'Attribute' )
            {
            // InternalSMallUML.g:1831:1: ( 'Attribute' )
            // InternalSMallUML.g:1832:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSMallUML.g:1841:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1845:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSMallUML.g:1846:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSMallUML.g:1853:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1857:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSMallUML.g:1858:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSMallUML.g:1858:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSMallUML.g:1859:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSMallUML.g:1860:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSMallUML.g:1860:3: rule__Attribute__NameAssignment_1
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
    // InternalSMallUML.g:1868:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1872:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSMallUML.g:1873:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSMallUML.g:1880:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1884:1: ( ( '{' ) )
            // InternalSMallUML.g:1885:1: ( '{' )
            {
            // InternalSMallUML.g:1885:1: ( '{' )
            // InternalSMallUML.g:1886:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalSMallUML.g:1895:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1899:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSMallUML.g:1900:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // InternalSMallUML.g:1907:1: rule__Attribute__Group__3__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1911:1: ( ( 'type' ) )
            // InternalSMallUML.g:1912:1: ( 'type' )
            {
            // InternalSMallUML.g:1912:1: ( 'type' )
            // InternalSMallUML.g:1913:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSMallUML.g:1922:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1926:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSMallUML.g:1927:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalSMallUML.g:1934:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1938:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalSMallUML.g:1939:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalSMallUML.g:1939:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalSMallUML.g:1940:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalSMallUML.g:1941:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalSMallUML.g:1941:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSMallUML.g:1949:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1953:1: ( rule__Attribute__Group__5__Impl )
            // InternalSMallUML.g:1954:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalSMallUML.g:1960:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1964:1: ( ( '}' ) )
            // InternalSMallUML.g:1965:1: ( '}' )
            {
            // InternalSMallUML.g:1965:1: ( '}' )
            // InternalSMallUML.g:1966:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSMallUML.g:1976:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1980:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSMallUML.g:1981:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSMallUML.g:1988:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:1992:1: ( ( 'Role' ) )
            // InternalSMallUML.g:1993:1: ( 'Role' )
            {
            // InternalSMallUML.g:1993:1: ( 'Role' )
            // InternalSMallUML.g:1994:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
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
    // InternalSMallUML.g:2003:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2007:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSMallUML.g:2008:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSMallUML.g:2015:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2019:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalSMallUML.g:2020:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalSMallUML.g:2020:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalSMallUML.g:2021:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalSMallUML.g:2022:2: ( rule__Role__NameAssignment_1 )
            // InternalSMallUML.g:2022:3: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalSMallUML.g:2030:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2034:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSMallUML.g:2035:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

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
    // InternalSMallUML.g:2042:1: rule__Role__Group__2__Impl : ( '{' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2046:1: ( ( '{' ) )
            // InternalSMallUML.g:2047:1: ( '{' )
            {
            // InternalSMallUML.g:2047:1: ( '{' )
            // InternalSMallUML.g:2048:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Role__Group__3"
    // InternalSMallUML.g:2057:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2061:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSMallUML.g:2062:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

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
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalSMallUML.g:2069:1: rule__Role__Group__3__Impl : ( 'relation' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2073:1: ( ( 'relation' ) )
            // InternalSMallUML.g:2074:1: ( 'relation' )
            {
            // InternalSMallUML.g:2074:1: ( 'relation' )
            // InternalSMallUML.g:2075:2: 'relation'
            {
             before(grammarAccess.getRoleAccess().getRelationKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRelationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalSMallUML.g:2084:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2088:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSMallUML.g:2089:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

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
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalSMallUML.g:2096:1: rule__Role__Group__4__Impl : ( ( rule__Role__RelationAssignment_4 ) ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2100:1: ( ( ( rule__Role__RelationAssignment_4 ) ) )
            // InternalSMallUML.g:2101:1: ( ( rule__Role__RelationAssignment_4 ) )
            {
            // InternalSMallUML.g:2101:1: ( ( rule__Role__RelationAssignment_4 ) )
            // InternalSMallUML.g:2102:2: ( rule__Role__RelationAssignment_4 )
            {
             before(grammarAccess.getRoleAccess().getRelationAssignment_4()); 
            // InternalSMallUML.g:2103:2: ( rule__Role__RelationAssignment_4 )
            // InternalSMallUML.g:2103:3: rule__Role__RelationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Role__RelationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRelationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalSMallUML.g:2111:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2115:1: ( rule__Role__Group__5__Impl )
            // InternalSMallUML.g:2116:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__5__Impl();

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
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalSMallUML.g:2122:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2126:1: ( ( '}' ) )
            // InternalSMallUML.g:2127:1: ( '}' )
            {
            // InternalSMallUML.g:2127:1: ( '}' )
            // InternalSMallUML.g:2128:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSMallUML.g:2138:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2142:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSMallUML.g:2143:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSMallUML.g:2150:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2154:1: ( ( 'Parameter' ) )
            // InternalSMallUML.g:2155:1: ( 'Parameter' )
            {
            // InternalSMallUML.g:2155:1: ( 'Parameter' )
            // InternalSMallUML.g:2156:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSMallUML.g:2165:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2169:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSMallUML.g:2170:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSMallUML.g:2177:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2181:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalSMallUML.g:2182:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalSMallUML.g:2182:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalSMallUML.g:2183:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalSMallUML.g:2184:2: ( rule__Parameter__NameAssignment_1 )
            // InternalSMallUML.g:2184:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalSMallUML.g:2192:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2196:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalSMallUML.g:2197:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalSMallUML.g:2204:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2208:1: ( ( '{' ) )
            // InternalSMallUML.g:2209:1: ( '{' )
            {
            // InternalSMallUML.g:2209:1: ( '{' )
            // InternalSMallUML.g:2210:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalSMallUML.g:2219:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2223:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalSMallUML.g:2224:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalSMallUML.g:2231:1: rule__Parameter__Group__3__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2235:1: ( ( 'type' ) )
            // InternalSMallUML.g:2236:1: ( 'type' )
            {
            // InternalSMallUML.g:2236:1: ( 'type' )
            // InternalSMallUML.g:2237:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalSMallUML.g:2246:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2250:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalSMallUML.g:2251:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalSMallUML.g:2258:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2262:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalSMallUML.g:2263:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalSMallUML.g:2263:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalSMallUML.g:2264:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalSMallUML.g:2265:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalSMallUML.g:2265:3: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalSMallUML.g:2273:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2277:1: ( rule__Parameter__Group__5__Impl )
            // InternalSMallUML.g:2278:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalSMallUML.g:2284:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2288:1: ( ( '}' ) )
            // InternalSMallUML.g:2289:1: ( '}' )
            {
            // InternalSMallUML.g:2289:1: ( '}' )
            // InternalSMallUML.g:2290:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalSMallUML.g:2300:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2304:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSMallUML.g:2305:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

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
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalSMallUML.g:2312:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2316:1: ( ( () ) )
            // InternalSMallUML.g:2317:1: ( () )
            {
            // InternalSMallUML.g:2317:1: ( () )
            // InternalSMallUML.g:2318:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSMallUML.g:2319:2: ()
            // InternalSMallUML.g:2319:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalSMallUML.g:2327:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2331:1: ( rule__String0__Group__1__Impl )
            // InternalSMallUML.g:2332:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

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
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalSMallUML.g:2338:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2342:1: ( ( 'String' ) )
            // InternalSMallUML.g:2343:1: ( 'String' )
            {
            // InternalSMallUML.g:2343:1: ( 'String' )
            // InternalSMallUML.g:2344:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalSMallUML.g:2354:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2358:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSMallUML.g:2359:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalSMallUML.g:2366:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2370:1: ( ( () ) )
            // InternalSMallUML.g:2371:1: ( () )
            {
            // InternalSMallUML.g:2371:1: ( () )
            // InternalSMallUML.g:2372:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSMallUML.g:2373:2: ()
            // InternalSMallUML.g:2373:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalSMallUML.g:2381:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2385:1: ( rule__Integer__Group__1__Impl )
            // InternalSMallUML.g:2386:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__1__Impl();

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalSMallUML.g:2392:1: rule__Integer__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2396:1: ( ( 'Integer' ) )
            // InternalSMallUML.g:2397:1: ( 'Integer' )
            {
            // InternalSMallUML.g:2397:1: ( 'Integer' )
            // InternalSMallUML.g:2398:2: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Bool__Group__0"
    // InternalSMallUML.g:2408:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2412:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalSMallUML.g:2413:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Bool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group__1();

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
    // $ANTLR end "rule__Bool__Group__0"


    // $ANTLR start "rule__Bool__Group__0__Impl"
    // InternalSMallUML.g:2420:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2424:1: ( ( () ) )
            // InternalSMallUML.g:2425:1: ( () )
            {
            // InternalSMallUML.g:2425:1: ( () )
            // InternalSMallUML.g:2426:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalSMallUML.g:2427:2: ()
            // InternalSMallUML.g:2427:3: 
            {
            }

             after(grammarAccess.getBoolAccess().getBoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0__Impl"


    // $ANTLR start "rule__Bool__Group__1"
    // InternalSMallUML.g:2435:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2439:1: ( rule__Bool__Group__1__Impl )
            // InternalSMallUML.g:2440:2: rule__Bool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__1__Impl();

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
    // $ANTLR end "rule__Bool__Group__1"


    // $ANTLR start "rule__Bool__Group__1__Impl"
    // InternalSMallUML.g:2446:1: rule__Bool__Group__1__Impl : ( 'Bool' ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2450:1: ( ( 'Bool' ) )
            // InternalSMallUML.g:2451:1: ( 'Bool' )
            {
            // InternalSMallUML.g:2451:1: ( 'Bool' )
            // InternalSMallUML.g:2452:2: 'Bool'
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBoolAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalSMallUML.g:2462:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2466:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSMallUML.g:2467:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

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
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalSMallUML.g:2474:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2478:1: ( ( () ) )
            // InternalSMallUML.g:2479:1: ( () )
            {
            // InternalSMallUML.g:2479:1: ( () )
            // InternalSMallUML.g:2480:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSMallUML.g:2481:2: ()
            // InternalSMallUML.g:2481:3: 
            {
            }

             after(grammarAccess.getRealAccess().getRealAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalSMallUML.g:2489:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2493:1: ( rule__Real__Group__1__Impl )
            // InternalSMallUML.g:2494:2: rule__Real__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__1__Impl();

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
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalSMallUML.g:2500:1: rule__Real__Group__1__Impl : ( 'Real' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2504:1: ( ( 'Real' ) )
            // InternalSMallUML.g:2505:1: ( 'Real' )
            {
            // InternalSMallUML.g:2505:1: ( 'Real' )
            // InternalSMallUML.g:2506:2: 'Real'
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getRealKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__UnlimitedNatural__Group__0"
    // InternalSMallUML.g:2516:1: rule__UnlimitedNatural__Group__0 : rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 ;
    public final void rule__UnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2520:1: ( rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 )
            // InternalSMallUML.g:2521:2: rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__UnlimitedNatural__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Group__1();

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
    // $ANTLR end "rule__UnlimitedNatural__Group__0"


    // $ANTLR start "rule__UnlimitedNatural__Group__0__Impl"
    // InternalSMallUML.g:2528:1: rule__UnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__UnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2532:1: ( ( () ) )
            // InternalSMallUML.g:2533:1: ( () )
            {
            // InternalSMallUML.g:2533:1: ( () )
            // InternalSMallUML.g:2534:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0()); 
            // InternalSMallUML.g:2535:2: ()
            // InternalSMallUML.g:2535:3: 
            {
            }

             after(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNatural__Group__0__Impl"


    // $ANTLR start "rule__UnlimitedNatural__Group__1"
    // InternalSMallUML.g:2543:1: rule__UnlimitedNatural__Group__1 : rule__UnlimitedNatural__Group__1__Impl ;
    public final void rule__UnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2547:1: ( rule__UnlimitedNatural__Group__1__Impl )
            // InternalSMallUML.g:2548:2: rule__UnlimitedNatural__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Group__1__Impl();

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
    // $ANTLR end "rule__UnlimitedNatural__Group__1"


    // $ANTLR start "rule__UnlimitedNatural__Group__1__Impl"
    // InternalSMallUML.g:2554:1: rule__UnlimitedNatural__Group__1__Impl : ( 'UnlimitedNatural' ) ;
    public final void rule__UnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2558:1: ( ( 'UnlimitedNatural' ) )
            // InternalSMallUML.g:2559:1: ( 'UnlimitedNatural' )
            {
            // InternalSMallUML.g:2559:1: ( 'UnlimitedNatural' )
            // InternalSMallUML.g:2560:2: 'UnlimitedNatural'
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedNatural__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSMallUML.g:2570:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2574:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSMallUML.g:2575:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalSMallUML.g:2582:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2586:1: ( ( 'Enumeration' ) )
            // InternalSMallUML.g:2587:1: ( 'Enumeration' )
            {
            // InternalSMallUML.g:2587:1: ( 'Enumeration' )
            // InternalSMallUML.g:2588:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSMallUML.g:2597:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2601:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSMallUML.g:2602:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalSMallUML.g:2609:1: rule__Enumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2613:1: ( ( '{' ) )
            // InternalSMallUML.g:2614:1: ( '{' )
            {
            // InternalSMallUML.g:2614:1: ( '{' )
            // InternalSMallUML.g:2615:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalSMallUML.g:2624:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2628:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSMallUML.g:2629:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalSMallUML.g:2636:1: rule__Enumeration__Group__2__Impl : ( 'value' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2640:1: ( ( 'value' ) )
            // InternalSMallUML.g:2641:1: ( 'value' )
            {
            // InternalSMallUML.g:2641:1: ( 'value' )
            // InternalSMallUML.g:2642:2: 'value'
            {
             before(grammarAccess.getEnumerationAccess().getValueKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalSMallUML.g:2651:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2655:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSMallUML.g:2656:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalSMallUML.g:2663:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2667:1: ( ( '{' ) )
            // InternalSMallUML.g:2668:1: ( '{' )
            {
            // InternalSMallUML.g:2668:1: ( '{' )
            // InternalSMallUML.g:2669:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalSMallUML.g:2678:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2682:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSMallUML.g:2683:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalSMallUML.g:2690:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__ValueAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2694:1: ( ( ( rule__Enumeration__ValueAssignment_4 ) ) )
            // InternalSMallUML.g:2695:1: ( ( rule__Enumeration__ValueAssignment_4 ) )
            {
            // InternalSMallUML.g:2695:1: ( ( rule__Enumeration__ValueAssignment_4 ) )
            // InternalSMallUML.g:2696:2: ( rule__Enumeration__ValueAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_4()); 
            // InternalSMallUML.g:2697:2: ( rule__Enumeration__ValueAssignment_4 )
            // InternalSMallUML.g:2697:3: rule__Enumeration__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalSMallUML.g:2705:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2709:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSMallUML.g:2710:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

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
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalSMallUML.g:2717:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__Group_5__0 )* ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2721:1: ( ( ( rule__Enumeration__Group_5__0 )* ) )
            // InternalSMallUML.g:2722:1: ( ( rule__Enumeration__Group_5__0 )* )
            {
            // InternalSMallUML.g:2722:1: ( ( rule__Enumeration__Group_5__0 )* )
            // InternalSMallUML.g:2723:2: ( rule__Enumeration__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_5()); 
            // InternalSMallUML.g:2724:2: ( rule__Enumeration__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSMallUML.g:2724:3: rule__Enumeration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Enumeration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalSMallUML.g:2732:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2736:1: ( rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 )
            // InternalSMallUML.g:2737:2: rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__7();

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
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalSMallUML.g:2744:1: rule__Enumeration__Group__6__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2748:1: ( ( '}' ) )
            // InternalSMallUML.g:2749:1: ( '}' )
            {
            // InternalSMallUML.g:2749:1: ( '}' )
            // InternalSMallUML.g:2750:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group__7"
    // InternalSMallUML.g:2759:1: rule__Enumeration__Group__7 : rule__Enumeration__Group__7__Impl ;
    public final void rule__Enumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2763:1: ( rule__Enumeration__Group__7__Impl )
            // InternalSMallUML.g:2764:2: rule__Enumeration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__7__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__7"


    // $ANTLR start "rule__Enumeration__Group__7__Impl"
    // InternalSMallUML.g:2770:1: rule__Enumeration__Group__7__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2774:1: ( ( '}' ) )
            // InternalSMallUML.g:2775:1: ( '}' )
            {
            // InternalSMallUML.g:2775:1: ( '}' )
            // InternalSMallUML.g:2776:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__7__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__0"
    // InternalSMallUML.g:2786:1: rule__Enumeration__Group_5__0 : rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 ;
    public final void rule__Enumeration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2790:1: ( rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 )
            // InternalSMallUML.g:2791:2: rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Enumeration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1();

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
    // $ANTLR end "rule__Enumeration__Group_5__0"


    // $ANTLR start "rule__Enumeration__Group_5__0__Impl"
    // InternalSMallUML.g:2798:1: rule__Enumeration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2802:1: ( ( ',' ) )
            // InternalSMallUML.g:2803:1: ( ',' )
            {
            // InternalSMallUML.g:2803:1: ( ',' )
            // InternalSMallUML.g:2804:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__1"
    // InternalSMallUML.g:2813:1: rule__Enumeration__Group_5__1 : rule__Enumeration__Group_5__1__Impl ;
    public final void rule__Enumeration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2817:1: ( rule__Enumeration__Group_5__1__Impl )
            // InternalSMallUML.g:2818:2: rule__Enumeration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_5__1"


    // $ANTLR start "rule__Enumeration__Group_5__1__Impl"
    // InternalSMallUML.g:2824:1: rule__Enumeration__Group_5__1__Impl : ( ( rule__Enumeration__ValueAssignment_5_1 ) ) ;
    public final void rule__Enumeration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2828:1: ( ( ( rule__Enumeration__ValueAssignment_5_1 ) ) )
            // InternalSMallUML.g:2829:1: ( ( rule__Enumeration__ValueAssignment_5_1 ) )
            {
            // InternalSMallUML.g:2829:1: ( ( rule__Enumeration__ValueAssignment_5_1 ) )
            // InternalSMallUML.g:2830:2: ( rule__Enumeration__ValueAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_5_1()); 
            // InternalSMallUML.g:2831:2: ( rule__Enumeration__ValueAssignment_5_1 )
            // InternalSMallUML.g:2831:3: rule__Enumeration__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSMallUML.g:2840:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2844:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSMallUML.g:2845:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSMallUML.g:2852:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2856:1: ( ( ( '-' )? ) )
            // InternalSMallUML.g:2857:1: ( ( '-' )? )
            {
            // InternalSMallUML.g:2857:1: ( ( '-' )? )
            // InternalSMallUML.g:2858:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSMallUML.g:2859:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSMallUML.g:2859:3: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSMallUML.g:2867:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2871:1: ( rule__EInt__Group__1__Impl )
            // InternalSMallUML.g:2872:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSMallUML.g:2878:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2882:1: ( ( RULE_INT ) )
            // InternalSMallUML.g:2883:1: ( RULE_INT )
            {
            // InternalSMallUML.g:2883:1: ( RULE_INT )
            // InternalSMallUML.g:2884:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalSMallUML.g:2894:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2898:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalSMallUML.g:2899:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

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
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalSMallUML.g:2906:1: rule__Composition__Group__0__Impl : ( () ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2910:1: ( ( () ) )
            // InternalSMallUML.g:2911:1: ( () )
            {
            // InternalSMallUML.g:2911:1: ( () )
            // InternalSMallUML.g:2912:2: ()
            {
             before(grammarAccess.getCompositionAccess().getCompositionAction_0()); 
            // InternalSMallUML.g:2913:2: ()
            // InternalSMallUML.g:2913:3: 
            {
            }

             after(grammarAccess.getCompositionAccess().getCompositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalSMallUML.g:2921:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2925:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalSMallUML.g:2926:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

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
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalSMallUML.g:2933:1: rule__Composition__Group__1__Impl : ( 'Composition' ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2937:1: ( ( 'Composition' ) )
            // InternalSMallUML.g:2938:1: ( 'Composition' )
            {
            // InternalSMallUML.g:2938:1: ( 'Composition' )
            // InternalSMallUML.g:2939:2: 'Composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCompositionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalSMallUML.g:2948:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2952:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalSMallUML.g:2953:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__3();

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
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalSMallUML.g:2960:1: rule__Composition__Group__2__Impl : ( ( rule__Composition__NameAssignment_2 ) ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2964:1: ( ( ( rule__Composition__NameAssignment_2 ) ) )
            // InternalSMallUML.g:2965:1: ( ( rule__Composition__NameAssignment_2 ) )
            {
            // InternalSMallUML.g:2965:1: ( ( rule__Composition__NameAssignment_2 ) )
            // InternalSMallUML.g:2966:2: ( rule__Composition__NameAssignment_2 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_2()); 
            // InternalSMallUML.g:2967:2: ( rule__Composition__NameAssignment_2 )
            // InternalSMallUML.g:2967:3: rule__Composition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Composition__Group__3"
    // InternalSMallUML.g:2975:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2979:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalSMallUML.g:2980:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Composition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__4();

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
    // $ANTLR end "rule__Composition__Group__3"


    // $ANTLR start "rule__Composition__Group__3__Impl"
    // InternalSMallUML.g:2987:1: rule__Composition__Group__3__Impl : ( '{' ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:2991:1: ( ( '{' ) )
            // InternalSMallUML.g:2992:1: ( '{' )
            {
            // InternalSMallUML.g:2992:1: ( '{' )
            // InternalSMallUML.g:2993:2: '{'
            {
             before(grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3__Impl"


    // $ANTLR start "rule__Composition__Group__4"
    // InternalSMallUML.g:3002:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3006:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalSMallUML.g:3007:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Composition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__5();

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
    // $ANTLR end "rule__Composition__Group__4"


    // $ANTLR start "rule__Composition__Group__4__Impl"
    // InternalSMallUML.g:3014:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Group_4__0 )? ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3018:1: ( ( ( rule__Composition__Group_4__0 )? ) )
            // InternalSMallUML.g:3019:1: ( ( rule__Composition__Group_4__0 )? )
            {
            // InternalSMallUML.g:3019:1: ( ( rule__Composition__Group_4__0 )? )
            // InternalSMallUML.g:3020:2: ( rule__Composition__Group_4__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_4()); 
            // InternalSMallUML.g:3021:2: ( rule__Composition__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSMallUML.g:3021:3: rule__Composition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4__Impl"


    // $ANTLR start "rule__Composition__Group__5"
    // InternalSMallUML.g:3029:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3033:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalSMallUML.g:3034:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Composition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__6();

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
    // $ANTLR end "rule__Composition__Group__5"


    // $ANTLR start "rule__Composition__Group__5__Impl"
    // InternalSMallUML.g:3041:1: rule__Composition__Group__5__Impl : ( ( rule__Composition__Group_5__0 )? ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3045:1: ( ( ( rule__Composition__Group_5__0 )? ) )
            // InternalSMallUML.g:3046:1: ( ( rule__Composition__Group_5__0 )? )
            {
            // InternalSMallUML.g:3046:1: ( ( rule__Composition__Group_5__0 )? )
            // InternalSMallUML.g:3047:2: ( rule__Composition__Group_5__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_5()); 
            // InternalSMallUML.g:3048:2: ( rule__Composition__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSMallUML.g:3048:3: rule__Composition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5__Impl"


    // $ANTLR start "rule__Composition__Group__6"
    // InternalSMallUML.g:3056:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3060:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalSMallUML.g:3061:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Composition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__7();

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
    // $ANTLR end "rule__Composition__Group__6"


    // $ANTLR start "rule__Composition__Group__6__Impl"
    // InternalSMallUML.g:3068:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Group_6__0 )? ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3072:1: ( ( ( rule__Composition__Group_6__0 )? ) )
            // InternalSMallUML.g:3073:1: ( ( rule__Composition__Group_6__0 )? )
            {
            // InternalSMallUML.g:3073:1: ( ( rule__Composition__Group_6__0 )? )
            // InternalSMallUML.g:3074:2: ( rule__Composition__Group_6__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_6()); 
            // InternalSMallUML.g:3075:2: ( rule__Composition__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSMallUML.g:3075:3: rule__Composition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6__Impl"


    // $ANTLR start "rule__Composition__Group__7"
    // InternalSMallUML.g:3083:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3087:1: ( rule__Composition__Group__7__Impl )
            // InternalSMallUML.g:3088:2: rule__Composition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__7__Impl();

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
    // $ANTLR end "rule__Composition__Group__7"


    // $ANTLR start "rule__Composition__Group__7__Impl"
    // InternalSMallUML.g:3094:1: rule__Composition__Group__7__Impl : ( '}' ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3098:1: ( ( '}' ) )
            // InternalSMallUML.g:3099:1: ( '}' )
            {
            // InternalSMallUML.g:3099:1: ( '}' )
            // InternalSMallUML.g:3100:2: '}'
            {
             before(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7__Impl"


    // $ANTLR start "rule__Composition__Group_4__0"
    // InternalSMallUML.g:3110:1: rule__Composition__Group_4__0 : rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1 ;
    public final void rule__Composition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3114:1: ( rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1 )
            // InternalSMallUML.g:3115:2: rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__Composition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_4__1();

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
    // $ANTLR end "rule__Composition__Group_4__0"


    // $ANTLR start "rule__Composition__Group_4__0__Impl"
    // InternalSMallUML.g:3122:1: rule__Composition__Group_4__0__Impl : ( 'upperBound' ) ;
    public final void rule__Composition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3126:1: ( ( 'upperBound' ) )
            // InternalSMallUML.g:3127:1: ( 'upperBound' )
            {
            // InternalSMallUML.g:3127:1: ( 'upperBound' )
            // InternalSMallUML.g:3128:2: 'upperBound'
            {
             before(grammarAccess.getCompositionAccess().getUpperBoundKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getUpperBoundKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__0__Impl"


    // $ANTLR start "rule__Composition__Group_4__1"
    // InternalSMallUML.g:3137:1: rule__Composition__Group_4__1 : rule__Composition__Group_4__1__Impl ;
    public final void rule__Composition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3141:1: ( rule__Composition__Group_4__1__Impl )
            // InternalSMallUML.g:3142:2: rule__Composition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_4__1__Impl();

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
    // $ANTLR end "rule__Composition__Group_4__1"


    // $ANTLR start "rule__Composition__Group_4__1__Impl"
    // InternalSMallUML.g:3148:1: rule__Composition__Group_4__1__Impl : ( ( rule__Composition__UpperBoundAssignment_4_1 ) ) ;
    public final void rule__Composition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3152:1: ( ( ( rule__Composition__UpperBoundAssignment_4_1 ) ) )
            // InternalSMallUML.g:3153:1: ( ( rule__Composition__UpperBoundAssignment_4_1 ) )
            {
            // InternalSMallUML.g:3153:1: ( ( rule__Composition__UpperBoundAssignment_4_1 ) )
            // InternalSMallUML.g:3154:2: ( rule__Composition__UpperBoundAssignment_4_1 )
            {
             before(grammarAccess.getCompositionAccess().getUpperBoundAssignment_4_1()); 
            // InternalSMallUML.g:3155:2: ( rule__Composition__UpperBoundAssignment_4_1 )
            // InternalSMallUML.g:3155:3: rule__Composition__UpperBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__UpperBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getUpperBoundAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__1__Impl"


    // $ANTLR start "rule__Composition__Group_5__0"
    // InternalSMallUML.g:3164:1: rule__Composition__Group_5__0 : rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1 ;
    public final void rule__Composition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3168:1: ( rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1 )
            // InternalSMallUML.g:3169:2: rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__Composition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_5__1();

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
    // $ANTLR end "rule__Composition__Group_5__0"


    // $ANTLR start "rule__Composition__Group_5__0__Impl"
    // InternalSMallUML.g:3176:1: rule__Composition__Group_5__0__Impl : ( 'lowerBound' ) ;
    public final void rule__Composition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3180:1: ( ( 'lowerBound' ) )
            // InternalSMallUML.g:3181:1: ( 'lowerBound' )
            {
            // InternalSMallUML.g:3181:1: ( 'lowerBound' )
            // InternalSMallUML.g:3182:2: 'lowerBound'
            {
             before(grammarAccess.getCompositionAccess().getLowerBoundKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLowerBoundKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__0__Impl"


    // $ANTLR start "rule__Composition__Group_5__1"
    // InternalSMallUML.g:3191:1: rule__Composition__Group_5__1 : rule__Composition__Group_5__1__Impl ;
    public final void rule__Composition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3195:1: ( rule__Composition__Group_5__1__Impl )
            // InternalSMallUML.g:3196:2: rule__Composition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_5__1__Impl();

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
    // $ANTLR end "rule__Composition__Group_5__1"


    // $ANTLR start "rule__Composition__Group_5__1__Impl"
    // InternalSMallUML.g:3202:1: rule__Composition__Group_5__1__Impl : ( ( rule__Composition__LowerBoundAssignment_5_1 ) ) ;
    public final void rule__Composition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3206:1: ( ( ( rule__Composition__LowerBoundAssignment_5_1 ) ) )
            // InternalSMallUML.g:3207:1: ( ( rule__Composition__LowerBoundAssignment_5_1 ) )
            {
            // InternalSMallUML.g:3207:1: ( ( rule__Composition__LowerBoundAssignment_5_1 ) )
            // InternalSMallUML.g:3208:2: ( rule__Composition__LowerBoundAssignment_5_1 )
            {
             before(grammarAccess.getCompositionAccess().getLowerBoundAssignment_5_1()); 
            // InternalSMallUML.g:3209:2: ( rule__Composition__LowerBoundAssignment_5_1 )
            // InternalSMallUML.g:3209:3: rule__Composition__LowerBoundAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__LowerBoundAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getLowerBoundAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__1__Impl"


    // $ANTLR start "rule__Composition__Group_6__0"
    // InternalSMallUML.g:3218:1: rule__Composition__Group_6__0 : rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1 ;
    public final void rule__Composition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3222:1: ( rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1 )
            // InternalSMallUML.g:3223:2: rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__Composition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__1();

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
    // $ANTLR end "rule__Composition__Group_6__0"


    // $ANTLR start "rule__Composition__Group_6__0__Impl"
    // InternalSMallUML.g:3230:1: rule__Composition__Group_6__0__Impl : ( 'role' ) ;
    public final void rule__Composition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3234:1: ( ( 'role' ) )
            // InternalSMallUML.g:3235:1: ( 'role' )
            {
            // InternalSMallUML.g:3235:1: ( 'role' )
            // InternalSMallUML.g:3236:2: 'role'
            {
             before(grammarAccess.getCompositionAccess().getRoleKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRoleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__0__Impl"


    // $ANTLR start "rule__Composition__Group_6__1"
    // InternalSMallUML.g:3245:1: rule__Composition__Group_6__1 : rule__Composition__Group_6__1__Impl rule__Composition__Group_6__2 ;
    public final void rule__Composition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3249:1: ( rule__Composition__Group_6__1__Impl rule__Composition__Group_6__2 )
            // InternalSMallUML.g:3250:2: rule__Composition__Group_6__1__Impl rule__Composition__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__2();

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
    // $ANTLR end "rule__Composition__Group_6__1"


    // $ANTLR start "rule__Composition__Group_6__1__Impl"
    // InternalSMallUML.g:3257:1: rule__Composition__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Composition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3261:1: ( ( '(' ) )
            // InternalSMallUML.g:3262:1: ( '(' )
            {
            // InternalSMallUML.g:3262:1: ( '(' )
            // InternalSMallUML.g:3263:2: '('
            {
             before(grammarAccess.getCompositionAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__1__Impl"


    // $ANTLR start "rule__Composition__Group_6__2"
    // InternalSMallUML.g:3272:1: rule__Composition__Group_6__2 : rule__Composition__Group_6__2__Impl rule__Composition__Group_6__3 ;
    public final void rule__Composition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3276:1: ( rule__Composition__Group_6__2__Impl rule__Composition__Group_6__3 )
            // InternalSMallUML.g:3277:2: rule__Composition__Group_6__2__Impl rule__Composition__Group_6__3
            {
            pushFollow(FOLLOW_29);
            rule__Composition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__3();

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
    // $ANTLR end "rule__Composition__Group_6__2"


    // $ANTLR start "rule__Composition__Group_6__2__Impl"
    // InternalSMallUML.g:3284:1: rule__Composition__Group_6__2__Impl : ( ( rule__Composition__RoleAssignment_6_2 ) ) ;
    public final void rule__Composition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3288:1: ( ( ( rule__Composition__RoleAssignment_6_2 ) ) )
            // InternalSMallUML.g:3289:1: ( ( rule__Composition__RoleAssignment_6_2 ) )
            {
            // InternalSMallUML.g:3289:1: ( ( rule__Composition__RoleAssignment_6_2 ) )
            // InternalSMallUML.g:3290:2: ( rule__Composition__RoleAssignment_6_2 )
            {
             before(grammarAccess.getCompositionAccess().getRoleAssignment_6_2()); 
            // InternalSMallUML.g:3291:2: ( rule__Composition__RoleAssignment_6_2 )
            // InternalSMallUML.g:3291:3: rule__Composition__RoleAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Composition__RoleAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getRoleAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__2__Impl"


    // $ANTLR start "rule__Composition__Group_6__3"
    // InternalSMallUML.g:3299:1: rule__Composition__Group_6__3 : rule__Composition__Group_6__3__Impl rule__Composition__Group_6__4 ;
    public final void rule__Composition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3303:1: ( rule__Composition__Group_6__3__Impl rule__Composition__Group_6__4 )
            // InternalSMallUML.g:3304:2: rule__Composition__Group_6__3__Impl rule__Composition__Group_6__4
            {
            pushFollow(FOLLOW_29);
            rule__Composition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__4();

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
    // $ANTLR end "rule__Composition__Group_6__3"


    // $ANTLR start "rule__Composition__Group_6__3__Impl"
    // InternalSMallUML.g:3311:1: rule__Composition__Group_6__3__Impl : ( ( rule__Composition__Group_6_3__0 )* ) ;
    public final void rule__Composition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3315:1: ( ( ( rule__Composition__Group_6_3__0 )* ) )
            // InternalSMallUML.g:3316:1: ( ( rule__Composition__Group_6_3__0 )* )
            {
            // InternalSMallUML.g:3316:1: ( ( rule__Composition__Group_6_3__0 )* )
            // InternalSMallUML.g:3317:2: ( rule__Composition__Group_6_3__0 )*
            {
             before(grammarAccess.getCompositionAccess().getGroup_6_3()); 
            // InternalSMallUML.g:3318:2: ( rule__Composition__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSMallUML.g:3318:3: rule__Composition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Composition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCompositionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__3__Impl"


    // $ANTLR start "rule__Composition__Group_6__4"
    // InternalSMallUML.g:3326:1: rule__Composition__Group_6__4 : rule__Composition__Group_6__4__Impl ;
    public final void rule__Composition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3330:1: ( rule__Composition__Group_6__4__Impl )
            // InternalSMallUML.g:3331:2: rule__Composition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__4__Impl();

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
    // $ANTLR end "rule__Composition__Group_6__4"


    // $ANTLR start "rule__Composition__Group_6__4__Impl"
    // InternalSMallUML.g:3337:1: rule__Composition__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Composition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3341:1: ( ( ')' ) )
            // InternalSMallUML.g:3342:1: ( ')' )
            {
            // InternalSMallUML.g:3342:1: ( ')' )
            // InternalSMallUML.g:3343:2: ')'
            {
             before(grammarAccess.getCompositionAccess().getRightParenthesisKeyword_6_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__4__Impl"


    // $ANTLR start "rule__Composition__Group_6_3__0"
    // InternalSMallUML.g:3353:1: rule__Composition__Group_6_3__0 : rule__Composition__Group_6_3__0__Impl rule__Composition__Group_6_3__1 ;
    public final void rule__Composition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3357:1: ( rule__Composition__Group_6_3__0__Impl rule__Composition__Group_6_3__1 )
            // InternalSMallUML.g:3358:2: rule__Composition__Group_6_3__0__Impl rule__Composition__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6_3__1();

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
    // $ANTLR end "rule__Composition__Group_6_3__0"


    // $ANTLR start "rule__Composition__Group_6_3__0__Impl"
    // InternalSMallUML.g:3365:1: rule__Composition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Composition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3369:1: ( ( ',' ) )
            // InternalSMallUML.g:3370:1: ( ',' )
            {
            // InternalSMallUML.g:3370:1: ( ',' )
            // InternalSMallUML.g:3371:2: ','
            {
             before(grammarAccess.getCompositionAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6_3__0__Impl"


    // $ANTLR start "rule__Composition__Group_6_3__1"
    // InternalSMallUML.g:3380:1: rule__Composition__Group_6_3__1 : rule__Composition__Group_6_3__1__Impl ;
    public final void rule__Composition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3384:1: ( rule__Composition__Group_6_3__1__Impl )
            // InternalSMallUML.g:3385:2: rule__Composition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Composition__Group_6_3__1"


    // $ANTLR start "rule__Composition__Group_6_3__1__Impl"
    // InternalSMallUML.g:3391:1: rule__Composition__Group_6_3__1__Impl : ( ( rule__Composition__RoleAssignment_6_3_1 ) ) ;
    public final void rule__Composition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3395:1: ( ( ( rule__Composition__RoleAssignment_6_3_1 ) ) )
            // InternalSMallUML.g:3396:1: ( ( rule__Composition__RoleAssignment_6_3_1 ) )
            {
            // InternalSMallUML.g:3396:1: ( ( rule__Composition__RoleAssignment_6_3_1 ) )
            // InternalSMallUML.g:3397:2: ( rule__Composition__RoleAssignment_6_3_1 )
            {
             before(grammarAccess.getCompositionAccess().getRoleAssignment_6_3_1()); 
            // InternalSMallUML.g:3398:2: ( rule__Composition__RoleAssignment_6_3_1 )
            // InternalSMallUML.g:3398:3: rule__Composition__RoleAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__RoleAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getRoleAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6_3__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalSMallUML.g:3407:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3411:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalSMallUML.g:3412:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalSMallUML.g:3419:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3423:1: ( ( () ) )
            // InternalSMallUML.g:3424:1: ( () )
            {
            // InternalSMallUML.g:3424:1: ( () )
            // InternalSMallUML.g:3425:2: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // InternalSMallUML.g:3426:2: ()
            // InternalSMallUML.g:3426:3: 
            {
            }

             after(grammarAccess.getReferenceAccess().getReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalSMallUML.g:3434:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3438:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalSMallUML.g:3439:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalSMallUML.g:3446:1: rule__Reference__Group__1__Impl : ( 'Reference' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3450:1: ( ( 'Reference' ) )
            // InternalSMallUML.g:3451:1: ( 'Reference' )
            {
            // InternalSMallUML.g:3451:1: ( 'Reference' )
            // InternalSMallUML.g:3452:2: 'Reference'
            {
             before(grammarAccess.getReferenceAccess().getReferenceKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getReferenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalSMallUML.g:3461:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3465:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalSMallUML.g:3466:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalSMallUML.g:3473:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3477:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // InternalSMallUML.g:3478:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // InternalSMallUML.g:3478:1: ( ( rule__Reference__NameAssignment_2 ) )
            // InternalSMallUML.g:3479:2: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // InternalSMallUML.g:3480:2: ( rule__Reference__NameAssignment_2 )
            // InternalSMallUML.g:3480:3: rule__Reference__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalSMallUML.g:3488:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3492:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalSMallUML.g:3493:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalSMallUML.g:3500:1: rule__Reference__Group__3__Impl : ( '{' ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3504:1: ( ( '{' ) )
            // InternalSMallUML.g:3505:1: ( '{' )
            {
            // InternalSMallUML.g:3505:1: ( '{' )
            // InternalSMallUML.g:3506:2: '{'
            {
             before(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalSMallUML.g:3515:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3519:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalSMallUML.g:3520:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalSMallUML.g:3527:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3531:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // InternalSMallUML.g:3532:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // InternalSMallUML.g:3532:1: ( ( rule__Reference__Group_4__0 )? )
            // InternalSMallUML.g:3533:2: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // InternalSMallUML.g:3534:2: ( rule__Reference__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSMallUML.g:3534:3: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // InternalSMallUML.g:3542:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3546:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalSMallUML.g:3547:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__6();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalSMallUML.g:3554:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3558:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalSMallUML.g:3559:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalSMallUML.g:3559:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalSMallUML.g:3560:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalSMallUML.g:3561:2: ( rule__Reference__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSMallUML.g:3561:3: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__6"
    // InternalSMallUML.g:3569:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl rule__Reference__Group__7 ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3573:1: ( rule__Reference__Group__6__Impl rule__Reference__Group__7 )
            // InternalSMallUML.g:3574:2: rule__Reference__Group__6__Impl rule__Reference__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__7();

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
    // $ANTLR end "rule__Reference__Group__6"


    // $ANTLR start "rule__Reference__Group__6__Impl"
    // InternalSMallUML.g:3581:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3585:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalSMallUML.g:3586:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalSMallUML.g:3586:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalSMallUML.g:3587:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalSMallUML.g:3588:2: ( rule__Reference__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSMallUML.g:3588:3: rule__Reference__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__6__Impl"


    // $ANTLR start "rule__Reference__Group__7"
    // InternalSMallUML.g:3596:1: rule__Reference__Group__7 : rule__Reference__Group__7__Impl ;
    public final void rule__Reference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3600:1: ( rule__Reference__Group__7__Impl )
            // InternalSMallUML.g:3601:2: rule__Reference__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__7__Impl();

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
    // $ANTLR end "rule__Reference__Group__7"


    // $ANTLR start "rule__Reference__Group__7__Impl"
    // InternalSMallUML.g:3607:1: rule__Reference__Group__7__Impl : ( '}' ) ;
    public final void rule__Reference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3611:1: ( ( '}' ) )
            // InternalSMallUML.g:3612:1: ( '}' )
            {
            // InternalSMallUML.g:3612:1: ( '}' )
            // InternalSMallUML.g:3613:2: '}'
            {
             before(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__7__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // InternalSMallUML.g:3623:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3627:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // InternalSMallUML.g:3628:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1();

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
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // InternalSMallUML.g:3635:1: rule__Reference__Group_4__0__Impl : ( 'upperBound' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3639:1: ( ( 'upperBound' ) )
            // InternalSMallUML.g:3640:1: ( 'upperBound' )
            {
            // InternalSMallUML.g:3640:1: ( 'upperBound' )
            // InternalSMallUML.g:3641:2: 'upperBound'
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getUpperBoundKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // InternalSMallUML.g:3650:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3654:1: ( rule__Reference__Group_4__1__Impl )
            // InternalSMallUML.g:3655:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // InternalSMallUML.g:3661:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__UpperBoundAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3665:1: ( ( ( rule__Reference__UpperBoundAssignment_4_1 ) ) )
            // InternalSMallUML.g:3666:1: ( ( rule__Reference__UpperBoundAssignment_4_1 ) )
            {
            // InternalSMallUML.g:3666:1: ( ( rule__Reference__UpperBoundAssignment_4_1 ) )
            // InternalSMallUML.g:3667:2: ( rule__Reference__UpperBoundAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4_1()); 
            // InternalSMallUML.g:3668:2: ( rule__Reference__UpperBoundAssignment_4_1 )
            // InternalSMallUML.g:3668:3: rule__Reference__UpperBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__UpperBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Reference__Group_5__0"
    // InternalSMallUML.g:3677:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3681:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalSMallUML.g:3682:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__1();

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
    // $ANTLR end "rule__Reference__Group_5__0"


    // $ANTLR start "rule__Reference__Group_5__0__Impl"
    // InternalSMallUML.g:3689:1: rule__Reference__Group_5__0__Impl : ( 'lowerBound' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3693:1: ( ( 'lowerBound' ) )
            // InternalSMallUML.g:3694:1: ( 'lowerBound' )
            {
            // InternalSMallUML.g:3694:1: ( 'lowerBound' )
            // InternalSMallUML.g:3695:2: 'lowerBound'
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLowerBoundKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__0__Impl"


    // $ANTLR start "rule__Reference__Group_5__1"
    // InternalSMallUML.g:3704:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3708:1: ( rule__Reference__Group_5__1__Impl )
            // InternalSMallUML.g:3709:2: rule__Reference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_5__1"


    // $ANTLR start "rule__Reference__Group_5__1__Impl"
    // InternalSMallUML.g:3715:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__LowerBoundAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3719:1: ( ( ( rule__Reference__LowerBoundAssignment_5_1 ) ) )
            // InternalSMallUML.g:3720:1: ( ( rule__Reference__LowerBoundAssignment_5_1 ) )
            {
            // InternalSMallUML.g:3720:1: ( ( rule__Reference__LowerBoundAssignment_5_1 ) )
            // InternalSMallUML.g:3721:2: ( rule__Reference__LowerBoundAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_5_1()); 
            // InternalSMallUML.g:3722:2: ( rule__Reference__LowerBoundAssignment_5_1 )
            // InternalSMallUML.g:3722:3: rule__Reference__LowerBoundAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__LowerBoundAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getLowerBoundAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__1__Impl"


    // $ANTLR start "rule__Reference__Group_6__0"
    // InternalSMallUML.g:3731:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3735:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalSMallUML.g:3736:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__Reference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__1();

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
    // $ANTLR end "rule__Reference__Group_6__0"


    // $ANTLR start "rule__Reference__Group_6__0__Impl"
    // InternalSMallUML.g:3743:1: rule__Reference__Group_6__0__Impl : ( 'role' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3747:1: ( ( 'role' ) )
            // InternalSMallUML.g:3748:1: ( 'role' )
            {
            // InternalSMallUML.g:3748:1: ( 'role' )
            // InternalSMallUML.g:3749:2: 'role'
            {
             before(grammarAccess.getReferenceAccess().getRoleKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRoleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__0__Impl"


    // $ANTLR start "rule__Reference__Group_6__1"
    // InternalSMallUML.g:3758:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl rule__Reference__Group_6__2 ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3762:1: ( rule__Reference__Group_6__1__Impl rule__Reference__Group_6__2 )
            // InternalSMallUML.g:3763:2: rule__Reference__Group_6__1__Impl rule__Reference__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__2();

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
    // $ANTLR end "rule__Reference__Group_6__1"


    // $ANTLR start "rule__Reference__Group_6__1__Impl"
    // InternalSMallUML.g:3770:1: rule__Reference__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3774:1: ( ( '(' ) )
            // InternalSMallUML.g:3775:1: ( '(' )
            {
            // InternalSMallUML.g:3775:1: ( '(' )
            // InternalSMallUML.g:3776:2: '('
            {
             before(grammarAccess.getReferenceAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__1__Impl"


    // $ANTLR start "rule__Reference__Group_6__2"
    // InternalSMallUML.g:3785:1: rule__Reference__Group_6__2 : rule__Reference__Group_6__2__Impl rule__Reference__Group_6__3 ;
    public final void rule__Reference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3789:1: ( rule__Reference__Group_6__2__Impl rule__Reference__Group_6__3 )
            // InternalSMallUML.g:3790:2: rule__Reference__Group_6__2__Impl rule__Reference__Group_6__3
            {
            pushFollow(FOLLOW_29);
            rule__Reference__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__3();

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
    // $ANTLR end "rule__Reference__Group_6__2"


    // $ANTLR start "rule__Reference__Group_6__2__Impl"
    // InternalSMallUML.g:3797:1: rule__Reference__Group_6__2__Impl : ( ( rule__Reference__RoleAssignment_6_2 ) ) ;
    public final void rule__Reference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3801:1: ( ( ( rule__Reference__RoleAssignment_6_2 ) ) )
            // InternalSMallUML.g:3802:1: ( ( rule__Reference__RoleAssignment_6_2 ) )
            {
            // InternalSMallUML.g:3802:1: ( ( rule__Reference__RoleAssignment_6_2 ) )
            // InternalSMallUML.g:3803:2: ( rule__Reference__RoleAssignment_6_2 )
            {
             before(grammarAccess.getReferenceAccess().getRoleAssignment_6_2()); 
            // InternalSMallUML.g:3804:2: ( rule__Reference__RoleAssignment_6_2 )
            // InternalSMallUML.g:3804:3: rule__Reference__RoleAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Reference__RoleAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRoleAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__2__Impl"


    // $ANTLR start "rule__Reference__Group_6__3"
    // InternalSMallUML.g:3812:1: rule__Reference__Group_6__3 : rule__Reference__Group_6__3__Impl rule__Reference__Group_6__4 ;
    public final void rule__Reference__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3816:1: ( rule__Reference__Group_6__3__Impl rule__Reference__Group_6__4 )
            // InternalSMallUML.g:3817:2: rule__Reference__Group_6__3__Impl rule__Reference__Group_6__4
            {
            pushFollow(FOLLOW_29);
            rule__Reference__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__4();

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
    // $ANTLR end "rule__Reference__Group_6__3"


    // $ANTLR start "rule__Reference__Group_6__3__Impl"
    // InternalSMallUML.g:3824:1: rule__Reference__Group_6__3__Impl : ( ( rule__Reference__Group_6_3__0 )* ) ;
    public final void rule__Reference__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3828:1: ( ( ( rule__Reference__Group_6_3__0 )* ) )
            // InternalSMallUML.g:3829:1: ( ( rule__Reference__Group_6_3__0 )* )
            {
            // InternalSMallUML.g:3829:1: ( ( rule__Reference__Group_6_3__0 )* )
            // InternalSMallUML.g:3830:2: ( rule__Reference__Group_6_3__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_6_3()); 
            // InternalSMallUML.g:3831:2: ( rule__Reference__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSMallUML.g:3831:3: rule__Reference__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Reference__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__3__Impl"


    // $ANTLR start "rule__Reference__Group_6__4"
    // InternalSMallUML.g:3839:1: rule__Reference__Group_6__4 : rule__Reference__Group_6__4__Impl ;
    public final void rule__Reference__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3843:1: ( rule__Reference__Group_6__4__Impl )
            // InternalSMallUML.g:3844:2: rule__Reference__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__4__Impl();

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
    // $ANTLR end "rule__Reference__Group_6__4"


    // $ANTLR start "rule__Reference__Group_6__4__Impl"
    // InternalSMallUML.g:3850:1: rule__Reference__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Reference__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3854:1: ( ( ')' ) )
            // InternalSMallUML.g:3855:1: ( ')' )
            {
            // InternalSMallUML.g:3855:1: ( ')' )
            // InternalSMallUML.g:3856:2: ')'
            {
             before(grammarAccess.getReferenceAccess().getRightParenthesisKeyword_6_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__4__Impl"


    // $ANTLR start "rule__Reference__Group_6_3__0"
    // InternalSMallUML.g:3866:1: rule__Reference__Group_6_3__0 : rule__Reference__Group_6_3__0__Impl rule__Reference__Group_6_3__1 ;
    public final void rule__Reference__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3870:1: ( rule__Reference__Group_6_3__0__Impl rule__Reference__Group_6_3__1 )
            // InternalSMallUML.g:3871:2: rule__Reference__Group_6_3__0__Impl rule__Reference__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6_3__1();

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
    // $ANTLR end "rule__Reference__Group_6_3__0"


    // $ANTLR start "rule__Reference__Group_6_3__0__Impl"
    // InternalSMallUML.g:3878:1: rule__Reference__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3882:1: ( ( ',' ) )
            // InternalSMallUML.g:3883:1: ( ',' )
            {
            // InternalSMallUML.g:3883:1: ( ',' )
            // InternalSMallUML.g:3884:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6_3__0__Impl"


    // $ANTLR start "rule__Reference__Group_6_3__1"
    // InternalSMallUML.g:3893:1: rule__Reference__Group_6_3__1 : rule__Reference__Group_6_3__1__Impl ;
    public final void rule__Reference__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3897:1: ( rule__Reference__Group_6_3__1__Impl )
            // InternalSMallUML.g:3898:2: rule__Reference__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_6_3__1"


    // $ANTLR start "rule__Reference__Group_6_3__1__Impl"
    // InternalSMallUML.g:3904:1: rule__Reference__Group_6_3__1__Impl : ( ( rule__Reference__RoleAssignment_6_3_1 ) ) ;
    public final void rule__Reference__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3908:1: ( ( ( rule__Reference__RoleAssignment_6_3_1 ) ) )
            // InternalSMallUML.g:3909:1: ( ( rule__Reference__RoleAssignment_6_3_1 ) )
            {
            // InternalSMallUML.g:3909:1: ( ( rule__Reference__RoleAssignment_6_3_1 ) )
            // InternalSMallUML.g:3910:2: ( rule__Reference__RoleAssignment_6_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getRoleAssignment_6_3_1()); 
            // InternalSMallUML.g:3911:2: ( rule__Reference__RoleAssignment_6_3_1 )
            // InternalSMallUML.g:3911:3: rule__Reference__RoleAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__RoleAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRoleAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6_3__1__Impl"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalSMallUML.g:3920:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3924:1: ( ( ruleEString ) )
            // InternalSMallUML.g:3925:2: ( ruleEString )
            {
            // InternalSMallUML.g:3925:2: ( ruleEString )
            // InternalSMallUML.g:3926:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__SuperAssignment_4_1"
    // InternalSMallUML.g:3935:1: rule__Class__SuperAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__SuperAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3939:1: ( ( ( ruleEString ) ) )
            // InternalSMallUML.g:3940:2: ( ( ruleEString ) )
            {
            // InternalSMallUML.g:3940:2: ( ( ruleEString ) )
            // InternalSMallUML.g:3941:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getSuperClassCrossReference_4_1_0()); 
            // InternalSMallUML.g:3942:3: ( ruleEString )
            // InternalSMallUML.g:3943:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getSuperClassEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperClassEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperAssignment_4_1"


    // $ANTLR start "rule__Class__MethodAssignment_5_2"
    // InternalSMallUML.g:3954:1: rule__Class__MethodAssignment_5_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3958:1: ( ( ruleMethod ) )
            // InternalSMallUML.g:3959:2: ( ruleMethod )
            {
            // InternalSMallUML.g:3959:2: ( ruleMethod )
            // InternalSMallUML.g:3960:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodAssignment_5_2"


    // $ANTLR start "rule__Class__MethodAssignment_5_3_1"
    // InternalSMallUML.g:3969:1: rule__Class__MethodAssignment_5_3_1 : ( ruleMethod ) ;
    public final void rule__Class__MethodAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3973:1: ( ( ruleMethod ) )
            // InternalSMallUML.g:3974:2: ( ruleMethod )
            {
            // InternalSMallUML.g:3974:2: ( ruleMethod )
            // InternalSMallUML.g:3975:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodAssignment_5_3_1"


    // $ANTLR start "rule__Class__AttributeAssignment_6_2"
    // InternalSMallUML.g:3984:1: rule__Class__AttributeAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:3988:1: ( ( ruleAttribute ) )
            // InternalSMallUML.g:3989:2: ( ruleAttribute )
            {
            // InternalSMallUML.g:3989:2: ( ruleAttribute )
            // InternalSMallUML.g:3990:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributeAssignment_6_2"


    // $ANTLR start "rule__Class__AttributeAssignment_6_3_1"
    // InternalSMallUML.g:3999:1: rule__Class__AttributeAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4003:1: ( ( ruleAttribute ) )
            // InternalSMallUML.g:4004:2: ( ruleAttribute )
            {
            // InternalSMallUML.g:4004:2: ( ruleAttribute )
            // InternalSMallUML.g:4005:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributeAssignment_6_3_1"


    // $ANTLR start "rule__Class__RoleAssignment_7_2"
    // InternalSMallUML.g:4014:1: rule__Class__RoleAssignment_7_2 : ( ruleRole ) ;
    public final void rule__Class__RoleAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4018:1: ( ( ruleRole ) )
            // InternalSMallUML.g:4019:2: ( ruleRole )
            {
            // InternalSMallUML.g:4019:2: ( ruleRole )
            // InternalSMallUML.g:4020:3: ruleRole
            {
             before(grammarAccess.getClassAccess().getRoleRoleParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getClassAccess().getRoleRoleParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__RoleAssignment_7_2"


    // $ANTLR start "rule__Class__RoleAssignment_7_3_1"
    // InternalSMallUML.g:4029:1: rule__Class__RoleAssignment_7_3_1 : ( ruleRole ) ;
    public final void rule__Class__RoleAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4033:1: ( ( ruleRole ) )
            // InternalSMallUML.g:4034:2: ( ruleRole )
            {
            // InternalSMallUML.g:4034:2: ( ruleRole )
            // InternalSMallUML.g:4035:3: ruleRole
            {
             before(grammarAccess.getClassAccess().getRoleRoleParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getClassAccess().getRoleRoleParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__RoleAssignment_7_3_1"


    // $ANTLR start "rule__Method__NameAssignment_2"
    // InternalSMallUML.g:4044:1: rule__Method__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4048:1: ( ( ruleEString ) )
            // InternalSMallUML.g:4049:2: ( ruleEString )
            {
            // InternalSMallUML.g:4049:2: ( ruleEString )
            // InternalSMallUML.g:4050:3: ruleEString
            {
             before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_2"


    // $ANTLR start "rule__Method__ParameterAssignment_4_2"
    // InternalSMallUML.g:4059:1: rule__Method__ParameterAssignment_4_2 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4063:1: ( ( ruleParameter ) )
            // InternalSMallUML.g:4064:2: ( ruleParameter )
            {
            // InternalSMallUML.g:4064:2: ( ruleParameter )
            // InternalSMallUML.g:4065:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_4_2"


    // $ANTLR start "rule__Method__ParameterAssignment_4_3_1"
    // InternalSMallUML.g:4074:1: rule__Method__ParameterAssignment_4_3_1 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4078:1: ( ( ruleParameter ) )
            // InternalSMallUML.g:4079:2: ( ruleParameter )
            {
            // InternalSMallUML.g:4079:2: ( ruleParameter )
            // InternalSMallUML.g:4080:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_4_3_1"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_5_1"
    // InternalSMallUML.g:4089:1: rule__Method__ReturnTypeAssignment_5_1 : ( ruleType ) ;
    public final void rule__Method__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4093:1: ( ( ruleType ) )
            // InternalSMallUML.g:4094:2: ( ruleType )
            {
            // InternalSMallUML.g:4094:2: ( ruleType )
            // InternalSMallUML.g:4095:3: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_5_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSMallUML.g:4104:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4108:1: ( ( ruleEString ) )
            // InternalSMallUML.g:4109:2: ( ruleEString )
            {
            // InternalSMallUML.g:4109:2: ( ruleEString )
            // InternalSMallUML.g:4110:3: ruleEString
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


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalSMallUML.g:4119:1: rule__Attribute__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4123:1: ( ( ruleType ) )
            // InternalSMallUML.g:4124:2: ( ruleType )
            {
            // InternalSMallUML.g:4124:2: ( ruleType )
            // InternalSMallUML.g:4125:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalSMallUML.g:4134:1: rule__Role__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4138:1: ( ( ruleEString ) )
            // InternalSMallUML.g:4139:2: ( ruleEString )
            {
            // InternalSMallUML.g:4139:2: ( ruleEString )
            // InternalSMallUML.g:4140:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__RelationAssignment_4"
    // InternalSMallUML.g:4149:1: rule__Role__RelationAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Role__RelationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4153:1: ( ( ( ruleEString ) ) )
            // InternalSMallUML.g:4154:2: ( ( ruleEString ) )
            {
            // InternalSMallUML.g:4154:2: ( ( ruleEString ) )
            // InternalSMallUML.g:4155:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getRelationRelationCrossReference_4_0()); 
            // InternalSMallUML.g:4156:3: ( ruleEString )
            // InternalSMallUML.g:4157:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getRelationRelationEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getRelationRelationEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getRelationRelationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__RelationAssignment_4"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalSMallUML.g:4168:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4172:1: ( ( ruleEString ) )
            // InternalSMallUML.g:4173:2: ( ruleEString )
            {
            // InternalSMallUML.g:4173:2: ( ruleEString )
            // InternalSMallUML.g:4174:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalSMallUML.g:4183:1: rule__Parameter__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4187:1: ( ( ruleType ) )
            // InternalSMallUML.g:4188:2: ( ruleType )
            {
            // InternalSMallUML.g:4188:2: ( ruleType )
            // InternalSMallUML.g:4189:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__Enumeration__ValueAssignment_4"
    // InternalSMallUML.g:4198:1: rule__Enumeration__ValueAssignment_4 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4202:1: ( ( ruleString0 ) )
            // InternalSMallUML.g:4203:2: ( ruleString0 )
            {
            // InternalSMallUML.g:4203:2: ( ruleString0 )
            // InternalSMallUML.g:4204:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_4"


    // $ANTLR start "rule__Enumeration__ValueAssignment_5_1"
    // InternalSMallUML.g:4213:1: rule__Enumeration__ValueAssignment_5_1 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4217:1: ( ( ruleString0 ) )
            // InternalSMallUML.g:4218:2: ( ruleString0 )
            {
            // InternalSMallUML.g:4218:2: ( ruleString0 )
            // InternalSMallUML.g:4219:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_5_1"


    // $ANTLR start "rule__Composition__NameAssignment_2"
    // InternalSMallUML.g:4228:1: rule__Composition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Composition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4232:1: ( ( ruleEString ) )
            // InternalSMallUML.g:4233:2: ( ruleEString )
            {
            // InternalSMallUML.g:4233:2: ( ruleEString )
            // InternalSMallUML.g:4234:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAssignment_2"


    // $ANTLR start "rule__Composition__UpperBoundAssignment_4_1"
    // InternalSMallUML.g:4243:1: rule__Composition__UpperBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Composition__UpperBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4247:1: ( ( ruleEInt ) )
            // InternalSMallUML.g:4248:2: ( ruleEInt )
            {
            // InternalSMallUML.g:4248:2: ( ruleEInt )
            // InternalSMallUML.g:4249:3: ruleEInt
            {
             before(grammarAccess.getCompositionAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__UpperBoundAssignment_4_1"


    // $ANTLR start "rule__Composition__LowerBoundAssignment_5_1"
    // InternalSMallUML.g:4258:1: rule__Composition__LowerBoundAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Composition__LowerBoundAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4262:1: ( ( ruleEInt ) )
            // InternalSMallUML.g:4263:2: ( ruleEInt )
            {
            // InternalSMallUML.g:4263:2: ( ruleEInt )
            // InternalSMallUML.g:4264:3: ruleEInt
            {
             before(grammarAccess.getCompositionAccess().getLowerBoundEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getLowerBoundEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__LowerBoundAssignment_5_1"


    // $ANTLR start "rule__Composition__RoleAssignment_6_2"
    // InternalSMallUML.g:4273:1: rule__Composition__RoleAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Composition__RoleAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4277:1: ( ( ( ruleEString ) ) )
            // InternalSMallUML.g:4278:2: ( ( ruleEString ) )
            {
            // InternalSMallUML.g:4278:2: ( ( ruleEString ) )
            // InternalSMallUML.g:4279:3: ( ruleEString )
            {
             before(grammarAccess.getCompositionAccess().getRoleRoleCrossReference_6_2_0()); 
            // InternalSMallUML.g:4280:3: ( ruleEString )
            // InternalSMallUML.g:4281:4: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getRoleRoleEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getRoleRoleEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getCompositionAccess().getRoleRoleCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__RoleAssignment_6_2"


    // $ANTLR start "rule__Composition__RoleAssignment_6_3_1"
    // InternalSMallUML.g:4292:1: rule__Composition__RoleAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Composition__RoleAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4296:1: ( ( ( ruleEString ) ) )
            // InternalSMallUML.g:4297:2: ( ( ruleEString ) )
            {
            // InternalSMallUML.g:4297:2: ( ( ruleEString ) )
            // InternalSMallUML.g:4298:3: ( ruleEString )
            {
             before(grammarAccess.getCompositionAccess().getRoleRoleCrossReference_6_3_1_0()); 
            // InternalSMallUML.g:4299:3: ( ruleEString )
            // InternalSMallUML.g:4300:4: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getRoleRoleEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getRoleRoleEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getCompositionAccess().getRoleRoleCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__RoleAssignment_6_3_1"


    // $ANTLR start "rule__Reference__NameAssignment_2"
    // InternalSMallUML.g:4311:1: rule__Reference__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4315:1: ( ( ruleEString ) )
            // InternalSMallUML.g:4316:2: ( ruleEString )
            {
            // InternalSMallUML.g:4316:2: ( ruleEString )
            // InternalSMallUML.g:4317:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_2"


    // $ANTLR start "rule__Reference__UpperBoundAssignment_4_1"
    // InternalSMallUML.g:4326:1: rule__Reference__UpperBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Reference__UpperBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4330:1: ( ( ruleEInt ) )
            // InternalSMallUML.g:4331:2: ( ruleEInt )
            {
            // InternalSMallUML.g:4331:2: ( ruleEInt )
            // InternalSMallUML.g:4332:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UpperBoundAssignment_4_1"


    // $ANTLR start "rule__Reference__LowerBoundAssignment_5_1"
    // InternalSMallUML.g:4341:1: rule__Reference__LowerBoundAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Reference__LowerBoundAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4345:1: ( ( ruleEInt ) )
            // InternalSMallUML.g:4346:2: ( ruleEInt )
            {
            // InternalSMallUML.g:4346:2: ( ruleEInt )
            // InternalSMallUML.g:4347:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__LowerBoundAssignment_5_1"


    // $ANTLR start "rule__Reference__RoleAssignment_6_2"
    // InternalSMallUML.g:4356:1: rule__Reference__RoleAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Reference__RoleAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4360:1: ( ( ( ruleEString ) ) )
            // InternalSMallUML.g:4361:2: ( ( ruleEString ) )
            {
            // InternalSMallUML.g:4361:2: ( ( ruleEString ) )
            // InternalSMallUML.g:4362:3: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getRoleRoleCrossReference_6_2_0()); 
            // InternalSMallUML.g:4363:3: ( ruleEString )
            // InternalSMallUML.g:4364:4: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getRoleRoleEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getRoleRoleEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getRoleRoleCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__RoleAssignment_6_2"


    // $ANTLR start "rule__Reference__RoleAssignment_6_3_1"
    // InternalSMallUML.g:4375:1: rule__Reference__RoleAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Reference__RoleAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMallUML.g:4379:1: ( ( ( ruleEString ) ) )
            // InternalSMallUML.g:4380:2: ( ( ruleEString ) )
            {
            // InternalSMallUML.g:4380:2: ( ( ruleEString ) )
            // InternalSMallUML.g:4381:3: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getRoleRoleCrossReference_6_3_1_0()); 
            // InternalSMallUML.g:4382:3: ( ruleEString )
            // InternalSMallUML.g:4383:4: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getRoleRoleEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getRoleRoleEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getRoleRoleCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__RoleAssignment_6_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000006E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000042000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});

}
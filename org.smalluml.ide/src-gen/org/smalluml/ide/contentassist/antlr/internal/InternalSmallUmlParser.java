package org.smalluml.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.smalluml.services.SmallUmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "UnlimitedNatural", "Enumeration", "Integer", "Package", "Extends", "String", "Class", "Value", "HyphenMinusHyphenMinusHyphenMinusGreaterThanSign", "LessThanSignGreaterThanSignHyphenMinusHyphenMinus", "Bool", "Real", "LeftParenthesis", "RightParenthesis", "PlusSign", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=27;
    public static final int RULE_BEGIN=26;
    public static final int RULE_STRING=30;
    public static final int String=9;
    public static final int RULE_SL_COMMENT=32;
    public static final int UnlimitedNatural=4;
    public static final int Comma=19;
    public static final int HyphenMinus=20;
    public static final int LeftParenthesis=16;
    public static final int Bool=14;
    public static final int LessThanSignGreaterThanSignHyphenMinusHyphenMinus=13;
    public static final int Real=15;
    public static final int Colon=21;
    public static final int RightCurlyBracket=25;
    public static final int Extends=8;
    public static final int EOF=-1;
    public static final int RightSquareBracket=23;
    public static final int Enumeration=5;
    public static final int RULE_ID=28;
    public static final int RULE_WS=33;
    public static final int RightParenthesis=17;
    public static final int LeftCurlyBracket=24;
    public static final int RULE_ANY_OTHER=34;
    public static final int HyphenMinusHyphenMinusHyphenMinusGreaterThanSign=12;
    public static final int Integer=6;
    public static final int PlusSign=18;
    public static final int RULE_INT=29;
    public static final int Value=11;
    public static final int RULE_ML_COMMENT=31;
    public static final int Class=10;
    public static final int LeftSquareBracket=22;
    public static final int Package=7;

    // delegates
    // delegators


        public InternalSmallUmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUmlParser.g"; }


    	private SmallUmlGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("HyphenMinusHyphenMinusHyphenMinusGreaterThanSign", "'--->'");
    		tokenNameToValue.put("LessThanSignGreaterThanSignHyphenMinusHyphenMinus", "'<>--'");
    		tokenNameToValue.put("Bool", "'Bool'");
    		tokenNameToValue.put("Real", "'Real'");
    		tokenNameToValue.put("Class", "'Class'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("String", "'String'");
    		tokenNameToValue.put("Integer", "'Integer'");
    		tokenNameToValue.put("Package", "'Package'");
    		tokenNameToValue.put("Extends", "'extends'");
    		tokenNameToValue.put("Enumeration", "'Enumeration'");
    		tokenNameToValue.put("UnlimitedNatural", "'UnlimitedNatural'");
    	}

    	public void setGrammarAccess(SmallUmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRulePackage"
    // InternalSmallUmlParser.g:77:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:78:1: ( rulePackage EOF )
            // InternalSmallUmlParser.g:79:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUmlParser.g:86:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:90:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSmallUmlParser.g:91:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSmallUmlParser.g:91:2: ( ( rule__Package__Group__0 ) )
            // InternalSmallUmlParser.g:92:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSmallUmlParser.g:93:3: ( rule__Package__Group__0 )
            // InternalSmallUmlParser.g:93:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleNamedElement"
    // InternalSmallUmlParser.g:102:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:103:1: ( ruleNamedElement EOF )
            // InternalSmallUmlParser.g:104:1: ruleNamedElement EOF
            {
             before(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getNamedElementRule()); 
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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalSmallUmlParser.g:111:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:115:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // InternalSmallUmlParser.g:116:2: ( ( rule__NamedElement__Alternatives ) )
            {
            // InternalSmallUmlParser.g:116:2: ( ( rule__NamedElement__Alternatives ) )
            // InternalSmallUmlParser.g:117:3: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // InternalSmallUmlParser.g:118:3: ( rule__NamedElement__Alternatives )
            // InternalSmallUmlParser.g:118:4: rule__NamedElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamedElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleType"
    // InternalSmallUmlParser.g:127:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:128:1: ( ruleType EOF )
            // InternalSmallUmlParser.g:129:1: ruleType EOF
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
    // InternalSmallUmlParser.g:136:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:140:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmallUmlParser.g:141:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmallUmlParser.g:141:2: ( ( rule__Type__Alternatives ) )
            // InternalSmallUmlParser.g:142:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmallUmlParser.g:143:3: ( rule__Type__Alternatives )
            // InternalSmallUmlParser.g:143:4: rule__Type__Alternatives
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
    // InternalSmallUmlParser.g:152:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:153:1: ( ruleEString EOF )
            // InternalSmallUmlParser.g:154:1: ruleEString EOF
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
    // InternalSmallUmlParser.g:161:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:165:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUmlParser.g:166:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUmlParser.g:166:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUmlParser.g:167:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUmlParser.g:168:3: ( rule__EString__Alternatives )
            // InternalSmallUmlParser.g:168:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUmlParser.g:177:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:178:1: ( ruleClass EOF )
            // InternalSmallUmlParser.g:179:1: ruleClass EOF
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
    // InternalSmallUmlParser.g:186:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:190:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUmlParser.g:191:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUmlParser.g:191:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUmlParser.g:192:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUmlParser.g:193:3: ( rule__Class__Group__0 )
            // InternalSmallUmlParser.g:193:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUmlParser.g:202:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:203:1: ( ruleAttribute EOF )
            // InternalSmallUmlParser.g:204:1: ruleAttribute EOF
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
    // InternalSmallUmlParser.g:211:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:215:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUmlParser.g:216:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUmlParser.g:216:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUmlParser.g:217:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUmlParser.g:218:3: ( rule__Attribute__Group__0 )
            // InternalSmallUmlParser.g:218:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUmlParser.g:227:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:228:1: ( ruleMethod EOF )
            // InternalSmallUmlParser.g:229:1: ruleMethod EOF
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
    // InternalSmallUmlParser.g:236:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:240:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSmallUmlParser.g:241:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSmallUmlParser.g:241:2: ( ( rule__Method__Group__0 ) )
            // InternalSmallUmlParser.g:242:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSmallUmlParser.g:243:3: ( rule__Method__Group__0 )
            // InternalSmallUmlParser.g:243:4: rule__Method__Group__0
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


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUmlParser.g:252:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:253:1: ( ruleParameter EOF )
            // InternalSmallUmlParser.g:254:1: ruleParameter EOF
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
    // InternalSmallUmlParser.g:261:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:265:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSmallUmlParser.g:266:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSmallUmlParser.g:266:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSmallUmlParser.g:267:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSmallUmlParser.g:268:3: ( rule__Parameter__Group__0 )
            // InternalSmallUmlParser.g:268:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleComposition"
    // InternalSmallUmlParser.g:277:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:278:1: ( ruleComposition EOF )
            // InternalSmallUmlParser.g:279:1: ruleComposition EOF
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
    // InternalSmallUmlParser.g:286:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:290:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalSmallUmlParser.g:291:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalSmallUmlParser.g:291:2: ( ( rule__Composition__Group__0 ) )
            // InternalSmallUmlParser.g:292:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalSmallUmlParser.g:293:3: ( rule__Composition__Group__0 )
            // InternalSmallUmlParser.g:293:4: rule__Composition__Group__0
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
    // InternalSmallUmlParser.g:302:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:303:1: ( ruleReference EOF )
            // InternalSmallUmlParser.g:304:1: ruleReference EOF
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
    // InternalSmallUmlParser.g:311:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:315:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalSmallUmlParser.g:316:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalSmallUmlParser.g:316:2: ( ( rule__Reference__Group__0 ) )
            // InternalSmallUmlParser.g:317:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalSmallUmlParser.g:318:3: ( rule__Reference__Group__0 )
            // InternalSmallUmlParser.g:318:4: rule__Reference__Group__0
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


    // $ANTLR start "entryRuleRole"
    // InternalSmallUmlParser.g:327:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:328:1: ( ruleRole EOF )
            // InternalSmallUmlParser.g:329:1: ruleRole EOF
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
    // InternalSmallUmlParser.g:336:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:340:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSmallUmlParser.g:341:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSmallUmlParser.g:341:2: ( ( rule__Role__Group__0 ) )
            // InternalSmallUmlParser.g:342:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSmallUmlParser.g:343:3: ( rule__Role__Group__0 )
            // InternalSmallUmlParser.g:343:4: rule__Role__Group__0
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


    // $ANTLR start "entryRuleString0"
    // InternalSmallUmlParser.g:352:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:353:1: ( ruleString0 EOF )
            // InternalSmallUmlParser.g:354:1: ruleString0 EOF
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
    // InternalSmallUmlParser.g:361:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:365:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSmallUmlParser.g:366:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSmallUmlParser.g:366:2: ( ( rule__String0__Group__0 ) )
            // InternalSmallUmlParser.g:367:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSmallUmlParser.g:368:3: ( rule__String0__Group__0 )
            // InternalSmallUmlParser.g:368:4: rule__String0__Group__0
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
    // InternalSmallUmlParser.g:377:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:378:1: ( ruleInteger EOF )
            // InternalSmallUmlParser.g:379:1: ruleInteger EOF
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
    // InternalSmallUmlParser.g:386:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:390:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSmallUmlParser.g:391:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSmallUmlParser.g:391:2: ( ( rule__Integer__Group__0 ) )
            // InternalSmallUmlParser.g:392:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSmallUmlParser.g:393:3: ( rule__Integer__Group__0 )
            // InternalSmallUmlParser.g:393:4: rule__Integer__Group__0
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
    // InternalSmallUmlParser.g:402:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:403:1: ( ruleBool EOF )
            // InternalSmallUmlParser.g:404:1: ruleBool EOF
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
    // InternalSmallUmlParser.g:411:1: ruleBool : ( ( rule__Bool__Group__0 ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:415:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalSmallUmlParser.g:416:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalSmallUmlParser.g:416:2: ( ( rule__Bool__Group__0 ) )
            // InternalSmallUmlParser.g:417:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalSmallUmlParser.g:418:3: ( rule__Bool__Group__0 )
            // InternalSmallUmlParser.g:418:4: rule__Bool__Group__0
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
    // InternalSmallUmlParser.g:427:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:428:1: ( ruleReal EOF )
            // InternalSmallUmlParser.g:429:1: ruleReal EOF
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
    // InternalSmallUmlParser.g:436:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:440:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalSmallUmlParser.g:441:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalSmallUmlParser.g:441:2: ( ( rule__Real__Group__0 ) )
            // InternalSmallUmlParser.g:442:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalSmallUmlParser.g:443:3: ( rule__Real__Group__0 )
            // InternalSmallUmlParser.g:443:4: rule__Real__Group__0
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
    // InternalSmallUmlParser.g:452:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:453:1: ( ruleUnlimitedNatural EOF )
            // InternalSmallUmlParser.g:454:1: ruleUnlimitedNatural EOF
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
    // InternalSmallUmlParser.g:461:1: ruleUnlimitedNatural : ( ( rule__UnlimitedNatural__Group__0 ) ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:465:2: ( ( ( rule__UnlimitedNatural__Group__0 ) ) )
            // InternalSmallUmlParser.g:466:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            {
            // InternalSmallUmlParser.g:466:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            // InternalSmallUmlParser.g:467:3: ( rule__UnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getGroup()); 
            // InternalSmallUmlParser.g:468:3: ( rule__UnlimitedNatural__Group__0 )
            // InternalSmallUmlParser.g:468:4: rule__UnlimitedNatural__Group__0
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
    // InternalSmallUmlParser.g:477:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:478:1: ( ruleEnumeration EOF )
            // InternalSmallUmlParser.g:479:1: ruleEnumeration EOF
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
    // InternalSmallUmlParser.g:486:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:490:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUmlParser.g:491:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUmlParser.g:491:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUmlParser.g:492:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUmlParser.g:493:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUmlParser.g:493:4: rule__Enumeration__Group__0
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
    // InternalSmallUmlParser.g:502:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:503:1: ( ruleEInt EOF )
            // InternalSmallUmlParser.g:504:1: ruleEInt EOF
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
    // InternalSmallUmlParser.g:511:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:515:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUmlParser.g:516:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUmlParser.g:516:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUmlParser.g:517:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUmlParser.g:518:3: ( rule__EInt__Group__0 )
            // InternalSmallUmlParser.g:518:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__NamedElement__Alternatives"
    // InternalSmallUmlParser.g:526:1: rule__NamedElement__Alternatives : ( ( ruleClass ) | ( ruleAttribute ) | ( ruleMethod ) | ( ruleParameter ) | ( ruleRole ) | ( ruleComposition ) | ( ruleReference ) | ( rulePackage ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:530:1: ( ( ruleClass ) | ( ruleAttribute ) | ( ruleMethod ) | ( ruleParameter ) | ( ruleRole ) | ( ruleComposition ) | ( ruleReference ) | ( rulePackage ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSmallUmlParser.g:531:2: ( ruleClass )
                    {
                    // InternalSmallUmlParser.g:531:2: ( ruleClass )
                    // InternalSmallUmlParser.g:532:3: ruleClass
                    {
                     before(grammarAccess.getNamedElementAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:537:2: ( ruleAttribute )
                    {
                    // InternalSmallUmlParser.g:537:2: ( ruleAttribute )
                    // InternalSmallUmlParser.g:538:3: ruleAttribute
                    {
                     before(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUmlParser.g:543:2: ( ruleMethod )
                    {
                    // InternalSmallUmlParser.g:543:2: ( ruleMethod )
                    // InternalSmallUmlParser.g:544:3: ruleMethod
                    {
                     before(grammarAccess.getNamedElementAccess().getMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getMethodParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallUmlParser.g:549:2: ( ruleParameter )
                    {
                    // InternalSmallUmlParser.g:549:2: ( ruleParameter )
                    // InternalSmallUmlParser.g:550:3: ruleParameter
                    {
                     before(grammarAccess.getNamedElementAccess().getParameterParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getParameterParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallUmlParser.g:555:2: ( ruleRole )
                    {
                    // InternalSmallUmlParser.g:555:2: ( ruleRole )
                    // InternalSmallUmlParser.g:556:3: ruleRole
                    {
                     before(grammarAccess.getNamedElementAccess().getRoleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getRoleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmallUmlParser.g:561:2: ( ruleComposition )
                    {
                    // InternalSmallUmlParser.g:561:2: ( ruleComposition )
                    // InternalSmallUmlParser.g:562:3: ruleComposition
                    {
                     before(grammarAccess.getNamedElementAccess().getCompositionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleComposition();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getCompositionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSmallUmlParser.g:567:2: ( ruleReference )
                    {
                    // InternalSmallUmlParser.g:567:2: ( ruleReference )
                    // InternalSmallUmlParser.g:568:3: ruleReference
                    {
                     before(grammarAccess.getNamedElementAccess().getReferenceParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getReferenceParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSmallUmlParser.g:573:2: ( rulePackage )
                    {
                    // InternalSmallUmlParser.g:573:2: ( rulePackage )
                    // InternalSmallUmlParser.g:574:3: rulePackage
                    {
                     before(grammarAccess.getNamedElementAccess().getPackageParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getPackageParserRuleCall_7()); 

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
    // $ANTLR end "rule__NamedElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSmallUmlParser.g:583:1: rule__Type__Alternatives : ( ( ruleString0 ) | ( ruleInteger ) | ( ruleBool ) | ( ruleReal ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:587:1: ( ( ruleString0 ) | ( ruleInteger ) | ( ruleBool ) | ( ruleReal ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt2=1;
                }
                break;
            case Integer:
                {
                alt2=2;
                }
                break;
            case Bool:
                {
                alt2=3;
                }
                break;
            case Real:
                {
                alt2=4;
                }
                break;
            case UnlimitedNatural:
                {
                alt2=5;
                }
                break;
            case Enumeration:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSmallUmlParser.g:588:2: ( ruleString0 )
                    {
                    // InternalSmallUmlParser.g:588:2: ( ruleString0 )
                    // InternalSmallUmlParser.g:589:3: ruleString0
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
                    // InternalSmallUmlParser.g:594:2: ( ruleInteger )
                    {
                    // InternalSmallUmlParser.g:594:2: ( ruleInteger )
                    // InternalSmallUmlParser.g:595:3: ruleInteger
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
                    // InternalSmallUmlParser.g:600:2: ( ruleBool )
                    {
                    // InternalSmallUmlParser.g:600:2: ( ruleBool )
                    // InternalSmallUmlParser.g:601:3: ruleBool
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
                    // InternalSmallUmlParser.g:606:2: ( ruleReal )
                    {
                    // InternalSmallUmlParser.g:606:2: ( ruleReal )
                    // InternalSmallUmlParser.g:607:3: ruleReal
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
                    // InternalSmallUmlParser.g:612:2: ( ruleUnlimitedNatural )
                    {
                    // InternalSmallUmlParser.g:612:2: ( ruleUnlimitedNatural )
                    // InternalSmallUmlParser.g:613:3: ruleUnlimitedNatural
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
                    // InternalSmallUmlParser.g:618:2: ( ruleEnumeration )
                    {
                    // InternalSmallUmlParser.g:618:2: ( ruleEnumeration )
                    // InternalSmallUmlParser.g:619:3: ruleEnumeration
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
    // InternalSmallUmlParser.g:628:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:632:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUmlParser.g:633:2: ( RULE_STRING )
                    {
                    // InternalSmallUmlParser.g:633:2: ( RULE_STRING )
                    // InternalSmallUmlParser.g:634:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:639:2: ( RULE_ID )
                    {
                    // InternalSmallUmlParser.g:639:2: ( RULE_ID )
                    // InternalSmallUmlParser.g:640:3: RULE_ID
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


    // $ANTLR start "rule__Class__Alternatives_4_1"
    // InternalSmallUmlParser.g:649:1: rule__Class__Alternatives_4_1 : ( ( ( rule__Class__MethodAssignment_4_1_0 ) ) | ( ( rule__Class__AttributeAssignment_4_1_1 ) ) );
    public final void rule__Class__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:653:1: ( ( ( rule__Class__MethodAssignment_4_1_0 ) ) | ( ( rule__Class__AttributeAssignment_4_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PlusSign) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==LeftParenthesis) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==Colon) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==LeftParenthesis) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==Colon) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUmlParser.g:654:2: ( ( rule__Class__MethodAssignment_4_1_0 ) )
                    {
                    // InternalSmallUmlParser.g:654:2: ( ( rule__Class__MethodAssignment_4_1_0 ) )
                    // InternalSmallUmlParser.g:655:3: ( rule__Class__MethodAssignment_4_1_0 )
                    {
                     before(grammarAccess.getClassAccess().getMethodAssignment_4_1_0()); 
                    // InternalSmallUmlParser.g:656:3: ( rule__Class__MethodAssignment_4_1_0 )
                    // InternalSmallUmlParser.g:656:4: rule__Class__MethodAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__MethodAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getMethodAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:660:2: ( ( rule__Class__AttributeAssignment_4_1_1 ) )
                    {
                    // InternalSmallUmlParser.g:660:2: ( ( rule__Class__AttributeAssignment_4_1_1 ) )
                    // InternalSmallUmlParser.g:661:3: ( rule__Class__AttributeAssignment_4_1_1 )
                    {
                     before(grammarAccess.getClassAccess().getAttributeAssignment_4_1_1()); 
                    // InternalSmallUmlParser.g:662:3: ( rule__Class__AttributeAssignment_4_1_1 )
                    // InternalSmallUmlParser.g:662:4: rule__Class__AttributeAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AttributeAssignment_4_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getAttributeAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Class__Alternatives_4_1"


    // $ANTLR start "rule__Package__Group__0"
    // InternalSmallUmlParser.g:670:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:674:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUmlParser.g:675:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalSmallUmlParser.g:682:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:686:1: ( ( () ) )
            // InternalSmallUmlParser.g:687:1: ( () )
            {
            // InternalSmallUmlParser.g:687:1: ( () )
            // InternalSmallUmlParser.g:688:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalSmallUmlParser.g:689:2: ()
            // InternalSmallUmlParser.g:689:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSmallUmlParser.g:697:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:701:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSmallUmlParser.g:702:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalSmallUmlParser.g:709:1: rule__Package__Group__1__Impl : ( Package ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:713:1: ( ( Package ) )
            // InternalSmallUmlParser.g:714:1: ( Package )
            {
            // InternalSmallUmlParser.g:714:1: ( Package )
            // InternalSmallUmlParser.g:715:2: Package
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,Package,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalSmallUmlParser.g:724:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:728:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSmallUmlParser.g:729:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalSmallUmlParser.g:736:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:740:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:741:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:741:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:742:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:743:2: ( rule__Package__NameAssignment_2 )
            // InternalSmallUmlParser.g:743:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalSmallUmlParser.g:751:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:755:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSmallUmlParser.g:756:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalSmallUmlParser.g:763:1: rule__Package__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:767:1: ( ( RULE_BEGIN ) )
            // InternalSmallUmlParser.g:768:1: ( RULE_BEGIN )
            {
            // InternalSmallUmlParser.g:768:1: ( RULE_BEGIN )
            // InternalSmallUmlParser.g:769:2: RULE_BEGIN
            {
             before(grammarAccess.getPackageAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalSmallUmlParser.g:778:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:782:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalSmallUmlParser.g:783:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalSmallUmlParser.g:790:1: rule__Package__Group__4__Impl : ( ( rule__Package__MemberAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:794:1: ( ( ( rule__Package__MemberAssignment_4 )* ) )
            // InternalSmallUmlParser.g:795:1: ( ( rule__Package__MemberAssignment_4 )* )
            {
            // InternalSmallUmlParser.g:795:1: ( ( rule__Package__MemberAssignment_4 )* )
            // InternalSmallUmlParser.g:796:2: ( rule__Package__MemberAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getMemberAssignment_4()); 
            // InternalSmallUmlParser.g:797:2: ( rule__Package__MemberAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Package||LA5_0==Class||LA5_0==LeftParenthesis||LA5_0==PlusSign||LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUmlParser.g:797:3: rule__Package__MemberAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Package__MemberAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getMemberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalSmallUmlParser.g:805:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:809:1: ( rule__Package__Group__5__Impl )
            // InternalSmallUmlParser.g:810:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalSmallUmlParser.g:816:1: rule__Package__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:820:1: ( ( RULE_END ) )
            // InternalSmallUmlParser.g:821:1: ( RULE_END )
            {
            // InternalSmallUmlParser.g:821:1: ( RULE_END )
            // InternalSmallUmlParser.g:822:2: RULE_END
            {
             before(grammarAccess.getPackageAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUmlParser.g:832:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:836:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUmlParser.g:837:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUmlParser.g:844:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:848:1: ( ( () ) )
            // InternalSmallUmlParser.g:849:1: ( () )
            {
            // InternalSmallUmlParser.g:849:1: ( () )
            // InternalSmallUmlParser.g:850:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalSmallUmlParser.g:851:2: ()
            // InternalSmallUmlParser.g:851:3: 
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
    // InternalSmallUmlParser.g:859:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:863:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUmlParser.g:864:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalSmallUmlParser.g:871:1: rule__Class__Group__1__Impl : ( Class ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:875:1: ( ( Class ) )
            // InternalSmallUmlParser.g:876:1: ( Class )
            {
            // InternalSmallUmlParser.g:876:1: ( Class )
            // InternalSmallUmlParser.g:877:2: Class
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,Class,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:886:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:890:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUmlParser.g:891:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmallUmlParser.g:898:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:902:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:903:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:903:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:904:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:905:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUmlParser.g:905:3: rule__Class__NameAssignment_2
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
    // InternalSmallUmlParser.g:913:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:917:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUmlParser.g:918:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmallUmlParser.g:925:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:929:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalSmallUmlParser.g:930:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalSmallUmlParser.g:930:1: ( ( rule__Class__Group_3__0 )? )
            // InternalSmallUmlParser.g:931:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalSmallUmlParser.g:932:2: ( rule__Class__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Extends) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUmlParser.g:932:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:940:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:944:1: ( rule__Class__Group__4__Impl )
            // InternalSmallUmlParser.g:945:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:951:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:955:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSmallUmlParser.g:956:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSmallUmlParser.g:956:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSmallUmlParser.g:957:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSmallUmlParser.g:958:2: ( rule__Class__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEGIN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUmlParser.g:958:3: rule__Class__Group_4__0
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


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalSmallUmlParser.g:967:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:971:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalSmallUmlParser.g:972:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalSmallUmlParser.g:979:1: rule__Class__Group_3__0__Impl : ( Extends ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:983:1: ( ( Extends ) )
            // InternalSmallUmlParser.g:984:1: ( Extends )
            {
            // InternalSmallUmlParser.g:984:1: ( Extends )
            // InternalSmallUmlParser.g:985:2: Extends
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 
            match(input,Extends,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalSmallUmlParser.g:994:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:998:1: ( rule__Class__Group_3__1__Impl )
            // InternalSmallUmlParser.g:999:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalSmallUmlParser.g:1005:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__SuperAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1009:1: ( ( ( rule__Class__SuperAssignment_3_1 ) ) )
            // InternalSmallUmlParser.g:1010:1: ( ( rule__Class__SuperAssignment_3_1 ) )
            {
            // InternalSmallUmlParser.g:1010:1: ( ( rule__Class__SuperAssignment_3_1 ) )
            // InternalSmallUmlParser.g:1011:2: ( rule__Class__SuperAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getSuperAssignment_3_1()); 
            // InternalSmallUmlParser.g:1012:2: ( rule__Class__SuperAssignment_3_1 )
            // InternalSmallUmlParser.g:1012:3: rule__Class__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalSmallUmlParser.g:1021:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1025:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSmallUmlParser.g:1026:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSmallUmlParser.g:1033:1: rule__Class__Group_4__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1037:1: ( ( RULE_BEGIN ) )
            // InternalSmallUmlParser.g:1038:1: ( RULE_BEGIN )
            {
            // InternalSmallUmlParser.g:1038:1: ( RULE_BEGIN )
            // InternalSmallUmlParser.g:1039:2: RULE_BEGIN
            {
             before(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1048:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1052:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalSmallUmlParser.g:1053:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:1060:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__Alternatives_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1064:1: ( ( ( rule__Class__Alternatives_4_1 )* ) )
            // InternalSmallUmlParser.g:1065:1: ( ( rule__Class__Alternatives_4_1 )* )
            {
            // InternalSmallUmlParser.g:1065:1: ( ( rule__Class__Alternatives_4_1 )* )
            // InternalSmallUmlParser.g:1066:2: ( rule__Class__Alternatives_4_1 )*
            {
             before(grammarAccess.getClassAccess().getAlternatives_4_1()); 
            // InternalSmallUmlParser.g:1067:2: ( rule__Class__Alternatives_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PlusSign) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmallUmlParser.g:1067:3: rule__Class__Alternatives_4_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__Alternatives_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAlternatives_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_4__2"
    // InternalSmallUmlParser.g:1075:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1079:1: ( rule__Class__Group_4__2__Impl )
            // InternalSmallUmlParser.g:1080:2: rule__Class__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2"


    // $ANTLR start "rule__Class__Group_4__2__Impl"
    // InternalSmallUmlParser.g:1086:1: rule__Class__Group_4__2__Impl : ( RULE_END ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1090:1: ( ( RULE_END ) )
            // InternalSmallUmlParser.g:1091:1: ( RULE_END )
            {
            // InternalSmallUmlParser.g:1091:1: ( RULE_END )
            // InternalSmallUmlParser.g:1092:2: RULE_END
            {
             before(grammarAccess.getClassAccess().getENDTerminalRuleCall_4_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getENDTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUmlParser.g:1102:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1106:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUmlParser.g:1107:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSmallUmlParser.g:1114:1: rule__Attribute__Group__0__Impl : ( PlusSign ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1118:1: ( ( PlusSign ) )
            // InternalSmallUmlParser.g:1119:1: ( PlusSign )
            {
            // InternalSmallUmlParser.g:1119:1: ( PlusSign )
            // InternalSmallUmlParser.g:1120:2: PlusSign
            {
             before(grammarAccess.getAttributeAccess().getPlusSignKeyword_0()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getPlusSignKeyword_0()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1129:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1133:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUmlParser.g:1134:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmallUmlParser.g:1141:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1145:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUmlParser.g:1146:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUmlParser.g:1146:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUmlParser.g:1147:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUmlParser.g:1148:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUmlParser.g:1148:3: rule__Attribute__NameAssignment_1
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
    // InternalSmallUmlParser.g:1156:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1160:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUmlParser.g:1161:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUmlParser.g:1168:1: rule__Attribute__Group__2__Impl : ( Colon ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1172:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1173:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1173:1: ( Colon )
            // InternalSmallUmlParser.g:1174:2: Colon
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1183:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1187:1: ( rule__Attribute__Group__3__Impl )
            // InternalSmallUmlParser.g:1188:2: rule__Attribute__Group__3__Impl
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
    // InternalSmallUmlParser.g:1194:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1198:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalSmallUmlParser.g:1199:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalSmallUmlParser.g:1199:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalSmallUmlParser.g:1200:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalSmallUmlParser.g:1201:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalSmallUmlParser.g:1201:3: rule__Attribute__TypeAssignment_3
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


    // $ANTLR start "rule__Method__Group__0"
    // InternalSmallUmlParser.g:1210:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1214:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSmallUmlParser.g:1215:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSmallUmlParser.g:1222:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1226:1: ( ( () ) )
            // InternalSmallUmlParser.g:1227:1: ( () )
            {
            // InternalSmallUmlParser.g:1227:1: ( () )
            // InternalSmallUmlParser.g:1228:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSmallUmlParser.g:1229:2: ()
            // InternalSmallUmlParser.g:1229:3: 
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
    // InternalSmallUmlParser.g:1237:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1241:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSmallUmlParser.g:1242:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalSmallUmlParser.g:1249:1: rule__Method__Group__1__Impl : ( PlusSign ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1253:1: ( ( PlusSign ) )
            // InternalSmallUmlParser.g:1254:1: ( PlusSign )
            {
            // InternalSmallUmlParser.g:1254:1: ( PlusSign )
            // InternalSmallUmlParser.g:1255:2: PlusSign
            {
             before(grammarAccess.getMethodAccess().getPlusSignKeyword_1()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getPlusSignKeyword_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1264:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1268:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSmallUmlParser.g:1269:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSmallUmlParser.g:1276:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1280:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:1281:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:1281:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:1282:2: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:1283:2: ( rule__Method__NameAssignment_2 )
            // InternalSmallUmlParser.g:1283:3: rule__Method__NameAssignment_2
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
    // InternalSmallUmlParser.g:1291:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1295:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSmallUmlParser.g:1296:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUmlParser.g:1303:1: rule__Method__Group__3__Impl : ( LeftParenthesis ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1307:1: ( ( LeftParenthesis ) )
            // InternalSmallUmlParser.g:1308:1: ( LeftParenthesis )
            {
            // InternalSmallUmlParser.g:1308:1: ( LeftParenthesis )
            // InternalSmallUmlParser.g:1309:2: LeftParenthesis
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1318:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1322:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSmallUmlParser.g:1323:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUmlParser.g:1330:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1334:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalSmallUmlParser.g:1335:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalSmallUmlParser.g:1335:1: ( ( rule__Method__Group_4__0 )? )
            // InternalSmallUmlParser.g:1336:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSmallUmlParser.g:1337:2: ( rule__Method__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUmlParser.g:1337:3: rule__Method__Group_4__0
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
    // InternalSmallUmlParser.g:1345:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1349:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSmallUmlParser.g:1350:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalSmallUmlParser.g:1357:1: rule__Method__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1361:1: ( ( RightParenthesis ) )
            // InternalSmallUmlParser.g:1362:1: ( RightParenthesis )
            {
            // InternalSmallUmlParser.g:1362:1: ( RightParenthesis )
            // InternalSmallUmlParser.g:1363:2: RightParenthesis
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1372:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1376:1: ( rule__Method__Group__6__Impl )
            // InternalSmallUmlParser.g:1377:2: rule__Method__Group__6__Impl
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
    // InternalSmallUmlParser.g:1383:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1387:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalSmallUmlParser.g:1388:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalSmallUmlParser.g:1388:1: ( ( rule__Method__Group_6__0 )? )
            // InternalSmallUmlParser.g:1389:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalSmallUmlParser.g:1390:2: ( rule__Method__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Colon) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUmlParser.g:1390:3: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1399:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1403:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSmallUmlParser.g:1404:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUmlParser.g:1411:1: rule__Method__Group_4__0__Impl : ( ( rule__Method__ParameterAssignment_4_0 ) ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1415:1: ( ( ( rule__Method__ParameterAssignment_4_0 ) ) )
            // InternalSmallUmlParser.g:1416:1: ( ( rule__Method__ParameterAssignment_4_0 ) )
            {
            // InternalSmallUmlParser.g:1416:1: ( ( rule__Method__ParameterAssignment_4_0 ) )
            // InternalSmallUmlParser.g:1417:2: ( rule__Method__ParameterAssignment_4_0 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_0()); 
            // InternalSmallUmlParser.g:1418:2: ( rule__Method__ParameterAssignment_4_0 )
            // InternalSmallUmlParser.g:1418:3: rule__Method__ParameterAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParameterAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_4_0()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1426:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1430:1: ( rule__Method__Group_4__1__Impl )
            // InternalSmallUmlParser.g:1431:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:1437:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__Group_4_1__0 )* ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1441:1: ( ( ( rule__Method__Group_4_1__0 )* ) )
            // InternalSmallUmlParser.g:1442:1: ( ( rule__Method__Group_4_1__0 )* )
            {
            // InternalSmallUmlParser.g:1442:1: ( ( rule__Method__Group_4_1__0 )* )
            // InternalSmallUmlParser.g:1443:2: ( rule__Method__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4_1()); 
            // InternalSmallUmlParser.g:1444:2: ( rule__Method__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallUmlParser.g:1444:3: rule__Method__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Method__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Method__Group_4_1__0"
    // InternalSmallUmlParser.g:1453:1: rule__Method__Group_4_1__0 : rule__Method__Group_4_1__0__Impl rule__Method__Group_4_1__1 ;
    public final void rule__Method__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1457:1: ( rule__Method__Group_4_1__0__Impl rule__Method__Group_4_1__1 )
            // InternalSmallUmlParser.g:1458:2: rule__Method__Group_4_1__0__Impl rule__Method__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4_1__0"


    // $ANTLR start "rule__Method__Group_4_1__0__Impl"
    // InternalSmallUmlParser.g:1465:1: rule__Method__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__Method__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1469:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:1470:1: ( Comma )
            {
            // InternalSmallUmlParser.g:1470:1: ( Comma )
            // InternalSmallUmlParser.g:1471:2: Comma
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4_1__0__Impl"


    // $ANTLR start "rule__Method__Group_4_1__1"
    // InternalSmallUmlParser.g:1480:1: rule__Method__Group_4_1__1 : rule__Method__Group_4_1__1__Impl ;
    public final void rule__Method__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1484:1: ( rule__Method__Group_4_1__1__Impl )
            // InternalSmallUmlParser.g:1485:2: rule__Method__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4_1__1"


    // $ANTLR start "rule__Method__Group_4_1__1__Impl"
    // InternalSmallUmlParser.g:1491:1: rule__Method__Group_4_1__1__Impl : ( ( rule__Method__ParameterAssignment_4_1_1 ) ) ;
    public final void rule__Method__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1495:1: ( ( ( rule__Method__ParameterAssignment_4_1_1 ) ) )
            // InternalSmallUmlParser.g:1496:1: ( ( rule__Method__ParameterAssignment_4_1_1 ) )
            {
            // InternalSmallUmlParser.g:1496:1: ( ( rule__Method__ParameterAssignment_4_1_1 ) )
            // InternalSmallUmlParser.g:1497:2: ( rule__Method__ParameterAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_1_1()); 
            // InternalSmallUmlParser.g:1498:2: ( rule__Method__ParameterAssignment_4_1_1 )
            // InternalSmallUmlParser.g:1498:3: rule__Method__ParameterAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParameterAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4_1__1__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalSmallUmlParser.g:1507:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1511:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalSmallUmlParser.g:1512:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Method__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalSmallUmlParser.g:1519:1: rule__Method__Group_6__0__Impl : ( Colon ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1523:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1524:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1524:1: ( Colon )
            // InternalSmallUmlParser.g:1525:2: Colon
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_6_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalSmallUmlParser.g:1534:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1538:1: ( rule__Method__Group_6__1__Impl )
            // InternalSmallUmlParser.g:1539:2: rule__Method__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalSmallUmlParser.g:1545:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__ReturnTypeAssignment_6_1 ) ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1549:1: ( ( ( rule__Method__ReturnTypeAssignment_6_1 ) ) )
            // InternalSmallUmlParser.g:1550:1: ( ( rule__Method__ReturnTypeAssignment_6_1 ) )
            {
            // InternalSmallUmlParser.g:1550:1: ( ( rule__Method__ReturnTypeAssignment_6_1 ) )
            // InternalSmallUmlParser.g:1551:2: ( rule__Method__ReturnTypeAssignment_6_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1()); 
            // InternalSmallUmlParser.g:1552:2: ( rule__Method__ReturnTypeAssignment_6_1 )
            // InternalSmallUmlParser.g:1552:3: rule__Method__ReturnTypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturnTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSmallUmlParser.g:1561:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1565:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSmallUmlParser.g:1566:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmallUmlParser.g:1573:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1577:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalSmallUmlParser.g:1578:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalSmallUmlParser.g:1578:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalSmallUmlParser.g:1579:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalSmallUmlParser.g:1580:2: ( rule__Parameter__NameAssignment_0 )
            // InternalSmallUmlParser.g:1580:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1588:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1592:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSmallUmlParser.g:1593:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUmlParser.g:1600:1: rule__Parameter__Group__1__Impl : ( Colon ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1604:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1605:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1605:1: ( Colon )
            // InternalSmallUmlParser.g:1606:2: Colon
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1615:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1619:1: ( rule__Parameter__Group__2__Impl )
            // InternalSmallUmlParser.g:1620:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:1626:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1630:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalSmallUmlParser.g:1631:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:1631:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalSmallUmlParser.g:1632:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalSmallUmlParser.g:1633:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalSmallUmlParser.g:1633:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Composition__Group__0"
    // InternalSmallUmlParser.g:1642:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1646:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalSmallUmlParser.g:1647:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUmlParser.g:1654:1: rule__Composition__Group__0__Impl : ( ( rule__Composition__Group_0__0 )? ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1658:1: ( ( ( rule__Composition__Group_0__0 )? ) )
            // InternalSmallUmlParser.g:1659:1: ( ( rule__Composition__Group_0__0 )? )
            {
            // InternalSmallUmlParser.g:1659:1: ( ( rule__Composition__Group_0__0 )? )
            // InternalSmallUmlParser.g:1660:2: ( rule__Composition__Group_0__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_0()); 
            // InternalSmallUmlParser.g:1661:2: ( rule__Composition__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==Colon) ) {
                    alt12=1;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==Colon) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUmlParser.g:1661:3: rule__Composition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalSmallUmlParser.g:1669:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1673:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalSmallUmlParser.g:1674:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSmallUmlParser.g:1681:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__SourceAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1685:1: ( ( ( rule__Composition__SourceAssignment_1 ) ) )
            // InternalSmallUmlParser.g:1686:1: ( ( rule__Composition__SourceAssignment_1 ) )
            {
            // InternalSmallUmlParser.g:1686:1: ( ( rule__Composition__SourceAssignment_1 ) )
            // InternalSmallUmlParser.g:1687:2: ( rule__Composition__SourceAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getSourceAssignment_1()); 
            // InternalSmallUmlParser.g:1688:2: ( rule__Composition__SourceAssignment_1 )
            // InternalSmallUmlParser.g:1688:3: rule__Composition__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getSourceAssignment_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1696:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1700:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalSmallUmlParser.g:1701:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUmlParser.g:1708:1: rule__Composition__Group__2__Impl : ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1712:1: ( ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus ) )
            // InternalSmallUmlParser.g:1713:1: ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus )
            {
            // InternalSmallUmlParser.g:1713:1: ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus )
            // InternalSmallUmlParser.g:1714:2: LessThanSignGreaterThanSignHyphenMinusHyphenMinus
            {
             before(grammarAccess.getCompositionAccess().getLessThanSignGreaterThanSignHyphenMinusHyphenMinusKeyword_2()); 
            match(input,LessThanSignGreaterThanSignHyphenMinusHyphenMinus,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLessThanSignGreaterThanSignHyphenMinusHyphenMinusKeyword_2()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1723:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1727:1: ( rule__Composition__Group__3__Impl )
            // InternalSmallUmlParser.g:1728:2: rule__Composition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:1734:1: rule__Composition__Group__3__Impl : ( ( rule__Composition__TargetAssignment_3 ) ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1738:1: ( ( ( rule__Composition__TargetAssignment_3 ) ) )
            // InternalSmallUmlParser.g:1739:1: ( ( rule__Composition__TargetAssignment_3 ) )
            {
            // InternalSmallUmlParser.g:1739:1: ( ( rule__Composition__TargetAssignment_3 ) )
            // InternalSmallUmlParser.g:1740:2: ( rule__Composition__TargetAssignment_3 )
            {
             before(grammarAccess.getCompositionAccess().getTargetAssignment_3()); 
            // InternalSmallUmlParser.g:1741:2: ( rule__Composition__TargetAssignment_3 )
            // InternalSmallUmlParser.g:1741:3: rule__Composition__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Composition__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getTargetAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Composition__Group_0__0"
    // InternalSmallUmlParser.g:1750:1: rule__Composition__Group_0__0 : rule__Composition__Group_0__0__Impl rule__Composition__Group_0__1 ;
    public final void rule__Composition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1754:1: ( rule__Composition__Group_0__0__Impl rule__Composition__Group_0__1 )
            // InternalSmallUmlParser.g:1755:2: rule__Composition__Group_0__0__Impl rule__Composition__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Composition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_0__0"


    // $ANTLR start "rule__Composition__Group_0__0__Impl"
    // InternalSmallUmlParser.g:1762:1: rule__Composition__Group_0__0__Impl : ( ( rule__Composition__NameAssignment_0_0 ) ) ;
    public final void rule__Composition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1766:1: ( ( ( rule__Composition__NameAssignment_0_0 ) ) )
            // InternalSmallUmlParser.g:1767:1: ( ( rule__Composition__NameAssignment_0_0 ) )
            {
            // InternalSmallUmlParser.g:1767:1: ( ( rule__Composition__NameAssignment_0_0 ) )
            // InternalSmallUmlParser.g:1768:2: ( rule__Composition__NameAssignment_0_0 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_0_0()); 
            // InternalSmallUmlParser.g:1769:2: ( rule__Composition__NameAssignment_0_0 )
            // InternalSmallUmlParser.g:1769:3: rule__Composition__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_0__0__Impl"


    // $ANTLR start "rule__Composition__Group_0__1"
    // InternalSmallUmlParser.g:1777:1: rule__Composition__Group_0__1 : rule__Composition__Group_0__1__Impl ;
    public final void rule__Composition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1781:1: ( rule__Composition__Group_0__1__Impl )
            // InternalSmallUmlParser.g:1782:2: rule__Composition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_0__1"


    // $ANTLR start "rule__Composition__Group_0__1__Impl"
    // InternalSmallUmlParser.g:1788:1: rule__Composition__Group_0__1__Impl : ( Colon ) ;
    public final void rule__Composition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1792:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1793:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1793:1: ( Colon )
            // InternalSmallUmlParser.g:1794:2: Colon
            {
             before(grammarAccess.getCompositionAccess().getColonKeyword_0_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_0__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalSmallUmlParser.g:1804:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1808:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalSmallUmlParser.g:1809:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUmlParser.g:1816:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Group_0__0 )? ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1820:1: ( ( ( rule__Reference__Group_0__0 )? ) )
            // InternalSmallUmlParser.g:1821:1: ( ( rule__Reference__Group_0__0 )? )
            {
            // InternalSmallUmlParser.g:1821:1: ( ( rule__Reference__Group_0__0 )? )
            // InternalSmallUmlParser.g:1822:2: ( rule__Reference__Group_0__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_0()); 
            // InternalSmallUmlParser.g:1823:2: ( rule__Reference__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==Colon) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==Colon) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUmlParser.g:1823:3: rule__Reference__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalSmallUmlParser.g:1831:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1835:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalSmallUmlParser.g:1836:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUmlParser.g:1843:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__SourceAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1847:1: ( ( ( rule__Reference__SourceAssignment_1 ) ) )
            // InternalSmallUmlParser.g:1848:1: ( ( rule__Reference__SourceAssignment_1 ) )
            {
            // InternalSmallUmlParser.g:1848:1: ( ( rule__Reference__SourceAssignment_1 ) )
            // InternalSmallUmlParser.g:1849:2: ( rule__Reference__SourceAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getSourceAssignment_1()); 
            // InternalSmallUmlParser.g:1850:2: ( rule__Reference__SourceAssignment_1 )
            // InternalSmallUmlParser.g:1850:3: rule__Reference__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSourceAssignment_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1858:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1862:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalSmallUmlParser.g:1863:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSmallUmlParser.g:1870:1: rule__Reference__Group__2__Impl : ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1874:1: ( ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ) )
            // InternalSmallUmlParser.g:1875:1: ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign )
            {
            // InternalSmallUmlParser.g:1875:1: ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign )
            // InternalSmallUmlParser.g:1876:2: HyphenMinusHyphenMinusHyphenMinusGreaterThanSign
            {
             before(grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,HyphenMinusHyphenMinusHyphenMinusGreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:1885:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1889:1: ( rule__Reference__Group__3__Impl )
            // InternalSmallUmlParser.g:1890:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:1896:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TargetAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1900:1: ( ( ( rule__Reference__TargetAssignment_3 ) ) )
            // InternalSmallUmlParser.g:1901:1: ( ( rule__Reference__TargetAssignment_3 ) )
            {
            // InternalSmallUmlParser.g:1901:1: ( ( rule__Reference__TargetAssignment_3 ) )
            // InternalSmallUmlParser.g:1902:2: ( rule__Reference__TargetAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_3()); 
            // InternalSmallUmlParser.g:1903:2: ( rule__Reference__TargetAssignment_3 )
            // InternalSmallUmlParser.g:1903:3: rule__Reference__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTargetAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reference__Group_0__0"
    // InternalSmallUmlParser.g:1912:1: rule__Reference__Group_0__0 : rule__Reference__Group_0__0__Impl rule__Reference__Group_0__1 ;
    public final void rule__Reference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1916:1: ( rule__Reference__Group_0__0__Impl rule__Reference__Group_0__1 )
            // InternalSmallUmlParser.g:1917:2: rule__Reference__Group_0__0__Impl rule__Reference__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Reference__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_0__0"


    // $ANTLR start "rule__Reference__Group_0__0__Impl"
    // InternalSmallUmlParser.g:1924:1: rule__Reference__Group_0__0__Impl : ( ( rule__Reference__NameAssignment_0_0 ) ) ;
    public final void rule__Reference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1928:1: ( ( ( rule__Reference__NameAssignment_0_0 ) ) )
            // InternalSmallUmlParser.g:1929:1: ( ( rule__Reference__NameAssignment_0_0 ) )
            {
            // InternalSmallUmlParser.g:1929:1: ( ( rule__Reference__NameAssignment_0_0 ) )
            // InternalSmallUmlParser.g:1930:2: ( rule__Reference__NameAssignment_0_0 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_0_0()); 
            // InternalSmallUmlParser.g:1931:2: ( rule__Reference__NameAssignment_0_0 )
            // InternalSmallUmlParser.g:1931:3: rule__Reference__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_0__0__Impl"


    // $ANTLR start "rule__Reference__Group_0__1"
    // InternalSmallUmlParser.g:1939:1: rule__Reference__Group_0__1 : rule__Reference__Group_0__1__Impl ;
    public final void rule__Reference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1943:1: ( rule__Reference__Group_0__1__Impl )
            // InternalSmallUmlParser.g:1944:2: rule__Reference__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_0__1"


    // $ANTLR start "rule__Reference__Group_0__1__Impl"
    // InternalSmallUmlParser.g:1950:1: rule__Reference__Group_0__1__Impl : ( Colon ) ;
    public final void rule__Reference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1954:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1955:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1955:1: ( Colon )
            // InternalSmallUmlParser.g:1956:2: Colon
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_0_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_0__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSmallUmlParser.g:1966:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1970:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSmallUmlParser.g:1971:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSmallUmlParser.g:1978:1: rule__Role__Group__0__Impl : ( ( rule__Role__NameAssignment_0 )? ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1982:1: ( ( ( rule__Role__NameAssignment_0 )? ) )
            // InternalSmallUmlParser.g:1983:1: ( ( rule__Role__NameAssignment_0 )? )
            {
            // InternalSmallUmlParser.g:1983:1: ( ( rule__Role__NameAssignment_0 )? )
            // InternalSmallUmlParser.g:1984:2: ( rule__Role__NameAssignment_0 )?
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_0()); 
            // InternalSmallUmlParser.g:1985:2: ( rule__Role__NameAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUmlParser.g:1985:3: rule__Role__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalSmallUmlParser.g:1993:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1997:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSmallUmlParser.g:1998:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSmallUmlParser.g:2005:1: rule__Role__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2009:1: ( ( LeftParenthesis ) )
            // InternalSmallUmlParser.g:2010:1: ( LeftParenthesis )
            {
            // InternalSmallUmlParser.g:2010:1: ( LeftParenthesis )
            // InternalSmallUmlParser.g:2011:2: LeftParenthesis
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2020:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2024:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSmallUmlParser.g:2025:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSmallUmlParser.g:2032:1: rule__Role__Group__2__Impl : ( ( rule__Role__ClassAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2036:1: ( ( ( rule__Role__ClassAssignment_2 ) ) )
            // InternalSmallUmlParser.g:2037:1: ( ( rule__Role__ClassAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:2037:1: ( ( rule__Role__ClassAssignment_2 ) )
            // InternalSmallUmlParser.g:2038:2: ( rule__Role__ClassAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getClassAssignment_2()); 
            // InternalSmallUmlParser.g:2039:2: ( rule__Role__ClassAssignment_2 )
            // InternalSmallUmlParser.g:2039:3: rule__Role__ClassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getClassAssignment_2()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2047:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2051:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSmallUmlParser.g:2052:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSmallUmlParser.g:2059:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2063:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSmallUmlParser.g:2064:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSmallUmlParser.g:2064:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSmallUmlParser.g:2065:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSmallUmlParser.g:2066:2: ( rule__Role__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Comma) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUmlParser.g:2066:3: rule__Role__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2074:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2078:1: ( rule__Role__Group__4__Impl )
            // InternalSmallUmlParser.g:2079:2: rule__Role__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:2085:1: rule__Role__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2089:1: ( ( RightParenthesis ) )
            // InternalSmallUmlParser.g:2090:1: ( RightParenthesis )
            {
            // InternalSmallUmlParser.g:2090:1: ( RightParenthesis )
            // InternalSmallUmlParser.g:2091:2: RightParenthesis
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Role__Group_3__0"
    // InternalSmallUmlParser.g:2101:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2105:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSmallUmlParser.g:2106:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__0"


    // $ANTLR start "rule__Role__Group_3__0__Impl"
    // InternalSmallUmlParser.g:2113:1: rule__Role__Group_3__0__Impl : ( Comma ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2117:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:2118:1: ( Comma )
            {
            // InternalSmallUmlParser.g:2118:1: ( Comma )
            // InternalSmallUmlParser.g:2119:2: Comma
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__0__Impl"


    // $ANTLR start "rule__Role__Group_3__1"
    // InternalSmallUmlParser.g:2128:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2132:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSmallUmlParser.g:2133:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__1"


    // $ANTLR start "rule__Role__Group_3__1__Impl"
    // InternalSmallUmlParser.g:2140:1: rule__Role__Group_3__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2144:1: ( ( LeftSquareBracket ) )
            // InternalSmallUmlParser.g:2145:1: ( LeftSquareBracket )
            {
            // InternalSmallUmlParser.g:2145:1: ( LeftSquareBracket )
            // InternalSmallUmlParser.g:2146:2: LeftSquareBracket
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__1__Impl"


    // $ANTLR start "rule__Role__Group_3__2"
    // InternalSmallUmlParser.g:2155:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2159:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSmallUmlParser.g:2160:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
            {
            pushFollow(FOLLOW_17);
            rule__Role__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__2"


    // $ANTLR start "rule__Role__Group_3__2__Impl"
    // InternalSmallUmlParser.g:2167:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__LowerBoundAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2171:1: ( ( ( rule__Role__LowerBoundAssignment_3_2 ) ) )
            // InternalSmallUmlParser.g:2172:1: ( ( rule__Role__LowerBoundAssignment_3_2 ) )
            {
            // InternalSmallUmlParser.g:2172:1: ( ( rule__Role__LowerBoundAssignment_3_2 ) )
            // InternalSmallUmlParser.g:2173:2: ( rule__Role__LowerBoundAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getLowerBoundAssignment_3_2()); 
            // InternalSmallUmlParser.g:2174:2: ( rule__Role__LowerBoundAssignment_3_2 )
            // InternalSmallUmlParser.g:2174:3: rule__Role__LowerBoundAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__LowerBoundAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getLowerBoundAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__2__Impl"


    // $ANTLR start "rule__Role__Group_3__3"
    // InternalSmallUmlParser.g:2182:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2186:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSmallUmlParser.g:2187:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__3"


    // $ANTLR start "rule__Role__Group_3__3__Impl"
    // InternalSmallUmlParser.g:2194:1: rule__Role__Group_3__3__Impl : ( Comma ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2198:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:2199:1: ( Comma )
            {
            // InternalSmallUmlParser.g:2199:1: ( Comma )
            // InternalSmallUmlParser.g:2200:2: Comma
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_3_3()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__3__Impl"


    // $ANTLR start "rule__Role__Group_3__4"
    // InternalSmallUmlParser.g:2209:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl rule__Role__Group_3__5 ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2213:1: ( rule__Role__Group_3__4__Impl rule__Role__Group_3__5 )
            // InternalSmallUmlParser.g:2214:2: rule__Role__Group_3__4__Impl rule__Role__Group_3__5
            {
            pushFollow(FOLLOW_25);
            rule__Role__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__4"


    // $ANTLR start "rule__Role__Group_3__4__Impl"
    // InternalSmallUmlParser.g:2221:1: rule__Role__Group_3__4__Impl : ( ( rule__Role__UpperBoundAssignment_3_4 ) ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2225:1: ( ( ( rule__Role__UpperBoundAssignment_3_4 ) ) )
            // InternalSmallUmlParser.g:2226:1: ( ( rule__Role__UpperBoundAssignment_3_4 ) )
            {
            // InternalSmallUmlParser.g:2226:1: ( ( rule__Role__UpperBoundAssignment_3_4 ) )
            // InternalSmallUmlParser.g:2227:2: ( rule__Role__UpperBoundAssignment_3_4 )
            {
             before(grammarAccess.getRoleAccess().getUpperBoundAssignment_3_4()); 
            // InternalSmallUmlParser.g:2228:2: ( rule__Role__UpperBoundAssignment_3_4 )
            // InternalSmallUmlParser.g:2228:3: rule__Role__UpperBoundAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Role__UpperBoundAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getUpperBoundAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__4__Impl"


    // $ANTLR start "rule__Role__Group_3__5"
    // InternalSmallUmlParser.g:2236:1: rule__Role__Group_3__5 : rule__Role__Group_3__5__Impl ;
    public final void rule__Role__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2240:1: ( rule__Role__Group_3__5__Impl )
            // InternalSmallUmlParser.g:2241:2: rule__Role__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__5"


    // $ANTLR start "rule__Role__Group_3__5__Impl"
    // InternalSmallUmlParser.g:2247:1: rule__Role__Group_3__5__Impl : ( RightSquareBracket ) ;
    public final void rule__Role__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2251:1: ( ( RightSquareBracket ) )
            // InternalSmallUmlParser.g:2252:1: ( RightSquareBracket )
            {
            // InternalSmallUmlParser.g:2252:1: ( RightSquareBracket )
            // InternalSmallUmlParser.g:2253:2: RightSquareBracket
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_3__5__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalSmallUmlParser.g:2263:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2267:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUmlParser.g:2268:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUmlParser.g:2275:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2279:1: ( ( () ) )
            // InternalSmallUmlParser.g:2280:1: ( () )
            {
            // InternalSmallUmlParser.g:2280:1: ( () )
            // InternalSmallUmlParser.g:2281:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUmlParser.g:2282:2: ()
            // InternalSmallUmlParser.g:2282:3: 
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
    // InternalSmallUmlParser.g:2290:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2294:1: ( rule__String0__Group__1__Impl )
            // InternalSmallUmlParser.g:2295:2: rule__String0__Group__1__Impl
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
    // InternalSmallUmlParser.g:2301:1: rule__String0__Group__1__Impl : ( String ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2305:1: ( ( String ) )
            // InternalSmallUmlParser.g:2306:1: ( String )
            {
            // InternalSmallUmlParser.g:2306:1: ( String )
            // InternalSmallUmlParser.g:2307:2: String
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,String,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2317:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2321:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUmlParser.g:2322:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSmallUmlParser.g:2329:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2333:1: ( ( () ) )
            // InternalSmallUmlParser.g:2334:1: ( () )
            {
            // InternalSmallUmlParser.g:2334:1: ( () )
            // InternalSmallUmlParser.g:2335:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUmlParser.g:2336:2: ()
            // InternalSmallUmlParser.g:2336:3: 
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
    // InternalSmallUmlParser.g:2344:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2348:1: ( rule__Integer__Group__1__Impl )
            // InternalSmallUmlParser.g:2349:2: rule__Integer__Group__1__Impl
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
    // InternalSmallUmlParser.g:2355:1: rule__Integer__Group__1__Impl : ( Integer ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2359:1: ( ( Integer ) )
            // InternalSmallUmlParser.g:2360:1: ( Integer )
            {
            // InternalSmallUmlParser.g:2360:1: ( Integer )
            // InternalSmallUmlParser.g:2361:2: Integer
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,Integer,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2371:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2375:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalSmallUmlParser.g:2376:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSmallUmlParser.g:2383:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2387:1: ( ( () ) )
            // InternalSmallUmlParser.g:2388:1: ( () )
            {
            // InternalSmallUmlParser.g:2388:1: ( () )
            // InternalSmallUmlParser.g:2389:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalSmallUmlParser.g:2390:2: ()
            // InternalSmallUmlParser.g:2390:3: 
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
    // InternalSmallUmlParser.g:2398:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2402:1: ( rule__Bool__Group__1__Impl )
            // InternalSmallUmlParser.g:2403:2: rule__Bool__Group__1__Impl
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
    // InternalSmallUmlParser.g:2409:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2413:1: ( ( Bool ) )
            // InternalSmallUmlParser.g:2414:1: ( Bool )
            {
            // InternalSmallUmlParser.g:2414:1: ( Bool )
            // InternalSmallUmlParser.g:2415:2: Bool
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword_1()); 
            match(input,Bool,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2425:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2429:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSmallUmlParser.g:2430:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSmallUmlParser.g:2437:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2441:1: ( ( () ) )
            // InternalSmallUmlParser.g:2442:1: ( () )
            {
            // InternalSmallUmlParser.g:2442:1: ( () )
            // InternalSmallUmlParser.g:2443:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSmallUmlParser.g:2444:2: ()
            // InternalSmallUmlParser.g:2444:3: 
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
    // InternalSmallUmlParser.g:2452:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2456:1: ( rule__Real__Group__1__Impl )
            // InternalSmallUmlParser.g:2457:2: rule__Real__Group__1__Impl
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
    // InternalSmallUmlParser.g:2463:1: rule__Real__Group__1__Impl : ( Real ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2467:1: ( ( Real ) )
            // InternalSmallUmlParser.g:2468:1: ( Real )
            {
            // InternalSmallUmlParser.g:2468:1: ( Real )
            // InternalSmallUmlParser.g:2469:2: Real
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,Real,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2479:1: rule__UnlimitedNatural__Group__0 : rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 ;
    public final void rule__UnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2483:1: ( rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 )
            // InternalSmallUmlParser.g:2484:2: rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSmallUmlParser.g:2491:1: rule__UnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__UnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2495:1: ( ( () ) )
            // InternalSmallUmlParser.g:2496:1: ( () )
            {
            // InternalSmallUmlParser.g:2496:1: ( () )
            // InternalSmallUmlParser.g:2497:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0()); 
            // InternalSmallUmlParser.g:2498:2: ()
            // InternalSmallUmlParser.g:2498:3: 
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
    // InternalSmallUmlParser.g:2506:1: rule__UnlimitedNatural__Group__1 : rule__UnlimitedNatural__Group__1__Impl ;
    public final void rule__UnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2510:1: ( rule__UnlimitedNatural__Group__1__Impl )
            // InternalSmallUmlParser.g:2511:2: rule__UnlimitedNatural__Group__1__Impl
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
    // InternalSmallUmlParser.g:2517:1: rule__UnlimitedNatural__Group__1__Impl : ( UnlimitedNatural ) ;
    public final void rule__UnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2521:1: ( ( UnlimitedNatural ) )
            // InternalSmallUmlParser.g:2522:1: ( UnlimitedNatural )
            {
            // InternalSmallUmlParser.g:2522:1: ( UnlimitedNatural )
            // InternalSmallUmlParser.g:2523:2: UnlimitedNatural
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1()); 
            match(input,UnlimitedNatural,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2533:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2537:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUmlParser.g:2538:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSmallUmlParser.g:2545:1: rule__Enumeration__Group__0__Impl : ( Enumeration ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2549:1: ( ( Enumeration ) )
            // InternalSmallUmlParser.g:2550:1: ( Enumeration )
            {
            // InternalSmallUmlParser.g:2550:1: ( Enumeration )
            // InternalSmallUmlParser.g:2551:2: Enumeration
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,Enumeration,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2560:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2564:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUmlParser.g:2565:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSmallUmlParser.g:2572:1: rule__Enumeration__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2576:1: ( ( LeftCurlyBracket ) )
            // InternalSmallUmlParser.g:2577:1: ( LeftCurlyBracket )
            {
            // InternalSmallUmlParser.g:2577:1: ( LeftCurlyBracket )
            // InternalSmallUmlParser.g:2578:2: LeftCurlyBracket
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2587:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2591:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUmlParser.g:2592:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalSmallUmlParser.g:2599:1: rule__Enumeration__Group__2__Impl : ( Value ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2603:1: ( ( Value ) )
            // InternalSmallUmlParser.g:2604:1: ( Value )
            {
            // InternalSmallUmlParser.g:2604:1: ( Value )
            // InternalSmallUmlParser.g:2605:2: Value
            {
             before(grammarAccess.getEnumerationAccess().getValueKeyword_2()); 
            match(input,Value,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2614:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2618:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUmlParser.g:2619:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUmlParser.g:2626:1: rule__Enumeration__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2630:1: ( ( LeftCurlyBracket ) )
            // InternalSmallUmlParser.g:2631:1: ( LeftCurlyBracket )
            {
            // InternalSmallUmlParser.g:2631:1: ( LeftCurlyBracket )
            // InternalSmallUmlParser.g:2632:2: LeftCurlyBracket
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2641:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2645:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUmlParser.g:2646:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalSmallUmlParser.g:2653:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__ValueAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2657:1: ( ( ( rule__Enumeration__ValueAssignment_4 ) ) )
            // InternalSmallUmlParser.g:2658:1: ( ( rule__Enumeration__ValueAssignment_4 ) )
            {
            // InternalSmallUmlParser.g:2658:1: ( ( rule__Enumeration__ValueAssignment_4 ) )
            // InternalSmallUmlParser.g:2659:2: ( rule__Enumeration__ValueAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_4()); 
            // InternalSmallUmlParser.g:2660:2: ( rule__Enumeration__ValueAssignment_4 )
            // InternalSmallUmlParser.g:2660:3: rule__Enumeration__ValueAssignment_4
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
    // InternalSmallUmlParser.g:2668:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2672:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUmlParser.g:2673:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalSmallUmlParser.g:2680:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__Group_5__0 )* ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2684:1: ( ( ( rule__Enumeration__Group_5__0 )* ) )
            // InternalSmallUmlParser.g:2685:1: ( ( rule__Enumeration__Group_5__0 )* )
            {
            // InternalSmallUmlParser.g:2685:1: ( ( rule__Enumeration__Group_5__0 )* )
            // InternalSmallUmlParser.g:2686:2: ( rule__Enumeration__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_5()); 
            // InternalSmallUmlParser.g:2687:2: ( rule__Enumeration__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallUmlParser.g:2687:3: rule__Enumeration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Enumeration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSmallUmlParser.g:2695:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2699:1: ( rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 )
            // InternalSmallUmlParser.g:2700:2: rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalSmallUmlParser.g:2707:1: rule__Enumeration__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2711:1: ( ( RightCurlyBracket ) )
            // InternalSmallUmlParser.g:2712:1: ( RightCurlyBracket )
            {
            // InternalSmallUmlParser.g:2712:1: ( RightCurlyBracket )
            // InternalSmallUmlParser.g:2713:2: RightCurlyBracket
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2722:1: rule__Enumeration__Group__7 : rule__Enumeration__Group__7__Impl ;
    public final void rule__Enumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2726:1: ( rule__Enumeration__Group__7__Impl )
            // InternalSmallUmlParser.g:2727:2: rule__Enumeration__Group__7__Impl
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
    // InternalSmallUmlParser.g:2733:1: rule__Enumeration__Group__7__Impl : ( RightCurlyBracket ) ;
    public final void rule__Enumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2737:1: ( ( RightCurlyBracket ) )
            // InternalSmallUmlParser.g:2738:1: ( RightCurlyBracket )
            {
            // InternalSmallUmlParser.g:2738:1: ( RightCurlyBracket )
            // InternalSmallUmlParser.g:2739:2: RightCurlyBracket
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2749:1: rule__Enumeration__Group_5__0 : rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 ;
    public final void rule__Enumeration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2753:1: ( rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 )
            // InternalSmallUmlParser.g:2754:2: rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSmallUmlParser.g:2761:1: rule__Enumeration__Group_5__0__Impl : ( Comma ) ;
    public final void rule__Enumeration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2765:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:2766:1: ( Comma )
            {
            // InternalSmallUmlParser.g:2766:1: ( Comma )
            // InternalSmallUmlParser.g:2767:2: Comma
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalSmallUmlParser.g:2776:1: rule__Enumeration__Group_5__1 : rule__Enumeration__Group_5__1__Impl ;
    public final void rule__Enumeration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2780:1: ( rule__Enumeration__Group_5__1__Impl )
            // InternalSmallUmlParser.g:2781:2: rule__Enumeration__Group_5__1__Impl
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
    // InternalSmallUmlParser.g:2787:1: rule__Enumeration__Group_5__1__Impl : ( ( rule__Enumeration__ValueAssignment_5_1 ) ) ;
    public final void rule__Enumeration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2791:1: ( ( ( rule__Enumeration__ValueAssignment_5_1 ) ) )
            // InternalSmallUmlParser.g:2792:1: ( ( rule__Enumeration__ValueAssignment_5_1 ) )
            {
            // InternalSmallUmlParser.g:2792:1: ( ( rule__Enumeration__ValueAssignment_5_1 ) )
            // InternalSmallUmlParser.g:2793:2: ( rule__Enumeration__ValueAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_5_1()); 
            // InternalSmallUmlParser.g:2794:2: ( rule__Enumeration__ValueAssignment_5_1 )
            // InternalSmallUmlParser.g:2794:3: rule__Enumeration__ValueAssignment_5_1
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
    // InternalSmallUmlParser.g:2803:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2807:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUmlParser.g:2808:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSmallUmlParser.g:2815:1: rule__EInt__Group__0__Impl : ( ( HyphenMinus )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2819:1: ( ( ( HyphenMinus )? ) )
            // InternalSmallUmlParser.g:2820:1: ( ( HyphenMinus )? )
            {
            // InternalSmallUmlParser.g:2820:1: ( ( HyphenMinus )? )
            // InternalSmallUmlParser.g:2821:2: ( HyphenMinus )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUmlParser.g:2822:2: ( HyphenMinus )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUmlParser.g:2822:3: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); 

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
    // InternalSmallUmlParser.g:2830:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2834:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUmlParser.g:2835:2: rule__EInt__Group__1__Impl
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
    // InternalSmallUmlParser.g:2841:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2845:1: ( ( RULE_INT ) )
            // InternalSmallUmlParser.g:2846:1: ( RULE_INT )
            {
            // InternalSmallUmlParser.g:2846:1: ( RULE_INT )
            // InternalSmallUmlParser.g:2847:2: RULE_INT
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


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalSmallUmlParser.g:2857:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2861:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2862:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2862:2: ( ruleEString )
            // InternalSmallUmlParser.g:2863:3: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__MemberAssignment_4"
    // InternalSmallUmlParser.g:2872:1: rule__Package__MemberAssignment_4 : ( ruleNamedElement ) ;
    public final void rule__Package__MemberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2876:1: ( ( ruleNamedElement ) )
            // InternalSmallUmlParser.g:2877:2: ( ruleNamedElement )
            {
            // InternalSmallUmlParser.g:2877:2: ( ruleNamedElement )
            // InternalSmallUmlParser.g:2878:3: ruleNamedElement
            {
             before(grammarAccess.getPackageAccess().getMemberNamedElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getMemberNamedElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__MemberAssignment_4"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalSmallUmlParser.g:2887:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2891:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2892:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2892:2: ( ruleEString )
            // InternalSmallUmlParser.g:2893:3: ruleEString
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


    // $ANTLR start "rule__Class__SuperAssignment_3_1"
    // InternalSmallUmlParser.g:2902:1: rule__Class__SuperAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2906:1: ( ( ( ruleEString ) ) )
            // InternalSmallUmlParser.g:2907:2: ( ( ruleEString ) )
            {
            // InternalSmallUmlParser.g:2907:2: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2908:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0()); 
            // InternalSmallUmlParser.g:2909:3: ( ruleEString )
            // InternalSmallUmlParser.g:2910:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getSuperClassEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperClassEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperAssignment_3_1"


    // $ANTLR start "rule__Class__MethodAssignment_4_1_0"
    // InternalSmallUmlParser.g:2921:1: rule__Class__MethodAssignment_4_1_0 : ( ruleMethod ) ;
    public final void rule__Class__MethodAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2925:1: ( ( ruleMethod ) )
            // InternalSmallUmlParser.g:2926:2: ( ruleMethod )
            {
            // InternalSmallUmlParser.g:2926:2: ( ruleMethod )
            // InternalSmallUmlParser.g:2927:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodAssignment_4_1_0"


    // $ANTLR start "rule__Class__AttributeAssignment_4_1_1"
    // InternalSmallUmlParser.g:2936:1: rule__Class__AttributeAssignment_4_1_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2940:1: ( ( ruleAttribute ) )
            // InternalSmallUmlParser.g:2941:2: ( ruleAttribute )
            {
            // InternalSmallUmlParser.g:2941:2: ( ruleAttribute )
            // InternalSmallUmlParser.g:2942:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributeAssignment_4_1_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSmallUmlParser.g:2951:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2955:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2956:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2956:2: ( ruleEString )
            // InternalSmallUmlParser.g:2957:3: ruleEString
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


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalSmallUmlParser.g:2966:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2970:1: ( ( ruleType ) )
            // InternalSmallUmlParser.g:2971:2: ( ruleType )
            {
            // InternalSmallUmlParser.g:2971:2: ( ruleType )
            // InternalSmallUmlParser.g:2972:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Method__NameAssignment_2"
    // InternalSmallUmlParser.g:2981:1: rule__Method__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2985:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2986:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2986:2: ( ruleEString )
            // InternalSmallUmlParser.g:2987:3: ruleEString
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


    // $ANTLR start "rule__Method__ParameterAssignment_4_0"
    // InternalSmallUmlParser.g:2996:1: rule__Method__ParameterAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3000:1: ( ( ruleParameter ) )
            // InternalSmallUmlParser.g:3001:2: ( ruleParameter )
            {
            // InternalSmallUmlParser.g:3001:2: ( ruleParameter )
            // InternalSmallUmlParser.g:3002:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_4_0"


    // $ANTLR start "rule__Method__ParameterAssignment_4_1_1"
    // InternalSmallUmlParser.g:3011:1: rule__Method__ParameterAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3015:1: ( ( ruleParameter ) )
            // InternalSmallUmlParser.g:3016:2: ( ruleParameter )
            {
            // InternalSmallUmlParser.g:3016:2: ( ruleParameter )
            // InternalSmallUmlParser.g:3017:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_4_1_1"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_6_1"
    // InternalSmallUmlParser.g:3026:1: rule__Method__ReturnTypeAssignment_6_1 : ( ruleType ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3030:1: ( ( ruleType ) )
            // InternalSmallUmlParser.g:3031:2: ( ruleType )
            {
            // InternalSmallUmlParser.g:3031:2: ( ruleType )
            // InternalSmallUmlParser.g:3032:3: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_6_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalSmallUmlParser.g:3041:1: rule__Parameter__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3045:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3046:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3046:2: ( ruleEString )
            // InternalSmallUmlParser.g:3047:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalSmallUmlParser.g:3056:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3060:1: ( ( ruleType ) )
            // InternalSmallUmlParser.g:3061:2: ( ruleType )
            {
            // InternalSmallUmlParser.g:3061:2: ( ruleType )
            // InternalSmallUmlParser.g:3062:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Composition__NameAssignment_0_0"
    // InternalSmallUmlParser.g:3071:1: rule__Composition__NameAssignment_0_0 : ( ruleEString ) ;
    public final void rule__Composition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3075:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3076:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3076:2: ( ruleEString )
            // InternalSmallUmlParser.g:3077:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAssignment_0_0"


    // $ANTLR start "rule__Composition__SourceAssignment_1"
    // InternalSmallUmlParser.g:3086:1: rule__Composition__SourceAssignment_1 : ( ruleRole ) ;
    public final void rule__Composition__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3090:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3091:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3091:2: ( ruleRole )
            // InternalSmallUmlParser.g:3092:3: ruleRole
            {
             before(grammarAccess.getCompositionAccess().getSourceRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getSourceRoleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__SourceAssignment_1"


    // $ANTLR start "rule__Composition__TargetAssignment_3"
    // InternalSmallUmlParser.g:3101:1: rule__Composition__TargetAssignment_3 : ( ruleRole ) ;
    public final void rule__Composition__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3105:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3106:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3106:2: ( ruleRole )
            // InternalSmallUmlParser.g:3107:3: ruleRole
            {
             before(grammarAccess.getCompositionAccess().getTargetRoleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getTargetRoleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__TargetAssignment_3"


    // $ANTLR start "rule__Reference__NameAssignment_0_0"
    // InternalSmallUmlParser.g:3116:1: rule__Reference__NameAssignment_0_0 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3120:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3121:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3121:2: ( ruleEString )
            // InternalSmallUmlParser.g:3122:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_0_0"


    // $ANTLR start "rule__Reference__SourceAssignment_1"
    // InternalSmallUmlParser.g:3131:1: rule__Reference__SourceAssignment_1 : ( ruleRole ) ;
    public final void rule__Reference__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3135:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3136:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3136:2: ( ruleRole )
            // InternalSmallUmlParser.g:3137:3: ruleRole
            {
             before(grammarAccess.getReferenceAccess().getSourceRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSourceRoleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SourceAssignment_1"


    // $ANTLR start "rule__Reference__TargetAssignment_3"
    // InternalSmallUmlParser.g:3146:1: rule__Reference__TargetAssignment_3 : ( ruleRole ) ;
    public final void rule__Reference__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3150:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3151:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3151:2: ( ruleRole )
            // InternalSmallUmlParser.g:3152:3: ruleRole
            {
             before(grammarAccess.getReferenceAccess().getTargetRoleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTargetRoleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TargetAssignment_3"


    // $ANTLR start "rule__Role__NameAssignment_0"
    // InternalSmallUmlParser.g:3161:1: rule__Role__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3165:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3166:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3166:2: ( ruleEString )
            // InternalSmallUmlParser.g:3167:3: ruleEString
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


    // $ANTLR start "rule__Role__ClassAssignment_2"
    // InternalSmallUmlParser.g:3176:1: rule__Role__ClassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3180:1: ( ( ( ruleEString ) ) )
            // InternalSmallUmlParser.g:3181:2: ( ( ruleEString ) )
            {
            // InternalSmallUmlParser.g:3181:2: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3182:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getClassClassCrossReference_2_0()); 
            // InternalSmallUmlParser.g:3183:3: ( ruleEString )
            // InternalSmallUmlParser.g:3184:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getClassClassEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getClassClassEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getClassClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__ClassAssignment_2"


    // $ANTLR start "rule__Role__LowerBoundAssignment_3_2"
    // InternalSmallUmlParser.g:3195:1: rule__Role__LowerBoundAssignment_3_2 : ( ruleEInt ) ;
    public final void rule__Role__LowerBoundAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3199:1: ( ( ruleEInt ) )
            // InternalSmallUmlParser.g:3200:2: ( ruleEInt )
            {
            // InternalSmallUmlParser.g:3200:2: ( ruleEInt )
            // InternalSmallUmlParser.g:3201:3: ruleEInt
            {
             before(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__LowerBoundAssignment_3_2"


    // $ANTLR start "rule__Role__UpperBoundAssignment_3_4"
    // InternalSmallUmlParser.g:3210:1: rule__Role__UpperBoundAssignment_3_4 : ( ruleEInt ) ;
    public final void rule__Role__UpperBoundAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3214:1: ( ( ruleEInt ) )
            // InternalSmallUmlParser.g:3215:2: ( ruleEInt )
            {
            // InternalSmallUmlParser.g:3215:2: ( ruleEInt )
            // InternalSmallUmlParser.g:3216:3: ruleEInt
            {
             before(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__UpperBoundAssignment_3_4"


    // $ANTLR start "rule__Enumeration__ValueAssignment_4"
    // InternalSmallUmlParser.g:3225:1: rule__Enumeration__ValueAssignment_4 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3229:1: ( ( ruleString0 ) )
            // InternalSmallUmlParser.g:3230:2: ( ruleString0 )
            {
            // InternalSmallUmlParser.g:3230:2: ( ruleString0 )
            // InternalSmallUmlParser.g:3231:3: ruleString0
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
    // InternalSmallUmlParser.g:3240:1: rule__Enumeration__ValueAssignment_5_1 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3244:1: ( ( ruleString0 ) )
            // InternalSmallUmlParser.g:3245:2: ( ruleString0 )
            {
            // InternalSmallUmlParser.g:3245:2: ( ruleString0 )
            // InternalSmallUmlParser.g:3246:3: ruleString0
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\51\uffff";
    static final String dfa_2s = "\23\uffff\1\30\25\uffff";
    static final String dfa_3s = "\1\7\1\uffff\1\34\2\20\1\34\1\uffff\2\20\1\4\2\21\2\uffff\2\20\1\34\1\uffff\1\26\1\7\2\21\1\24\3\uffff\1\26\1\14\1\35\1\23\2\24\1\35\1\23\1\35\1\27\1\24\1\21\1\35\1\27\1\21";
    static final String dfa_4s = "\1\36\1\uffff\1\36\2\25\1\36\1\uffff\2\25\1\36\2\23\2\uffff\2\20\1\36\1\uffff\1\26\1\36\2\23\1\35\3\uffff\1\26\1\15\1\35\1\23\3\35\1\23\1\35\1\27\1\35\1\21\1\35\1\27\1\21";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\10\5\uffff\1\3\1\2\3\uffff\1\4\5\uffff\1\7\1\5\1\6\17\uffff";
    static final String dfa_6s = "\51\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\2\uffff\1\1\5\uffff\1\5\1\uffff\1\2\11\uffff\1\4\1\uffff\1\3",
            "",
            "\1\10\1\uffff\1\7",
            "\1\5\4\uffff\1\11",
            "\1\5\4\uffff\1\11",
            "\1\13\1\uffff\1\12",
            "",
            "\1\14\4\uffff\1\15",
            "\1\14\4\uffff\1\15",
            "\3\21\2\uffff\1\21\4\uffff\2\21\1\20\13\uffff\1\17\1\uffff\1\16",
            "\1\23\1\uffff\1\22",
            "\1\23\1\uffff\1\22",
            "",
            "",
            "\1\20",
            "\1\20",
            "\1\25\1\uffff\1\24",
            "",
            "\1\26",
            "\1\30\2\uffff\1\30\1\uffff\1\27\1\31\2\uffff\1\30\1\uffff\1\30\10\uffff\2\30\1\uffff\1\30",
            "\1\33\1\uffff\1\32",
            "\1\33\1\uffff\1\32",
            "\1\34\10\uffff\1\35",
            "",
            "",
            "",
            "\1\36",
            "\1\27\1\31",
            "\1\35",
            "\1\37",
            "\1\40\10\uffff\1\41",
            "\1\42\10\uffff\1\43",
            "\1\41",
            "\1\44",
            "\1\43",
            "\1\45",
            "\1\46\10\uffff\1\47",
            "\1\23",
            "\1\47",
            "\1\50",
            "\1\33"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "526:1: rule__NamedElement__Alternatives : ( ( ruleClass ) | ( ruleAttribute ) | ( ruleMethod ) | ( ruleParameter ) | ( ruleRole ) | ( ruleComposition ) | ( ruleReference ) | ( rulePackage ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000058050480L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000050050482L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C270L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000050020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000000L});

}
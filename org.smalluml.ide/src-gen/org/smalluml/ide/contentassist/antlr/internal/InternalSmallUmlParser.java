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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "UnlimitedNatural", "Integer", "Package", "Extends", "String", "Class", "HyphenMinusHyphenMinusHyphenMinusGreaterThanSign", "LessThanSignGreaterThanSignHyphenMinusHyphenMinus", "Bool", "Enum", "Real", "LeftParenthesis", "RightParenthesis", "PlusSign", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=13;
    public static final int RULE_END=24;
    public static final int RULE_BEGIN=23;
    public static final int RULE_STRING=27;
    public static final int String=8;
    public static final int RULE_SL_COMMENT=29;
    public static final int UnlimitedNatural=4;
    public static final int Comma=18;
    public static final int HyphenMinus=19;
    public static final int LeftParenthesis=15;
    public static final int Bool=12;
    public static final int LessThanSignGreaterThanSignHyphenMinusHyphenMinus=11;
    public static final int Real=14;
    public static final int Colon=20;
    public static final int Extends=7;
    public static final int EOF=-1;
    public static final int RightSquareBracket=22;
    public static final int RULE_ID=25;
    public static final int RULE_WS=30;
    public static final int RightParenthesis=16;
    public static final int RULE_ANY_OTHER=31;
    public static final int HyphenMinusHyphenMinusHyphenMinusGreaterThanSign=10;
    public static final int Integer=5;
    public static final int PlusSign=17;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=28;
    public static final int Class=9;
    public static final int LeftSquareBracket=21;
    public static final int Package=6;

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
    		tokenNameToValue.put("HyphenMinusHyphenMinusHyphenMinusGreaterThanSign", "'--->'");
    		tokenNameToValue.put("LessThanSignGreaterThanSignHyphenMinusHyphenMinus", "'<>--'");
    		tokenNameToValue.put("Bool", "'Bool'");
    		tokenNameToValue.put("Enum", "'Enum'");
    		tokenNameToValue.put("Real", "'Real'");
    		tokenNameToValue.put("Class", "'Class'");
    		tokenNameToValue.put("String", "'String'");
    		tokenNameToValue.put("Integer", "'Integer'");
    		tokenNameToValue.put("Package", "'Package'");
    		tokenNameToValue.put("Extends", "'extends'");
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
    // InternalSmallUmlParser.g:74:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:75:1: ( rulePackage EOF )
            // InternalSmallUmlParser.g:76:1: rulePackage EOF
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
    // InternalSmallUmlParser.g:83:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:87:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSmallUmlParser.g:88:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSmallUmlParser.g:88:2: ( ( rule__Package__Group__0 ) )
            // InternalSmallUmlParser.g:89:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSmallUmlParser.g:90:3: ( rule__Package__Group__0 )
            // InternalSmallUmlParser.g:90:4: rule__Package__Group__0
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
    // InternalSmallUmlParser.g:99:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:100:1: ( ruleNamedElement EOF )
            // InternalSmallUmlParser.g:101:1: ruleNamedElement EOF
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
    // InternalSmallUmlParser.g:108:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:112:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // InternalSmallUmlParser.g:113:2: ( ( rule__NamedElement__Alternatives ) )
            {
            // InternalSmallUmlParser.g:113:2: ( ( rule__NamedElement__Alternatives ) )
            // InternalSmallUmlParser.g:114:3: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // InternalSmallUmlParser.g:115:3: ( rule__NamedElement__Alternatives )
            // InternalSmallUmlParser.g:115:4: rule__NamedElement__Alternatives
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
    // InternalSmallUmlParser.g:124:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:125:1: ( ruleType EOF )
            // InternalSmallUmlParser.g:126:1: ruleType EOF
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
    // InternalSmallUmlParser.g:133:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:137:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmallUmlParser.g:138:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmallUmlParser.g:138:2: ( ( rule__Type__Alternatives ) )
            // InternalSmallUmlParser.g:139:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmallUmlParser.g:140:3: ( rule__Type__Alternatives )
            // InternalSmallUmlParser.g:140:4: rule__Type__Alternatives
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
    // InternalSmallUmlParser.g:149:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:150:1: ( ruleEString EOF )
            // InternalSmallUmlParser.g:151:1: ruleEString EOF
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
    // InternalSmallUmlParser.g:158:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:162:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUmlParser.g:163:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUmlParser.g:163:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUmlParser.g:164:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUmlParser.g:165:3: ( rule__EString__Alternatives )
            // InternalSmallUmlParser.g:165:4: rule__EString__Alternatives
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
    // InternalSmallUmlParser.g:174:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:175:1: ( ruleClass EOF )
            // InternalSmallUmlParser.g:176:1: ruleClass EOF
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
    // InternalSmallUmlParser.g:183:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:187:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUmlParser.g:188:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUmlParser.g:188:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUmlParser.g:189:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUmlParser.g:190:3: ( rule__Class__Group__0 )
            // InternalSmallUmlParser.g:190:4: rule__Class__Group__0
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
    // InternalSmallUmlParser.g:199:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:200:1: ( ruleAttribute EOF )
            // InternalSmallUmlParser.g:201:1: ruleAttribute EOF
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
    // InternalSmallUmlParser.g:208:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:212:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUmlParser.g:213:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUmlParser.g:213:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUmlParser.g:214:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUmlParser.g:215:3: ( rule__Attribute__Group__0 )
            // InternalSmallUmlParser.g:215:4: rule__Attribute__Group__0
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
    // InternalSmallUmlParser.g:224:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:225:1: ( ruleMethod EOF )
            // InternalSmallUmlParser.g:226:1: ruleMethod EOF
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
    // InternalSmallUmlParser.g:233:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:237:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSmallUmlParser.g:238:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSmallUmlParser.g:238:2: ( ( rule__Method__Group__0 ) )
            // InternalSmallUmlParser.g:239:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSmallUmlParser.g:240:3: ( rule__Method__Group__0 )
            // InternalSmallUmlParser.g:240:4: rule__Method__Group__0
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
    // InternalSmallUmlParser.g:249:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:250:1: ( ruleParameter EOF )
            // InternalSmallUmlParser.g:251:1: ruleParameter EOF
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
    // InternalSmallUmlParser.g:258:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:262:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSmallUmlParser.g:263:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSmallUmlParser.g:263:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSmallUmlParser.g:264:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSmallUmlParser.g:265:3: ( rule__Parameter__Group__0 )
            // InternalSmallUmlParser.g:265:4: rule__Parameter__Group__0
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
    // InternalSmallUmlParser.g:274:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:275:1: ( ruleComposition EOF )
            // InternalSmallUmlParser.g:276:1: ruleComposition EOF
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
    // InternalSmallUmlParser.g:283:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:287:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalSmallUmlParser.g:288:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalSmallUmlParser.g:288:2: ( ( rule__Composition__Group__0 ) )
            // InternalSmallUmlParser.g:289:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalSmallUmlParser.g:290:3: ( rule__Composition__Group__0 )
            // InternalSmallUmlParser.g:290:4: rule__Composition__Group__0
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
    // InternalSmallUmlParser.g:299:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:300:1: ( ruleReference EOF )
            // InternalSmallUmlParser.g:301:1: ruleReference EOF
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
    // InternalSmallUmlParser.g:308:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:312:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalSmallUmlParser.g:313:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalSmallUmlParser.g:313:2: ( ( rule__Reference__Group__0 ) )
            // InternalSmallUmlParser.g:314:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalSmallUmlParser.g:315:3: ( rule__Reference__Group__0 )
            // InternalSmallUmlParser.g:315:4: rule__Reference__Group__0
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
    // InternalSmallUmlParser.g:324:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:325:1: ( ruleRole EOF )
            // InternalSmallUmlParser.g:326:1: ruleRole EOF
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
    // InternalSmallUmlParser.g:333:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:337:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSmallUmlParser.g:338:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSmallUmlParser.g:338:2: ( ( rule__Role__Group__0 ) )
            // InternalSmallUmlParser.g:339:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSmallUmlParser.g:340:3: ( rule__Role__Group__0 )
            // InternalSmallUmlParser.g:340:4: rule__Role__Group__0
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
    // InternalSmallUmlParser.g:349:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:350:1: ( ruleString0 EOF )
            // InternalSmallUmlParser.g:351:1: ruleString0 EOF
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
    // InternalSmallUmlParser.g:358:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:362:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSmallUmlParser.g:363:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSmallUmlParser.g:363:2: ( ( rule__String0__Group__0 ) )
            // InternalSmallUmlParser.g:364:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSmallUmlParser.g:365:3: ( rule__String0__Group__0 )
            // InternalSmallUmlParser.g:365:4: rule__String0__Group__0
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
    // InternalSmallUmlParser.g:374:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:375:1: ( ruleInteger EOF )
            // InternalSmallUmlParser.g:376:1: ruleInteger EOF
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
    // InternalSmallUmlParser.g:383:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:387:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSmallUmlParser.g:388:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSmallUmlParser.g:388:2: ( ( rule__Integer__Group__0 ) )
            // InternalSmallUmlParser.g:389:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSmallUmlParser.g:390:3: ( rule__Integer__Group__0 )
            // InternalSmallUmlParser.g:390:4: rule__Integer__Group__0
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
    // InternalSmallUmlParser.g:399:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:400:1: ( ruleBool EOF )
            // InternalSmallUmlParser.g:401:1: ruleBool EOF
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
    // InternalSmallUmlParser.g:408:1: ruleBool : ( ( rule__Bool__Group__0 ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:412:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalSmallUmlParser.g:413:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalSmallUmlParser.g:413:2: ( ( rule__Bool__Group__0 ) )
            // InternalSmallUmlParser.g:414:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalSmallUmlParser.g:415:3: ( rule__Bool__Group__0 )
            // InternalSmallUmlParser.g:415:4: rule__Bool__Group__0
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
    // InternalSmallUmlParser.g:424:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:425:1: ( ruleReal EOF )
            // InternalSmallUmlParser.g:426:1: ruleReal EOF
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
    // InternalSmallUmlParser.g:433:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:437:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalSmallUmlParser.g:438:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalSmallUmlParser.g:438:2: ( ( rule__Real__Group__0 ) )
            // InternalSmallUmlParser.g:439:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalSmallUmlParser.g:440:3: ( rule__Real__Group__0 )
            // InternalSmallUmlParser.g:440:4: rule__Real__Group__0
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
    // InternalSmallUmlParser.g:449:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:450:1: ( ruleUnlimitedNatural EOF )
            // InternalSmallUmlParser.g:451:1: ruleUnlimitedNatural EOF
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
    // InternalSmallUmlParser.g:458:1: ruleUnlimitedNatural : ( ( rule__UnlimitedNatural__Group__0 ) ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:462:2: ( ( ( rule__UnlimitedNatural__Group__0 ) ) )
            // InternalSmallUmlParser.g:463:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            {
            // InternalSmallUmlParser.g:463:2: ( ( rule__UnlimitedNatural__Group__0 ) )
            // InternalSmallUmlParser.g:464:3: ( rule__UnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getGroup()); 
            // InternalSmallUmlParser.g:465:3: ( rule__UnlimitedNatural__Group__0 )
            // InternalSmallUmlParser.g:465:4: rule__UnlimitedNatural__Group__0
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
    // InternalSmallUmlParser.g:474:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:475:1: ( ruleEnumeration EOF )
            // InternalSmallUmlParser.g:476:1: ruleEnumeration EOF
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
    // InternalSmallUmlParser.g:483:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:487:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUmlParser.g:488:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUmlParser.g:488:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUmlParser.g:489:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUmlParser.g:490:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUmlParser.g:490:4: rule__Enumeration__Group__0
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
    // InternalSmallUmlParser.g:499:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUmlParser.g:500:1: ( ruleEInt EOF )
            // InternalSmallUmlParser.g:501:1: ruleEInt EOF
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
    // InternalSmallUmlParser.g:508:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:512:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUmlParser.g:513:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUmlParser.g:513:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUmlParser.g:514:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUmlParser.g:515:3: ( rule__EInt__Group__0 )
            // InternalSmallUmlParser.g:515:4: rule__EInt__Group__0
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
    // InternalSmallUmlParser.g:523:1: rule__NamedElement__Alternatives : ( ( ruleClass ) | ( ruleAttribute ) | ( ruleMethod ) | ( ruleParameter ) | ( ruleRole ) | ( ruleComposition ) | ( ruleReference ) | ( rulePackage ) | ( ruleEnumeration ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:527:1: ( ( ruleClass ) | ( ruleAttribute ) | ( ruleMethod ) | ( ruleParameter ) | ( ruleRole ) | ( ruleComposition ) | ( ruleReference ) | ( rulePackage ) | ( ruleEnumeration ) )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSmallUmlParser.g:528:2: ( ruleClass )
                    {
                    // InternalSmallUmlParser.g:528:2: ( ruleClass )
                    // InternalSmallUmlParser.g:529:3: ruleClass
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
                    // InternalSmallUmlParser.g:534:2: ( ruleAttribute )
                    {
                    // InternalSmallUmlParser.g:534:2: ( ruleAttribute )
                    // InternalSmallUmlParser.g:535:3: ruleAttribute
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
                    // InternalSmallUmlParser.g:540:2: ( ruleMethod )
                    {
                    // InternalSmallUmlParser.g:540:2: ( ruleMethod )
                    // InternalSmallUmlParser.g:541:3: ruleMethod
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
                    // InternalSmallUmlParser.g:546:2: ( ruleParameter )
                    {
                    // InternalSmallUmlParser.g:546:2: ( ruleParameter )
                    // InternalSmallUmlParser.g:547:3: ruleParameter
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
                    // InternalSmallUmlParser.g:552:2: ( ruleRole )
                    {
                    // InternalSmallUmlParser.g:552:2: ( ruleRole )
                    // InternalSmallUmlParser.g:553:3: ruleRole
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
                    // InternalSmallUmlParser.g:558:2: ( ruleComposition )
                    {
                    // InternalSmallUmlParser.g:558:2: ( ruleComposition )
                    // InternalSmallUmlParser.g:559:3: ruleComposition
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
                    // InternalSmallUmlParser.g:564:2: ( ruleReference )
                    {
                    // InternalSmallUmlParser.g:564:2: ( ruleReference )
                    // InternalSmallUmlParser.g:565:3: ruleReference
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
                    // InternalSmallUmlParser.g:570:2: ( rulePackage )
                    {
                    // InternalSmallUmlParser.g:570:2: ( rulePackage )
                    // InternalSmallUmlParser.g:571:3: rulePackage
                    {
                     before(grammarAccess.getNamedElementAccess().getPackageParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getPackageParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSmallUmlParser.g:576:2: ( ruleEnumeration )
                    {
                    // InternalSmallUmlParser.g:576:2: ( ruleEnumeration )
                    // InternalSmallUmlParser.g:577:3: ruleEnumeration
                    {
                     before(grammarAccess.getNamedElementAccess().getEnumerationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getEnumerationParserRuleCall_8()); 

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
    // InternalSmallUmlParser.g:586:1: rule__Type__Alternatives : ( ( ruleString0 ) | ( ruleInteger ) | ( ruleBool ) | ( ruleReal ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:590:1: ( ( ruleString0 ) | ( ruleInteger ) | ( ruleBool ) | ( ruleReal ) | ( ruleUnlimitedNatural ) | ( ruleEnumeration ) )
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
            case Enum:
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
                    // InternalSmallUmlParser.g:591:2: ( ruleString0 )
                    {
                    // InternalSmallUmlParser.g:591:2: ( ruleString0 )
                    // InternalSmallUmlParser.g:592:3: ruleString0
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
                    // InternalSmallUmlParser.g:597:2: ( ruleInteger )
                    {
                    // InternalSmallUmlParser.g:597:2: ( ruleInteger )
                    // InternalSmallUmlParser.g:598:3: ruleInteger
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
                    // InternalSmallUmlParser.g:603:2: ( ruleBool )
                    {
                    // InternalSmallUmlParser.g:603:2: ( ruleBool )
                    // InternalSmallUmlParser.g:604:3: ruleBool
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
                    // InternalSmallUmlParser.g:609:2: ( ruleReal )
                    {
                    // InternalSmallUmlParser.g:609:2: ( ruleReal )
                    // InternalSmallUmlParser.g:610:3: ruleReal
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
                    // InternalSmallUmlParser.g:615:2: ( ruleUnlimitedNatural )
                    {
                    // InternalSmallUmlParser.g:615:2: ( ruleUnlimitedNatural )
                    // InternalSmallUmlParser.g:616:3: ruleUnlimitedNatural
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
                    // InternalSmallUmlParser.g:621:2: ( ruleEnumeration )
                    {
                    // InternalSmallUmlParser.g:621:2: ( ruleEnumeration )
                    // InternalSmallUmlParser.g:622:3: ruleEnumeration
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
    // InternalSmallUmlParser.g:631:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:635:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmallUmlParser.g:636:2: ( RULE_STRING )
                    {
                    // InternalSmallUmlParser.g:636:2: ( RULE_STRING )
                    // InternalSmallUmlParser.g:637:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:642:2: ( RULE_ID )
                    {
                    // InternalSmallUmlParser.g:642:2: ( RULE_ID )
                    // InternalSmallUmlParser.g:643:3: RULE_ID
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
    // InternalSmallUmlParser.g:652:1: rule__Class__Alternatives_4_1 : ( ( ( rule__Class__MethodAssignment_4_1_0 ) ) | ( ( rule__Class__AttributeAssignment_4_1_1 ) ) );
    public final void rule__Class__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:656:1: ( ( ( rule__Class__MethodAssignment_4_1_0 ) ) | ( ( rule__Class__AttributeAssignment_4_1_1 ) ) )
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
                    // InternalSmallUmlParser.g:657:2: ( ( rule__Class__MethodAssignment_4_1_0 ) )
                    {
                    // InternalSmallUmlParser.g:657:2: ( ( rule__Class__MethodAssignment_4_1_0 ) )
                    // InternalSmallUmlParser.g:658:3: ( rule__Class__MethodAssignment_4_1_0 )
                    {
                     before(grammarAccess.getClassAccess().getMethodAssignment_4_1_0()); 
                    // InternalSmallUmlParser.g:659:3: ( rule__Class__MethodAssignment_4_1_0 )
                    // InternalSmallUmlParser.g:659:4: rule__Class__MethodAssignment_4_1_0
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
                    // InternalSmallUmlParser.g:663:2: ( ( rule__Class__AttributeAssignment_4_1_1 ) )
                    {
                    // InternalSmallUmlParser.g:663:2: ( ( rule__Class__AttributeAssignment_4_1_1 ) )
                    // InternalSmallUmlParser.g:664:3: ( rule__Class__AttributeAssignment_4_1_1 )
                    {
                     before(grammarAccess.getClassAccess().getAttributeAssignment_4_1_1()); 
                    // InternalSmallUmlParser.g:665:3: ( rule__Class__AttributeAssignment_4_1_1 )
                    // InternalSmallUmlParser.g:665:4: rule__Class__AttributeAssignment_4_1_1
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
    // InternalSmallUmlParser.g:673:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:677:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUmlParser.g:678:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalSmallUmlParser.g:685:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:689:1: ( ( () ) )
            // InternalSmallUmlParser.g:690:1: ( () )
            {
            // InternalSmallUmlParser.g:690:1: ( () )
            // InternalSmallUmlParser.g:691:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalSmallUmlParser.g:692:2: ()
            // InternalSmallUmlParser.g:692:3: 
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
    // InternalSmallUmlParser.g:700:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:704:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSmallUmlParser.g:705:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalSmallUmlParser.g:712:1: rule__Package__Group__1__Impl : ( Package ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:716:1: ( ( Package ) )
            // InternalSmallUmlParser.g:717:1: ( Package )
            {
            // InternalSmallUmlParser.g:717:1: ( Package )
            // InternalSmallUmlParser.g:718:2: Package
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
    // InternalSmallUmlParser.g:727:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:731:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSmallUmlParser.g:732:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalSmallUmlParser.g:739:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:743:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:744:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:744:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:745:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:746:2: ( rule__Package__NameAssignment_2 )
            // InternalSmallUmlParser.g:746:3: rule__Package__NameAssignment_2
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
    // InternalSmallUmlParser.g:754:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:758:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSmallUmlParser.g:759:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalSmallUmlParser.g:766:1: rule__Package__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:770:1: ( ( RULE_BEGIN ) )
            // InternalSmallUmlParser.g:771:1: ( RULE_BEGIN )
            {
            // InternalSmallUmlParser.g:771:1: ( RULE_BEGIN )
            // InternalSmallUmlParser.g:772:2: RULE_BEGIN
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
    // InternalSmallUmlParser.g:781:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:785:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalSmallUmlParser.g:786:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalSmallUmlParser.g:793:1: rule__Package__Group__4__Impl : ( ( rule__Package__MemberAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:797:1: ( ( ( rule__Package__MemberAssignment_4 )* ) )
            // InternalSmallUmlParser.g:798:1: ( ( rule__Package__MemberAssignment_4 )* )
            {
            // InternalSmallUmlParser.g:798:1: ( ( rule__Package__MemberAssignment_4 )* )
            // InternalSmallUmlParser.g:799:2: ( rule__Package__MemberAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getMemberAssignment_4()); 
            // InternalSmallUmlParser.g:800:2: ( rule__Package__MemberAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Package||LA5_0==Class||LA5_0==Enum||LA5_0==LeftParenthesis||LA5_0==PlusSign||LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUmlParser.g:800:3: rule__Package__MemberAssignment_4
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
    // InternalSmallUmlParser.g:808:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:812:1: ( rule__Package__Group__5__Impl )
            // InternalSmallUmlParser.g:813:2: rule__Package__Group__5__Impl
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
    // InternalSmallUmlParser.g:819:1: rule__Package__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:823:1: ( ( RULE_END ) )
            // InternalSmallUmlParser.g:824:1: ( RULE_END )
            {
            // InternalSmallUmlParser.g:824:1: ( RULE_END )
            // InternalSmallUmlParser.g:825:2: RULE_END
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
    // InternalSmallUmlParser.g:835:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:839:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUmlParser.g:840:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalSmallUmlParser.g:847:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:851:1: ( ( () ) )
            // InternalSmallUmlParser.g:852:1: ( () )
            {
            // InternalSmallUmlParser.g:852:1: ( () )
            // InternalSmallUmlParser.g:853:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalSmallUmlParser.g:854:2: ()
            // InternalSmallUmlParser.g:854:3: 
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
    // InternalSmallUmlParser.g:862:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:866:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUmlParser.g:867:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalSmallUmlParser.g:874:1: rule__Class__Group__1__Impl : ( Class ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:878:1: ( ( Class ) )
            // InternalSmallUmlParser.g:879:1: ( Class )
            {
            // InternalSmallUmlParser.g:879:1: ( Class )
            // InternalSmallUmlParser.g:880:2: Class
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
    // InternalSmallUmlParser.g:889:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:893:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUmlParser.g:894:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalSmallUmlParser.g:901:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:905:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:906:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:906:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:907:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:908:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUmlParser.g:908:3: rule__Class__NameAssignment_2
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
    // InternalSmallUmlParser.g:916:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:920:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUmlParser.g:921:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalSmallUmlParser.g:928:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:932:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalSmallUmlParser.g:933:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalSmallUmlParser.g:933:1: ( ( rule__Class__Group_3__0 )? )
            // InternalSmallUmlParser.g:934:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalSmallUmlParser.g:935:2: ( rule__Class__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Extends) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUmlParser.g:935:3: rule__Class__Group_3__0
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
    // InternalSmallUmlParser.g:943:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:947:1: ( rule__Class__Group__4__Impl )
            // InternalSmallUmlParser.g:948:2: rule__Class__Group__4__Impl
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
    // InternalSmallUmlParser.g:954:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:958:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSmallUmlParser.g:959:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSmallUmlParser.g:959:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSmallUmlParser.g:960:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSmallUmlParser.g:961:2: ( rule__Class__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEGIN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUmlParser.g:961:3: rule__Class__Group_4__0
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
    // InternalSmallUmlParser.g:970:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:974:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalSmallUmlParser.g:975:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
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
    // InternalSmallUmlParser.g:982:1: rule__Class__Group_3__0__Impl : ( Extends ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:986:1: ( ( Extends ) )
            // InternalSmallUmlParser.g:987:1: ( Extends )
            {
            // InternalSmallUmlParser.g:987:1: ( Extends )
            // InternalSmallUmlParser.g:988:2: Extends
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
    // InternalSmallUmlParser.g:997:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1001:1: ( rule__Class__Group_3__1__Impl )
            // InternalSmallUmlParser.g:1002:2: rule__Class__Group_3__1__Impl
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
    // InternalSmallUmlParser.g:1008:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__SuperAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1012:1: ( ( ( rule__Class__SuperAssignment_3_1 ) ) )
            // InternalSmallUmlParser.g:1013:1: ( ( rule__Class__SuperAssignment_3_1 ) )
            {
            // InternalSmallUmlParser.g:1013:1: ( ( rule__Class__SuperAssignment_3_1 ) )
            // InternalSmallUmlParser.g:1014:2: ( rule__Class__SuperAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getSuperAssignment_3_1()); 
            // InternalSmallUmlParser.g:1015:2: ( rule__Class__SuperAssignment_3_1 )
            // InternalSmallUmlParser.g:1015:3: rule__Class__SuperAssignment_3_1
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
    // InternalSmallUmlParser.g:1024:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1028:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSmallUmlParser.g:1029:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
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
    // InternalSmallUmlParser.g:1036:1: rule__Class__Group_4__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1040:1: ( ( RULE_BEGIN ) )
            // InternalSmallUmlParser.g:1041:1: ( RULE_BEGIN )
            {
            // InternalSmallUmlParser.g:1041:1: ( RULE_BEGIN )
            // InternalSmallUmlParser.g:1042:2: RULE_BEGIN
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
    // InternalSmallUmlParser.g:1051:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1055:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalSmallUmlParser.g:1056:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
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
    // InternalSmallUmlParser.g:1063:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__Alternatives_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1067:1: ( ( ( rule__Class__Alternatives_4_1 )* ) )
            // InternalSmallUmlParser.g:1068:1: ( ( rule__Class__Alternatives_4_1 )* )
            {
            // InternalSmallUmlParser.g:1068:1: ( ( rule__Class__Alternatives_4_1 )* )
            // InternalSmallUmlParser.g:1069:2: ( rule__Class__Alternatives_4_1 )*
            {
             before(grammarAccess.getClassAccess().getAlternatives_4_1()); 
            // InternalSmallUmlParser.g:1070:2: ( rule__Class__Alternatives_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PlusSign) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmallUmlParser.g:1070:3: rule__Class__Alternatives_4_1
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
    // InternalSmallUmlParser.g:1078:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1082:1: ( rule__Class__Group_4__2__Impl )
            // InternalSmallUmlParser.g:1083:2: rule__Class__Group_4__2__Impl
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
    // InternalSmallUmlParser.g:1089:1: rule__Class__Group_4__2__Impl : ( RULE_END ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1093:1: ( ( RULE_END ) )
            // InternalSmallUmlParser.g:1094:1: ( RULE_END )
            {
            // InternalSmallUmlParser.g:1094:1: ( RULE_END )
            // InternalSmallUmlParser.g:1095:2: RULE_END
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
    // InternalSmallUmlParser.g:1105:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1109:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUmlParser.g:1110:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSmallUmlParser.g:1117:1: rule__Attribute__Group__0__Impl : ( PlusSign ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1121:1: ( ( PlusSign ) )
            // InternalSmallUmlParser.g:1122:1: ( PlusSign )
            {
            // InternalSmallUmlParser.g:1122:1: ( PlusSign )
            // InternalSmallUmlParser.g:1123:2: PlusSign
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
    // InternalSmallUmlParser.g:1132:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1136:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUmlParser.g:1137:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSmallUmlParser.g:1144:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1148:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUmlParser.g:1149:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUmlParser.g:1149:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUmlParser.g:1150:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUmlParser.g:1151:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUmlParser.g:1151:3: rule__Attribute__NameAssignment_1
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
    // InternalSmallUmlParser.g:1159:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1163:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUmlParser.g:1164:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalSmallUmlParser.g:1171:1: rule__Attribute__Group__2__Impl : ( Colon ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1175:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1176:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1176:1: ( Colon )
            // InternalSmallUmlParser.g:1177:2: Colon
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
    // InternalSmallUmlParser.g:1186:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1190:1: ( rule__Attribute__Group__3__Impl )
            // InternalSmallUmlParser.g:1191:2: rule__Attribute__Group__3__Impl
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
    // InternalSmallUmlParser.g:1197:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1201:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalSmallUmlParser.g:1202:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalSmallUmlParser.g:1202:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalSmallUmlParser.g:1203:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalSmallUmlParser.g:1204:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalSmallUmlParser.g:1204:3: rule__Attribute__TypeAssignment_3
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
    // InternalSmallUmlParser.g:1213:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1217:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSmallUmlParser.g:1218:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalSmallUmlParser.g:1225:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1229:1: ( ( () ) )
            // InternalSmallUmlParser.g:1230:1: ( () )
            {
            // InternalSmallUmlParser.g:1230:1: ( () )
            // InternalSmallUmlParser.g:1231:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalSmallUmlParser.g:1232:2: ()
            // InternalSmallUmlParser.g:1232:3: 
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
    // InternalSmallUmlParser.g:1240:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1244:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSmallUmlParser.g:1245:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalSmallUmlParser.g:1252:1: rule__Method__Group__1__Impl : ( PlusSign ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1256:1: ( ( PlusSign ) )
            // InternalSmallUmlParser.g:1257:1: ( PlusSign )
            {
            // InternalSmallUmlParser.g:1257:1: ( PlusSign )
            // InternalSmallUmlParser.g:1258:2: PlusSign
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
    // InternalSmallUmlParser.g:1267:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1271:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSmallUmlParser.g:1272:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalSmallUmlParser.g:1279:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1283:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:1284:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:1284:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:1285:2: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:1286:2: ( rule__Method__NameAssignment_2 )
            // InternalSmallUmlParser.g:1286:3: rule__Method__NameAssignment_2
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
    // InternalSmallUmlParser.g:1294:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1298:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSmallUmlParser.g:1299:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalSmallUmlParser.g:1306:1: rule__Method__Group__3__Impl : ( LeftParenthesis ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1310:1: ( ( LeftParenthesis ) )
            // InternalSmallUmlParser.g:1311:1: ( LeftParenthesis )
            {
            // InternalSmallUmlParser.g:1311:1: ( LeftParenthesis )
            // InternalSmallUmlParser.g:1312:2: LeftParenthesis
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
    // InternalSmallUmlParser.g:1321:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1325:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSmallUmlParser.g:1326:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalSmallUmlParser.g:1333:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1337:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalSmallUmlParser.g:1338:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalSmallUmlParser.g:1338:1: ( ( rule__Method__Group_4__0 )? )
            // InternalSmallUmlParser.g:1339:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSmallUmlParser.g:1340:2: ( rule__Method__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUmlParser.g:1340:3: rule__Method__Group_4__0
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
    // InternalSmallUmlParser.g:1348:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1352:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSmallUmlParser.g:1353:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalSmallUmlParser.g:1360:1: rule__Method__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1364:1: ( ( RightParenthesis ) )
            // InternalSmallUmlParser.g:1365:1: ( RightParenthesis )
            {
            // InternalSmallUmlParser.g:1365:1: ( RightParenthesis )
            // InternalSmallUmlParser.g:1366:2: RightParenthesis
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
    // InternalSmallUmlParser.g:1375:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1379:1: ( rule__Method__Group__6__Impl )
            // InternalSmallUmlParser.g:1380:2: rule__Method__Group__6__Impl
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
    // InternalSmallUmlParser.g:1386:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1390:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalSmallUmlParser.g:1391:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalSmallUmlParser.g:1391:1: ( ( rule__Method__Group_6__0 )? )
            // InternalSmallUmlParser.g:1392:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalSmallUmlParser.g:1393:2: ( rule__Method__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Colon) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUmlParser.g:1393:3: rule__Method__Group_6__0
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
    // InternalSmallUmlParser.g:1402:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1406:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSmallUmlParser.g:1407:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
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
    // InternalSmallUmlParser.g:1414:1: rule__Method__Group_4__0__Impl : ( ( rule__Method__ParameterAssignment_4_0 ) ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1418:1: ( ( ( rule__Method__ParameterAssignment_4_0 ) ) )
            // InternalSmallUmlParser.g:1419:1: ( ( rule__Method__ParameterAssignment_4_0 ) )
            {
            // InternalSmallUmlParser.g:1419:1: ( ( rule__Method__ParameterAssignment_4_0 ) )
            // InternalSmallUmlParser.g:1420:2: ( rule__Method__ParameterAssignment_4_0 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_0()); 
            // InternalSmallUmlParser.g:1421:2: ( rule__Method__ParameterAssignment_4_0 )
            // InternalSmallUmlParser.g:1421:3: rule__Method__ParameterAssignment_4_0
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
    // InternalSmallUmlParser.g:1429:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1433:1: ( rule__Method__Group_4__1__Impl )
            // InternalSmallUmlParser.g:1434:2: rule__Method__Group_4__1__Impl
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
    // InternalSmallUmlParser.g:1440:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__Group_4_1__0 )* ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1444:1: ( ( ( rule__Method__Group_4_1__0 )* ) )
            // InternalSmallUmlParser.g:1445:1: ( ( rule__Method__Group_4_1__0 )* )
            {
            // InternalSmallUmlParser.g:1445:1: ( ( rule__Method__Group_4_1__0 )* )
            // InternalSmallUmlParser.g:1446:2: ( rule__Method__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4_1()); 
            // InternalSmallUmlParser.g:1447:2: ( rule__Method__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallUmlParser.g:1447:3: rule__Method__Group_4_1__0
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
    // InternalSmallUmlParser.g:1456:1: rule__Method__Group_4_1__0 : rule__Method__Group_4_1__0__Impl rule__Method__Group_4_1__1 ;
    public final void rule__Method__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1460:1: ( rule__Method__Group_4_1__0__Impl rule__Method__Group_4_1__1 )
            // InternalSmallUmlParser.g:1461:2: rule__Method__Group_4_1__0__Impl rule__Method__Group_4_1__1
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
    // InternalSmallUmlParser.g:1468:1: rule__Method__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__Method__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1472:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:1473:1: ( Comma )
            {
            // InternalSmallUmlParser.g:1473:1: ( Comma )
            // InternalSmallUmlParser.g:1474:2: Comma
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
    // InternalSmallUmlParser.g:1483:1: rule__Method__Group_4_1__1 : rule__Method__Group_4_1__1__Impl ;
    public final void rule__Method__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1487:1: ( rule__Method__Group_4_1__1__Impl )
            // InternalSmallUmlParser.g:1488:2: rule__Method__Group_4_1__1__Impl
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
    // InternalSmallUmlParser.g:1494:1: rule__Method__Group_4_1__1__Impl : ( ( rule__Method__ParameterAssignment_4_1_1 ) ) ;
    public final void rule__Method__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1498:1: ( ( ( rule__Method__ParameterAssignment_4_1_1 ) ) )
            // InternalSmallUmlParser.g:1499:1: ( ( rule__Method__ParameterAssignment_4_1_1 ) )
            {
            // InternalSmallUmlParser.g:1499:1: ( ( rule__Method__ParameterAssignment_4_1_1 ) )
            // InternalSmallUmlParser.g:1500:2: ( rule__Method__ParameterAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_1_1()); 
            // InternalSmallUmlParser.g:1501:2: ( rule__Method__ParameterAssignment_4_1_1 )
            // InternalSmallUmlParser.g:1501:3: rule__Method__ParameterAssignment_4_1_1
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
    // InternalSmallUmlParser.g:1510:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1514:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalSmallUmlParser.g:1515:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
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
    // InternalSmallUmlParser.g:1522:1: rule__Method__Group_6__0__Impl : ( Colon ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1526:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1527:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1527:1: ( Colon )
            // InternalSmallUmlParser.g:1528:2: Colon
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
    // InternalSmallUmlParser.g:1537:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1541:1: ( rule__Method__Group_6__1__Impl )
            // InternalSmallUmlParser.g:1542:2: rule__Method__Group_6__1__Impl
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
    // InternalSmallUmlParser.g:1548:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__ReturnTypeAssignment_6_1 ) ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1552:1: ( ( ( rule__Method__ReturnTypeAssignment_6_1 ) ) )
            // InternalSmallUmlParser.g:1553:1: ( ( rule__Method__ReturnTypeAssignment_6_1 ) )
            {
            // InternalSmallUmlParser.g:1553:1: ( ( rule__Method__ReturnTypeAssignment_6_1 ) )
            // InternalSmallUmlParser.g:1554:2: ( rule__Method__ReturnTypeAssignment_6_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1()); 
            // InternalSmallUmlParser.g:1555:2: ( rule__Method__ReturnTypeAssignment_6_1 )
            // InternalSmallUmlParser.g:1555:3: rule__Method__ReturnTypeAssignment_6_1
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
    // InternalSmallUmlParser.g:1564:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1568:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSmallUmlParser.g:1569:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalSmallUmlParser.g:1576:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1580:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalSmallUmlParser.g:1581:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalSmallUmlParser.g:1581:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalSmallUmlParser.g:1582:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalSmallUmlParser.g:1583:2: ( rule__Parameter__NameAssignment_0 )
            // InternalSmallUmlParser.g:1583:3: rule__Parameter__NameAssignment_0
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
    // InternalSmallUmlParser.g:1591:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1595:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSmallUmlParser.g:1596:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalSmallUmlParser.g:1603:1: rule__Parameter__Group__1__Impl : ( Colon ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1607:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1608:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1608:1: ( Colon )
            // InternalSmallUmlParser.g:1609:2: Colon
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
    // InternalSmallUmlParser.g:1618:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1622:1: ( rule__Parameter__Group__2__Impl )
            // InternalSmallUmlParser.g:1623:2: rule__Parameter__Group__2__Impl
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
    // InternalSmallUmlParser.g:1629:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1633:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalSmallUmlParser.g:1634:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:1634:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalSmallUmlParser.g:1635:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalSmallUmlParser.g:1636:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalSmallUmlParser.g:1636:3: rule__Parameter__TypeAssignment_2
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
    // InternalSmallUmlParser.g:1645:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1649:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalSmallUmlParser.g:1650:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
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
    // InternalSmallUmlParser.g:1657:1: rule__Composition__Group__0__Impl : ( ( rule__Composition__Group_0__0 )? ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1661:1: ( ( ( rule__Composition__Group_0__0 )? ) )
            // InternalSmallUmlParser.g:1662:1: ( ( rule__Composition__Group_0__0 )? )
            {
            // InternalSmallUmlParser.g:1662:1: ( ( rule__Composition__Group_0__0 )? )
            // InternalSmallUmlParser.g:1663:2: ( rule__Composition__Group_0__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_0()); 
            // InternalSmallUmlParser.g:1664:2: ( rule__Composition__Group_0__0 )?
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
                    // InternalSmallUmlParser.g:1664:3: rule__Composition__Group_0__0
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
    // InternalSmallUmlParser.g:1672:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1676:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalSmallUmlParser.g:1677:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
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
    // InternalSmallUmlParser.g:1684:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__SourceAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1688:1: ( ( ( rule__Composition__SourceAssignment_1 ) ) )
            // InternalSmallUmlParser.g:1689:1: ( ( rule__Composition__SourceAssignment_1 ) )
            {
            // InternalSmallUmlParser.g:1689:1: ( ( rule__Composition__SourceAssignment_1 ) )
            // InternalSmallUmlParser.g:1690:2: ( rule__Composition__SourceAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getSourceAssignment_1()); 
            // InternalSmallUmlParser.g:1691:2: ( rule__Composition__SourceAssignment_1 )
            // InternalSmallUmlParser.g:1691:3: rule__Composition__SourceAssignment_1
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
    // InternalSmallUmlParser.g:1699:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1703:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalSmallUmlParser.g:1704:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
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
    // InternalSmallUmlParser.g:1711:1: rule__Composition__Group__2__Impl : ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1715:1: ( ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus ) )
            // InternalSmallUmlParser.g:1716:1: ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus )
            {
            // InternalSmallUmlParser.g:1716:1: ( LessThanSignGreaterThanSignHyphenMinusHyphenMinus )
            // InternalSmallUmlParser.g:1717:2: LessThanSignGreaterThanSignHyphenMinusHyphenMinus
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
    // InternalSmallUmlParser.g:1726:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1730:1: ( rule__Composition__Group__3__Impl )
            // InternalSmallUmlParser.g:1731:2: rule__Composition__Group__3__Impl
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
    // InternalSmallUmlParser.g:1737:1: rule__Composition__Group__3__Impl : ( ( rule__Composition__TargetAssignment_3 ) ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1741:1: ( ( ( rule__Composition__TargetAssignment_3 ) ) )
            // InternalSmallUmlParser.g:1742:1: ( ( rule__Composition__TargetAssignment_3 ) )
            {
            // InternalSmallUmlParser.g:1742:1: ( ( rule__Composition__TargetAssignment_3 ) )
            // InternalSmallUmlParser.g:1743:2: ( rule__Composition__TargetAssignment_3 )
            {
             before(grammarAccess.getCompositionAccess().getTargetAssignment_3()); 
            // InternalSmallUmlParser.g:1744:2: ( rule__Composition__TargetAssignment_3 )
            // InternalSmallUmlParser.g:1744:3: rule__Composition__TargetAssignment_3
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
    // InternalSmallUmlParser.g:1753:1: rule__Composition__Group_0__0 : rule__Composition__Group_0__0__Impl rule__Composition__Group_0__1 ;
    public final void rule__Composition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1757:1: ( rule__Composition__Group_0__0__Impl rule__Composition__Group_0__1 )
            // InternalSmallUmlParser.g:1758:2: rule__Composition__Group_0__0__Impl rule__Composition__Group_0__1
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
    // InternalSmallUmlParser.g:1765:1: rule__Composition__Group_0__0__Impl : ( ( rule__Composition__NameAssignment_0_0 ) ) ;
    public final void rule__Composition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1769:1: ( ( ( rule__Composition__NameAssignment_0_0 ) ) )
            // InternalSmallUmlParser.g:1770:1: ( ( rule__Composition__NameAssignment_0_0 ) )
            {
            // InternalSmallUmlParser.g:1770:1: ( ( rule__Composition__NameAssignment_0_0 ) )
            // InternalSmallUmlParser.g:1771:2: ( rule__Composition__NameAssignment_0_0 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_0_0()); 
            // InternalSmallUmlParser.g:1772:2: ( rule__Composition__NameAssignment_0_0 )
            // InternalSmallUmlParser.g:1772:3: rule__Composition__NameAssignment_0_0
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
    // InternalSmallUmlParser.g:1780:1: rule__Composition__Group_0__1 : rule__Composition__Group_0__1__Impl ;
    public final void rule__Composition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1784:1: ( rule__Composition__Group_0__1__Impl )
            // InternalSmallUmlParser.g:1785:2: rule__Composition__Group_0__1__Impl
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
    // InternalSmallUmlParser.g:1791:1: rule__Composition__Group_0__1__Impl : ( Colon ) ;
    public final void rule__Composition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1795:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1796:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1796:1: ( Colon )
            // InternalSmallUmlParser.g:1797:2: Colon
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
    // InternalSmallUmlParser.g:1807:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1811:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalSmallUmlParser.g:1812:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalSmallUmlParser.g:1819:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Group_0__0 )? ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1823:1: ( ( ( rule__Reference__Group_0__0 )? ) )
            // InternalSmallUmlParser.g:1824:1: ( ( rule__Reference__Group_0__0 )? )
            {
            // InternalSmallUmlParser.g:1824:1: ( ( rule__Reference__Group_0__0 )? )
            // InternalSmallUmlParser.g:1825:2: ( rule__Reference__Group_0__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_0()); 
            // InternalSmallUmlParser.g:1826:2: ( rule__Reference__Group_0__0 )?
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
                    // InternalSmallUmlParser.g:1826:3: rule__Reference__Group_0__0
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
    // InternalSmallUmlParser.g:1834:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1838:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalSmallUmlParser.g:1839:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
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
    // InternalSmallUmlParser.g:1846:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__SourceAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1850:1: ( ( ( rule__Reference__SourceAssignment_1 ) ) )
            // InternalSmallUmlParser.g:1851:1: ( ( rule__Reference__SourceAssignment_1 ) )
            {
            // InternalSmallUmlParser.g:1851:1: ( ( rule__Reference__SourceAssignment_1 ) )
            // InternalSmallUmlParser.g:1852:2: ( rule__Reference__SourceAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getSourceAssignment_1()); 
            // InternalSmallUmlParser.g:1853:2: ( rule__Reference__SourceAssignment_1 )
            // InternalSmallUmlParser.g:1853:3: rule__Reference__SourceAssignment_1
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
    // InternalSmallUmlParser.g:1861:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1865:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalSmallUmlParser.g:1866:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
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
    // InternalSmallUmlParser.g:1873:1: rule__Reference__Group__2__Impl : ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1877:1: ( ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ) )
            // InternalSmallUmlParser.g:1878:1: ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign )
            {
            // InternalSmallUmlParser.g:1878:1: ( HyphenMinusHyphenMinusHyphenMinusGreaterThanSign )
            // InternalSmallUmlParser.g:1879:2: HyphenMinusHyphenMinusHyphenMinusGreaterThanSign
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
    // InternalSmallUmlParser.g:1888:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1892:1: ( rule__Reference__Group__3__Impl )
            // InternalSmallUmlParser.g:1893:2: rule__Reference__Group__3__Impl
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
    // InternalSmallUmlParser.g:1899:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TargetAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1903:1: ( ( ( rule__Reference__TargetAssignment_3 ) ) )
            // InternalSmallUmlParser.g:1904:1: ( ( rule__Reference__TargetAssignment_3 ) )
            {
            // InternalSmallUmlParser.g:1904:1: ( ( rule__Reference__TargetAssignment_3 ) )
            // InternalSmallUmlParser.g:1905:2: ( rule__Reference__TargetAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_3()); 
            // InternalSmallUmlParser.g:1906:2: ( rule__Reference__TargetAssignment_3 )
            // InternalSmallUmlParser.g:1906:3: rule__Reference__TargetAssignment_3
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
    // InternalSmallUmlParser.g:1915:1: rule__Reference__Group_0__0 : rule__Reference__Group_0__0__Impl rule__Reference__Group_0__1 ;
    public final void rule__Reference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1919:1: ( rule__Reference__Group_0__0__Impl rule__Reference__Group_0__1 )
            // InternalSmallUmlParser.g:1920:2: rule__Reference__Group_0__0__Impl rule__Reference__Group_0__1
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
    // InternalSmallUmlParser.g:1927:1: rule__Reference__Group_0__0__Impl : ( ( rule__Reference__NameAssignment_0_0 ) ) ;
    public final void rule__Reference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1931:1: ( ( ( rule__Reference__NameAssignment_0_0 ) ) )
            // InternalSmallUmlParser.g:1932:1: ( ( rule__Reference__NameAssignment_0_0 ) )
            {
            // InternalSmallUmlParser.g:1932:1: ( ( rule__Reference__NameAssignment_0_0 ) )
            // InternalSmallUmlParser.g:1933:2: ( rule__Reference__NameAssignment_0_0 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_0_0()); 
            // InternalSmallUmlParser.g:1934:2: ( rule__Reference__NameAssignment_0_0 )
            // InternalSmallUmlParser.g:1934:3: rule__Reference__NameAssignment_0_0
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
    // InternalSmallUmlParser.g:1942:1: rule__Reference__Group_0__1 : rule__Reference__Group_0__1__Impl ;
    public final void rule__Reference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1946:1: ( rule__Reference__Group_0__1__Impl )
            // InternalSmallUmlParser.g:1947:2: rule__Reference__Group_0__1__Impl
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
    // InternalSmallUmlParser.g:1953:1: rule__Reference__Group_0__1__Impl : ( Colon ) ;
    public final void rule__Reference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1957:1: ( ( Colon ) )
            // InternalSmallUmlParser.g:1958:1: ( Colon )
            {
            // InternalSmallUmlParser.g:1958:1: ( Colon )
            // InternalSmallUmlParser.g:1959:2: Colon
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
    // InternalSmallUmlParser.g:1969:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1973:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSmallUmlParser.g:1974:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalSmallUmlParser.g:1981:1: rule__Role__Group__0__Impl : ( ( rule__Role__NameAssignment_0 )? ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:1985:1: ( ( ( rule__Role__NameAssignment_0 )? ) )
            // InternalSmallUmlParser.g:1986:1: ( ( rule__Role__NameAssignment_0 )? )
            {
            // InternalSmallUmlParser.g:1986:1: ( ( rule__Role__NameAssignment_0 )? )
            // InternalSmallUmlParser.g:1987:2: ( rule__Role__NameAssignment_0 )?
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_0()); 
            // InternalSmallUmlParser.g:1988:2: ( rule__Role__NameAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUmlParser.g:1988:3: rule__Role__NameAssignment_0
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
    // InternalSmallUmlParser.g:1996:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2000:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSmallUmlParser.g:2001:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalSmallUmlParser.g:2008:1: rule__Role__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2012:1: ( ( LeftParenthesis ) )
            // InternalSmallUmlParser.g:2013:1: ( LeftParenthesis )
            {
            // InternalSmallUmlParser.g:2013:1: ( LeftParenthesis )
            // InternalSmallUmlParser.g:2014:2: LeftParenthesis
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
    // InternalSmallUmlParser.g:2023:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2027:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSmallUmlParser.g:2028:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalSmallUmlParser.g:2035:1: rule__Role__Group__2__Impl : ( ( rule__Role__ClassAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2039:1: ( ( ( rule__Role__ClassAssignment_2 ) ) )
            // InternalSmallUmlParser.g:2040:1: ( ( rule__Role__ClassAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:2040:1: ( ( rule__Role__ClassAssignment_2 ) )
            // InternalSmallUmlParser.g:2041:2: ( rule__Role__ClassAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getClassAssignment_2()); 
            // InternalSmallUmlParser.g:2042:2: ( rule__Role__ClassAssignment_2 )
            // InternalSmallUmlParser.g:2042:3: rule__Role__ClassAssignment_2
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
    // InternalSmallUmlParser.g:2050:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2054:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSmallUmlParser.g:2055:2: rule__Role__Group__3__Impl rule__Role__Group__4
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
    // InternalSmallUmlParser.g:2062:1: rule__Role__Group__3__Impl : ( ( rule__Role__Group_3__0 )? ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2066:1: ( ( ( rule__Role__Group_3__0 )? ) )
            // InternalSmallUmlParser.g:2067:1: ( ( rule__Role__Group_3__0 )? )
            {
            // InternalSmallUmlParser.g:2067:1: ( ( rule__Role__Group_3__0 )? )
            // InternalSmallUmlParser.g:2068:2: ( rule__Role__Group_3__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_3()); 
            // InternalSmallUmlParser.g:2069:2: ( rule__Role__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Comma) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUmlParser.g:2069:3: rule__Role__Group_3__0
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
    // InternalSmallUmlParser.g:2077:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2081:1: ( rule__Role__Group__4__Impl )
            // InternalSmallUmlParser.g:2082:2: rule__Role__Group__4__Impl
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
    // InternalSmallUmlParser.g:2088:1: rule__Role__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2092:1: ( ( RightParenthesis ) )
            // InternalSmallUmlParser.g:2093:1: ( RightParenthesis )
            {
            // InternalSmallUmlParser.g:2093:1: ( RightParenthesis )
            // InternalSmallUmlParser.g:2094:2: RightParenthesis
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
    // InternalSmallUmlParser.g:2104:1: rule__Role__Group_3__0 : rule__Role__Group_3__0__Impl rule__Role__Group_3__1 ;
    public final void rule__Role__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2108:1: ( rule__Role__Group_3__0__Impl rule__Role__Group_3__1 )
            // InternalSmallUmlParser.g:2109:2: rule__Role__Group_3__0__Impl rule__Role__Group_3__1
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
    // InternalSmallUmlParser.g:2116:1: rule__Role__Group_3__0__Impl : ( Comma ) ;
    public final void rule__Role__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2120:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:2121:1: ( Comma )
            {
            // InternalSmallUmlParser.g:2121:1: ( Comma )
            // InternalSmallUmlParser.g:2122:2: Comma
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
    // InternalSmallUmlParser.g:2131:1: rule__Role__Group_3__1 : rule__Role__Group_3__1__Impl rule__Role__Group_3__2 ;
    public final void rule__Role__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2135:1: ( rule__Role__Group_3__1__Impl rule__Role__Group_3__2 )
            // InternalSmallUmlParser.g:2136:2: rule__Role__Group_3__1__Impl rule__Role__Group_3__2
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
    // InternalSmallUmlParser.g:2143:1: rule__Role__Group_3__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Role__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2147:1: ( ( LeftSquareBracket ) )
            // InternalSmallUmlParser.g:2148:1: ( LeftSquareBracket )
            {
            // InternalSmallUmlParser.g:2148:1: ( LeftSquareBracket )
            // InternalSmallUmlParser.g:2149:2: LeftSquareBracket
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
    // InternalSmallUmlParser.g:2158:1: rule__Role__Group_3__2 : rule__Role__Group_3__2__Impl rule__Role__Group_3__3 ;
    public final void rule__Role__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2162:1: ( rule__Role__Group_3__2__Impl rule__Role__Group_3__3 )
            // InternalSmallUmlParser.g:2163:2: rule__Role__Group_3__2__Impl rule__Role__Group_3__3
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
    // InternalSmallUmlParser.g:2170:1: rule__Role__Group_3__2__Impl : ( ( rule__Role__LowerBoundAssignment_3_2 ) ) ;
    public final void rule__Role__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2174:1: ( ( ( rule__Role__LowerBoundAssignment_3_2 ) ) )
            // InternalSmallUmlParser.g:2175:1: ( ( rule__Role__LowerBoundAssignment_3_2 ) )
            {
            // InternalSmallUmlParser.g:2175:1: ( ( rule__Role__LowerBoundAssignment_3_2 ) )
            // InternalSmallUmlParser.g:2176:2: ( rule__Role__LowerBoundAssignment_3_2 )
            {
             before(grammarAccess.getRoleAccess().getLowerBoundAssignment_3_2()); 
            // InternalSmallUmlParser.g:2177:2: ( rule__Role__LowerBoundAssignment_3_2 )
            // InternalSmallUmlParser.g:2177:3: rule__Role__LowerBoundAssignment_3_2
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
    // InternalSmallUmlParser.g:2185:1: rule__Role__Group_3__3 : rule__Role__Group_3__3__Impl rule__Role__Group_3__4 ;
    public final void rule__Role__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2189:1: ( rule__Role__Group_3__3__Impl rule__Role__Group_3__4 )
            // InternalSmallUmlParser.g:2190:2: rule__Role__Group_3__3__Impl rule__Role__Group_3__4
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
    // InternalSmallUmlParser.g:2197:1: rule__Role__Group_3__3__Impl : ( Comma ) ;
    public final void rule__Role__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2201:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:2202:1: ( Comma )
            {
            // InternalSmallUmlParser.g:2202:1: ( Comma )
            // InternalSmallUmlParser.g:2203:2: Comma
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
    // InternalSmallUmlParser.g:2212:1: rule__Role__Group_3__4 : rule__Role__Group_3__4__Impl rule__Role__Group_3__5 ;
    public final void rule__Role__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2216:1: ( rule__Role__Group_3__4__Impl rule__Role__Group_3__5 )
            // InternalSmallUmlParser.g:2217:2: rule__Role__Group_3__4__Impl rule__Role__Group_3__5
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
    // InternalSmallUmlParser.g:2224:1: rule__Role__Group_3__4__Impl : ( ( rule__Role__UpperBoundAssignment_3_4 ) ) ;
    public final void rule__Role__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2228:1: ( ( ( rule__Role__UpperBoundAssignment_3_4 ) ) )
            // InternalSmallUmlParser.g:2229:1: ( ( rule__Role__UpperBoundAssignment_3_4 ) )
            {
            // InternalSmallUmlParser.g:2229:1: ( ( rule__Role__UpperBoundAssignment_3_4 ) )
            // InternalSmallUmlParser.g:2230:2: ( rule__Role__UpperBoundAssignment_3_4 )
            {
             before(grammarAccess.getRoleAccess().getUpperBoundAssignment_3_4()); 
            // InternalSmallUmlParser.g:2231:2: ( rule__Role__UpperBoundAssignment_3_4 )
            // InternalSmallUmlParser.g:2231:3: rule__Role__UpperBoundAssignment_3_4
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
    // InternalSmallUmlParser.g:2239:1: rule__Role__Group_3__5 : rule__Role__Group_3__5__Impl ;
    public final void rule__Role__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2243:1: ( rule__Role__Group_3__5__Impl )
            // InternalSmallUmlParser.g:2244:2: rule__Role__Group_3__5__Impl
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
    // InternalSmallUmlParser.g:2250:1: rule__Role__Group_3__5__Impl : ( RightSquareBracket ) ;
    public final void rule__Role__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2254:1: ( ( RightSquareBracket ) )
            // InternalSmallUmlParser.g:2255:1: ( RightSquareBracket )
            {
            // InternalSmallUmlParser.g:2255:1: ( RightSquareBracket )
            // InternalSmallUmlParser.g:2256:2: RightSquareBracket
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
    // InternalSmallUmlParser.g:2266:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2270:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUmlParser.g:2271:2: rule__String0__Group__0__Impl rule__String0__Group__1
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
    // InternalSmallUmlParser.g:2278:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2282:1: ( ( () ) )
            // InternalSmallUmlParser.g:2283:1: ( () )
            {
            // InternalSmallUmlParser.g:2283:1: ( () )
            // InternalSmallUmlParser.g:2284:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUmlParser.g:2285:2: ()
            // InternalSmallUmlParser.g:2285:3: 
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
    // InternalSmallUmlParser.g:2293:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2297:1: ( rule__String0__Group__1__Impl )
            // InternalSmallUmlParser.g:2298:2: rule__String0__Group__1__Impl
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
    // InternalSmallUmlParser.g:2304:1: rule__String0__Group__1__Impl : ( String ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2308:1: ( ( String ) )
            // InternalSmallUmlParser.g:2309:1: ( String )
            {
            // InternalSmallUmlParser.g:2309:1: ( String )
            // InternalSmallUmlParser.g:2310:2: String
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
    // InternalSmallUmlParser.g:2320:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2324:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUmlParser.g:2325:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalSmallUmlParser.g:2332:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2336:1: ( ( () ) )
            // InternalSmallUmlParser.g:2337:1: ( () )
            {
            // InternalSmallUmlParser.g:2337:1: ( () )
            // InternalSmallUmlParser.g:2338:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUmlParser.g:2339:2: ()
            // InternalSmallUmlParser.g:2339:3: 
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
    // InternalSmallUmlParser.g:2347:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2351:1: ( rule__Integer__Group__1__Impl )
            // InternalSmallUmlParser.g:2352:2: rule__Integer__Group__1__Impl
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
    // InternalSmallUmlParser.g:2358:1: rule__Integer__Group__1__Impl : ( Integer ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2362:1: ( ( Integer ) )
            // InternalSmallUmlParser.g:2363:1: ( Integer )
            {
            // InternalSmallUmlParser.g:2363:1: ( Integer )
            // InternalSmallUmlParser.g:2364:2: Integer
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
    // InternalSmallUmlParser.g:2374:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2378:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalSmallUmlParser.g:2379:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
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
    // InternalSmallUmlParser.g:2386:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2390:1: ( ( () ) )
            // InternalSmallUmlParser.g:2391:1: ( () )
            {
            // InternalSmallUmlParser.g:2391:1: ( () )
            // InternalSmallUmlParser.g:2392:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalSmallUmlParser.g:2393:2: ()
            // InternalSmallUmlParser.g:2393:3: 
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
    // InternalSmallUmlParser.g:2401:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2405:1: ( rule__Bool__Group__1__Impl )
            // InternalSmallUmlParser.g:2406:2: rule__Bool__Group__1__Impl
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
    // InternalSmallUmlParser.g:2412:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2416:1: ( ( Bool ) )
            // InternalSmallUmlParser.g:2417:1: ( Bool )
            {
            // InternalSmallUmlParser.g:2417:1: ( Bool )
            // InternalSmallUmlParser.g:2418:2: Bool
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
    // InternalSmallUmlParser.g:2428:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2432:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSmallUmlParser.g:2433:2: rule__Real__Group__0__Impl rule__Real__Group__1
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
    // InternalSmallUmlParser.g:2440:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2444:1: ( ( () ) )
            // InternalSmallUmlParser.g:2445:1: ( () )
            {
            // InternalSmallUmlParser.g:2445:1: ( () )
            // InternalSmallUmlParser.g:2446:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSmallUmlParser.g:2447:2: ()
            // InternalSmallUmlParser.g:2447:3: 
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
    // InternalSmallUmlParser.g:2455:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2459:1: ( rule__Real__Group__1__Impl )
            // InternalSmallUmlParser.g:2460:2: rule__Real__Group__1__Impl
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
    // InternalSmallUmlParser.g:2466:1: rule__Real__Group__1__Impl : ( Real ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2470:1: ( ( Real ) )
            // InternalSmallUmlParser.g:2471:1: ( Real )
            {
            // InternalSmallUmlParser.g:2471:1: ( Real )
            // InternalSmallUmlParser.g:2472:2: Real
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
    // InternalSmallUmlParser.g:2482:1: rule__UnlimitedNatural__Group__0 : rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 ;
    public final void rule__UnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2486:1: ( rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1 )
            // InternalSmallUmlParser.g:2487:2: rule__UnlimitedNatural__Group__0__Impl rule__UnlimitedNatural__Group__1
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
    // InternalSmallUmlParser.g:2494:1: rule__UnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__UnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2498:1: ( ( () ) )
            // InternalSmallUmlParser.g:2499:1: ( () )
            {
            // InternalSmallUmlParser.g:2499:1: ( () )
            // InternalSmallUmlParser.g:2500:2: ()
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0()); 
            // InternalSmallUmlParser.g:2501:2: ()
            // InternalSmallUmlParser.g:2501:3: 
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
    // InternalSmallUmlParser.g:2509:1: rule__UnlimitedNatural__Group__1 : rule__UnlimitedNatural__Group__1__Impl ;
    public final void rule__UnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2513:1: ( rule__UnlimitedNatural__Group__1__Impl )
            // InternalSmallUmlParser.g:2514:2: rule__UnlimitedNatural__Group__1__Impl
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
    // InternalSmallUmlParser.g:2520:1: rule__UnlimitedNatural__Group__1__Impl : ( UnlimitedNatural ) ;
    public final void rule__UnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2524:1: ( ( UnlimitedNatural ) )
            // InternalSmallUmlParser.g:2525:1: ( UnlimitedNatural )
            {
            // InternalSmallUmlParser.g:2525:1: ( UnlimitedNatural )
            // InternalSmallUmlParser.g:2526:2: UnlimitedNatural
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
    // InternalSmallUmlParser.g:2536:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2540:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUmlParser.g:2541:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
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
    // InternalSmallUmlParser.g:2548:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2552:1: ( ( () ) )
            // InternalSmallUmlParser.g:2553:1: ( () )
            {
            // InternalSmallUmlParser.g:2553:1: ( () )
            // InternalSmallUmlParser.g:2554:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalSmallUmlParser.g:2555:2: ()
            // InternalSmallUmlParser.g:2555:3: 
            {
            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUmlParser.g:2563:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2567:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUmlParser.g:2568:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUmlParser.g:2575:1: rule__Enumeration__Group__1__Impl : ( Enum ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2579:1: ( ( Enum ) )
            // InternalSmallUmlParser.g:2580:1: ( Enum )
            {
            // InternalSmallUmlParser.g:2580:1: ( Enum )
            // InternalSmallUmlParser.g:2581:2: Enum
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 
            match(input,Enum,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2590:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2594:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUmlParser.g:2595:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmallUmlParser.g:2602:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2606:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalSmallUmlParser.g:2607:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalSmallUmlParser.g:2607:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalSmallUmlParser.g:2608:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalSmallUmlParser.g:2609:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalSmallUmlParser.g:2609:3: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2617:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2621:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUmlParser.g:2622:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUmlParser.g:2629:1: rule__Enumeration__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2633:1: ( ( LeftSquareBracket ) )
            // InternalSmallUmlParser.g:2634:1: ( LeftSquareBracket )
            {
            // InternalSmallUmlParser.g:2634:1: ( LeftSquareBracket )
            // InternalSmallUmlParser.g:2635:2: LeftSquareBracket
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2644:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2648:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUmlParser.g:2649:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalSmallUmlParser.g:2656:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__ValuesAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2660:1: ( ( ( rule__Enumeration__ValuesAssignment_4 ) ) )
            // InternalSmallUmlParser.g:2661:1: ( ( rule__Enumeration__ValuesAssignment_4 ) )
            {
            // InternalSmallUmlParser.g:2661:1: ( ( rule__Enumeration__ValuesAssignment_4 ) )
            // InternalSmallUmlParser.g:2662:2: ( rule__Enumeration__ValuesAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_4()); 
            // InternalSmallUmlParser.g:2663:2: ( rule__Enumeration__ValuesAssignment_4 )
            // InternalSmallUmlParser.g:2663:3: rule__Enumeration__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValuesAssignment_4()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2671:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2675:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUmlParser.g:2676:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalSmallUmlParser.g:2683:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__Group_5__0 )* ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2687:1: ( ( ( rule__Enumeration__Group_5__0 )* ) )
            // InternalSmallUmlParser.g:2688:1: ( ( rule__Enumeration__Group_5__0 )* )
            {
            // InternalSmallUmlParser.g:2688:1: ( ( rule__Enumeration__Group_5__0 )* )
            // InternalSmallUmlParser.g:2689:2: ( rule__Enumeration__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_5()); 
            // InternalSmallUmlParser.g:2690:2: ( rule__Enumeration__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallUmlParser.g:2690:3: rule__Enumeration__Group_5__0
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
    // InternalSmallUmlParser.g:2698:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2702:1: ( rule__Enumeration__Group__6__Impl )
            // InternalSmallUmlParser.g:2703:2: rule__Enumeration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalSmallUmlParser.g:2709:1: rule__Enumeration__Group__6__Impl : ( RightSquareBracket ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2713:1: ( ( RightSquareBracket ) )
            // InternalSmallUmlParser.g:2714:1: ( RightSquareBracket )
            {
            // InternalSmallUmlParser.g:2714:1: ( RightSquareBracket )
            // InternalSmallUmlParser.g:2715:2: RightSquareBracket
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_6()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__Group_5__0"
    // InternalSmallUmlParser.g:2725:1: rule__Enumeration__Group_5__0 : rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 ;
    public final void rule__Enumeration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2729:1: ( rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 )
            // InternalSmallUmlParser.g:2730:2: rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUmlParser.g:2737:1: rule__Enumeration__Group_5__0__Impl : ( Comma ) ;
    public final void rule__Enumeration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2741:1: ( ( Comma ) )
            // InternalSmallUmlParser.g:2742:1: ( Comma )
            {
            // InternalSmallUmlParser.g:2742:1: ( Comma )
            // InternalSmallUmlParser.g:2743:2: Comma
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
    // InternalSmallUmlParser.g:2752:1: rule__Enumeration__Group_5__1 : rule__Enumeration__Group_5__1__Impl ;
    public final void rule__Enumeration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2756:1: ( rule__Enumeration__Group_5__1__Impl )
            // InternalSmallUmlParser.g:2757:2: rule__Enumeration__Group_5__1__Impl
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
    // InternalSmallUmlParser.g:2763:1: rule__Enumeration__Group_5__1__Impl : ( ( rule__Enumeration__ValuesAssignment_5_1 ) ) ;
    public final void rule__Enumeration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2767:1: ( ( ( rule__Enumeration__ValuesAssignment_5_1 ) ) )
            // InternalSmallUmlParser.g:2768:1: ( ( rule__Enumeration__ValuesAssignment_5_1 ) )
            {
            // InternalSmallUmlParser.g:2768:1: ( ( rule__Enumeration__ValuesAssignment_5_1 ) )
            // InternalSmallUmlParser.g:2769:2: ( rule__Enumeration__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_5_1()); 
            // InternalSmallUmlParser.g:2770:2: ( rule__Enumeration__ValuesAssignment_5_1 )
            // InternalSmallUmlParser.g:2770:3: rule__Enumeration__ValuesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValuesAssignment_5_1()); 

            }


            }

        }
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
    // InternalSmallUmlParser.g:2779:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2783:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUmlParser.g:2784:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSmallUmlParser.g:2791:1: rule__EInt__Group__0__Impl : ( ( HyphenMinus )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2795:1: ( ( ( HyphenMinus )? ) )
            // InternalSmallUmlParser.g:2796:1: ( ( HyphenMinus )? )
            {
            // InternalSmallUmlParser.g:2796:1: ( ( HyphenMinus )? )
            // InternalSmallUmlParser.g:2797:2: ( HyphenMinus )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUmlParser.g:2798:2: ( HyphenMinus )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUmlParser.g:2798:3: HyphenMinus
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
    // InternalSmallUmlParser.g:2806:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2810:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUmlParser.g:2811:2: rule__EInt__Group__1__Impl
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
    // InternalSmallUmlParser.g:2817:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2821:1: ( ( RULE_INT ) )
            // InternalSmallUmlParser.g:2822:1: ( RULE_INT )
            {
            // InternalSmallUmlParser.g:2822:1: ( RULE_INT )
            // InternalSmallUmlParser.g:2823:2: RULE_INT
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
    // InternalSmallUmlParser.g:2833:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2837:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2838:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2838:2: ( ruleEString )
            // InternalSmallUmlParser.g:2839:3: ruleEString
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
    // InternalSmallUmlParser.g:2848:1: rule__Package__MemberAssignment_4 : ( ruleNamedElement ) ;
    public final void rule__Package__MemberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2852:1: ( ( ruleNamedElement ) )
            // InternalSmallUmlParser.g:2853:2: ( ruleNamedElement )
            {
            // InternalSmallUmlParser.g:2853:2: ( ruleNamedElement )
            // InternalSmallUmlParser.g:2854:3: ruleNamedElement
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
    // InternalSmallUmlParser.g:2863:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2867:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2868:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2868:2: ( ruleEString )
            // InternalSmallUmlParser.g:2869:3: ruleEString
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
    // InternalSmallUmlParser.g:2878:1: rule__Class__SuperAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2882:1: ( ( ( ruleEString ) ) )
            // InternalSmallUmlParser.g:2883:2: ( ( ruleEString ) )
            {
            // InternalSmallUmlParser.g:2883:2: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2884:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0()); 
            // InternalSmallUmlParser.g:2885:3: ( ruleEString )
            // InternalSmallUmlParser.g:2886:4: ruleEString
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
    // InternalSmallUmlParser.g:2897:1: rule__Class__MethodAssignment_4_1_0 : ( ruleMethod ) ;
    public final void rule__Class__MethodAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2901:1: ( ( ruleMethod ) )
            // InternalSmallUmlParser.g:2902:2: ( ruleMethod )
            {
            // InternalSmallUmlParser.g:2902:2: ( ruleMethod )
            // InternalSmallUmlParser.g:2903:3: ruleMethod
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
    // InternalSmallUmlParser.g:2912:1: rule__Class__AttributeAssignment_4_1_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2916:1: ( ( ruleAttribute ) )
            // InternalSmallUmlParser.g:2917:2: ( ruleAttribute )
            {
            // InternalSmallUmlParser.g:2917:2: ( ruleAttribute )
            // InternalSmallUmlParser.g:2918:3: ruleAttribute
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
    // InternalSmallUmlParser.g:2927:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2931:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2932:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2932:2: ( ruleEString )
            // InternalSmallUmlParser.g:2933:3: ruleEString
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
    // InternalSmallUmlParser.g:2942:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2946:1: ( ( ruleType ) )
            // InternalSmallUmlParser.g:2947:2: ( ruleType )
            {
            // InternalSmallUmlParser.g:2947:2: ( ruleType )
            // InternalSmallUmlParser.g:2948:3: ruleType
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
    // InternalSmallUmlParser.g:2957:1: rule__Method__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2961:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:2962:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:2962:2: ( ruleEString )
            // InternalSmallUmlParser.g:2963:3: ruleEString
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
    // InternalSmallUmlParser.g:2972:1: rule__Method__ParameterAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2976:1: ( ( ruleParameter ) )
            // InternalSmallUmlParser.g:2977:2: ( ruleParameter )
            {
            // InternalSmallUmlParser.g:2977:2: ( ruleParameter )
            // InternalSmallUmlParser.g:2978:3: ruleParameter
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
    // InternalSmallUmlParser.g:2987:1: rule__Method__ParameterAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:2991:1: ( ( ruleParameter ) )
            // InternalSmallUmlParser.g:2992:2: ( ruleParameter )
            {
            // InternalSmallUmlParser.g:2992:2: ( ruleParameter )
            // InternalSmallUmlParser.g:2993:3: ruleParameter
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
    // InternalSmallUmlParser.g:3002:1: rule__Method__ReturnTypeAssignment_6_1 : ( ruleType ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3006:1: ( ( ruleType ) )
            // InternalSmallUmlParser.g:3007:2: ( ruleType )
            {
            // InternalSmallUmlParser.g:3007:2: ( ruleType )
            // InternalSmallUmlParser.g:3008:3: ruleType
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
    // InternalSmallUmlParser.g:3017:1: rule__Parameter__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3021:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3022:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3022:2: ( ruleEString )
            // InternalSmallUmlParser.g:3023:3: ruleEString
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
    // InternalSmallUmlParser.g:3032:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3036:1: ( ( ruleType ) )
            // InternalSmallUmlParser.g:3037:2: ( ruleType )
            {
            // InternalSmallUmlParser.g:3037:2: ( ruleType )
            // InternalSmallUmlParser.g:3038:3: ruleType
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
    // InternalSmallUmlParser.g:3047:1: rule__Composition__NameAssignment_0_0 : ( ruleEString ) ;
    public final void rule__Composition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3051:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3052:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3052:2: ( ruleEString )
            // InternalSmallUmlParser.g:3053:3: ruleEString
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
    // InternalSmallUmlParser.g:3062:1: rule__Composition__SourceAssignment_1 : ( ruleRole ) ;
    public final void rule__Composition__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3066:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3067:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3067:2: ( ruleRole )
            // InternalSmallUmlParser.g:3068:3: ruleRole
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
    // InternalSmallUmlParser.g:3077:1: rule__Composition__TargetAssignment_3 : ( ruleRole ) ;
    public final void rule__Composition__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3081:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3082:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3082:2: ( ruleRole )
            // InternalSmallUmlParser.g:3083:3: ruleRole
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
    // InternalSmallUmlParser.g:3092:1: rule__Reference__NameAssignment_0_0 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3096:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3097:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3097:2: ( ruleEString )
            // InternalSmallUmlParser.g:3098:3: ruleEString
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
    // InternalSmallUmlParser.g:3107:1: rule__Reference__SourceAssignment_1 : ( ruleRole ) ;
    public final void rule__Reference__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3111:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3112:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3112:2: ( ruleRole )
            // InternalSmallUmlParser.g:3113:3: ruleRole
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
    // InternalSmallUmlParser.g:3122:1: rule__Reference__TargetAssignment_3 : ( ruleRole ) ;
    public final void rule__Reference__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3126:1: ( ( ruleRole ) )
            // InternalSmallUmlParser.g:3127:2: ( ruleRole )
            {
            // InternalSmallUmlParser.g:3127:2: ( ruleRole )
            // InternalSmallUmlParser.g:3128:3: ruleRole
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
    // InternalSmallUmlParser.g:3137:1: rule__Role__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3141:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3142:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3142:2: ( ruleEString )
            // InternalSmallUmlParser.g:3143:3: ruleEString
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
    // InternalSmallUmlParser.g:3152:1: rule__Role__ClassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Role__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3156:1: ( ( ( ruleEString ) ) )
            // InternalSmallUmlParser.g:3157:2: ( ( ruleEString ) )
            {
            // InternalSmallUmlParser.g:3157:2: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3158:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getClassClassCrossReference_2_0()); 
            // InternalSmallUmlParser.g:3159:3: ( ruleEString )
            // InternalSmallUmlParser.g:3160:4: ruleEString
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
    // InternalSmallUmlParser.g:3171:1: rule__Role__LowerBoundAssignment_3_2 : ( ruleEInt ) ;
    public final void rule__Role__LowerBoundAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3175:1: ( ( ruleEInt ) )
            // InternalSmallUmlParser.g:3176:2: ( ruleEInt )
            {
            // InternalSmallUmlParser.g:3176:2: ( ruleEInt )
            // InternalSmallUmlParser.g:3177:3: ruleEInt
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
    // InternalSmallUmlParser.g:3186:1: rule__Role__UpperBoundAssignment_3_4 : ( ruleEInt ) ;
    public final void rule__Role__UpperBoundAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3190:1: ( ( ruleEInt ) )
            // InternalSmallUmlParser.g:3191:2: ( ruleEInt )
            {
            // InternalSmallUmlParser.g:3191:2: ( ruleEInt )
            // InternalSmallUmlParser.g:3192:3: ruleEInt
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


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalSmallUmlParser.g:3201:1: rule__Enumeration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3205:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3206:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3206:2: ( ruleEString )
            // InternalSmallUmlParser.g:3207:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__ValuesAssignment_4"
    // InternalSmallUmlParser.g:3216:1: rule__Enumeration__ValuesAssignment_4 : ( ruleEString ) ;
    public final void rule__Enumeration__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3220:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3221:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3221:2: ( ruleEString )
            // InternalSmallUmlParser.g:3222:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getValuesEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValuesEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValuesAssignment_4"


    // $ANTLR start "rule__Enumeration__ValuesAssignment_5_1"
    // InternalSmallUmlParser.g:3231:1: rule__Enumeration__ValuesAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Enumeration__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUmlParser.g:3235:1: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:3236:2: ( ruleEString )
            {
            // InternalSmallUmlParser.g:3236:2: ( ruleEString )
            // InternalSmallUmlParser.g:3237:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getValuesEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValuesEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValuesAssignment_5_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\24\uffff\1\32\25\uffff";
    static final String dfa_3s = "\1\6\1\uffff\1\31\2\17\1\31\2\uffff\2\17\1\4\2\20\2\uffff\2\17\1\31\1\uffff\1\25\1\6\2\20\1\23\3\uffff\1\25\1\12\1\32\1\22\2\23\1\32\1\22\1\32\1\26\1\23\1\20\1\32\1\26\1\20";
    static final String dfa_4s = "\1\33\1\uffff\1\33\2\24\1\33\2\uffff\2\24\1\33\2\22\2\uffff\2\17\1\33\1\uffff\1\25\1\33\2\22\1\32\3\uffff\1\25\1\13\1\32\1\22\3\32\1\22\1\32\1\26\1\32\1\20\1\32\1\26\1\20";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\10\1\11\5\uffff\1\2\1\3\3\uffff\1\4\5\uffff\1\6\1\7\1\5\17\uffff";
    static final String dfa_6s = "\52\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\2\uffff\1\1\3\uffff\1\7\1\uffff\1\5\1\uffff\1\2\7\uffff\1\4\1\uffff\1\3",
            "",
            "\1\11\1\uffff\1\10",
            "\1\5\4\uffff\1\12",
            "\1\5\4\uffff\1\12",
            "\1\14\1\uffff\1\13",
            "",
            "",
            "\1\16\4\uffff\1\15",
            "\1\16\4\uffff\1\15",
            "\2\22\2\uffff\1\22\3\uffff\3\22\1\21\11\uffff\1\20\1\uffff\1\17",
            "\1\24\1\uffff\1\23",
            "\1\24\1\uffff\1\23",
            "",
            "",
            "\1\21",
            "\1\21",
            "\1\26\1\uffff\1\25",
            "",
            "\1\27",
            "\1\32\2\uffff\1\32\1\31\1\30\1\uffff\1\32\1\uffff\1\32\1\uffff\1\32\6\uffff\2\32\1\uffff\1\32",
            "\1\34\1\uffff\1\33",
            "\1\34\1\uffff\1\33",
            "\1\35\6\uffff\1\36",
            "",
            "",
            "",
            "\1\37",
            "\1\31\1\30",
            "\1\36",
            "\1\40",
            "\1\41\6\uffff\1\42",
            "\1\43\6\uffff\1\44",
            "\1\42",
            "\1\45",
            "\1\44",
            "\1\46",
            "\1\47\6\uffff\1\50",
            "\1\24",
            "\1\50",
            "\1\51",
            "\1\34"
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
            return "523:1: rule__NamedElement__Alternatives : ( ( ruleClass ) | ( ruleAttribute ) | ( ruleMethod ) | ( ruleParameter ) | ( ruleRole ) | ( ruleComposition ) | ( ruleReference ) | ( rulePackage ) | ( ruleEnumeration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000B02A240L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000A02A242L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000A02F370L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000A010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000A008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000A02A240L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000440000L});

}
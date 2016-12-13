package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlParser extends AbstractInternalAntlrParser {
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

        public InternalSmallUmlParser(TokenStream input, SmallUmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected SmallUmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalSmallUmlParser.g:57:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSmallUmlParser.g:57:48: (iv_rulePackage= rulePackage EOF )
            // InternalSmallUmlParser.g:58:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUmlParser.g:64:1: rulePackage returns [EObject current=null] : ( () otherlv_1= Package ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN ( (lv_member_4_0= ruleNamedElement ) )* this_END_5= RULE_END ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_member_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:70:2: ( ( () otherlv_1= Package ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN ( (lv_member_4_0= ruleNamedElement ) )* this_END_5= RULE_END ) )
            // InternalSmallUmlParser.g:71:2: ( () otherlv_1= Package ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN ( (lv_member_4_0= ruleNamedElement ) )* this_END_5= RULE_END )
            {
            // InternalSmallUmlParser.g:71:2: ( () otherlv_1= Package ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN ( (lv_member_4_0= ruleNamedElement ) )* this_END_5= RULE_END )
            // InternalSmallUmlParser.g:72:3: () otherlv_1= Package ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN ( (lv_member_4_0= ruleNamedElement ) )* this_END_5= RULE_END
            {
            // InternalSmallUmlParser.g:72:3: ()
            // InternalSmallUmlParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Package,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalSmallUmlParser.g:83:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUmlParser.g:84:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUmlParser.g:84:4: (lv_name_2_0= ruleEString )
            // InternalSmallUmlParser.g:85:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPackageAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalSmallUmlParser.g:106:3: ( (lv_member_4_0= ruleNamedElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Package||LA1_0==Class||LA1_0==LeftParenthesis||LA1_0==PlusSign||LA1_0==Colon||LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallUmlParser.g:107:4: (lv_member_4_0= ruleNamedElement )
            	    {
            	    // InternalSmallUmlParser.g:107:4: (lv_member_4_0= ruleNamedElement )
            	    // InternalSmallUmlParser.g:108:5: lv_member_4_0= ruleNamedElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getMemberNamedElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_member_4_0=ruleNamedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"member",
            	    						lv_member_4_0,
            	    						"org.smalluml.SmallUml.NamedElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getPackageAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleNamedElement"
    // InternalSmallUmlParser.g:133:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // InternalSmallUmlParser.g:133:53: (iv_ruleNamedElement= ruleNamedElement EOF )
            // InternalSmallUmlParser.g:134:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalSmallUmlParser.g:140:1: ruleNamedElement returns [EObject current=null] : (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_Method_2 = null;

        EObject this_Parameter_3 = null;

        EObject this_Role_4 = null;

        EObject this_Composition_5 = null;

        EObject this_Reference_6 = null;

        EObject this_Package_7 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:146:2: ( (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage ) )
            // InternalSmallUmlParser.g:147:2: (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage )
            {
            // InternalSmallUmlParser.g:147:2: (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSmallUmlParser.g:148:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:157:3: this_Attribute_1= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUmlParser.g:166:3: this_Method_2= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getMethodParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_2=ruleMethod();

                    state._fsp--;


                    			current = this_Method_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUmlParser.g:175:3: this_Parameter_3= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getParameterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_3=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUmlParser.g:184:3: this_Role_4= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getRoleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_4=ruleRole();

                    state._fsp--;


                    			current = this_Role_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmallUmlParser.g:193:3: this_Composition_5= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getCompositionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_5=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSmallUmlParser.g:202:3: this_Reference_6= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getReferenceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_6=ruleReference();

                    state._fsp--;


                    			current = this_Reference_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSmallUmlParser.g:211:3: this_Package_7= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getPackageParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_7=rulePackage();

                    state._fsp--;


                    			current = this_Package_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleType"
    // InternalSmallUmlParser.g:223:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUmlParser.g:223:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUmlParser.g:224:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUmlParser.g:230:1: ruleType returns [EObject current=null] : (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_String0_0 = null;

        EObject this_Integer_1 = null;

        EObject this_Bool_2 = null;

        EObject this_Real_3 = null;

        EObject this_UnlimitedNatural_4 = null;

        EObject this_Enumeration_5 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:236:2: ( (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) )
            // InternalSmallUmlParser.g:237:2: (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            {
            // InternalSmallUmlParser.g:237:2: (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            int alt3=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt3=1;
                }
                break;
            case Integer:
                {
                alt3=2;
                }
                break;
            case Bool:
                {
                alt3=3;
                }
                break;
            case Real:
                {
                alt3=4;
                }
                break;
            case UnlimitedNatural:
                {
                alt3=5;
                }
                break;
            case Enumeration:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmallUmlParser.g:238:3: this_String0_0= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_0=ruleString0();

                    state._fsp--;


                    			current = this_String0_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:247:3: this_Integer_1= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_1=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUmlParser.g:256:3: this_Bool_2= ruleBool
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBoolParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bool_2=ruleBool();

                    state._fsp--;


                    			current = this_Bool_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUmlParser.g:265:3: this_Real_3= ruleReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Real_3=ruleReal();

                    state._fsp--;


                    			current = this_Real_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUmlParser.g:274:3: this_UnlimitedNatural_4= ruleUnlimitedNatural
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNatural_4=ruleUnlimitedNatural();

                    state._fsp--;


                    			current = this_UnlimitedNatural_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmallUmlParser.g:283:3: this_Enumeration_5= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_5=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUmlParser.g:295:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUmlParser.g:295:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUmlParser.g:296:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUmlParser.g:302:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:308:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUmlParser.g:309:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUmlParser.g:309:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUmlParser.g:310:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:318:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUmlParser.g:329:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUmlParser.g:329:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUmlParser.g:330:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUmlParser.g:336:1: ruleClass returns [EObject current=null] : ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? otherlv_5= LeftCurlyBracket (this_BEGIN_6= RULE_BEGIN )? ( ( (lv_method_7_0= ruleMethod ) ) | ( (lv_attribute_8_0= ruleAttribute ) ) )* (this_END_9= RULE_END )? otherlv_10= RightCurlyBracket ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_method_7_0 = null;

        EObject lv_attribute_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:342:2: ( ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? otherlv_5= LeftCurlyBracket (this_BEGIN_6= RULE_BEGIN )? ( ( (lv_method_7_0= ruleMethod ) ) | ( (lv_attribute_8_0= ruleAttribute ) ) )* (this_END_9= RULE_END )? otherlv_10= RightCurlyBracket ) )
            // InternalSmallUmlParser.g:343:2: ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? otherlv_5= LeftCurlyBracket (this_BEGIN_6= RULE_BEGIN )? ( ( (lv_method_7_0= ruleMethod ) ) | ( (lv_attribute_8_0= ruleAttribute ) ) )* (this_END_9= RULE_END )? otherlv_10= RightCurlyBracket )
            {
            // InternalSmallUmlParser.g:343:2: ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? otherlv_5= LeftCurlyBracket (this_BEGIN_6= RULE_BEGIN )? ( ( (lv_method_7_0= ruleMethod ) ) | ( (lv_attribute_8_0= ruleAttribute ) ) )* (this_END_9= RULE_END )? otherlv_10= RightCurlyBracket )
            // InternalSmallUmlParser.g:344:3: () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? otherlv_5= LeftCurlyBracket (this_BEGIN_6= RULE_BEGIN )? ( ( (lv_method_7_0= ruleMethod ) ) | ( (lv_attribute_8_0= ruleAttribute ) ) )* (this_END_9= RULE_END )? otherlv_10= RightCurlyBracket
            {
            // InternalSmallUmlParser.g:344:3: ()
            // InternalSmallUmlParser.g:345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Class,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUmlParser.g:355:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUmlParser.g:356:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUmlParser.g:356:4: (lv_name_2_0= ruleEString )
            // InternalSmallUmlParser.g:357:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUmlParser.g:374:3: (otherlv_3= Extends ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUmlParser.g:375:4: otherlv_3= Extends ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Extends,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSmallUmlParser.g:379:4: ( ( ruleEString ) )
                    // InternalSmallUmlParser.g:380:5: ( ruleEString )
                    {
                    // InternalSmallUmlParser.g:380:5: ( ruleEString )
                    // InternalSmallUmlParser.g:381:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUmlParser.g:400:3: (this_BEGIN_6= RULE_BEGIN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BEGIN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUmlParser.g:401:4: this_BEGIN_6= RULE_BEGIN
                    {
                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

                    				newLeafNode(this_BEGIN_6, grammarAccess.getClassAccess().getBEGINTerminalRuleCall_5());
                    			

                    }
                    break;

            }

            // InternalSmallUmlParser.g:406:3: ( ( (lv_method_7_0= ruleMethod ) ) | ( (lv_attribute_8_0= ruleAttribute ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==PlusSign) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_STRING) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==LeftParenthesis) ) {
                            alt7=1;
                        }
                        else if ( (LA7_3==Colon) ) {
                            alt7=2;
                        }


                    }
                    else if ( (LA7_2==RULE_ID) ) {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==Colon) ) {
                            alt7=2;
                        }
                        else if ( (LA7_4==LeftParenthesis) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallUmlParser.g:407:4: ( (lv_method_7_0= ruleMethod ) )
            	    {
            	    // InternalSmallUmlParser.g:407:4: ( (lv_method_7_0= ruleMethod ) )
            	    // InternalSmallUmlParser.g:408:5: (lv_method_7_0= ruleMethod )
            	    {
            	    // InternalSmallUmlParser.g:408:5: (lv_method_7_0= ruleMethod )
            	    // InternalSmallUmlParser.g:409:6: lv_method_7_0= ruleMethod
            	    {

            	    						newCompositeNode(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_method_7_0=ruleMethod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"method",
            	    							lv_method_7_0,
            	    							"org.smalluml.SmallUml.Method");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSmallUmlParser.g:427:4: ( (lv_attribute_8_0= ruleAttribute ) )
            	    {
            	    // InternalSmallUmlParser.g:427:4: ( (lv_attribute_8_0= ruleAttribute ) )
            	    // InternalSmallUmlParser.g:428:5: (lv_attribute_8_0= ruleAttribute )
            	    {
            	    // InternalSmallUmlParser.g:428:5: (lv_attribute_8_0= ruleAttribute )
            	    // InternalSmallUmlParser.g:429:6: lv_attribute_8_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_attribute_8_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attribute",
            	    							lv_attribute_8_0,
            	    							"org.smalluml.SmallUml.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSmallUmlParser.g:447:3: (this_END_9= RULE_END )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_END) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUmlParser.g:448:4: this_END_9= RULE_END
                    {
                    this_END_9=(Token)match(input,RULE_END,FOLLOW_10); 

                    				newLeafNode(this_END_9, grammarAccess.getClassAccess().getENDTerminalRuleCall_7());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUmlParser.g:461:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUmlParser.g:461:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUmlParser.g:462:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUmlParser.g:468:1: ruleAttribute returns [EObject current=null] : (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:474:2: ( (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSmallUmlParser.g:475:2: (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSmallUmlParser.g:475:2: (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) )
            // InternalSmallUmlParser.g:476:3: otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,PlusSign,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getPlusSignKeyword_0());
            		
            // InternalSmallUmlParser.g:480:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUmlParser.g:481:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUmlParser.g:481:4: (lv_name_1_0= ruleEString )
            // InternalSmallUmlParser.g:482:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSmallUmlParser.g:503:3: ( (lv_type_3_0= ruleType ) )
            // InternalSmallUmlParser.g:504:4: (lv_type_3_0= ruleType )
            {
            // InternalSmallUmlParser.g:504:4: (lv_type_3_0= ruleType )
            // InternalSmallUmlParser.g:505:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.smalluml.SmallUml.Type");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUmlParser.g:526:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUmlParser.g:526:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUmlParser.g:527:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSmallUmlParser.g:533:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;

        EObject lv_returnType_9_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:539:2: ( ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? ) )
            // InternalSmallUmlParser.g:540:2: ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? )
            {
            // InternalSmallUmlParser.g:540:2: ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? )
            // InternalSmallUmlParser.g:541:3: () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )?
            {
            // InternalSmallUmlParser.g:541:3: ()
            // InternalSmallUmlParser.g:542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PlusSign,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getPlusSignKeyword_1());
            		
            // InternalSmallUmlParser.g:552:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUmlParser.g:553:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUmlParser.g:553:4: (lv_name_2_0= ruleEString )
            // InternalSmallUmlParser.g:554:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmallUmlParser.g:575:3: ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUmlParser.g:576:4: ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )*
                    {
                    // InternalSmallUmlParser.g:576:4: ( (lv_parameter_4_0= ruleParameter ) )
                    // InternalSmallUmlParser.g:577:5: (lv_parameter_4_0= ruleParameter )
                    {
                    // InternalSmallUmlParser.g:577:5: (lv_parameter_4_0= ruleParameter )
                    // InternalSmallUmlParser.g:578:6: lv_parameter_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_parameter_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_4_0,
                    							"org.smalluml.SmallUml.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUmlParser.g:595:4: (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSmallUmlParser.g:596:5: otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSmallUmlParser.g:600:5: ( (lv_parameter_6_0= ruleParameter ) )
                    	    // InternalSmallUmlParser.g:601:6: (lv_parameter_6_0= ruleParameter )
                    	    {
                    	    // InternalSmallUmlParser.g:601:6: (lv_parameter_6_0= ruleParameter )
                    	    // InternalSmallUmlParser.g:602:7: lv_parameter_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_parameter_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_6_0,
                    	    								"org.smalluml.SmallUml.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
            		
            // InternalSmallUmlParser.g:625:3: (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Colon) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=UnlimitedNatural && LA11_1<=Integer)||LA11_1==String||(LA11_1>=Bool && LA11_1<=Real)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUmlParser.g:626:4: otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) )
                    {
                    otherlv_8=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getColonKeyword_6_0());
                    			
                    // InternalSmallUmlParser.g:630:4: ( (lv_returnType_9_0= ruleType ) )
                    // InternalSmallUmlParser.g:631:5: (lv_returnType_9_0= ruleType )
                    {
                    // InternalSmallUmlParser.g:631:5: (lv_returnType_9_0= ruleType )
                    // InternalSmallUmlParser.g:632:6: lv_returnType_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_returnType_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_9_0,
                    							"org.smalluml.SmallUml.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUmlParser.g:654:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUmlParser.g:654:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUmlParser.g:655:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSmallUmlParser.g:661:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:667:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) )
            // InternalSmallUmlParser.g:668:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalSmallUmlParser.g:668:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
            // InternalSmallUmlParser.g:669:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) )
            {
            // InternalSmallUmlParser.g:669:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSmallUmlParser.g:670:4: (lv_name_0_0= ruleEString )
            {
            // InternalSmallUmlParser.g:670:4: (lv_name_0_0= ruleEString )
            // InternalSmallUmlParser.g:671:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalSmallUmlParser.g:692:3: ( (lv_type_2_0= ruleType ) )
            // InternalSmallUmlParser.g:693:4: (lv_type_2_0= ruleType )
            {
            // InternalSmallUmlParser.g:693:4: (lv_type_2_0= ruleType )
            // InternalSmallUmlParser.g:694:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.smalluml.SmallUml.Type");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleComposition"
    // InternalSmallUmlParser.g:715:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalSmallUmlParser.g:715:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalSmallUmlParser.g:716:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalSmallUmlParser.g:722:1: ruleComposition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( ( ruleEString ) ) ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:728:2: ( ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( ( ruleEString ) ) ) )
            // InternalSmallUmlParser.g:729:2: ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( ( ruleEString ) ) )
            {
            // InternalSmallUmlParser.g:729:2: ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( ( ruleEString ) ) )
            // InternalSmallUmlParser.g:730:3: ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( ( ruleEString ) )
            {
            // InternalSmallUmlParser.g:730:3: ( (lv_name_0_0= ruleEString ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUmlParser.g:731:4: (lv_name_0_0= ruleEString )
                    {
                    // InternalSmallUmlParser.g:731:4: (lv_name_0_0= ruleEString )
                    // InternalSmallUmlParser.g:732:5: lv_name_0_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompositionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.smalluml.SmallUml.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getColonKeyword_1());
            		
            // InternalSmallUmlParser.g:753:3: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:754:4: ( ruleEString )
            {
            // InternalSmallUmlParser.g:754:4: ( ruleEString )
            // InternalSmallUmlParser.g:755:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositionAccess().getSourceRoleCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LessThanSignGreaterThanSignHyphenMinusHyphenMinus,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getLessThanSignGreaterThanSignHyphenMinusHyphenMinusKeyword_3());
            		
            // InternalSmallUmlParser.g:773:3: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:774:4: ( ruleEString )
            {
            // InternalSmallUmlParser.g:774:4: ( ruleEString )
            // InternalSmallUmlParser.g:775:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositionAccess().getTargetRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleReference"
    // InternalSmallUmlParser.g:793:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSmallUmlParser.g:793:50: (iv_ruleReference= ruleReference EOF )
            // InternalSmallUmlParser.g:794:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalSmallUmlParser.g:800:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( ( ruleEString ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:806:2: ( ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( ( ruleEString ) ) ) )
            // InternalSmallUmlParser.g:807:2: ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( ( ruleEString ) ) )
            {
            // InternalSmallUmlParser.g:807:2: ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( ( ruleEString ) ) )
            // InternalSmallUmlParser.g:808:3: ( (lv_name_0_0= ruleEString ) )? otherlv_1= Colon ( ( ruleEString ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( ( ruleEString ) )
            {
            // InternalSmallUmlParser.g:808:3: ( (lv_name_0_0= ruleEString ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUmlParser.g:809:4: (lv_name_0_0= ruleEString )
                    {
                    // InternalSmallUmlParser.g:809:4: (lv_name_0_0= ruleEString )
                    // InternalSmallUmlParser.g:810:5: lv_name_0_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReferenceRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.smalluml.SmallUml.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getColonKeyword_1());
            		
            // InternalSmallUmlParser.g:831:3: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:832:4: ( ruleEString )
            {
            // InternalSmallUmlParser.g:832:4: ( ruleEString )
            // InternalSmallUmlParser.g:833:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getSourceRoleCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,HyphenMinusHyphenMinusHyphenMinusGreaterThanSign,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalSmallUmlParser.g:851:3: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:852:4: ( ruleEString )
            {
            // InternalSmallUmlParser.g:852:4: ( ruleEString )
            // InternalSmallUmlParser.g:853:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUmlParser.g:871:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUmlParser.g:871:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUmlParser.g:872:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUmlParser.g:878:1: ruleRole returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) )? otherlv_2= LeftParenthesis ( ( ruleEString ) ) (otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket )? otherlv_10= RightParenthesis ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:884:2: ( ( () ( (lv_name_1_0= ruleEString ) )? otherlv_2= LeftParenthesis ( ( ruleEString ) ) (otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket )? otherlv_10= RightParenthesis ) )
            // InternalSmallUmlParser.g:885:2: ( () ( (lv_name_1_0= ruleEString ) )? otherlv_2= LeftParenthesis ( ( ruleEString ) ) (otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket )? otherlv_10= RightParenthesis )
            {
            // InternalSmallUmlParser.g:885:2: ( () ( (lv_name_1_0= ruleEString ) )? otherlv_2= LeftParenthesis ( ( ruleEString ) ) (otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket )? otherlv_10= RightParenthesis )
            // InternalSmallUmlParser.g:886:3: () ( (lv_name_1_0= ruleEString ) )? otherlv_2= LeftParenthesis ( ( ruleEString ) ) (otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket )? otherlv_10= RightParenthesis
            {
            // InternalSmallUmlParser.g:886:3: ()
            // InternalSmallUmlParser.g:887:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            // InternalSmallUmlParser.g:893:3: ( (lv_name_1_0= ruleEString ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUmlParser.g:894:4: (lv_name_1_0= ruleEString )
                    {
                    // InternalSmallUmlParser.g:894:4: (lv_name_1_0= ruleEString )
                    // InternalSmallUmlParser.g:895:5: lv_name_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.smalluml.SmallUml.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSmallUmlParser.g:916:3: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:917:4: ( ruleEString )
            {
            // InternalSmallUmlParser.g:917:4: ( ruleEString )
            // InternalSmallUmlParser.g:918:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getClassClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUmlParser.g:932:3: (otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Comma) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUmlParser.g:933:4: otherlv_4= Comma otherlv_5= LeftSquareBracket ( (lv_lowerBound_6_0= ruleEInt ) ) otherlv_7= Comma ( (lv_upperBound_8_0= ruleEInt ) ) otherlv_9= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getCommaKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalSmallUmlParser.g:941:4: ( (lv_lowerBound_6_0= ruleEInt ) )
                    // InternalSmallUmlParser.g:942:5: (lv_lowerBound_6_0= ruleEInt )
                    {
                    // InternalSmallUmlParser.g:942:5: (lv_lowerBound_6_0= ruleEInt )
                    // InternalSmallUmlParser.g:943:6: lv_lowerBound_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_lowerBound_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_6_0,
                    							"org.smalluml.SmallUml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,Comma,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getCommaKeyword_4_3());
                    			
                    // InternalSmallUmlParser.g:964:4: ( (lv_upperBound_8_0= ruleEInt ) )
                    // InternalSmallUmlParser.g:965:5: (lv_upperBound_8_0= ruleEInt )
                    {
                    // InternalSmallUmlParser.g:965:5: (lv_upperBound_8_0= ruleEInt )
                    // InternalSmallUmlParser.g:966:6: lv_upperBound_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_upperBound_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_8_0,
                    							"org.smalluml.SmallUml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleString0"
    // InternalSmallUmlParser.g:996:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUmlParser.g:996:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUmlParser.g:997:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUmlParser.g:1003:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= String ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1009:2: ( ( () otherlv_1= String ) )
            // InternalSmallUmlParser.g:1010:2: ( () otherlv_1= String )
            {
            // InternalSmallUmlParser.g:1010:2: ( () otherlv_1= String )
            // InternalSmallUmlParser.g:1011:3: () otherlv_1= String
            {
            // InternalSmallUmlParser.g:1011:3: ()
            // InternalSmallUmlParser.g:1012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUmlParser.g:1026:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUmlParser.g:1026:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUmlParser.g:1027:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUmlParser.g:1033:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= Integer ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1039:2: ( ( () otherlv_1= Integer ) )
            // InternalSmallUmlParser.g:1040:2: ( () otherlv_1= Integer )
            {
            // InternalSmallUmlParser.g:1040:2: ( () otherlv_1= Integer )
            // InternalSmallUmlParser.g:1041:3: () otherlv_1= Integer
            {
            // InternalSmallUmlParser.g:1041:3: ()
            // InternalSmallUmlParser.g:1042:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBool"
    // InternalSmallUmlParser.g:1056:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalSmallUmlParser.g:1056:45: (iv_ruleBool= ruleBool EOF )
            // InternalSmallUmlParser.g:1057:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalSmallUmlParser.g:1063:1: ruleBool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1069:2: ( ( () otherlv_1= Bool ) )
            // InternalSmallUmlParser.g:1070:2: ( () otherlv_1= Bool )
            {
            // InternalSmallUmlParser.g:1070:2: ( () otherlv_1= Bool )
            // InternalSmallUmlParser.g:1071:3: () otherlv_1= Bool
            {
            // InternalSmallUmlParser.g:1071:3: ()
            // InternalSmallUmlParser.g:1072:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Bool,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
            		

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUmlParser.g:1086:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSmallUmlParser.g:1086:45: (iv_ruleReal= ruleReal EOF )
            // InternalSmallUmlParser.g:1087:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal; 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUmlParser.g:1093:1: ruleReal returns [EObject current=null] : ( () otherlv_1= Real ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1099:2: ( ( () otherlv_1= Real ) )
            // InternalSmallUmlParser.g:1100:2: ( () otherlv_1= Real )
            {
            // InternalSmallUmlParser.g:1100:2: ( () otherlv_1= Real )
            // InternalSmallUmlParser.g:1101:3: () otherlv_1= Real
            {
            // InternalSmallUmlParser.g:1101:3: ()
            // InternalSmallUmlParser.g:1102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Real,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalSmallUmlParser.g:1116:1: entryRuleUnlimitedNatural returns [EObject current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final EObject entryRuleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNatural = null;


        try {
            // InternalSmallUmlParser.g:1116:57: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // InternalSmallUmlParser.g:1117:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();

            state._fsp--;

             current =iv_ruleUnlimitedNatural; 
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
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalSmallUmlParser.g:1123:1: ruleUnlimitedNatural returns [EObject current=null] : ( () otherlv_1= UnlimitedNatural ) ;
    public final EObject ruleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1129:2: ( ( () otherlv_1= UnlimitedNatural ) )
            // InternalSmallUmlParser.g:1130:2: ( () otherlv_1= UnlimitedNatural )
            {
            // InternalSmallUmlParser.g:1130:2: ( () otherlv_1= UnlimitedNatural )
            // InternalSmallUmlParser.g:1131:3: () otherlv_1= UnlimitedNatural
            {
            // InternalSmallUmlParser.g:1131:3: ()
            // InternalSmallUmlParser.g:1132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,UnlimitedNatural,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1());
            		

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
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUmlParser.g:1146:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUmlParser.g:1146:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUmlParser.g:1147:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUmlParser.g:1153:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= Enumeration otherlv_1= LeftCurlyBracket otherlv_2= Value otherlv_3= LeftCurlyBracket ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= RightCurlyBracket otherlv_8= RightCurlyBracket ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_value_4_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:1159:2: ( (otherlv_0= Enumeration otherlv_1= LeftCurlyBracket otherlv_2= Value otherlv_3= LeftCurlyBracket ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= RightCurlyBracket otherlv_8= RightCurlyBracket ) )
            // InternalSmallUmlParser.g:1160:2: (otherlv_0= Enumeration otherlv_1= LeftCurlyBracket otherlv_2= Value otherlv_3= LeftCurlyBracket ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= RightCurlyBracket otherlv_8= RightCurlyBracket )
            {
            // InternalSmallUmlParser.g:1160:2: (otherlv_0= Enumeration otherlv_1= LeftCurlyBracket otherlv_2= Value otherlv_3= LeftCurlyBracket ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= RightCurlyBracket otherlv_8= RightCurlyBracket )
            // InternalSmallUmlParser.g:1161:3: otherlv_0= Enumeration otherlv_1= LeftCurlyBracket otherlv_2= Value otherlv_3= LeftCurlyBracket ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= RightCurlyBracket otherlv_8= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Enumeration,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,Value,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getValueKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUmlParser.g:1177:3: ( (lv_value_4_0= ruleString0 ) )
            // InternalSmallUmlParser.g:1178:4: (lv_value_4_0= ruleString0 )
            {
            // InternalSmallUmlParser.g:1178:4: (lv_value_4_0= ruleString0 )
            // InternalSmallUmlParser.g:1179:5: lv_value_4_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_value_4_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.smalluml.SmallUml.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUmlParser.g:1196:3: (otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallUmlParser.g:1197:4: otherlv_5= Comma ( (lv_value_6_0= ruleString0 ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FOLLOW_25); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUmlParser.g:1201:4: ( (lv_value_6_0= ruleString0 ) )
            	    // InternalSmallUmlParser.g:1202:5: (lv_value_6_0= ruleString0 )
            	    {
            	    // InternalSmallUmlParser.g:1202:5: (lv_value_6_0= ruleString0 )
            	    // InternalSmallUmlParser.g:1203:6: lv_value_6_0= ruleString0
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_value_6_0=ruleString0();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_6_0,
            	    							"org.smalluml.SmallUml.String0");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUmlParser.g:1233:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUmlParser.g:1233:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUmlParser.g:1234:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUmlParser.g:1240:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1246:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalSmallUmlParser.g:1247:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalSmallUmlParser.g:1247:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalSmallUmlParser.g:1248:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalSmallUmlParser.g:1248:3: (kw= HyphenMinus )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUmlParser.g:1249:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\7\1\uffff\1\34\2\20\1\uffff\1\34\1\uffff\2\20\1\4\2\14\5\uffff";
    static final String dfa_3s = "\1\36\1\uffff\1\36\2\25\1\uffff\1\36\1\uffff\2\25\1\36\2\15\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\5\1\uffff\1\10\5\uffff\1\2\1\3\1\4\1\7\1\6";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\2\uffff\1\1\5\uffff\1\5\1\uffff\1\2\2\uffff\1\6\6\uffff\1\4\1\uffff\1\3",
            "",
            "\1\11\1\uffff\1\10",
            "\1\5\4\uffff\1\12",
            "\1\5\4\uffff\1\12",
            "",
            "\1\14\1\uffff\1\13",
            "",
            "\1\16\4\uffff\1\15",
            "\1\16\4\uffff\1\15",
            "\3\17\2\uffff\1\17\4\uffff\2\17\14\uffff\1\14\1\uffff\1\13",
            "\1\20\1\21",
            "\1\20\1\21",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "147:2: (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000058250480L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000A040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000C270L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000050020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});

}
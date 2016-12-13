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

                if ( (LA1_0==Package||LA1_0==Class||LA1_0==Enum||LA1_0==LeftParenthesis||LA1_0==PlusSign||LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
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
    // InternalSmallUmlParser.g:140:1: ruleNamedElement returns [EObject current=null] : (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage | this_Enumeration_8= ruleEnumeration ) ;
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

        EObject this_Enumeration_8 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:146:2: ( (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage | this_Enumeration_8= ruleEnumeration ) )
            // InternalSmallUmlParser.g:147:2: (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage | this_Enumeration_8= ruleEnumeration )
            {
            // InternalSmallUmlParser.g:147:2: (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage | this_Enumeration_8= ruleEnumeration )
            int alt2=9;
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
                case 9 :
                    // InternalSmallUmlParser.g:220:3: this_Enumeration_8= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getEnumerationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_8=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_8;
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
    // InternalSmallUmlParser.g:232:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUmlParser.g:232:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUmlParser.g:233:2: iv_ruleType= ruleType EOF
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
    // InternalSmallUmlParser.g:239:1: ruleType returns [EObject current=null] : (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) ;
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
            // InternalSmallUmlParser.g:245:2: ( (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) )
            // InternalSmallUmlParser.g:246:2: (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            {
            // InternalSmallUmlParser.g:246:2: (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
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
            case Enum:
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
                    // InternalSmallUmlParser.g:247:3: this_String0_0= ruleString0
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
                    // InternalSmallUmlParser.g:256:3: this_Integer_1= ruleInteger
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
                    // InternalSmallUmlParser.g:265:3: this_Bool_2= ruleBool
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
                    // InternalSmallUmlParser.g:274:3: this_Real_3= ruleReal
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
                    // InternalSmallUmlParser.g:283:3: this_UnlimitedNatural_4= ruleUnlimitedNatural
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
                    // InternalSmallUmlParser.g:292:3: this_Enumeration_5= ruleEnumeration
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
    // InternalSmallUmlParser.g:304:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUmlParser.g:304:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUmlParser.g:305:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUmlParser.g:311:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:317:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUmlParser.g:318:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUmlParser.g:318:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSmallUmlParser.g:319:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUmlParser.g:327:3: this_ID_1= RULE_ID
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
    // InternalSmallUmlParser.g:338:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUmlParser.g:338:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUmlParser.g:339:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUmlParser.g:345:1: ruleClass returns [EObject current=null] : ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? (this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_5=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_method_6_0 = null;

        EObject lv_attribute_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:351:2: ( ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? (this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END )? ) )
            // InternalSmallUmlParser.g:352:2: ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? (this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END )? )
            {
            // InternalSmallUmlParser.g:352:2: ( () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? (this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END )? )
            // InternalSmallUmlParser.g:353:3: () otherlv_1= Class ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Extends ( ( ruleEString ) ) )? (this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END )?
            {
            // InternalSmallUmlParser.g:353:3: ()
            // InternalSmallUmlParser.g:354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Class,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUmlParser.g:364:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUmlParser.g:365:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUmlParser.g:365:4: (lv_name_2_0= ruleEString )
            // InternalSmallUmlParser.g:366:5: lv_name_2_0= ruleEString
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

            // InternalSmallUmlParser.g:383:3: (otherlv_3= Extends ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUmlParser.g:384:4: otherlv_3= Extends ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Extends,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSmallUmlParser.g:388:4: ( ( ruleEString ) )
                    // InternalSmallUmlParser.g:389:5: ( ruleEString )
                    {
                    // InternalSmallUmlParser.g:389:5: ( ruleEString )
                    // InternalSmallUmlParser.g:390:6: ruleEString
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

            // InternalSmallUmlParser.g:405:3: (this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEGIN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUmlParser.g:406:4: this_BEGIN_5= RULE_BEGIN ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )* this_END_8= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    				newLeafNode(this_BEGIN_5, grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalSmallUmlParser.g:410:4: ( ( (lv_method_6_0= ruleMethod ) ) | ( (lv_attribute_7_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==PlusSign) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==RULE_STRING) ) {
                                int LA6_3 = input.LA(3);

                                if ( (LA6_3==Colon) ) {
                                    alt6=2;
                                }
                                else if ( (LA6_3==LeftParenthesis) ) {
                                    alt6=1;
                                }


                            }
                            else if ( (LA6_2==RULE_ID) ) {
                                int LA6_4 = input.LA(3);

                                if ( (LA6_4==LeftParenthesis) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_4==Colon) ) {
                                    alt6=2;
                                }


                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUmlParser.g:411:5: ( (lv_method_6_0= ruleMethod ) )
                    	    {
                    	    // InternalSmallUmlParser.g:411:5: ( (lv_method_6_0= ruleMethod ) )
                    	    // InternalSmallUmlParser.g:412:6: (lv_method_6_0= ruleMethod )
                    	    {
                    	    // InternalSmallUmlParser.g:412:6: (lv_method_6_0= ruleMethod )
                    	    // InternalSmallUmlParser.g:413:7: lv_method_6_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_4_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_method_6_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"method",
                    	    								lv_method_6_0,
                    	    								"org.smalluml.SmallUml.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmallUmlParser.g:431:5: ( (lv_attribute_7_0= ruleAttribute ) )
                    	    {
                    	    // InternalSmallUmlParser.g:431:5: ( (lv_attribute_7_0= ruleAttribute ) )
                    	    // InternalSmallUmlParser.g:432:6: (lv_attribute_7_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUmlParser.g:432:6: (lv_attribute_7_0= ruleAttribute )
                    	    // InternalSmallUmlParser.g:433:7: lv_attribute_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_attribute_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_7_0,
                    	    								"org.smalluml.SmallUml.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_8, grammarAccess.getClassAccess().getENDTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUmlParser.g:460:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUmlParser.g:460:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUmlParser.g:461:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUmlParser.g:467:1: ruleAttribute returns [EObject current=null] : (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:473:2: ( (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSmallUmlParser.g:474:2: (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSmallUmlParser.g:474:2: (otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) )
            // InternalSmallUmlParser.g:475:3: otherlv_0= PlusSign ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,PlusSign,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getPlusSignKeyword_0());
            		
            // InternalSmallUmlParser.g:479:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUmlParser.g:480:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUmlParser.g:480:4: (lv_name_1_0= ruleEString )
            // InternalSmallUmlParser.g:481:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSmallUmlParser.g:502:3: ( (lv_type_3_0= ruleType ) )
            // InternalSmallUmlParser.g:503:4: (lv_type_3_0= ruleType )
            {
            // InternalSmallUmlParser.g:503:4: (lv_type_3_0= ruleType )
            // InternalSmallUmlParser.g:504:5: lv_type_3_0= ruleType
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
    // InternalSmallUmlParser.g:525:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUmlParser.g:525:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUmlParser.g:526:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalSmallUmlParser.g:532:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? ) ;
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
            // InternalSmallUmlParser.g:538:2: ( ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? ) )
            // InternalSmallUmlParser.g:539:2: ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? )
            {
            // InternalSmallUmlParser.g:539:2: ( () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )? )
            // InternalSmallUmlParser.g:540:3: () otherlv_1= PlusSign ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftParenthesis ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )?
            {
            // InternalSmallUmlParser.g:540:3: ()
            // InternalSmallUmlParser.g:541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PlusSign,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getPlusSignKeyword_1());
            		
            // InternalSmallUmlParser.g:551:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUmlParser.g:552:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUmlParser.g:552:4: (lv_name_2_0= ruleEString )
            // InternalSmallUmlParser.g:553:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmallUmlParser.g:574:3: ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUmlParser.g:575:4: ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )*
                    {
                    // InternalSmallUmlParser.g:575:4: ( (lv_parameter_4_0= ruleParameter ) )
                    // InternalSmallUmlParser.g:576:5: (lv_parameter_4_0= ruleParameter )
                    {
                    // InternalSmallUmlParser.g:576:5: (lv_parameter_4_0= ruleParameter )
                    // InternalSmallUmlParser.g:577:6: lv_parameter_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalSmallUmlParser.g:594:4: (otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUmlParser.g:595:5: otherlv_5= Comma ( (lv_parameter_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSmallUmlParser.g:599:5: ( (lv_parameter_6_0= ruleParameter ) )
                    	    // InternalSmallUmlParser.g:600:6: (lv_parameter_6_0= ruleParameter )
                    	    {
                    	    // InternalSmallUmlParser.g:600:6: (lv_parameter_6_0= ruleParameter )
                    	    // InternalSmallUmlParser.g:601:7: lv_parameter_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
            		
            // InternalSmallUmlParser.g:624:3: (otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Colon) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUmlParser.g:625:4: otherlv_8= Colon ( (lv_returnType_9_0= ruleType ) )
                    {
                    otherlv_8=(Token)match(input,Colon,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getColonKeyword_6_0());
                    			
                    // InternalSmallUmlParser.g:629:4: ( (lv_returnType_9_0= ruleType ) )
                    // InternalSmallUmlParser.g:630:5: (lv_returnType_9_0= ruleType )
                    {
                    // InternalSmallUmlParser.g:630:5: (lv_returnType_9_0= ruleType )
                    // InternalSmallUmlParser.g:631:6: lv_returnType_9_0= ruleType
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
    // InternalSmallUmlParser.g:653:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUmlParser.g:653:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUmlParser.g:654:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSmallUmlParser.g:660:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:666:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) )
            // InternalSmallUmlParser.g:667:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalSmallUmlParser.g:667:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
            // InternalSmallUmlParser.g:668:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) )
            {
            // InternalSmallUmlParser.g:668:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSmallUmlParser.g:669:4: (lv_name_0_0= ruleEString )
            {
            // InternalSmallUmlParser.g:669:4: (lv_name_0_0= ruleEString )
            // InternalSmallUmlParser.g:670:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalSmallUmlParser.g:691:3: ( (lv_type_2_0= ruleType ) )
            // InternalSmallUmlParser.g:692:4: (lv_type_2_0= ruleType )
            {
            // InternalSmallUmlParser.g:692:4: (lv_type_2_0= ruleType )
            // InternalSmallUmlParser.g:693:5: lv_type_2_0= ruleType
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
    // InternalSmallUmlParser.g:714:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalSmallUmlParser.g:714:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalSmallUmlParser.g:715:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalSmallUmlParser.g:721:1: ruleComposition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( (lv_target_4_0= ruleRole ) ) ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_source_2_0 = null;

        EObject lv_target_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:727:2: ( ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( (lv_target_4_0= ruleRole ) ) ) )
            // InternalSmallUmlParser.g:728:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( (lv_target_4_0= ruleRole ) ) )
            {
            // InternalSmallUmlParser.g:728:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( (lv_target_4_0= ruleRole ) ) )
            // InternalSmallUmlParser.g:729:3: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= LessThanSignGreaterThanSignHyphenMinusHyphenMinus ( (lv_target_4_0= ruleRole ) )
            {
            // InternalSmallUmlParser.g:729:3: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==Colon) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==Colon) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUmlParser.g:730:4: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon
                    {
                    // InternalSmallUmlParser.g:730:4: ( (lv_name_0_0= ruleEString ) )
                    // InternalSmallUmlParser.g:731:5: (lv_name_0_0= ruleEString )
                    {
                    // InternalSmallUmlParser.g:731:5: (lv_name_0_0= ruleEString )
                    // InternalSmallUmlParser.g:732:6: lv_name_0_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalSmallUmlParser.g:754:3: ( (lv_source_2_0= ruleRole ) )
            // InternalSmallUmlParser.g:755:4: (lv_source_2_0= ruleRole )
            {
            // InternalSmallUmlParser.g:755:4: (lv_source_2_0= ruleRole )
            // InternalSmallUmlParser.g:756:5: lv_source_2_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getSourceRoleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_source_2_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"org.smalluml.SmallUml.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LessThanSignGreaterThanSignHyphenMinusHyphenMinus,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getLessThanSignGreaterThanSignHyphenMinusHyphenMinusKeyword_2());
            		
            // InternalSmallUmlParser.g:777:3: ( (lv_target_4_0= ruleRole ) )
            // InternalSmallUmlParser.g:778:4: (lv_target_4_0= ruleRole )
            {
            // InternalSmallUmlParser.g:778:4: (lv_target_4_0= ruleRole )
            // InternalSmallUmlParser.g:779:5: lv_target_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getTargetRoleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.smalluml.SmallUml.Role");
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
    // InternalSmallUmlParser.g:800:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSmallUmlParser.g:800:50: (iv_ruleReference= ruleReference EOF )
            // InternalSmallUmlParser.g:801:2: iv_ruleReference= ruleReference EOF
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
    // InternalSmallUmlParser.g:807:1: ruleReference returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( (lv_target_4_0= ruleRole ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_source_2_0 = null;

        EObject lv_target_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:813:2: ( ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( (lv_target_4_0= ruleRole ) ) ) )
            // InternalSmallUmlParser.g:814:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( (lv_target_4_0= ruleRole ) ) )
            {
            // InternalSmallUmlParser.g:814:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( (lv_target_4_0= ruleRole ) ) )
            // InternalSmallUmlParser.g:815:3: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )? ( (lv_source_2_0= ruleRole ) ) otherlv_3= HyphenMinusHyphenMinusHyphenMinusGreaterThanSign ( (lv_target_4_0= ruleRole ) )
            {
            // InternalSmallUmlParser.g:815:3: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon )?
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
                    // InternalSmallUmlParser.g:816:4: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon
                    {
                    // InternalSmallUmlParser.g:816:4: ( (lv_name_0_0= ruleEString ) )
                    // InternalSmallUmlParser.g:817:5: (lv_name_0_0= ruleEString )
                    {
                    // InternalSmallUmlParser.g:817:5: (lv_name_0_0= ruleEString )
                    // InternalSmallUmlParser.g:818:6: lv_name_0_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalSmallUmlParser.g:840:3: ( (lv_source_2_0= ruleRole ) )
            // InternalSmallUmlParser.g:841:4: (lv_source_2_0= ruleRole )
            {
            // InternalSmallUmlParser.g:841:4: (lv_source_2_0= ruleRole )
            // InternalSmallUmlParser.g:842:5: lv_source_2_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getSourceRoleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_source_2_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"org.smalluml.SmallUml.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,HyphenMinusHyphenMinusHyphenMinusGreaterThanSign,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSmallUmlParser.g:863:3: ( (lv_target_4_0= ruleRole ) )
            // InternalSmallUmlParser.g:864:4: (lv_target_4_0= ruleRole )
            {
            // InternalSmallUmlParser.g:864:4: (lv_target_4_0= ruleRole )
            // InternalSmallUmlParser.g:865:5: lv_target_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetRoleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.smalluml.SmallUml.Role");
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
    // InternalSmallUmlParser.g:886:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUmlParser.g:886:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUmlParser.g:887:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUmlParser.g:893:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= LeftParenthesis ( ( ruleEString ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:899:2: ( ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= LeftParenthesis ( ( ruleEString ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket )? otherlv_9= RightParenthesis ) )
            // InternalSmallUmlParser.g:900:2: ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= LeftParenthesis ( ( ruleEString ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket )? otherlv_9= RightParenthesis )
            {
            // InternalSmallUmlParser.g:900:2: ( ( (lv_name_0_0= ruleEString ) )? otherlv_1= LeftParenthesis ( ( ruleEString ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket )? otherlv_9= RightParenthesis )
            // InternalSmallUmlParser.g:901:3: ( (lv_name_0_0= ruleEString ) )? otherlv_1= LeftParenthesis ( ( ruleEString ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket )? otherlv_9= RightParenthesis
            {
            // InternalSmallUmlParser.g:901:3: ( (lv_name_0_0= ruleEString ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUmlParser.g:902:4: (lv_name_0_0= ruleEString )
                    {
                    // InternalSmallUmlParser.g:902:4: (lv_name_0_0= ruleEString )
                    // InternalSmallUmlParser.g:903:5: lv_name_0_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoleRule());
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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSmallUmlParser.g:924:3: ( ( ruleEString ) )
            // InternalSmallUmlParser.g:925:4: ( ruleEString )
            {
            // InternalSmallUmlParser.g:925:4: ( ruleEString )
            // InternalSmallUmlParser.g:926:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getClassClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUmlParser.g:940:3: (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Comma) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUmlParser.g:941:4: otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= Comma ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= RightSquareBracket
                    {
                    otherlv_3=(Token)match(input,Comma,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getCommaKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalSmallUmlParser.g:949:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSmallUmlParser.g:950:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSmallUmlParser.g:950:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSmallUmlParser.g:951:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"org.smalluml.SmallUml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,Comma,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getCommaKeyword_3_3());
                    			
                    // InternalSmallUmlParser.g:972:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSmallUmlParser.g:973:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSmallUmlParser.g:973:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSmallUmlParser.g:974:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"org.smalluml.SmallUml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,RightSquareBracket,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_3_5());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalSmallUmlParser.g:1004:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUmlParser.g:1004:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUmlParser.g:1005:2: iv_ruleString0= ruleString0 EOF
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
    // InternalSmallUmlParser.g:1011:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= String ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1017:2: ( ( () otherlv_1= String ) )
            // InternalSmallUmlParser.g:1018:2: ( () otherlv_1= String )
            {
            // InternalSmallUmlParser.g:1018:2: ( () otherlv_1= String )
            // InternalSmallUmlParser.g:1019:3: () otherlv_1= String
            {
            // InternalSmallUmlParser.g:1019:3: ()
            // InternalSmallUmlParser.g:1020:4: 
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
    // InternalSmallUmlParser.g:1034:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUmlParser.g:1034:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUmlParser.g:1035:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSmallUmlParser.g:1041:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= Integer ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1047:2: ( ( () otherlv_1= Integer ) )
            // InternalSmallUmlParser.g:1048:2: ( () otherlv_1= Integer )
            {
            // InternalSmallUmlParser.g:1048:2: ( () otherlv_1= Integer )
            // InternalSmallUmlParser.g:1049:3: () otherlv_1= Integer
            {
            // InternalSmallUmlParser.g:1049:3: ()
            // InternalSmallUmlParser.g:1050:4: 
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
    // InternalSmallUmlParser.g:1064:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalSmallUmlParser.g:1064:45: (iv_ruleBool= ruleBool EOF )
            // InternalSmallUmlParser.g:1065:2: iv_ruleBool= ruleBool EOF
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
    // InternalSmallUmlParser.g:1071:1: ruleBool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1077:2: ( ( () otherlv_1= Bool ) )
            // InternalSmallUmlParser.g:1078:2: ( () otherlv_1= Bool )
            {
            // InternalSmallUmlParser.g:1078:2: ( () otherlv_1= Bool )
            // InternalSmallUmlParser.g:1079:3: () otherlv_1= Bool
            {
            // InternalSmallUmlParser.g:1079:3: ()
            // InternalSmallUmlParser.g:1080:4: 
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
    // InternalSmallUmlParser.g:1094:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSmallUmlParser.g:1094:45: (iv_ruleReal= ruleReal EOF )
            // InternalSmallUmlParser.g:1095:2: iv_ruleReal= ruleReal EOF
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
    // InternalSmallUmlParser.g:1101:1: ruleReal returns [EObject current=null] : ( () otherlv_1= Real ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1107:2: ( ( () otherlv_1= Real ) )
            // InternalSmallUmlParser.g:1108:2: ( () otherlv_1= Real )
            {
            // InternalSmallUmlParser.g:1108:2: ( () otherlv_1= Real )
            // InternalSmallUmlParser.g:1109:3: () otherlv_1= Real
            {
            // InternalSmallUmlParser.g:1109:3: ()
            // InternalSmallUmlParser.g:1110:4: 
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
    // InternalSmallUmlParser.g:1124:1: entryRuleUnlimitedNatural returns [EObject current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final EObject entryRuleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNatural = null;


        try {
            // InternalSmallUmlParser.g:1124:57: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // InternalSmallUmlParser.g:1125:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
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
    // InternalSmallUmlParser.g:1131:1: ruleUnlimitedNatural returns [EObject current=null] : ( () otherlv_1= UnlimitedNatural ) ;
    public final EObject ruleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1137:2: ( ( () otherlv_1= UnlimitedNatural ) )
            // InternalSmallUmlParser.g:1138:2: ( () otherlv_1= UnlimitedNatural )
            {
            // InternalSmallUmlParser.g:1138:2: ( () otherlv_1= UnlimitedNatural )
            // InternalSmallUmlParser.g:1139:3: () otherlv_1= UnlimitedNatural
            {
            // InternalSmallUmlParser.g:1139:3: ()
            // InternalSmallUmlParser.g:1140:4: 
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
    // InternalSmallUmlParser.g:1154:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUmlParser.g:1154:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUmlParser.g:1155:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSmallUmlParser.g:1161:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= Enum ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftSquareBracket ( (lv_values_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= RightSquareBracket ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;

        AntlrDatatypeRuleToken lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUmlParser.g:1167:2: ( ( () otherlv_1= Enum ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftSquareBracket ( (lv_values_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= RightSquareBracket ) )
            // InternalSmallUmlParser.g:1168:2: ( () otherlv_1= Enum ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftSquareBracket ( (lv_values_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= RightSquareBracket )
            {
            // InternalSmallUmlParser.g:1168:2: ( () otherlv_1= Enum ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftSquareBracket ( (lv_values_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= RightSquareBracket )
            // InternalSmallUmlParser.g:1169:3: () otherlv_1= Enum ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftSquareBracket ( (lv_values_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= RightSquareBracket
            {
            // InternalSmallUmlParser.g:1169:3: ()
            // InternalSmallUmlParser.g:1170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Enum,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
            		
            // InternalSmallUmlParser.g:1180:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUmlParser.g:1181:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUmlParser.g:1181:4: (lv_name_2_0= ruleEString )
            // InternalSmallUmlParser.g:1182:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalSmallUmlParser.g:1203:3: ( (lv_values_4_0= ruleEString ) )
            // InternalSmallUmlParser.g:1204:4: (lv_values_4_0= ruleEString )
            {
            // InternalSmallUmlParser.g:1204:4: (lv_values_4_0= ruleEString )
            // InternalSmallUmlParser.g:1205:5: lv_values_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValuesEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_values_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_4_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUmlParser.g:1222:3: (otherlv_5= Comma ( (lv_values_6_0= ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUmlParser.g:1223:4: otherlv_5= Comma ( (lv_values_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUmlParser.g:1227:4: ( (lv_values_6_0= ruleEString ) )
            	    // InternalSmallUmlParser.g:1228:5: (lv_values_6_0= ruleEString )
            	    {
            	    // InternalSmallUmlParser.g:1228:5: (lv_values_6_0= ruleEString )
            	    // InternalSmallUmlParser.g:1229:6: lv_values_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValuesEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_values_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_6_0,
            	    							"org.smalluml.SmallUml.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalSmallUmlParser.g:1255:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUmlParser.g:1255:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUmlParser.g:1256:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUmlParser.g:1262:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUmlParser.g:1268:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalSmallUmlParser.g:1269:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalSmallUmlParser.g:1269:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalSmallUmlParser.g:1270:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalSmallUmlParser.g:1270:3: (kw= HyphenMinus )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HyphenMinus) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUmlParser.g:1271:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_24); 

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
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\24\uffff\1\31\25\uffff";
    static final String dfa_3s = "\1\6\1\uffff\1\31\2\17\1\31\2\uffff\2\17\1\4\2\20\3\uffff\2\17\1\31\1\25\1\6\2\20\1\23\3\uffff\1\25\1\12\1\32\1\22\2\23\1\32\1\22\1\32\1\26\1\23\1\20\1\32\1\26\1\20";
    static final String dfa_4s = "\1\33\1\uffff\1\33\2\24\1\33\2\uffff\2\24\1\33\2\22\3\uffff\2\17\1\33\1\25\1\33\2\22\1\32\3\uffff\1\25\1\13\1\32\1\22\3\32\1\22\1\32\1\26\1\32\1\20\1\32\1\26\1\20";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\10\1\11\5\uffff\1\2\1\3\1\4\10\uffff\1\6\1\5\1\7\17\uffff";
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
            "\2\17\2\uffff\1\17\3\uffff\3\17\1\22\11\uffff\1\21\1\uffff\1\20",
            "\1\24\1\uffff\1\23",
            "\1\24\1\uffff\1\23",
            "",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\26\1\uffff\1\25",
            "\1\27",
            "\1\31\2\uffff\1\31\1\32\1\30\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\6\uffff\2\31\1\uffff\1\31",
            "\1\34\1\uffff\1\33",
            "\1\34\1\uffff\1\33",
            "\1\35\6\uffff\1\36",
            "",
            "",
            "",
            "\1\37",
            "\1\32\1\30",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "147:2: (this_Class_0= ruleClass | this_Attribute_1= ruleAttribute | this_Method_2= ruleMethod | this_Parameter_3= ruleParameter | this_Role_4= ruleRole | this_Composition_5= ruleComposition | this_Reference_6= ruleReference | this_Package_7= rulePackage | this_Enumeration_8= ruleEnumeration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000B02A240L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000A02F370L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000A008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});

}
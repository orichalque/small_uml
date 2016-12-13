package org.smalluml.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlLexer extends Lexer {
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

    public InternalSmallUmlLexer() {;} 
    public InternalSmallUmlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSmallUmlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSmallUmlLexer.g"; }

    // $ANTLR start "UnlimitedNatural"
    public final void mUnlimitedNatural() throws RecognitionException {
        try {
            int _type = UnlimitedNatural;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:14:18: ( 'UnlimitedNatural' )
            // InternalSmallUmlLexer.g:14:20: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UnlimitedNatural"

    // $ANTLR start "Enumeration"
    public final void mEnumeration() throws RecognitionException {
        try {
            int _type = Enumeration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:16:13: ( 'Enumeration' )
            // InternalSmallUmlLexer.g:16:15: 'Enumeration'
            {
            match("Enumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enumeration"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:18:9: ( 'Integer' )
            // InternalSmallUmlLexer.g:18:11: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:20:9: ( 'Package' )
            // InternalSmallUmlLexer.g:20:11: 'Package'
            {
            match("Package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Package"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:22:9: ( 'extends' )
            // InternalSmallUmlLexer.g:22:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:24:8: ( 'String' )
            // InternalSmallUmlLexer.g:24:10: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:26:7: ( 'Class' )
            // InternalSmallUmlLexer.g:26:9: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:28:7: ( 'value' )
            // InternalSmallUmlLexer.g:28:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "HyphenMinusHyphenMinusHyphenMinusGreaterThanSign"
    public final void mHyphenMinusHyphenMinusHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinusHyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:30:50: ( '--->' )
            // InternalSmallUmlLexer.g:30:52: '--->'
            {
            match("--->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinusHyphenMinusGreaterThanSign"

    // $ANTLR start "LessThanSignGreaterThanSignHyphenMinusHyphenMinus"
    public final void mLessThanSignGreaterThanSignHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSignHyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:32:51: ( '<>--' )
            // InternalSmallUmlLexer.g:32:53: '<>--'
            {
            match("<>--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSignHyphenMinusHyphenMinus"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:34:6: ( 'Bool' )
            // InternalSmallUmlLexer.g:34:8: 'Bool'
            {
            match("Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:36:6: ( 'Real' )
            // InternalSmallUmlLexer.g:36:8: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Real"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:38:17: ( '(' )
            // InternalSmallUmlLexer.g:38:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:40:18: ( ')' )
            // InternalSmallUmlLexer.g:40:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:42:10: ( '+' )
            // InternalSmallUmlLexer.g:42:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:44:7: ( ',' )
            // InternalSmallUmlLexer.g:44:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:46:13: ( '-' )
            // InternalSmallUmlLexer.g:46:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:48:7: ( ':' )
            // InternalSmallUmlLexer.g:48:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:50:19: ( '[' )
            // InternalSmallUmlLexer.g:50:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:52:20: ( ']' )
            // InternalSmallUmlLexer.g:52:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:54:18: ( '{' )
            // InternalSmallUmlLexer.g:54:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:56:19: ( '}' )
            // InternalSmallUmlLexer.g:56:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalSmallUmlLexer.g:60:21: ()
            // InternalSmallUmlLexer.g:60:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalSmallUmlLexer.g:62:19: ()
            // InternalSmallUmlLexer.g:62:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:64:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSmallUmlLexer.g:64:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSmallUmlLexer.g:64:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmallUmlLexer.g:64:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSmallUmlLexer.g:64:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallUmlLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:66:10: ( ( '0' .. '9' )+ )
            // InternalSmallUmlLexer.g:66:12: ( '0' .. '9' )+
            {
            // InternalSmallUmlLexer.g:66:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUmlLexer.g:66:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:68:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSmallUmlLexer.g:68:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSmallUmlLexer.g:68:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUmlLexer.g:68:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSmallUmlLexer.g:68:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSmallUmlLexer.g:68:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmallUmlLexer.g:68:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSmallUmlLexer.g:68:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSmallUmlLexer.g:68:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSmallUmlLexer.g:68:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmallUmlLexer.g:68:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:70:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSmallUmlLexer.g:70:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSmallUmlLexer.g:70:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallUmlLexer.g:70:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:72:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSmallUmlLexer.g:72:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSmallUmlLexer.g:72:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmallUmlLexer.g:72:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSmallUmlLexer.g:72:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUmlLexer.g:72:41: ( '\\r' )? '\\n'
                    {
                    // InternalSmallUmlLexer.g:72:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSmallUmlLexer.g:72:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:74:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSmallUmlLexer.g:74:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSmallUmlLexer.g:74:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallUmlLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:76:16: ( . )
            // InternalSmallUmlLexer.g:76:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSmallUmlLexer.g:1:8: ( UnlimitedNatural | Enumeration | Integer | Package | Extends | String | Class | Value | HyphenMinusHyphenMinusHyphenMinusGreaterThanSign | LessThanSignGreaterThanSignHyphenMinusHyphenMinus | Bool | Real | LeftParenthesis | RightParenthesis | PlusSign | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=29;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSmallUmlLexer.g:1:10: UnlimitedNatural
                {
                mUnlimitedNatural(); 

                }
                break;
            case 2 :
                // InternalSmallUmlLexer.g:1:27: Enumeration
                {
                mEnumeration(); 

                }
                break;
            case 3 :
                // InternalSmallUmlLexer.g:1:39: Integer
                {
                mInteger(); 

                }
                break;
            case 4 :
                // InternalSmallUmlLexer.g:1:47: Package
                {
                mPackage(); 

                }
                break;
            case 5 :
                // InternalSmallUmlLexer.g:1:55: Extends
                {
                mExtends(); 

                }
                break;
            case 6 :
                // InternalSmallUmlLexer.g:1:63: String
                {
                mString(); 

                }
                break;
            case 7 :
                // InternalSmallUmlLexer.g:1:70: Class
                {
                mClass(); 

                }
                break;
            case 8 :
                // InternalSmallUmlLexer.g:1:76: Value
                {
                mValue(); 

                }
                break;
            case 9 :
                // InternalSmallUmlLexer.g:1:82: HyphenMinusHyphenMinusHyphenMinusGreaterThanSign
                {
                mHyphenMinusHyphenMinusHyphenMinusGreaterThanSign(); 

                }
                break;
            case 10 :
                // InternalSmallUmlLexer.g:1:131: LessThanSignGreaterThanSignHyphenMinusHyphenMinus
                {
                mLessThanSignGreaterThanSignHyphenMinusHyphenMinus(); 

                }
                break;
            case 11 :
                // InternalSmallUmlLexer.g:1:181: Bool
                {
                mBool(); 

                }
                break;
            case 12 :
                // InternalSmallUmlLexer.g:1:186: Real
                {
                mReal(); 

                }
                break;
            case 13 :
                // InternalSmallUmlLexer.g:1:191: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 14 :
                // InternalSmallUmlLexer.g:1:207: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 15 :
                // InternalSmallUmlLexer.g:1:224: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 16 :
                // InternalSmallUmlLexer.g:1:233: Comma
                {
                mComma(); 

                }
                break;
            case 17 :
                // InternalSmallUmlLexer.g:1:239: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 18 :
                // InternalSmallUmlLexer.g:1:251: Colon
                {
                mColon(); 

                }
                break;
            case 19 :
                // InternalSmallUmlLexer.g:1:257: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 20 :
                // InternalSmallUmlLexer.g:1:275: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 21 :
                // InternalSmallUmlLexer.g:1:294: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 22 :
                // InternalSmallUmlLexer.g:1:311: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 23 :
                // InternalSmallUmlLexer.g:1:329: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalSmallUmlLexer.g:1:337: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalSmallUmlLexer.g:1:346: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalSmallUmlLexer.g:1:358: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalSmallUmlLexer.g:1:374: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalSmallUmlLexer.g:1:390: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalSmallUmlLexer.g:1:398: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\37\1\50\1\35\2\37\11\uffff\1\35\2\uffff\3\35\2\uffff\1\37\1\uffff\7\37\3\uffff\2\37\16\uffff\22\37\1\126\1\127\6\37\1\136\1\137\2\uffff\5\37\1\145\2\uffff\2\37\1\150\1\151\1\152\1\uffff\2\37\3\uffff\5\37\1\162\1\37\1\uffff\3\37\1\167\1\uffff";
    static final String DFA12_eofS =
        "\170\uffff";
    static final String DFA12_minS =
        "\1\0\3\156\1\141\1\170\1\164\1\154\1\141\1\55\1\76\1\157\1\145\11\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\uffff\1\165\1\164\1\143\1\164\1\162\1\141\1\154\3\uffff\1\157\1\141\16\uffff\1\151\1\155\1\145\1\153\1\145\1\151\1\163\1\165\2\154\1\155\1\145\1\147\1\141\2\156\1\163\1\145\2\60\1\151\1\162\1\145\1\147\1\144\1\147\2\60\2\uffff\1\164\1\141\1\162\1\145\1\163\1\60\2\uffff\1\145\1\164\3\60\1\uffff\1\144\1\151\3\uffff\1\116\1\157\1\141\1\156\1\164\1\60\1\165\1\uffff\1\162\1\141\1\154\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\3\156\1\141\1\170\1\164\1\154\1\141\1\55\1\76\1\157\1\145\11\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\uffff\1\165\1\164\1\143\1\164\1\162\1\141\1\154\3\uffff\1\157\1\141\16\uffff\1\151\1\155\1\145\1\153\1\145\1\151\1\163\1\165\2\154\1\155\1\145\1\147\1\141\2\156\1\163\1\145\2\172\1\151\1\162\1\145\1\147\1\144\1\147\2\172\2\uffff\1\164\1\141\1\162\1\145\1\163\1\172\2\uffff\1\145\1\164\3\172\1\uffff\1\144\1\151\3\uffff\1\116\1\157\1\141\1\156\1\164\1\172\1\165\1\uffff\1\162\1\141\1\154\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\15\1\16\1\17\1\20\1\22\1\23\1\24\1\25\1\26\1\uffff\1\27\1\30\3\uffff\1\34\1\35\1\uffff\1\27\7\uffff\1\11\1\21\1\12\2\uffff\1\15\1\16\1\17\1\20\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\33\1\34\34\uffff\1\13\1\14\6\uffff\1\7\1\10\5\uffff\1\6\2\uffff\1\3\1\4\1\5\7\uffff\1\2\4\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\30\uffff\1\0\1\1\135\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\1\15\1\16\1\35\1\17\1\20\1\11\1\35\1\33\12\30\1\21\1\35\1\12\4\35\1\27\1\13\1\7\1\27\1\2\3\27\1\3\6\27\1\4\1\27\1\14\1\6\1\27\1\1\5\27\1\22\1\35\1\23\1\26\1\27\1\35\4\27\1\5\20\27\1\10\4\27\1\24\1\35\1\25\uff82\35",
            "\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\66",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\146",
            "\1\147",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( UnlimitedNatural | Enumeration | Integer | Package | Extends | String | Class | Value | HyphenMinusHyphenMinusHyphenMinusGreaterThanSign | LessThanSignGreaterThanSignHyphenMinusHyphenMinus | Bool | Real | LeftParenthesis | RightParenthesis | PlusSign | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 54;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 54;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='U') ) {s = 1;}

                        else if ( (LA12_0=='E') ) {s = 2;}

                        else if ( (LA12_0=='I') ) {s = 3;}

                        else if ( (LA12_0=='P') ) {s = 4;}

                        else if ( (LA12_0=='e') ) {s = 5;}

                        else if ( (LA12_0=='S') ) {s = 6;}

                        else if ( (LA12_0=='C') ) {s = 7;}

                        else if ( (LA12_0=='v') ) {s = 8;}

                        else if ( (LA12_0=='-') ) {s = 9;}

                        else if ( (LA12_0=='<') ) {s = 10;}

                        else if ( (LA12_0=='B') ) {s = 11;}

                        else if ( (LA12_0=='R') ) {s = 12;}

                        else if ( (LA12_0=='(') ) {s = 13;}

                        else if ( (LA12_0==')') ) {s = 14;}

                        else if ( (LA12_0=='+') ) {s = 15;}

                        else if ( (LA12_0==',') ) {s = 16;}

                        else if ( (LA12_0==':') ) {s = 17;}

                        else if ( (LA12_0=='[') ) {s = 18;}

                        else if ( (LA12_0==']') ) {s = 19;}

                        else if ( (LA12_0=='{') ) {s = 20;}

                        else if ( (LA12_0=='}') ) {s = 21;}

                        else if ( (LA12_0=='^') ) {s = 22;}

                        else if ( (LA12_0=='A'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='O')||LA12_0=='Q'||LA12_0=='T'||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 23;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||LA12_0=='.'||LA12_0==';'||(LA12_0>='=' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
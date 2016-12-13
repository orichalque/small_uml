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

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:16:9: ( 'Integer' )
            // InternalSmallUmlLexer.g:16:11: 'Integer'
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
            // InternalSmallUmlLexer.g:18:9: ( 'Package' )
            // InternalSmallUmlLexer.g:18:11: 'Package'
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
            // InternalSmallUmlLexer.g:20:9: ( 'extends' )
            // InternalSmallUmlLexer.g:20:11: 'extends'
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
            // InternalSmallUmlLexer.g:22:8: ( 'String' )
            // InternalSmallUmlLexer.g:22:10: 'String'
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
            // InternalSmallUmlLexer.g:24:7: ( 'Class' )
            // InternalSmallUmlLexer.g:24:9: 'Class'
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

    // $ANTLR start "HyphenMinusHyphenMinusHyphenMinusGreaterThanSign"
    public final void mHyphenMinusHyphenMinusHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinusHyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:26:50: ( '--->' )
            // InternalSmallUmlLexer.g:26:52: '--->'
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
            // InternalSmallUmlLexer.g:28:51: ( '<>--' )
            // InternalSmallUmlLexer.g:28:53: '<>--'
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
            // InternalSmallUmlLexer.g:30:6: ( 'Bool' )
            // InternalSmallUmlLexer.g:30:8: 'Bool'
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

    // $ANTLR start "Enum"
    public final void mEnum() throws RecognitionException {
        try {
            int _type = Enum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:32:6: ( 'Enum' )
            // InternalSmallUmlLexer.g:32:8: 'Enum'
            {
            match("Enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enum"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmallUmlLexer.g:34:6: ( 'Real' )
            // InternalSmallUmlLexer.g:34:8: 'Real'
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
            // InternalSmallUmlLexer.g:36:17: ( '(' )
            // InternalSmallUmlLexer.g:36:19: '('
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
            // InternalSmallUmlLexer.g:38:18: ( ')' )
            // InternalSmallUmlLexer.g:38:20: ')'
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
            // InternalSmallUmlLexer.g:40:10: ( '+' )
            // InternalSmallUmlLexer.g:40:12: '+'
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
            // InternalSmallUmlLexer.g:42:7: ( ',' )
            // InternalSmallUmlLexer.g:42:9: ','
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
            // InternalSmallUmlLexer.g:44:13: ( '-' )
            // InternalSmallUmlLexer.g:44:15: '-'
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
            // InternalSmallUmlLexer.g:46:7: ( ':' )
            // InternalSmallUmlLexer.g:46:9: ':'
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
            // InternalSmallUmlLexer.g:48:19: ( '[' )
            // InternalSmallUmlLexer.g:48:21: '['
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
            // InternalSmallUmlLexer.g:50:20: ( ']' )
            // InternalSmallUmlLexer.g:50:22: ']'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalSmallUmlLexer.g:54:21: ()
            // InternalSmallUmlLexer.g:54:23: 
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
            // InternalSmallUmlLexer.g:56:19: ()
            // InternalSmallUmlLexer.g:56:21: 
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
            // InternalSmallUmlLexer.g:58:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSmallUmlLexer.g:58:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSmallUmlLexer.g:58:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmallUmlLexer.g:58:11: '^'
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

            // InternalSmallUmlLexer.g:58:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSmallUmlLexer.g:60:10: ( ( '0' .. '9' )+ )
            // InternalSmallUmlLexer.g:60:12: ( '0' .. '9' )+
            {
            // InternalSmallUmlLexer.g:60:12: ( '0' .. '9' )+
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
            	    // InternalSmallUmlLexer.g:60:13: '0' .. '9'
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
            // InternalSmallUmlLexer.g:62:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSmallUmlLexer.g:62:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSmallUmlLexer.g:62:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSmallUmlLexer.g:62:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSmallUmlLexer.g:62:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSmallUmlLexer.g:62:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmallUmlLexer.g:62:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSmallUmlLexer.g:62:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSmallUmlLexer.g:62:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSmallUmlLexer.g:62:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmallUmlLexer.g:62:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSmallUmlLexer.g:64:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSmallUmlLexer.g:64:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSmallUmlLexer.g:64:24: ( options {greedy=false; } : . )*
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
            	    // InternalSmallUmlLexer.g:64:52: .
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
            // InternalSmallUmlLexer.g:66:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSmallUmlLexer.g:66:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSmallUmlLexer.g:66:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmallUmlLexer.g:66:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSmallUmlLexer.g:66:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUmlLexer.g:66:41: ( '\\r' )? '\\n'
                    {
                    // InternalSmallUmlLexer.g:66:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSmallUmlLexer.g:66:41: '\\r'
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
            // InternalSmallUmlLexer.g:68:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSmallUmlLexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSmallUmlLexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSmallUmlLexer.g:70:16: ( . )
            // InternalSmallUmlLexer.g:70:18: .
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
        // InternalSmallUmlLexer.g:1:8: ( UnlimitedNatural | Integer | Package | Extends | String | Class | HyphenMinusHyphenMinusHyphenMinusGreaterThanSign | LessThanSignGreaterThanSignHyphenMinusHyphenMinus | Bool | Enum | Real | LeftParenthesis | RightParenthesis | PlusSign | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=26;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSmallUmlLexer.g:1:10: UnlimitedNatural
                {
                mUnlimitedNatural(); 

                }
                break;
            case 2 :
                // InternalSmallUmlLexer.g:1:27: Integer
                {
                mInteger(); 

                }
                break;
            case 3 :
                // InternalSmallUmlLexer.g:1:35: Package
                {
                mPackage(); 

                }
                break;
            case 4 :
                // InternalSmallUmlLexer.g:1:43: Extends
                {
                mExtends(); 

                }
                break;
            case 5 :
                // InternalSmallUmlLexer.g:1:51: String
                {
                mString(); 

                }
                break;
            case 6 :
                // InternalSmallUmlLexer.g:1:58: Class
                {
                mClass(); 

                }
                break;
            case 7 :
                // InternalSmallUmlLexer.g:1:64: HyphenMinusHyphenMinusHyphenMinusGreaterThanSign
                {
                mHyphenMinusHyphenMinusHyphenMinusGreaterThanSign(); 

                }
                break;
            case 8 :
                // InternalSmallUmlLexer.g:1:113: LessThanSignGreaterThanSignHyphenMinusHyphenMinus
                {
                mLessThanSignGreaterThanSignHyphenMinusHyphenMinus(); 

                }
                break;
            case 9 :
                // InternalSmallUmlLexer.g:1:163: Bool
                {
                mBool(); 

                }
                break;
            case 10 :
                // InternalSmallUmlLexer.g:1:168: Enum
                {
                mEnum(); 

                }
                break;
            case 11 :
                // InternalSmallUmlLexer.g:1:173: Real
                {
                mReal(); 

                }
                break;
            case 12 :
                // InternalSmallUmlLexer.g:1:178: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 13 :
                // InternalSmallUmlLexer.g:1:194: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 14 :
                // InternalSmallUmlLexer.g:1:211: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 15 :
                // InternalSmallUmlLexer.g:1:220: Comma
                {
                mComma(); 

                }
                break;
            case 16 :
                // InternalSmallUmlLexer.g:1:226: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 17 :
                // InternalSmallUmlLexer.g:1:238: Colon
                {
                mColon(); 

                }
                break;
            case 18 :
                // InternalSmallUmlLexer.g:1:244: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 19 :
                // InternalSmallUmlLexer.g:1:262: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 20 :
                // InternalSmallUmlLexer.g:1:281: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalSmallUmlLexer.g:1:289: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalSmallUmlLexer.g:1:298: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalSmallUmlLexer.g:1:310: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalSmallUmlLexer.g:1:326: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalSmallUmlLexer.g:1:342: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalSmallUmlLexer.g:1:350: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\34\1\43\1\32\3\34\7\uffff\1\32\2\uffff\3\32\2\uffff\1\34\1\uffff\5\34\3\uffff\3\34\14\uffff\17\34\1\114\1\115\1\116\5\34\1\124\3\uffff\4\34\1\131\1\uffff\1\34\1\133\1\134\1\135\1\uffff\1\34\3\uffff\7\34\1\146\1\uffff";
    static final String DFA12_eofS =
        "\147\uffff";
    static final String DFA12_minS =
        "\1\0\2\156\1\141\1\170\1\164\1\154\1\55\1\76\1\157\1\156\1\145\7\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\uffff\1\164\1\143\1\164\1\162\1\141\3\uffff\1\157\1\165\1\141\14\uffff\1\151\1\145\1\153\1\145\1\151\1\163\1\154\1\155\1\154\1\155\1\147\1\141\2\156\1\163\3\60\1\151\1\145\1\147\1\144\1\147\1\60\3\uffff\1\164\1\162\1\145\1\163\1\60\1\uffff\1\145\3\60\1\uffff\1\144\3\uffff\1\116\1\141\1\164\1\165\1\162\1\141\1\154\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\156\1\141\1\170\1\164\1\154\1\55\1\76\1\157\1\156\1\145\7\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\uffff\1\164\1\143\1\164\1\162\1\141\3\uffff\1\157\1\165\1\141\14\uffff\1\151\1\145\1\153\1\145\1\151\1\163\1\154\1\155\1\154\1\155\1\147\1\141\2\156\1\163\3\172\1\151\1\145\1\147\1\144\1\147\1\172\3\uffff\1\164\1\162\1\145\1\163\1\172\1\uffff\1\145\3\172\1\uffff\1\144\3\uffff\1\116\1\141\1\164\1\165\1\162\1\141\1\154\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\14\uffff\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\uffff\1\24\1\25\3\uffff\1\31\1\32\1\uffff\1\24\5\uffff\1\7\1\20\1\10\3\uffff\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\25\1\26\1\27\1\30\1\31\30\uffff\1\11\1\12\1\13\5\uffff\1\6\4\uffff\1\5\1\uffff\1\2\1\3\1\4\10\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\25\uffff\1\1\1\0\117\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\1\14\1\15\1\32\1\16\1\17\1\7\1\32\1\30\12\25\1\20\1\32\1\10\4\32\1\24\1\11\1\6\1\24\1\12\3\24\1\2\6\24\1\3\1\24\1\13\1\5\1\24\1\1\5\24\1\21\1\32\1\22\1\23\1\24\1\32\4\24\1\4\25\24\uff85\32",
            "\1\33",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\60",
            "\0\60",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
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
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\132",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\136",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
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
            return "1:1: Tokens : ( UnlimitedNatural | Integer | Package | Extends | String | Class | HyphenMinusHyphenMinusHyphenMinusGreaterThanSign | LessThanSignGreaterThanSignHyphenMinusHyphenMinus | Bool | Enum | Real | LeftParenthesis | RightParenthesis | PlusSign | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 48;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 48;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='U') ) {s = 1;}

                        else if ( (LA12_0=='I') ) {s = 2;}

                        else if ( (LA12_0=='P') ) {s = 3;}

                        else if ( (LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='S') ) {s = 5;}

                        else if ( (LA12_0=='C') ) {s = 6;}

                        else if ( (LA12_0=='-') ) {s = 7;}

                        else if ( (LA12_0=='<') ) {s = 8;}

                        else if ( (LA12_0=='B') ) {s = 9;}

                        else if ( (LA12_0=='E') ) {s = 10;}

                        else if ( (LA12_0=='R') ) {s = 11;}

                        else if ( (LA12_0=='(') ) {s = 12;}

                        else if ( (LA12_0==')') ) {s = 13;}

                        else if ( (LA12_0=='+') ) {s = 14;}

                        else if ( (LA12_0==',') ) {s = 15;}

                        else if ( (LA12_0==':') ) {s = 16;}

                        else if ( (LA12_0=='[') ) {s = 17;}

                        else if ( (LA12_0==']') ) {s = 18;}

                        else if ( (LA12_0=='^') ) {s = 19;}

                        else if ( (LA12_0=='A'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='O')||LA12_0=='Q'||LA12_0=='T'||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='z')) ) {s = 20;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 25;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||LA12_0=='.'||LA12_0==';'||(LA12_0>='=' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 26;}

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
package eu.stamp.mfts.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMFTSLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_BYTE=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_EXTERN=6;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_CHAR=10;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_ANNOTATION_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int RULE_FLOAT=11;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMFTSLexer() {;} 
    public InternalMFTSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMFTSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMFTS.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:11:7: ( 'interface' )
            // InternalMFTS.g:11:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:12:7: ( '{' )
            // InternalMFTS.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:13:7: ( '}' )
            // InternalMFTS.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:14:7: ( 'sends' )
            // InternalMFTS.g:14:9: 'sends'
            {
            match("sends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:15:7: ( ',' )
            // InternalMFTS.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:16:7: ( 'receives' )
            // InternalMFTS.g:16:9: 'receives'
            {
            match("receives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:17:7: ( 'message' )
            // InternalMFTS.g:17:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:18:7: ( '(' )
            // InternalMFTS.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:19:7: ( ')' )
            // InternalMFTS.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:20:7: ( 'service' )
            // InternalMFTS.g:20:9: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:21:7: ( ':' )
            // InternalMFTS.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:22:7: ( 'test' )
            // InternalMFTS.g:22:9: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:23:7: ( 'par' )
            // InternalMFTS.g:23:9: 'par'
            {
            match("par"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:24:7: ( 'within' )
            // InternalMFTS.g:24:9: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:25:7: ( 'wait' )
            // InternalMFTS.g:25:9: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:26:7: ( 'send' )
            // InternalMFTS.g:26:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:27:7: ( '!' )
            // InternalMFTS.g:27:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:28:7: ( 'expect' )
            // InternalMFTS.g:28:9: 'expect'
            {
            match("expect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:29:7: ( '?' )
            // InternalMFTS.g:29:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:30:7: ( 'assert' )
            // InternalMFTS.g:30:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:31:7: ( '[' )
            // InternalMFTS.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:32:7: ( ']' )
            // InternalMFTS.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:33:7: ( '&' )
            // InternalMFTS.g:33:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:34:7: ( 'false' )
            // InternalMFTS.g:34:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:35:7: ( 'true' )
            // InternalMFTS.g:35:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:3988:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMFTS.g:3988:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMFTS.g:3988:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMFTS.g:3988:11: '^'
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

            // InternalMFTS.g:3988:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMFTS.g:
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

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:3990:11: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalMFTS.g:3990:13: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            match("0x"); 

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:3992:11: ( '\\'' ( '\\\\0' | '\\\\t' | '\\\\n' | '\\\\r' | ' ' .. '&' | '\\\\\\'' | '(' .. '[' | '\\\\\\\\' | ']' .. '~' ) '\\'' )
            // InternalMFTS.g:3992:13: '\\'' ( '\\\\0' | '\\\\t' | '\\\\n' | '\\\\r' | ' ' .. '&' | '\\\\\\'' | '(' .. '[' | '\\\\\\\\' | ']' .. '~' ) '\\''
            {
            match('\''); 
            // InternalMFTS.g:3992:18: ( '\\\\0' | '\\\\t' | '\\\\n' | '\\\\r' | ' ' .. '&' | '\\\\\\'' | '(' .. '[' | '\\\\\\\\' | ']' .. '~' )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMFTS.g:3992:19: '\\\\0'
                    {
                    match("\\0"); 


                    }
                    break;
                case 2 :
                    // InternalMFTS.g:3992:25: '\\\\t'
                    {
                    match("\\t"); 


                    }
                    break;
                case 3 :
                    // InternalMFTS.g:3992:31: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 4 :
                    // InternalMFTS.g:3992:37: '\\\\r'
                    {
                    match("\\r"); 


                    }
                    break;
                case 5 :
                    // InternalMFTS.g:3992:43: ' ' .. '&'
                    {
                    matchRange(' ','&'); 

                    }
                    break;
                case 6 :
                    // InternalMFTS.g:3992:52: '\\\\\\''
                    {
                    match("\\'"); 


                    }
                    break;
                case 7 :
                    // InternalMFTS.g:3992:59: '(' .. '['
                    {
                    matchRange('(','['); 

                    }
                    break;
                case 8 :
                    // InternalMFTS.g:3992:68: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 9 :
                    // InternalMFTS.g:3992:75: ']' .. '~'
                    {
                    matchRange(']','~'); 

                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:3994:10: ( ( '0' .. '9' )+ )
            // InternalMFTS.g:3994:12: ( '0' .. '9' )+
            {
            // InternalMFTS.g:3994:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMFTS.g:3994:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:3996:12: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // InternalMFTS.g:3996:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // InternalMFTS.g:3996:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMFTS.g:3996:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    // InternalMFTS.g:3996:15: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMFTS.g:3996:16: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // InternalMFTS.g:3996:31: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMFTS.g:3996:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalMFTS.g:3996:43: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMFTS.g:3996:44: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalMFTS.g:3996:54: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalMFTS.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalMFTS.g:3996:65: ( '0' .. '9' )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalMFTS.g:3996:66: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMFTS.g:3996:79: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    match('.'); 
                    // InternalMFTS.g:3996:83: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMFTS.g:3996:84: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // InternalMFTS.g:3996:95: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMFTS.g:3996:96: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalMFTS.g:3996:106: ( '+' | '-' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='+'||LA11_0=='-') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalMFTS.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalMFTS.g:3996:117: ( '0' .. '9' )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalMFTS.g:3996:118: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMFTS.g:3996:131: ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    // InternalMFTS.g:3996:131: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMFTS.g:3996:132: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMFTS.g:3996:153: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMFTS.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalMFTS.g:3996:164: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMFTS.g:3996:165: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ANNOTATION_ID"
    public final void mRULE_ANNOTATION_ID() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:3998:20: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMFTS.g:3998:22: '@' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMFTS.g:3998:50: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMFTS.g:
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
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANNOTATION_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:4000:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMFTS.g:4000:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMFTS.g:4000:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    alt19=1;
                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMFTS.g:4000:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMFTS.g:4000:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop19;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_EXTERN"
    public final void mRULE_EXTERN() throws RecognitionException {
        try {
            int _type = RULE_EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:4002:13: ( '`' ( '\\\\' . | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalMFTS.g:4002:15: '`' ( '\\\\' . | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalMFTS.g:4002:19: ( '\\\\' . | ~ ( ( '\\\\' | '`' ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    alt20=1;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='_')||(LA20_0>='a' && LA20_0<='\uFFFF')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMFTS.g:4002:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMFTS.g:4002:27: ~ ( ( '\\\\' | '`' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTERN"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMFTS.g:4004:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMFTS.g:4004:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMFTS.g:4004:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMFTS.g:4004:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
            // InternalMFTS.g:4006:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMFTS.g:4006:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMFTS.g:4006:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMFTS.g:4006:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // InternalMFTS.g:4006:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMFTS.g:4006:41: ( '\\r' )? '\\n'
                    {
                    // InternalMFTS.g:4006:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMFTS.g:4006:41: '\\r'
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
            // InternalMFTS.g:4008:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMFTS.g:4008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMFTS.g:4008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMFTS.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // InternalMFTS.g:4010:16: ( . )
            // InternalMFTS.g:4010:18: .
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
        // InternalMFTS.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ID | RULE_BYTE | RULE_CHAR | RULE_INT | RULE_FLOAT | RULE_ANNOTATION_ID | RULE_STRING | RULE_EXTERN | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=37;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalMFTS.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalMFTS.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalMFTS.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalMFTS.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalMFTS.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalMFTS.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalMFTS.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalMFTS.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalMFTS.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalMFTS.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalMFTS.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalMFTS.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalMFTS.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalMFTS.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalMFTS.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalMFTS.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalMFTS.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalMFTS.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalMFTS.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalMFTS.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalMFTS.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalMFTS.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalMFTS.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalMFTS.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalMFTS.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalMFTS.g:1:160: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalMFTS.g:1:168: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 28 :
                // InternalMFTS.g:1:178: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 29 :
                // InternalMFTS.g:1:188: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalMFTS.g:1:197: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 31 :
                // InternalMFTS.g:1:208: RULE_ANNOTATION_ID
                {
                mRULE_ANNOTATION_ID(); 

                }
                break;
            case 32 :
                // InternalMFTS.g:1:227: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalMFTS.g:1:239: RULE_EXTERN
                {
                mRULE_EXTERN(); 

                }
                break;
            case 34 :
                // InternalMFTS.g:1:251: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalMFTS.g:1:267: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalMFTS.g:1:283: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalMFTS.g:1:291: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\40\1\47\11\uffff";
    static final String DFA3_maxS =
        "\1\176\1\164\11\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\5\1\7\1\11\1\1\1\2\1\3\1\4\1\6\1\10";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\7\2\1\uffff\64\3\1\1\42\4",
            "\1\11\10\uffff\1\5\53\uffff\1\12\21\uffff\1\7\3\uffff\1\10\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "3992:18: ( '\\\\0' | '\\\\t' | '\\\\n' | '\\\\r' | ' ' .. '&' | '\\\\\\'' | '(' .. '[' | '\\\\\\\\' | ']' .. '~' )";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\2\56\3\uffff";
    static final String DFA17_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "3996:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\43\2\uffff\1\43\1\uffff\2\43\3\uffff\3\43\1\uffff\1\43\1\uffff\1\43\3\uffff\1\43\1\41\1\uffff\1\73\1\41\1\73\5\41\2\uffff\1\43\3\uffff\1\43\1\uffff\2\43\3\uffff\5\43\1\uffff\1\43\1\uffff\1\43\3\uffff\1\43\3\uffff\1\73\7\uffff\7\43\1\131\6\43\1\141\3\43\1\145\1\146\1\uffff\1\43\1\150\4\43\1\155\1\uffff\3\43\2\uffff\1\43\1\uffff\2\43\1\164\1\43\1\uffff\3\43\1\171\1\172\1\173\1\uffff\1\43\1\175\1\43\1\177\3\uffff\1\43\1\uffff\1\u0081\1\uffff\1\u0082\2\uffff";
    static final String DFA26_eofS =
        "\u0083\uffff";
    static final String DFA26_minS =
        "\1\0\1\156\2\uffff\1\145\1\uffff\2\145\3\uffff\1\145\2\141\1\uffff\1\170\1\uffff\1\163\3\uffff\1\141\1\101\1\uffff\1\56\1\40\1\56\1\60\1\101\2\0\1\52\2\uffff\1\164\3\uffff\1\156\1\uffff\1\143\1\163\3\uffff\1\163\1\165\1\162\1\164\1\151\1\uffff\1\160\1\uffff\1\163\3\uffff\1\154\3\uffff\1\56\7\uffff\1\145\1\144\1\166\1\145\1\163\1\164\1\145\1\60\1\150\1\164\2\145\1\163\1\162\1\60\2\151\1\141\2\60\1\uffff\1\151\1\60\1\143\1\162\1\145\1\146\1\60\1\uffff\1\143\1\166\1\147\2\uffff\1\156\1\uffff\2\164\1\60\1\141\1\uffff\3\145\3\60\1\uffff\1\143\1\60\1\163\1\60\3\uffff\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\156\2\uffff\1\145\1\uffff\2\145\3\uffff\1\162\1\141\1\151\1\uffff\1\170\1\uffff\1\163\3\uffff\1\141\1\172\1\uffff\1\170\1\176\1\145\1\71\1\172\2\uffff\1\57\2\uffff\1\164\3\uffff\1\162\1\uffff\1\143\1\163\3\uffff\1\163\1\165\1\162\1\164\1\151\1\uffff\1\160\1\uffff\1\163\3\uffff\1\154\3\uffff\1\145\7\uffff\1\145\1\144\1\166\1\145\1\163\1\164\1\145\1\172\1\150\1\164\2\145\1\163\1\162\1\172\2\151\1\141\2\172\1\uffff\1\151\1\172\1\143\1\162\1\145\1\146\1\172\1\uffff\1\143\1\166\1\147\2\uffff\1\156\1\uffff\2\164\1\172\1\141\1\uffff\3\145\3\172\1\uffff\1\143\1\172\1\163\1\172\3\uffff\1\145\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\2\uffff\1\10\1\11\1\13\3\uffff\1\21\1\uffff\1\23\1\uffff\1\25\1\26\1\27\2\uffff\1\32\10\uffff\1\44\1\45\1\uffff\1\32\1\2\1\3\1\uffff\1\5\2\uffff\1\10\1\11\1\13\5\uffff\1\21\1\uffff\1\23\1\uffff\1\25\1\26\1\27\1\uffff\1\33\1\35\1\36\1\uffff\1\34\1\37\1\40\1\41\1\42\1\43\1\44\24\uffff\1\15\7\uffff\1\20\3\uffff\1\14\1\31\1\uffff\1\17\4\uffff\1\4\6\uffff\1\30\4\uffff\1\16\1\22\1\24\1\uffff\1\12\1\uffff\1\7\1\uffff\1\6\1\1";
    static final String DFA26_specialS =
        "\1\2\34\uffff\1\1\1\0\144\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\16\1\35\3\41\1\24\1\31\1\10\1\11\2\41\1\5\1\41\1\33\1\37\1\30\11\32\1\12\4\41\1\20\1\34\32\27\1\22\1\41\1\23\1\26\1\27\1\36\1\21\3\27\1\17\1\25\2\27\1\1\3\27\1\7\2\27\1\14\1\27\1\6\1\4\1\13\2\27\1\15\3\27\1\2\1\41\1\3\uff82\41",
            "\1\42",
            "",
            "",
            "\1\46",
            "",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "\1\55\14\uffff\1\56",
            "\1\57",
            "\1\61\7\uffff\1\60",
            "",
            "\1\63",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\71",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\74\1\uffff\12\75\13\uffff\1\74\37\uffff\1\74\22\uffff\1\72",
            "\7\76\1\uffff\127\76",
            "\1\74\1\uffff\12\75\13\uffff\1\74\37\uffff\1\74",
            "\12\74",
            "\32\77\4\uffff\1\77\1\uffff\32\77",
            "\0\100",
            "\0\101",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\1\105",
            "",
            "",
            "",
            "\1\106\3\uffff\1\107",
            "",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "",
            "\1\120",
            "",
            "",
            "",
            "\1\121",
            "",
            "",
            "",
            "\1\74\1\uffff\12\75\13\uffff\1\74\37\uffff\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\140\7\43",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\147",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\174",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\176",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u0080",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ID | RULE_BYTE | RULE_CHAR | RULE_INT | RULE_FLOAT | RULE_ANNOTATION_ID | RULE_STRING | RULE_EXTERN | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_30 = input.LA(1);

                        s = -1;
                        if ( ((LA26_30>='\u0000' && LA26_30<='\uFFFF')) ) {s = 65;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_29 = input.LA(1);

                        s = -1;
                        if ( ((LA26_29>='\u0000' && LA26_29<='\uFFFF')) ) {s = 64;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='i') ) {s = 1;}

                        else if ( (LA26_0=='{') ) {s = 2;}

                        else if ( (LA26_0=='}') ) {s = 3;}

                        else if ( (LA26_0=='s') ) {s = 4;}

                        else if ( (LA26_0==',') ) {s = 5;}

                        else if ( (LA26_0=='r') ) {s = 6;}

                        else if ( (LA26_0=='m') ) {s = 7;}

                        else if ( (LA26_0=='(') ) {s = 8;}

                        else if ( (LA26_0==')') ) {s = 9;}

                        else if ( (LA26_0==':') ) {s = 10;}

                        else if ( (LA26_0=='t') ) {s = 11;}

                        else if ( (LA26_0=='p') ) {s = 12;}

                        else if ( (LA26_0=='w') ) {s = 13;}

                        else if ( (LA26_0=='!') ) {s = 14;}

                        else if ( (LA26_0=='e') ) {s = 15;}

                        else if ( (LA26_0=='?') ) {s = 16;}

                        else if ( (LA26_0=='a') ) {s = 17;}

                        else if ( (LA26_0=='[') ) {s = 18;}

                        else if ( (LA26_0==']') ) {s = 19;}

                        else if ( (LA26_0=='&') ) {s = 20;}

                        else if ( (LA26_0=='f') ) {s = 21;}

                        else if ( (LA26_0=='^') ) {s = 22;}

                        else if ( ((LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='b' && LA26_0<='d')||(LA26_0>='g' && LA26_0<='h')||(LA26_0>='j' && LA26_0<='l')||(LA26_0>='n' && LA26_0<='o')||LA26_0=='q'||(LA26_0>='u' && LA26_0<='v')||(LA26_0>='x' && LA26_0<='z')) ) {s = 23;}

                        else if ( (LA26_0=='0') ) {s = 24;}

                        else if ( (LA26_0=='\'') ) {s = 25;}

                        else if ( ((LA26_0>='1' && LA26_0<='9')) ) {s = 26;}

                        else if ( (LA26_0=='.') ) {s = 27;}

                        else if ( (LA26_0=='@') ) {s = 28;}

                        else if ( (LA26_0=='\"') ) {s = 29;}

                        else if ( (LA26_0=='`') ) {s = 30;}

                        else if ( (LA26_0=='/') ) {s = 31;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 32;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||(LA26_0>='#' && LA26_0<='%')||(LA26_0>='*' && LA26_0<='+')||LA26_0=='-'||(LA26_0>=';' && LA26_0<='>')||LA26_0=='\\'||LA26_0=='|'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
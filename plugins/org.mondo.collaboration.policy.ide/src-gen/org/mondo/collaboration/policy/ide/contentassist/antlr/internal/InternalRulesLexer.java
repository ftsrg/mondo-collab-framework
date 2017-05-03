package org.mondo.collaboration.policy.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalRulesLexer() {;} 
    public InternalRulesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRulesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRules.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:11:7: ( 'allow' )
            // InternalRules.g:11:9: 'allow'
            {
            match("allow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:12:7: ( 'deny' )
            // InternalRules.g:12:9: 'deny'
            {
            match("deny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:13:7: ( 'R' )
            // InternalRules.g:13:9: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:14:7: ( 'W' )
            // InternalRules.g:14:9: 'W'
            {
            match('W'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:15:7: ( 'RW' )
            // InternalRules.g:15:9: 'RW'
            {
            match("RW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:16:7: ( 'restrictive' )
            // InternalRules.g:16:9: 'restrictive'
            {
            match("restrictive"); 


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
            // InternalRules.g:17:7: ( 'permissive' )
            // InternalRules.g:17:9: 'permissive'
            {
            match("permissive"); 


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
            // InternalRules.g:18:7: ( 'user' )
            // InternalRules.g:18:9: 'user'
            {
            match("user"); 


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
            // InternalRules.g:19:7: ( 'group' )
            // InternalRules.g:19:9: 'group'
            {
            match("group"); 


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
            // InternalRules.g:20:7: ( '{' )
            // InternalRules.g:20:9: '{'
            {
            match('{'); 

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
            // InternalRules.g:21:7: ( '}' )
            // InternalRules.g:21:9: '}'
            {
            match('}'); 

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
            // InternalRules.g:22:7: ( ',' )
            // InternalRules.g:22:9: ','
            {
            match(','); 

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
            // InternalRules.g:23:7: ( 'policy' )
            // InternalRules.g:23:9: 'policy'
            {
            match("policy"); 


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
            // InternalRules.g:24:7: ( 'by' )
            // InternalRules.g:24:9: 'by'
            {
            match("by"); 


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
            // InternalRules.g:25:7: ( 'default' )
            // InternalRules.g:25:9: 'default'
            {
            match("default"); 


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
            // InternalRules.g:26:7: ( 'with' )
            // InternalRules.g:26:9: 'with'
            {
            match("with"); 


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
            // InternalRules.g:27:7: ( 'resolution' )
            // InternalRules.g:27:9: 'resolution'
            {
            match("resolution"); 


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
            // InternalRules.g:28:7: ( 'rule' )
            // InternalRules.g:28:9: 'rule'
            {
            match("rule"); 


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
            // InternalRules.g:29:7: ( 'to' )
            // InternalRules.g:29:9: 'to'
            {
            match("to"); 


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
            // InternalRules.g:30:7: ( 'from' )
            // InternalRules.g:30:9: 'from'
            {
            match("from"); 


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
            // InternalRules.g:31:7: ( 'query' )
            // InternalRules.g:31:9: 'query'
            {
            match("query"); 


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
            // InternalRules.g:32:7: ( 'select' )
            // InternalRules.g:32:9: 'select'
            {
            match("select"); 


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
            // InternalRules.g:33:7: ( 'priority' )
            // InternalRules.g:33:9: 'priority'
            {
            match("priority"); 


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
            // InternalRules.g:34:7: ( 'obfuscate' )
            // InternalRules.g:34:9: 'obfuscate'
            {
            match("obfuscate"); 


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
            // InternalRules.g:35:7: ( 'obj' )
            // InternalRules.g:35:9: 'obj'
            {
            match("obj"); 


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
            // InternalRules.g:36:7: ( '(' )
            // InternalRules.g:36:9: '('
            {
            match('('); 

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
            // InternalRules.g:37:7: ( ')' )
            // InternalRules.g:37:9: ')'
            {
            match(')'); 

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
            // InternalRules.g:38:7: ( 'ref' )
            // InternalRules.g:38:9: 'ref'
            {
            match("ref"); 


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
            // InternalRules.g:39:7: ( '->' )
            // InternalRules.g:39:9: '->'
            {
            match("->"); 


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
            // InternalRules.g:40:7: ( ':' )
            // InternalRules.g:40:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:41:7: ( 'attr' )
            // InternalRules.g:41:9: 'attr'
            {
            match("attr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:42:7: ( 'where' )
            // InternalRules.g:42:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:43:7: ( 'is' )
            // InternalRules.g:43:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:44:7: ( 'bound' )
            // InternalRules.g:44:9: 'bound'
            {
            match("bound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRules.g:3011:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRules.g:3011:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRules.g:3011:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:3011:11: '^'
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

            // InternalRules.g:3011:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRules.g:
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
            // InternalRules.g:3013:10: ( ( '0' .. '9' )+ )
            // InternalRules.g:3013:12: ( '0' .. '9' )+
            {
            // InternalRules.g:3013:12: ( '0' .. '9' )+
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
            	    // InternalRules.g:3013:13: '0' .. '9'
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
            // InternalRules.g:3015:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRules.g:3015:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRules.g:3015:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRules.g:3015:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRules.g:3015:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRules.g:3015:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRules.g:3015:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRules.g:3015:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRules.g:3015:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRules.g:3015:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRules.g:3015:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRules.g:3017:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRules.g:3017:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRules.g:3017:24: ( options {greedy=false; } : . )*
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
            	    // InternalRules.g:3017:52: .
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
            // InternalRules.g:3019:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRules.g:3019:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRules.g:3019:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:3019:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalRules.g:3019:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:3019:41: ( '\\r' )? '\\n'
                    {
                    // InternalRules.g:3019:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRules.g:3019:41: '\\r'
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
            // InternalRules.g:3021:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRules.g:3021:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRules.g:3021:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalRules.g:
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
            // InternalRules.g:3023:16: ( . )
            // InternalRules.g:3023:18: .
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
        // InternalRules.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=41;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRules.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalRules.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalRules.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalRules.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalRules.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalRules.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalRules.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalRules.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalRules.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalRules.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalRules.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalRules.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalRules.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalRules.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalRules.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalRules.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalRules.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalRules.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalRules.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalRules.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalRules.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalRules.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalRules.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalRules.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalRules.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalRules.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalRules.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalRules.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalRules.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalRules.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalRules.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalRules.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalRules.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalRules.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalRules.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalRules.g:1:222: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalRules.g:1:231: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalRules.g:1:243: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalRules.g:1:259: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalRules.g:1:275: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalRules.g:1:283: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\42\1\45\1\46\4\42\3\uffff\7\42\2\uffff\1\37\1\uffff\1\42\1\37\2\uffff\3\37\2\uffff\2\42\1\uffff\1\42\1\110\2\uffff\7\42\3\uffff\1\121\3\42\1\125\4\42\4\uffff\1\133\5\uffff\4\42\1\uffff\1\42\1\142\6\42\1\uffff\3\42\1\uffff\4\42\1\160\1\uffff\1\42\1\162\1\163\3\42\1\uffff\1\167\3\42\1\173\2\42\1\176\1\42\1\u0080\3\42\1\uffff\1\u0084\2\uffff\3\42\1\uffff\3\42\1\uffff\1\u008b\1\u008c\1\uffff\1\u008d\1\uffff\1\u008e\2\42\1\uffff\4\42\1\u0095\1\42\4\uffff\1\u0097\1\42\1\u0099\3\42\1\uffff\1\42\1\uffff\1\42\1\uffff\3\42\1\u00a2\4\42\1\uffff\1\u00a7\1\42\1\u00a9\1\u00aa\1\uffff\1\u00ab\3\uffff";
    static final String DFA12_eofS =
        "\u00ac\uffff";
    static final String DFA12_minS =
        "\1\0\1\154\1\145\2\60\2\145\1\163\1\162\3\uffff\1\157\1\150\1\157\1\162\1\165\1\145\1\142\2\uffff\1\76\1\uffff\1\163\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\164\1\uffff\1\146\1\60\2\uffff\1\146\1\154\1\162\1\154\1\151\1\145\1\157\3\uffff\1\60\1\165\1\164\1\145\1\60\1\157\1\145\1\154\1\146\4\uffff\1\60\5\uffff\1\157\1\162\1\171\1\141\1\uffff\1\157\1\60\1\145\1\155\1\151\1\157\1\162\1\165\1\uffff\1\156\1\150\1\162\1\uffff\1\155\1\162\1\145\1\165\1\60\1\uffff\1\167\2\60\1\165\1\162\1\154\1\uffff\1\60\1\151\1\143\1\162\1\60\1\160\1\144\1\60\1\145\1\60\1\171\1\143\1\163\1\uffff\1\60\2\uffff\1\154\1\151\1\165\1\uffff\1\163\1\171\1\151\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\164\1\143\1\uffff\1\164\1\143\1\164\1\163\1\60\1\164\4\uffff\1\60\1\141\1\60\1\164\2\151\1\uffff\1\171\1\uffff\1\164\1\uffff\1\151\1\157\1\166\1\60\1\145\1\166\1\156\1\145\1\uffff\1\60\1\145\2\60\1\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\145\2\172\1\165\1\162\1\163\1\162\3\uffff\1\171\1\151\1\157\1\162\1\165\1\145\1\142\2\uffff\1\76\1\uffff\1\163\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\164\1\uffff\1\156\1\172\2\uffff\1\163\1\154\1\162\1\154\1\151\1\145\1\157\3\uffff\1\172\1\165\1\164\1\145\1\172\1\157\1\145\1\154\1\152\4\uffff\1\172\5\uffff\1\157\1\162\1\171\1\141\1\uffff\1\164\1\172\1\145\1\155\1\151\1\157\1\162\1\165\1\uffff\1\156\1\150\1\162\1\uffff\1\155\1\162\1\145\1\165\1\172\1\uffff\1\167\2\172\1\165\1\162\1\154\1\uffff\1\172\1\151\1\143\1\162\1\172\1\160\1\144\1\172\1\145\1\172\1\171\1\143\1\163\1\uffff\1\172\2\uffff\1\154\1\151\1\165\1\uffff\1\163\1\171\1\151\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\164\1\143\1\uffff\1\164\1\143\1\164\1\163\1\172\1\164\4\uffff\1\172\1\141\1\172\1\164\2\151\1\uffff\1\171\1\uffff\1\164\1\uffff\1\151\1\157\1\166\1\172\1\145\1\166\1\156\1\145\1\uffff\1\172\1\145\2\172\1\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\12\1\13\1\14\7\uffff\1\32\1\33\1\uffff\1\36\2\uffff\1\43\1\44\3\uffff\1\50\1\51\2\uffff\1\43\2\uffff\1\3\1\4\7\uffff\1\12\1\13\1\14\11\uffff\1\32\1\33\1\35\1\36\1\uffff\1\44\1\45\1\46\1\47\1\50\4\uffff\1\5\10\uffff\1\16\3\uffff\1\23\5\uffff\1\41\6\uffff\1\34\15\uffff\1\31\1\uffff\1\37\1\2\3\uffff\1\22\3\uffff\1\10\2\uffff\1\20\1\uffff\1\24\3\uffff\1\1\6\uffff\1\11\1\42\1\40\1\25\6\uffff\1\15\1\uffff\1\26\1\uffff\1\17\10\uffff\1\27\4\uffff\1\30\1\uffff\1\21\1\7\1\6";
    static final String DFA12_specialS =
        "\1\2\32\uffff\1\0\1\1\u008f\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\23\1\24\2\37\1\13\1\25\1\37\1\35\12\32\1\26\6\37\21\31\1\3\4\31\1\4\3\31\3\37\1\30\1\31\1\37\1\1\1\14\1\31\1\2\1\31\1\17\1\10\1\31\1\27\5\31\1\22\1\6\1\20\1\5\1\21\1\16\1\7\1\31\1\15\3\31\1\11\1\37\1\12\uff82\37",
            "\1\40\7\uffff\1\41",
            "\1\43",
            "\12\42\7\uffff\26\42\1\44\3\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\47\17\uffff\1\50",
            "\1\51\11\uffff\1\52\2\uffff\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "\1\62\11\uffff\1\61",
            "\1\64\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\74",
            "",
            "\1\76",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\100",
            "\0\100",
            "\1\101\4\uffff\1\102",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\107\7\uffff\1\106",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\112\14\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\3\uffff\1\132",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\141\4\uffff\1\140",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\161",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\174",
            "\1\175",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\177",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0098",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='a') ) {s = 1;}

                        else if ( (LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='R') ) {s = 3;}

                        else if ( (LA12_0=='W') ) {s = 4;}

                        else if ( (LA12_0=='r') ) {s = 5;}

                        else if ( (LA12_0=='p') ) {s = 6;}

                        else if ( (LA12_0=='u') ) {s = 7;}

                        else if ( (LA12_0=='g') ) {s = 8;}

                        else if ( (LA12_0=='{') ) {s = 9;}

                        else if ( (LA12_0=='}') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='b') ) {s = 12;}

                        else if ( (LA12_0=='w') ) {s = 13;}

                        else if ( (LA12_0=='t') ) {s = 14;}

                        else if ( (LA12_0=='f') ) {s = 15;}

                        else if ( (LA12_0=='q') ) {s = 16;}

                        else if ( (LA12_0=='s') ) {s = 17;}

                        else if ( (LA12_0=='o') ) {s = 18;}

                        else if ( (LA12_0=='(') ) {s = 19;}

                        else if ( (LA12_0==')') ) {s = 20;}

                        else if ( (LA12_0=='-') ) {s = 21;}

                        else if ( (LA12_0==':') ) {s = 22;}

                        else if ( (LA12_0=='i') ) {s = 23;}

                        else if ( (LA12_0=='^') ) {s = 24;}

                        else if ( ((LA12_0>='A' && LA12_0<='Q')||(LA12_0>='S' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='c'||LA12_0=='e'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='n')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 25;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 26;}

                        else if ( (LA12_0=='\"') ) {s = 27;}

                        else if ( (LA12_0=='\'') ) {s = 28;}

                        else if ( (LA12_0=='/') ) {s = 29;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 30;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 31;}

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
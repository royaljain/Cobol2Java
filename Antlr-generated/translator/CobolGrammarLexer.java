// $ANTLR 3.5.2 C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g 2014-07-01 15:49:06
package translator;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CobolGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ACCEPT=4;
	public static final int ADD=5;
	public static final int ADDITION=6;
	public static final int AFTER=7;
	public static final int ALLEXCEPTHASH=8;
	public static final int AND=9;
	public static final int ARGUMENTVALUE=10;
	public static final int AUTHOR=11;
	public static final int BEGIN=12;
	public static final int BY=13;
	public static final int CALL=14;
	public static final int COLON=15;
	public static final int COMMA=16;
	public static final int COMP3=17;
	public static final int COMPUTE=18;
	public static final int CONFIGURATION=19;
	public static final int DATA=20;
	public static final int DECLARE=21;
	public static final int DIGITS=22;
	public static final int DISPLAY=23;
	public static final int DIVISION=24;
	public static final int DON=25;
	public static final int DOT=26;
	public static final int ELSE=27;
	public static final int END=28;
	public static final int ENDEVALUATE=29;
	public static final int ENDEXEC=30;
	public static final int ENDIF=31;
	public static final int ENDPERFORM=32;
	public static final int ENVIRONMENT=33;
	public static final int EQUAL=34;
	public static final int EVALUATE=35;
	public static final int EXEC=36;
	public static final int EXIT=37;
	public static final int FALSE=38;
	public static final int FIGURATIVE=39;
	public static final int FILLER=40;
	public static final int FORWARDSLASH=41;
	public static final int FROM=42;
	public static final int FUNCTION=43;
	public static final int GREATER=44;
	public static final int GREATERTHANEQUAL=45;
	public static final int HASH=46;
	public static final int HOSTVARIABLES=47;
	public static final int HYPHEN=48;
	public static final int IDENTIFICATION=49;
	public static final int IDENTIFIER=50;
	public static final int IF=51;
	public static final int INCLUDE=52;
	public static final int INITIALIZE=53;
	public static final int INSERT=54;
	public static final int LESSER=55;
	public static final int LESSERTHANEQUAL=56;
	public static final int LETTER=57;
	public static final int LPAREN=58;
	public static final int MOVE=59;
	public static final int MULTIPLY=60;
	public static final int NINE=61;
	public static final int NOT=62;
	public static final int NOTEQUAL=63;
	public static final int NOTFALSE=64;
	public static final int NOTTRUE=65;
	public static final int NUMVAL=66;
	public static final int OBJECTCOMP=67;
	public static final int OR=68;
	public static final int PERFORM=69;
	public static final int PIC=70;
	public static final int PROCEDURE=71;
	public static final int PROGRAMID=72;
	public static final int QUOTES=73;
	public static final int REDEFINES=74;
	public static final int RPAREN=75;
	public static final int RUN=76;
	public static final int S9=77;
	public static final int SECTION=78;
	public static final int SINGLEQUOTES=79;
	public static final int SOURCECOMP=80;
	public static final int SPECIALSYMBOL=81;
	public static final int SQL=82;
	public static final int SQLCA=83;
	public static final int STOP=84;
	public static final int STRING=85;
	public static final int SUB=86;
	public static final int TEST=87;
	public static final int THEN=88;
	public static final int TO=89;
	public static final int TRUE=90;
	public static final int UNDERSCORE=91;
	public static final int UNTIL=92;
	public static final int USING=93;
	public static final int VALUE=94;
	public static final int VARYING=95;
	public static final int WHEN=96;
	public static final int WHERE=97;
	public static final int WITH=98;
	public static final int WORKINGSTORAGE=99;
	public static final int WS=100;
	public static final int X=101;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CobolGrammarLexer() {} 
	public CobolGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CobolGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:351:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:351:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:351:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "IDENTIFICATION"
	public final void mIDENTIFICATION() throws RecognitionException {
		try {
			int _type = IDENTIFICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:355:16: ( 'IDENTIFICATION' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:355:18: 'IDENTIFICATION'
			{
			match("IDENTIFICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFICATION"

	// $ANTLR start "ENVIRONMENT"
	public final void mENVIRONMENT() throws RecognitionException {
		try {
			int _type = ENVIRONMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:356:13: ( 'ENVIRONMENT' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:356:15: 'ENVIRONMENT'
			{
			match("ENVIRONMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENVIRONMENT"

	// $ANTLR start "DATA"
	public final void mDATA() throws RecognitionException {
		try {
			int _type = DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:357:6: ( 'DATA' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:357:8: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATA"

	// $ANTLR start "PROCEDURE"
	public final void mPROCEDURE() throws RecognitionException {
		try {
			int _type = PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:358:11: ( 'PROCEDURE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:358:13: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROCEDURE"

	// $ANTLR start "DIVISION"
	public final void mDIVISION() throws RecognitionException {
		try {
			int _type = DIVISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:359:10: ( 'DIVISION' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:359:12: 'DIVISION'
			{
			match("DIVISION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVISION"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:360:9: ( 'INCLUDE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:360:11: 'INCLUDE'
			{
			match("INCLUDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "DECLARE"
	public final void mDECLARE() throws RecognitionException {
		try {
			int _type = DECLARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:361:9: ( 'DECLARE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:361:11: 'DECLARE'
			{
			match("DECLARE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLARE"

	// $ANTLR start "WORKINGSTORAGE"
	public final void mWORKINGSTORAGE() throws RecognitionException {
		try {
			int _type = WORKINGSTORAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:362:16: ( 'WORKING-STORAGE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:362:18: 'WORKING-STORAGE'
			{
			match("WORKING-STORAGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORKINGSTORAGE"

	// $ANTLR start "COMPUTE"
	public final void mCOMPUTE() throws RecognitionException {
		try {
			int _type = COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:363:9: ( 'COMPUTE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:363:11: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPUTE"

	// $ANTLR start "CONFIGURATION"
	public final void mCONFIGURATION() throws RecognitionException {
		try {
			int _type = CONFIGURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:364:15: ( 'CONFIGURATION' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:364:17: 'CONFIGURATION'
			{
			match("CONFIGURATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONFIGURATION"

	// $ANTLR start "SECTION"
	public final void mSECTION() throws RecognitionException {
		try {
			int _type = SECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:365:9: ( 'SECTION' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:365:11: 'SECTION'
			{
			match("SECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SECTION"

	// $ANTLR start "OBJECTCOMP"
	public final void mOBJECTCOMP() throws RecognitionException {
		try {
			int _type = OBJECTCOMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:366:12: ( 'OBJECT-COMPUTER' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:366:14: 'OBJECT-COMPUTER'
			{
			match("OBJECT-COMPUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBJECTCOMP"

	// $ANTLR start "SOURCECOMP"
	public final void mSOURCECOMP() throws RecognitionException {
		try {
			int _type = SOURCECOMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:367:12: ( 'SOURCE-COMPUTER' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:367:14: 'SOURCE-COMPUTER'
			{
			match("SOURCE-COMPUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOURCECOMP"

	// $ANTLR start "VARYING"
	public final void mVARYING() throws RecognitionException {
		try {
			int _type = VARYING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:368:9: ( 'VARYING' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:368:11: 'VARYING'
			{
			match("VARYING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARYING"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:369:5: ( '.' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:369:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:370:10: ( 'NOT =' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:370:12: 'NOT ='
			{
			match("NOT ="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "ACCEPT"
	public final void mACCEPT() throws RecognitionException {
		try {
			int _type = ACCEPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:371:8: ( 'ACCEPT' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:371:10: 'ACCEPT'
			{
			match("ACCEPT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACCEPT"

	// $ANTLR start "ARGUMENTVALUE"
	public final void mARGUMENTVALUE() throws RecognitionException {
		try {
			int _type = ARGUMENTVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:372:15: ( 'ARGUMENT-VALUE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:372:17: 'ARGUMENT-VALUE'
			{
			match("ARGUMENT-VALUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARGUMENTVALUE"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:373:4: ( 'BY' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:373:6: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "PROGRAMID"
	public final void mPROGRAMID() throws RecognitionException {
		try {
			int _type = PROGRAMID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:374:11: ( 'PROGRAM-ID' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:374:13: 'PROGRAM-ID'
			{
			match("PROGRAM-ID"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAMID"

	// $ANTLR start "AUTHOR"
	public final void mAUTHOR() throws RecognitionException {
		try {
			int _type = AUTHOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:375:8: ( 'AUTHOR' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:375:10: 'AUTHOR'
			{
			match("AUTHOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTHOR"

	// $ANTLR start "HYPHEN"
	public final void mHYPHEN() throws RecognitionException {
		try {
			int _type = HYPHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:376:8: ( '-' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:376:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HYPHEN"

	// $ANTLR start "REDEFINES"
	public final void mREDEFINES() throws RecognitionException {
		try {
			int _type = REDEFINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:377:11: ( 'REDEFINES' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:377:13: 'REDEFINES'
			{
			match("REDEFINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REDEFINES"

	// $ANTLR start "EXIT"
	public final void mEXIT() throws RecognitionException {
		try {
			int _type = EXIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:378:6: ( 'EXIT' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:378:8: 'EXIT'
			{
			match("EXIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXIT"

	// $ANTLR start "STOP"
	public final void mSTOP() throws RecognitionException {
		try {
			int _type = STOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:379:6: ( 'STOP' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:379:8: 'STOP'
			{
			match("STOP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STOP"

	// $ANTLR start "RUN"
	public final void mRUN() throws RecognitionException {
		try {
			int _type = RUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:380:5: ( 'RUN' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:380:8: 'RUN'
			{
			match("RUN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUN"

	// $ANTLR start "EVALUATE"
	public final void mEVALUATE() throws RecognitionException {
		try {
			int _type = EVALUATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:381:10: ( 'EVALUATE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:381:12: 'EVALUATE'
			{
			match("EVALUATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVALUATE"

	// $ANTLR start "WHEN"
	public final void mWHEN() throws RecognitionException {
		try {
			int _type = WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:382:6: ( 'WHEN' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:382:8: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHEN"

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:383:6: ( 'WITH' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:383:8: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "TEST"
	public final void mTEST() throws RecognitionException {
		try {
			int _type = TEST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:384:6: ( 'TEST' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:384:8: 'TEST'
			{
			match("TEST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEST"

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:385:7: ( 'AFTER' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:385:9: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AFTER"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:386:6: ( 'TRUE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:386:8: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:387:7: ( 'FALSE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:387:9: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NOTTRUE"
	public final void mNOTTRUE() throws RecognitionException {
		try {
			int _type = NOTTRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:388:9: ( 'NOT TRUE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:388:11: 'NOT TRUE'
			{
			match("NOT TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTTRUE"

	// $ANTLR start "SINGLEQUOTES"
	public final void mSINGLEQUOTES() throws RecognitionException {
		try {
			int _type = SINGLEQUOTES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:389:14: ( '\\'' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:389:16: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLEQUOTES"

	// $ANTLR start "ADDITION"
	public final void mADDITION() throws RecognitionException {
		try {
			int _type = ADDITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:390:10: ( '+' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:390:12: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDITION"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:391:10: ( '*' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:391:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "NOTFALSE"
	public final void mNOTFALSE() throws RecognitionException {
		try {
			int _type = NOTFALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:392:10: ( 'NOT FALSE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:392:12: 'NOT FALSE'
			{
			match("NOT FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTFALSE"

	// $ANTLR start "ENDEVALUATE"
	public final void mENDEVALUATE() throws RecognitionException {
		try {
			int _type = ENDEVALUATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:393:13: ( 'END-EVALUATE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:393:15: 'END-EVALUATE'
			{
			match("END-EVALUATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDEVALUATE"

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:394:7: ( 'UNTIL' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:394:9: 'UNTIL'
			{
			match("UNTIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNTIL"

	// $ANTLR start "PERFORM"
	public final void mPERFORM() throws RecognitionException {
		try {
			int _type = PERFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:395:9: ( 'PERFORM' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:395:11: 'PERFORM'
			{
			match("PERFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERFORM"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:396:7: ( 'BEGIN' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:396:9: 'BEGIN'
			{
			match("BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "FILLER"
	public final void mFILLER() throws RecognitionException {
		try {
			int _type = FILLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:397:8: ( 'FILLER' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:397:10: 'FILLER'
			{
			match("FILLER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILLER"

	// $ANTLR start "SQLCA"
	public final void mSQLCA() throws RecognitionException {
		try {
			int _type = SQLCA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:398:7: ( 'SQLCA' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:398:9: 'SQLCA'
			{
			match("SQLCA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQLCA"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:399:10: ( 'FUNCTION' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:399:12: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "NUMVAL"
	public final void mNUMVAL() throws RecognitionException {
		try {
			int _type = NUMVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:400:8: ( 'NUMVAL' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:400:10: 'NUMVAL'
			{
			match("NUMVAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMVAL"

	// $ANTLR start "DISPLAY"
	public final void mDISPLAY() throws RecognitionException {
		try {
			int _type = DISPLAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:401:9: ( 'DISPLAY' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:401:11: 'DISPLAY'
			{
			match("DISPLAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISPLAY"

	// $ANTLR start "MOVE"
	public final void mMOVE() throws RecognitionException {
		try {
			int _type = MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:402:6: ( 'MOVE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:402:8: 'MOVE'
			{
			match("MOVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOVE"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:403:4: ( 'TO' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:403:6: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "QUOTES"
	public final void mQUOTES() throws RecognitionException {
		try {
			int _type = QUOTES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:404:8: ( '\"' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:404:10: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTES"

	// $ANTLR start "FORWARDSLASH"
	public final void mFORWARDSLASH() throws RecognitionException {
		try {
			int _type = FORWARDSLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:405:14: ( '/' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:405:16: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORWARDSLASH"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:406:4: ( 'IF' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:406:6: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:407:6: ( 'THEN' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:407:8: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:408:6: ( 'ELSE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:408:8: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FIGURATIVE"
	public final void mFIGURATIVE() throws RecognitionException {
		try {
			int _type = FIGURATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:409:12: ( 'SPACE' | 'ZERO' | 'NUMERIC' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 'S':
				{
				alt2=1;
				}
				break;
			case 'Z':
				{
				alt2=2;
				}
				break;
			case 'N':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:409:14: 'SPACE'
					{
					match("SPACE"); 

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:409:24: 'ZERO'
					{
					match("ZERO"); 

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:409:33: 'NUMERIC'
					{
					match("NUMERIC"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIGURATIVE"

	// $ANTLR start "GREATERTHANEQUAL"
	public final void mGREATERTHANEQUAL() throws RecognitionException {
		try {
			int _type = GREATERTHANEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:410:18: ( '>=' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:410:20: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANEQUAL"

	// $ANTLR start "LESSERTHANEQUAL"
	public final void mLESSERTHANEQUAL() throws RecognitionException {
		try {
			int _type = LESSERTHANEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:411:17: ( '<=' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:411:19: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSERTHANEQUAL"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:412:8: ( '(' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:412:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:413:8: ( ')' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:413:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:414:7: ( '=' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:414:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:415:11: ( '>' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:415:13: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "LESSER"
	public final void mLESSER() throws RecognitionException {
		try {
			int _type = LESSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:416:10: ( '<' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:416:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSER"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:417:5: ( 'AND' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:417:7: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "DON"
	public final void mDON() throws RecognitionException {
		try {
			int _type = DON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:418:5: ( '<>' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:418:7: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DON"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:419:4: ( 'OR' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:419:7: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:420:5: ( 'END' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:420:7: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "ENDPERFORM"
	public final void mENDPERFORM() throws RecognitionException {
		try {
			int _type = ENDPERFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:421:12: ( 'END-PERFORM' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:421:14: 'END-PERFORM'
			{
			match("END-PERFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDPERFORM"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:422:5: ( 'NOT' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:422:7: 'NOT'
			{
			match("NOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:423:7: ( 'END-IF' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:423:9: 'END-IF'
			{
			match("END-IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "PIC"
	public final void mPIC() throws RecognitionException {
		try {
			int _type = PIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:424:5: ( 'PIC' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:424:7: 'PIC'
			{
			match("PIC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PIC"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			int _type = X;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:425:3: ( 'X' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:425:5: 'X'
			{
			match('X'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "S9"
	public final void mS9() throws RecognitionException {
		try {
			int _type = S9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:426:4: ( 'S9' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:426:6: 'S9'
			{
			match("S9"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S9"

	// $ANTLR start "COMP3"
	public final void mCOMP3() throws RecognitionException {
		try {
			int _type = COMP3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:427:7: ( 'COMP-3' | 'COMP' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='C') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='O') ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2=='M') ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3=='P') ) {
							int LA3_4 = input.LA(5);
							if ( (LA3_4=='-') ) {
								alt3=1;
							}

							else {
								alt3=2;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:427:9: 'COMP-3'
					{
					match("COMP-3"); 

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:427:20: 'COMP'
					{
					match("COMP"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP3"

	// $ANTLR start "VALUE"
	public final void mVALUE() throws RecognitionException {
		try {
			int _type = VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:428:7: ( 'VALUE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:428:9: 'VALUE'
			{
			match("VALUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUE"

	// $ANTLR start "INITIALIZE"
	public final void mINITIALIZE() throws RecognitionException {
		try {
			int _type = INITIALIZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:429:12: ( 'INITIALIZE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:429:14: 'INITIALIZE'
			{
			match("INITIALIZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INITIALIZE"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:430:5: ( 'ADD' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:430:7: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:431:5: ( 'SUBTRACT' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:431:7: 'SUBTRACT'
			{
			match("SUBTRACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:432:6: ( 'FROM' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:432:8: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:433:8: ( 'INSERT' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:433:10: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERT"

	// $ANTLR start "EXEC"
	public final void mEXEC() throws RecognitionException {
		try {
			int _type = EXEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:434:6: ( 'EXEC' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:434:8: 'EXEC'
			{
			match("EXEC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXEC"

	// $ANTLR start "SQL"
	public final void mSQL() throws RecognitionException {
		try {
			int _type = SQL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:435:5: ( 'SQL' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:435:7: 'SQL'
			{
			match("SQL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL"

	// $ANTLR start "ENDEXEC"
	public final void mENDEXEC() throws RecognitionException {
		try {
			int _type = ENDEXEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:436:9: ( 'END-EXEC' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:436:10: 'END-EXEC'
			{
			match("END-EXEC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDEXEC"

	// $ANTLR start "HASH"
	public final void mHASH() throws RecognitionException {
		try {
			int _type = HASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:437:6: ( '#' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:437:8: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASH"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:438:7: ( 'WHERE' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:438:9: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "CALL"
	public final void mCALL() throws RecognitionException {
		try {
			int _type = CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:439:6: ( 'CALL' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:439:8: 'CALL'
			{
			match("CALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CALL"

	// $ANTLR start "USING"
	public final void mUSING() throws RecognitionException {
		try {
			int _type = USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:440:7: ( 'USING' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:440:9: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USING"

	// $ANTLR start "NINE"
	public final void mNINE() throws RecognitionException {
		try {
			int _type = NINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:441:6: ( '9' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:441:8: '9'
			{
			match('9'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NINE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:442:7: ( ',' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:442:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:443:8: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:443:10: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:443:14: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			int _type = UNDERSCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:444:12: ( '_' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:444:14: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "HOSTVARIABLES"
	public final void mHOSTVARIABLES() throws RecognitionException {
		try {
			int _type = HOSTVARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:15: ( ( COLON ) ( LETTER | DIGITS | HYPHEN | UNDERSCORE | COLON )+ )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:17: ( COLON ) ( LETTER | DIGITS | HYPHEN | UNDERSCORE | COLON )+
			{
			if ( input.LA(1)==':' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:24: ( LETTER | DIGITS | HYPHEN | UNDERSCORE | COLON )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=6;
				switch ( input.LA(1) ) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt5=1;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt5=2;
					}
					break;
				case '-':
					{
					alt5=3;
					}
					break;
				case '_':
					{
					alt5=4;
					}
					break;
				case ':':
					{
					alt5=5;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:25: LETTER
					{
					mLETTER(); 

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:32: DIGITS
					{
					mDIGITS(); 

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:39: HYPHEN
					{
					mHYPHEN(); 

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:46: UNDERSCORE
					{
					mUNDERSCORE(); 

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:445:57: COLON
					{
					mCOLON(); 

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOSTVARIABLES"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:12: ( ( LETTER ) ( LETTER | DIGITS | HYPHEN | UNDERSCORE | COLON )+ )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:14: ( LETTER ) ( LETTER | DIGITS | HYPHEN | UNDERSCORE | COLON )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:22: ( LETTER | DIGITS | HYPHEN | UNDERSCORE | COLON )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=6;
				switch ( input.LA(1) ) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt6=1;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt6=2;
					}
					break;
				case '-':
					{
					alt6=3;
					}
					break;
				case '_':
					{
					alt6=4;
					}
					break;
				case ':':
					{
					alt6=5;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:23: LETTER
					{
					mLETTER(); 

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:30: DIGITS
					{
					mDIGITS(); 

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:37: HYPHEN
					{
					mHYPHEN(); 

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:44: UNDERSCORE
					{
					mUNDERSCORE(); 

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:446:55: COLON
					{
					mCOLON(); 

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "SPECIALSYMBOL"
	public final void mSPECIALSYMBOL() throws RecognitionException {
		try {
			int _type = SPECIALSYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:447:15: ( '!' | '@' | '$' | '%' | '^' | '&' | '*' | '=' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '$' && input.LA(1) <= '&')||input.LA(1)=='*'||input.LA(1)=='='||input.LA(1)=='@'||input.LA(1)=='^' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIALSYMBOL"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:448:7: ( ':' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:448:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			int _type = LETTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:449:8: ( 'A' .. 'Z' | 'a' .. 'z' )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGITS"
	public final void mDIGITS() throws RecognitionException {
		try {
			int _type = DIGITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:450:7: ( ( '0' .. '9' )+ )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:450:9: ( '0' .. '9' )+
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:450:9: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGITS"

	// $ANTLR start "ALLEXCEPTHASH"
	public final void mALLEXCEPTHASH() throws RecognitionException {
		try {
			int _type = ALLEXCEPTHASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:451:15: (~ ( '#' ) )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALLEXCEPTHASH"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:8: ( WS | IDENTIFICATION | ENVIRONMENT | DATA | PROCEDURE | DIVISION | INCLUDE | DECLARE | WORKINGSTORAGE | COMPUTE | CONFIGURATION | SECTION | OBJECTCOMP | SOURCECOMP | VARYING | DOT | NOTEQUAL | ACCEPT | ARGUMENTVALUE | BY | PROGRAMID | AUTHOR | HYPHEN | REDEFINES | EXIT | STOP | RUN | EVALUATE | WHEN | WITH | TEST | AFTER | TRUE | FALSE | NOTTRUE | SINGLEQUOTES | ADDITION | MULTIPLY | NOTFALSE | ENDEVALUATE | UNTIL | PERFORM | BEGIN | FILLER | SQLCA | FUNCTION | NUMVAL | DISPLAY | MOVE | TO | QUOTES | FORWARDSLASH | IF | THEN | ELSE | FIGURATIVE | GREATERTHANEQUAL | LESSERTHANEQUAL | LPAREN | RPAREN | EQUAL | GREATER | LESSER | AND | DON | OR | END | ENDPERFORM | NOT | ENDIF | PIC | X | S9 | COMP3 | VALUE | INITIALIZE | ADD | SUB | FROM | INSERT | EXEC | SQL | ENDEXEC | HASH | WHERE | CALL | USING | NINE | COMMA | STRING | UNDERSCORE | HOSTVARIABLES | IDENTIFIER | SPECIALSYMBOL | COLON | LETTER | DIGITS | ALLEXCEPTHASH )
		int alt8=98;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:13: IDENTIFICATION
				{
				mIDENTIFICATION(); 

				}
				break;
			case 3 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:28: ENVIRONMENT
				{
				mENVIRONMENT(); 

				}
				break;
			case 4 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:40: DATA
				{
				mDATA(); 

				}
				break;
			case 5 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:45: PROCEDURE
				{
				mPROCEDURE(); 

				}
				break;
			case 6 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:55: DIVISION
				{
				mDIVISION(); 

				}
				break;
			case 7 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:64: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 8 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:72: DECLARE
				{
				mDECLARE(); 

				}
				break;
			case 9 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:80: WORKINGSTORAGE
				{
				mWORKINGSTORAGE(); 

				}
				break;
			case 10 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:95: COMPUTE
				{
				mCOMPUTE(); 

				}
				break;
			case 11 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:103: CONFIGURATION
				{
				mCONFIGURATION(); 

				}
				break;
			case 12 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:117: SECTION
				{
				mSECTION(); 

				}
				break;
			case 13 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:125: OBJECTCOMP
				{
				mOBJECTCOMP(); 

				}
				break;
			case 14 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:136: SOURCECOMP
				{
				mSOURCECOMP(); 

				}
				break;
			case 15 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:147: VARYING
				{
				mVARYING(); 

				}
				break;
			case 16 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:155: DOT
				{
				mDOT(); 

				}
				break;
			case 17 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:159: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 18 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:168: ACCEPT
				{
				mACCEPT(); 

				}
				break;
			case 19 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:175: ARGUMENTVALUE
				{
				mARGUMENTVALUE(); 

				}
				break;
			case 20 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:189: BY
				{
				mBY(); 

				}
				break;
			case 21 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:192: PROGRAMID
				{
				mPROGRAMID(); 

				}
				break;
			case 22 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:202: AUTHOR
				{
				mAUTHOR(); 

				}
				break;
			case 23 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:209: HYPHEN
				{
				mHYPHEN(); 

				}
				break;
			case 24 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:216: REDEFINES
				{
				mREDEFINES(); 

				}
				break;
			case 25 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:226: EXIT
				{
				mEXIT(); 

				}
				break;
			case 26 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:231: STOP
				{
				mSTOP(); 

				}
				break;
			case 27 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:236: RUN
				{
				mRUN(); 

				}
				break;
			case 28 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:240: EVALUATE
				{
				mEVALUATE(); 

				}
				break;
			case 29 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:249: WHEN
				{
				mWHEN(); 

				}
				break;
			case 30 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:254: WITH
				{
				mWITH(); 

				}
				break;
			case 31 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:259: TEST
				{
				mTEST(); 

				}
				break;
			case 32 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:264: AFTER
				{
				mAFTER(); 

				}
				break;
			case 33 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:270: TRUE
				{
				mTRUE(); 

				}
				break;
			case 34 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:275: FALSE
				{
				mFALSE(); 

				}
				break;
			case 35 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:281: NOTTRUE
				{
				mNOTTRUE(); 

				}
				break;
			case 36 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:289: SINGLEQUOTES
				{
				mSINGLEQUOTES(); 

				}
				break;
			case 37 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:302: ADDITION
				{
				mADDITION(); 

				}
				break;
			case 38 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:311: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 39 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:320: NOTFALSE
				{
				mNOTFALSE(); 

				}
				break;
			case 40 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:329: ENDEVALUATE
				{
				mENDEVALUATE(); 

				}
				break;
			case 41 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:341: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 42 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:347: PERFORM
				{
				mPERFORM(); 

				}
				break;
			case 43 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:355: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 44 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:361: FILLER
				{
				mFILLER(); 

				}
				break;
			case 45 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:368: SQLCA
				{
				mSQLCA(); 

				}
				break;
			case 46 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:374: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 47 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:383: NUMVAL
				{
				mNUMVAL(); 

				}
				break;
			case 48 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:390: DISPLAY
				{
				mDISPLAY(); 

				}
				break;
			case 49 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:398: MOVE
				{
				mMOVE(); 

				}
				break;
			case 50 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:403: TO
				{
				mTO(); 

				}
				break;
			case 51 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:406: QUOTES
				{
				mQUOTES(); 

				}
				break;
			case 52 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:413: FORWARDSLASH
				{
				mFORWARDSLASH(); 

				}
				break;
			case 53 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:426: IF
				{
				mIF(); 

				}
				break;
			case 54 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:429: THEN
				{
				mTHEN(); 

				}
				break;
			case 55 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:434: ELSE
				{
				mELSE(); 

				}
				break;
			case 56 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:439: FIGURATIVE
				{
				mFIGURATIVE(); 

				}
				break;
			case 57 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:450: GREATERTHANEQUAL
				{
				mGREATERTHANEQUAL(); 

				}
				break;
			case 58 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:467: LESSERTHANEQUAL
				{
				mLESSERTHANEQUAL(); 

				}
				break;
			case 59 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:483: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 60 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:490: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 61 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:497: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 62 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:503: GREATER
				{
				mGREATER(); 

				}
				break;
			case 63 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:511: LESSER
				{
				mLESSER(); 

				}
				break;
			case 64 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:518: AND
				{
				mAND(); 

				}
				break;
			case 65 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:522: DON
				{
				mDON(); 

				}
				break;
			case 66 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:526: OR
				{
				mOR(); 

				}
				break;
			case 67 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:529: END
				{
				mEND(); 

				}
				break;
			case 68 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:533: ENDPERFORM
				{
				mENDPERFORM(); 

				}
				break;
			case 69 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:544: NOT
				{
				mNOT(); 

				}
				break;
			case 70 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:548: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 71 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:554: PIC
				{
				mPIC(); 

				}
				break;
			case 72 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:558: X
				{
				mX(); 

				}
				break;
			case 73 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:560: S9
				{
				mS9(); 

				}
				break;
			case 74 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:563: COMP3
				{
				mCOMP3(); 

				}
				break;
			case 75 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:569: VALUE
				{
				mVALUE(); 

				}
				break;
			case 76 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:575: INITIALIZE
				{
				mINITIALIZE(); 

				}
				break;
			case 77 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:586: ADD
				{
				mADD(); 

				}
				break;
			case 78 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:590: SUB
				{
				mSUB(); 

				}
				break;
			case 79 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:594: FROM
				{
				mFROM(); 

				}
				break;
			case 80 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:599: INSERT
				{
				mINSERT(); 

				}
				break;
			case 81 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:606: EXEC
				{
				mEXEC(); 

				}
				break;
			case 82 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:611: SQL
				{
				mSQL(); 

				}
				break;
			case 83 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:615: ENDEXEC
				{
				mENDEXEC(); 

				}
				break;
			case 84 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:623: HASH
				{
				mHASH(); 

				}
				break;
			case 85 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:628: WHERE
				{
				mWHERE(); 

				}
				break;
			case 86 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:634: CALL
				{
				mCALL(); 

				}
				break;
			case 87 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:639: USING
				{
				mUSING(); 

				}
				break;
			case 88 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:645: NINE
				{
				mNINE(); 

				}
				break;
			case 89 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:650: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 90 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:656: STRING
				{
				mSTRING(); 

				}
				break;
			case 91 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:663: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 92 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:674: HOSTVARIABLES
				{
				mHOSTVARIABLES(); 

				}
				break;
			case 93 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:688: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 94 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:699: SPECIALSYMBOL
				{
				mSPECIALSYMBOL(); 

				}
				break;
			case 95 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:713: COLON
				{
				mCOLON(); 

				}
				break;
			case 96 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:719: LETTER
				{
				mLETTER(); 

				}
				break;
			case 97 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:726: DIGITS
				{
				mDIGITS(); 

				}
				break;
			case 98 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:1:733: ALLEXCEPTHASH
				{
				mALLEXCEPTHASH(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\2\uffff\11\57\1\uffff\3\57\1\uffff\3\57\3\uffff\2\57\1\145\1\uffff\1"+
		"\57\1\152\1\155\3\uffff\1\161\1\uffff\1\162\2\uffff\1\167\1\57\4\uffff"+
		"\2\56\1\175\2\uffff\24\56\1\u0096\2\56\1\u0099\1\56\1\uffff\10\56\1\u00a4"+
		"\1\56\1\uffff\4\56\1\u00aa\5\56\3\uffff\3\56\3\uffff\1\56\20\uffff\4\56"+
		"\1\uffff\1\56\1\u00ba\12\56\1\u00c6\11\56\1\u00d2\1\56\1\uffff\2\56\1"+
		"\uffff\2\56\1\u00d9\5\56\1\u00e0\1\u00e1\1\uffff\2\56\1\u00e4\2\56\1\uffff"+
		"\17\56\1\uffff\1\u00f8\1\u00f9\1\56\1\u00fb\1\u00fc\6\56\1\uffff\1\56"+
		"\1\u0104\1\56\1\u0106\1\u0109\1\56\1\u010b\2\56\1\u010e\1\56\1\uffff\5"+
		"\56\2\uffff\6\56\2\uffff\2\56\1\uffff\1\u0120\1\u0121\1\u0122\3\56\1\u0126"+
		"\2\56\1\u0129\1\u012a\10\56\2\uffff\1\56\2\uffff\7\56\1\uffff\1\u013c"+
		"\1\uffff\2\56\1\uffff\1\56\1\uffff\2\56\1\uffff\1\u0142\1\u012a\3\56\1"+
		"\u0146\3\uffff\5\56\1\u014c\1\u014d\1\56\3\uffff\1\u014f\2\56\1\uffff"+
		"\1\u0152\1\u0153\2\uffff\3\56\1\u0157\4\56\1\u015c\10\56\1\uffff\1\56"+
		"\1\u0109\3\56\1\uffff\3\56\1\uffff\1\u016c\1\56\1\u016e\1\56\1\u0170\2"+
		"\uffff\1\56\1\uffff\1\u0172\1\56\2\uffff\1\56\1\u0175\1\56\1\uffff\4\56"+
		"\1\uffff\2\56\1\u017d\1\u017e\2\56\1\u0181\1\56\1\u0183\1\56\1\u0185\3"+
		"\56\1\u0189\1\uffff\1\u012a\1\uffff\1\56\1\uffff\1\56\1\uffff\2\56\1\uffff"+
		"\3\56\1\u0191\1\56\1\u0193\1\u0194\2\uffff\2\56\1\uffff\1\56\1\uffff\1"+
		"\56\1\uffff\1\56\1\u019a\1\56\1\uffff\2\56\1\u019e\4\56\1\uffff\1\56\2"+
		"\uffff\1\u01a4\4\56\1\uffff\2\56\1\u01ab\1\uffff\1\56\1\u01ad\3\56\1\uffff"+
		"\1\u01b1\5\56\1\uffff\1\56\1\uffff\1\u01b8\1\56\1\u01ba\1\uffff\6\56\1"+
		"\uffff\1\u01c1\1\uffff\6\56\1\uffff\1\56\1\u01c9\3\56\1\u01cd\1\56\1\uffff"+
		"\2\56\1\u01d1\1\uffff\1\u01d2\1\u01d3\1\u01d4\4\uffff";
	static final String DFA8_eofS =
		"\u01d5\uffff";
	static final String DFA8_minS =
		"\1\0\1\uffff\11\55\1\uffff\3\55\1\uffff\3\55\3\uffff\2\55\1\0\1\uffff"+
		"\1\55\2\75\3\uffff\1\55\1\uffff\1\60\2\uffff\2\55\4\uffff\1\105\1\103"+
		"\1\55\2\uffff\1\104\1\105\1\101\1\123\1\124\1\123\1\103\1\117\1\122\1"+
		"\103\1\122\1\105\1\124\1\115\1\114\1\103\1\125\1\117\1\114\1\101\1\55"+
		"\1\102\1\112\1\55\1\114\1\uffff\1\124\1\115\1\103\1\107\2\124\2\104\1"+
		"\55\1\107\1\uffff\1\104\1\116\1\123\1\125\1\55\1\105\2\114\1\116\1\117"+
		"\3\uffff\1\124\1\111\1\126\3\uffff\1\122\20\uffff\1\116\1\114\1\124\1"+
		"\105\1\uffff\1\111\1\55\1\124\1\103\1\114\1\105\1\101\1\111\1\120\1\114"+
		"\1\103\1\106\1\55\1\113\1\116\1\110\1\120\1\106\1\114\1\124\1\122\1\120"+
		"\1\55\1\103\1\uffff\1\124\1\105\1\uffff\1\131\1\125\1\40\2\105\1\125\1"+
		"\110\1\105\2\55\1\uffff\1\111\1\105\1\55\1\124\1\105\1\uffff\1\116\1\123"+
		"\1\114\1\103\1\115\1\111\1\116\1\105\1\117\1\124\1\125\1\111\2\122\1\105"+
		"\1\uffff\2\55\1\125\2\55\1\123\1\114\1\101\1\105\1\122\1\117\1\uffff\1"+
		"\111\1\55\1\105\2\55\1\111\1\55\1\111\1\103\1\55\1\101\1\uffff\1\105\1"+
		"\122\1\103\1\111\1\105\1\75\1\uffff\1\101\1\122\1\120\1\115\1\117\1\122"+
		"\2\uffff\1\116\1\106\1\uffff\3\55\2\105\1\124\1\55\1\114\1\107\2\55\1"+
		"\111\1\104\1\101\1\124\1\117\1\126\1\105\1\106\2\uffff\1\101\2\uffff\1"+
		"\111\1\101\1\122\1\104\1\101\1\122\1\116\1\uffff\1\55\1\uffff\1\124\1"+
		"\63\1\uffff\1\107\1\uffff\1\117\1\105\1\uffff\2\55\1\101\1\124\1\116\1"+
		"\55\3\uffff\1\114\1\111\1\124\1\105\1\122\2\55\1\111\3\uffff\1\55\1\122"+
		"\1\111\1\uffff\2\55\2\uffff\1\106\1\105\1\114\1\55\1\116\1\101\1\105\1"+
		"\122\1\55\1\124\1\117\1\131\1\105\1\125\2\115\1\107\1\uffff\1\105\1\55"+
		"\1\125\1\116\1\55\1\uffff\1\103\1\55\1\107\1\uffff\1\55\1\103\1\55\1\116"+
		"\1\55\2\uffff\1\116\1\uffff\1\55\1\117\2\uffff\1\111\1\55\1\111\1\uffff"+
		"\1\115\1\114\1\103\1\106\1\uffff\1\105\1\116\2\55\1\122\4\55\1\122\1\55"+
		"\1\103\1\124\1\103\1\55\1\uffff\1\55\1\uffff\1\124\1\uffff\1\105\1\uffff"+
		"\1\116\1\103\1\uffff\1\132\1\105\1\125\1\55\1\117\2\55\2\uffff\1\105\1"+
		"\111\1\uffff\1\123\1\uffff\1\101\1\uffff\1\117\1\55\1\117\1\uffff\1\55"+
		"\1\123\1\55\1\101\1\105\1\116\1\101\1\uffff\1\122\2\uffff\1\55\1\104\2"+
		"\124\1\115\1\uffff\1\115\1\126\1\55\1\uffff\1\124\1\55\2\124\1\115\1\uffff"+
		"\1\55\1\117\1\111\2\120\1\101\1\uffff\1\111\1\uffff\1\55\1\105\1\55\1"+
		"\uffff\1\122\1\117\2\125\1\114\1\117\1\uffff\1\55\1\uffff\1\101\1\116"+
		"\2\124\1\125\1\116\1\uffff\1\107\1\55\3\105\1\55\1\105\1\uffff\2\122\1"+
		"\55\1\uffff\3\55\4\uffff";
	static final String DFA8_maxS =
		"\1\uffff\1\uffff\11\172\1\uffff\3\172\1\uffff\3\172\3\uffff\2\172\1\uffff"+
		"\1\uffff\1\172\1\75\1\76\3\uffff\1\172\1\uffff\1\71\2\uffff\2\172\4\uffff"+
		"\1\105\1\123\1\172\2\uffff\1\126\1\111\1\101\1\123\1\124\1\126\1\103\1"+
		"\117\1\122\1\103\1\122\1\105\1\124\1\116\1\114\1\103\1\125\1\117\1\114"+
		"\1\101\1\172\1\102\1\112\1\172\1\122\1\uffff\1\124\1\115\1\103\1\107\2"+
		"\124\2\104\1\172\1\107\1\uffff\1\104\1\116\1\123\1\125\1\172\1\105\2\114"+
		"\1\116\1\117\3\uffff\1\124\1\111\1\126\3\uffff\1\122\20\uffff\1\116\1"+
		"\114\1\124\1\105\1\uffff\1\111\1\172\1\124\1\103\1\114\1\105\1\101\1\111"+
		"\1\120\1\114\1\107\1\106\1\172\1\113\1\122\1\110\1\120\1\106\1\114\1\124"+
		"\1\122\1\120\1\172\1\103\1\uffff\1\124\1\105\1\uffff\1\131\1\125\1\172"+
		"\1\126\1\105\1\125\1\110\1\105\2\172\1\uffff\1\111\1\105\1\172\1\124\1"+
		"\105\1\uffff\1\116\1\123\1\114\1\103\1\115\1\111\1\116\1\105\1\117\1\124"+
		"\1\125\1\111\2\122\1\120\1\uffff\2\172\1\125\2\172\1\123\1\114\1\101\1"+
		"\105\1\122\1\117\1\uffff\1\111\1\172\1\105\2\172\1\111\1\172\1\111\1\103"+
		"\1\172\1\101\1\uffff\1\105\1\122\1\103\1\111\1\105\1\124\1\uffff\1\101"+
		"\1\122\1\120\1\115\1\117\1\122\2\uffff\1\116\1\106\1\uffff\3\172\2\105"+
		"\1\124\1\172\1\114\1\107\2\172\1\111\1\104\1\101\1\124\1\117\1\130\1\105"+
		"\1\106\2\uffff\1\101\2\uffff\1\111\1\101\1\122\1\104\1\101\1\122\1\116"+
		"\1\uffff\1\172\1\uffff\1\124\1\63\1\uffff\1\107\1\uffff\1\117\1\105\1"+
		"\uffff\2\172\1\101\1\124\1\116\1\172\3\uffff\1\114\1\111\1\124\1\105\1"+
		"\122\2\172\1\111\3\uffff\1\172\1\122\1\111\1\uffff\2\172\2\uffff\1\106"+
		"\1\105\1\114\1\172\1\116\1\101\1\105\1\122\1\172\1\124\1\117\1\131\1\105"+
		"\1\125\2\115\1\107\1\uffff\1\105\1\172\1\125\1\116\1\55\1\uffff\1\103"+
		"\1\55\1\107\1\uffff\1\172\1\103\1\172\1\116\1\172\2\uffff\1\116\1\uffff"+
		"\1\172\1\117\2\uffff\1\111\1\172\1\111\1\uffff\1\115\1\114\1\103\1\106"+
		"\1\uffff\1\105\1\116\2\172\1\122\1\55\1\172\1\55\1\172\1\122\1\172\1\103"+
		"\1\124\1\103\1\172\1\uffff\1\172\1\uffff\1\124\1\uffff\1\105\1\uffff\1"+
		"\116\1\103\1\uffff\1\132\1\105\1\125\1\172\1\117\2\172\2\uffff\1\105\1"+
		"\111\1\uffff\1\123\1\uffff\1\101\1\uffff\1\117\1\172\1\117\1\uffff\1\55"+
		"\1\123\1\172\1\101\1\105\1\116\1\101\1\uffff\1\122\2\uffff\1\172\1\104"+
		"\2\124\1\115\1\uffff\1\115\1\126\1\172\1\uffff\1\124\1\172\2\124\1\115"+
		"\1\uffff\1\172\1\117\1\111\2\120\1\101\1\uffff\1\111\1\uffff\1\172\1\105"+
		"\1\172\1\uffff\1\122\1\117\2\125\1\114\1\117\1\uffff\1\172\1\uffff\1\101"+
		"\1\116\2\124\1\125\1\116\1\uffff\1\107\1\172\3\105\1\172\1\105\1\uffff"+
		"\2\122\1\172\1\uffff\3\172\4\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\11\uffff\1\20\3\uffff\1\27\3\uffff\1\44\1\45\1\46\3\uffff"+
		"\1\64\3\uffff\1\73\1\74\1\75\1\uffff\1\124\1\uffff\1\131\1\133\2\uffff"+
		"\1\136\1\141\1\142\1\1\3\uffff\1\135\1\140\31\uffff\1\20\12\uffff\1\27"+
		"\12\uffff\1\44\1\45\1\46\3\uffff\1\63\1\132\1\64\1\uffff\1\71\1\76\1\72"+
		"\1\101\1\77\1\73\1\74\1\75\1\110\1\130\1\141\1\131\1\133\1\134\1\137\1"+
		"\136\4\uffff\1\65\30\uffff\1\111\2\uffff\1\102\12\uffff\1\24\5\uffff\1"+
		"\62\17\uffff\1\103\13\uffff\1\107\13\uffff\1\122\6\uffff\1\105\6\uffff"+
		"\1\100\1\115\2\uffff\1\33\23\uffff\1\31\1\121\1\uffff\1\67\1\4\7\uffff"+
		"\1\35\1\uffff\1\36\2\uffff\1\112\1\uffff\1\126\2\uffff\1\32\6\uffff\1"+
		"\21\1\43\1\47\10\uffff\1\37\1\41\1\66\3\uffff\1\117\2\uffff\1\61\1\70"+
		"\21\uffff\1\125\5\uffff\1\55\3\uffff\1\113\5\uffff\1\40\1\53\1\uffff\1"+
		"\42\2\uffff\1\51\1\127\3\uffff\1\120\4\uffff\1\106\17\uffff\1\57\1\uffff"+
		"\1\22\1\uffff\1\26\1\uffff\1\54\2\uffff\1\7\7\uffff\1\60\1\10\2\uffff"+
		"\1\52\1\uffff\1\12\1\uffff\1\14\3\uffff\1\17\7\uffff\1\123\1\uffff\1\34"+
		"\1\6\5\uffff\1\116\3\uffff\1\56\5\uffff\1\5\6\uffff\1\30\1\uffff\1\114"+
		"\3\uffff\1\25\6\uffff\1\3\1\uffff\1\104\6\uffff\1\50\7\uffff\1\13\3\uffff"+
		"\1\2\3\uffff\1\23\1\11\1\16\1\15";
	static final String DFA8_specialS =
		"\1\1\27\uffff\1\0\u01bc\uffff}>";
	static final String[] DFA8_transitionS = {
			"\11\51\2\1\2\51\1\1\22\51\1\1\1\47\1\30\1\41\3\47\1\23\1\35\1\36\1\25"+
			"\1\24\1\43\1\17\1\13\1\31\11\50\1\42\1\45\1\51\1\34\1\37\1\33\1\51\1"+
			"\47\1\15\1\16\1\7\1\4\1\3\1\22\2\46\1\2\3\46\1\27\1\14\1\11\1\5\1\46"+
			"\1\20\1\10\1\21\1\26\1\12\1\6\1\40\1\46\1\32\3\51\1\47\1\44\1\51\32\46"+
			"\uff85\51",
			"",
			"\1\56\2\uffff\13\56\6\uffff\3\56\1\53\1\56\1\55\7\56\1\54\14\56\4\uffff"+
			"\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\13\56\1\63\1\56\1\60\7\56\1\62\1\56\1\61"+
			"\2\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\1\64\3\56\1\66\3\56\1\65\21\56\4\uffff\1"+
			"\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\4\56\1\70\3\56\1\71\10\56\1\67\10\56\4\uffff"+
			"\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\7\56\1\73\1\74\5\56\1\72\13\56\4\uffff\1"+
			"\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\1\76\15\56\1\75\13\56\4\uffff\1\56\1\uffff"+
			"\32\56",
			"\1\56\2\uffff\11\56\1\104\1\56\6\uffff\4\56\1\77\11\56\1\100\1\103\1"+
			"\102\2\56\1\101\1\105\5\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\1\56\1\106\17\56\1\107\10\56\4\uffff\1\56"+
			"\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\1\110\31\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\56\2\uffff\13\56\6\uffff\16\56\1\112\5\56\1\113\5\56\4\uffff\1\56"+
			"\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\2\56\1\114\1\121\1\56\1\117\7\56\1\120\3"+
			"\56\1\115\2\56\1\116\5\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\4\56\1\123\23\56\1\122\1\56\4\uffff\1\56"+
			"\1\uffff\32\56",
			"",
			"\1\56\2\uffff\13\56\6\uffff\4\56\1\125\17\56\1\126\5\56\4\uffff\1\56"+
			"\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\4\56\1\127\2\56\1\132\6\56\1\131\2\56\1"+
			"\130\10\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\1\133\7\56\1\134\10\56\1\136\2\56\1\135"+
			"\5\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"\1\56\2\uffff\13\56\6\uffff\15\56\1\142\4\56\1\143\7\56\4\uffff\1\56"+
			"\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\16\56\1\144\13\56\4\uffff\1\56\1\uffff\32"+
			"\56",
			"\12\146\1\uffff\2\146\1\uffff\ufff2\146",
			"",
			"\1\56\2\uffff\13\56\6\uffff\4\56\1\150\25\56\4\uffff\1\56\1\uffff\32"+
			"\56",
			"\1\151",
			"\1\153\1\154",
			"",
			"",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\12\163",
			"",
			"",
			"\1\166\2\uffff\13\166\6\uffff\32\166\4\uffff\1\166\1\uffff\32\166",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"",
			"\1\171",
			"\1\172\5\uffff\1\173\11\uffff\1\174",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\177\21\uffff\1\176",
			"\1\u0081\3\uffff\1\u0080",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0086\2\uffff\1\u0085",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0097",
			"\1\u0098",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u009b\5\uffff\1\u009a",
			"",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00a5",
			"",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"",
			"",
			"",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"",
			"",
			"",
			"\1\u00b3",
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
			"",
			"",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"",
			"\1\u00b8",
			"\1\u00b9\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3\3\uffff\1\u00c4",
			"\1\u00c5",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00c7",
			"\1\u00c8\3\uffff\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\56\2\uffff\13\56\6\uffff\2\56\1\u00d1\27\56\4\uffff\1\56\1\uffff"+
			"\32\56",
			"\1\u00d3",
			"",
			"\1\u00d4",
			"\1\u00d5",
			"",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8\14\uffff\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff"+
			"\32\56",
			"\1\u00db\20\uffff\1\u00da",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u00e2",
			"\1\u00e3",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00e5",
			"\1\u00e6",
			"",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5\3\uffff\1\u00f7\6\uffff\1\u00f6",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00fa",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"",
			"\1\u0103",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0105",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0108\2\uffff\13\56\6\uffff\24\56\1\u0107\5\56\4\uffff\1\56\1\uffff"+
			"\32\56",
			"\1\u010a",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u010c",
			"\1\u010d",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u010f",
			"",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115\10\uffff\1\u0117\15\uffff\1\u0116",
			"",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"",
			"",
			"\1\u011e",
			"\1\u011f",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0127",
			"\1\u0128",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130\1\uffff\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"",
			"",
			"\1\u0134",
			"",
			"",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u013d",
			"\1\u013e",
			"",
			"\1\u013f",
			"",
			"\1\u0140",
			"\1\u0141",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u014e",
			"",
			"",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0150",
			"\1\u0151",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"",
			"\1\u0165",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u016d",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u016f",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\u0171",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0173",
			"",
			"",
			"\1\u0174",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0176",
			"",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"",
			"\1\u017b",
			"\1\u017c",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u017f",
			"\1\u0180",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0182",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0184",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u018a",
			"",
			"\1\u018b",
			"",
			"\1\u018c",
			"\1\u018d",
			"",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0192",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\u0195",
			"\1\u0196",
			"",
			"\1\u0197",
			"",
			"\1\u0198",
			"",
			"\1\u0199",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u019b",
			"",
			"\1\u019c",
			"\1\u019d",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"",
			"\1\u01a3",
			"",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"",
			"\1\u01a9",
			"\1\u01aa",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u01ac",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"",
			"\1\u01b7",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u01b9",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"",
			"\1\u01c8",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u01ce",
			"",
			"\1\u01cf",
			"\1\u01d0",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\56\2\uffff\13\56\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | IDENTIFICATION | ENVIRONMENT | DATA | PROCEDURE | DIVISION | INCLUDE | DECLARE | WORKINGSTORAGE | COMPUTE | CONFIGURATION | SECTION | OBJECTCOMP | SOURCECOMP | VARYING | DOT | NOTEQUAL | ACCEPT | ARGUMENTVALUE | BY | PROGRAMID | AUTHOR | HYPHEN | REDEFINES | EXIT | STOP | RUN | EVALUATE | WHEN | WITH | TEST | AFTER | TRUE | FALSE | NOTTRUE | SINGLEQUOTES | ADDITION | MULTIPLY | NOTFALSE | ENDEVALUATE | UNTIL | PERFORM | BEGIN | FILLER | SQLCA | FUNCTION | NUMVAL | DISPLAY | MOVE | TO | QUOTES | FORWARDSLASH | IF | THEN | ELSE | FIGURATIVE | GREATERTHANEQUAL | LESSERTHANEQUAL | LPAREN | RPAREN | EQUAL | GREATER | LESSER | AND | DON | OR | END | ENDPERFORM | NOT | ENDIF | PIC | X | S9 | COMP3 | VALUE | INITIALIZE | ADD | SUB | FROM | INSERT | EXEC | SQL | ENDEXEC | HASH | WHERE | CALL | USING | NINE | COMMA | STRING | UNDERSCORE | HOSTVARIABLES | IDENTIFIER | SPECIALSYMBOL | COLON | LETTER | DIGITS | ALLEXCEPTHASH );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA8_24 = input.LA(1);
						s = -1;
						if ( ((LA8_24 >= '\u0000' && LA8_24 <= '\t')||(LA8_24 >= '\u000B' && LA8_24 <= '\f')||(LA8_24 >= '\u000E' && LA8_24 <= '\uFFFF')) ) {s = 102;}
						else s = 101;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA8_0 = input.LA(1);
						s = -1;
						if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {s = 1;}
						else if ( (LA8_0=='I') ) {s = 2;}
						else if ( (LA8_0=='E') ) {s = 3;}
						else if ( (LA8_0=='D') ) {s = 4;}
						else if ( (LA8_0=='P') ) {s = 5;}
						else if ( (LA8_0=='W') ) {s = 6;}
						else if ( (LA8_0=='C') ) {s = 7;}
						else if ( (LA8_0=='S') ) {s = 8;}
						else if ( (LA8_0=='O') ) {s = 9;}
						else if ( (LA8_0=='V') ) {s = 10;}
						else if ( (LA8_0=='.') ) {s = 11;}
						else if ( (LA8_0=='N') ) {s = 12;}
						else if ( (LA8_0=='A') ) {s = 13;}
						else if ( (LA8_0=='B') ) {s = 14;}
						else if ( (LA8_0=='-') ) {s = 15;}
						else if ( (LA8_0=='R') ) {s = 16;}
						else if ( (LA8_0=='T') ) {s = 17;}
						else if ( (LA8_0=='F') ) {s = 18;}
						else if ( (LA8_0=='\'') ) {s = 19;}
						else if ( (LA8_0=='+') ) {s = 20;}
						else if ( (LA8_0=='*') ) {s = 21;}
						else if ( (LA8_0=='U') ) {s = 22;}
						else if ( (LA8_0=='M') ) {s = 23;}
						else if ( (LA8_0=='\"') ) {s = 24;}
						else if ( (LA8_0=='/') ) {s = 25;}
						else if ( (LA8_0=='Z') ) {s = 26;}
						else if ( (LA8_0=='>') ) {s = 27;}
						else if ( (LA8_0=='<') ) {s = 28;}
						else if ( (LA8_0=='(') ) {s = 29;}
						else if ( (LA8_0==')') ) {s = 30;}
						else if ( (LA8_0=='=') ) {s = 31;}
						else if ( (LA8_0=='X') ) {s = 32;}
						else if ( (LA8_0=='#') ) {s = 33;}
						else if ( (LA8_0=='9') ) {s = 34;}
						else if ( (LA8_0==',') ) {s = 35;}
						else if ( (LA8_0=='_') ) {s = 36;}
						else if ( (LA8_0==':') ) {s = 37;}
						else if ( ((LA8_0 >= 'G' && LA8_0 <= 'H')||(LA8_0 >= 'J' && LA8_0 <= 'L')||LA8_0=='Q'||LA8_0=='Y'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {s = 38;}
						else if ( (LA8_0=='!'||(LA8_0 >= '$' && LA8_0 <= '&')||LA8_0=='@'||LA8_0=='^') ) {s = 39;}
						else if ( ((LA8_0 >= '0' && LA8_0 <= '8')) ) {s = 40;}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||LA8_0==';'||LA8_0=='?'||(LA8_0 >= '[' && LA8_0 <= ']')||LA8_0=='`'||(LA8_0 >= '{' && LA8_0 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}

// $ANTLR 3.5.2 C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g 2014-07-01 15:49:06


	package translator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class CobolGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "ADD", "ADDITION", "AFTER", 
		"ALLEXCEPTHASH", "AND", "ARGUMENTVALUE", "AUTHOR", "BEGIN", "BY", "CALL", 
		"COLON", "COMMA", "COMP3", "COMPUTE", "CONFIGURATION", "DATA", "DECLARE", 
		"DIGITS", "DISPLAY", "DIVISION", "DON", "DOT", "ELSE", "END", "ENDEVALUATE", 
		"ENDEXEC", "ENDIF", "ENDPERFORM", "ENVIRONMENT", "EQUAL", "EVALUATE", 
		"EXEC", "EXIT", "FALSE", "FIGURATIVE", "FILLER", "FORWARDSLASH", "FROM", 
		"FUNCTION", "GREATER", "GREATERTHANEQUAL", "HASH", "HOSTVARIABLES", "HYPHEN", 
		"IDENTIFICATION", "IDENTIFIER", "IF", "INCLUDE", "INITIALIZE", "INSERT", 
		"LESSER", "LESSERTHANEQUAL", "LETTER", "LPAREN", "MOVE", "MULTIPLY", "NINE", 
		"NOT", "NOTEQUAL", "NOTFALSE", "NOTTRUE", "NUMVAL", "OBJECTCOMP", "OR", 
		"PERFORM", "PIC", "PROCEDURE", "PROGRAMID", "QUOTES", "REDEFINES", "RPAREN", 
		"RUN", "S9", "SECTION", "SINGLEQUOTES", "SOURCECOMP", "SPECIALSYMBOL", 
		"SQL", "SQLCA", "STOP", "STRING", "SUB", "TEST", "THEN", "TO", "TRUE", 
		"UNDERSCORE", "UNTIL", "USING", "VALUE", "VARYING", "WHEN", "WHERE", "WITH", 
		"WORKINGSTORAGE", "WS", "X"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CobolGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CobolGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("CobolGrammarParserTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return CobolGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g"; }


	public static class code_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "code"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:16:1: code : identificationDivision environmentDivision dataDivision procedureDivision -> code(id=$identificationDivision.stenv=$environmentDivision.stdata=$dataDivision.stpro=$procedureDivision.st);
	public final CobolGrammarParser.code_return code() throws RecognitionException {
		CobolGrammarParser.code_return retval = new CobolGrammarParser.code_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope identificationDivision1 =null;
		ParserRuleReturnScope environmentDivision2 =null;
		ParserRuleReturnScope dataDivision3 =null;
		ParserRuleReturnScope procedureDivision4 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:16:5: ( identificationDivision environmentDivision dataDivision procedureDivision -> code(id=$identificationDivision.stenv=$environmentDivision.stdata=$dataDivision.stpro=$procedureDivision.st))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:16:8: identificationDivision environmentDivision dataDivision procedureDivision
			{
			pushFollow(FOLLOW_identificationDivision_in_code58);
			identificationDivision1=identificationDivision();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_environmentDivision_in_code65);
			environmentDivision2=environmentDivision();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_dataDivision_in_code73);
			dataDivision3=dataDivision();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_procedureDivision_in_code80);
			procedureDivision4=procedureDivision();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 20:6: -> code(id=$identificationDivision.stenv=$environmentDivision.stdata=$dataDivision.stpro=$procedureDivision.st)
			  {
			  	retval.st = templateLib.getInstanceOf("code",new STAttrMap().put("id", (identificationDivision1!=null?((StringTemplate)identificationDivision1.getTemplate()):null)).put("env", (environmentDivision2!=null?((StringTemplate)environmentDivision2.getTemplate()):null)).put("data", (dataDivision3!=null?((StringTemplate)dataDivision3.getTemplate()):null)).put("pro", (procedureDivision4!=null?((StringTemplate)procedureDivision4.getTemplate()):null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "code"


	public static class identificationDivision_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identificationDivision"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:22:1: identificationDivision : IDENTIFICATION DIVISION ( DOT )? PROGRAMID DOT id1= IDENTIFIER ( DOT )? AUTHOR DOT id2= IDENTIFIER ( DOT )? -> idDivision(pid=$id1.textauth=$id2.text);
	public final CobolGrammarParser.identificationDivision_return identificationDivision() throws RecognitionException {
		CobolGrammarParser.identificationDivision_return retval = new CobolGrammarParser.identificationDivision_return();
		retval.start = input.LT(1);

		Token id1=null;
		Token id2=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:22:24: ( IDENTIFICATION DIVISION ( DOT )? PROGRAMID DOT id1= IDENTIFIER ( DOT )? AUTHOR DOT id2= IDENTIFIER ( DOT )? -> idDivision(pid=$id1.textauth=$id2.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:22:26: IDENTIFICATION DIVISION ( DOT )? PROGRAMID DOT id1= IDENTIFIER ( DOT )? AUTHOR DOT id2= IDENTIFIER ( DOT )?
			{
			match(input,IDENTIFICATION,FOLLOW_IDENTIFICATION_in_identificationDivision116); if (state.failed) return retval;
			match(input,DIVISION,FOLLOW_DIVISION_in_identificationDivision118); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:22:50: ( DOT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DOT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:22:50: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_identificationDivision120); if (state.failed) return retval;
					}
					break;

			}

			match(input,PROGRAMID,FOLLOW_PROGRAMID_in_identificationDivision131); if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_identificationDivision133); if (state.failed) return retval;
			id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identificationDivision139); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:23:39: ( DOT )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==DOT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:23:39: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_identificationDivision141); if (state.failed) return retval;
					}
					break;

			}

			match(input,AUTHOR,FOLLOW_AUTHOR_in_identificationDivision151); if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_identificationDivision153); if (state.failed) return retval;
			id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identificationDivision159); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:24:36: ( DOT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DOT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:24:36: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_identificationDivision161); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 25:8: -> idDivision(pid=$id1.textauth=$id2.text)
			  {
			  	retval.st = templateLib.getInstanceOf("idDivision",new STAttrMap().put("pid", (id1!=null?id1.getText():null)).put("auth", (id2!=null?id2.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identificationDivision"


	public static class environmentDivision_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "environmentDivision"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:27:1: environmentDivision : ENVIRONMENT DIVISION ( DOT )? CONFIGURATION SECTION ( DOT )? SOURCECOMP DOT (id1= IDENTIFIER )+ ( DOT )? OBJECTCOMP DOT (id2= IDENTIFIER )+ ( DOT )? -> envDivision(src=srcCompobj=objComp);
	public final CobolGrammarParser.environmentDivision_return environmentDivision() throws RecognitionException {
		CobolGrammarParser.environmentDivision_return retval = new CobolGrammarParser.environmentDivision_return();
		retval.start = input.LT(1);

		Token id1=null;
		Token id2=null;


		      List srcComp = new ArrayList();
		      List objComp = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:32:3: ( ENVIRONMENT DIVISION ( DOT )? CONFIGURATION SECTION ( DOT )? SOURCECOMP DOT (id1= IDENTIFIER )+ ( DOT )? OBJECTCOMP DOT (id2= IDENTIFIER )+ ( DOT )? -> envDivision(src=srcCompobj=objComp))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:32:3: ENVIRONMENT DIVISION ( DOT )? CONFIGURATION SECTION ( DOT )? SOURCECOMP DOT (id1= IDENTIFIER )+ ( DOT )? OBJECTCOMP DOT (id2= IDENTIFIER )+ ( DOT )?
			{
			match(input,ENVIRONMENT,FOLLOW_ENVIRONMENT_in_environmentDivision197); if (state.failed) return retval;
			match(input,DIVISION,FOLLOW_DIVISION_in_environmentDivision199); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:32:24: ( DOT )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DOT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:32:24: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_environmentDivision201); if (state.failed) return retval;
					}
					break;

			}

			match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_environmentDivision212); if (state.failed) return retval;
			match(input,SECTION,FOLLOW_SECTION_in_environmentDivision214); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:33:31: ( DOT )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:33:31: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_environmentDivision216); if (state.failed) return retval;
					}
					break;

			}

			match(input,SOURCECOMP,FOLLOW_SOURCECOMP_in_environmentDivision226); if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_environmentDivision228); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:34:23: (id1= IDENTIFIER )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==IDENTIFIER) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:34:24: id1= IDENTIFIER
					{
					id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_environmentDivision233); if (state.failed) return retval;
					if ( state.backtracking==0 ) {srcComp.add((id1!=null?id1.getText():null));}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:34:67: ( DOT )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==DOT) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:34:67: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_environmentDivision239); if (state.failed) return retval;
					}
					break;

			}

			match(input,OBJECTCOMP,FOLLOW_OBJECTCOMP_in_environmentDivision249); if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_environmentDivision251); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:35:23: (id2= IDENTIFIER )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==IDENTIFIER) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:35:24: id2= IDENTIFIER
					{
					id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_environmentDivision256); if (state.failed) return retval;
					if ( state.backtracking==0 ) {objComp.add((id2!=null?id2.getText():null));}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:35:67: ( DOT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DOT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:35:67: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_environmentDivision262); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 36:8: -> envDivision(src=srcCompobj=objComp)
			  {
			  	retval.st = templateLib.getInstanceOf("envDivision",new STAttrMap().put("src", srcComp).put("obj", objComp));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "environmentDivision"


	public static class dataDivision_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dataDivision"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:38:1: dataDivision : DATA DIVISION ( DOT )? WORKINGSTORAGE SECTION ( DOT )? EXEC SQL INCLUDE SQLCA HASH ENDEXEC . EXEC SQL BEGIN DECLARE SECTION HASH ENDEXEC . ( variable )+ -> dataDivision(vari=var);
	public final CobolGrammarParser.dataDivision_return dataDivision() throws RecognitionException {
		CobolGrammarParser.dataDivision_return retval = new CobolGrammarParser.dataDivision_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope variable5 =null;


			List var = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:42:3: ( DATA DIVISION ( DOT )? WORKINGSTORAGE SECTION ( DOT )? EXEC SQL INCLUDE SQLCA HASH ENDEXEC . EXEC SQL BEGIN DECLARE SECTION HASH ENDEXEC . ( variable )+ -> dataDivision(vari=var))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:42:3: DATA DIVISION ( DOT )? WORKINGSTORAGE SECTION ( DOT )? EXEC SQL INCLUDE SQLCA HASH ENDEXEC . EXEC SQL BEGIN DECLARE SECTION HASH ENDEXEC . ( variable )+
			{
			match(input,DATA,FOLLOW_DATA_in_dataDivision296); if (state.failed) return retval;
			match(input,DIVISION,FOLLOW_DIVISION_in_dataDivision298); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:42:17: ( DOT )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DOT) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:42:17: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_dataDivision300); if (state.failed) return retval;
					}
					break;

			}

			match(input,WORKINGSTORAGE,FOLLOW_WORKINGSTORAGE_in_dataDivision305); if (state.failed) return retval;
			match(input,SECTION,FOLLOW_SECTION_in_dataDivision307); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:43:26: ( DOT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DOT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:43:26: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_dataDivision309); if (state.failed) return retval;
					}
					break;

			}

			match(input,EXEC,FOLLOW_EXEC_in_dataDivision314); if (state.failed) return retval;
			match(input,SQL,FOLLOW_SQL_in_dataDivision317); if (state.failed) return retval;
			match(input,INCLUDE,FOLLOW_INCLUDE_in_dataDivision320); if (state.failed) return retval;
			match(input,SQLCA,FOLLOW_SQLCA_in_dataDivision322); if (state.failed) return retval;
			match(input,HASH,FOLLOW_HASH_in_dataDivision333); if (state.failed) return retval;
			match(input,ENDEXEC,FOLLOW_ENDEXEC_in_dataDivision335); if (state.failed) return retval;
			matchAny(input); if (state.failed) return retval;
			match(input,EXEC,FOLLOW_EXEC_in_dataDivision340); if (state.failed) return retval;
			match(input,SQL,FOLLOW_SQL_in_dataDivision343); if (state.failed) return retval;
			match(input,BEGIN,FOLLOW_BEGIN_in_dataDivision346); if (state.failed) return retval;
			match(input,DECLARE,FOLLOW_DECLARE_in_dataDivision348); if (state.failed) return retval;
			match(input,SECTION,FOLLOW_SECTION_in_dataDivision350); if (state.failed) return retval;
			match(input,HASH,FOLLOW_HASH_in_dataDivision353); if (state.failed) return retval;
			match(input,ENDEXEC,FOLLOW_ENDEXEC_in_dataDivision355); if (state.failed) return retval;
			matchAny(input); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:46:3: ( variable )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIGITS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:46:4: variable
					{
					pushFollow(FOLLOW_variable_in_dataDivision361);
					variable5=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {var.add((variable5!=null?((StringTemplate)variable5.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 47:3: -> dataDivision(vari=var)
			  {
			  	retval.st = templateLib.getInstanceOf("dataDivision",new STAttrMap().put("vari", var));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dataDivision"


	public static class variable_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variable"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:53:1: variable : ( type1 -> var(id=$type1.st)| type2 -> var(id=$type2.st)| type3 -> var(id=$type3.st)| type4 -> var(id=$type4.st)| type5 -> var(id=$type5.st)| type6 -> var(id=$type6.st)| type7 -> var(id=$type7.st)| type8 -> var(id=$type8.st)| type9 -> var(id=$type9.st));
	public final CobolGrammarParser.variable_return variable() throws RecognitionException {
		CobolGrammarParser.variable_return retval = new CobolGrammarParser.variable_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope type16 =null;
		ParserRuleReturnScope type27 =null;
		ParserRuleReturnScope type38 =null;
		ParserRuleReturnScope type49 =null;
		ParserRuleReturnScope type510 =null;
		ParserRuleReturnScope type611 =null;
		ParserRuleReturnScope type712 =null;
		ParserRuleReturnScope type813 =null;
		ParserRuleReturnScope type914 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:53:10: ( type1 -> var(id=$type1.st)| type2 -> var(id=$type2.st)| type3 -> var(id=$type3.st)| type4 -> var(id=$type4.st)| type5 -> var(id=$type5.st)| type6 -> var(id=$type6.st)| type7 -> var(id=$type7.st)| type8 -> var(id=$type8.st)| type9 -> var(id=$type9.st))
			int alt13=9;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DIGITS) ) {
				int LA13_1 = input.LA(2);
				if ( (synpred13_CobolGrammar()) ) {
					alt13=1;
				}
				else if ( (synpred14_CobolGrammar()) ) {
					alt13=2;
				}
				else if ( (synpred15_CobolGrammar()) ) {
					alt13=3;
				}
				else if ( (synpred16_CobolGrammar()) ) {
					alt13=4;
				}
				else if ( (synpred17_CobolGrammar()) ) {
					alt13=5;
				}
				else if ( (synpred18_CobolGrammar()) ) {
					alt13=6;
				}
				else if ( (synpred19_CobolGrammar()) ) {
					alt13=7;
				}
				else if ( (synpred20_CobolGrammar()) ) {
					alt13=8;
				}
				else if ( (true) ) {
					alt13=9;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:53:12: type1
					{
					pushFollow(FOLLOW_type1_in_variable398);
					type16=type1();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 53:18: -> var(id=$type1.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type16!=null?((StringTemplate)type16.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:54:6: type2
					{
					pushFollow(FOLLOW_type2_in_variable416);
					type27=type2();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 54:12: -> var(id=$type2.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type27!=null?((StringTemplate)type27.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:55:6: type3
					{
					pushFollow(FOLLOW_type3_in_variable434);
					type38=type3();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 55:12: -> var(id=$type3.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type38!=null?((StringTemplate)type38.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:56:6: type4
					{
					pushFollow(FOLLOW_type4_in_variable452);
					type49=type4();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 56:12: -> var(id=$type4.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type49!=null?((StringTemplate)type49.getTemplate()):null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:57:6: type5
					{
					pushFollow(FOLLOW_type5_in_variable470);
					type510=type5();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 57:12: -> var(id=$type5.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type510!=null?((StringTemplate)type510.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:58:6: type6
					{
					pushFollow(FOLLOW_type6_in_variable488);
					type611=type6();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 58:12: -> var(id=$type6.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type611!=null?((StringTemplate)type611.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:59:6: type7
					{
					pushFollow(FOLLOW_type7_in_variable506);
					type712=type7();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 59:12: -> var(id=$type7.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type712!=null?((StringTemplate)type712.getTemplate()):null)));
					  }


					}

					}
					break;
				case 8 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:60:6: type8
					{
					pushFollow(FOLLOW_type8_in_variable524);
					type813=type8();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 60:12: -> var(id=$type8.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type813!=null?((StringTemplate)type813.getTemplate()):null)));
					  }


					}

					}
					break;
				case 9 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:61:6: type9
					{
					pushFollow(FOLLOW_type9_in_variable542);
					type914=type9();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 61:12: -> var(id=$type9.st)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (type914!=null?((StringTemplate)type914.getTemplate()):null)));
					  }


					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class type1_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type1"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:1: type1 : DIGITS ( FILLER )? (id1= IDENTIFIER )? DOT -> data1(id=$id1.text);
	public final CobolGrammarParser.type1_return type1() throws RecognitionException {
		CobolGrammarParser.type1_return retval = new CobolGrammarParser.type1_return();
		retval.start = input.LT(1);

		Token id1=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:7: ( DIGITS ( FILLER )? (id1= IDENTIFIER )? DOT -> data1(id=$id1.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:9: DIGITS ( FILLER )? (id1= IDENTIFIER )? DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type1571); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:16: ( FILLER )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==FILLER) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type1573); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:28: (id1= IDENTIFIER )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==IDENTIFIER) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:68:28: id1= IDENTIFIER
					{
					id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1580); if (state.failed) return retval;
					}
					break;

			}

			match(input,DOT,FOLLOW_DOT_in_type1583); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 68:46: -> data1(id=$id1.text)
			  {
			  	retval.st = templateLib.getInstanceOf("data1",new STAttrMap().put("id", (id1!=null?id1.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type1"


	public static class type2_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type2"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:1: type2 : DIGITS ( FILLER )? (id2= IDENTIFIER )? PIC X brackets DOT -> empStr(id=$id2.text);
	public final CobolGrammarParser.type2_return type2() throws RecognitionException {
		CobolGrammarParser.type2_return retval = new CobolGrammarParser.type2_return();
		retval.start = input.LT(1);

		Token id2=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:7: ( DIGITS ( FILLER )? (id2= IDENTIFIER )? PIC X brackets DOT -> empStr(id=$id2.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:9: DIGITS ( FILLER )? (id2= IDENTIFIER )? PIC X brackets DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type2601); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:16: ( FILLER )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FILLER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type2603); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:28: (id2= IDENTIFIER )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==IDENTIFIER) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:69:28: id2= IDENTIFIER
					{
					id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type2610); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type2613); if (state.failed) return retval;
			match(input,X,FOLLOW_X_in_type2615); if (state.failed) return retval;
			pushFollow(FOLLOW_brackets_in_type2617);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_type2619); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 69:61: -> empStr(id=$id2.text)
			  {
			  	retval.st = templateLib.getInstanceOf("empStr",new STAttrMap().put("id", (id2!=null?id2.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type2"


	public static class type3_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type3"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:1: type3 : DIGITS ( FILLER )? (id3= IDENTIFIER )? PIC X brackets VALUE s1= symbolic DOT -> str(id=$id3.textval=$s1.st);
	public final CobolGrammarParser.type3_return type3() throws RecognitionException {
		CobolGrammarParser.type3_return retval = new CobolGrammarParser.type3_return();
		retval.start = input.LT(1);

		Token id3=null;
		ParserRuleReturnScope s1 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:7: ( DIGITS ( FILLER )? (id3= IDENTIFIER )? PIC X brackets VALUE s1= symbolic DOT -> str(id=$id3.textval=$s1.st))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:9: DIGITS ( FILLER )? (id3= IDENTIFIER )? PIC X brackets VALUE s1= symbolic DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type3637); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:16: ( FILLER )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==FILLER) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type3639); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:28: (id3= IDENTIFIER )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IDENTIFIER) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:70:28: id3= IDENTIFIER
					{
					id3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type3646); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type3649); if (state.failed) return retval;
			match(input,X,FOLLOW_X_in_type3651); if (state.failed) return retval;
			pushFollow(FOLLOW_brackets_in_type3653);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			match(input,VALUE,FOLLOW_VALUE_in_type3655); if (state.failed) return retval;
			pushFollow(FOLLOW_symbolic_in_type3661);
			s1=symbolic();
			state._fsp--;
			if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_type3663); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 70:81: -> str(id=$id3.textval=$s1.st)
			  {
			  	retval.st = templateLib.getInstanceOf("str",new STAttrMap().put("id", (id3!=null?id3.getText():null)).put("val", (s1!=null?((StringTemplate)s1.getTemplate()):null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type3"


	public static class type4_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type4"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:1: type4 : DIGITS ( FILLER )? (id4= IDENTIFIER )? PIC ( S9 | NINE ) brackets DOT -> empdouble(id=$id4.text);
	public final CobolGrammarParser.type4_return type4() throws RecognitionException {
		CobolGrammarParser.type4_return retval = new CobolGrammarParser.type4_return();
		retval.start = input.LT(1);

		Token id4=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:7: ( DIGITS ( FILLER )? (id4= IDENTIFIER )? PIC ( S9 | NINE ) brackets DOT -> empdouble(id=$id4.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:9: DIGITS ( FILLER )? (id4= IDENTIFIER )? PIC ( S9 | NINE ) brackets DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type4687); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:16: ( FILLER )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==FILLER) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type4689); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:28: (id4= IDENTIFIER )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==IDENTIFIER) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:28: id4= IDENTIFIER
					{
					id4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type4696); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type4699); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:46: ( S9 | NINE )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==S9) ) {
				alt22=1;
			}
			else if ( (LA22_0==NINE) ) {
				alt22=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:47: S9
					{
					match(input,S9,FOLLOW_S9_in_type4702); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:71:50: NINE
					{
					match(input,NINE,FOLLOW_NINE_in_type4704); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_brackets_in_type4707);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_type4709); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 71:69: -> empdouble(id=$id4.text)
			  {
			  	retval.st = templateLib.getInstanceOf("empdouble",new STAttrMap().put("id", (id4!=null?id4.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type4"


	public static class type7_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type7"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:1: type7 : DIGITS ( FILLER )? (id7= IDENTIFIER )? PIC ( S9 | NINE ) brackets COMP3 DOT -> empdouble(id=$id7.text);
	public final CobolGrammarParser.type7_return type7() throws RecognitionException {
		CobolGrammarParser.type7_return retval = new CobolGrammarParser.type7_return();
		retval.start = input.LT(1);

		Token id7=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:7: ( DIGITS ( FILLER )? (id7= IDENTIFIER )? PIC ( S9 | NINE ) brackets COMP3 DOT -> empdouble(id=$id7.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:9: DIGITS ( FILLER )? (id7= IDENTIFIER )? PIC ( S9 | NINE ) brackets COMP3 DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type7727); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:16: ( FILLER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==FILLER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type7729); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:28: (id7= IDENTIFIER )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==IDENTIFIER) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:28: id7= IDENTIFIER
					{
					id7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type7736); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type7739); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:46: ( S9 | NINE )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==S9) ) {
				alt25=1;
			}
			else if ( (LA25_0==NINE) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:47: S9
					{
					match(input,S9,FOLLOW_S9_in_type7742); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:72:50: NINE
					{
					match(input,NINE,FOLLOW_NINE_in_type7744); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_brackets_in_type7747);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COMP3,FOLLOW_COMP3_in_type7749); if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_type7751); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 72:76: -> empdouble(id=$id7.text)
			  {
			  	retval.st = templateLib.getInstanceOf("empdouble",new STAttrMap().put("id", (id7!=null?id7.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type7"


	public static class type5_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type5"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:1: type5 : DIGITS ( FILLER )? (id5= IDENTIFIER )? PIC ( S9 | NINE ) brackets VALUE s2= symbolic DOT -> double(id=$id5.textval=$s2.st);
	public final CobolGrammarParser.type5_return type5() throws RecognitionException {
		CobolGrammarParser.type5_return retval = new CobolGrammarParser.type5_return();
		retval.start = input.LT(1);

		Token id5=null;
		ParserRuleReturnScope s2 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:7: ( DIGITS ( FILLER )? (id5= IDENTIFIER )? PIC ( S9 | NINE ) brackets VALUE s2= symbolic DOT -> double(id=$id5.textval=$s2.st))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:9: DIGITS ( FILLER )? (id5= IDENTIFIER )? PIC ( S9 | NINE ) brackets VALUE s2= symbolic DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type5770); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:16: ( FILLER )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==FILLER) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type5772); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:28: (id5= IDENTIFIER )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==IDENTIFIER) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:28: id5= IDENTIFIER
					{
					id5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type5779); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type5782); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:46: ( S9 | NINE )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==S9) ) {
				alt28=1;
			}
			else if ( (LA28_0==NINE) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:47: S9
					{
					match(input,S9,FOLLOW_S9_in_type5785); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:73:50: NINE
					{
					match(input,NINE,FOLLOW_NINE_in_type5787); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_brackets_in_type5790);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			match(input,VALUE,FOLLOW_VALUE_in_type5792); if (state.failed) return retval;
			pushFollow(FOLLOW_symbolic_in_type5798);
			s2=symbolic();
			state._fsp--;
			if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_type5800); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 73:89: -> double(id=$id5.textval=$s2.st)
			  {
			  	retval.st = templateLib.getInstanceOf("double",new STAttrMap().put("id", (id5!=null?id5.getText():null)).put("val", (s2!=null?((StringTemplate)s2.getTemplate()):null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type5"


	public static class type6_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type6"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:1: type6 : DIGITS ( FILLER )? (id6= IDENTIFIER )? PIC ( S9 | NINE ) brackets COMP3 VALUE s3= symbolic DOT -> double(id=$id6.textval=$s3.st);
	public final CobolGrammarParser.type6_return type6() throws RecognitionException {
		CobolGrammarParser.type6_return retval = new CobolGrammarParser.type6_return();
		retval.start = input.LT(1);

		Token id6=null;
		ParserRuleReturnScope s3 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:7: ( DIGITS ( FILLER )? (id6= IDENTIFIER )? PIC ( S9 | NINE ) brackets COMP3 VALUE s3= symbolic DOT -> double(id=$id6.textval=$s3.st))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:9: DIGITS ( FILLER )? (id6= IDENTIFIER )? PIC ( S9 | NINE ) brackets COMP3 VALUE s3= symbolic DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type6824); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:16: ( FILLER )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==FILLER) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type6826); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:28: (id6= IDENTIFIER )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==IDENTIFIER) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:28: id6= IDENTIFIER
					{
					id6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type6833); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type6836); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:46: ( S9 | NINE )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==S9) ) {
				alt31=1;
			}
			else if ( (LA31_0==NINE) ) {
				alt31=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:47: S9
					{
					match(input,S9,FOLLOW_S9_in_type6839); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:74:50: NINE
					{
					match(input,NINE,FOLLOW_NINE_in_type6841); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_brackets_in_type6844);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COMP3,FOLLOW_COMP3_in_type6846); if (state.failed) return retval;
			match(input,VALUE,FOLLOW_VALUE_in_type6848); if (state.failed) return retval;
			pushFollow(FOLLOW_symbolic_in_type6854);
			s3=symbolic();
			state._fsp--;
			if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_type6856); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 74:96: -> double(id=$id6.textval=$s3.st)
			  {
			  	retval.st = templateLib.getInstanceOf("double",new STAttrMap().put("id", (id6!=null?id6.getText():null)).put("val", (s3!=null?((StringTemplate)s3.getTemplate()):null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type6"


	public static class type8_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type8"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:1: type8 : DIGITS ( FILLER )? (id81= IDENTIFIER )? REDEFINES id82= IDENTIFIER ( DOT )? -> redef(id1=$id81.textid2=$id82.text);
	public final CobolGrammarParser.type8_return type8() throws RecognitionException {
		CobolGrammarParser.type8_return retval = new CobolGrammarParser.type8_return();
		retval.start = input.LT(1);

		Token id81=null;
		Token id82=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:7: ( DIGITS ( FILLER )? (id81= IDENTIFIER )? REDEFINES id82= IDENTIFIER ( DOT )? -> redef(id1=$id81.textid2=$id82.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:9: DIGITS ( FILLER )? (id81= IDENTIFIER )? REDEFINES id82= IDENTIFIER ( DOT )?
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type8881); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:16: ( FILLER )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==FILLER) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type8883); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:29: (id81= IDENTIFIER )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==IDENTIFIER) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:29: id81= IDENTIFIER
					{
					id81=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type8890); if (state.failed) return retval;
					}
					break;

			}

			match(input,REDEFINES,FOLLOW_REDEFINES_in_type8893); if (state.failed) return retval;
			id82=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type8899); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:71: ( DOT )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==DOT) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:75:71: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_type8901); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 75:75: -> redef(id1=$id81.textid2=$id82.text)
			  {
			  	retval.st = templateLib.getInstanceOf("redef",new STAttrMap().put("id1", (id81!=null?id81.getText():null)).put("id2", (id82!=null?id82.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type8"


	public static class type9_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type9"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:1: type9 : DIGITS ( FILLER )? (id9= IDENTIFIER )? PIC ( S9 | NINE | ( HYPHEN )+ NINE ) DOT -> empdouble(id=$id9.text);
	public final CobolGrammarParser.type9_return type9() throws RecognitionException {
		CobolGrammarParser.type9_return retval = new CobolGrammarParser.type9_return();
		retval.start = input.LT(1);

		Token id9=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:7: ( DIGITS ( FILLER )? (id9= IDENTIFIER )? PIC ( S9 | NINE | ( HYPHEN )+ NINE ) DOT -> empdouble(id=$id9.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:9: DIGITS ( FILLER )? (id9= IDENTIFIER )? PIC ( S9 | NINE | ( HYPHEN )+ NINE ) DOT
			{
			match(input,DIGITS,FOLLOW_DIGITS_in_type9925); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:16: ( FILLER )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==FILLER) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:16: FILLER
					{
					match(input,FILLER,FOLLOW_FILLER_in_type9927); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:28: (id9= IDENTIFIER )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==IDENTIFIER) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:28: id9= IDENTIFIER
					{
					id9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type9934); if (state.failed) return retval;
					}
					break;

			}

			match(input,PIC,FOLLOW_PIC_in_type9937); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:46: ( S9 | NINE | ( HYPHEN )+ NINE )
			int alt38=3;
			switch ( input.LA(1) ) {
			case S9:
				{
				alt38=1;
				}
				break;
			case NINE:
				{
				alt38=2;
				}
				break;
			case HYPHEN:
				{
				alt38=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:47: S9
					{
					match(input,S9,FOLLOW_S9_in_type9940); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:50: NINE
					{
					match(input,NINE,FOLLOW_NINE_in_type9942); if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:55: ( HYPHEN )+ NINE
					{
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:55: ( HYPHEN )+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==HYPHEN) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:76:55: HYPHEN
							{
							match(input,HYPHEN,FOLLOW_HYPHEN_in_type9944); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					match(input,NINE,FOLLOW_NINE_in_type9947); if (state.failed) return retval;
					}
					break;

			}

			match(input,DOT,FOLLOW_DOT_in_type9951); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 76:75: -> empdouble(id=$id9.text)
			  {
			  	retval.st = templateLib.getInstanceOf("empdouble",new STAttrMap().put("id", (id9!=null?id9.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type9"


	public static class procedureDivision_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "procedureDivision"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:81:1: procedureDivision : PROCEDURE DIVISION ( DOT )? ( section )+ -> proDivision(sec=sections);
	public final CobolGrammarParser.procedureDivision_return procedureDivision() throws RecognitionException {
		CobolGrammarParser.procedureDivision_return retval = new CobolGrammarParser.procedureDivision_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope section15 =null;


		      List sections = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:85:5: ( PROCEDURE DIVISION ( DOT )? ( section )+ -> proDivision(sec=sections))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:85:5: PROCEDURE DIVISION ( DOT )? ( section )+
			{
			match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDivision988); if (state.failed) return retval;
			match(input,DIVISION,FOLLOW_DIVISION_in_procedureDivision990); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:85:24: ( DOT )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==DOT) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:85:24: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_procedureDivision992); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:86:2: ( section )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==IDENTIFIER) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:86:3: section
					{
					pushFollow(FOLLOW_section_in_procedureDivision998);
					section15=section();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {sections.add((section15!=null?((StringTemplate)section15.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 87:2: -> proDivision(sec=sections)
			  {
			  	retval.st = templateLib.getInstanceOf("proDivision",new STAttrMap().put("sec", sections));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureDivision"


	public static class section_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "section"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:90:1: section : id= IDENTIFIER SECTION DOT ( IDENTIFIER DOT )? ( stmt )+ ( IDENTIFIER DOT )? ( EXIT | STOP RUN ) DOT -> section(id=$id.textsta=stmts);
	public final CobolGrammarParser.section_return section() throws RecognitionException {
		CobolGrammarParser.section_return retval = new CobolGrammarParser.section_return();
		retval.start = input.LT(1);

		Token id=null;
		ParserRuleReturnScope stmt16 =null;


		      List stmts = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:94:3: (id= IDENTIFIER SECTION DOT ( IDENTIFIER DOT )? ( stmt )+ ( IDENTIFIER DOT )? ( EXIT | STOP RUN ) DOT -> section(id=$id.textsta=stmts))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:94:3: id= IDENTIFIER SECTION DOT ( IDENTIFIER DOT )? ( stmt )+ ( IDENTIFIER DOT )? ( EXIT | STOP RUN ) DOT
			{
			id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_section1031); if (state.failed) return retval;
			match(input,SECTION,FOLLOW_SECTION_in_section1033); if (state.failed) return retval;
			match(input,DOT,FOLLOW_DOT_in_section1035); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:95:2: ( IDENTIFIER DOT )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==IDENTIFIER) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:95:3: IDENTIFIER DOT
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_section1039); if (state.failed) return retval;
					match(input,DOT,FOLLOW_DOT_in_section1041); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:96:2: ( stmt )+
			int cnt42=0;
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==EXIT) ) {
					int LA42_2 = input.LA(2);
					if ( (LA42_2==PERFORM) ) {
						alt42=1;
					}

				}
				else if ( ((LA42_0 >= ACCEPT && LA42_0 <= ADD)||LA42_0==CALL||LA42_0==COMPUTE||LA42_0==DISPLAY||(LA42_0 >= EVALUATE && LA42_0 <= EXEC)||LA42_0==IF||LA42_0==INITIALIZE||LA42_0==MOVE||LA42_0==PERFORM||LA42_0==SUB) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:96:3: stmt
					{
					pushFollow(FOLLOW_stmt_in_section1047);
					stmt16=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt16!=null?((StringTemplate)stmt16.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt42 >= 1 ) break loop42;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(42, input);
					throw eee;
				}
				cnt42++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:97:2: ( IDENTIFIER DOT )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==IDENTIFIER) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:97:3: IDENTIFIER DOT
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_section1056); if (state.failed) return retval;
					match(input,DOT,FOLLOW_DOT_in_section1058); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:98:2: ( EXIT | STOP RUN )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==EXIT) ) {
				alt44=1;
			}
			else if ( (LA44_0==STOP) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:98:3: EXIT
					{
					match(input,EXIT,FOLLOW_EXIT_in_section1064); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:98:8: STOP RUN
					{
					match(input,STOP,FOLLOW_STOP_in_section1066); if (state.failed) return retval;
					match(input,RUN,FOLLOW_RUN_in_section1068); if (state.failed) return retval;
					}
					break;

			}

			match(input,DOT,FOLLOW_DOT_in_section1071); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 98:22: -> section(id=$id.textsta=stmts)
			  {
			  	retval.st = templateLib.getInstanceOf("section",new STAttrMap().put("id", (id!=null?id.getText():null)).put("sta", stmts));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "section"


	public static class stmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:100:1: stmt : ( performStmt -> stat(id=$performStmt.st)| addStmt -> stat(st=$addStmt.st)| subStmt -> stat(st=$subStmt.st)| displayStmt -> stat(id=$displayStmt.st)| ifStmt -> stat(id=$ifStmt.st)| moveStmt -> stat(id=$moveStmt.st)| acceptStmt -> stat(id=$acceptStmt.st)| computeStmt -> stat(st=$computeStmt.st)| initializeStmt -> stat(id=$initializeStmt.st)| sqlStmt -> stat(id=$sqlStmt.st)| callStmt -> stat(id=$callStmt.st)| evalStmt -> stat(id=$evalStmt.st)| performuntilStmt -> stat(id=$performuntilStmt.st)| performvaryingStmt -> stat(id=$performvaryingStmt.st)| performexitStmt -> stat(id=$performexitStmt.st)| performwithStmt -> stat(id=$performwithStmt.st));
	public final CobolGrammarParser.stmt_return stmt() throws RecognitionException {
		CobolGrammarParser.stmt_return retval = new CobolGrammarParser.stmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope performStmt17 =null;
		ParserRuleReturnScope addStmt18 =null;
		ParserRuleReturnScope subStmt19 =null;
		ParserRuleReturnScope displayStmt20 =null;
		ParserRuleReturnScope ifStmt21 =null;
		ParserRuleReturnScope moveStmt22 =null;
		ParserRuleReturnScope acceptStmt23 =null;
		ParserRuleReturnScope computeStmt24 =null;
		ParserRuleReturnScope initializeStmt25 =null;
		ParserRuleReturnScope sqlStmt26 =null;
		ParserRuleReturnScope callStmt27 =null;
		ParserRuleReturnScope evalStmt28 =null;
		ParserRuleReturnScope performuntilStmt29 =null;
		ParserRuleReturnScope performvaryingStmt30 =null;
		ParserRuleReturnScope performexitStmt31 =null;
		ParserRuleReturnScope performwithStmt32 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:100:6: ( performStmt -> stat(id=$performStmt.st)| addStmt -> stat(st=$addStmt.st)| subStmt -> stat(st=$subStmt.st)| displayStmt -> stat(id=$displayStmt.st)| ifStmt -> stat(id=$ifStmt.st)| moveStmt -> stat(id=$moveStmt.st)| acceptStmt -> stat(id=$acceptStmt.st)| computeStmt -> stat(st=$computeStmt.st)| initializeStmt -> stat(id=$initializeStmt.st)| sqlStmt -> stat(id=$sqlStmt.st)| callStmt -> stat(id=$callStmt.st)| evalStmt -> stat(id=$evalStmt.st)| performuntilStmt -> stat(id=$performuntilStmt.st)| performvaryingStmt -> stat(id=$performvaryingStmt.st)| performexitStmt -> stat(id=$performexitStmt.st)| performwithStmt -> stat(id=$performwithStmt.st))
			int alt45=16;
			switch ( input.LA(1) ) {
			case PERFORM:
				{
				switch ( input.LA(2) ) {
				case IDENTIFIER:
					{
					alt45=1;
					}
					break;
				case UNTIL:
					{
					alt45=13;
					}
					break;
				case VARYING:
					{
					alt45=14;
					}
					break;
				case WITH:
					{
					alt45=16;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ADD:
				{
				alt45=2;
				}
				break;
			case SUB:
				{
				alt45=3;
				}
				break;
			case DISPLAY:
				{
				alt45=4;
				}
				break;
			case IF:
				{
				alt45=5;
				}
				break;
			case MOVE:
				{
				alt45=6;
				}
				break;
			case ACCEPT:
				{
				alt45=7;
				}
				break;
			case COMPUTE:
				{
				alt45=8;
				}
				break;
			case INITIALIZE:
				{
				alt45=9;
				}
				break;
			case EXEC:
				{
				alt45=10;
				}
				break;
			case CALL:
				{
				alt45=11;
				}
				break;
			case EVALUATE:
				{
				alt45=12;
				}
				break;
			case EXIT:
				{
				alt45=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:100:8: performStmt
					{
					pushFollow(FOLLOW_performStmt_in_stmt1095);
					performStmt17=performStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 100:20: -> stat(id=$performStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (performStmt17!=null?((StringTemplate)performStmt17.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:101:6: addStmt
					{
					pushFollow(FOLLOW_addStmt_in_stmt1111);
					addStmt18=addStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 101:16: -> stat(st=$addStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("st", (addStmt18!=null?((StringTemplate)addStmt18.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:102:6: subStmt
					{
					pushFollow(FOLLOW_subStmt_in_stmt1132);
					subStmt19=subStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 102:16: -> stat(st=$subStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("st", (subStmt19!=null?((StringTemplate)subStmt19.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:103:6: displayStmt
					{
					pushFollow(FOLLOW_displayStmt_in_stmt1152);
					displayStmt20=displayStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 103:18: -> stat(id=$displayStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (displayStmt20!=null?((StringTemplate)displayStmt20.getTemplate()):null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:104:6: ifStmt
					{
					pushFollow(FOLLOW_ifStmt_in_stmt1169);
					ifStmt21=ifStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 104:13: -> stat(id=$ifStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (ifStmt21!=null?((StringTemplate)ifStmt21.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:105:6: moveStmt
					{
					pushFollow(FOLLOW_moveStmt_in_stmt1185);
					moveStmt22=moveStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 105:15: -> stat(id=$moveStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (moveStmt22!=null?((StringTemplate)moveStmt22.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:106:6: acceptStmt
					{
					pushFollow(FOLLOW_acceptStmt_in_stmt1201);
					acceptStmt23=acceptStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 106:17: -> stat(id=$acceptStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (acceptStmt23!=null?((StringTemplate)acceptStmt23.getTemplate()):null)));
					  }


					}

					}
					break;
				case 8 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:107:6: computeStmt
					{
					pushFollow(FOLLOW_computeStmt_in_stmt1217);
					computeStmt24=computeStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 107:20: -> stat(st=$computeStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("st", (computeStmt24!=null?((StringTemplate)computeStmt24.getTemplate()):null)));
					  }


					}

					}
					break;
				case 9 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:108:6: initializeStmt
					{
					pushFollow(FOLLOW_initializeStmt_in_stmt1241);
					initializeStmt25=initializeStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 108:21: -> stat(id=$initializeStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (initializeStmt25!=null?((StringTemplate)initializeStmt25.getTemplate()):null)));
					  }


					}

					}
					break;
				case 10 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:109:6: sqlStmt
					{
					pushFollow(FOLLOW_sqlStmt_in_stmt1257);
					sqlStmt26=sqlStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 109:15: -> stat(id=$sqlStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (sqlStmt26!=null?((StringTemplate)sqlStmt26.getTemplate()):null)));
					  }


					}

					}
					break;
				case 11 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:110:6: callStmt
					{
					pushFollow(FOLLOW_callStmt_in_stmt1274);
					callStmt27=callStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 110:15: -> stat(id=$callStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (callStmt27!=null?((StringTemplate)callStmt27.getTemplate()):null)));
					  }


					}

					}
					break;
				case 12 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:111:6: evalStmt
					{
					pushFollow(FOLLOW_evalStmt_in_stmt1290);
					evalStmt28=evalStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 111:16: -> stat(id=$evalStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (evalStmt28!=null?((StringTemplate)evalStmt28.getTemplate()):null)));
					  }


					}

					}
					break;
				case 13 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:112:6: performuntilStmt
					{
					pushFollow(FOLLOW_performuntilStmt_in_stmt1307);
					performuntilStmt29=performuntilStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 112:23: -> stat(id=$performuntilStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (performuntilStmt29!=null?((StringTemplate)performuntilStmt29.getTemplate()):null)));
					  }


					}

					}
					break;
				case 14 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:113:6: performvaryingStmt
					{
					pushFollow(FOLLOW_performvaryingStmt_in_stmt1323);
					performvaryingStmt30=performvaryingStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 113:25: -> stat(id=$performvaryingStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (performvaryingStmt30!=null?((StringTemplate)performvaryingStmt30.getTemplate()):null)));
					  }


					}

					}
					break;
				case 15 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:114:6: performexitStmt
					{
					pushFollow(FOLLOW_performexitStmt_in_stmt1339);
					performexitStmt31=performexitStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 114:23: -> stat(id=$performexitStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (performexitStmt31!=null?((StringTemplate)performexitStmt31.getTemplate()):null)));
					  }


					}

					}
					break;
				case 16 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:115:6: performwithStmt
					{
					pushFollow(FOLLOW_performwithStmt_in_stmt1356);
					performwithStmt32=performwithStmt();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 115:23: -> stat(id=$performwithStmt.st)
					  {
					  	retval.st = templateLib.getInstanceOf("stat",new STAttrMap().put("id", (performwithStmt32!=null?((StringTemplate)performwithStmt32.getTemplate()):null)));
					  }


					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmt"


	public static class performuntilStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "performuntilStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:122:1: performuntilStmt : PERFORM UNTIL condition ( stmt )+ ENDPERFORM ( DOT )? -> performUntilStmt(id=$condition.ststm=stmts);
	public final CobolGrammarParser.performuntilStmt_return performuntilStmt() throws RecognitionException {
		CobolGrammarParser.performuntilStmt_return retval = new CobolGrammarParser.performuntilStmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope stmt33 =null;
		ParserRuleReturnScope condition34 =null;


		      List stmts = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:126:3: ( PERFORM UNTIL condition ( stmt )+ ENDPERFORM ( DOT )? -> performUntilStmt(id=$condition.ststm=stmts))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:126:5: PERFORM UNTIL condition ( stmt )+ ENDPERFORM ( DOT )?
			{
			match(input,PERFORM,FOLLOW_PERFORM_in_performuntilStmt1391); if (state.failed) return retval;
			match(input,UNTIL,FOLLOW_UNTIL_in_performuntilStmt1393); if (state.failed) return retval;
			pushFollow(FOLLOW_condition_in_performuntilStmt1395);
			condition34=condition();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:127:5: ( stmt )+
			int cnt46=0;
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( ((LA46_0 >= ACCEPT && LA46_0 <= ADD)||LA46_0==CALL||LA46_0==COMPUTE||LA46_0==DISPLAY||(LA46_0 >= EVALUATE && LA46_0 <= EXIT)||LA46_0==IF||LA46_0==INITIALIZE||LA46_0==MOVE||LA46_0==PERFORM||LA46_0==SUB) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:127:6: stmt
					{
					pushFollow(FOLLOW_stmt_in_performuntilStmt1402);
					stmt33=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt33!=null?((StringTemplate)stmt33.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt46 >= 1 ) break loop46;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(46, input);
					throw eee;
				}
				cnt46++;
			}

			match(input,ENDPERFORM,FOLLOW_ENDPERFORM_in_performuntilStmt1412); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:128:16: ( DOT )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==DOT) ) {
				int LA47_1 = input.LA(2);
				if ( (synpred69_CobolGrammar()) ) {
					alt47=1;
				}
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:128:16: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_performuntilStmt1414); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 129:5: -> performUntilStmt(id=$condition.ststm=stmts)
			  {
			  	retval.st = templateLib.getInstanceOf("performUntilStmt",new STAttrMap().put("id", (condition34!=null?((StringTemplate)condition34.getTemplate()):null)).put("stm", stmts));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "performuntilStmt"


	public static class performwithStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "performwithStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:132:1: performwithStmt : PERFORM WITH TEST AFTER UNTIL condition ( stmt )+ ENDPERFORM ( DOT )? -> performUntilStmt(id=$condition.ststm=stmts);
	public final CobolGrammarParser.performwithStmt_return performwithStmt() throws RecognitionException {
		CobolGrammarParser.performwithStmt_return retval = new CobolGrammarParser.performwithStmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope stmt35 =null;
		ParserRuleReturnScope condition36 =null;


		      List stmts = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:136:2: ( PERFORM WITH TEST AFTER UNTIL condition ( stmt )+ ENDPERFORM ( DOT )? -> performUntilStmt(id=$condition.ststm=stmts))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:136:4: PERFORM WITH TEST AFTER UNTIL condition ( stmt )+ ENDPERFORM ( DOT )?
			{
			match(input,PERFORM,FOLLOW_PERFORM_in_performwithStmt1452); if (state.failed) return retval;
			match(input,WITH,FOLLOW_WITH_in_performwithStmt1454); if (state.failed) return retval;
			match(input,TEST,FOLLOW_TEST_in_performwithStmt1456); if (state.failed) return retval;
			match(input,AFTER,FOLLOW_AFTER_in_performwithStmt1458); if (state.failed) return retval;
			match(input,UNTIL,FOLLOW_UNTIL_in_performwithStmt1460); if (state.failed) return retval;
			pushFollow(FOLLOW_condition_in_performwithStmt1462);
			condition36=condition();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:137:7: ( stmt )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( ((LA48_0 >= ACCEPT && LA48_0 <= ADD)||LA48_0==CALL||LA48_0==COMPUTE||LA48_0==DISPLAY||(LA48_0 >= EVALUATE && LA48_0 <= EXIT)||LA48_0==IF||LA48_0==INITIALIZE||LA48_0==MOVE||LA48_0==PERFORM||LA48_0==SUB) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:137:8: stmt
					{
					pushFollow(FOLLOW_stmt_in_performwithStmt1471);
					stmt35=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt35!=null?((StringTemplate)stmt35.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
			}

			match(input,ENDPERFORM,FOLLOW_ENDPERFORM_in_performwithStmt1483); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:138:18: ( DOT )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==DOT) ) {
				int LA49_1 = input.LA(2);
				if ( (synpred71_CobolGrammar()) ) {
					alt49=1;
				}
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:138:18: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_performwithStmt1485); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 138:22: -> performUntilStmt(id=$condition.ststm=stmts)
			  {
			  	retval.st = templateLib.getInstanceOf("performUntilStmt",new STAttrMap().put("id", (condition36!=null?((StringTemplate)condition36.getTemplate()):null)).put("stm", stmts));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "performwithStmt"


	public static class performvaryingStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "performvaryingStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:140:1: performvaryingStmt : PERFORM VARYING i1= IDENTIFIER FROM d1= ( DIGITS | IDENTIFIER ) BY d2= ( DIGITS | IDENTIFIER ) UNTIL booleanexp ( stmt )+ ( EXIT PERFORM | ENDPERFORM ) ( DOT )? -> performUntilStmt(id=$i1.textcond=$booleanexp.stdig1=$d1.textdig2=$d2.textstm=stmts);
	public final CobolGrammarParser.performvaryingStmt_return performvaryingStmt() throws RecognitionException {
		CobolGrammarParser.performvaryingStmt_return retval = new CobolGrammarParser.performvaryingStmt_return();
		retval.start = input.LT(1);

		Token i1=null;
		Token d1=null;
		Token d2=null;
		ParserRuleReturnScope stmt37 =null;
		ParserRuleReturnScope booleanexp38 =null;


		      List stmts = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:3: ( PERFORM VARYING i1= IDENTIFIER FROM d1= ( DIGITS | IDENTIFIER ) BY d2= ( DIGITS | IDENTIFIER ) UNTIL booleanexp ( stmt )+ ( EXIT PERFORM | ENDPERFORM ) ( DOT )? -> performUntilStmt(id=$i1.textcond=$booleanexp.stdig1=$d1.textdig2=$d2.textstm=stmts))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:5: PERFORM VARYING i1= IDENTIFIER FROM d1= ( DIGITS | IDENTIFIER ) BY d2= ( DIGITS | IDENTIFIER ) UNTIL booleanexp ( stmt )+ ( EXIT PERFORM | ENDPERFORM ) ( DOT )?
			{
			match(input,PERFORM,FOLLOW_PERFORM_in_performvaryingStmt1519); if (state.failed) return retval;
			match(input,VARYING,FOLLOW_VARYING_in_performvaryingStmt1521); if (state.failed) return retval;
			i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_performvaryingStmt1525); if (state.failed) return retval;
			match(input,FROM,FOLLOW_FROM_in_performvaryingStmt1527); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:43: ( DIGITS | IDENTIFIER )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==DIGITS) ) {
				alt50=1;
			}
			else if ( (LA50_0==IDENTIFIER) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:44: DIGITS
					{
					d1=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_performvaryingStmt1532); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:51: IDENTIFIER
					{
					d1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_performvaryingStmt1534); if (state.failed) return retval;
					}
					break;

			}

			match(input,BY,FOLLOW_BY_in_performvaryingStmt1537); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:69: ( DIGITS | IDENTIFIER )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==DIGITS) ) {
				alt51=1;
			}
			else if ( (LA51_0==IDENTIFIER) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:70: DIGITS
					{
					d2=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_performvaryingStmt1542); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:144:77: IDENTIFIER
					{
					d2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_performvaryingStmt1544); if (state.failed) return retval;
					}
					break;

			}

			match(input,UNTIL,FOLLOW_UNTIL_in_performvaryingStmt1548); if (state.failed) return retval;
			pushFollow(FOLLOW_booleanexp_in_performvaryingStmt1550);
			booleanexp38=booleanexp();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:145:5: ( stmt )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==EXIT) ) {
					int LA52_1 = input.LA(2);
					if ( (LA52_1==PERFORM) ) {
						int LA52_4 = input.LA(3);
						if ( (synpred74_CobolGrammar()) ) {
							alt52=1;
						}

					}

				}
				else if ( ((LA52_0 >= ACCEPT && LA52_0 <= ADD)||LA52_0==CALL||LA52_0==COMPUTE||LA52_0==DISPLAY||(LA52_0 >= EVALUATE && LA52_0 <= EXEC)||LA52_0==IF||LA52_0==INITIALIZE||LA52_0==MOVE||LA52_0==PERFORM||LA52_0==SUB) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:145:6: stmt
					{
					pushFollow(FOLLOW_stmt_in_performvaryingStmt1557);
					stmt37=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt37!=null?((StringTemplate)stmt37.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:146:5: ( EXIT PERFORM | ENDPERFORM )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EXIT) ) {
				alt53=1;
			}
			else if ( (LA53_0==ENDPERFORM) ) {
				alt53=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:146:6: EXIT PERFORM
					{
					match(input,EXIT,FOLLOW_EXIT_in_performvaryingStmt1568); if (state.failed) return retval;
					match(input,PERFORM,FOLLOW_PERFORM_in_performvaryingStmt1570); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:147:8: ENDPERFORM
					{
					match(input,ENDPERFORM,FOLLOW_ENDPERFORM_in_performvaryingStmt1580); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:148:5: ( DOT )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==DOT) ) {
				int LA54_1 = input.LA(2);
				if ( (synpred76_CobolGrammar()) ) {
					alt54=1;
				}
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:148:5: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_performvaryingStmt1587); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 149:5: -> performUntilStmt(id=$i1.textcond=$booleanexp.stdig1=$d1.textdig2=$d2.textstm=stmts)
			  {
			  	retval.st = templateLib.getInstanceOf("performUntilStmt",new STAttrMap().put("id", (i1!=null?i1.getText():null)).put("cond", (booleanexp38!=null?((StringTemplate)booleanexp38.getTemplate()):null)).put("dig1", (d1!=null?d1.getText():null)).put("dig2", (d2!=null?d2.getText():null)).put("stm", stmts));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "performvaryingStmt"


	public static class performexitStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "performexitStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:1: performexitStmt : EXIT PERFORM ( DOT )? -> performexitStmt(id=\"break();\");
	public final CobolGrammarParser.performexitStmt_return performexitStmt() throws RecognitionException {
		CobolGrammarParser.performexitStmt_return retval = new CobolGrammarParser.performexitStmt_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:17: ( EXIT PERFORM ( DOT )? -> performexitStmt(id=\"break();\"))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:19: EXIT PERFORM ( DOT )?
			{
			match(input,EXIT,FOLLOW_EXIT_in_performexitStmt1635); if (state.failed) return retval;
			match(input,PERFORM,FOLLOW_PERFORM_in_performexitStmt1637); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:32: ( DOT )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==DOT) ) {
				int LA55_1 = input.LA(2);
				if ( (synpred77_CobolGrammar()) ) {
					alt55=1;
				}
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:32: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_performexitStmt1639); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 153:37: -> performexitStmt(id=\"break();\")
			  {
			  	retval.st = templateLib.getInstanceOf("performexitStmt",new STAttrMap().put("id", "break();"));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "performexitStmt"


	public static class performStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "performStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:1: performStmt : PERFORM id= IDENTIFIER ( DOT )? -> performStmt(id=$id.text);
	public final CobolGrammarParser.performStmt_return performStmt() throws RecognitionException {
		CobolGrammarParser.performStmt_return retval = new CobolGrammarParser.performStmt_return();
		retval.start = input.LT(1);

		Token id=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:13: ( PERFORM id= IDENTIFIER ( DOT )? -> performStmt(id=$id.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:15: PERFORM id= IDENTIFIER ( DOT )?
			{
			match(input,PERFORM,FOLLOW_PERFORM_in_performStmt1663); if (state.failed) return retval;
			id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_performStmt1669); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:39: ( DOT )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==DOT) ) {
				int LA56_1 = input.LA(2);
				if ( (synpred78_CobolGrammar()) ) {
					alt56=1;
				}
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:39: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_performStmt1671); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 156:44: -> performStmt(id=$id.text)
			  {
			  	retval.st = templateLib.getInstanceOf("performStmt",new STAttrMap().put("id", (id!=null?id.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "performStmt"


	public static class displayStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "displayStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:158:1: displayStmt : DISPLAY ( ident | STRING )+ ( DOT )? -> displayStmt(lit=litId);
	public final CobolGrammarParser.displayStmt_return displayStmt() throws RecognitionException {
		CobolGrammarParser.displayStmt_return retval = new CobolGrammarParser.displayStmt_return();
		retval.start = input.LT(1);

		Token STRING40=null;
		ParserRuleReturnScope ident39 =null;


		      List litId  = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:162:3: ( DISPLAY ( ident | STRING )+ ( DOT )? -> displayStmt(lit=litId))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:162:5: DISPLAY ( ident | STRING )+ ( DOT )?
			{
			match(input,DISPLAY,FOLLOW_DISPLAY_in_displayStmt1696); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:163:5: ( ident | STRING )+
			int cnt57=0;
			loop57:
			while (true) {
				int alt57=3;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==IDENTIFIER) ) {
					int LA57_2 = input.LA(2);
					if ( (LA57_2==DOT) ) {
						int LA57_4 = input.LA(3);
						if ( (synpred79_CobolGrammar()) ) {
							alt57=1;
						}

					}
					else if ( (LA57_2==EOF||(LA57_2 >= ACCEPT && LA57_2 <= ADD)||LA57_2==CALL||LA57_2==COMPUTE||LA57_2==DISPLAY||LA57_2==ELSE||LA57_2==ENDEVALUATE||(LA57_2 >= ENDIF && LA57_2 <= ENDPERFORM)||(LA57_2 >= EVALUATE && LA57_2 <= EXIT)||(LA57_2 >= IDENTIFIER && LA57_2 <= IF)||LA57_2==INITIALIZE||LA57_2==MOVE||LA57_2==PERFORM||(LA57_2 >= STOP && LA57_2 <= SUB)||LA57_2==WHEN) ) {
						alt57=1;
					}

				}
				else if ( (LA57_0==STRING) ) {
					alt57=2;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:163:6: ident
					{
					pushFollow(FOLLOW_ident_in_displayStmt1703);
					ident39=ident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {litId.add((ident39!=null?((StringTemplate)ident39.getTemplate()):null));}
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:164:7: STRING
					{
					STRING40=(Token)match(input,STRING,FOLLOW_STRING_in_displayStmt1713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {litId.add((STRING40!=null?STRING40.getText():null));}
					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(57, input);
					throw eee;
				}
				cnt57++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:164:43: ( DOT )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==DOT) ) {
				int LA58_1 = input.LA(2);
				if ( (synpred81_CobolGrammar()) ) {
					alt58=1;
				}
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:164:43: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_displayStmt1719); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 165:6: -> displayStmt(lit=litId)
			  {
			  	retval.st = templateLib.getInstanceOf("displayStmt",new STAttrMap().put("lit", litId));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "displayStmt"


	public static class moveStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "moveStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:169:1: moveStmt : MOVE symbolic ( brackets )? TO ( IDENTIFIER ( brackets )? )+ ( DOT )? -> moveStmt(from=$symbolic.stto=to);
	public final CobolGrammarParser.moveStmt_return moveStmt() throws RecognitionException {
		CobolGrammarParser.moveStmt_return retval = new CobolGrammarParser.moveStmt_return();
		retval.start = input.LT(1);

		Token IDENTIFIER41=null;
		ParserRuleReturnScope symbolic42 =null;


		      List to = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:172:2: ( MOVE symbolic ( brackets )? TO ( IDENTIFIER ( brackets )? )+ ( DOT )? -> moveStmt(from=$symbolic.stto=to))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:2: MOVE symbolic ( brackets )? TO ( IDENTIFIER ( brackets )? )+ ( DOT )?
			{
			match(input,MOVE,FOLLOW_MOVE_in_moveStmt1758); if (state.failed) return retval;
			pushFollow(FOLLOW_symbolic_in_moveStmt1761);
			symbolic42=symbolic();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:17: ( brackets )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==LPAREN) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:17: brackets
					{
					pushFollow(FOLLOW_brackets_in_moveStmt1763);
					brackets();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,TO,FOLLOW_TO_in_moveStmt1766); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:30: ( IDENTIFIER ( brackets )? )+
			int cnt61=0;
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==IDENTIFIER) ) {
					int LA61_2 = input.LA(2);
					if ( (LA61_2==DOT) ) {
						int LA61_3 = input.LA(3);
						if ( (synpred84_CobolGrammar()) ) {
							alt61=1;
						}

					}
					else if ( (LA61_2==EOF||(LA61_2 >= ACCEPT && LA61_2 <= ADD)||LA61_2==CALL||LA61_2==COMPUTE||LA61_2==DISPLAY||LA61_2==ELSE||LA61_2==ENDEVALUATE||(LA61_2 >= ENDIF && LA61_2 <= ENDPERFORM)||(LA61_2 >= EVALUATE && LA61_2 <= EXIT)||(LA61_2 >= IDENTIFIER && LA61_2 <= IF)||LA61_2==INITIALIZE||(LA61_2 >= LPAREN && LA61_2 <= MOVE)||LA61_2==PERFORM||LA61_2==STOP||LA61_2==SUB||LA61_2==WHEN) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:31: IDENTIFIER ( brackets )?
					{
					IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moveStmt1769); if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:42: ( brackets )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==LPAREN) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:42: brackets
							{
							pushFollow(FOLLOW_brackets_in_moveStmt1771);
							brackets();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					if ( state.backtracking==0 ) {to.add((IDENTIFIER41!=null?IDENTIFIER41.getText():null));}
					}
					break;

				default :
					if ( cnt61 >= 1 ) break loop61;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(61, input);
					throw eee;
				}
				cnt61++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:81: ( DOT )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==DOT) ) {
				int LA62_1 = input.LA(2);
				if ( (synpred85_CobolGrammar()) ) {
					alt62=1;
				}
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:81: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_moveStmt1777); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 174:2: -> moveStmt(from=$symbolic.stto=to)
			  {
			  	retval.st = templateLib.getInstanceOf("moveStmt",new STAttrMap().put("from", (symbolic42!=null?((StringTemplate)symbolic42.getTemplate()):null)).put("to", to));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "moveStmt"


	public static class computeStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "computeStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:177:1: computeStmt : COMPUTE ( symbolic | arith )+ ( DOT )? -> initializeStmt(id=ids);
	public final CobolGrammarParser.computeStmt_return computeStmt() throws RecognitionException {
		CobolGrammarParser.computeStmt_return retval = new CobolGrammarParser.computeStmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope symbolic43 =null;
		ParserRuleReturnScope arith44 =null;


		      List ids = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:180:2: ( COMPUTE ( symbolic | arith )+ ( DOT )? -> initializeStmt(id=ids))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:181:2: COMPUTE ( symbolic | arith )+ ( DOT )?
			{
			match(input,COMPUTE,FOLLOW_COMPUTE_in_computeStmt1813); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:181:10: ( symbolic | arith )+
			int cnt63=0;
			loop63:
			while (true) {
				int alt63=3;
				switch ( input.LA(1) ) {
				case IDENTIFIER:
					{
					int LA63_2 = input.LA(2);
					if ( (LA63_2==DOT) ) {
						int LA63_6 = input.LA(3);
						if ( (synpred86_CobolGrammar()) ) {
							alt63=1;
						}

					}
					else if ( (LA63_2==EOF||(LA63_2 >= ACCEPT && LA63_2 <= ADDITION)||LA63_2==CALL||LA63_2==COMPUTE||(LA63_2 >= DIGITS && LA63_2 <= DISPLAY)||LA63_2==ELSE||LA63_2==ENDEVALUATE||(LA63_2 >= ENDIF && LA63_2 <= ENDPERFORM)||(LA63_2 >= EQUAL && LA63_2 <= EXIT)||LA63_2==FIGURATIVE||LA63_2==FORWARDSLASH||LA63_2==FUNCTION||LA63_2==HYPHEN||(LA63_2 >= IDENTIFIER && LA63_2 <= IF)||LA63_2==INITIALIZE||(LA63_2 >= MOVE && LA63_2 <= NINE)||LA63_2==PERFORM||(LA63_2 >= STOP && LA63_2 <= SUB)||LA63_2==WHEN||LA63_2==X) ) {
						alt63=1;
					}

					}
					break;
				case DIGITS:
				case FIGURATIVE:
				case FUNCTION:
				case NINE:
				case STRING:
				case X:
					{
					alt63=1;
					}
					break;
				case HYPHEN:
					{
					int LA63_4 = input.LA(2);
					if ( (synpred86_CobolGrammar()) ) {
						alt63=1;
					}
					else if ( (synpred87_CobolGrammar()) ) {
						alt63=2;
					}

					}
					break;
				case ADDITION:
				case EQUAL:
				case FORWARDSLASH:
				case MULTIPLY:
					{
					alt63=2;
					}
					break;
				}
				switch (alt63) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:181:11: symbolic
					{
					pushFollow(FOLLOW_symbolic_in_computeStmt1816);
					symbolic43=symbolic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {ids.add((symbolic43!=null?((StringTemplate)symbolic43.getTemplate()):null));}
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:182:5: arith
					{
					pushFollow(FOLLOW_arith_in_computeStmt1825);
					arith44=arith();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {ids.add((arith44!=null?((StringTemplate)arith44.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt63 >= 1 ) break loop63;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:183:7: ( DOT )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==DOT) ) {
				int LA64_1 = input.LA(2);
				if ( (synpred88_CobolGrammar()) ) {
					alt64=1;
				}
			}
			switch (alt64) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:183:7: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_computeStmt1836); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 183:12: -> initializeStmt(id=ids)
			  {
			  	retval.st = templateLib.getInstanceOf("initializeStmt",new STAttrMap().put("id", ids));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "computeStmt"


	public static class addStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "addStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:187:1: addStmt : ADD t= symbolic ( brackets )? TO t2= IDENTIFIER ( brackets )? ( DOT )? -> addStmt(left=$t.stright=$t2.text);
	public final CobolGrammarParser.addStmt_return addStmt() throws RecognitionException {
		CobolGrammarParser.addStmt_return retval = new CobolGrammarParser.addStmt_return();
		retval.start = input.LT(1);

		Token t2=null;
		ParserRuleReturnScope t =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:2: ( ADD t= symbolic ( brackets )? TO t2= IDENTIFIER ( brackets )? ( DOT )? -> addStmt(left=$t.stright=$t2.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:4: ADD t= symbolic ( brackets )? TO t2= IDENTIFIER ( brackets )? ( DOT )?
			{
			match(input,ADD,FOLLOW_ADD_in_addStmt1857); if (state.failed) return retval;
			pushFollow(FOLLOW_symbolic_in_addStmt1861);
			t=symbolic();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:19: ( brackets )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==LPAREN) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:19: brackets
					{
					pushFollow(FOLLOW_brackets_in_addStmt1863);
					brackets();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,TO,FOLLOW_TO_in_addStmt1866); if (state.failed) return retval;
			t2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_addStmt1870); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:46: ( brackets )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==LPAREN) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:46: brackets
					{
					pushFollow(FOLLOW_brackets_in_addStmt1872);
					brackets();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:56: ( DOT )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==DOT) ) {
				int LA67_1 = input.LA(2);
				if ( (synpred91_CobolGrammar()) ) {
					alt67=1;
				}
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:56: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_addStmt1875); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 188:60: -> addStmt(left=$t.stright=$t2.text)
			  {
			  	retval.st = templateLib.getInstanceOf("addStmt",new STAttrMap().put("left", (t!=null?((StringTemplate)t.getTemplate()):null)).put("right", (t2!=null?t2.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addStmt"


	public static class subStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:191:1: subStmt : SUB t= symbolic ( brackets )? FROM t2= IDENTIFIER ( brackets )? -> subStmt(left=$t.textright=$t2.text);
	public final CobolGrammarParser.subStmt_return subStmt() throws RecognitionException {
		CobolGrammarParser.subStmt_return retval = new CobolGrammarParser.subStmt_return();
		retval.start = input.LT(1);

		Token t2=null;
		ParserRuleReturnScope t =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:192:2: ( SUB t= symbolic ( brackets )? FROM t2= IDENTIFIER ( brackets )? -> subStmt(left=$t.textright=$t2.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:192:4: SUB t= symbolic ( brackets )? FROM t2= IDENTIFIER ( brackets )?
			{
			match(input,SUB,FOLLOW_SUB_in_subStmt1899); if (state.failed) return retval;
			pushFollow(FOLLOW_symbolic_in_subStmt1903);
			t=symbolic();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:192:19: ( brackets )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==LPAREN) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:192:19: brackets
					{
					pushFollow(FOLLOW_brackets_in_subStmt1905);
					brackets();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,FROM,FOLLOW_FROM_in_subStmt1908); if (state.failed) return retval;
			t2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_subStmt1912); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:192:48: ( brackets )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LPAREN) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:192:48: brackets
					{
					pushFollow(FOLLOW_brackets_in_subStmt1914);
					brackets();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 192:58: -> subStmt(left=$t.textright=$t2.text)
			  {
			  	retval.st = templateLib.getInstanceOf("subStmt",new STAttrMap().put("left", (t!=null?input.toString(t.start,t.stop):null)).put("right", (t2!=null?t2.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subStmt"


	public static class acceptStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "acceptStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:1: acceptStmt : ACCEPT id= IDENTIFIER ( brackets )? FROM ARGUMENTVALUE ( DOT )? -> acceptStmt(id=$id.text);
	public final CobolGrammarParser.acceptStmt_return acceptStmt() throws RecognitionException {
		CobolGrammarParser.acceptStmt_return retval = new CobolGrammarParser.acceptStmt_return();
		retval.start = input.LT(1);

		Token id=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:12: ( ACCEPT id= IDENTIFIER ( brackets )? FROM ARGUMENTVALUE ( DOT )? -> acceptStmt(id=$id.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:14: ACCEPT id= IDENTIFIER ( brackets )? FROM ARGUMENTVALUE ( DOT )?
			{
			match(input,ACCEPT,FOLLOW_ACCEPT_in_acceptStmt1939); if (state.failed) return retval;
			id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_acceptStmt1945); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:37: ( brackets )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==LPAREN) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:37: brackets
					{
					pushFollow(FOLLOW_brackets_in_acceptStmt1947);
					brackets();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,FROM,FOLLOW_FROM_in_acceptStmt1950); if (state.failed) return retval;
			match(input,ARGUMENTVALUE,FOLLOW_ARGUMENTVALUE_in_acceptStmt1952); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:66: ( DOT )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==DOT) ) {
				int LA71_1 = input.LA(2);
				if ( (synpred95_CobolGrammar()) ) {
					alt71=1;
				}
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:66: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_acceptStmt1954); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 196:71: -> acceptStmt(id=$id.text)
			  {
			  	retval.st = templateLib.getInstanceOf("acceptStmt",new STAttrMap().put("id", (id!=null?id.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "acceptStmt"


	public static class callStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "callStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:1: callStmt : CALL STRING USING id= IDENTIFIER ( DOT )? -> acceptStmt(id=$id.text);
	public final CobolGrammarParser.callStmt_return callStmt() throws RecognitionException {
		CobolGrammarParser.callStmt_return retval = new CobolGrammarParser.callStmt_return();
		retval.start = input.LT(1);

		Token id=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:10: ( CALL STRING USING id= IDENTIFIER ( DOT )? -> acceptStmt(id=$id.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:12: CALL STRING USING id= IDENTIFIER ( DOT )?
			{
			match(input,CALL,FOLLOW_CALL_in_callStmt1973); if (state.failed) return retval;
			match(input,STRING,FOLLOW_STRING_in_callStmt1975); if (state.failed) return retval;
			match(input,USING,FOLLOW_USING_in_callStmt1977); if (state.failed) return retval;
			id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_callStmt1983); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:46: ( DOT )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==DOT) ) {
				int LA72_1 = input.LA(2);
				if ( (synpred96_CobolGrammar()) ) {
					alt72=1;
				}
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:46: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_callStmt1985); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 199:51: -> acceptStmt(id=$id.text)
			  {
			  	retval.st = templateLib.getInstanceOf("acceptStmt",new STAttrMap().put("id", (id!=null?id.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callStmt"


	public static class initializeStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "initializeStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:201:1: initializeStmt : INITIALIZE ( IDENTIFIER ( brackets )? )+ ( DOT )? -> initializeStmt(id=ids);
	public final CobolGrammarParser.initializeStmt_return initializeStmt() throws RecognitionException {
		CobolGrammarParser.initializeStmt_return retval = new CobolGrammarParser.initializeStmt_return();
		retval.start = input.LT(1);

		Token IDENTIFIER45=null;


		      List ids = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:204:2: ( INITIALIZE ( IDENTIFIER ( brackets )? )+ ( DOT )? -> initializeStmt(id=ids))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:2: INITIALIZE ( IDENTIFIER ( brackets )? )+ ( DOT )?
			{
			match(input,INITIALIZE,FOLLOW_INITIALIZE_in_initializeStmt2010); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:13: ( IDENTIFIER ( brackets )? )+
			int cnt74=0;
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==IDENTIFIER) ) {
					int LA74_2 = input.LA(2);
					if ( (LA74_2==DOT) ) {
						int LA74_3 = input.LA(3);
						if ( (synpred98_CobolGrammar()) ) {
							alt74=1;
						}

					}
					else if ( (LA74_2==EOF||(LA74_2 >= ACCEPT && LA74_2 <= ADD)||LA74_2==CALL||LA74_2==COMPUTE||LA74_2==DISPLAY||LA74_2==ELSE||LA74_2==ENDEVALUATE||(LA74_2 >= ENDIF && LA74_2 <= ENDPERFORM)||(LA74_2 >= EVALUATE && LA74_2 <= EXIT)||(LA74_2 >= IDENTIFIER && LA74_2 <= IF)||LA74_2==INITIALIZE||(LA74_2 >= LPAREN && LA74_2 <= MOVE)||LA74_2==PERFORM||LA74_2==STOP||LA74_2==SUB||LA74_2==WHEN) ) {
						alt74=1;
					}

				}

				switch (alt74) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:14: IDENTIFIER ( brackets )?
					{
					IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_initializeStmt2013); if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:25: ( brackets )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==LPAREN) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:25: brackets
							{
							pushFollow(FOLLOW_brackets_in_initializeStmt2015);
							brackets();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					if ( state.backtracking==0 ) {ids.add((IDENTIFIER45!=null?IDENTIFIER45.getText():null));}
					}
					break;

				default :
					if ( cnt74 >= 1 ) break loop74;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(74, input);
					throw eee;
				}
				cnt74++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:67: ( DOT )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==DOT) ) {
				int LA75_1 = input.LA(2);
				if ( (synpred99_CobolGrammar()) ) {
					alt75=1;
				}
			}
			switch (alt75) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:67: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_initializeStmt2023); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 205:72: -> initializeStmt(id=ids)
			  {
			  	retval.st = templateLib.getInstanceOf("initializeStmt",new STAttrMap().put("id", ids));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initializeStmt"


	public static class sqlStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sqlStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:208:1: sqlStmt : EXEC SQL ( hostvar ( COMMA )? | IDENTIFIER | sqlwords |d= DOT | DIGITS | NINE )+ HASH ENDEXEC ( DOT )? -> sqlStmt(qr=id);
	public final CobolGrammarParser.sqlStmt_return sqlStmt() throws RecognitionException {
		CobolGrammarParser.sqlStmt_return retval = new CobolGrammarParser.sqlStmt_return();
		retval.start = input.LT(1);

		Token d=null;
		Token IDENTIFIER47=null;
		Token DIGITS49=null;
		Token NINE50=null;
		ParserRuleReturnScope hostvar46 =null;
		ParserRuleReturnScope sqlwords48 =null;


			List id = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:211:2: ( EXEC SQL ( hostvar ( COMMA )? | IDENTIFIER | sqlwords |d= DOT | DIGITS | NINE )+ HASH ENDEXEC ( DOT )? -> sqlStmt(qr=id))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:1: EXEC SQL ( hostvar ( COMMA )? | IDENTIFIER | sqlwords |d= DOT | DIGITS | NINE )+ HASH ENDEXEC ( DOT )?
			{
			match(input,EXEC,FOLLOW_EXEC_in_sqlStmt2045); if (state.failed) return retval;
			match(input,SQL,FOLLOW_SQL_in_sqlStmt2047); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:11: ( hostvar ( COMMA )? | IDENTIFIER | sqlwords |d= DOT | DIGITS | NINE )+
			int cnt77=0;
			loop77:
			while (true) {
				int alt77=7;
				switch ( input.LA(1) ) {
				case HOSTVARIABLES:
					{
					alt77=1;
					}
					break;
				case IDENTIFIER:
					{
					alt77=2;
					}
					break;
				case AND:
				case BY:
				case COLON:
				case COMMA:
				case DECLARE:
				case EQUAL:
				case FORWARDSLASH:
				case FROM:
				case GREATER:
				case INSERT:
				case LESSER:
				case LPAREN:
				case NOT:
				case PERFORM:
				case RPAREN:
				case SINGLEQUOTES:
				case STOP:
				case WHERE:
					{
					alt77=3;
					}
					break;
				case DOT:
					{
					alt77=4;
					}
					break;
				case DIGITS:
					{
					alt77=5;
					}
					break;
				case NINE:
					{
					alt77=6;
					}
					break;
				}
				switch (alt77) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:13: hostvar ( COMMA )?
					{
					pushFollow(FOLLOW_hostvar_in_sqlStmt2052);
					hostvar46=hostvar();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:21: ( COMMA )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==COMMA) ) {
						int LA76_1 = input.LA(2);
						if ( (synpred100_CobolGrammar()) ) {
							alt76=1;
						}
					}
					switch (alt76) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:21: COMMA
							{
							match(input,COMMA,FOLLOW_COMMA_in_sqlStmt2054); if (state.failed) return retval;
							}
							break;

					}

					if ( state.backtracking==0 ) {id.add((hostvar46!=null?((StringTemplate)hostvar46.getTemplate()):null));}
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:213:7: IDENTIFIER
					{
					IDENTIFIER47=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_sqlStmt2065); if (state.failed) return retval;
					if ( state.backtracking==0 ) {id.add((IDENTIFIER47!=null?IDENTIFIER47.getText():null));}
					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:214:7: sqlwords
					{
					pushFollow(FOLLOW_sqlwords_in_sqlStmt2076);
					sqlwords48=sqlwords();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {id.add((sqlwords48!=null?((StringTemplate)sqlwords48.getTemplate()):null));}
					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:215:7: d= DOT
					{
					d=(Token)match(input,DOT,FOLLOW_DOT_in_sqlStmt2088); if (state.failed) return retval;
					if ( state.backtracking==0 ) {id.add((d!=null?d.getText():null));}
					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:216:7: DIGITS
					{
					DIGITS49=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_sqlStmt2098); if (state.failed) return retval;
					if ( state.backtracking==0 ) {id.add((DIGITS49!=null?DIGITS49.getText():null));}
					}
					break;
				case 6 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:217:7: NINE
					{
					NINE50=(Token)match(input,NINE,FOLLOW_NINE_in_sqlStmt2108); if (state.failed) return retval;
					if ( state.backtracking==0 ) {id.add((NINE50!=null?NINE50.getText():null));}
					}
					break;

				default :
					if ( cnt77 >= 1 ) break loop77;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(77, input);
					throw eee;
				}
				cnt77++;
			}

			match(input,HASH,FOLLOW_HASH_in_sqlStmt2119); if (state.failed) return retval;
			match(input,ENDEXEC,FOLLOW_ENDEXEC_in_sqlStmt2121); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:219:14: ( DOT )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DOT) ) {
				int LA78_1 = input.LA(2);
				if ( (synpred107_CobolGrammar()) ) {
					alt78=1;
				}
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:219:14: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_sqlStmt2123); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 220:11: -> sqlStmt(qr=id)
			  {
			  	retval.st = templateLib.getInstanceOf("sqlStmt",new STAttrMap().put("qr", id));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sqlStmt"


	public static class sqlwords_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sqlwords"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:1: sqlwords : id= ( INSERT | STOP | WHERE | PERFORM | COMMA | EQUAL | FROM | AND | LPAREN | BY | RPAREN | FORWARDSLASH | COLON | DECLARE | LESSER | GREATER | SINGLEQUOTES | NOT ) -> onlyid(v=$id.text);
	public final CobolGrammarParser.sqlwords_return sqlwords() throws RecognitionException {
		CobolGrammarParser.sqlwords_return retval = new CobolGrammarParser.sqlwords_return();
		retval.start = input.LT(1);

		Token id=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:10: (id= ( INSERT | STOP | WHERE | PERFORM | COMMA | EQUAL | FROM | AND | LPAREN | BY | RPAREN | FORWARDSLASH | COLON | DECLARE | LESSER | GREATER | SINGLEQUOTES | NOT ) -> onlyid(v=$id.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:12: id= ( INSERT | STOP | WHERE | PERFORM | COMMA | EQUAL | FROM | AND | LPAREN | BY | RPAREN | FORWARDSLASH | COLON | DECLARE | LESSER | GREATER | SINGLEQUOTES | NOT )
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:16: ( INSERT | STOP | WHERE | PERFORM | COMMA | EQUAL | FROM | AND | LPAREN | BY | RPAREN | FORWARDSLASH | COLON | DECLARE | LESSER | GREATER | SINGLEQUOTES | NOT )
			int alt79=18;
			switch ( input.LA(1) ) {
			case INSERT:
				{
				alt79=1;
				}
				break;
			case STOP:
				{
				alt79=2;
				}
				break;
			case WHERE:
				{
				alt79=3;
				}
				break;
			case PERFORM:
				{
				alt79=4;
				}
				break;
			case COMMA:
				{
				alt79=5;
				}
				break;
			case EQUAL:
				{
				alt79=6;
				}
				break;
			case FROM:
				{
				alt79=7;
				}
				break;
			case AND:
				{
				alt79=8;
				}
				break;
			case LPAREN:
				{
				alt79=9;
				}
				break;
			case BY:
				{
				alt79=10;
				}
				break;
			case RPAREN:
				{
				alt79=11;
				}
				break;
			case FORWARDSLASH:
				{
				alt79=12;
				}
				break;
			case COLON:
				{
				alt79=13;
				}
				break;
			case DECLARE:
				{
				alt79=14;
				}
				break;
			case LESSER:
				{
				alt79=15;
				}
				break;
			case GREATER:
				{
				alt79=16;
				}
				break;
			case SINGLEQUOTES:
				{
				alt79=17;
				}
				break;
			case NOT:
				{
				alt79=18;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:17: INSERT
					{
					id=(Token)match(input,INSERT,FOLLOW_INSERT_in_sqlwords2151); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:26: STOP
					{
					id=(Token)match(input,STOP,FOLLOW_STOP_in_sqlwords2155); if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:33: WHERE
					{
					id=(Token)match(input,WHERE,FOLLOW_WHERE_in_sqlwords2159); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:40: PERFORM
					{
					id=(Token)match(input,PERFORM,FOLLOW_PERFORM_in_sqlwords2162); if (state.failed) return retval;
					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:50: COMMA
					{
					id=(Token)match(input,COMMA,FOLLOW_COMMA_in_sqlwords2166); if (state.failed) return retval;
					}
					break;
				case 6 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:58: EQUAL
					{
					id=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_sqlwords2170); if (state.failed) return retval;
					}
					break;
				case 7 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:66: FROM
					{
					id=(Token)match(input,FROM,FOLLOW_FROM_in_sqlwords2174); if (state.failed) return retval;
					}
					break;
				case 8 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:223:73: AND
					{
					id=(Token)match(input,AND,FOLLOW_AND_in_sqlwords2178); if (state.failed) return retval;
					}
					break;
				case 9 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:224:7: LPAREN
					{
					id=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqlwords2186); if (state.failed) return retval;
					}
					break;
				case 10 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:224:16: BY
					{
					id=(Token)match(input,BY,FOLLOW_BY_in_sqlwords2190); if (state.failed) return retval;
					}
					break;
				case 11 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:225:7: RPAREN
					{
					id=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqlwords2199); if (state.failed) return retval;
					}
					break;
				case 12 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:225:16: FORWARDSLASH
					{
					id=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sqlwords2203); if (state.failed) return retval;
					}
					break;
				case 13 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:225:31: COLON
					{
					id=(Token)match(input,COLON,FOLLOW_COLON_in_sqlwords2207); if (state.failed) return retval;
					}
					break;
				case 14 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:225:39: DECLARE
					{
					id=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_sqlwords2211); if (state.failed) return retval;
					}
					break;
				case 15 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:225:49: LESSER
					{
					id=(Token)match(input,LESSER,FOLLOW_LESSER_in_sqlwords2215); if (state.failed) return retval;
					}
					break;
				case 16 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:225:59: GREATER
					{
					id=(Token)match(input,GREATER,FOLLOW_GREATER_in_sqlwords2220); if (state.failed) return retval;
					}
					break;
				case 17 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:226:7: SINGLEQUOTES
					{
					id=(Token)match(input,SINGLEQUOTES,FOLLOW_SINGLEQUOTES_in_sqlwords2228); if (state.failed) return retval;
					}
					break;
				case 18 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:226:22: NOT
					{
					id=(Token)match(input,NOT,FOLLOW_NOT_in_sqlwords2232); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 226:28: -> onlyid(v=$id.text)
			  {
			  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (id!=null?id.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sqlwords"


	public static class evalStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "evalStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:229:1: evalStmt : EVALUATE condition ( WHEN condition ( stmt )+ )+ ENDEVALUATE ( DOT )? -> onlyid(lit=litId);
	public final CobolGrammarParser.evalStmt_return evalStmt() throws RecognitionException {
		CobolGrammarParser.evalStmt_return retval = new CobolGrammarParser.evalStmt_return();
		retval.start = input.LT(1);


		      List litId  = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:233:3: ( EVALUATE condition ( WHEN condition ( stmt )+ )+ ENDEVALUATE ( DOT )? -> onlyid(lit=litId))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:233:5: EVALUATE condition ( WHEN condition ( stmt )+ )+ ENDEVALUATE ( DOT )?
			{
			match(input,EVALUATE,FOLLOW_EVALUATE_in_evalStmt2260); if (state.failed) return retval;
			pushFollow(FOLLOW_condition_in_evalStmt2262);
			condition();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:234:5: ( WHEN condition ( stmt )+ )+
			int cnt81=0;
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==WHEN) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:234:6: WHEN condition ( stmt )+
					{
					match(input,WHEN,FOLLOW_WHEN_in_evalStmt2270); if (state.failed) return retval;
					pushFollow(FOLLOW_condition_in_evalStmt2272);
					condition();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:234:21: ( stmt )+
					int cnt80=0;
					loop80:
					while (true) {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( ((LA80_0 >= ACCEPT && LA80_0 <= ADD)||LA80_0==CALL||LA80_0==COMPUTE||LA80_0==DISPLAY||(LA80_0 >= EVALUATE && LA80_0 <= EXIT)||LA80_0==IF||LA80_0==INITIALIZE||LA80_0==MOVE||LA80_0==PERFORM||LA80_0==SUB) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:234:21: stmt
							{
							pushFollow(FOLLOW_stmt_in_evalStmt2274);
							stmt();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt80 >= 1 ) break loop80;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(80, input);
							throw eee;
						}
						cnt80++;
					}

					}
					break;

				default :
					if ( cnt81 >= 1 ) break loop81;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(81, input);
					throw eee;
				}
				cnt81++;
			}

			match(input,ENDEVALUATE,FOLLOW_ENDEVALUATE_in_evalStmt2283); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:235:17: ( DOT )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==DOT) ) {
				int LA82_1 = input.LA(2);
				if ( (synpred127_CobolGrammar()) ) {
					alt82=1;
				}
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:235:17: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_evalStmt2285); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 236:5: -> onlyid(lit=litId)
			  {
			  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("lit", litId));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "evalStmt"


	public static class ifStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:241:1: ifStmt : IF condition ( THEN )? ( stmt )* ( elseStmt )? ENDIF ( DOT )? -> ifexp(cond=$condition.ststm=stmtselif=elseifelsess=elses);
	public final CobolGrammarParser.ifStmt_return ifStmt() throws RecognitionException {
		CobolGrammarParser.ifStmt_return retval = new CobolGrammarParser.ifStmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope stmt51 =null;
		ParserRuleReturnScope elseStmt52 =null;
		ParserRuleReturnScope condition53 =null;


		      List stmts  = new ArrayList();
		      List elseif = new ArrayList();
		      List elses =  new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:247:2: ( IF condition ( THEN )? ( stmt )* ( elseStmt )? ENDIF ( DOT )? -> ifexp(cond=$condition.ststm=stmtselif=elseifelsess=elses))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:247:4: IF condition ( THEN )? ( stmt )* ( elseStmt )? ENDIF ( DOT )?
			{
			match(input,IF,FOLLOW_IF_in_ifStmt2327); if (state.failed) return retval;
			pushFollow(FOLLOW_condition_in_ifStmt2329);
			condition53=condition();
			state._fsp--;
			if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:247:17: ( THEN )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==THEN) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:247:17: THEN
					{
					match(input,THEN,FOLLOW_THEN_in_ifStmt2331); if (state.failed) return retval;
					}
					break;

			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:248:4: ( stmt )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( ((LA84_0 >= ACCEPT && LA84_0 <= ADD)||LA84_0==CALL||LA84_0==COMPUTE||LA84_0==DISPLAY||(LA84_0 >= EVALUATE && LA84_0 <= EXIT)||LA84_0==IF||LA84_0==INITIALIZE||LA84_0==MOVE||LA84_0==PERFORM||LA84_0==SUB) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:248:5: stmt
					{
					pushFollow(FOLLOW_stmt_in_ifStmt2338);
					stmt51=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt51!=null?((StringTemplate)stmt51.getTemplate()):null));}
					}
					break;

				default :
					break loop84;
				}
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:249:4: ( elseStmt )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==ELSE) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:249:5: elseStmt
					{
					pushFollow(FOLLOW_elseStmt_in_ifStmt2348);
					elseStmt52=elseStmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {elses.add((elseStmt52!=null?((StringTemplate)elseStmt52.getTemplate()):null));}
					}
					break;

			}

			match(input,ENDIF,FOLLOW_ENDIF_in_ifStmt2355); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:250:4: ( DOT )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==DOT) ) {
				int LA86_1 = input.LA(2);
				if ( (synpred131_CobolGrammar()) ) {
					alt86=1;
				}
			}
			switch (alt86) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:250:4: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_ifStmt2360); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 250:8: -> ifexp(cond=$condition.ststm=stmtselif=elseifelsess=elses)
			  {
			  	retval.st = templateLib.getInstanceOf("ifexp",new STAttrMap().put("cond", (condition53!=null?((StringTemplate)condition53.getTemplate()):null)).put("stm", stmts).put("elif", elseif).put("elsess", elses));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStmt"


	public static class elseifStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "elseifStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:253:1: elseifStmt : ELSE IF condition THEN ( stmt )+ ( DOT )? -> elseifexp(cond=$condition.ststm=stmts);
	public final CobolGrammarParser.elseifStmt_return elseifStmt() throws RecognitionException {
		CobolGrammarParser.elseifStmt_return retval = new CobolGrammarParser.elseifStmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope stmt54 =null;
		ParserRuleReturnScope condition55 =null;


		      List stmts  = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:257:2: ( ELSE IF condition THEN ( stmt )+ ( DOT )? -> elseifexp(cond=$condition.ststm=stmts))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:257:3: ELSE IF condition THEN ( stmt )+ ( DOT )?
			{
			match(input,ELSE,FOLLOW_ELSE_in_elseifStmt2401); if (state.failed) return retval;
			match(input,IF,FOLLOW_IF_in_elseifStmt2403); if (state.failed) return retval;
			pushFollow(FOLLOW_condition_in_elseifStmt2405);
			condition55=condition();
			state._fsp--;
			if (state.failed) return retval;
			match(input,THEN,FOLLOW_THEN_in_elseifStmt2407); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:258:2: ( stmt )+
			int cnt87=0;
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( ((LA87_0 >= ACCEPT && LA87_0 <= ADD)||LA87_0==CALL||LA87_0==COMPUTE||LA87_0==DISPLAY||(LA87_0 >= EVALUATE && LA87_0 <= EXIT)||LA87_0==IF||LA87_0==INITIALIZE||LA87_0==MOVE||LA87_0==PERFORM||LA87_0==SUB) ) {
					alt87=1;
				}

				switch (alt87) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:258:3: stmt
					{
					pushFollow(FOLLOW_stmt_in_elseifStmt2411);
					stmt54=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt54!=null?((StringTemplate)stmt54.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt87 >= 1 ) break loop87;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(87, input);
					throw eee;
				}
				cnt87++;
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:259:4: ( DOT )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==DOT) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:259:4: DOT
					{
					match(input,DOT,FOLLOW_DOT_in_elseifStmt2421); if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 259:9: -> elseifexp(cond=$condition.ststm=stmts)
			  {
			  	retval.st = templateLib.getInstanceOf("elseifexp",new STAttrMap().put("cond", (condition55!=null?((StringTemplate)condition55.getTemplate()):null)).put("stm", stmts));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseifStmt"


	public static class elseStmt_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "elseStmt"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:262:1: elseStmt : ELSE ( stmt )+ -> elseexp(stm=stmts);
	public final CobolGrammarParser.elseStmt_return elseStmt() throws RecognitionException {
		CobolGrammarParser.elseStmt_return retval = new CobolGrammarParser.elseStmt_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope stmt56 =null;


		      List stmts  = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:265:3: ( ELSE ( stmt )+ -> elseexp(stm=stmts))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:266:2: ELSE ( stmt )+
			{
			match(input,ELSE,FOLLOW_ELSE_in_elseStmt2454); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:267:2: ( stmt )+
			int cnt89=0;
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( ((LA89_0 >= ACCEPT && LA89_0 <= ADD)||LA89_0==CALL||LA89_0==COMPUTE||LA89_0==DISPLAY||(LA89_0 >= EVALUATE && LA89_0 <= EXIT)||LA89_0==IF||LA89_0==INITIALIZE||LA89_0==MOVE||LA89_0==PERFORM||LA89_0==SUB) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:267:3: stmt
					{
					pushFollow(FOLLOW_stmt_in_elseStmt2458);
					stmt56=stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {stmts.add((stmt56!=null?((StringTemplate)stmt56.getTemplate()):null));}
					}
					break;

				default :
					if ( cnt89 >= 1 ) break loop89;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(89, input);
					throw eee;
				}
				cnt89++;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 268:2: -> elseexp(stm=stmts)
			  {
			  	retval.st = templateLib.getInstanceOf("elseexp",new STAttrMap().put("stm", stmts));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseStmt"


	public static class condition_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "condition"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:272:1: condition : ( andexpression -> onlyid(v=$andexpression.st)) ;
	public final CobolGrammarParser.condition_return condition() throws RecognitionException {
		CobolGrammarParser.condition_return retval = new CobolGrammarParser.condition_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope andexpression57 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:272:11: ( ( andexpression -> onlyid(v=$andexpression.st)) )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:272:13: ( andexpression -> onlyid(v=$andexpression.st))
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:272:13: ( andexpression -> onlyid(v=$andexpression.st))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:272:14: andexpression
			{
			pushFollow(FOLLOW_andexpression_in_condition2490);
			andexpression57=andexpression();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 272:30: -> onlyid(v=$andexpression.st)
			  {
			  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (andexpression57!=null?((StringTemplate)andexpression57.getTemplate()):null)));
			  }


			}

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class andexpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "andexpression"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:274:1: andexpression : (o1= orexpression ) ( AND o2= orexpression )* -> andexp(exps=orexps);
	public final CobolGrammarParser.andexpression_return andexpression() throws RecognitionException {
		CobolGrammarParser.andexpression_return retval = new CobolGrammarParser.andexpression_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope o1 =null;
		ParserRuleReturnScope o2 =null;


		      List orexps = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:278:2: ( (o1= orexpression ) ( AND o2= orexpression )* -> andexp(exps=orexps))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:278:4: (o1= orexpression ) ( AND o2= orexpression )*
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:278:4: (o1= orexpression )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:278:6: o1= orexpression
			{
			pushFollow(FOLLOW_orexpression_in_andexpression2529);
			o1=orexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {orexps.add((o1!=null?((StringTemplate)o1.getTemplate()):null));}
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:279:4: ( AND o2= orexpression )*
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==AND) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:279:5: AND o2= orexpression
					{
					match(input,AND,FOLLOW_AND_in_andexpression2539); if (state.failed) return retval;
					pushFollow(FOLLOW_orexpression_in_andexpression2543);
					o2=orexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {orexps.add((o2!=null?((StringTemplate)o2.getTemplate()):null));}
					}
					break;

				default :
					break loop90;
				}
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 280:4: -> andexp(exps=orexps)
			  {
			  	retval.st = templateLib.getInstanceOf("andexp",new STAttrMap().put("exps", orexps));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andexpression"


	public static class orexpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "orexpression"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:284:1: orexpression : (n1= notexpression ) ( OR n2= notexpression )* -> orexp(exps=notexps);
	public final CobolGrammarParser.orexpression_return orexpression() throws RecognitionException {
		CobolGrammarParser.orexpression_return retval = new CobolGrammarParser.orexpression_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope n1 =null;
		ParserRuleReturnScope n2 =null;


		      List notexps = new ArrayList();

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:288:2: ( (n1= notexpression ) ( OR n2= notexpression )* -> orexp(exps=notexps))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:289:4: (n1= notexpression ) ( OR n2= notexpression )*
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:289:4: (n1= notexpression )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:289:5: n1= notexpression
			{
			pushFollow(FOLLOW_notexpression_in_orexpression2589);
			n1=notexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {notexps.add((n1!=null?((StringTemplate)n1.getTemplate()):null));}
			}

			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:290:4: ( OR n2= notexpression )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==OR) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:290:5: OR n2= notexpression
					{
					match(input,OR,FOLLOW_OR_in_orexpression2599); if (state.failed) return retval;
					pushFollow(FOLLOW_notexpression_in_orexpression2603);
					n2=notexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {notexps.add((n2!=null?((StringTemplate)n2.getTemplate()):null));}
					}
					break;

				default :
					break loop91;
				}
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 291:4: -> orexp(exps=notexps)
			  {
			  	retval.st = templateLib.getInstanceOf("orexp",new STAttrMap().put("exps", notexps));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orexpression"


	public static class notexpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "notexpression"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:294:1: notexpression : ( NOT t= term -> notexp(exp=$t.st)|t= term -> exp(exp=$t.st));
	public final CobolGrammarParser.notexpression_return notexpression() throws RecognitionException {
		CobolGrammarParser.notexpression_return retval = new CobolGrammarParser.notexpression_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope t =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:294:15: ( NOT t= term -> notexp(exp=$t.st)|t= term -> exp(exp=$t.st))
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==NOT) ) {
				alt92=1;
			}
			else if ( (LA92_0==DIGITS||(LA92_0 >= FALSE && LA92_0 <= FIGURATIVE)||LA92_0==FUNCTION||LA92_0==HYPHEN||LA92_0==IDENTIFIER||LA92_0==LPAREN||LA92_0==NINE||(LA92_0 >= NOTFALSE && LA92_0 <= NOTTRUE)||LA92_0==STRING||LA92_0==TRUE||LA92_0==X) ) {
				alt92=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:294:17: NOT t= term
					{
					match(input,NOT,FOLLOW_NOT_in_notexpression2634); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_notexpression2638);
					t=term();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 294:28: -> notexp(exp=$t.st)
					  {
					  	retval.st = templateLib.getInstanceOf("notexp",new STAttrMap().put("exp", (t!=null?((StringTemplate)t.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:295:9: t= term
					{
					pushFollow(FOLLOW_term_in_notexpression2662);
					t=term();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 295:18: -> exp(exp=$t.st)
					  {
					  	retval.st = templateLib.getInstanceOf("exp",new STAttrMap().put("exp", (t!=null?((StringTemplate)t.getTemplate()):null)));
					  }


					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notexpression"


	public static class term_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "term"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:298:1: term : (t= booleanexp -> exp(exp=$t.st)| LPAREN t= andexpression RPAREN -> bracketexp(exp=$t.st));
	public final CobolGrammarParser.term_return term() throws RecognitionException {
		CobolGrammarParser.term_return retval = new CobolGrammarParser.term_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope t =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:298:6: (t= booleanexp -> exp(exp=$t.st)| LPAREN t= andexpression RPAREN -> bracketexp(exp=$t.st))
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==DIGITS||(LA93_0 >= FALSE && LA93_0 <= FIGURATIVE)||LA93_0==FUNCTION||LA93_0==HYPHEN||LA93_0==IDENTIFIER||LA93_0==NINE||(LA93_0 >= NOTFALSE && LA93_0 <= NOTTRUE)||LA93_0==STRING||LA93_0==TRUE||LA93_0==X) ) {
				alt93=1;
			}
			else if ( (LA93_0==LPAREN) ) {
				alt93=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}

			switch (alt93) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:298:8: t= booleanexp
					{
					pushFollow(FOLLOW_booleanexp_in_term2695);
					t=booleanexp();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 298:23: -> exp(exp=$t.st)
					  {
					  	retval.st = templateLib.getInstanceOf("exp",new STAttrMap().put("exp", (t!=null?((StringTemplate)t.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:299:6: LPAREN t= andexpression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_term2714); if (state.failed) return retval;
					pushFollow(FOLLOW_andexpression_in_term2718);
					t=andexpression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_term2720); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 299:36: -> bracketexp(exp=$t.st)
					  {
					  	retval.st = templateLib.getInstanceOf("bracketexp",new STAttrMap().put("exp", (t!=null?((StringTemplate)t.getTemplate()):null)));
					  }


					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class booleanexp_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "booleanexp"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:1: booleanexp : (t= symbolic ( brackets )? compare t2= symbolic ( brackets )? -> boolexp(exp1=$t.stcomp=$compare.stexp2=$t2.st)| TRUE -> onlyid(v=$TRUE.text)| FALSE -> onlyid(v=$FALSE.text)| NOTTRUE -> onlyid(v=$NOTTRUE.text)| NOTFALSE -> onlyid(v=$NOTFALSE.text)) ;
	public final CobolGrammarParser.booleanexp_return booleanexp() throws RecognitionException {
		CobolGrammarParser.booleanexp_return retval = new CobolGrammarParser.booleanexp_return();
		retval.start = input.LT(1);

		Token TRUE59=null;
		Token FALSE60=null;
		Token NOTTRUE61=null;
		Token NOTFALSE62=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope t2 =null;
		ParserRuleReturnScope compare58 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:12: ( (t= symbolic ( brackets )? compare t2= symbolic ( brackets )? -> boolexp(exp1=$t.stcomp=$compare.stexp2=$t2.st)| TRUE -> onlyid(v=$TRUE.text)| FALSE -> onlyid(v=$FALSE.text)| NOTTRUE -> onlyid(v=$NOTTRUE.text)| NOTFALSE -> onlyid(v=$NOTFALSE.text)) )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:14: (t= symbolic ( brackets )? compare t2= symbolic ( brackets )? -> boolexp(exp1=$t.stcomp=$compare.stexp2=$t2.st)| TRUE -> onlyid(v=$TRUE.text)| FALSE -> onlyid(v=$FALSE.text)| NOTTRUE -> onlyid(v=$NOTTRUE.text)| NOTFALSE -> onlyid(v=$NOTFALSE.text))
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:14: (t= symbolic ( brackets )? compare t2= symbolic ( brackets )? -> boolexp(exp1=$t.stcomp=$compare.stexp2=$t2.st)| TRUE -> onlyid(v=$TRUE.text)| FALSE -> onlyid(v=$FALSE.text)| NOTTRUE -> onlyid(v=$NOTTRUE.text)| NOTFALSE -> onlyid(v=$NOTFALSE.text))
			int alt96=5;
			switch ( input.LA(1) ) {
			case DIGITS:
			case FIGURATIVE:
			case FUNCTION:
			case HYPHEN:
			case IDENTIFIER:
			case NINE:
			case STRING:
			case X:
				{
				alt96=1;
				}
				break;
			case TRUE:
				{
				alt96=2;
				}
				break;
			case FALSE:
				{
				alt96=3;
				}
				break;
			case NOTTRUE:
				{
				alt96=4;
				}
				break;
			case NOTFALSE:
				{
				alt96=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:15: t= symbolic ( brackets )? compare t2= symbolic ( brackets )?
					{
					pushFollow(FOLLOW_symbolic_in_booleanexp2747);
					t=symbolic();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:26: ( brackets )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==LPAREN) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:26: brackets
							{
							pushFollow(FOLLOW_brackets_in_booleanexp2749);
							brackets();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					pushFollow(FOLLOW_compare_in_booleanexp2752);
					compare58=compare();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_symbolic_in_booleanexp2756);
					t2=symbolic();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:56: ( brackets )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==LPAREN) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:302:56: brackets
							{
							pushFollow(FOLLOW_brackets_in_booleanexp2758);
							brackets();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 302:68: -> boolexp(exp1=$t.stcomp=$compare.stexp2=$t2.st)
					  {
					  	retval.st = templateLib.getInstanceOf("boolexp",new STAttrMap().put("exp1", (t!=null?((StringTemplate)t.getTemplate()):null)).put("comp", (compare58!=null?((StringTemplate)compare58.getTemplate()):null)).put("exp2", (t2!=null?((StringTemplate)t2.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:303:7: TRUE
					{
					TRUE59=(Token)match(input,TRUE,FOLLOW_TRUE_in_booleanexp2786); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 303:12: -> onlyid(v=$TRUE.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (TRUE59!=null?TRUE59.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:304:7: FALSE
					{
					FALSE60=(Token)match(input,FALSE,FOLLOW_FALSE_in_booleanexp2803); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 304:13: -> onlyid(v=$FALSE.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (FALSE60!=null?FALSE60.getText():null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:305:7: NOTTRUE
					{
					NOTTRUE61=(Token)match(input,NOTTRUE,FOLLOW_NOTTRUE_in_booleanexp2820); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 305:15: -> onlyid(v=$NOTTRUE.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (NOTTRUE61!=null?NOTTRUE61.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:306:7: NOTFALSE
					{
					NOTFALSE62=(Token)match(input,NOTFALSE,FOLLOW_NOTFALSE_in_booleanexp2837); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 306:16: -> onlyid(v=$NOTFALSE.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (NOTFALSE62!=null?NOTFALSE62.getText():null)));
					  }


					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanexp"


	public static class compare_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compare"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:309:1: compare : ( NOTEQUAL -> comp(id=\"!=\")| GREATER -> comp(id=$GREATER.text)| LESSER -> comp(id=$LESSER.text)| EQUAL -> comp(id=\"==\")| GREATERTHANEQUAL -> comp(id=\">=\")| LESSERTHANEQUAL -> comp(id=\"<=\")| DON -> comp(id=\" <> \")| NOT -> comp(id=$NOT.text));
	public final CobolGrammarParser.compare_return compare() throws RecognitionException {
		CobolGrammarParser.compare_return retval = new CobolGrammarParser.compare_return();
		retval.start = input.LT(1);

		Token GREATER63=null;
		Token LESSER64=null;
		Token NOT65=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:309:9: ( NOTEQUAL -> comp(id=\"!=\")| GREATER -> comp(id=$GREATER.text)| LESSER -> comp(id=$LESSER.text)| EQUAL -> comp(id=\"==\")| GREATERTHANEQUAL -> comp(id=\">=\")| LESSERTHANEQUAL -> comp(id=\"<=\")| DON -> comp(id=\" <> \")| NOT -> comp(id=$NOT.text))
			int alt97=8;
			switch ( input.LA(1) ) {
			case NOTEQUAL:
				{
				alt97=1;
				}
				break;
			case GREATER:
				{
				alt97=2;
				}
				break;
			case LESSER:
				{
				alt97=3;
				}
				break;
			case EQUAL:
				{
				alt97=4;
				}
				break;
			case GREATERTHANEQUAL:
				{
				alt97=5;
				}
				break;
			case LESSERTHANEQUAL:
				{
				alt97=6;
				}
				break;
			case DON:
				{
				alt97=7;
				}
				break;
			case NOT:
				{
				alt97=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:309:11: NOTEQUAL
					{
					match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_compare2858); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 309:20: -> comp(id=\"!=\")
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", "!="));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:310:5: GREATER
					{
					GREATER63=(Token)match(input,GREATER,FOLLOW_GREATER_in_compare2873); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 310:13: -> comp(id=$GREATER.text)
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", (GREATER63!=null?GREATER63.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:311:5: LESSER
					{
					LESSER64=(Token)match(input,LESSER,FOLLOW_LESSER_in_compare2888); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 311:12: -> comp(id=$LESSER.text)
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", (LESSER64!=null?LESSER64.getText():null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:312:5: EQUAL
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_compare2903); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 312:11: -> comp(id=\"==\")
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", "=="));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:313:5: GREATERTHANEQUAL
					{
					match(input,GREATERTHANEQUAL,FOLLOW_GREATERTHANEQUAL_in_compare2918); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 313:22: -> comp(id=\">=\")
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", ">="));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:314:5: LESSERTHANEQUAL
					{
					match(input,LESSERTHANEQUAL,FOLLOW_LESSERTHANEQUAL_in_compare2933); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 314:21: -> comp(id=\"<=\")
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", "<="));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:315:5: DON
					{
					match(input,DON,FOLLOW_DON_in_compare2948); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 315:9: -> comp(id=\" <> \")
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", " <> "));
					  }


					}

					}
					break;
				case 8 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:316:5: NOT
					{
					NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_compare2963); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 316:9: -> comp(id=$NOT.text)
					  {
					  	retval.st = templateLib.getInstanceOf("comp",new STAttrMap().put("id", (NOT65!=null?NOT65.getText():null)));
					  }


					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compare"


	public static class symbolic_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "symbolic"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:319:1: symbolic : ( FIGURATIVE -> sym(id=$FIGURATIVE.text)| ( HYPHEN )? DIGITS -> sym(id=$DIGITS.text)| NINE -> sym(id=$NINE.text)| STRING -> sym(id=$STRING.text)| IDENTIFIER -> sym(id=$IDENTIFIER.text)| X STRING -> sym(id=$STRING.text)| FUNCTION NUMVAL LPAREN IDENTIFIER RPAREN -> parseint(str=$IDENTIFIER.text));
	public final CobolGrammarParser.symbolic_return symbolic() throws RecognitionException {
		CobolGrammarParser.symbolic_return retval = new CobolGrammarParser.symbolic_return();
		retval.start = input.LT(1);

		Token FIGURATIVE66=null;
		Token DIGITS67=null;
		Token NINE68=null;
		Token STRING69=null;
		Token IDENTIFIER70=null;
		Token STRING71=null;
		Token IDENTIFIER72=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:319:10: ( FIGURATIVE -> sym(id=$FIGURATIVE.text)| ( HYPHEN )? DIGITS -> sym(id=$DIGITS.text)| NINE -> sym(id=$NINE.text)| STRING -> sym(id=$STRING.text)| IDENTIFIER -> sym(id=$IDENTIFIER.text)| X STRING -> sym(id=$STRING.text)| FUNCTION NUMVAL LPAREN IDENTIFIER RPAREN -> parseint(str=$IDENTIFIER.text))
			int alt99=7;
			switch ( input.LA(1) ) {
			case FIGURATIVE:
				{
				alt99=1;
				}
				break;
			case DIGITS:
			case HYPHEN:
				{
				alt99=2;
				}
				break;
			case NINE:
				{
				alt99=3;
				}
				break;
			case STRING:
				{
				alt99=4;
				}
				break;
			case IDENTIFIER:
				{
				alt99=5;
				}
				break;
			case X:
				{
				alt99=6;
				}
				break;
			case FUNCTION:
				{
				alt99=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:319:12: FIGURATIVE
					{
					FIGURATIVE66=(Token)match(input,FIGURATIVE,FOLLOW_FIGURATIVE_in_symbolic2983); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 319:23: -> sym(id=$FIGURATIVE.text)
					  {
					  	retval.st = templateLib.getInstanceOf("sym",new STAttrMap().put("id", (FIGURATIVE66!=null?FIGURATIVE66.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:320:6: ( HYPHEN )? DIGITS
					{
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:320:6: ( HYPHEN )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==HYPHEN) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:320:6: HYPHEN
							{
							match(input,HYPHEN,FOLLOW_HYPHEN_in_symbolic3001); if (state.failed) return retval;
							}
							break;

					}

					DIGITS67=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_symbolic3004); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 320:21: -> sym(id=$DIGITS.text)
					  {
					  	retval.st = templateLib.getInstanceOf("sym",new STAttrMap().put("id", (DIGITS67!=null?DIGITS67.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:321:6: NINE
					{
					NINE68=(Token)match(input,NINE,FOLLOW_NINE_in_symbolic3022); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 321:11: -> sym(id=$NINE.text)
					  {
					  	retval.st = templateLib.getInstanceOf("sym",new STAttrMap().put("id", (NINE68!=null?NINE68.getText():null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:322:6: STRING
					{
					STRING69=(Token)match(input,STRING,FOLLOW_STRING_in_symbolic3039); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 322:13: -> sym(id=$STRING.text)
					  {
					  	retval.st = templateLib.getInstanceOf("sym",new STAttrMap().put("id", (STRING69!=null?STRING69.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:323:6: IDENTIFIER
					{
					IDENTIFIER70=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_symbolic3057); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 323:17: -> sym(id=$IDENTIFIER.text)
					  {
					  	retval.st = templateLib.getInstanceOf("sym",new STAttrMap().put("id", (IDENTIFIER70!=null?IDENTIFIER70.getText():null)));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:324:6: X STRING
					{
					match(input,X,FOLLOW_X_in_symbolic3075); if (state.failed) return retval;
					STRING71=(Token)match(input,STRING,FOLLOW_STRING_in_symbolic3077); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 324:15: -> sym(id=$STRING.text)
					  {
					  	retval.st = templateLib.getInstanceOf("sym",new STAttrMap().put("id", (STRING71!=null?STRING71.getText():null)));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:325:6: FUNCTION NUMVAL LPAREN IDENTIFIER RPAREN
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_symbolic3094); if (state.failed) return retval;
					match(input,NUMVAL,FOLLOW_NUMVAL_in_symbolic3096); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_symbolic3098); if (state.failed) return retval;
					IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_symbolic3100); if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_symbolic3102); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 325:47: -> parseint(str=$IDENTIFIER.text)
					  {
					  	retval.st = templateLib.getInstanceOf("parseint",new STAttrMap().put("str", (IDENTIFIER72!=null?IDENTIFIER72.getText():null)));
					  }


					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbolic"


	public static class arithmetic_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arithmetic"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:328:1: arithmetic : ( IDENTIFIER | arith | DIGITS ) ;
	public final CobolGrammarParser.arithmetic_return arithmetic() throws RecognitionException {
		CobolGrammarParser.arithmetic_return retval = new CobolGrammarParser.arithmetic_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:328:12: ( ( IDENTIFIER | arith | DIGITS ) )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:328:14: ( IDENTIFIER | arith | DIGITS )
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:328:14: ( IDENTIFIER | arith | DIGITS )
			int alt100=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt100=1;
				}
				break;
			case ADDITION:
			case EQUAL:
			case FORWARDSLASH:
			case HYPHEN:
			case MULTIPLY:
				{
				alt100=2;
				}
				break;
			case DIGITS:
				{
				alt100=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:328:15: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_arithmetic3128); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:329:7: arith
					{
					pushFollow(FOLLOW_arith_in_arithmetic3137);
					arith();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:330:7: DIGITS
					{
					match(input,DIGITS,FOLLOW_DIGITS_in_arithmetic3146); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic"


	public static class arith_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arith"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:333:1: arith : ( ADDITION -> onlyid(v=$ADDITION.text)| HYPHEN -> onlyid(v=$HYPHEN.text)| MULTIPLY -> onlyid(v=$MULTIPLY.text)| FORWARDSLASH -> onlyid(v=$FORWARDSLASH.text)| EQUAL -> onlyid(v=$EQUAL.text)) ;
	public final CobolGrammarParser.arith_return arith() throws RecognitionException {
		CobolGrammarParser.arith_return retval = new CobolGrammarParser.arith_return();
		retval.start = input.LT(1);

		Token ADDITION73=null;
		Token HYPHEN74=null;
		Token MULTIPLY75=null;
		Token FORWARDSLASH76=null;
		Token EQUAL77=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:333:7: ( ( ADDITION -> onlyid(v=$ADDITION.text)| HYPHEN -> onlyid(v=$HYPHEN.text)| MULTIPLY -> onlyid(v=$MULTIPLY.text)| FORWARDSLASH -> onlyid(v=$FORWARDSLASH.text)| EQUAL -> onlyid(v=$EQUAL.text)) )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:333:8: ( ADDITION -> onlyid(v=$ADDITION.text)| HYPHEN -> onlyid(v=$HYPHEN.text)| MULTIPLY -> onlyid(v=$MULTIPLY.text)| FORWARDSLASH -> onlyid(v=$FORWARDSLASH.text)| EQUAL -> onlyid(v=$EQUAL.text))
			{
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:333:8: ( ADDITION -> onlyid(v=$ADDITION.text)| HYPHEN -> onlyid(v=$HYPHEN.text)| MULTIPLY -> onlyid(v=$MULTIPLY.text)| FORWARDSLASH -> onlyid(v=$FORWARDSLASH.text)| EQUAL -> onlyid(v=$EQUAL.text))
			int alt101=5;
			switch ( input.LA(1) ) {
			case ADDITION:
				{
				alt101=1;
				}
				break;
			case HYPHEN:
				{
				alt101=2;
				}
				break;
			case MULTIPLY:
				{
				alt101=3;
				}
				break;
			case FORWARDSLASH:
				{
				alt101=4;
				}
				break;
			case EQUAL:
				{
				alt101=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:333:10: ADDITION
					{
					ADDITION73=(Token)match(input,ADDITION,FOLLOW_ADDITION_in_arith3164); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 333:19: -> onlyid(v=$ADDITION.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (ADDITION73!=null?ADDITION73.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:334:8: HYPHEN
					{
					HYPHEN74=(Token)match(input,HYPHEN,FOLLOW_HYPHEN_in_arith3183); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 334:16: -> onlyid(v=$HYPHEN.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (HYPHEN74!=null?HYPHEN74.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:335:8: MULTIPLY
					{
					MULTIPLY75=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arith3202); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 335:18: -> onlyid(v=$MULTIPLY.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (MULTIPLY75!=null?MULTIPLY75.getText():null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:336:8: FORWARDSLASH
					{
					FORWARDSLASH76=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_arith3221); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 336:22: -> onlyid(v=$FORWARDSLASH.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (FORWARDSLASH76!=null?FORWARDSLASH76.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:337:8: EQUAL
					{
					EQUAL77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_arith3240); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 337:15: -> onlyid(v=$EQUAL.text)
					  {
					  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (EQUAL77!=null?EQUAL77.getText():null)));
					  }


					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith"


	public static class hostvar_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "hostvar"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:340:1: hostvar : HOSTVARIABLES -> hostvar(id=$HOSTVARIABLES.text);
	public final CobolGrammarParser.hostvar_return hostvar() throws RecognitionException {
		CobolGrammarParser.hostvar_return retval = new CobolGrammarParser.hostvar_return();
		retval.start = input.LT(1);

		Token HOSTVARIABLES78=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:340:9: ( HOSTVARIABLES -> hostvar(id=$HOSTVARIABLES.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:340:11: HOSTVARIABLES
			{
			HOSTVARIABLES78=(Token)match(input,HOSTVARIABLES,FOLLOW_HOSTVARIABLES_in_hostvar3268); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 340:25: -> hostvar(id=$HOSTVARIABLES.text)
			  {
			  	retval.st = templateLib.getInstanceOf("hostvar",new STAttrMap().put("id", (HOSTVARIABLES78!=null?HOSTVARIABLES78.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hostvar"


	public static class ident_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ident"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:341:1: ident : IDENTIFIER -> identi(id=$IDENTIFIER.text);
	public final CobolGrammarParser.ident_return ident() throws RecognitionException {
		CobolGrammarParser.ident_return retval = new CobolGrammarParser.ident_return();
		retval.start = input.LT(1);

		Token IDENTIFIER79=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:341:7: ( IDENTIFIER -> identi(id=$IDENTIFIER.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:341:9: IDENTIFIER
			{
			IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ident3284); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 341:20: -> identi(id=$IDENTIFIER.text)
			  {
			  	retval.st = templateLib.getInstanceOf("identi",new STAttrMap().put("id", (IDENTIFIER79!=null?IDENTIFIER79.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ident"


	public static class identifier_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identifier"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:344:1: identifier : IDENTIFIER brackets -> onlyid(v=$IDENTIFIER.text);
	public final CobolGrammarParser.identifier_return identifier() throws RecognitionException {
		CobolGrammarParser.identifier_return retval = new CobolGrammarParser.identifier_return();
		retval.start = input.LT(1);

		Token IDENTIFIER80=null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:344:12: ( IDENTIFIER brackets -> onlyid(v=$IDENTIFIER.text))
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:344:14: IDENTIFIER brackets
			{
			IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier3302); if (state.failed) return retval;
			pushFollow(FOLLOW_brackets_in_identifier3304);
			brackets();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 344:36: -> onlyid(v=$IDENTIFIER.text)
			  {
			  	retval.st = templateLib.getInstanceOf("onlyid",new STAttrMap().put("v", (IDENTIFIER80!=null?IDENTIFIER80.getText():null)));
			  }


			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class brackets_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "brackets"
	// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:1: brackets : LPAREN ( DIGITS ( COMMA )? -> arrbrackets(index=$DIGITS.text)| IDENTIFIER ( brackets )? ( COMMA )? -> arrbrackets(index=$IDENTIFIER.text)| arithmetic -> arrbrackets(index=$arithmetic.text))+ RPAREN ;
	public final CobolGrammarParser.brackets_return brackets() throws RecognitionException {
		CobolGrammarParser.brackets_return retval = new CobolGrammarParser.brackets_return();
		retval.start = input.LT(1);

		Token DIGITS81=null;
		Token IDENTIFIER82=null;
		ParserRuleReturnScope arithmetic83 =null;

		try {
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:10: ( LPAREN ( DIGITS ( COMMA )? -> arrbrackets(index=$DIGITS.text)| IDENTIFIER ( brackets )? ( COMMA )? -> arrbrackets(index=$IDENTIFIER.text)| arithmetic -> arrbrackets(index=$arithmetic.text))+ RPAREN )
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:12: LPAREN ( DIGITS ( COMMA )? -> arrbrackets(index=$DIGITS.text)| IDENTIFIER ( brackets )? ( COMMA )? -> arrbrackets(index=$IDENTIFIER.text)| arithmetic -> arrbrackets(index=$arithmetic.text))+ RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_brackets3323); if (state.failed) return retval;
			// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:19: ( DIGITS ( COMMA )? -> arrbrackets(index=$DIGITS.text)| IDENTIFIER ( brackets )? ( COMMA )? -> arrbrackets(index=$IDENTIFIER.text)| arithmetic -> arrbrackets(index=$arithmetic.text))+
			int cnt105=0;
			loop105:
			while (true) {
				int alt105=4;
				switch ( input.LA(1) ) {
				case DIGITS:
					{
					int LA105_2 = input.LA(2);
					if ( (synpred166_CobolGrammar()) ) {
						alt105=1;
					}
					else if ( (synpred170_CobolGrammar()) ) {
						alt105=3;
					}

					}
					break;
				case IDENTIFIER:
					{
					int LA105_3 = input.LA(2);
					if ( (synpred169_CobolGrammar()) ) {
						alt105=2;
					}
					else if ( (synpred170_CobolGrammar()) ) {
						alt105=3;
					}

					}
					break;
				case ADDITION:
				case EQUAL:
				case FORWARDSLASH:
				case HYPHEN:
				case MULTIPLY:
					{
					alt105=3;
					}
					break;
				}
				switch (alt105) {
				case 1 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:20: DIGITS ( COMMA )?
					{
					DIGITS81=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_brackets3326); if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:27: ( COMMA )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==COMMA) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:27: COMMA
							{
							match(input,COMMA,FOLLOW_COMMA_in_brackets3328); if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 346:33: -> arrbrackets(index=$DIGITS.text)
					  {
					  	retval.st = templateLib.getInstanceOf("arrbrackets",new STAttrMap().put("index", (DIGITS81!=null?DIGITS81.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:8: IDENTIFIER ( brackets )? ( COMMA )?
					{
					IDENTIFIER82=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_brackets3348); if (state.failed) return retval;
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:19: ( brackets )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==LPAREN) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:19: brackets
							{
							pushFollow(FOLLOW_brackets_in_brackets3350);
							brackets();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:29: ( COMMA )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==COMMA) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:29: COMMA
							{
							match(input,COMMA,FOLLOW_COMMA_in_brackets3353); if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 347:35: -> arrbrackets(index=$IDENTIFIER.text)
					  {
					  	retval.st = templateLib.getInstanceOf("arrbrackets",new STAttrMap().put("index", (IDENTIFIER82!=null?IDENTIFIER82.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:348:8: arithmetic
					{
					pushFollow(FOLLOW_arithmetic_in_brackets3373);
					arithmetic83=arithmetic();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 348:19: -> arrbrackets(index=$arithmetic.text)
					  {
					  	retval.st = templateLib.getInstanceOf("arrbrackets",new STAttrMap().put("index", (arithmetic83!=null?input.toString(arithmetic83.start,arithmetic83.stop):null)));
					  }


					}

					}
					break;

				default :
					if ( cnt105 >= 1 ) break loop105;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(105, input);
					throw eee;
				}
				cnt105++;
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_brackets3395); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "brackets"

	// $ANTLR start synpred13_CobolGrammar
	public final void synpred13_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:53:12: ( type1 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:53:12: type1
		{
		pushFollow(FOLLOW_type1_in_synpred13_CobolGrammar398);
		type1();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_CobolGrammar

	// $ANTLR start synpred14_CobolGrammar
	public final void synpred14_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:54:6: ( type2 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:54:6: type2
		{
		pushFollow(FOLLOW_type2_in_synpred14_CobolGrammar416);
		type2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred14_CobolGrammar

	// $ANTLR start synpred15_CobolGrammar
	public final void synpred15_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:55:6: ( type3 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:55:6: type3
		{
		pushFollow(FOLLOW_type3_in_synpred15_CobolGrammar434);
		type3();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_CobolGrammar

	// $ANTLR start synpred16_CobolGrammar
	public final void synpred16_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:56:6: ( type4 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:56:6: type4
		{
		pushFollow(FOLLOW_type4_in_synpred16_CobolGrammar452);
		type4();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred16_CobolGrammar

	// $ANTLR start synpred17_CobolGrammar
	public final void synpred17_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:57:6: ( type5 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:57:6: type5
		{
		pushFollow(FOLLOW_type5_in_synpred17_CobolGrammar470);
		type5();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred17_CobolGrammar

	// $ANTLR start synpred18_CobolGrammar
	public final void synpred18_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:58:6: ( type6 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:58:6: type6
		{
		pushFollow(FOLLOW_type6_in_synpred18_CobolGrammar488);
		type6();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred18_CobolGrammar

	// $ANTLR start synpred19_CobolGrammar
	public final void synpred19_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:59:6: ( type7 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:59:6: type7
		{
		pushFollow(FOLLOW_type7_in_synpred19_CobolGrammar506);
		type7();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred19_CobolGrammar

	// $ANTLR start synpred20_CobolGrammar
	public final void synpred20_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:60:6: ( type8 )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:60:6: type8
		{
		pushFollow(FOLLOW_type8_in_synpred20_CobolGrammar524);
		type8();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred20_CobolGrammar

	// $ANTLR start synpred69_CobolGrammar
	public final void synpred69_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:128:16: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:128:16: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred69_CobolGrammar1414); if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_CobolGrammar

	// $ANTLR start synpred71_CobolGrammar
	public final void synpred71_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:138:18: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:138:18: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred71_CobolGrammar1485); if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_CobolGrammar

	// $ANTLR start synpred74_CobolGrammar
	public final void synpred74_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:145:6: ( stmt )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:145:6: stmt
		{
		pushFollow(FOLLOW_stmt_in_synpred74_CobolGrammar1557);
		stmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred74_CobolGrammar

	// $ANTLR start synpred76_CobolGrammar
	public final void synpred76_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:148:5: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:148:5: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred76_CobolGrammar1587); if (state.failed) return;
		}

	}
	// $ANTLR end synpred76_CobolGrammar

	// $ANTLR start synpred77_CobolGrammar
	public final void synpred77_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:32: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:153:32: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred77_CobolGrammar1639); if (state.failed) return;
		}

	}
	// $ANTLR end synpred77_CobolGrammar

	// $ANTLR start synpred78_CobolGrammar
	public final void synpred78_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:39: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:156:39: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred78_CobolGrammar1671); if (state.failed) return;
		}

	}
	// $ANTLR end synpred78_CobolGrammar

	// $ANTLR start synpred79_CobolGrammar
	public final void synpred79_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:163:6: ( ident )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:163:6: ident
		{
		pushFollow(FOLLOW_ident_in_synpred79_CobolGrammar1703);
		ident();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred79_CobolGrammar

	// $ANTLR start synpred81_CobolGrammar
	public final void synpred81_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:164:43: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:164:43: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred81_CobolGrammar1719); if (state.failed) return;
		}

	}
	// $ANTLR end synpred81_CobolGrammar

	// $ANTLR start synpred84_CobolGrammar
	public final void synpred84_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:31: ( IDENTIFIER ( brackets )? )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:31: IDENTIFIER ( brackets )?
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred84_CobolGrammar1769); if (state.failed) return;
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:42: ( brackets )?
		int alt106=2;
		int LA106_0 = input.LA(1);
		if ( (LA106_0==LPAREN) ) {
			alt106=1;
		}
		switch (alt106) {
			case 1 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:42: brackets
				{
				pushFollow(FOLLOW_brackets_in_synpred84_CobolGrammar1771);
				brackets();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred84_CobolGrammar

	// $ANTLR start synpred85_CobolGrammar
	public final void synpred85_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:81: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:173:81: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred85_CobolGrammar1777); if (state.failed) return;
		}

	}
	// $ANTLR end synpred85_CobolGrammar

	// $ANTLR start synpred86_CobolGrammar
	public final void synpred86_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:181:11: ( symbolic )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:181:11: symbolic
		{
		pushFollow(FOLLOW_symbolic_in_synpred86_CobolGrammar1816);
		symbolic();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred86_CobolGrammar

	// $ANTLR start synpred87_CobolGrammar
	public final void synpred87_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:182:5: ( arith )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:182:5: arith
		{
		pushFollow(FOLLOW_arith_in_synpred87_CobolGrammar1825);
		arith();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred87_CobolGrammar

	// $ANTLR start synpred88_CobolGrammar
	public final void synpred88_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:183:7: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:183:7: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred88_CobolGrammar1836); if (state.failed) return;
		}

	}
	// $ANTLR end synpred88_CobolGrammar

	// $ANTLR start synpred91_CobolGrammar
	public final void synpred91_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:56: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:188:56: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred91_CobolGrammar1875); if (state.failed) return;
		}

	}
	// $ANTLR end synpred91_CobolGrammar

	// $ANTLR start synpred95_CobolGrammar
	public final void synpred95_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:66: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:196:66: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred95_CobolGrammar1954); if (state.failed) return;
		}

	}
	// $ANTLR end synpred95_CobolGrammar

	// $ANTLR start synpred96_CobolGrammar
	public final void synpred96_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:46: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:199:46: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred96_CobolGrammar1985); if (state.failed) return;
		}

	}
	// $ANTLR end synpred96_CobolGrammar

	// $ANTLR start synpred98_CobolGrammar
	public final void synpred98_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:14: ( IDENTIFIER ( brackets )? )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:14: IDENTIFIER ( brackets )?
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred98_CobolGrammar2013); if (state.failed) return;
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:25: ( brackets )?
		int alt107=2;
		int LA107_0 = input.LA(1);
		if ( (LA107_0==LPAREN) ) {
			alt107=1;
		}
		switch (alt107) {
			case 1 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:25: brackets
				{
				pushFollow(FOLLOW_brackets_in_synpred98_CobolGrammar2015);
				brackets();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred98_CobolGrammar

	// $ANTLR start synpred99_CobolGrammar
	public final void synpred99_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:67: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:205:67: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred99_CobolGrammar2023); if (state.failed) return;
		}

	}
	// $ANTLR end synpred99_CobolGrammar

	// $ANTLR start synpred100_CobolGrammar
	public final void synpred100_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:21: ( COMMA )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:212:21: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred100_CobolGrammar2054); if (state.failed) return;
		}

	}
	// $ANTLR end synpred100_CobolGrammar

	// $ANTLR start synpred107_CobolGrammar
	public final void synpred107_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:219:14: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:219:14: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred107_CobolGrammar2123); if (state.failed) return;
		}

	}
	// $ANTLR end synpred107_CobolGrammar

	// $ANTLR start synpred127_CobolGrammar
	public final void synpred127_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:235:17: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:235:17: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred127_CobolGrammar2285); if (state.failed) return;
		}

	}
	// $ANTLR end synpred127_CobolGrammar

	// $ANTLR start synpred131_CobolGrammar
	public final void synpred131_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:250:4: ( DOT )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:250:4: DOT
		{
		match(input,DOT,FOLLOW_DOT_in_synpred131_CobolGrammar2360); if (state.failed) return;
		}

	}
	// $ANTLR end synpred131_CobolGrammar

	// $ANTLR start synpred166_CobolGrammar
	public final void synpred166_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:20: ( DIGITS ( COMMA )? )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:20: DIGITS ( COMMA )?
		{
		match(input,DIGITS,FOLLOW_DIGITS_in_synpred166_CobolGrammar3326); if (state.failed) return;
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:27: ( COMMA )?
		int alt113=2;
		int LA113_0 = input.LA(1);
		if ( (LA113_0==COMMA) ) {
			alt113=1;
		}
		switch (alt113) {
			case 1 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:346:27: COMMA
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred166_CobolGrammar3328); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred166_CobolGrammar

	// $ANTLR start synpred169_CobolGrammar
	public final void synpred169_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:8: ( IDENTIFIER ( brackets )? ( COMMA )? )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:8: IDENTIFIER ( brackets )? ( COMMA )?
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred169_CobolGrammar3348); if (state.failed) return;
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:19: ( brackets )?
		int alt114=2;
		int LA114_0 = input.LA(1);
		if ( (LA114_0==LPAREN) ) {
			alt114=1;
		}
		switch (alt114) {
			case 1 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:19: brackets
				{
				pushFollow(FOLLOW_brackets_in_synpred169_CobolGrammar3350);
				brackets();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:29: ( COMMA )?
		int alt115=2;
		int LA115_0 = input.LA(1);
		if ( (LA115_0==COMMA) ) {
			alt115=1;
		}
		switch (alt115) {
			case 1 :
				// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:347:29: COMMA
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred169_CobolGrammar3353); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred169_CobolGrammar

	// $ANTLR start synpred170_CobolGrammar
	public final void synpred170_CobolGrammar_fragment() throws RecognitionException {
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:348:8: ( arithmetic )
		// C:\\Users\\works\\workspace\\Cobol2Java--Version 6.0\\src\\translator\\CobolGrammar.g:348:8: arithmetic
		{
		pushFollow(FOLLOW_arithmetic_in_synpred170_CobolGrammar3373);
		arithmetic();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred170_CobolGrammar

	// Delegated rules

	public final boolean synpred107_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred107_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred84_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred84_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred95_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred95_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred131_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred131_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred100_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred100_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred166_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred166_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred91_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred91_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred99_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred88_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred88_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred74_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred74_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred98_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred98_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred76_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred76_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred78_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred78_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred169_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred169_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred170_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred170_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred96_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred96_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred85_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred85_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_CobolGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred86_CobolGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_identificationDivision_in_code58 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_environmentDivision_in_code65 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_dataDivision_in_code73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_procedureDivision_in_code80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFICATION_in_identificationDivision116 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_DIVISION_in_identificationDivision118 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_DOT_in_identificationDivision120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_PROGRAMID_in_identificationDivision131 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_identificationDivision133 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identificationDivision139 = new BitSet(new long[]{0x0000000004000800L});
	public static final BitSet FOLLOW_DOT_in_identificationDivision141 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_AUTHOR_in_identificationDivision151 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_identificationDivision153 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identificationDivision159 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_identificationDivision161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENVIRONMENT_in_environmentDivision197 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_DIVISION_in_environmentDivision199 = new BitSet(new long[]{0x0000000004080000L});
	public static final BitSet FOLLOW_DOT_in_environmentDivision201 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CONFIGURATION_in_environmentDivision212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SECTION_in_environmentDivision214 = new BitSet(new long[]{0x0000000004000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_environmentDivision216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SOURCECOMP_in_environmentDivision226 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_environmentDivision228 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_environmentDivision233 = new BitSet(new long[]{0x0004000004000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_environmentDivision239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_OBJECTCOMP_in_environmentDivision249 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_environmentDivision251 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_environmentDivision256 = new BitSet(new long[]{0x0004000004000002L});
	public static final BitSet FOLLOW_DOT_in_environmentDivision262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATA_in_dataDivision296 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_DIVISION_in_dataDivision298 = new BitSet(new long[]{0x0000000004000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_DOT_in_dataDivision300 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_WORKINGSTORAGE_in_dataDivision305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SECTION_in_dataDivision307 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_DOT_in_dataDivision309 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_EXEC_in_dataDivision314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_SQL_in_dataDivision317 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_INCLUDE_in_dataDivision320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_SQLCA_in_dataDivision322 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_HASH_in_dataDivision333 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ENDEXEC_in_dataDivision335 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000003FFFFFFFFFL});
	public static final BitSet FOLLOW_EXEC_in_dataDivision340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_SQL_in_dataDivision343 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BEGIN_in_dataDivision346 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DECLARE_in_dataDivision348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SECTION_in_dataDivision350 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_HASH_in_dataDivision353 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ENDEXEC_in_dataDivision355 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000003FFFFFFFFFL});
	public static final BitSet FOLLOW_variable_in_dataDivision361 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_type1_in_variable398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type2_in_variable416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type3_in_variable434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type4_in_variable452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type5_in_variable470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type6_in_variable488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type7_in_variable506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type8_in_variable524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type9_in_variable542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type1571 = new BitSet(new long[]{0x0004010004000000L});
	public static final BitSet FOLLOW_FILLER_in_type1573 = new BitSet(new long[]{0x0004000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type1580 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type2601 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type2603 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type2610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type2613 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_X_in_type2615 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_type2617 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type3637 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type3639 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type3649 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_X_in_type3651 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_type3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VALUE_in_type3655 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_type3661 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type3663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type4687 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type4689 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type4696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type4699 = new BitSet(new long[]{0x2000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_S9_in_type4702 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_NINE_in_type4704 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_type4707 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type4709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type7727 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type7729 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type7736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type7739 = new BitSet(new long[]{0x2000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_S9_in_type7742 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_NINE_in_type7744 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_type7747 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COMP3_in_type7749 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type7751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type5770 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type5772 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type5779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type5782 = new BitSet(new long[]{0x2000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_S9_in_type5785 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_NINE_in_type5787 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_type5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VALUE_in_type5792 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_type5798 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type6824 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type6826 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type6833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type6836 = new BitSet(new long[]{0x2000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_S9_in_type6839 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_NINE_in_type6841 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_type6844 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COMP3_in_type6846 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VALUE_in_type6848 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_type6854 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type6856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type8881 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FILLER_in_type8883 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type8890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_REDEFINES_in_type8893 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type8899 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_type8901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_type9925 = new BitSet(new long[]{0x0004010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FILLER_in_type9927 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type9934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PIC_in_type9937 = new BitSet(new long[]{0x2001000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_S9_in_type9940 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_NINE_in_type9942 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_HYPHEN_in_type9944 = new BitSet(new long[]{0x2001000000000000L});
	public static final BitSet FOLLOW_NINE_in_type9947 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_type9951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_procedureDivision988 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_DIVISION_in_procedureDivision990 = new BitSet(new long[]{0x0004000004000000L});
	public static final BitSet FOLLOW_DOT_in_procedureDivision992 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_section_in_procedureDivision998 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_section1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SECTION_in_section1033 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_section1035 = new BitSet(new long[]{0x082C003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_IDENTIFIER_in_section1039 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_section1041 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_section1047 = new BitSet(new long[]{0x082C003800844030L,0x0000000000500020L});
	public static final BitSet FOLLOW_IDENTIFIER_in_section1056 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_section1058 = new BitSet(new long[]{0x0000002000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_EXIT_in_section1064 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STOP_in_section1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RUN_in_section1068 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_section1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_performStmt_in_stmt1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addStmt_in_stmt1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subStmt_in_stmt1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayStmt_in_stmt1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_stmt1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveStmt_in_stmt1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_acceptStmt_in_stmt1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_computeStmt_in_stmt1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initializeStmt_in_stmt1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlStmt_in_stmt1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_stmt1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_evalStmt_in_stmt1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_performuntilStmt_in_stmt1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_performvaryingStmt_in_stmt1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_performexitStmt_in_stmt1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_performwithStmt_in_stmt1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERFORM_in_performuntilStmt1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_UNTIL_in_performuntilStmt1393 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_condition_in_performuntilStmt1395 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_performuntilStmt1402 = new BitSet(new long[]{0x0828003900844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_ENDPERFORM_in_performuntilStmt1412 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_performuntilStmt1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERFORM_in_performwithStmt1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_WITH_in_performwithStmt1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_TEST_in_performwithStmt1456 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AFTER_in_performwithStmt1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_UNTIL_in_performwithStmt1460 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_condition_in_performwithStmt1462 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_performwithStmt1471 = new BitSet(new long[]{0x0828003900844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_ENDPERFORM_in_performwithStmt1483 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_performwithStmt1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERFORM_in_performvaryingStmt1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_VARYING_in_performvaryingStmt1521 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_performvaryingStmt1525 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_FROM_in_performvaryingStmt1527 = new BitSet(new long[]{0x0004000000400000L});
	public static final BitSet FOLLOW_DIGITS_in_performvaryingStmt1532 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_performvaryingStmt1534 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_BY_in_performvaryingStmt1537 = new BitSet(new long[]{0x0004000000400000L});
	public static final BitSet FOLLOW_DIGITS_in_performvaryingStmt1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_performvaryingStmt1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_UNTIL_in_performvaryingStmt1548 = new BitSet(new long[]{0x200508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_booleanexp_in_performvaryingStmt1550 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_performvaryingStmt1557 = new BitSet(new long[]{0x0828003900844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_EXIT_in_performvaryingStmt1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERFORM_in_performvaryingStmt1570 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ENDPERFORM_in_performvaryingStmt1580 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_performvaryingStmt1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXIT_in_performexitStmt1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERFORM_in_performexitStmt1637 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_performexitStmt1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERFORM_in_performStmt1663 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_performStmt1669 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_performStmt1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISPLAY_in_displayStmt1696 = new BitSet(new long[]{0x0004000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_ident_in_displayStmt1703 = new BitSet(new long[]{0x0004000004000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_STRING_in_displayStmt1713 = new BitSet(new long[]{0x0004000004000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_DOT_in_displayStmt1719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_in_moveStmt1758 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_moveStmt1761 = new BitSet(new long[]{0x0400000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_brackets_in_moveStmt1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_TO_in_moveStmt1766 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_moveStmt1769 = new BitSet(new long[]{0x0404000004000002L});
	public static final BitSet FOLLOW_brackets_in_moveStmt1771 = new BitSet(new long[]{0x0004000004000002L});
	public static final BitSet FOLLOW_DOT_in_moveStmt1777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMPUTE_in_computeStmt1813 = new BitSet(new long[]{0x30050A8400400040L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_computeStmt1816 = new BitSet(new long[]{0x30050A8404400042L,0x0000002000200000L});
	public static final BitSet FOLLOW_arith_in_computeStmt1825 = new BitSet(new long[]{0x30050A8404400042L,0x0000002000200000L});
	public static final BitSet FOLLOW_DOT_in_computeStmt1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_addStmt1857 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_addStmt1861 = new BitSet(new long[]{0x0400000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_brackets_in_addStmt1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_TO_in_addStmt1866 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_addStmt1870 = new BitSet(new long[]{0x0400000004000002L});
	public static final BitSet FOLLOW_brackets_in_addStmt1872 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_addStmt1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_subStmt1899 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_subStmt1903 = new BitSet(new long[]{0x0400040000000000L});
	public static final BitSet FOLLOW_brackets_in_subStmt1905 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_FROM_in_subStmt1908 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_subStmt1912 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_brackets_in_subStmt1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCEPT_in_acceptStmt1939 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_acceptStmt1945 = new BitSet(new long[]{0x0400040000000000L});
	public static final BitSet FOLLOW_brackets_in_acceptStmt1947 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_FROM_in_acceptStmt1950 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ARGUMENTVALUE_in_acceptStmt1952 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_acceptStmt1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_callStmt1973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_STRING_in_callStmt1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_USING_in_callStmt1977 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_callStmt1983 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_callStmt1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INITIALIZE_in_initializeStmt2010 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_initializeStmt2013 = new BitSet(new long[]{0x0404000004000002L});
	public static final BitSet FOLLOW_brackets_in_initializeStmt2015 = new BitSet(new long[]{0x0004000004000002L});
	public static final BitSet FOLLOW_DOT_in_initializeStmt2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXEC_in_sqlStmt2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_SQL_in_sqlStmt2047 = new BitSet(new long[]{0x64C496040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_hostvar_in_sqlStmt2052 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_COMMA_in_sqlStmt2054 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_IDENTIFIER_in_sqlStmt2065 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_sqlwords_in_sqlStmt2076 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_DOT_in_sqlStmt2088 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_DIGITS_in_sqlStmt2098 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_NINE_in_sqlStmt2108 = new BitSet(new long[]{0x64C4D6040461A200L,0x0000000200108820L});
	public static final BitSet FOLLOW_HASH_in_sqlStmt2119 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ENDEXEC_in_sqlStmt2121 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_sqlStmt2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_sqlwords2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STOP_in_sqlwords2155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_sqlwords2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERFORM_in_sqlwords2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_sqlwords2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_sqlwords2170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_sqlwords2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_sqlwords2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_sqlwords2186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BY_in_sqlwords2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_sqlwords2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORWARDSLASH_in_sqlwords2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_sqlwords2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_in_sqlwords2211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_sqlwords2215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_sqlwords2220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLEQUOTES_in_sqlwords2228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_sqlwords2232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVALUATE_in_evalStmt2260 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_condition_in_evalStmt2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_WHEN_in_evalStmt2270 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_condition_in_evalStmt2272 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_evalStmt2274 = new BitSet(new long[]{0x0828003820844030L,0x0000000100400020L});
	public static final BitSet FOLLOW_ENDEVALUATE_in_evalStmt2283 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_evalStmt2285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt2327 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_condition_in_ifStmt2329 = new BitSet(new long[]{0x0828003888844030L,0x0000000001400020L});
	public static final BitSet FOLLOW_THEN_in_ifStmt2331 = new BitSet(new long[]{0x0828003888844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_ifStmt2338 = new BitSet(new long[]{0x0828003888844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_elseStmt_in_ifStmt2348 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ENDIF_in_ifStmt2355 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_DOT_in_ifStmt2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_elseifStmt2401 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_IF_in_elseifStmt2403 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_condition_in_elseifStmt2405 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_THEN_in_elseifStmt2407 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_elseifStmt2411 = new BitSet(new long[]{0x0828003804844032L,0x0000000000400020L});
	public static final BitSet FOLLOW_DOT_in_elseifStmt2421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_elseStmt2454 = new BitSet(new long[]{0x0828003800844030L,0x0000000000400020L});
	public static final BitSet FOLLOW_stmt_in_elseStmt2458 = new BitSet(new long[]{0x0828003800844032L,0x0000000000400020L});
	public static final BitSet FOLLOW_andexpression_in_condition2490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orexpression_in_andexpression2529 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_AND_in_andexpression2539 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_orexpression_in_andexpression2543 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_notexpression_in_orexpression2589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_OR_in_orexpression2599 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_notexpression_in_orexpression2603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_NOT_in_notexpression2634 = new BitSet(new long[]{0x240508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_term_in_notexpression2638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_notexpression2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanexp_in_term2695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_term2714 = new BitSet(new long[]{0x640508C000400000L,0x0000002004200003L});
	public static final BitSet FOLLOW_andexpression_in_term2718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPAREN_in_term2720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolic_in_booleanexp2747 = new BitSet(new long[]{0xC580300402000000L});
	public static final BitSet FOLLOW_brackets_in_booleanexp2749 = new BitSet(new long[]{0xC180300402000000L});
	public static final BitSet FOLLOW_compare_in_booleanexp2752 = new BitSet(new long[]{0x2005088000400000L,0x0000002000200000L});
	public static final BitSet FOLLOW_symbolic_in_booleanexp2756 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_brackets_in_booleanexp2758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_booleanexp2786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_booleanexp2803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTTRUE_in_booleanexp2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTFALSE_in_booleanexp2837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTEQUAL_in_compare2858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_compare2873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_compare2888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_compare2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATERTHANEQUAL_in_compare2918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSERTHANEQUAL_in_compare2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DON_in_compare2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_compare2963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIGURATIVE_in_symbolic2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_symbolic3001 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_DIGITS_in_symbolic3004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NINE_in_symbolic3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_symbolic3039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_symbolic3057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_X_in_symbolic3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_STRING_in_symbolic3077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_symbolic3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_NUMVAL_in_symbolic3096 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_symbolic3098 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_symbolic3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPAREN_in_symbolic3102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_arithmetic3128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_in_arithmetic3137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_arithmetic3146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADDITION_in_arith3164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_arith3183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_arith3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORWARDSLASH_in_arith3221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_arith3240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOSTVARIABLES_in_hostvar3268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_ident3284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier3302 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_brackets_in_identifier3304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_brackets3323 = new BitSet(new long[]{0x1005020400400040L});
	public static final BitSet FOLLOW_DIGITS_in_brackets3326 = new BitSet(new long[]{0x1005020400410040L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_brackets3328 = new BitSet(new long[]{0x1005020400400040L,0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_brackets3348 = new BitSet(new long[]{0x1405020400410040L,0x0000000000000800L});
	public static final BitSet FOLLOW_brackets_in_brackets3350 = new BitSet(new long[]{0x1005020400410040L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_brackets3353 = new BitSet(new long[]{0x1005020400400040L,0x0000000000000800L});
	public static final BitSet FOLLOW_arithmetic_in_brackets3373 = new BitSet(new long[]{0x1005020400400040L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPAREN_in_brackets3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type1_in_synpred13_CobolGrammar398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type2_in_synpred14_CobolGrammar416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type3_in_synpred15_CobolGrammar434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type4_in_synpred16_CobolGrammar452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type5_in_synpred17_CobolGrammar470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type6_in_synpred18_CobolGrammar488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type7_in_synpred19_CobolGrammar506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type8_in_synpred20_CobolGrammar524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred69_CobolGrammar1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred71_CobolGrammar1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmt_in_synpred74_CobolGrammar1557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred76_CobolGrammar1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred77_CobolGrammar1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred78_CobolGrammar1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_synpred79_CobolGrammar1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred81_CobolGrammar1719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred84_CobolGrammar1769 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_brackets_in_synpred84_CobolGrammar1771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred85_CobolGrammar1777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolic_in_synpred86_CobolGrammar1816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_in_synpred87_CobolGrammar1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred88_CobolGrammar1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred91_CobolGrammar1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred95_CobolGrammar1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred96_CobolGrammar1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred98_CobolGrammar2013 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_brackets_in_synpred98_CobolGrammar2015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred99_CobolGrammar2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred100_CobolGrammar2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred107_CobolGrammar2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred127_CobolGrammar2285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred131_CobolGrammar2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_synpred166_CobolGrammar3326 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_COMMA_in_synpred166_CobolGrammar3328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred169_CobolGrammar3348 = new BitSet(new long[]{0x0400000000010002L});
	public static final BitSet FOLLOW_brackets_in_synpred169_CobolGrammar3350 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_COMMA_in_synpred169_CobolGrammar3353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_synpred170_CobolGrammar3373 = new BitSet(new long[]{0x0000000000000002L});
}

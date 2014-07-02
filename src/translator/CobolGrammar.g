grammar CobolGrammar;

options {
  language = Java;
  backtrack = true;
  output = template;
}

@header {

	package translator;
}	

@lexer::header {package translator;}

code:  identificationDivision
 	   environmentDivision 
 	   dataDivision
 	   procedureDivision
 	   -> code(id={$identificationDivision.st},env={$environmentDivision.st},data = {$dataDivision.st},pro={$procedureDivision.st});

identificationDivision : IDENTIFICATION DIVISION DOT? 
						 PROGRAMID DOT id1 = IDENTIFIER DOT?
						 AUTHOR DOT id2 = IDENTIFIER DOT? 
						 -> idDivision(pid={$id1.text},auth={$id2.text});

environmentDivision 
@init {
      List srcComp = new ArrayList();
      List objComp = new ArrayList();
}
: ENVIRONMENT DIVISION DOT?
 					  CONFIGURATION SECTION DOT?
					  SOURCECOMP DOT (id1=IDENTIFIER {srcComp.add($id1.text);})+ DOT?
					  OBJECTCOMP DOT (id2=IDENTIFIER {objComp.add($id2.text);})+ DOT? 
						 -> envDivision(src={srcComp},obj={objComp});

dataDivision
@init{
	List var = new ArrayList();
}
: DATA DIVISION DOT?
  WORKINGSTORAGE SECTION DOT?
  EXEC  SQL  INCLUDE SQLCA          HASH ENDEXEC.
  EXEC  SQL  BEGIN DECLARE SECTION  HASH ENDEXEC.
  (variable {var.add($variable.st);})+
  -> dataDivision(vari={var})
  ;
  
  
  
  
variable : type1 -> var(id = {$type1.st})
		  |type2 -> var(id = {$type2.st})
		  |type3 -> var(id = {$type3.st})
		  |type4 -> var(id = {$type4.st})
		  |type5 -> var(id = {$type5.st})
		  |type6 -> var(id = {$type6.st})
		  |type7 -> var(id = {$type7.st})
		  |type8 -> var(id = {$type8.st})
		  |type9 -> var(id = {$type9.st})
		  ;	





type1 : DIGITS FILLER? id1 = IDENTIFIER? DOT -> data1(id = {$id1.text});
type2 : DIGITS FILLER? id2 = IDENTIFIER? PIC X brackets DOT -> empStr(id = {$id2.text});
type3 : DIGITS FILLER? id3 = IDENTIFIER? PIC X brackets VALUE s1 = symbolic DOT -> str(id = {$id3.text},val = {$s1.st});
type4 : DIGITS FILLER? id4 = IDENTIFIER? PIC (S9|NINE) brackets DOT -> empdouble(id = {$id4.text});
type7 : DIGITS FILLER? id7 = IDENTIFIER? PIC (S9|NINE) brackets COMP3 DOT  -> empdouble(id = {$id7.text});
type5 : DIGITS FILLER? id5 = IDENTIFIER? PIC (S9|NINE) brackets VALUE s2 = symbolic DOT -> double(id = {$id5.text},val = {$s2.st});
type6 : DIGITS FILLER? id6 = IDENTIFIER? PIC (S9|NINE) brackets COMP3 VALUE s3 = symbolic DOT  -> double(id = {$id6.text},val = {$s3.st});
type8 : DIGITS FILLER? id81 = IDENTIFIER? REDEFINES id82 = IDENTIFIER DOT?-> redef(id1 = {$id81.text},id2 = {$id82.text});
type9 : DIGITS FILLER? id9 = IDENTIFIER? PIC (S9|NINE|HYPHEN+ NINE)  DOT  -> empdouble(id = {$id9.text});


 		   

procedureDivision 
@init {
      List sections = new ArrayList();
}
:   PROCEDURE DIVISION DOT?	
	(section {sections.add($section.st);})+			
	-> proDivision(sec={sections});


section
@init {
      List stmts = new ArrayList();
}
:	id=IDENTIFIER SECTION DOT
	(IDENTIFIER DOT)?
	(stmt {stmts.add($stmt.st);})+ 
	(IDENTIFIER DOT)?
	(EXIT|STOP RUN) DOT -> section(id={$id.text},sta = {stmts});
	
stmt : performStmt ->stat(id= {$performStmt.st})
	  | addStmt	  ->	stat(st= {$addStmt.st})  
	  | subStmt	  -> 	stat(st= {$subStmt.st})
	  | displayStmt -> stat(id={$displayStmt.st})	
	  | ifStmt -> stat(id={$ifStmt.st})
	  | moveStmt -> stat(id={$moveStmt.st})
	  | acceptStmt -> stat(id={$acceptStmt.st})
	  | computeStmt	  ->	stat(st= {$computeStmt.st})  	  
	  | initializeStmt -> stat(id={$initializeStmt.st})
	  | sqlStmt  -> stat(id={$sqlStmt.st})
	  | callStmt -> stat(id={$callStmt.st})
	  | evalStmt  -> stat(id={$evalStmt.st})
	  | performuntilStmt -> stat(id={$performuntilStmt.st})
	  | performvaryingStmt -> stat(id={$performvaryingStmt.st})
	  | performexitStmt  -> stat(id={$performexitStmt.st})
	  | performwithStmt  -> stat(id={$performwithStmt.st})
	  ;




 
performuntilStmt
@init {
      List stmts = new ArrayList();
} 
		: PERFORM UNTIL condition
		  (stmt {stmts.add($stmt.st);})+
		  ENDPERFORM DOT? 
		  -> performUntilStmt(id={$condition.st},stm={stmts})	
		;

performwithStmt 
@init {
      List stmts = new ArrayList();
}
	: PERFORM WITH TEST AFTER UNTIL condition
      (stmt {stmts.add($stmt.st);})+
      ENDPERFORM DOT?-> performUntilStmt(id={$condition.st},stm={stmts})	;
    
performvaryingStmt
@init {
      List stmts = new ArrayList();
} 
		: PERFORM VARYING i1=IDENTIFIER FROM d1=(DIGITS|IDENTIFIER) BY d2=(DIGITS|IDENTIFIER)  UNTIL booleanexp
		  (stmt {stmts.add($stmt.st);})+
		  (EXIT PERFORM 
		   | ENDPERFORM)
		  DOT? 
		  -> performUntilStmt(id={$i1.text},cond={$booleanexp.st},
		  dig1={$d1.text},dig2={$d2.text},stm={stmts})	
		;

performexitStmt : EXIT PERFORM DOT? -> performexitStmt(id={"break();"})	
		;
		
performStmt : PERFORM id = IDENTIFIER DOT? -> performStmt(id={$id.text});

displayStmt
@init {
      List litId  = new ArrayList();
}
		: DISPLAY
		  (ident {litId.add($ident.st);}
		  | STRING {litId.add($STRING.text);})+ DOT?
		   -> displayStmt(lit = {litId}) 
		;
		
		
moveStmt
@init {
      List to = new ArrayList();
}:
	MOVE  symbolic brackets? TO (IDENTIFIER brackets?{to.add($IDENTIFIER.text);})+ DOT? 
	-> moveStmt(from= {$symbolic.st} , to = {to});


computeStmt
@init {
      List ids = new ArrayList();
}: 
	COMPUTE (symbolic  {ids.add($symbolic.st);}
			|arith {ids.add($arith.st);} 
			)+ DOT? -> initializeStmt(id={ids});



addStmt
	:	ADD t=symbolic brackets? TO t2=IDENTIFIER brackets?	DOT?-> addStmt(left={$t.st},right={$t2.text})
	;

subStmt
	:	SUB t=symbolic brackets? FROM t2=IDENTIFIER brackets?	-> subStmt(left={$t.text},right={$t2.text})
	;


acceptStmt : ACCEPT id = IDENTIFIER brackets? FROM ARGUMENTVALUE DOT? -> acceptStmt(id={$id.text});


callStmt : CALL STRING USING id = IDENTIFIER DOT? -> acceptStmt(id={$id.text});

initializeStmt 
@init {
      List ids = new ArrayList();
}: 
	INITIALIZE (IDENTIFIER brackets?  {ids.add($IDENTIFIER.text);})+ DOT? -> initializeStmt(id={ids});


sqlStmt
@init{
	List id = new ArrayList();
}:
EXEC SQL  ( hostvar COMMA? {id.add($hostvar.st);}
		  | IDENTIFIER  {id.add($IDENTIFIER.text);}
		  | sqlwords {id.add($sqlwords.st);}
		  | d=DOT {id.add($d.text);}
		  | DIGITS {id.add($DIGITS.text);}
		  | NINE {id.add($NINE.text);}
		  )+
HASH ENDEXEC DOT? 
-> sqlStmt(qr = {id}) 
; 

sqlwords : id= (INSERT | STOP | WHERE |PERFORM | COMMA | EQUAL | FROM | AND
				| LPAREN | BY 
				| RPAREN | FORWARDSLASH | COLON | DECLARE | LESSER  | GREATER
				| SINGLEQUOTES | NOT ) ->  onlyid(v={$id.text});


evalStmt
@init {
      List litId  = new ArrayList();
}
		: EVALUATE condition 
		  (WHEN condition stmt+)+
		  ENDEVALUATE DOT?
		  -> onlyid(lit = {litId}) 
		;
		
		
		
ifStmt
@init {
      List stmts  = new ArrayList();
      List elseif = new ArrayList();
      List elses =  new ArrayList();
}
	: IF condition THEN?
	  (stmt {stmts.add($stmt.st);})*
	  (elseStmt {elses.add($elseStmt.st);})?  ENDIF
	  DOT?-> ifexp(cond={$condition.st},stm = {stmts},elif = {elseif},elsess ={elses})
	;

elseifStmt
@init {
      List stmts  = new ArrayList();
}
	:ELSE IF condition THEN
	(stmt {stmts.add($stmt.st);} )+
	  DOT? -> elseifexp(cond={$condition.st},stm = {stmts})
	;
	
elseStmt
@init {
      List stmts  = new ArrayList();
} :
	ELSE
	(stmt {stmts.add($stmt.st);} )+
	-> elseexp(stm = {stmts})
	;
			

condition : (andexpression   -> onlyid(v={$andexpression.st})) 
		    ;
andexpression  
@init {
      List orexps = new ArrayList();
}
	: ( o1=orexpression {orexps.add($o1.st);}) 
	  (AND o2=orexpression {orexps.add($o2.st);})*
	  -> andexp(exps={orexps})
	  ;
	  

orexpression  
@init {
      List notexps = new ArrayList();
}
	:
	  (n1=notexpression {notexps.add($n1.st);}) 
	  (OR n2=notexpression {notexps.add($n2.st);})*
	  -> orexp(exps={notexps})
	  ;
	  
notexpression : NOT t=term -> notexp(exp = {$t.st}) 
				  | t=term   ->  exp(exp = {$t.st})
				  ;

term : t = booleanexp ->  exp(exp = {$t.st})
	  | LPAREN t=andexpression RPAREN ->  bracketexp(exp = {$t.st})
	  ;

booleanexp : (t=symbolic brackets? compare t2=symbolic brackets?   -> boolexp(exp1={$t.st},comp={$compare.st},exp2={$t2.st})
			 | TRUE -> onlyid(v={$TRUE.text})
			 | FALSE -> onlyid(v={$FALSE.text})
			 | NOTTRUE -> onlyid(v={$NOTTRUE.text})
			 | NOTFALSE -> onlyid(v={$NOTFALSE.text}))
		;

compare : NOTEQUAL -> comp(id={"!="})
		| GREATER -> comp(id={$GREATER.text})
		| LESSER	-> comp(id={$LESSER.text})
		| EQUAL -> comp(id={"=="})
		| GREATERTHANEQUAL -> comp(id={">="})
		| LESSERTHANEQUAL -> comp(id={"<="})
		| DON -> comp(id={" <> "})
		| NOT -> comp(id={$NOT.text})
		;

symbolic : FIGURATIVE -> sym(id = {$FIGURATIVE.text})
		 | HYPHEN? DIGITS -> sym(id= {$DIGITS.text}) 
		 | NINE -> sym(id= {$NINE.text})
		 | STRING -> sym(id= {$STRING.text}) 
		 | IDENTIFIER -> sym(id= {$IDENTIFIER.text})	
		 | X STRING -> sym(id= {$STRING.text})
		 | FUNCTION NUMVAL LPAREN IDENTIFIER RPAREN -> parseint(str =  {$IDENTIFIER.text}) 
		 ;

arithmetic : (IDENTIFIER 
			  |arith 
			  |DIGITS 
			  ); 

arith :( ADDITION -> onlyid(v={$ADDITION.text}) 
	    | HYPHEN  -> onlyid(v={$HYPHEN.text})
	    | MULTIPLY  -> onlyid(v={$MULTIPLY.text})
	    | FORWARDSLASH  -> onlyid(v={$FORWARDSLASH.text})
	    | EQUAL  -> onlyid(v={$EQUAL.text})
	    );		 

hostvar : HOSTVARIABLES -> hostvar(id={$HOSTVARIABLES.text});
ident : IDENTIFIER -> identi(id={$IDENTIFIER.text});


identifier : IDENTIFIER brackets   -> onlyid(v={$IDENTIFIER.text});

brackets : LPAREN (DIGITS COMMA?-> arrbrackets(index = {$DIGITS.text})
		   | IDENTIFIER brackets? COMMA?-> arrbrackets(index = {$IDENTIFIER.text})
		   | arithmetic -> arrbrackets(index = {$arithmetic.text})
		   )+  RPAREN ;

WS	:	(' ' | '\t' | '\n' | '\r')+ {$channel = HIDDEN;};



IDENTIFICATION : 'IDENTIFICATION';
ENVIRONMENT : 'ENVIRONMENT' ;
DATA : 'DATA';
PROCEDURE : 'PROCEDURE' ;
DIVISION : 'DIVISION';
INCLUDE : 'INCLUDE';
DECLARE : 'DECLARE';
WORKINGSTORAGE : 'WORKING-STORAGE';
COMPUTE : 'COMPUTE';
CONFIGURATION : 'CONFIGURATION';
SECTION : 'SECTION';
OBJECTCOMP : 'OBJECT-COMPUTER';
SOURCECOMP : 'SOURCE-COMPUTER';
VARYING : 'VARYING';
DOT : '.';
NOTEQUAL : 'NOT =';
ACCEPT : 'ACCEPT';
ARGUMENTVALUE : 'ARGUMENT-VALUE';
BY : 'BY';
PROGRAMID : 'PROGRAM-ID';
AUTHOR : 'AUTHOR';
HYPHEN : '-';
REDEFINES : 'REDEFINES';
EXIT : 'EXIT';
STOP : 'STOP';
RUN :  'RUN';
EVALUATE : 'EVALUATE';
WHEN : 'WHEN';
WITH : 'WITH'; 
TEST : 'TEST';
AFTER : 'AFTER';
TRUE : 'TRUE';
FALSE : 'FALSE';
NOTTRUE : 'NOT TRUE';
SINGLEQUOTES : '\'';
ADDITION : '+';
MULTIPLY : '*';
NOTFALSE : 'NOT FALSE';
ENDEVALUATE : 'END-EVALUATE';
UNTIL : 'UNTIL';
PERFORM : 'PERFORM';
BEGIN : 'BEGIN';
FILLER : 'FILLER';
SQLCA : 'SQLCA';
FUNCTION : 'FUNCTION';
NUMVAL : 'NUMVAL';
DISPLAY : 'DISPLAY';
MOVE : 'MOVE';
TO : 'TO';
QUOTES : '"';
FORWARDSLASH : '/';
IF : 'IF';
THEN : 'THEN';
ELSE : 'ELSE';
FIGURATIVE : 'SPACE' | 'ZERO' | 'NUMERIC';
GREATERTHANEQUAL : '>=';	  	
LESSERTHANEQUAL	: '<=';
LPAREN : '(';
RPAREN : ')';		
EQUAL : '=';
GREATER	  : '>';
LESSER	  : '<';
AND : 'AND';
DON : '<>';
OR :  'OR';
END : 'END';
ENDPERFORM : 'END-PERFORM';
NOT	: 'NOT' ;
ENDIF : 'END-IF';
PIC : 'PIC';
X : 'X';
S9 : 'S9';
COMP3 : 'COMP-3' | 'COMP';
VALUE : 'VALUE';
INITIALIZE : 'INITIALIZE';
ADD : 'ADD';
SUB : 'SUBTRACT';
FROM : 'FROM';
INSERT : 'INSERT'; 
EXEC : 'EXEC';
SQL : 'SQL';
ENDEXEC :'END-EXEC'; 
HASH : '#';
WHERE : 'WHERE';
CALL : 'CALL';
USING : 'USING';
NINE : '9';
COMMA : ',';
STRING : '"' ~('\r' | '\n' | '"')* '"' ;
UNDERSCORE : '_';
HOSTVARIABLES : (COLON)(LETTER|DIGITS|HYPHEN|UNDERSCORE|COLON)+ ;
IDENTIFIER : (LETTER)(LETTER|DIGITS|HYPHEN|UNDERSCORE|COLON)+ ;
SPECIALSYMBOL : '!' | '@' | '$' | '%' | '^' | '&' | '*'  |'=' ;
COLON : ':';
LETTER : 'A'..'Z'| 'a'..'z' ;
DIGITS: ('0'..'9')+;
ALLEXCEPTHASH : ~('#');

package translator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import processor.ProcessorCntl;


public class Main {

	public static StringTemplateGroup templates;

	public static void main(String[] args) throws Exception {
		templates = new StringTemplateGroup(new FileReader("JavaTemplate.stg"),
						    AngleBracketTemplateLexer.class);
		
		String cobolInput = "temp.txt"; 
		String antlrInput = "input.txt" ; 
		BufferedReader br = new BufferedReader(new FileReader(new File(cobolInput)));
		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(antlrInput)));
		
		
		String line ;
		
		while((line=br.readLine())!=null)
		{
			if(line.length()<7)
			{
				wr.write(line.trim() + "\n");
			}
			
			else if(line.charAt(6)=='*'  ||line.contains("OCCURS") || line.contains("COPY") );
			else
			{
				if(line.contains("END-EXEC"))
				{
					line = line.replaceFirst("END\\-EXEC", "# END\\-EXEC");
				}
				line = line.substring(7);
				wr.write(line.trim() + "\n");
			}	
			
		}
		
		wr.flush();
		br.close();
		wr.close();
		
		
		String intermedJava = "tempjava.txt";
		
		BufferedWriter wr2 = new BufferedWriter(new FileWriter(new File(intermedJava)));
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("input.txt")));
		CobolGrammarLexer lexer = new CobolGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CobolGrammarParser parser = new CobolGrammarParser(tokens);
		
		parser.setTemplateLib(templates);
		RuleReturnScope r = parser.code();
		wr2.write(r.getTemplate().toString());	
		wr2.close();
		
		new ProcessorCntl(intermedJava);
		
	}

}
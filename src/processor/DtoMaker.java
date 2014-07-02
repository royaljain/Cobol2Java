package processor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DtoMaker {
	
	
	DtoMaker(List<String> Var,String classname)
	{
	
		try
		{
			BufferedWriter wr = new BufferedWriter(new FileWriter(new File("C:/Users/works/workspace/Cobol2Java--Version 6.0/java/"+classname.trim() + "Dto.java" )));
			
			String output = "";
			
			output += "public class " + classname.trim() + "Dto" + "(){ \n \n";
			
			for(String var : Var)
			{
				String temp = "private " + MainClassMaker.varType.get(var) + " " + var ;
				
				if(MainClassMaker.varValue.containsKey(var)) temp += "=" + MainClassMaker.varValue.get(var) + ";\n";
				else temp +=  ";\n" ;
				
				output += temp;
				
			}
			
			
			
			for(String var : Var)
			{
				String temp = "\npublic " +  MainClassMaker.varType.get(var)+ " get" + var + "(){ \n";
				temp += "return " + var + "; \n" ;
				temp += "} \n";
				output += temp;
			}
			
			for(String var : Var)
			{
				String temp = "\npublic void set" + var + "(" + MainClassMaker.varType.get(var) + " val " + "){ \n";
				temp +=   var  + " = " + "val" +  "; \n" ;
				temp += "} \n";				
				output += temp;
			}
		
			output += "\n} ";
			wr.write(output);
			wr.flush();
			wr.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
	}
	
	
}

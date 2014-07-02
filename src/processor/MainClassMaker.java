package processor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class MainClassMaker {

	static HashMap<String,String> varType = new HashMap<String,String>(); 
	static HashMap<String,String> varValue = new HashMap<String,String>(); 
	static HashMap<String,String> varGet = new HashMap<String,String>(); 
	static HashMap<String,String> varSet = new HashMap<String,String>(); 
	
	
	
	
	MainClassMaker(String intermed)
	{
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(new File(intermed)));
			
			String line ;
			while((line=br.readLine())!=null)
			{
				if(isVariableDeclaration(line))
				{
					line = line.replace("#var","");
					line= line.trim();
					String words[] =line.split("\\s+");
				
					String varname = words[1];
					if(!varGet.containsKey(varname))
					{
						String varvalue;
						
						String vartype = words[0];
						if(words.length > 3 )
						varvalue = words[3];
						else
						varvalue =  null;
						
					varType.put(varname, vartype);
					varValue.put(varname, varvalue);
					
					}
				}	
			
				
			}
			
			br.close();

		}	
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	
	static void outputJava(String intermed)
	{
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(new File(intermed)));
			BufferedWriter wr = new BufferedWriter(new FileWriter(new File("C:/Users/works/workspace/Cobol2Java--Version 6.0/java/MainClass.java")));
			
			String classdec = "public class Main { \n \n";
			
			wr.write(classdec);
			String line;
			
			while((line=br.readLine())!=null)
			{
				if(line.isEmpty())wr.write(line + "\n");
				else if(isComment(line))wr.write(line + "\n");
				else if(isVariableDeclaration(line))
				{
					line = line.replace("#var","");
					line= line.trim();
					String words[] =line.split("\\s+");
				
					String varname = words[1];
					if(!varGet.containsKey(varname))
					{
						String varvalue;
						
						String vartype = words[0];
						if(words.length > 3  )
						varvalue = words[3];
						else
						varvalue =  null;
						
						varType.put(varname, vartype);
						varValue.put(varname, varvalue);
						wr.write(line.replaceFirst("#var", "") + "\n");
					}
					
					
				}
				
				else if(isBeginStatement(line))
				{
					String temp = "";
					while((line = br.readLine())!=null && !isEndStatement(line))
					{
						temp += line + "\n";	
					}
					
					temp = replaceVar(temp);

					wr.write(temp + "\n");
				}
			}	
			
			String classend = "\n }";
			wr.write(classend + "\n");
			
			wr.flush();
			wr.close();
			br.close();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	
	
	static boolean isComment(String line)
	{
		line = line.trim();
		if(line.length()>=2 && line.charAt(0)=='/' && line.charAt(1)=='/')return true;
		else return false;
	}
	
	static boolean isVariableDeclaration(String line)
	{
		line=line.trim();
		if(line.length()>=2 && line.charAt(0)=='#' && line.charAt(1)=='v' && line.charAt(2)=='a' && line.charAt(3)=='r')return true;
		else return false;
	}
	
	static boolean isBeginStatement(String line)
	{
		line = line.trim();
		if(line.trim().equals("#beginstatement"))return true;
		else return false;
	}
	
	static boolean isEndStatement(String line)
	{
		line = line.trim();
		if(line.trim().equals("#endstatement"))return true;
		else return false;
	}
	static String replaceVar(String line)
	{
		for(String var : varGet.keySet())
		{
			if(line.contains(var))
			{
				line = line.replaceAll(var,varGet.get(var));
			}
		}
		
		return line;
	}
}

package processor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Sql {
	
	private DaoMaker dao ;
	private BufferedReader br = null;
	String DaoName = "DaoClass.java";
	
	Sql(String intermed)
	{
		 try
		 {
			br = new BufferedReader(new FileReader(new File(intermed)));
			dao = new DaoMaker("C:/Users/works/workspace/Cobol2Java--Version 6.0/java/"+DaoName,"localhost","","");
			
			try
			{
				selectSql();
			}
			catch (IOException e) 
			{	
				e.printStackTrace();
			}
			
			MainClassMaker.outputJava("aftersql.txt");
			
		 }
		 catch (FileNotFoundException e) 
		 {
			e.printStackTrace();
		 }
	}
	
	
	void selectSql() throws IOException
	{
		BufferedWriter wr = new BufferedWriter(new FileWriter(new File("aftersql.txt")));
		
		String line;
		while((line=br.readLine())!=null)
		{
			
			
			if(startSql(line))
			{
				String query = "";
				String temp  ;
						
				while((temp=br.readLine())!=null && !endSql(temp))
				{				
					query+=temp + "\n";
				}
							
				String temp2 = newQuery(query);
				
				temp2 = "DaoClass." + temp2 + "(); \n";
				wr.write(temp2);
			}
			
			else
			{
				wr.write(line + "\n");
			}	
		}
		
		wr.flush();
		
		wr.close();
	
		dao.endDao();
	}
	
	
	private boolean  startSql(String line)
	{
		if(line.trim().equals("#BEGINSQL"))return true;
		else return false;
		
	}
	
	private boolean  endSql(String line)
	{
		if(line.trim().equals("#ENDSQL")) return true;
		else return false;		
	}
	
	
	String newQuery(String query)
	{
		
		String[] lines = query.split("\n");
		List<String> Var  = new ArrayList<String>();
		
		String DtoName; 
		if(lines.length>1)
		DtoName = lines[0].trim() +"_" + lines[1].trim();
		else
		 DtoName = lines[0].trim();	
		
		String temp = "";
		
		for(int i = 0 ;i<lines.length ;i++)
		{
			if(lines[i].trim().equals("#beginidentifier"))
			{
				String varname = lines[i+1].trim().substring(1); 
				if(!Var.contains(varname))Var.add(varname);	
				temp += "? , " ;
				i = i+2;
			}
			
			else
			{
				temp+=lines[i];
			}
			
		}
		
		
		new DtoMaker(Var,DtoName);
		
		addGet(Var,DtoName);
		addSet(Var,DtoName);
		
		dao.addMethod(DtoName, "\"" + temp +  "\"",Var);
		
		return DtoName;
	}
	
	
	void addGet(List<String> var,String DtoName)
	{
		for(String variable : var )
		{
			MainClassMaker.varGet.put(variable, DtoName+"." + "get" + variable + "()" );	
		}
	}
	
	void addSet(List<String> var,String DtoName)
	{
		for(String variable : var )
		{
		MainClassMaker.varSet.put(variable, DtoName+"." + "set" + var + "(" );	
		}
	}
	
}

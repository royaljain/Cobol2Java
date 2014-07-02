package processor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DaoMaker {
	
	BufferedWriter wr;
	DaoMaker(String name,String url,String user,String pass)
	{
		try 
		{
			wr = new BufferedWriter(new FileWriter(new File(name)));
			
			String output = " ";
			
			output += "import java.sql.*; \n \n \n" ;
			output += "public class DaoClass { \n \n" ;
			
			output +=  "static final String JDBC_DRIVER = \"com.mysql.jdbc.Driver\" ; \n";  
			output +=  "static final String DB_URL = " + url + "; \n";

			output +=   "static final String USER = "+ user + "; \n";
			output +=   "static final String PASS = "+ pass + "; \n";
			output +=   "Connection conn = null; \n";
			output +=   "Statement stmt = null; \n"; 
			
			output +=  "\n \nDaoClass() { \n "
				   +   "try{ \n \n"
			       +   "	//STEP 2: Register JDBC driver \n"
			       +   "	Class.forName(\"com.mysql.jdbc.Driver\"); \n"
			       +   "	//STEP 3: Open a connection \n"
			       +   "	System.out.println(\"Connecting to database...\"); \n"
			       +   "	conn = DriverManager.getConnection(" + url + user + pass + "); \n" 
				   +   " } \n } \n";	
			
			
			
			wr.write(output);
			wr.flush();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	void addMethod(String name,String procedure,List<String> Var)
	{
		String output = "\n \n" ;
		
		output += "public static void " + name + "() { \n \n";
		
		output += "String sql; \n \n"
	           +  "sql = " + procedure + ";" + "\n \n "
	           +  "stmt = conn.prepareCall(); \n " ;  
	           
	           
	    int i = 1;       
	    for(String temp : Var)
	    {
	    	String temp2 = "stmt.set" + MainClassMaker.varType.get(temp) + "("
	                       + i + "," + temp + ") \n"  ;
	    	output += temp2 ;		         	
	    	i++;
	    }
	           
	    output  +=  " stmt.execute() ;  \n" ;
		output +=  "} \n";
		
		
		try 
		{
			wr.write(output);
			wr.flush();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	void endDao()
	{
		String output = "\n \n } " ;
		try 
		{
			wr.write(output);
			wr.flush();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}

package SeleniumBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class DataBaseConnectionRead {
	
	

	public static void main(String[] args) throws SQLException 
	{
		Connection con=null;
		try {
			
		
		Driver driverRef=new Driver();
		
		/*load/registor connection*/
		
		DriverManager.registerDriver(driverRef);
		
		/*connection to db*/
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		
		/*Create statement*/
		
		Statement state = con.createStatement();
		
		String query="select * from projects";
		//String query1="insert into projects('chandan','ty')";
		
		/*Execute Query*/
		
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
			
		{
			System.out.println(result.getString(1)+"\t"+result.getString(2));
		}
		
		}
		
		catch(Exception e)
		{
			
		}
		
		finally
		{
			/*closing db connection*/
			con.close();
		}
		
		

	}

}

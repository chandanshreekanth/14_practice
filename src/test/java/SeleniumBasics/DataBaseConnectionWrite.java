package SeleniumBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseConnectionWrite {

	public static void main(String[] args) throws SQLException 
	{
		
		Connection con=null;
		int result=0;
		
		try 
		{
			Driver driverRef=new Driver();
			
			DriverManager.registerDriver(driverRef);
			con=DriverManager.getConnection(null, null, null);
			Statement state=con.createStatement();
			String query="insert into projects('chandan','ty')";
			result = state.executeUpdate(query);
			
			if(result==1)
				
			{
				System.out.println("query updated");
				
			} 
			
			else {
				System.out.println("query not updated");
			}
		}
		catch (Exception e) 
		{
			
		}
		
		finally {
			System.out.println("closing connection");
			con.close();
		}
		

	}

}

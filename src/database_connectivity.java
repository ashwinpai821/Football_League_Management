import java.sql.Connection;
import java.sql.DriverManager;
public class database_connectivity
{
	public static Connection connectDatabase() 
	{
		
		Connection con = null;
		String url="jdbc:mysql://localhost:3306/football_data";
        String user="root";
        String pass = "root";
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	con = DriverManager.getConnection(url,user,pass);}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		return con;
	}
}


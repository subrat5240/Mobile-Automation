import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.mysql.jdbc.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		
	Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "root");
		
	Statement stmt=con.createStatement();
	
	//String query = "SELECT * FROM employeeinfo ORDER BY ID DESC LIMIT 1"; //for selecting the last row of the table in my sql db
	
// SELECT TOP 1 * FROM product ORDER BY ID DESC // for selecting the last row of the table in sql server 
	
ResultSet rs=stmt.executeQuery("select * from employeeinfo where Location='texas' and Name='lam';");
	
	
	
	//ResultSet rs=stmt.executeQuery(query);
	
	while(rs.next())
	{
	
	//System.out.println(rs.getString("Name"));
	//System.out.println(rs.getString("Age"));
	
	System.out.println(String.format("%s - %s - %s - %s ",
		rs.getString(2), rs.getString(1), rs.getString(3),
		rs.getString(4)));
	
	}

}

}
import java.sql.*;

public class jdbcTest {
public static void main(String[] args) throws SQLException {
	
	Connection myconn = null;
	
	Statement myStmt = null;
	ResultSet myRs = null;
	
	String dbUrl = "jdbc:mysql://127.0.0.1:3306/demo";
	String user = "student";
	String password ="student";
	
	// get a connection to database
	myconn = DriverManager.getConnection(dbUrl, user,password);
	
	//create a statement
	myStmt = myconn.createStatement();
	
	// Execute SQL query
	myRs = myStmt.executeQuery("select * from employees");
	
	
	// Process the result set
	while(myRs.next()) {
		System.out.println(myRs.getString("last_name") + "  , " + myRs.getString("first_name"));
		
		
	}
	
}
}

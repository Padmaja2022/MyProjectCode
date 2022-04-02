import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatements {


	public static void main(String[] args) {


		Connection myconn = null;	
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			//1. Geta connection to database

			myconn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo","student","student");

			//2. Prepare statement
			myStmt = myconn.prepareStatement("select  * from employees where salary> ? and department=?");
			//3. set the parameters

			((PreparedStatement) myStmt).setDouble(1,8000);
			((PreparedStatement) myStmt).setString(2, "Legal");


			//4. Execute SQL query
			myRs = myStmt.executeQuery("select  * from employees where salary> ? and department=?");

			//5.Display the result set
			display(myRs);	
		}catch( Exception e) {


			e.getStackTrace();
		}









	}















	private static void display(ResultSet myRs) {
		// TODO Auto-generated method stub

	}
}
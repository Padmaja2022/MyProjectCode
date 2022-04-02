import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {


	public static void main(String[] args) throws SQLException {
		Connection myconn = null;
		Statement myStmt = null;
		ResultSet myRs = null;



		String dbUrl = "jdbc:mysql://127.0.0.1:3306/demo";
		String user = "student";
		String password ="student";
		try {
			//1. get a connection to database
			myconn = DriverManager.getConnection(dbUrl, user,password);



			//2.create a statement
			myStmt = myconn.createStatement();
			//call helper method to display the employee's information
			System.out.println("BEFORE THE DELETE...");
			displayEmployee(myconn,"John","Doe");
			//Delete the employee
			System.out.println("DELETING THE EMPLOYEE: John Doe\n");
			int rowsAffected =myStmt.executeUpdate("delete from employees  where last_name ='Doe'  and first_name='John'");
			//call helper method to display the employees information
			System.out.println("after the delete..");
			displayEmployee(myconn,"John","Doe");
		}
		catch (Exception exc) {
			exc.printStackTrace();



		}finally {
			close(myconn,myStmt,myRs);
		}
	}

	private static void close(Connection myconn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub

	}

	private static void displayEmployee(Connection myconn, String string, String string2) {
		// TODO Auto-generated method stub

	}










}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


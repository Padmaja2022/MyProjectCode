import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertNewEmployee {
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

			//3.Insert a new employee

			int rowsAffected = myStmt.executeUpdate("insert into employees" + "(last_name,first_name,email,department,salary)" + "values"+ "('Wright','Eric','eric.wright@mail.com','HR',33000)");

			// 4.verify this by getting a list of employees
			myRs = myStmt.executeQuery("select * from employees order by last_name");

			//5. process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}catch (Exception exc) {
			exc.printStackTrace();

		}finally {

			if(myRs != null) {

				myRs.close();
			}
		}




	}	










}

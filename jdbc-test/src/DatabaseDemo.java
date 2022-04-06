import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author PadmajaLanka
 * 
 * 	DatabaseDemo - class shows all the database related activities from a Java program
 * 
 * 	1. Connect to a database  using JDBC connection
 * 
 * 	2. there are 4 types of operations we can perform on a database
 * 		a) get the database records (SELECT statement in SQL)
 * 		b) insert a new Record in to a table (INSERT statement in SQL)
 * 		c) update a record in a table (UPDATE statement in SQL)
 * 		d) delete a record from a table (DELETE statement in SQL)
 * 
 */


public class DatabaseDemo {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	
	public static void main(String[] args) throws SQLException { 
		String emp_details = null;
		Scanner my_scanner = new Scanner(System.in);
		// define the type of database
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/demo";
		Connection connection = DriverManager.getConnection(dbUrl,"student","student");
		Statement statement = connection.createStatement();
		
		String sql_select_query = "SELECT * from employees";
		ResultSet result_set = statement.executeQuery(sql_select_query);

		// get all column names from the table
		ResultSetMetaData metadata = result_set.getMetaData();
		for (int i = 1; i <= metadata.getColumnCount(); i++) {
//		    System.out.println(metadata.getColumnName(i));  
		}

		
		// get employee Details
		System.out.println("Enter Employee First Name... ");
		String user_input = my_scanner.nextLine();
		 emp_details = getEmployeeDetails(statement, user_input);
		System.out.println(emp_details);
		
		
		
		
		// Insert a new employee information
		sql_select_query = "insert into employees (last_name, first_name, email, department, salary) values ('Lanka','Padmaja','dummy@dummy.com','GIS',75000.99)";
		statement.executeUpdate(sql_select_query);
		emp_details = getEmployeeDetails(statement, "Padmaja");
		System.out.println(emp_details);

		
		
		// update a record in the database 
		// Update the salary of the employee created in previous step 
		sql_select_query = "update employees set salary=100000.00 where last_name='Lanka' and first_name='Padmaja'";
		statement.executeUpdate(sql_select_query);
		emp_details = getEmployeeDetails(statement, "Padmaja");
		System.out.println(emp_details);
		
		
		// update a record in the database 
		// Update the salary of the employee created in previous step 
		sql_select_query = "delete from employees where last_name='Lanka' and id=18";
		statement.executeUpdate(sql_select_query);
		emp_details = getEmployeeDetails(statement, "Padmaja");
		System.out.println(emp_details);
		
		
		my_scanner.close();
	}

	private static String getEmployeeDetails(Statement statement, String firstName) throws SQLException {
		String returnString = "";
		String sql_select_1 = "select * from employees where first_name='" + firstName + "'";
		ResultSet rs = statement.executeQuery(sql_select_1);
		while (rs.next()) {
			returnString = returnString + rs.getInt("id")  + ", " + 
										  rs.getString("first_name") + ", " +
										  rs.getString("last_name") + ", " +
										  rs.getString("email") + ", " + 
										  rs.getString("department") + ", " +
										  rs.getDouble("salary") + "\n";
		}
		return returnString;
	}

}

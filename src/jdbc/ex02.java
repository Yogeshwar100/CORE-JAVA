package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex02 {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully...");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
			System.out.println("connection created successfully..." + connection);
			
			statement = connection.createStatement();

			statement.executeUpdate("INSERT INTO STUDENT_INFO VALUES(101,'Akhil','Pune')");
			statement.executeUpdate("INSERT INTO STUDENT_INFO VALUES(102,'Sneha','Mumbai')");
			statement.executeUpdate("INSERT INTO STUDENT_INFO VALUES(103,'Neha','Delhi')");
			System.out.println("Data inserted successfully...");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//if (statement != null)//if it is null then NullPointerException will occur.
					statement.close();
				//if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}

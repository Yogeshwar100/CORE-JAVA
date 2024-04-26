package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step1: load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully...");
		
		//Step2: create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
		System.out.println("connection created successfully..."+connection);
		
		//Step3: create the statement object
		Statement statement=connection.createStatement();
		
		//Step4: process the query
		int x=statement.executeUpdate("CREATE TABLE STUDENT_INFO(ROLL_NO NUMBER,NAME VARCHAR2(30),EMAIL VARCHAR2(30))");
		System.out.println("Table successfully created...."+x);
		
		//Step5: release the resource
		statement.close();
		connection.close();
		System.out.println("Connection closed successfully...");
	}

}

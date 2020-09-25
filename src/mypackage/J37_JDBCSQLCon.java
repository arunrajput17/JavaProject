package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC : Java Database Connectivity

// Pre - Requisite
// 1) Download database driver (.jar file)
// 2) Add driver jar to your project

// Steps to write JDBC program
// 1) Create a Connection
// 2) Create a query/statement
// 3) execute statement/query
// 4) Close connection

public class J37_JDBCSQLCon {

	public static void main(String[] args) throws SQLException {
		

		// 1) Create a Connection
		
		//Oracle database connection
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborc1","hr","hr");
		
//		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		// SQL connection
//		Connection con = DriverManager.getConnection("jdbc:sqlserver://ACROLAP32\\SQLEXPRESS:1433; databaseName=sample; user=sa;password=acro");
		
		String URL="jdbc:sqlserver://ACROLAP32\\SQLEXPRESS:1433; databaseName=Sample";
		String user = "sa";
		String password = "acro";
		
		Connection con = DriverManager.getConnection(URL, user, password);
		
		
		if (con != null) {
		    System.out.println("Connected");
		}
		
		
		
		// 2) Create a query/statement
		Statement stmt= con.createStatement();
		
//		String s="insert into student values (101, 'Scott')";
//		String s = "update student set sname='KIM' where SID=105";
//		String s = "delete student where SID=105";
		
		System.out.println("Start");
		
		String s = "select ID, Name, Gender  from dbo.tblEmployee";	// select query is two way
		
		
		// 3) execute statement/query
//		stmt.executeQuery(s);	// use this with insert, update, delete
		ResultSet rs = stmt.executeQuery(s); 	// use this with select query
		
		//Reading data received from Select query in rs
		while(rs.next())
		{
			int eid=rs.getInt("ID");
			String ename=rs.getString("Name");
			String egender=rs.getString("Gender");
			
			System.out.println(eid+"      "+ename+"       "+egender);
		}
		
		// 4) Close connection
		con.close();
		
		
		System.out.println("Program is completed");


	}

}

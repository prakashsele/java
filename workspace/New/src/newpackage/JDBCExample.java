package newpackage;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

	   static final String USER = "username";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      Class.forName("com.mysql.jdbc.Driver");

	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      System.out.println("Creating table in given database...");
	      stmt = (Statement) conn.createStatement();
	      
	      String sql = "CREATE TABLE REGISTRATION " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	      ((java.sql.Statement) stmt).executeUpdate(sql);
	      System.out.println("Created table in given database...");
	   }catch(SQLException se){
	      se.printStackTrace();
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   System.out.println("Goodbye!");
	}

}

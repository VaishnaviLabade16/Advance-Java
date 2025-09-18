import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBC {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
      
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Vaishu@16");
		   System.out.println(con);
		   	   
		  	//Create Database		  
			  String sql = "CREATE DATABASE Student";
			   Statement stmt = con.createStatement();
	            stmt.executeUpdate(sql);
	            System.out.println("Database 'mydb' created successfully!");
		 
		   //Insert Data into table
		   Statement s = con.createStatement();
		   int a = s.executeUpdate("insert into students(id,name,city)values(1,'ram','pune')");
			if (a > 0) {
				System.out.println("Data IS Inserted...");
			} else {
				System.out.println("Data IS Not Inserted...");
			}
			
	}

}

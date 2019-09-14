import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;


public class JavaMysqlPreparedStatementInsertExample
{

  public static void main(String[] args)
  {

  	Scanner sc=new Scanner(System.in);

    try
    {
      // create a mysql database connection
      Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
	  Statement st=con.createStatement();  
	  System.out.println("Enter USername");
	  String user=sc.next();
      
      System.out.println("Enter password");
	  String pass=sc.next();
      
      
      
      st.executeUpdate("INSERT INTO abc (user,pass) "
          +"VALUES ('"+user+"','"+pass+"')");

ResultSet rs=st.executeQuery("SELECT * FROM `abc`"); 
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}
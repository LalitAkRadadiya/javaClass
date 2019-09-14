import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;


public class Demo
{

  public static void main(String[] args)
  {
    int c=0;
  	Scanner sc=new Scanner(System.in);

    try
    {
      // create a mysql database connection
      Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
	  Statement st=con.createStatement();  
	  System.out.println("Enter USername : password");
	  String strMain=sc.next();
	   String[] arrSplit = strMain.split(":");
      String user=arrSplit[0];
      String pass=arrSplit[1];
      ResultSet rs=st.executeQuery("SELECT * FROM `abc`");
      while(rs.next()){

        if(user.equals(rs.getString("user")))
        {
          c=1;
          System.out.println("Username Already Exist");
        }
      }
      
      if(c==0){
        
      st.executeUpdate("INSERT INTO abc (user,pass) " +"VALUES ('"+user+"','"+pass+"')");

      }

       

      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}



import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  

Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("SELECT * FROM `abc`");  
while(rs.next())
 {
 System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  ");  
}
con.close();  

}
catch(Exception e)
{
 System.out.println(e);
}  
}  
}

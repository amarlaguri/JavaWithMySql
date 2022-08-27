import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class GetDataMySql {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amardb","root","Amar@54321");
		Statement stmt= con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next())
				{
			System.out.println(rs.getInt(1)+ " : " +rs.getString(2)+ " : "+rs.getInt(3)+" : "+rs.getInt(4)+" : "+rs.getString(5));
		
				}
		stmt.close();
		con.close();
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
}
}

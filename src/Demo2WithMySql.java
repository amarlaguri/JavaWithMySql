import java.sql.*;
public class Demo2WithMySql
{
public static void main(String[] args)
{
	//1. load driver
	// 2. create the connection
	// 3. create the statement
	// 4. executer the statement
	// 5. close the connection
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amardb","root","Amar@54321");
		Statement stmt=con.createStatement();
		stmt.execute("insert into emp values(103,'Suresh',23,20000,'Clerk');");
		stmt.close();
		con.close();
		System.out.println("Data Inserted.....!");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
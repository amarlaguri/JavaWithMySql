import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
import java.sql.PreparedStatement;

public class Demo3WithOracle {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Eid:");
			int eid=sc.nextInt();
			System.out.println("Enter Name:");
			String ename=sc.next();
			System.out.println("Enter Age:");
			int age=sc.nextInt();
			System.out.println("Enter Salary:");
			int salary=sc.nextInt();
			System.out.println("Enter Designation:");
			String desig=sc.next();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amardb","root","Amar@54321");
			PreparedStatement stmt= con.prepareStatement("insert into emp values(?,?,?,?,?);");
			stmt.setInt(1, eid);
			stmt.setString(2, ename);
			stmt.setInt(3,age);
			stmt.setInt(4, salary);
			stmt.setString(5, desig);
			
			stmt.execute();
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

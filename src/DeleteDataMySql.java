import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDataMySql {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Eid:");
			int eid=sc.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amardb","root","Amar@54321");
			PreparedStatement stmt= con.prepareStatement("delete from emp where eid=?");
			
			stmt.setInt(1, eid);
			
			System.out.println("Do you really want to delete the record...? Yes / No ");
			String op=sc.next();
			
			if(op.equalsIgnoreCase("Yes") || op.equalsIgnoreCase("y"))
			{
				stmt.execute();
			System.out.println("Data Deleted Successfully.....!");
			}
			else
			{
				System.out.println("Data not deleted..!");
			}
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}

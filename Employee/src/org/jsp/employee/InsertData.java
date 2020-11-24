package org.jsp.employee;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
public class InsertData 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Lenght of the array");
		int Length=Sc.nextInt();
		Connection Con=null;
		PreparedStatement Son=null;
		Properties Pro=new Properties();
		int id=0;
		String Fname="";
		String Lname="";
		double Mno=0.0;
		try
		{
			Pro.load(new FileReader(new File("./src/Test.Properties")));
			Class.forName(Pro.getProperty("driver"));
			Con=DriverManager.getConnection(Pro.getProperty("str2"),Pro);
			for(int i=0;i<Length;i++)
			{
				System.out.println("Enter ID");
				id=Sc.nextInt();
				System.out.println("Enter Firt Name");
				Fname=Sc.nextLine();
				Sc.nextLine();
				System.out.println("Enter Last Name");
				Lname=Sc.nextLine();
				System.out.println("Enter Mark");
			    Mno=Sc.nextDouble();
				//Sc.nextLine();
				//5,'sudhakar','M',989889,'chennai',21000.00,'1998-08-09' 7,'Kanish','M',432
			    String Str="Insert into student_info values(id,Fname,Lname,Mno)";
			    Son=Con.prepareStatement(Str); 
				System.out.println(Son.executeUpdate());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		Con.close();
		}
		System.out.println("Done");
	}
}

package Classes;

import java.sql.*;


public class Database {

	public void CreateDatabase() 
	{
		try {
			String url="jdbc:mysql://localhost:3306";
			Connection con=DriverManager.getConnection(url,"root","Manya@750");
			System.out.println("Connection estab;ished");
			
			Statement stmt=con.createStatement();
			String query="Create database Nikki";
			stmt.execute(query);
			System.out.println("Database has been created succesfully");
			
		
	}
	
	
	catch(Exception e)
	{
		e.printStackTrace();
//		System.out.println("connection not established");
	}

     }

	public void CreateTable() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/nikki";
			Connection con=DriverManager.getConnection(url,"root","Manya@750");
			System.out.println("Connection estab;ished");
			
			Statement stmt=con.createStatement();
			String query="Create table Students (Sid int(3), Sname varchar(15));";
			stmt.execute(query);
			System.out.println("Table has been created succesfully");
			
		
	}
	
	
	catch(Exception e)
	{
		e.printStackTrace();
//		System.out.println("connection not established");
	}

		
	}

	public void InsertData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/nikki";
			Connection con=DriverManager.getConnection(url,"root","Manya@750");
			System.out.println("Connection estab;ished");
			
			Statement stmt=con.createStatement();
			String query="Insert into Students Values(1,'Manish'),(2,'Nikhil'),(3,'Danny'),(4,'Lala')";
			stmt.execute(query);
			System.out.println("Data has been Added Successfully");
			
		
	}
	
	
	catch(Exception e)
	{
		e.printStackTrace();
//		System.out.println("connection not established");
	}
		
	}

	public void UpdateData() {
		// TODO Auto-generated method stub
		
	}

	public void DeleteData() {
		// TODO Auto-generated method stub
		
	}
}

	

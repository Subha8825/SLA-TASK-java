package com.index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetailsDB {
	static final String DB_URL="jdbc:mysql://localhost:3306/javaDB";
	static final String USER="root";
	static final String Pass="subha";
	
	static Connection conn1=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			conn1=DriverManager.getConnection(DB_URL,USER,Pass);
			Statement stmt=conn1.createStatement();
			String sql="select * from Employee1 limit 3"; 
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("Fetch the first 3 record");
			System.out.println();
			while(rs.next()) {
				System.out.println("Emp_id :"+rs.getInt(1));
				System.out.println("Emp_Firstname :"+rs.getString(2));
				System.out.println("Emp_Lastname :"+rs.getString(3));
				System.out.println("Emp_Desgination :"+rs.getString(4));
				
			}
			
			String sql1="select * from Employee1 where Firstname like 's%'";
			ResultSet rs1=stmt.executeQuery(sql1);
			System.out.println();
			System.out.println("First name start with s");
			System.out.println();
			while(rs1.next()) {
				System.out.println("Emp_id :"+rs1.getInt(1));
				System.out.println("Emp_Firstname :"+rs1.getString(2));
				System.out.println("Emp_Lastname :"+rs1.getString(3));
				System.out.println("Emp_Desgination :"+rs1.getString(4));
				
			}
			
			String sql2="select * from Employee1 where lastname like '%a'";
			ResultSet rs2=stmt.executeQuery(sql2);
			System.out.println();
			System.out.println("Last name end with a");
			System.out.println();
			while(rs2.next()) {
				System.out.println("Emp_id :"+rs2.getInt(1));
				System.out.println("Emp_Firstname :"+rs2.getString(2));
				System.out.println("Emp_Lastname :"+rs2.getString(3));
				System.out.println("Emp_Desgination :"+rs2.getString(4));
				
			}
			
			String sql3="select * from Employee1 where emp_des='manager'";
			ResultSet rs3=stmt.executeQuery(sql3);
			System.out.println();
			System.out.println("Employee details where des is manager");
			System.out.println();
			while(rs3.next()) {
				System.out.println("Emp_id :"+rs3.getInt(1));
				System.out.println("Emp_Firstname :"+rs3.getString(2));
				System.out.println("Emp_Lastname :"+rs3.getString(3));
				System.out.println("Emp_Desgination :"+rs3.getString(4));
				
			}
			
			String sql4="select * from Employee1 where Firstname in(select Firstname from Employee1 group by Firstname having count(*)>1)";
			ResultSet rs4=stmt.executeQuery(sql4);
			System.out.println();
			System.out.println("Duplicate Employee details ");
			System.out.println();
			while(rs4.next()) {
				System.out.println("Emp_id :"+rs4.getInt(1));
				System.out.println("Emp_Firstname :"+rs4.getString(2));
				System.out.println("Emp_Lastname :"+rs4.getString(3));
				System.out.println("Emp_Desgination :"+rs4.getString(4));
				
			}
			
			
			
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		

	}

}

//output

//Fetch the first 3 record

//Emp_id :1
//Emp_Firstname :subha
//Emp_Lastname :lakshmi
//Emp_Desgination :manager
//Emp_id :2
//Emp_Firstname :sharmi
//Emp_Lastname :la
//Emp_Desgination :designer
//Emp_id :3
//Emp_Firstname :js
//Emp_Lastname :tamil
//Emp_Desgination :manager

//First name start with s

//Emp_id :1
//Emp_Firstname :subha
//Emp_Lastname :lakshmi
//Emp_Desgination :manager
//Emp_id :2
//Emp_Firstname :sharmi
//Emp_Lastname :la
//Emp_Desgination :designer
//Emp_id :4
//Emp_Firstname :sabari
//Emp_Lastname :raj
//Emp_Desgination :manager
//Emp_id :4
//Emp_Firstname :subha
//Emp_Lastname :vinayagam
//Emp_Desgination :developer

//Last name end with a

//Emp_id :2
//Emp_Firstname :sharmi
//Emp_Lastname :la
//Emp_Desgination :designer

//Employee details where des is manager

//Emp_id :1
//Emp_Firstname :subha
//Emp_Lastname :lakshmi
//Emp_Desgination :manager
//Emp_id :3
//Emp_Firstname :js
//Emp_Lastname :tamil
//Emp_Desgination :manager
//Emp_id :4
//Emp_Firstname :sabari
//Emp_Lastname :raj
//Emp_Desgination :manager

//Duplicate Employee details 

//Emp_id :1
//Emp_Firstname :subha
//Emp_Lastname :lakshmi
//Emp_Desgination :manager
//Emp_id :4
//Emp_Firstname :subha
//Emp_Lastname :vinayagam
//Emp_Desgination :developer


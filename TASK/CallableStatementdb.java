package com.index;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatementdb {
	static final String DB_URL="jdbc:mysql://localhost:3306/javadb";
	static final String USER="root";
	static final String Pass="subha";
	
	static Connection con=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			con=DriverManager.getConnection(DB_URL,USER,Pass);
			CallableStatement stmt=con.prepareCall("{call javadb.EXAMPLEDB(?,?,?)}");
			stmt.setInt(1,9);
			stmt.setString(2,"maha");
			stmt.setString(3,"Manager");
			stmt.executeQuery();
			System.out.println("Record Inserted Successfully");	
			
			Statement stm=con.createStatement();
			String SQL="select * from employee";
			ResultSet rs=stm.executeQuery(SQL);
			
			System.out.println("Fetch the Records");
			while(rs.next()) {
				System.out.println("Emp_id :"+rs.getInt(1));
				System.out.println("Emp_name"+rs.getString(2));
				System.out.println("Emp_des"+rs.getString(3));
			}
			
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}

}


//Record Inserted Successfully


//Record Inserted Successfully
//Emp_id :1
//Emp_name:jimin
//Emp_des :developer
//Emp_id :2
//Emp_namejs
//Emp_des:designer
//Emp_id :7
//Emp_nameSHARU
//Emp_des:TESTER
//Emp_id :9
//Emp_name:maha
//Emp_des:Manager



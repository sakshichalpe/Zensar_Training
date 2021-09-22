package implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert{
	
	static Statement st;
	static ResultSet rs;
	static Connection con;
	static PreparedStatement pst;
	//empid+"\t"+"\t"+empname+"\t"+empsalary+"\t\t"+emp_email+"\t"+emp_mb+"\t"+dept_id );  //+"\t"+dept_name
	
	public Insert()
	{
		con= ConnectionFactory.getConnection();
		System.out.println("Connection Acheived");
	}
	
	
	
	
	public int insertRecord(int empid,String empname,float empsalary, int dn) throws SQLException
	{
		pst = con.prepareStatement("insert into employee values(?,?,?,?)");
		pst.setInt(1,empid);
		pst.setString(2, empname);
		pst.setFloat(3, empsalary);
		pst.setInt(4, dn);
				
		//int r = pst.executeUpdate();
		 int r=0;
		try(PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?)");  	)
		{
			pst.setInt(1,empid);
			pst.setString(2, empname);
			pst.setFloat(3, empsalary);
			pst.setInt(4, dn);
					
			 r = pst.executeUpdate();
		    
		   System.out.println(r + " Rows inserted successfully!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return r;
	}
	
	
	
}

package implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class update {

	static Statement st;
	static ResultSet rs;
	static Connection con;
	static PreparedStatement pst;
	
	
	public int updateRecord(int empid,float empsalary) throws SQLException
	{
		int r=0;
		try(PreparedStatement pst = con.prepareStatement("update employee set empsalary = ? "
				+ "where empid=?");)
		{
		pst.setFloat(1, empsalary);
		pst.setInt(2, empid);
		r = pst.executeUpdate();
		
		System.out.println("Number of rows updated : " + r);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	return r;
	}
	public static void main(String[] args) throws Exception {
		update up =new update();
		up.updateRecord(1,120.0f);
		
	}
}

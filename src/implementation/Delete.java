package implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	static Statement st;
	static ResultSet rs;
	static Connection con;
	static PreparedStatement pst;
	public int deleteBook (int i) //throws SQLException
	{
	
		 int r=0;
		try(PreparedStatement pst = con.prepareStatement("delete from books where book_id=?");  	)
		{
			pst.setInt(1,i);						
			 r = pst.executeUpdate();
		    
		   System.out.println(r +   "  Book Delete successfully!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return r;
	}
}

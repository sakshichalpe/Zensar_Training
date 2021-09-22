package implementation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class AccessFetch {
	static Statement st;
	static ResultSet rs;
	static Connection con;
	static PreparedStatement ps;
	
	public AccessFetch()
	{
		//ConnectionFactory=new ConnectionFactory();
		//ConnectionFactory con = ConnectionFactory.getConnection();
		 con = ConnectionFactory.getConnection();

		System.out.println("Connection Acheived");
	}
public void fetchData() 
{
	
	try( Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery("select * from employees");
)
	{
		//	int r =st.executeUpdate("insert into emp values(1222,'rtr','fhfh')");
	System.out.println("empid"+"\t"+"empname"+"\t\t"+"empsalary"+"\t"+"emp_email"+"\t"+"emp_mb"+"\t"+"dept_name"+"\t"+"dept_id");
	while(rs.next())
	{
		int empid=rs.getInt(1);
		String empname=rs.getString(2);
		float empsalary= rs.getFloat(3);;
		String emp_email=rs.getString(4);;
		String emp_mb=rs.getString(5);
        int dept_id=rs.getInt(6);
		String dept_name=rs.getString(7);
		System.out.println(empid+"\t"+"\t"+empname+"\t"+empsalary+"\t\t"+emp_email+"\t"+emp_mb+"\t"+dept_id+"\t"+dept_name);
	//	System.out.println("empid"+"\t"+"empname"+"\t\t"+"empsalary"+"\t"+"emp_email"+"\t"+"emp_mb"+"\t"+"dept_name"+"\t"+"dept_id");
	}
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
}
public static void main(String[] args) {
	AccessFetch af = new AccessFetch();
	af.fetchData();
	
}

}





package ClassObject;

public class Account2 {

	public static void main(String[] args) {
		
		 long account_no;
		 String Customer_name;
		 Account2 c2=new Account2 ();	
		 Account2 c3=new Account2 (443454,"Sham");
	}
	
	Account2 ()
	{
		long account_no=345673;
		String Customer_name="Raju";
		System.out.println("I am default Constructor");
	}
	Account2(long a_n,String c_n  )
	{
		long account_no=a_n;
		String Customer_name=c_n;
		System.out.println("I am Parameterized Constructor");
	}
	
}

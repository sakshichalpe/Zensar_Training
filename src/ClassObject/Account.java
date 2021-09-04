package ClassObject;
public class Account 
{
	String name;
	double balance;
	int Acc_no;
	
         public void display(String name, int Acc_no, double balance)
         { 
        	 System.out.println("Account holder name is:" + name 
        			              + "Acc_no is:"          + Acc_no
        			              + "balanace is:"        + balance);
         }
      double deposite(double amt1)
         {
        	 double amt1;
        	 System.out.println(" Enter Amount to deposite ");
        	 balance = balance+amt1;	
        	 System.out.println("After deposite balance is: " + balance);
         }
         double withdraw(double amt2)
         {
        	 double amt2;
        	 System.out.println("Enter Amount to withdraw");
        	 balance = balance-amt2;
        	 System.out.println("After withdraw balance is:" + balance);
         }
		

     	public static void main(String[] args)
     	{
     		Account a=new Account ();
     		a.display();
     		a.deposit();
     		a.withdraw();
     	}
     	

}

package ClassObject;
	
	public class Account11 {
		int ac_no;
		String name,ac_type;
		float amount;
		void details(int n,String nm,String t, float a) {
			ac_no=n;
			name=nm;
			ac_type=t;
			amount=a;
		}
		void show() {
			System.out.println(ac_no+" "+name+" "+ac_type+" "+amount );
			
			
		}
		void deposite(float a)
		{
			amount+=a;
			System.out.println("Deposite amount:"+a);
			
		}
		void withdraw(float a)
		{
			if(amount<a)
				System.out.println("insufficient balance");
			else
				amount-=a;
			System.out.println("withdraw amount:"+a);
			
		}
		void checkbalance()
		{
			System.out.println("Balance is:"+amount);
			
		}
	
		
			public static void main(String args[])
			{
				Account11 b=new Account11();
				b.details(123456,"Vipul","Saving",1000);
				b.show();
				b.deposite(40000);
				b.checkbalance();
				b.withdraw(10000);
				
				
			}
	  
		}

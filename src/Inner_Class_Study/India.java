package Inner_Class_Study;

public abstract class India {
	   abstract void sanket();
		public void papa()
		{
			System.out.println("India se papa method");
		}	
}

class Landon {	
	public static void main(String[] args) {
		India india=new India() { 
			public void sanket()
			{
				System.out.println("London se sanket method");
			}	
		};	
		india.sanket();
		}
	}

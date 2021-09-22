package excepption;

public class Voting  {

public static void main(String[] args) {
	int age=18;
	try 
	{
	if(age>18) 
	   {
		throw new UnderAgeException();
	   }
	}catch (UnderAgeException  e) {
		System.out.println(e.getMessage());
	}
	
		
	}
	
	}



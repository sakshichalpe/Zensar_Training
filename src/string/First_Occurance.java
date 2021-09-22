package string;
import java.util.Scanner;
public class First_Occurance 
{
	public static void main(String[] args)
	{
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a String to find first occurance");
    String str=sc.nextLine();
    
    char ch[] = str.toCharArray();
    
    char a=sc.next().charAt(0);
    
		System.out.println("First occurance of the string is " + a);

	}
	}
	
	

	
	

	
	
	

package Conditional_Stmt;
import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=0;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a year");
	sc.nextInt();
	
	//||     -----> or
	//&&     -----> and
	
	
	if( (n%4==0) && (n%100!=0) || (n%400==0))
	{
		System.out.println("leap year");
	}
	else 
	{
		System.out.println("Not a Leap Year");
	}
	
		
		
		
		
		
		
		

	}

}

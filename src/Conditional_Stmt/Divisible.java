package Conditional_Stmt;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter a nmber");
		num=sc.nextInt();
		
		
		if ((num%5==0) && (num%11==0) )     //Both must true
		{
			System.out.println("num is divisible by 5and 11");
			
		}
		else 
		{
			System.out.println("num is not divisible by 5 and 11");
			
		}
		
		
		
	}

}

package Conditional_Stmt;

import java.util.Scanner;

public class Max_bet_three_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter a number1");
		n1=sc.nextInt();
		
		System.out.println("Enter a number2");
		n2=sc.nextInt();
		
		System.out.println("Enter a number3");
		n3=sc.nextInt();
		
		if((n1>n2 && n1>n3) || (n1>n3 && n2>n3))
		{			System.out.println(" n1 is greater ");

		}
		else if(n2>n3 && n2>n3)
		{
			System.out.println(" n1 is greater ");
		}
		
		else 
		{
			System.out.println(" n3 is greater ");
		}
	}

}

package Conditional_Stmt;
import java.util.Scanner; 
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		if ( num%2==0 )
		{
			System.out.println("even");
			
		}
		else
		{
			System.out.println("odd");
		}
		
		
		
		
		
	}

}

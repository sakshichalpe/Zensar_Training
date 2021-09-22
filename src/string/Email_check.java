package string;
import java.util.Scanner;
public class Email_check {
  public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String mobpat="[0-9] {10}";
		
		String emailpat="[0-9a-zA-Z]+[.][0-9a-zA-Z]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}";
		
		if(str.matches(mobpat))
		{
			System.out.println("Mobile no is not valid");
		}
		else {
			System.out.println("Mobile no is not valid"  );
		}
			}
}

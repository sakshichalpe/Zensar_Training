package Com.Demo.Condition;
import java.util.Scanner;
public class Do_While {
	public static void main(String[] args) {
		
    int n,i=1,mul;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	
	do
	{
		mul= n*i;
		System.out.println(mul);
		i++;
	}while(i<=10);
	}
}
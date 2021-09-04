package Switch;
import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {

		int n1, n2;
		char operator;

		System.out.println("---------------------");
		System.out.println("choose '+' for Addition ");
		System.out.println("choose '-' for Sub");
		System.out.println("choose '*' for Mult");
		System.out.println("choose '/' for Divi");
		System.out.println("choose '#' for Exit");

		Scanner sc = new Scanner(System.in);
		operator = sc.next().charAt(0);

		System.out.println("Enter a number1");
		n1 = sc.nextInt();
		System.out.println("Enter a number2");
		n2 = sc.nextInt();

		switch (operator) {
		case '+':
			System.out.println(" Addition is" + (n1 + n2));
			break;
		case '-':
			System.out.println("Substraction is" + (n1 - n2));
			break;
		case '*':
			System.out.println("Multiplication is  " + (n1 * n2));
			break;
		case '/':
			System.out.println("Division is " + (n1 / n2));
			break;
		default:
			System.out.println("Not valid");
		}

	}

}

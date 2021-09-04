package ClassObject;
import java.util.Scanner;
public class Employee {
	private int id;
	String name;
	double salary;
	int a;

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.getter();
		e.setter();

	Scanner sc=new Scanner(System.in);
    System.out.println("Enter id");
	//sc.nextInt();
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter name");
	sc1.next();
	
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter");
	sc2.nextDouble();
	}
	private void getter(){
	}
	private void setter(){
		
	}
}

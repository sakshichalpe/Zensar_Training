package overloading_static_encapsulation;

public class StaticVaribleAccess {

	static int i=10;
	int a=20;
	
	public static void main(String[] args) {
		System.out.println(StaticVaribleAccess.i);  //static variable
		
		StaticVaribleAccess s=new StaticVaribleAccess();
		System.out.println(s.a); //non static
	}

}

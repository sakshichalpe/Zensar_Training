package overloading_static_encapsulation;

public class Static_Overload {

	public static void add() {
		System.out.println("Static method");
	}
	
	public static void add(int i) {
		System.out.println("Overload Static method " + i);
	}
	
	public static void main(String[] args) {
		Static_Overload.add();
		Static_Overload.add(9);

	}

}

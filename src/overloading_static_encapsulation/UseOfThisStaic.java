package overloading_static_encapsulation;
public class UseOfThisStaic {

	static String name="Zensar";
	
	public static void l1() {
		System.out.println("I am Static method ");
	}
	public static void main(String[] args) {
		System.out.println(UseOfThisStaic.name);
		//System.out.println(this.name);
		//cannot use this in static content
		//System.out.print(UseOfThisStaic.l1(););
	}

}

package Inner_Class_Study;

interface A {                      
	int age=20;
	void age();	
}

public class Anonymous1 {
	
	public static void main(String[] args) {
		A obj=new A() {
			
			public void age() {
				System.out.println(age);
			}
		};
		obj.age();
	}
		
}

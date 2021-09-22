package Inner_Class_Study;
public class DemoOFAll {
	
	
	public void s() {
		System.out.println("s");
	}	
   public static void main(String[] args) {
	   DemoOFAll d=new DemoOFAll();
	   d.s();
		Demo3 demo3 = new Demo3() {
			public void hardwareService() {
				System.out.println("Anonomyous class");
			}	
};
demo3.hardwareService();
   }
   }
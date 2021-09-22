package Inner_Class_Study;

abstract class Demo1 implements Interface_Demo1 {
public abstract void hardwareService();
		}

 abstract class Demo2 extends Demo1{
	 public abstract void hardwareService();
		public void install() {
		System.out.println("Doing install On Laptop");
	}
}
 abstract class Demo3 extends Demo2{
	 public abstract void hardwareService();
		public void installSoftware()
	{
		System.out.println("Doing installaon On Laptop");
	}
		
	}
	

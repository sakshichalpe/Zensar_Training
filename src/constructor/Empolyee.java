package constructor;

public class Empolyee {

	
	public String empName;
	public int empSalary;
	public String address;
	
	
	public Empolyee(String empName,int empSalary,String address) {
		this.empName="Ms.Sharma";
		this.empSalary=1000;
		this.address="Mumbai";
	}
	public Empolyee() {
		this("Ms.Sharma",4354,"Mumbai");
	}
		
	//void display(){
	//	System.out.println();
	//	System.out.println();
      //  System.out.println();

	public static void main(String[] args) {
		Empolyee e=new Empolyee();
		
		
			
		}
	}



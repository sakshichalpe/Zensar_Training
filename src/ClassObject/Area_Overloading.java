package ClassObject;
public class Area_Overloading
{
    double PI=3.14;//,r;
   
	//float side,l,b;
	
public void area(float s) {
	//area=s*s;
	System.out.println("Area of Square is:");
		System.out.println(s*s);
	}
public void area(double l,double b) {
	System.out.println("Area of Rectriangle: ");
		System.out.println(l*b);
	}
public void area(double r) {
	System.out.println("Area of circle is");
	System.out.println(PI*r*r);
}

     public static void main(String[] args) {
    	 
    	 Area_Overloading a=new Area_Overloading();
    	 
		a.area(1.4);
		a.area(1.4,1.5);
		a.area(5.66);
			
		
	}

}

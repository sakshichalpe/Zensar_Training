package excepption;
public class Array_Index extends Avg
{
	public void print() {
		try {
	String a[]={"Raj","Shan","Virat","Mohit"};
	for(int i=0;i<=a.length;i++)
	{
		System.out.println(a[i]);
	}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(" check your index number");
	}
}
public static void main(String[] args) throws Avg{
	   Array_Index arr=new Array_Index();
	   arr.print();
}
}
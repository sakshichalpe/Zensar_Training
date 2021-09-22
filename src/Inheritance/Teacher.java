package Inheritance;
public abstract class Teacher {
    int Tid;
	String Tname;
	String Mb;
	
	Teacher(int a,String b,String c){
		this.Tid=a;
		this.Tname=b;
	    this.Mb=c;	
	}
	abstract void salary();
	
	public static void main(String[] args) {
	
	}
}

package collection;
import java.util.ArrayList;
public class Without_Geerics {
    ArrayList a1=new ArrayList();
	ArrayList a2=new ArrayList();
	
	public void makeList() {
		a1.add(9); a1.add(0);a1.add(7);a1.add(5);a1.add(5);a1.add(4);a1.add(7);
		 a2.add("S");a2.add("A");a2.add("K");a2.add("S");a2.add("H");a2.add("I");
	}
	
public static void main(String[] args) { 
	Without_Geerics w=new Without_Geerics();
	ArrayList a1=new ArrayList();
	ArrayList a2=new ArrayList();
	w.makeList();
	 
	System.out.println(a1);
	System.out.println(a2);
	}

}

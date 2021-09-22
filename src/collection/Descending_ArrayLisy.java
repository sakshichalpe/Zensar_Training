package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class Descending_ArrayLisy {
	public void call(ArrayList a) {
		Iterator<String> itr=a.iterator();
		while(itr.hasNext()) {
			String l= itr.next();
			System.out.println(l);
		}	
	}	
public static void main(String[] args) {
	Descending_ArrayLisy d=new Descending_ArrayLisy();
	ArrayList<String> a=new ArrayList<>();
	a.add("Sakshi");   a.add("Dhoni"); a.add("Sachin");
	
	System.out.println("before sort  :");
	d.call(a);
	
	 System.out.println();
	 
	System.out.println("After sort    :");
	Collections.reverse(a);
	
	d.call(a);
	
}
}

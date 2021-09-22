package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Print_Iterator {
	
	public void a(ArrayList<String> a1) {                   //method
		Iterator<String> itr= a1.iterator();
		while(itr.hasNext()) {
	    	String l=itr.next();
	    	System.out.println(l);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();                    //ArrayList
		Print_Iterator p=new Print_Iterator();                      //Object
		a1.add("Z"); a1.add("E"); a1.add("N"); a1.add("S");a1.add("A");a1.add("R");
		
				a1.add(null);
		//Iterator<String> itr= a1.iterator();
		System.out.println("Before Sorting");
		p.a(a1);
//		while(itr.hasNext()) {
//	    	String l=itr.next();
//	    	System.out.println(l);
//		}
	    System.out.println("After Sorting");
	    	Collections.sort(a1);
	    	p.a(a1);
//	    	while(itr.hasNext()) {
//		    	String l=itr.next();
//		    	System.out.println(l);
			
	    	
	}
	}



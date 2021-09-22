package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Cricketer {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
       a.add("Virath");      a.add("Dhoni");   a.add("Sachin");
       
       System.out.println("After Sort");
           Collections.sort(a);
            
           Iterator<String> i=a.iterator();
        		   while(i.hasNext()) {
        			  String l= i.next();
        			  System.out.println(l);
        		   }
        		  
        		   }
         
	}


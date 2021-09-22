package Map;
import java.util.HashMap;
import java.util.Iterator;
public class HashMap1 {

//	public void print(HashMap h,HashMap hh) {
//		Iterator itr=h.iterator();
//		//Iterator itr=hh.iterator();
//		
//	}
//	
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(1,"Shankar"); h.put(2,"Ganpati"); h.put(1,"Parvati");
	 
		HashMap hh=new HashMap();
		hh.put("Apple", 1);  hh.put("Banana", 1);  hh.put("Mango", 1);
	
		System.out.println(hh);                 System.out.println(h);
		
		HashMap hhh=new HashMap();
	    hhh.put("mountain", 3);        hhh.put("Peak", 4);
	    System.out.println(hhh);  
		
	
	
	}

}

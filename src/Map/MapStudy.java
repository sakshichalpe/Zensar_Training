package Map;
import java.util.*;
public class MapStudy {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		System.out.println(m);
		m.put(42, "Sales");  m.put(43, "Sales");  m.put(40, "Product");
		System.out.println();
		System.out.println(m);
		m.put(42, "Sales");
		
		String str=m.put(42, "Account");
		System.out.println(str);
		System.out.println(m);
	    str=m.get(437);
	    System.out.println(str);
	    str=m.getOrDefault(46, "Sorry wrong input");
	
	    System.out.println(m.remove(42));
	
	    System.out.println(m.containsKey(34));

	     str=m.replace(523, "Account");
	
	
	
	}

}

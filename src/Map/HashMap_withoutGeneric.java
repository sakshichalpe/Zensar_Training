package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashMap_withoutGeneric 
{
   public static void main(String[] args) {
		HashMap<Integer,String> hash=new HashMap<>();
		hash.put(0,"Australia"); 
		hash.put(1,"Landon"); 
		hash.put(2,"Ialand");
		System.out.println(hash);
		//Display using Iterator
		Set<Entry<Integer, String>> set=hash.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
		
		}
	}	
}

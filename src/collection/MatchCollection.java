package collection;
import java.util.ArrayList;
import java.util.LinkedList;
public class MatchCollection{
	
	public boolean match(ArrayList a,LinkedList b) {
	if(a.equals(b)) 
		return true;
	else
		return false;
		
	}
	public static void main(String[] args) {
		MatchCollection m=new MatchCollection();
		ArrayList a=new ArrayList();
		a.add("Sakshi");    a.add("Pooja");     a.add("Radha");  
		
		LinkedList b=new LinkedList();
		b.add("Sakshi");  	b.add("Pooja"); 	b.add("Rahul");
		
		
		System.out.println(a);        System.out.println(b);
		m.match(a, b);
	}
}

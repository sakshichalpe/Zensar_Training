package collection;
import java.util.ArrayList;
public class Function_ArrayList {
	//ArrayList a1=new ArrayList();
	//public void g() {
	//	a1.add(9); a1.add(0);a1.add(7);a1.add(5);a1.add(5);a1.add(4);a1.add(7);
		//a2.add("S");a2.add("A");a2.add("K");a2.add("S");a2.add("H");a2.add("I");
	//}
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<String> a2=new ArrayList<>();
		ArrayList<String> a3=new ArrayList<>();
		
		a1.add(9); a1.add(0);a1.add(7);a1.add(5);a1.add(5);a1.add(4);a1.add(7);
		a2.add("S");a2.add("A");a2.add("K");a2.add("S");a2.add("H");a2.add("I");
        a3.add("H");         a3.add("h");         a3.add("i");        a3.add("I");
		a2.addAll(a3);       a2.removeAll(a1);           a1.retainAll(a3);
		a1.size();           a1.indexOf(6);              a1.indexOf(7); 
        a2.contains(a3);     a1.isEmpty();
        
       for(Integer i:a1) {
        System.out.println(i);
	}
	}
}

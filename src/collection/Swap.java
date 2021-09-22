package collection;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
public class Swap {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(3);      a1.add(7);  a1.add(6);
		
		System.out.println("Before Swapping");
		for (Integer obj : a1) {
			System.out.println(obj);
		}
		
		System.out.println("After Swapping");
		Collections.swap(a1, 2, 0);

		for (Integer obj : a1) {
			System.out.println(obj);
		}
		
		
		
		
	}

}

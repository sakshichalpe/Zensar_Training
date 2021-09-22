package collection;
import java.util.ArrayList;
public class Retain_ArrayList {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		ArrayList<Integer> arr1=new ArrayList<>();
    arr.add("Sakshi"); arr.add("Pratiksha"); arr.add("Prajakta"); arr.add(2);
	arr1.add(1);   arr1.add(2); arr1.add(3); 
	arr.retainAll(arr1);
	System.out.println(arr);
	}

}

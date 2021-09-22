package collection;
import java.util.ArrayList;
public class Remove_From_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
	arr.add("A"); arr.add("B"); arr.add("B");
	arr.remove(0);
	arr.removeAll(arr);
	 System.out.println(arr);
	 
	 
	 
	}

}

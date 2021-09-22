package collection;
import java.util.ArrayList;
import java.util.Collections;
public class Sort_ArrayList {

	//ArrayList<Integer> arr=new ArrayList<>();
//	 
//	public void displayForLoop() {
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr);
//		}
//		}
//	
//	public void displayForEach() {
//		for(Integer f:arr) {
//			System.out.println(f);
//		}
//		}
	
	public static void main(String[] args) {
		Sort_ArrayList ass=new Sort_ArrayList();
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(17); 
		arr.add(28); arr.add(98); arr.add(90);
		arr.set(0, 6);
		arr.remove(1);
		arr.size();
		//ass.displayForEach();
	System.out.println("before Sort");
	
		for(Integer f:arr) {
			System.out.println(f);
		}
	System.out.println("After sort");
		
		Collections.sort(arr);
		for(Integer f1:arr) {
			System.out.println(f1);
		}
		
	}
	

}

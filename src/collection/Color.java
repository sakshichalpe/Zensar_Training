package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		ArrayList<String> arr=new ArrayList<>();
         Iterator itr=arr.iterator();
         while(itr.hasNext()) {
        	 String temp=sc.next();
        	System.out.println(itr.next());
        	
         }
	}

}

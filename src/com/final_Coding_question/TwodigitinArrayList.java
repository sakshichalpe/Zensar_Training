package com.final_Coding_question;
import java.util.*;
public class TwodigitinArrayList {

	public void count(ArrayList<Integer> arr) {
		
		int count=0;
		for(int i=0;i<=arr.size()-1;i++) {
		count++;
	}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(34);
		arr.add(9);
		TwodigitinArrayList v=new TwodigitinArrayList();
		v.count(arr);
		
	}
}

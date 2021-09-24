package com.final_Coding_question;
import java.util.Scanner;
import java.util.*;
public class ReverseString {
			public static void main(String[] args) {
					String orignal;
				String rev="";
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a String");
				orignal=sc.nextLine();
				 
				int len=orignal.length();
				
				for(int i=len-1;i>=0;i--) {
					rev= rev + orignal.charAt(i);
					
				}	
				System.out.println(rev);}  }	
	
	    
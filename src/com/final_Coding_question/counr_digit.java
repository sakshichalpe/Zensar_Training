package com.final_Coding_question;
public class counr_digit {
	
	public static void main(String[] args) {
	int num = 2343252,count = 0;
	while(num!=0) {
		 num=num/10;  
		 count++;	
	}
System.out.println(count);
}
}
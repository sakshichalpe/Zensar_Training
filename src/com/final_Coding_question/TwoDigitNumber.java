package com.final_Coding_question;
import java.util.Scanner;
public class TwoDigitNumber {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter number");
		  int num=sc.nextInt();
		  if(num<=10 || num<=99) 
			 System.out.println("yes");
		  else {
			System.out.println("No");
		}
		  }
			
		}
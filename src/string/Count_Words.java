package string;
import java.util.Scanner;
public class Count_Words {
   public void count() 
	{
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 char ch[]=str.toCharArray();
		 int count =0;
		 String word="";
		 for(int i=0;i<str.length();i++)
		 {
			 if(i==',' || i=='.' || i=='!'|| i==' ') 
			 {
				 System.out.println(word);
				 count++;
				 word="";	 
			 } else {
				 word=word+i;
			 }
		 }
		 System.out.println(word);
		int n=str.compareTo(word);

}
}
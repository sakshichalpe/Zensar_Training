package collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

	public class PlayerwithComparator implements Comparator<PlayerwithComparator>{
		       int run;
		       String name;
		       public PlayerwithComparator() {         //default constructor
					}
			public PlayerwithComparator(int run, String name) {
				
				this.run = run;
				this.name = name;
			}
			 
			@Override
			public String toString() {
				return "PlayerwithComparator [run=" + run + ", name=" + name + "]";
			}
			//Sorting with run by ascending order 
			/*
			 * @Override public int compare(PlayerwithComparator player1,
			 * PlayerwithComparator player2) {
			 * 
			 * 
			 * return -(player1.run-player2.run); }
			 */
			@Override
			public int compare(PlayerwithComparator player1, PlayerwithComparator player2) 
			{	                                                                 
				return-( player1.name.compareTo(player2.name));
			}
		 
			
	}	
		       


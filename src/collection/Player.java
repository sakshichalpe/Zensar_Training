package collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;


public class Player implements  Comparable<Player>{
        int run;
        String name;
        public Player() {
		         
		}
		public Player(int run, String name) {
			
			this.run = run;
			this.name = name;
		}
		public String toString() {
			return "Name: " +name+ " Run:" +run;
		}
	//	public int compareTo(Player a)                       //Sorting on name;
	//	{
	//		  return this.name.compareTo(a.name);
	//	}
		public int compareTo(Player a)                       //Sorting on run;
		{
				 return a.run-this.run;
		}
     
        public static void main(String[] args) {
			ArrayList<Player> p =new ArrayList<>();
			p.add(new Player(34,"Dhoni"));
			p.add(new Player(50,"Sehwag"));
			p.add(new Player(39,"Sachin"));
			p.add(new Player(31,"Virat"));
			p.add(new Player(5,"Shami"));
			System.out.println(p);
			Collections.sort(p);
			System.out.println(p);
	
		}
}

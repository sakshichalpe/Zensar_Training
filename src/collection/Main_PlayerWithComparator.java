package collection;
import java.util.ArrayList;
import java.util.Collections;
public class Main_PlayerWithComparator {

		       public static void main(String[] args) {
		    	   
		    	   ArrayList<PlayerwithComparator> playerlist =new ArrayList<>();
					playerlist.add(new PlayerwithComparator(34,"Dhoni"));
					playerlist.add(new PlayerwithComparator(50,"Sehwag"));
					playerlist.add(new PlayerwithComparator(39,"Sachin"));
					playerlist.add(new PlayerwithComparator(31,"Virat"));
					playerlist.add(new PlayerwithComparator(5,"Shami"));
					System.out.println(playerlist);
					
					Collections.sort(playerlist,new PlayerwithComparator());
					System.out.println(playerlist);
			}

	}



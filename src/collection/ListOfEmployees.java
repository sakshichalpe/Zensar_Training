package collection;
import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.ListIterator;
	public class ListOfEmployees {
		public void display(ArrayList<Employee> l)
		{
			System.out.println("Using for loop .....");
			/*for(int i=0;i<l.size();i++)
			{
				Employee e = l.get(i);
				System.out.println(e);//e.toString();
			}*/
			/*System.out.println("Using for each.....");
			for(Employee e : l)
			{
				System.out.println(e);
				if(e.empName.equals("Vaishnavi"))
						l.remove(e);
			}*/
				System.out.println("Using Iterator ....");
				Iterator<Employee> itr = l.iterator();
				while(itr.hasNext())
				{
				Employee eo = itr.next();
				System.out.println(eo);
				}
				Collections.sort(l);
				
				System.out.println("Using Iterator after sorting ....");
			     itr = l.iterator();
				while(itr.hasNext())
				{
				Employee eo = itr.next();
				System.out.println(eo);
				}
				
			/*	System.out.println("Using List Iterator ....");
				ListIterator<Employee> litr = l.listIterator(l.size());
				while(litr.hasPrevious())
				{
					Employee e = litr.previous();
					System.out.println(e);
				}*/
		}
		
		public static void main(String[] args) {
			ArrayList<Employee> elist = new ArrayList<>();
			elist.add(new Employee(34, "Kartik", 67000.00f));
			elist.add(new Employee(4, "Vaishnavi", 77000.00f));
			elist.add(new Employee(314, "Gaurav", 60000.00f));
			elist.add(new Employee(37, "Lalit", 87000.00f));
			elist.add(new Employee(23, "Shivam", 17000.00f));
			elist.add(new Employee(74, "Kaveri", 67000.00f));
			
			ListOfEmployees o = new ListOfEmployees();
			o.display(elist);
		}

	}



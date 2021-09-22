package collection;
	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	public class CallReceiverApp
	{
		int a;
		ArrayList<String> l = new ArrayList<>();
		static ArrayList<Integer> l1 =new ArrayList<>();
		ArrayList l3= new ArrayList();
		public CallReceiverApp() {
		}
	   public void makeList()
	   {
		   l3.add("Mr.X");
		   l3.add("Mr.y");
		   l3.add(56);
		   l3.add(98);
		   l3.add("Mr.Z");
		   l3.add(34);
		   System.out.println(l3);
		   for( Object o : l3)  
		   {
			   if(o instanceof String)
				   l.add((String)o);
			   else if(o instanceof Integer)
				   l1.add((Integer)o);
		   }
		  System.out.println("List l : "  + l);
		  System.out.println("List l1 : "  + l1);
	   }
	   public void showMinimun(ArrayList<Integer> list)
	   {
		   int min= list.get(0);
		   for(int i=1;i<list.size();i++)
		   {
			   if(list.get(i)<min)
				   min=list.get(i);
		   }
		   System.out.println("Minimum of all Elements : " + min);
	   }
	   
		public static void main(String[] args) {
			
			CallReceiverApp o = new CallReceiverApp();
			//o.makeList();
			//o.showMinimun(CallReceiverApp.l1);		
			ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(45);
			list1.add(56);
			list1.add(23);
			list1.add(56);
			System.out.println(list1);
			Collections.sort(list1);
			System.out.println(list1);
			
			ArrayList<String> list2 = new ArrayList<>();
			list2.add("sdf");
			list2.add("kkk");
			list2.add("qqq");
			list2.add("appp");
			System.out.println(list2);
			Collections.sort(list2);
			System.out.println(list2);	
			
			
		}

	}



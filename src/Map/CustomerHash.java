package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

	public class CustomerHash {
		int cust_id;
		 String cust_order;
		 public CustomerHash()
		 {
			 
		 }
		 public CustomerHash(int cust_id,String cust_order) 
		 {
			 // TODO Auto-generated constructor stub
			 this.cust_id=cust_id;
			 this.cust_order=cust_order;
		}
		@Override
		public String toString() {
			return "cust_id=" + cust_id + ", cust_order=" + cust_order ;
		}
		@Override
		public int hashCode() {
			final int ans;
			ans=cust_id+cust_order.hashCode();
			return ans;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CustomerHash other = (CustomerHash) obj;
			return cust_id == other.cust_id && Objects.equals(cust_order, other.cust_order);
		}
		
	} 
	class CustomerHashing
	{
		public static void main(String[] args) {
			
		
		HashMap<CustomerHash,String> hashmap=new HashMap<>();
		
		CustomerHash c1=new CustomerHash(101, "laptop");
		CustomerHash c2=new CustomerHash(101, "laptop");
		CustomerHash c3=new CustomerHash(102, "Pc");
		hashmap.put(c1,"14 th September");

		hashmap.put(c2,"16 th September");
		hashmap.put(c3,"17 th September");
		Set<CustomerHash> kset=hashmap.keySet();
		Iterator<CustomerHash> itr=kset.iterator();
		while(itr.hasNext())
		{
			CustomerHash cm=itr.next();
			String Date=hashmap.get(cm);
			System.out.println(cm+" Delevered By "+Date);
		}
		/*TreeMap<CustomerHash,String> thash=new TreeMap<>();
		thash.put(c1, "14th Sept");
		thash.put(c2, "15th Sept");
		thash.put(c3, "16th Sept");
		Set<CustomerHash> kset=hashmap.keySet();
		Iterator<CustomerHash> itr=kset.iterator();
		while(itr.hasNext())
		{
			CustomerHash cm=itr.next();
			String Date=hashmap.get(cm);
			System.out.println(cm+" Delevered By "+Date);
		}*/
		
		
		
		
		}
	}


package ClassObject;

public class Getter_Setter {

	
		       private int id;
		       private String name;
		      
		       public void setId(int i){
		    	  id=i; 
		       }
		       public void setName(String n){
		    	   name=n;
		       }
		       public int getId()
		       {
		    	   return id;
		       }
		       public String getName(){
		    	   return name;
		       }
		       
		     
		       public static void main(String[] args) 
		   	{
		    	   Getter_Setter gs=new Getter_Setter();
		    	   gs.setId(1);
		    	   gs.setName("Pooja");
		    	   
		    	   System.out.println(gs.getId());
		    	   System.out.println(gs.getName());
		    	   
		   	}
		       
		
		
		
		
		
}

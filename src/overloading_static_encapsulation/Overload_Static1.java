package overloading_static_encapsulation;
public class Overload_Static1 {
  
    static String compant_name;
   static int  a=3;
   static int b=4;
    
    
    public static void add(int a,int b){
          
        System.out.println("Its a ststic method" + a);
    }
    
    public static void add1(float a,float b){
        
        
        System.out.println("Its a ststic method");
    }
    
    public static void main(String[] args) {
       String a=Overload_Static1.compant_name="Zensar";
        System.out.println(a);
        Overload_Static1.add(4,8);
    }
    
}

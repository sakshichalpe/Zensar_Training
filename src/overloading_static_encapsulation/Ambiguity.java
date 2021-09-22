package overloading_static_encapsulation;
public class Ambiguity {
    public void a1(int a,int b){
        
    }
    public void a1(int a,float b){
        System.out.println(a + b);
    }
    public void a1(float a,int b){
        System.out.println();
    }
    public void a1(float c){
        
    }
    public static void main(String[] args)
    {
        Ambiguity amb=new Ambiguity();
        amb.a1(3,4);
        amb.a1(3.4f,5);
        amb.a1(6.8f);
        amb.a1(8,9.7f);
        //amb.a1();
        //amb.a1.{3.4f,6.4f);
    }
    }
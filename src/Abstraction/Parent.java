package Abstraction;
public abstract class Parent {
    
    Parent(String d, String s){
        System.out.println(" Daughter name is " + d +" Son name is " + s);
    }
    
    public abstract void cook();
    
    public void wash(){
        System.out.println("Parent.wash()");
        
    }

    public static void main(String[] args) {
   
}
}

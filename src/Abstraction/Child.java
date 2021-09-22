package Abstraction;
public class Child extends Parent{

    @Override
    public void cook() {
        System.out.println("Child.cook()");
        
    }

    public Child() {
        super("Raddha","Sagar");
    }
   
    public static void main(String[] args) {
   Parent p=new Child();
   p.cook();
   p.wash();
   //super("Raddha","Sagar");
}
}

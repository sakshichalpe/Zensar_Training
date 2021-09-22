package Abstraction;

public class Mixer extends Machine{
    public  void rush(){
        System.out.println("Mixer.rush()");
    }
    public void blend(){
        System.out.println("Mixer.blend()");
    }
    @Override
     public void rotate(){
        System.out.println("Mixer.rotate()");
     }

   public static void main(String[] args) {
   Mixer m= new  Mixer();
   m.blend();
   m.rush();
   m.rotate();
}
}

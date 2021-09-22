package overloading_static_encapsulation;

public class Student_this {
   
    public static int  t=5;
    int roll_no;
    String name;
    float fee;
    
    Student_this(int roll_no,String name,float fee){
        this.fee=fee;
        this.name=name;
        this.roll_no=roll_no;
    }
    void display(){
        System.out.println(roll_no +" , " + name +" , " + fee);
    }
    
    public static void main(String[] args) {
           Student_this s=new Student_this(1,"sakshi",8.5f);
            s.display();
        
    }
}
package overloading_static_encapsulation;
public class Overloading_Student {
    void student(char course_Id ){
        System.out.println("" +  course_Id);
    }
    void student(int phone_no){
        System.out.println("" + phone_no );
    }
  void student (String address){
        System.out.println("" + address);
    }
  
    public static void main(String[] args) {
        Overloading_Student o=new Overloading_Student();
        o.student('A');
        o.student(924567890);
        o.student("Ambazary road");
        
        
    }
}
package overloading_static_encapsulation;
public class Employee 
{
int employee_id;
String name;
double salary;

Employee(int a,String b,double c)
{
    this.employee_id=a;
    this.name=b;
    this.salary=c;
    
}
public void display(){
    
    
}

public static void totalEmp()
{
    System.out.println("overloading_static_encapsulation.Employee.totalEmp()");
}
    public static void main(String[] args) {
     
        System.out.println("overloading_static_encapsulation.Employee.main()");
    }
}

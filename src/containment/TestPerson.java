package containment;
public class TestPerson {

	public static void main(String[] args) {
		//TestPerson t=new TestPerson();
		Person personobj=new Person(4,"skhkj");
		personobj.objAdd=new Address("Nagpur","Maha","India");

	}
	public static void display(Person personobj) {
		System.out.println("PersonId: "+personobj.getPerId() );
		System.out.println(personobj.getPerName());
		System.out.println(personobj.objAdd);
		System.out.println(personobj.getObjAdd());
		
	}
}

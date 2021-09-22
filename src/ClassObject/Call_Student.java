package ClassObject;

public class Call_Student {

	public static void main(String[] args) {
		Student s=new Student();
		s.rollno=10;
		/*s.admissionNo=1701923;       private not allowed*/
		s.age=16;
		s.courseId = "GE1234";
		
		s.doprotected();
		 /* s.doprivate();     */       
		s.doPublic();
		s.doDefault();
	}

}

package course_enrollment_system;

public class EducationInstituteApp {
public static void main(String[] args) {
	Course c1 = new Course(101,"Oracle",7500);
	Course c2 = new Course(102,".Net",10000);
	Course c3 = new Course(103,"SAP",5000);
	Offer of = new Offer("Special discount: Get 20% off on all courses...");
	EducationInstitute e = new EducationInstitute
			(new Course[] {c1,c2,c3},new Offer[] {of});
	   Student s1 = new Student("sairam",e);
	   Student s2 = new Student("Shiva",e);
	   Thread t1 = new Thread(s1);
	   Thread t2 = new Thread(s2);
	   t1.start();
	   try {
		   t1.join();
	   }
	   catch(InterruptedException ie) {
		   ie.printStackTrace();
	   }
	   s1.enrollInCourse(102);
	t2.start();
	try {
		t2.join();
	}
	catch(InterruptedException ie1) {
		ie1.printStackTrace();
	}
	s2.enrollInCourse(103);
}
}

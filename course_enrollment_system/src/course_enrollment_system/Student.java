package course_enrollment_system;

public class Student implements Runnable{
	private String name;
	private EducationInstitute institute;
	Course courses;
	Offer Offers;
	public Student(String name, EducationInstitute institue) {
		this.name = name;
		this.institute = institue;
	}
	public synchronized void viewCoursesAndFees() {
		Course []arr = institute.getCourses();
		for(Course c : arr) {
			System.out.println("Course ID is: "+c.getCourseId()+" "+c.getCourseName()+" It's fee is: "+c.getCourseFee());
		}
	}
	public synchronized void viewOffers() {
		Offer []arr1 = institute.getOffers();
		for(Offer off : arr1) {
			System.out.println(off.getOfferText());
		}
	}
	public synchronized void enrollInCourse(int courseId) {
		Course []arr3 = institute.getCourses();
		for(Course arr1 : arr3) {
			if(arr1.getCourseId()==courseId) {
				System.out.println(name+" is enrolled for "+arr1.getCourseName()+" course");
				return;
			}
		}
	}
	@Override
	public void run() {
		viewCoursesAndFees();
		viewOffers();
		
		
	}
}

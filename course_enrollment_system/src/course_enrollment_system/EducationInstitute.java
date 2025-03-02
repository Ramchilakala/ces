package course_enrollment_system;

public class EducationInstitute {
	Student students;
	private Course[] courses;
	private Offer[] offers;

	public EducationInstitute(Course[] courses, Offer[] offers) {
		this.courses = courses;
		this.offers = offers;
	}
public Course[] getCourses() {
	return courses;
}
public Offer[] getOffers() {
    return offers;
}
public void enrollStudentInCourse(int courseId, String studentName) {
	for(Course x:courses) {
		if(x.getCourseId()==courseId) {
			
		}
	}
	
}
}

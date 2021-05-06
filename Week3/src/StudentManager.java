
public class StudentManager extends UserManager {
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" derse katıldı");
	}
	public void leaveCourse(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " dersten çıktı");
	}
	

}

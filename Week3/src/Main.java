
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@gma");
		instructor1.setCourseName("Java");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setFirstName("Furkan");
		student1.setLastName("Sağ");
		student1.setEmail("furkan@gma");
		student1.setCourseNumber(1);
		
		User[] users= {instructor1,student1};
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
		
		UserManager userManager=new UserManager();
		userManager.login(student1);
		
		InstructorManager instructionManager=new  InstructorManager();
		instructionManager.addingHomework(instructor1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.joinCourse(student1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

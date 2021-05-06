
public class Student extends User {
	private int courseNumber;
	private int completeRate;
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCompleteRate() {
		return 100-(100-completeRate);
	}

}

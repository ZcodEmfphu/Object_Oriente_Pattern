package labs1;

public class Register {
	private Course course;
	private double grade;

	public Register(Course course) {
		super();
		this.course = course;

	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "\n=================================================================" + "Register: \n" + course
				+ "\nGrade:" + grade;
	}

}

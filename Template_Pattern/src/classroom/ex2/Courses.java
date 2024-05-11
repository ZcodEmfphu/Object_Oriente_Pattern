package classroom.ex2;

public abstract class Courses {

	public final void conductCourse() {
		registerStudents();
		conductSession();
		gradeStudents();
		takeAttendance();
		submitAssignments();
	}

	protected void registerStudents() {
		System.out.println("Student MinhPhu is register this Cousre !");
	}

	protected abstract void conductSession();

	protected abstract void gradeStudents();

	protected void takeAttendance() {
		System.out.println("Student MinhPhu is Taking attendance");
	}

	protected void submitAssignments() {
		System.out.println("Student MinhPhu is Submitting assignments");
	}
}

package classroom.ex2;

public class CourseTest {

	public static void main(String[] args) {

		Lecture lecture = new Lecture();
		Lab lab = new Lab();
		Seminar seminar = new Seminar();

		System.out.println("\nConducting lecture course:");
		lecture.conductCourse();

		System.out.println("\nConducting lab course:");
		lab.conductCourse();

		System.out.println("\nConducting seminar course:");
		seminar.conductCourse();
	}
}

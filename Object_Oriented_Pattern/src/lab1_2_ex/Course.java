package lab1_2_ex;

import java.util.List;

public class Course {

	private String name;
	private String code;
	private int creditHours;
	private List<Student> enrolledStudents;

	public Course(String name, String code, int creditHours) {
		this.name = name;
		this.code = code;
		this.creditHours = creditHours;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public void setGradesForStudent(Student student, String grades) {
		for (Student enrolledStudent : enrolledStudents) {
			if (enrolledStudent.equals(student)) {
				enrolledStudent.setGrades(grades);
				System.out.println("Grades entered for student " + student.getName() + " in course " + name);
				return;
			}
		}
		System.out.println("Student " + student.getName() + " is not enrolled in this course.");
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", code=" + code + ", creditHours=" + creditHours + "]";
	}

}

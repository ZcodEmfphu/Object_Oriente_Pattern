package lab1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String studentID;
	private String emailAddress;
	private String grades;

	public Student(String name, String studentID, String emailAddress, String grades, List<Course> enrolledCourses) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.emailAddress = emailAddress;
		this.grades = grades;
		this.enrolledCourses = enrolledCourses;
	}

	private List<Course> enrolledCourses;

	public Student(String name, String studentID, String emailAddress) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.emailAddress = emailAddress;
		this.enrolledCourses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void enrollInCourse(Course course) {
		enrolledCourses.add(course);
	}

	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", emailAddress=" + emailAddress + "]";
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	public void setEnrolledCourses(List<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}

}

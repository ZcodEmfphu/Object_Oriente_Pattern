package lab1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyITCenrter_Ex2 {

	private List<Student> studentList = new ArrayList<Student>();
	private List<Course> courseList = new ArrayList<Course>();
	private List<Program> programList = new ArrayList<Program>();

	public MyITCenrter_Ex2() {
		init();
	}

	public void init() {

		Course c1 = new Course("Java Basic", "100123", 4);
		Course c2 = new Course("Java Advance", "100124", 4);
		Course c3 = new Course("Java Special", "100125", 4);

		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);

		Student s1 = new Student("DoMinhPhu", "20130365", "20130365@st.hcmuaf.edu.vn");

		studentList.add(s1);

		Program p1 = new Program("Program1", courseList);
		Program p2 = new Program("Program2", courseList);

		programList.add(p1);
		programList.add(p2);

	}

	public void displayMenu() {
		System.out.println("Menu:");
		System.out.println("1. Enroll a student in a program");
		System.out.println("2. Enroll a student in a course");
		System.out.println("3. Enter grades for a student");
		System.out.println("4. Display student's transcript");
		System.out.println("5. Exit");
	}

	private Student findStudent(String studentName, String studentId) {
		for (Student student : studentList) {
			if (student.getName().equals(studentName) && student.getStudentID().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

	private Course findCourse(Student student, String courseCode) {
		for (Course course : student.getEnrolledCourses()) {
			if (course.getCode().equals(courseCode)) {
				return course;
			}
		}
		return null;
	}

	private void displayAvailableCourses() {
		System.out.println("Available Courses:");
		for (int i = 0; i < courseList.size(); i++) {
			Course course = courseList.get(i);
			System.out.println((i + 1) + ". " + course.getName() + " (" + course.getCode() + ")");
		}
	}

	private int promptForCourseSelection() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the course number to enroll in (1-" + courseList.size() + "): ");
		int courseNumber = scanner.nextInt();
		if (courseNumber < 1 || courseNumber > courseList.size()) {
			return -1;
		}
		return courseNumber;
	}

	private Course getSelectedCourse(int courseNumber) {
		return courseList.get(courseNumber - 1);
	}

	private void enrollStudent(String studentName, String studentId, Course selectedCourse) {
		Student student = findStudent(studentName, studentId);
		if (student != null) {
			student.enrollInCourse(selectedCourse);
			System.out.println("Student " + studentName + " enrolled in course " + selectedCourse.getName());
		} else {
			System.out.println("Student not found.");
		}
	}

	public void enrollStudentInProgram(String studentName, String studentId) {
		System.out.println("Available Programs:");
		for (Program program : programList) {
			System.out.println(program.getName());
		}
		Program selectedProgram = programList.get(0);
		Student student = findStudent(studentName, studentId);
		if (student != null) {
			selectedProgram.getCourses().forEach(student::enrollInCourse);
			System.out.println("Student " + studentName + " enrolled in program " + selectedProgram.getName());
		} else {
			System.out.println("Student not found.");
		}
	}

	public void enrollStudentInCourse(String studentName, String studentId) {
		displayAvailableCourses();
		int courseNumber = promptForCourseSelection();
		if (courseNumber == -1) {
			System.out.println("Invalid course number.");
			return;
		}
		Course selectedCourse = getSelectedCourse(courseNumber);
		enrollStudent(studentName, studentId, selectedCourse);
	}

	public void enterGradesForStudent(String studentName, String studentId, String courseCode, String grades) {
		Student student = findStudent(studentName, studentId);
		if (student == null) {
			System.out.println("Student not found.");
			return;
		}
		Course course = findCourse(student, courseCode);
		if (course == null) {
			System.out.println("Course not found.");
			return;
		}
		course.setGradesForStudent(student, grades);
		System.out.println("Grades entered for student " + studentName + " in course " + course.getName());
	}

	public void displayStudentTranscript(String studentName, String studentId) {
		for (Student student : studentList) {
			if (student.getName().equals(studentName) && student.getStudentID().equals(studentId)) {
				System.out.println("Student Transcript for " + studentName);
				for (Course course : student.getEnrolledCourses()) {
					System.out.println(course.getName() + " (" + course.getCode() + "): " + student.getGrades());
				}
				return;
			}
		}
		System.out.println("Student not found.");
	}

	public void exitSystem() {
		System.out.println("Exiting the system. Goodbye!");
		System.exit(0);
	}

	public void UniversityManagementSystem() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			displayMenu();

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter student's name: ");
				String name = scanner.nextLine();
				System.out.print("Enter student's ID: ");
				String id = scanner.nextLine();
				enrollStudentInProgram(name, id);
				break;
			case 2:
				System.out.print("Enter student's name: ");
				String name2 = scanner.nextLine();
				System.out.print("Enter student's ID: ");
				String id2 = scanner.nextLine();
				enrollStudentInCourse(name2, id2);
				break;
			case 3:
				System.out.print("Enter student's name: ");
				String name3 = scanner.nextLine();
				System.out.print("Enter student's ID: ");
				String id3 = scanner.nextLine();
				System.out.print("Enter course code: ");
				String code = scanner.nextLine();
				System.out.print("Enter grades: ");
				String grades = scanner.nextLine();
				enterGradesForStudent(name3, id3, code, grades);
				break;
			case 4:
				System.out.print("Enter student's name: ");
				String name4 = scanner.nextLine();
				System.out.print("Enter student's ID: ");
				String id4 = scanner.nextLine();
				displayStudentTranscript(name4, id4);
				break;
			case 5:
				exitSystem();
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		} while (choice != 5);
	}

	public static void main(String[] args) {
		MyITCenrter_Ex2 myITCenrter = new MyITCenrter_Ex2();
		myITCenrter.UniversityManagementSystem();
	}
}

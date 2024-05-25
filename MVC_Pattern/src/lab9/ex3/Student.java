package lab9.ex3;

public class Student {
	private String studentID;
	private String fullName;
	private String dateOfBirth;

	public Student(String studentID, String fullName, String dateOfBirth) {
		this.studentID = studentID;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
}

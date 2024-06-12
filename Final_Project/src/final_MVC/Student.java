package final_MVC;

import java.util.Date;

public class Student extends Person {

	private double avgGrade;

	public Student(String id, String name, Date dob) {
		super(id, name, dob);
		// TODO Auto-generated constructor stub
		this.avgGrade = 0;
	}

	public void setStudent(String id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	@Override
	public String toString() {
		return "Student  [ id=" + id + ", name=" + name + ", dob=" + dob + " ,avgGrade=" + avgGrade + "]";
	}

}

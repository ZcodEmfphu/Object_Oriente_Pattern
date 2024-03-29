package lab1;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private Date dayOfBirth;
	private Lecture lecture;
	private List<Register> courseRegister = new ArrayList<Register>();

	public Student(String name, Date dayOfBirth) {
		super();
		this.name = name;
		this.dayOfBirth = dayOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public Lecture getLecture() {
		return lecture;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public List<Register> getCourseRegister() {
		return courseRegister;
	}

	public void courseRegister(List<Register> courseList) {
		this.courseRegister = courseList;
	}

	public void register(Course c) {
		courseRegister.add(new Register(c));
	}

	public void updateGrade(Course c, float grade) {
		for (Register r : courseRegister) {
			if (r.getCourse().getName().equals(c.getName())) {
				r.setGrade(grade);
				break;
			}
		}
	}

	public float averageOfGrade() {
		float sum1 = 0;
		float sum2 = 0;
		for (Register r : courseRegister) {
			sum1 += r.getGrade() * r.getCourse().getCredit();
			sum2 += r.getCourse().getCredit();
		}
		return sum1 / sum2;
	}

	public String rank() {
		float average = averageOfGrade();
		if (average >= 9) {
			return "Xuat sac";
		} else if (average >= 8) {
			return "Gioi";
		} else if (average >= 7) {
			return "Kha";
		} else if (average >= 6) {
			return "Trung binh kha";
		} else if (average >= 5) {
			return "Trung Binh";
		}
		return "Khong duoc tot nghiep";
	}

	public void printGradeReport() {
		System.out.println("Name: " + getName());
		System.out.println("Date of Birth: " + getDayOfBirth());
		System.out.println("STT\tMon\t\t\tDiem");
		for (int i = 0; i < courseRegister.size(); i++) {
			System.out.println(
					i + "\t" + courseRegister.get(i).getCourse().getName() + "\t" + courseRegister.get(i).getGrade());
		}
		System.out.println("Average of grade: " + averageOfGrade());
		System.out.println("Rank: " + rank());
		System.out.println("----------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dayOfBirth=" + dayOfBirth + ", lecture=" + lecture + ", courseList="
				+ courseRegister + "]";
	}

}

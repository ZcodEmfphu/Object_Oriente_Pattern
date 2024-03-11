package labs1;

public class Lecture {
	private String name;
	private Date dayOfBirth;
	private String degree;

	public Lecture(String name, Date dayOfBirth, String degree) {
		super();
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.degree = degree;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Lecture [Name: " + name + ", DayOfBirth: " + dayOfBirth + ", Degree: " + degree + "]";
	}

}

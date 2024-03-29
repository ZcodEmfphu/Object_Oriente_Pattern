package lab1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Program {

	private String name;
	private List<Course> courseList = new ArrayList<Course>();

	public Program(String name, List<Course> courseList) {
		super();
		this.name = name;
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public void addCourse(Course course) {
		courseList.add(course);
	}

	public List<Course> getCourses() {
		return courseList;
	}

	@Override
	public String toString() {
		return "Program [name=" + name + ", courseList=" + courseList + "]";
	}

}

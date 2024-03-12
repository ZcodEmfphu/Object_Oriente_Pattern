package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import labs1.Course;
import labs1.Date;
import labs1.Lecture;
import labs1.MyITCenter;
import labs1.Register;
import labs1.Student;

public class Labs1Test {

	@Test
	public void test() {

		List<Lecture> lectureList = new ArrayList<Lecture>();
		List<Student> studentList = new ArrayList<Student>();
		List<Course> courseList = new ArrayList<Course>();

		Lecture as1 = new Lecture("Tran Thi Thanh Nga", new Date(1, 1, 2000), "Master");
		Lecture as2 = new Lecture("Pham Van Tinh", new Date(1, 1, 1990), "Doctor");
		Lecture as3 = new Lecture("Nguyen Duc Cong Song", new Date(1, 1, 2000), "Master");

		lectureList.add(as1);
		lectureList.add(as2);
		lectureList.add(as3);

		Course c1 = new Course("Java Basic", 4, as3);
		Course c2 = new Course("Advance Programing", 4, as1);
		Course c3 = new Course("Network Programing", 4, as2);
		Course c4 = new Course("Object Oriented Partten", 4, as1);
		Course c5 = new Course("Advance Programing", 4, as2);

		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		courseList.add(c4);
		courseList.add(c5);

		Student s1 = new Student("Nguyen Van Tuan", new Date(1, 1, 2002));
		Student s2 = new Student("Tran Van Thiet", new Date(1, 1, 2002));
		Student s3 = new Student("Nguyen Thi Lan", new Date(1, 1, 2002));
		Student s4 = new Student("Nguyen Thi Truc", new Date(1, 1, 2002));
		Student s5 = new Student("Vo Tan Doi", new Date(1, 1, 2002));
		Student s6 = new Student("Do The Sang", new Date(1, 1, 2002));

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);

		s1.register(c1);
		s1.register(c2);
		s1.register(c3);

		s2.register(c2);
		s2.register(c3);
		s2.register(c4);

		s3.register(c1);
		s3.register(c2);
		s3.register(c3);
		s3.register(c4);

		s4.register(c1);
		s4.register(c3);
		s4.register(c4);

		s5.register(c1);
		s5.register(c2);
		s5.register(c3);
		s5.register(c4);

		s6.register(c1);
		s6.register(c2);

		s1.updateGrade(c1, 6);
		s1.updateGrade(c2, 7);
		s1.updateGrade(c3, 8);

		s2.updateGrade(c2, 8.5f);
		s2.updateGrade(c3, 5);
		s2.updateGrade(c4, 7);

		s3.updateGrade(c1, 4);
		s3.updateGrade(c2, 7.5f);
		s3.updateGrade(c3, 8);
		s3.updateGrade(c4, 10);

		s4.updateGrade(c1, 8);
		s4.updateGrade(c3, 3);
		s4.updateGrade(c4, 6);

		s5.updateGrade(c1, 5);
		s5.updateGrade(c2, 4);
		s5.updateGrade(c3, 6);
		s5.updateGrade(c4, 8);

		s6.updateGrade(c1, 5);
		s6.updateGrade(c2, 8);

		assertTrue(c1.equals(c1));
		assertFalse(c1.equals(c3));
		assertTrue(c2.equals(c5));

//		MyITCenter.printList(courseList);

	}

}

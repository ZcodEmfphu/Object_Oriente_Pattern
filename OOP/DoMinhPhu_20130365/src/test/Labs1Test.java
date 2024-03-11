package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import labs1.Course;
import labs1.Date;
import labs1.Lecture;
import labs1.Register;
import labs1.Student;

public class Labs1Test {

	@Test
	public void test() {

		Lecture as1 = new Lecture("Tran Thi Thanh Nga", new Date(1, 1, 2000), "Master");
		Lecture as2 = new Lecture("Pham Van Tinh", new Date(1, 1, 1990), "Doctor");
		Lecture as3 = new Lecture("Nguyen Duc Cong Song", new Date(1, 1, 2000), "Master");

		Course c1 = new Course("Java Basic", 4, as3);
		Course c2 = new Course("Advance Programing", 4, as1);
		Course c3 = new Course("Network Programing", 4, as2);
		Course c4 = new Course("Object Oriented Partten", 4, as1);
		Course c5 = new Course("Advance Programing", 4, as2);
		Course c6 = new Course(null, 0, as1);

		Student s1 = new Student("Nguyen Van Tuan", new Date(1, 1, 2002));
		Student s2 = new Student("Tran Van Thiet", new Date(1, 1, 2002));
		Student s3 = new Student("Nguyen Thi Lan", new Date(1, 1, 2002));
		Student s4 = new Student("Nguyen Thi Truc", new Date(1, 1, 2002));

		s1.register(c1);
		s1.register(c2);
		s1.register(c3);
		s1.register(c4);

		s1.updateGrade(c1, 7);
		s1.updateGrade(c2, 7.8f);
		s1.updateGrade(c3, 6.7f);
		s1.updateGrade(c4, 8);

		s1.printGradeReport();

		assertTrue(c1.equals(c1));
		assertFalse(c1.equals(c3));
		assertTrue(c2.equals(c5));
		assertFalse(c1.equals(c6));
	}

}

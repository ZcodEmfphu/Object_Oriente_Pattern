package final_MVC;

import java.util.Date;

public class StudentCenter {

	public static void main(String[] args) {
		Student st1 = new Student("365", "Do Minh Phu", new Date(102, 4, 13));
		Student st2 = new Student("422", "Trieu Anh Thu", new Date(102, 1, 21));

		StudentList list = new StudentList();
		list.addStudent(st1);
		list.addStudent(st2);
		
		ControllerInterface controllerInterface = new StudentController(list);
		System.out.println(list);
	}
}

package final_MVC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentList {

	private List<Student> listStudent;

	public StudentList() {
		super();
		this.listStudent = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		listStudent.add(student);
	}

	public void removeStudent(String id) {
		// TODO Auto-generated method stub
		for (Student items : listStudent) {
			if (id.equals(items.id)) {
				listStudent.remove(items);
			}
		}
	}

	public void updateStudent(String id, String name, Date dob) {
		for (Student items : listStudent) {
			if (id.equals(items.id)) {
				items.setStudent(id, name, dob);
			}
		}
	}

	public Student findStudent(String id) {
		for (Student items : listStudent) {
			if (id.equals(items.id)) {
				return items;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Student items : listStudent) {
			sb.append(items + "\n");
		}
		return sb.toString();
	}

}

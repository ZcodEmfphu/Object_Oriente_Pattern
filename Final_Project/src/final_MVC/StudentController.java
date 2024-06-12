package final_MVC;

import java.util.Date;

public class StudentController implements ControllerInterface {

	private StudentList model;
	private StudentView view;
	
	

	public StudentController(StudentList model) {
		super();
		this.model = model;
		this.view = new StudentView(this, model);
	}

	@Override
	public void addStudent(String id, String name) {
		// TODO Auto-generated method stub
		Student student = new Student(id, name, null);
		model.addStudent(student);
		view.updateList(model.toString());
	}

	@Override
	public void removeStudent(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(String id, String name, Date dob) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findStudent(String id) {
		// TODO Auto-generated method stub

	}

}

package final_MVC;

import java.util.Date;

public interface ControllerInterface {

	public void addStudent(String id, String name);

	public void removeStudent(String id);

	public void updateStudent(String id, String name, Date dob);

	public void findStudent(String id);
}

package classroom.ex3;

import java.util.Iterator;

public class Task extends WorkflowComponent {

	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executing Task: " + name);
	}

	@Override
	public Iterator<WorkflowComponent> iterator() {
		return null;
	}

}

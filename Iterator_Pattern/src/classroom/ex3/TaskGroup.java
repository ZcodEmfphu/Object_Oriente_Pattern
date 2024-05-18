package classroom.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TaskGroup extends WorkflowComponent {

	private String name;
	private List<WorkflowComponent> children = new ArrayList<>();

	public TaskGroup(String name) {
		this.name = name;
	}

	public void add(WorkflowComponent w) {
		children.add(w);
	}

	public void remove(WorkflowComponent w) {
		children.remove(w);
	}

	@Override
	public void execute() {
		System.out.println("Execute Task Group: " + name);
		for (WorkflowComponent component : children) {
			component.execute();
		}
		System.out.println();
	}

	@Override
	public Iterator<WorkflowComponent> iterator() {
		return new TaskGroupIterator(children.iterator());
	}

}

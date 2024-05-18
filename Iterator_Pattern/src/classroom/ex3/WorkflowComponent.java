package classroom.ex3;

import java.util.Iterator;

public abstract class WorkflowComponent {

	public void add(WorkflowComponent w) {
		throw new UnsupportedOperationException();
	}

	public void remove(WorkflowComponent w) {
		throw new UnsupportedOperationException();
	}

	public abstract void execute();

	public abstract Iterator<WorkflowComponent> iterator();
}

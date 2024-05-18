package classroom.ex3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class TaskGroupIterator implements Iterator<WorkflowComponent> {
	private Stack<Iterator<WorkflowComponent>> stack = new Stack<>();

	public TaskGroupIterator(Iterator<WorkflowComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<WorkflowComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				WorkflowComponent component = iterator.next();
				if (component instanceof TaskGroup) {
					stack.push(component.iterator());
				}
				return true;
			}
		}
	}

	@Override
	public WorkflowComponent next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		} else {
			return stack.peek().next();
		}
	}

}

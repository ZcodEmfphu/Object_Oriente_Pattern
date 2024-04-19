package lab5.ex5;

import java.util.Iterator;
import java.util.List;

public class Task implements ProjectItem {
	private String name;
	private List<ProjectItem> projectItems;
	private Contact owner;
	private double timeRequired;

	public Task(String newName, Contact newOwner, double newTimeRequired) {
		super();
		this.name = newName;
		this.owner = newOwner;
		this.timeRequired = newTimeRequired;
	}

	@Override
	public double getTimeRequire() {
		double totalTime = timeRequired;
		Iterator<ProjectItem> items = projectItems.iterator();
		while (items.hasNext()) {
			ProjectItem item = items.next();
			totalTime += item.getTimeRequire();
		}
		return totalTime;
	}

	public String getName() {
		return name;
	}

	public List<ProjectItem> getProjectItems() {
		return projectItems;
	}

	public Contact getOwner() {
		return owner;
	}

	public double getTimeRequired() {
		return timeRequired;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setOwner(Contact newOwner) {
		this.owner = newOwner;
	}

	public void setTimeRequired(double timeRequired) {
		this.timeRequired = timeRequired;
	}

	public void addProjectItem(ProjectItem element) {
		projectItems.add(element);
	}

	public void removeProjectItem(ProjectItem element) {
		projectItems.remove(element);
	}

	@Override
	public String toString() {
		return "Task: " + name;
	}

}

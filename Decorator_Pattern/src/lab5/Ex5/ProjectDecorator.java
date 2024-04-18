package lab5.Ex5;

public abstract class ProjectDecorator implements ProjectItem {

	private ProjectItem projectItem;

	@Override
	public double getTimeRequire() {
		// TODO Auto-generated method stub
		return projectItem.getTimeRequire();
	}

	protected ProjectItem getProjectItem() {
		return projectItem;
	}

	public void setProjectItem(ProjectItem newProjectItem) {
		this.projectItem = newProjectItem;
	}

}

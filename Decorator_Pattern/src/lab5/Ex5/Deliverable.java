package lab5.Ex5;

public class Deliverable implements ProjectItem {

	private String name;
	private String description;
	private Contact owner;

	public Deliverable(String newName, String newDescription, Contact newOwner) {
		super();
		this.name = newName;
		this.description = newDescription;
		this.owner = newOwner;
	}

	@Override
	public double getTimeRequire() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Contact getOwner() {
		return owner;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	public void setOwner(Contact newOwner) {
		this.owner = newOwner;
	}

	@Override
	public String toString() {
		return "Deliverable: " + name;
	}

}

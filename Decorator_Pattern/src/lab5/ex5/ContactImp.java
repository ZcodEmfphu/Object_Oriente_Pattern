package lab5.ex5;

public class ContactImp implements Contact {

	private String firstName;
	private String lastName;
	private String title;
	private String organization;

	public ContactImp() {
		super();
	}

	public ContactImp(String newFirstName, String newLastName, String newTitle, String newOrganization) {
		super();
		this.firstName = newFirstName;
		this.lastName = newLastName;
		this.title = newTitle;
		this.organization = newOrganization;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTitle() {
		return title;
	}

	public String getOrganization() {
		return organization;
	}

	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public void setOrganization(String newOrganization) {
		this.organization = newOrganization;
	}

	@Override
	public String toString() {
		return firstName + SPACE + lastName;
	}

}

package final_MVC;

import java.util.Date;

public abstract class Person {
	protected String id;
	protected String name;
	protected Date dob;

	public Person(String id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

}

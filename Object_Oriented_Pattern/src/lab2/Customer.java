package lab2;

import java.util.List;

public abstract class Customer {
	private String id;
	private String name;
	private String address;

	public Customer(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Reading getOldReading() {
		return getReading().get(getReading().size() - 2);
	}

	public Reading getNewReading() {
		return getReading().get(getReading().size() - 1);
	}

	public abstract List<? extends Reading> getReading();

	public abstract double charge();

	public abstract String statement();

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}

}

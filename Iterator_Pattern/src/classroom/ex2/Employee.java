package classroom.ex2;

public class Employee extends CompanyComponent {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee: " + name);
	}

}

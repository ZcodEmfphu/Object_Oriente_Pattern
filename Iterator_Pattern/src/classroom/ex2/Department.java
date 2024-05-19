package classroom.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department extends CompanyComponent {

	private String name;
	private List<CompanyComponent> children = new ArrayList<>();

	public Department(String name) {
		this.name = name;
	}

	public void add(CompanyComponent c) {
		children.add(c);
	}

	public void remove(CompanyComponent c) {
		children.remove(c);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Company Department " + name);
		for (CompanyComponent items : children) {
			items.display();
		}
		System.out.println();
	}

}

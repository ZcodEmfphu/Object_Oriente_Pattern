package lab2_1Ex;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String id;
	private String name;
	private List<RegularEmployees> regularList = new ArrayList<RegularEmployees>();
	private List<ContractEmployees> contractList = new ArrayList<ContractEmployees>();

	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

}

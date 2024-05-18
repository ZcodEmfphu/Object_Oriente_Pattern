package classroom.ex2;

public class CompanyTestDrive {

	public static void main(String[] args) {
		Employee e1 = new Employee("Minh Phu");
		Employee e2 = new Employee("Anh Thu");

		Department cg1 = new Department("Khoa IT");
		Department cg2 = new Department("NLU");

		cg1.add(e1);
		cg1.add(e2);

		cg1.display();

		cg2.add(e1);
		cg2.add(e2);
		cg2.add(cg1);

		cg2.display();

		cg2.remove(e1);
		cg2.display();
	}
}

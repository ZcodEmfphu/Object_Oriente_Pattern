package classroom.ex2;

public abstract class CompanyComponent {

	public void add(CompanyComponent c) {
		throw new UnsupportedOperationException();
	}

	public void remove(CompanyComponent c) {
		throw new UnsupportedOperationException();
	}

	public abstract void display();

}

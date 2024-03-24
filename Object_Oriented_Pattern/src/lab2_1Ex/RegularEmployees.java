package lab2_1Ex;

public class RegularEmployees extends Employee {
	private double coefficients;
	private double insurance;

	public RegularEmployees(String id, String name, String sex, String dob, double salary, double coefficients,
			double insurance) {
		super(id, name, sex, dob, salary);
		this.coefficients = coefficients;
		this.insurance = insurance;
	}

	public double getCoefficients() {
		return coefficients;
	}

	public double getInsurance() {
		return insurance;
	}

	@Override
	public String toString() {
		return "RegularEmployees [coefficients=" + coefficients + ", insurance=" + insurance + "]";
	}

}

public class ComissionedEmployee extends Employee {
	private double comission;

	public ComissionedEmployee(String name, double salary, double comission) throws IllegalArgumentException {
		super(name, salary);
		if (comission < 0.0) {
			throw new IllegalArgumentException("comission must be >= 0.0");
		}
		this.comission = comission;
	}

	public double getComission() {
		return this.comission;
	}

	public double getGrossSalary() {
		return this.getSalary() + this.comission;
	}
	
}

public class Employee implements Taxable {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) throws IllegalArgumentException {
		if (name.trim().equals("")) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		if (salary < 0.0) {
			throw new IllegalArgumentException("salary must be >= 0.0");
		}
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public double getGrossSalary() {
		return this.salary;
	}

	public double getTakeHomePay() {
		return this.getGrossSalary() - this.getTax();
	}

	public double getTax() {
		return 0.1 * this.getGrossSalary(); 
	}
}

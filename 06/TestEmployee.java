public class TestEmployee {
	public static void main(String []args) throws Exception {
		Employee e = new Employee("budi", 2000000.0);
		ComissionedEmployee ce = new ComissionedEmployee("rudi", 2000000.0, 1000000.0);

		e.getName();
		e.getSalary();
		e.getTax();
		e.getTakeHomePay();

		Employee []es = new Employee[]{e, ce};

		for (Employee i: es) {
			System.out.printf("Name: %s\n", i.getName());
			System.out.printf("Salary: %.2f\n", i.getSalary());
			System.out.printf("Tax: %.2f\n", i.getTax());
			if (i instanceof ComissionedEmployee) {
				System.out.printf("Comission: %.2f\n", ((ComissionedEmployee) i).getComission());
			}
			System.out.printf("Take Home Pay: %.2f\n", i.getTakeHomePay());
		}
	}
}

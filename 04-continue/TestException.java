import java.util.Scanner;
import java.util.InputMismatchException;

class InputAngkaException extends Exception {
	public InputAngkaException() {
		super("Angka yang diinput tidak valid");
	}
}

public class TestException {
	public static int inputInt(Scanner input, String label) throws InputAngkaException {
		System.out.print(label);
		try {
			return input.nextInt();
		} catch (InputMismatchException e) {
			throw new InputAngkaException();
		}
	}

	public static int inputIntUntilValid(Scanner input, String label) {
		int n = 0;
		do {
			try {
				n = inputInt(input, label);
				break;
			} catch (InputAngkaException e) {
				input.nextLine();
				System.err.println("Input angka integer");
			}
		} while(true);
		return n;
	}

	public static void main(String []args) {
		Scanner input = new Scanner(System.in);

		try {
			int n = inputIntUntilValid(input, "Input angka(n): ");
			int m = inputIntUntilValid(input, "Input angka(m): ");
			System.out.printf("%d/%d = %d\n", n, m, n/m);
		} catch (ArithmeticException e) {
			System.err.println("Kesalahan dalam perhitungan aritmatika");
			//System.exit(-1);
		} catch (Exception e) {
			System.err.println("General failure");
		} finally {
			System.out.println("Program berakhir");
		}
	}
}

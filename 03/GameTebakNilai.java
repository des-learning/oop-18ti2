import java.util.Scanner;

public class GameTebakNilai {
	public static void main(String []args) {
		boolean masihMain = true;
		Scanner input = new Scanner(System.in);

		do {
			int percobaan = 7;
			TebakNilai game = new TebakNilai(1, 100);
			int tebakan;
			boolean menang = false;

			for (int i = 0; i < percobaan; i++) {
				System.out.printf("Tebakan 1-100 (tinggal %d tebakan): ", percobaan - i);
				tebakan = Integer.parseInt(input.nextLine());
				int hasil = game.tebak(tebakan);
				if (hasil == 0) {
					menang = true;
				} else if (hasil < 0) {
					System.out.println("Tebakan terlalu kecil");
				} else {
					System.out.println("Tebakan terlalu besar");
				}

				if (menang) {
					break;
				}
			}
			String status = menang ? "Anda menang!" : "Anda kalah!";
			System.out.println(status);
			System.out.print("Main lagi (y/t): ");
			masihMain = input.nextLine().equals("y");
		} while (masihMain);
	}
}

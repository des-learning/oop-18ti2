import java.util.Scanner;

public class GameTebakNilai {
	public static void main(String []args) {
		boolean masihMain = true;
		Scanner input = new Scanner(System.in);

		do {
            TebakNilai game = new TebakNilai(1, 100, 7);
            game.play(input);
            System.out.println(game.getResult());

			System.out.print("Main lagi (y/t): ");
            masihMain = input.nextLine().equals("y");
        } while (masihMain);
        input.close();
	}
}

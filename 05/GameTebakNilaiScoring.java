import java.util.Scanner;

public class GameTebakNilaiScoring {
	public static void main(String []args) {
		boolean masihMain = true;
		Scanner input = new Scanner(System.in);

		do {
            TebakNilaiScoring game = new TebakNilaiScoring(1, 100, 7);
            game.play(input);
            System.out.println(game.getResult());
            System.out.printf("Score: %.2f\n", game.getScore());

			System.out.print("Main lagi (y/t): ");
            masihMain = input.nextLine().equals("y");
        } while (masihMain);
        input.close();
	}
}

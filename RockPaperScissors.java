import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int userScore = 0;
		int computerScore = 0;
		String[] options = { "rock", "paper", "scissors" };
		boolean keepPlaying = true;
		String userChoice;
		String computerChoice;

		while (keepPlaying) {

			System.out.println("Rock / Paper / Scissors Game");
			System.out.println("");
			System.out.println("Enter your choice (rock / paper / scissors): ");
			userChoice = scanner.nextLine().toLowerCase();

			if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
				System.out.println("Invalid choice! Please run the game again.");
				scanner.close();
				return;
			}

			int index = random.nextInt(options.length);
			computerChoice = options[index];
			System.out.println("The computer chose: " + computerChoice);

			if (userChoice.equals(computerChoice)) {
				System.out.println("This round was a draw!");
			} else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
					|| (userChoice.equals("paper") && computerChoice.equals("rock"))
					|| (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
				System.out.println("You win this round!");
				userScore++;
			} else {
				System.out.println("The computer wins this round!");
				computerScore++;
			}

			System.out.println("");
			System.out.println("Your score is: " + userScore);
			System.out.println("The computer's score is: " + computerScore);
			System.out.println("");

			System.out.println("Do you want to play again? (yes / no): ");
			String keepPlayingAnswer = scanner.nextLine().toLowerCase();
			keepPlaying = keepPlayingAnswer.equals("yes");
			
			if (keepPlaying) {
				for (int i = 0; i<10; i++) {
					System.out.println();
				}
			}

		}

		if (userScore > computerScore) {
			System.out.println("You won!");
		} else if (computerScore > userScore) {
			System.out.println("The computer won!");
		} else {
			System.out.println("The game was a tie!");
		}

		scanner.close();

	}

}

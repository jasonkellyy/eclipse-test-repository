
import java.util.Random;
import java.util.Scanner;

public class PubQuiz {

	public static void main(String[] args) {
		
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	String userAnswer;
	String anotherQuestion;
	int questionIndex;

	String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
	"Roman god of War ?" };
	String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
	
	System.out.println("Quiz");
	System.out.println();
	
	do {
		
		questionIndex = random.nextInt(jokeQuestions.length);
		
		System.out.println(jokeQuestions[questionIndex]);
		
		System.out.print("Enter your answer: ");
		userAnswer = scanner.nextLine();
		
		if (userAnswer.equalsIgnoreCase(jokeAnswers[questionIndex])) {
			System.out.println("Correct answer");
		} else {
			System.out.println("Incorrect! The answer was " +jokeAnswers[questionIndex]);
		}
		
		System.out.print("Another question? (Y/N): ");
		anotherQuestion = scanner.nextLine();
		
	} while (anotherQuestion.equalsIgnoreCase("Y"));
	
	
	System.out.println("The quiz is finished, run the game again");
	
	scanner.close();
		
		
	}



//	public static String returnQuestion (String[] questions) {
//		
//		int questionIndex = random.NextInt(questions.length);
//		
//		String question = questions[questionIndex];
//		
//		return question;
//	}

}

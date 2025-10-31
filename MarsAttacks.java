
public class MarsAttacks {

	public static void main(String[] args) {
		
	String[] message = { "FBI Report on UFOs", "We believe UFOs do visit our planet.",

	"Many cows have been abducted in Roswell New Mexico USA", "Several reports of Aliens have been made",

	"We think they come from Mars", "The FBI are concerned about public panic", "Strictly confidential",

	"For your eyes only Mr President", "God help us all and God bless America", "End of message..." };


	// the words that will be redacted

	String[] wordsToRedact = { "FBI", "UFO", "UFOs", "Roswell", "Cow", "Cows", "Abducted", "Mars", "Alien",

	"Aliens", "President", "America" };
	
	String[] individualWordsInMessage = new String[message.length];
		
	
//	printFullMessage(message);
		

	}
	
	public static void printFullMessage(String array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void splitMessageIntoArray(String originalArray, String splitArray) {
		
		for (int i = 0; i < originalArray.length(); i++) {
			splitArray[] = originalArray[i].split(" ");
			}
		}
		
	}

}

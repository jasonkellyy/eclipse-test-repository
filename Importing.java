
import java.util.Scanner;


public class Importing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		double squareRoot;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a whole number: ");
		
		number = scanner.nextInt();
		
		squareRoot = Math.sqrt(number);
		
		System.out.println(squareRoot);
		
		scanner.close();
		

	}

}

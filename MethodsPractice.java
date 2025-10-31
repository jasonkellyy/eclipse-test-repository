
public class MethodsPractice {

	public static void main(String[] args) {
		
		int test1 = 10;
		int test2 = 10;
		
		int test3 = 20;
		int test4 = 25;
		
		int big = biggestNumber(test1, test2);
		
		int big2 = biggestNumber(test3, test4);
		
		int big3 = biggestNumber(5000,4365);
		
		System.out.println(big);
		
		System.out.println(big2);
		
		System.out.println(big3);

	}

	public static int biggestNumber(int num1, int num2) {
		
		int biggest = 0;
		
		if (num1 > num2) {
			biggest = num1;
		} else {
			biggest = num2;
		} 
		return biggest;
		
	}

}

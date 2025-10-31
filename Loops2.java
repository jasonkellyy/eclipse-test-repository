
public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yearTurn100(25, 2025);
		
	}
	
	public static void yearTurn100(int age, int currentYear) {
	//	int age = 25;
	//	int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int yearsUntil100 = 100 - age;
		int yearTurn100 = currentYear + yearsUntil100;
		System.out.println(yearTurn100);
	}

}

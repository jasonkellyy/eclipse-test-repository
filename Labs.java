
public class Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tempDay1 = 15.5;
		boolean sunDay1 = true;
		
		double tempDay2 = 10.5;
		boolean sunDay2 = false;
		
		double tempDay3 = 16.0;
		boolean sunDay3 = true;
		
		double tempDay4 = 12.5;
		boolean sunDay4 = true;
		
		double tempDay5 = 17.0;
		boolean sunDay5 = false;
		
		double avgTemp = (tempDay1 + tempDay2 + tempDay3 + tempDay4 + tempDay5) / 5;
		
		int totalDaysOfSun = 0;
		if (sunDay1 == true) {
			totalDaysOfSun +=1;
		}
		
		if (sunDay2 == true) {
			totalDaysOfSun +=1;
		}
		
		if (sunDay3 == true) {
			totalDaysOfSun +=1;
		}
		
		if (sunDay4 == true) {
			totalDaysOfSun +=1;
		}
		
		if (sunDay5 == true) {
			totalDaysOfSun +=1;
		}
		
		
		System.out.println("Weather Analysis");
		System.out.println();
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("Day 1");
		System.out.println("Temp: "+tempDay1);
		System.out.println("Sun: "+sunDay1);
		
		if (tempDay1 > avgTemp) {
			System.out.println("Above average temp");
		
		}
		
		System.out.println();
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("Day 2");
		System.out.println("Temp: "+tempDay2);
		System.out.println("Sun: "+sunDay2);
		
		if (tempDay2 > avgTemp) {
			System.out.println("Above average temp");
		
		}
		
		
		System.out.println();
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("Day 3");
		System.out.println("Temp: "+tempDay3);
		System.out.println("Sun: "+sunDay3);
		
		if (tempDay3 > avgTemp) {
			System.out.println("Above average temp");
		
		}
		
		
		
		System.out.println();
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("Day 4");
		System.out.println("Temp: "+tempDay4);
		System.out.println("Sun: "+sunDay4);
		
		if (tempDay4 > avgTemp) {
			System.out.println("Above average temp");
		
		}
		
		
		
		System.out.println();
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("Day 5");
		System.out.println("Temp: "+tempDay5);
		System.out.println("Sun: "+sunDay5);
		
		if (tempDay5 > avgTemp) {
			System.out.println("Above average temp");
		
		}
		
		System.out.println("");
		
		System.out.println("Overall Stats");
		System.out.println("Average Temp: " +avgTemp);
		System.out.println("Number of days of sun: "+totalDaysOfSun);

	}

}

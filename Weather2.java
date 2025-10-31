
public class Weather2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double[] temps = {15.5, 10.5, 16.0, 12.5, 17.0};
	        boolean[] sun = {true, false, true, true, false};

	        double totalTemp = 0;
	        int totalDaysOfSun = 0;

	        for (int i = 0; i < temps.length; i++) {
	            totalTemp += temps[i];
	            if (sun[i]) totalDaysOfSun++;
	        }
	        double avgTemp = totalTemp / temps.length;

	        System.out.println("Weather Analysis\n");

	        for (int i = 0; i < temps.length; i++) {
	            System.out.println("___________________________________");
	            System.out.println("Day " + (i + 1));
	            System.out.println("Temp: " + temps[i]);
	            System.out.println("Sun: " + sun[i]);
	            if (temps[i] > avgTemp) {
	                System.out.println("Above average temp");
	            }
	            System.out.println();
	        }

	        System.out.println("Overall Stats");
	        System.out.println("Average Temp: " + avgTemp);
	        System.out.println("Number of days of sun: " + totalDaysOfSun);
	    }
	
		

	}



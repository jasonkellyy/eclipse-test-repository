
public class Rain {

	public static void main(String[] args) {

		// a 2D array for monthly rainfall data in mm per day in each month
		int[][] monthlyRainfall = {
				// January (31 days)
				{ 12, 8, 23, 4, 0, 9, 2, 3, 11, 14, 7, 18, 15, 1, 0, 2, 4, 0, 1, 1, 0, 0, 1, 0, 10, 3, 2, 0, 0, 0, 3 },
				// February (28 days)
				{ 3, 6, 9, 5, 7, 2, 4, 7, 6, 8, 7, 9, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 2, 0, 9, 8, 0, 6 },
				// March (31 days)
				{ 1, 8, 0, 11, 8, 5, 7, 8, 4, 3, 7, 6, 5, 9, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				// April (30 days)
				{ 3, 6, 5, 4, 8, 9, 6, 4, 3, 7, 6, 5, 8, 7, 6, 5, 9, 4, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 2 },
				// May (31 days)
				{ 2, 5, 8, 7, 6, 9, 8, 2, 7, 5, 3, 6, 8, 9, 4, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2 },
				// June (30 days)
				{ 0, 6, 5, 8, 9, 6, 4, 7, 6, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				// July (31 days)
				{ 1, 6, 0, 9, 7, 6, 5, 4, 8, 9, 6, 5, 7, 7, 4, 6, 8, 7, 5, 3, 7, 9, 8, 6, 5, 9, 0, 0, 2, 0, 0 },
				// August (31 days)
				{ 7, 6, 5, 8, 9, 6, 5, 4, 7, 6, 5, 9, 0, 0, 2, 0, 0, 0, 2, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0 },
				// September (30 days)
				{ 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 9, 1, 1, 0, 0, 0, 0, 2, 3, 8, 0, 0, 0, 1, 1, 0, 0 },
				// October (31 days)
				{ 2, 5, 0, 0, 6, 0, 0, 0, 0, 5, 3, 0, 0, 0, 4, 6, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0 },
				// November (30 days)
				{ 7, 0, 5, 4, 8, 9, 6, 4, 3, 7, 6, 5, 8, 7, 6, 5, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 },
				// December (31 days)
				{ 2, 5, 8, 7, 6, 9, 8, 7, 5, 6, 3, 6, 9, 1, 2, 3, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 1 } };

		String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		rainfallAnalysis(monthlyRainfall, monthNames);

		heaviestDaysRain(monthlyRainfall);

		int totalRainfall = totalRain(monthlyRainfall);
		System.out.printf("Total of rain in year: %,d(mm)%n%n", totalRainfall);

		avgRainPerDay(monthlyRainfall);

		totalDaysRainPerMonth(monthlyRainfall, monthNames);

	}

	public static void rainfallAnalysis(int array[][], String monthNames[]) {
		System.out.println("Rainfall Analysis");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			//System.out.print(monthNames[i] + " ");
			System.out.printf("%-5s ",monthNames[i]);
			for (int j = 0; j < array[i].length; j++) {
				//System.out.print(array[i][j]);
				System.out.printf("%3d", array[i][j]);
				if (j < array[i].length - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void heaviestDaysRain(int array[][]) {
		int mostRain = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > mostRain) {
					mostRain = array[i][j];
				}
			}
		}

		System.out.println("Heaviest day of rain total: " + mostRain + "(mm)");
		System.out.println();
	}

	public static int totalRain(int array[][]) {
		int totalRain = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				totalRain += array[i][j];
			}
		}
		return totalRain;
	}

	public static void avgRainPerDay(int array[][]) {
		int total = 0;
		int numOfDays = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				numOfDays++;
				total += array[i][j];
			}
		}
		double average = (total / (double) numOfDays);
		System.out.printf("Rainfall average per day: %.2f(mm)%n", average);
		System.out.println();

	}

	public static void totalDaysRainPerMonth(int array[][], String monthNames[]) {
		System.out.println("Total days rain per month (mm)");
		for (int i = 0; i < array.length; i++) {
			int totalDaysRain = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > 0) {
					totalDaysRain++;
				}
			}
			System.out.println(monthNames[i] + " " + totalDaysRain);
		}
		System.out.println();
	}
	
	public static void monthWithMostRain(int array[][], String monthNames[]) {
		
		String monthMostRain;
		
		for (int i = 0; i < array.length; i++) {
			int monthlyRainSum = 0;
			for (int j = 0; j < array[i].length; j++) {
				monthlyRainSum += array[i][j];
			}
		}
	}

}

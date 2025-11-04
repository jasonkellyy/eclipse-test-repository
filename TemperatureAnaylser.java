import java.util.Arrays;

public class TemperatureAnaylser {

	// ANSI color codes
	private static final String RESET = "\033[0;0m";
	private static final String RED = "\033[0;31m"; // Hot
	private static final String ORANGE = "\033[38;5;208m"; // Warm
	private static final String BLUE = "\033[0;34m"; // Cool
	private static final String CYAN = "\033[36m"; // Cold

	// Climate symbols
	private static final String HOT_SYMBOL = "\uD83E\uDD75"; // 🥵
	private static final String SUN_SYMBOL = "\u2600"; // ☀
	private static final String SNOWFLAKE = "\u2744"; // ❄
	private static final String SNOWMAN = "\u26C4"; // ⛄

	// Column width constant
	private static final int COL_WIDTH = 15;

	public static void main(String[] args) {

		int[][] temperatures = { { 15, 18, 20, 22, 19, 21, 23, 17, 16, 18 }, // Tokyo
				{ 30, 32, 31, 29, 28, 33, 34, 30, 31, 32, 29 }, // New York
				{ -5, 0, 3, -2, -1, 1, 2, -3, 0, 1 }, // Moscow
				{ 25, 27, 26, 28, 29, 30, 27, 26, 25 }, // Sydney
				{ 10, 12, 15, 14, 13, 11, 12, 14, 15, 13, 12 }, // London
				{ 35, 37, 36, 34, 33, 32, 31, 30, 36, 35, 34, 33 }, // Dubai
				{ 5, 7, 10, 8, 6, 9, 11, 7, 8, 6 }, // Toronto
				{ 0, 2, 5, 3, 1, 4, 6, 2, 3, 1 }, // Berlin
				{ 28, 30, 27, 29, 31, 32, 30, 28, 29, 27 } // Rome
		};

		String[] cityNames = { "Tokyo", "New York", "Moscow", "Sydney", "London", "Dubai", "Toronto", "Berlin",
				"Rome" };

		double[] averageTemps = avgTempPerCity(temperatures, cityNames);
		int[] highestTemps = highestTempPerCity(temperatures, cityNames);
		int[] lowestTemps = lowestTempPerCity(temperatures, cityNames);
		String[] climates = climateZones(averageTemps);

		// Show table
		showTable(cityNames, averageTemps, highestTemps, lowestTemps, climates);

		// Print cities with highest and lowest average temperature
		printExtremeAverageTemps(cityNames, averageTemps);
	}

	public static double[] avgTempPerCity(int[][] temperatures, String cityNames[]) {
		double[] averages = new double[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			int sum = 0;
			for (int j = 0; j < temperatures[i].length; j++) {
				sum += temperatures[i][j];
			}
			averages[i] = sum / (double) temperatures[i].length;
		}
		return averages;
	}

	public static int[] highestTempPerCity(int[][] temperatures, String cityNames[]) {
		int[] highestTemp = new int[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			int highestTempPerCity = temperatures[i][0];
			for (int j = 0; j < temperatures[i].length; j++) {
				if (temperatures[i][j] > highestTempPerCity) {
					highestTempPerCity = temperatures[i][j];
				}
			}
			highestTemp[i] = highestTempPerCity;
		}
		return highestTemp;
	}

	public static int[] lowestTempPerCity(int[][] temperatures, String cityNames[]) {
		int[] lowestTemp = new int[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			int lowestTempPerCity = temperatures[i][0];
			for (int j = 0; j < temperatures[i].length; j++) {
				if (temperatures[i][j] < lowestTempPerCity) {
					lowestTempPerCity = temperatures[i][j];
				}
			}
			lowestTemp[i] = lowestTempPerCity;
		}
		return lowestTemp;
	}

	public static String[] climateZones(double[] averageTemps) {
		String[] climates = new String[averageTemps.length];
		for (int i = 0; i < averageTemps.length; i++) {
			if (averageTemps[i] >= -10 && averageTemps[i] <= 4) {
				climates[i] = "Cold";
			} else if (averageTemps[i] >= 5 && averageTemps[i] <= 14) {
				climates[i] = "Cool";
			} else if (averageTemps[i] >= 15 && averageTemps[i] <= 24) {
				climates[i] = "Warm";
			} else {
				climates[i] = "Hot";
			}
		}
		return climates;
	}

	// Helper to add color and symbols
	public static String coloredClimate(String climate) {
		return switch (climate) {
		case "Hot" -> RED + HOT_SYMBOL + " " + climate + RESET;
		case "Warm" -> ORANGE + SUN_SYMBOL + " " + climate + RESET;
		case "Cool" -> BLUE + climate + RESET;
		case "Cold" -> CYAN + SNOWFLAKE + " " + climate + RESET;
		default -> climate;
		};
	}

	public static void showTable(String[] cityNames, double[] averageTemps, int[] highestTemps, int[] lowestTemps,
			String[] climates) {

		// Header
		System.out.printf("%-" + COL_WIDTH + "s%-" + COL_WIDTH + "s%-" + COL_WIDTH + "s%-" + COL_WIDTH + "s%-"
				+ COL_WIDTH + "s%n", "City", "Avg Temp", "High Temp", "Low Temp", "Climate");
		System.out.println("-".repeat(COL_WIDTH * 5));

		// Rows
		for (int i = 0; i < cityNames.length; i++) {
			System.out.printf(
					"%-" + COL_WIDTH + "s%-" + COL_WIDTH + ".2f%-" + COL_WIDTH + "d%-" + COL_WIDTH + "d%-" + COL_WIDTH
							+ "s%n",
					cityNames[i], averageTemps[i], highestTemps[i], lowestTemps[i], coloredClimate(climates[i]));
		}
	}

	public static void printExtremeAverageTemps(String[] cityNames, double[] averageTemps) {
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < averageTemps.length; i++) {
			if (averageTemps[i] > averageTemps[maxIndex]) {
				maxIndex = i;
			}
			if (averageTemps[i] < averageTemps[minIndex]) {
				minIndex = i;
			}
		}

		System.out.println();
		System.out.printf("City with highest average temperature: %s (%.2f°C)%n", cityNames[maxIndex],
				averageTemps[maxIndex]);
		System.out.printf("City with lowest average temperature:  %s%n", cityNames[minIndex]);
	}
}

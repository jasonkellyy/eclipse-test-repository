
public class Array2DLab {

	public static void main(String[] args) {

		int[][] customersData = { { 39, 45, 56, 78, 101, 45, 34, 34 }, { 31, 55, 56, 83, 121, 65, 31, 5 },
				{ 11, 45, 26, 23 }, { 34, 5, 50, 45, 67, 123, 121, 122, 89, 76 }, { 21, 25, 80, 25, 57, 73, 71, 62 },
				{ 1, 23, 56, 78, 56, 34, 78, 5 }, { 10, 43, 69, 98, 126, 134, 178, 75, 89, 90 } };

		displayCustomersData(customersData);
		System.out.println();

		displayTotalCustomers(customersData);

		System.out.println();
		highestHourlyCustomers(customersData);

		System.out.println();
		totalShoppingHours(customersData);

		System.out.println();
		avgCustomersPerHourPerDay(customersData);

	}

	public static void displayCustomersData(int[][] array) {

		System.out.println("Shopping Stats");
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print("Day " + (i + 1) + ": ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if (j < array[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();

		}

	}

	public static void displayTotalCustomers(int[][] array) {

		int totalCustomers = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				totalCustomers += array[i][j];
			}
		}

		System.out.printf("Total Customers: %,d%n", totalCustomers);
	}

	public static void highestHourlyCustomers(int[][] array) {

		int highestCustomers = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > highestCustomers) {
					highestCustomers = array[i][j];
				}
			}
		}
		System.out.println("Highest number of customers per hour: " +highestCustomers);
	}

	public static void totalShoppingHours(int[][] array) {

		System.out.println("Day | Hours Total");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Day " + (i + 1) + ": " + array[i].length);

		}
	}

	public static void avgCustomersPerHourPerDay(int[][] array) {

		double avgCustomers = 0;
		System.out.println("Day | Average customers per hour per day");

		for (int i = 0; i < array.length; i++) {
			int totalDailyCustomers = 0;
			for (int j = 0; j < array[i].length; j++) {
				totalDailyCustomers += array[i][j];
				avgCustomers = (double) totalDailyCustomers / array[i].length;
			}
			System.out.printf("Day %d: %.2f%n", (i + 1), avgCustomers);

		}
	}

}

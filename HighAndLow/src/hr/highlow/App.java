package hr.highlow;

public class App {

	public static void main(String[] args) {

		String numbers = "1 9 3 4 -5";

		System.out.println(highAndLow(numbers));

	}

	public static String highAndLow(String numbers) {
		String[] stringArray = numbers.split(" ");
		int[] intArray = new int[stringArray.length];

		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		int low = intArray[0];
		int high = intArray[0];

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < low) {
				low = intArray[i];
			}
			if (intArray[i] > high) {
				high = intArray[i];
			}
		}

		return high + " " + low;
	}

}

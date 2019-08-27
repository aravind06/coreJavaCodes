package adding1toarray;

import java.util.Arrays;
import java.util.Scanner;

public class AddOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arraySize = Integer.parseInt(sc.nextLine());
		int[] inputArray = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			inputArray[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println(Arrays.toString(inputArray));
		int[] output = new AddOne().addOne(inputArray);
		System.out.println(Arrays.toString(output));
		sc.close();
	}

	public int[] addOne(int[] inputArray) {
		int[] resultArray = new int[inputArray.length];
		int carry = 1;
		for (int i = (inputArray.length - 1); i >= 0; i--) {
			int sum = inputArray[i] + carry;
			if (sum == 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			resultArray[i] = sum % 10;
		}
		if (carry == 1) {
			resultArray = new int[inputArray.length + 1];
			resultArray[0] = 1;
		}
		return resultArray;
	}

}

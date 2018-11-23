package com.learning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberAlgorithm {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < tests; i++) {
			int arrSize = Integer.parseInt(scanner.nextLine());
			int[] arr = new int[arrSize];
			String arrString = scanner.nextLine();
			String[] strArray = arrString.split(" ");

			Arrays.sort(arr);
			System.out.println(calculateMissingNumber(strArray, arrSize));

		}
	}

	private static int calculateMissingNumber(String[] arr, int n) {

		int totalCount = (n * (n + 1)) / 2;
		int arrCount = 0;

		for (int i = 0; i < arr.length; i++) {
			arrCount += Integer.parseInt(arr[i]);
		}

		return totalCount - arrCount;
	}

}

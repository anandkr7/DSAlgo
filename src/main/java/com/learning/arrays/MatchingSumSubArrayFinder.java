package com.learning.arrays;

import java.util.Scanner;

public class MatchingSumSubArrayFinder {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < tests; i++) {
			String arrSizeAndSum = scanner.nextLine();
			String arrSize = arrSizeAndSum.split(" ")[0];
			String arrSum = arrSizeAndSum.split(" ")[1];
			String arrString = scanner.nextLine();
			String[] strArray = arrString.split(" ");

			System.out.println(findMatchingSumSubArray(strArray, arrSize, arrSum));

		}
	}

	public static int findMatchingSumSubArray(String[] arr, String arrSize, String arrSum) {
		return 0;

	}

}

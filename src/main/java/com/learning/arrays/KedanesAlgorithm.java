package com.learning.arrays;

import java.util.Scanner;

public class KedanesAlgorithm {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();

		for (int i = 0; i < numberOfTests; i++) {
			int arrCount = scanner.nextInt();
			int[] arr = new int[arrCount];
			for (int j = 0; j < arrCount; j++) {
				int val = Integer.parseInt(scanner.next());
				arr[j] = val;
			}
			System.out.println(caculateKadanes(arr, arrCount));
		}
	}

	public static int caculateKadanes(int[] arr, int n) {

		int maxTillNow = 0;
		int maxOverAll = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			maxTillNow = maxTillNow + arr[i];
			if (maxOverAll < maxTillNow) {
				maxOverAll = maxTillNow;
			}
			if (maxTillNow < 0) {
				maxTillNow = 0;
			}
		}
		return maxOverAll;
	}

}

package codeforces;

import java.util.Scanner;

public class Round_686_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase;

		testCase = sc.nextInt();

		while (testCase > 0) {
			constructPermutation(sc);
			testCase--;
		}
	}

	public static void constructPermutation(Scanner sc) {
		int n, temp = 0, count = 1;
		n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			if (i == count) {
				temp = i;
			} else {
				System.out.print(i + " ");
			}

			count++;
		}

		if (temp != 0)
			System.out.println(temp);
	}
}

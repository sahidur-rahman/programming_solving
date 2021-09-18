package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Round_686_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase;

		testCase = sc.nextInt();

		while (testCase > 0) {
			uniqueBidActuation(sc);
			testCase--;
		}

	}

	public static void uniqueBidActuation(Scanner sc) {
		ArrayList<Integer> list = new ArrayList<>();

		int n, value = 0, index = -1;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			list.add(sc.nextInt());
		}

		for (Integer integer : list) {
			int firstIndex = list.indexOf(integer);
			int lastIndex = list.lastIndexOf(integer);

			if (firstIndex == lastIndex && (value == 0 || value > integer)) {
				value = integer;
			}
		}

		index = list.indexOf(value);

		System.out.println(index > -1 ? index + 1 : index);
	}
}

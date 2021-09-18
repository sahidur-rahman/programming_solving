package codeforces;

import java.util.Scanner;

public class Round_634_A {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int testCase;

		testCase = sc.nextInt();

		while (testCase != 0) {

			System.out.println(calculate());
			
			testCase--;
		}

	}
	
	public static int calculate () {
		int a, b, n;
		n = sc.nextInt();
		b = n / 2;
		a = n- b;
		
		if (a > b) {
			return b;
		} else if (a == b && a > 1) {
			return b -1;
		}
		
		return 0;
	}

}

package codeforces;

import java.util.Scanner;

public class Round_656_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase;

		testCase = sc.nextInt();

		while (testCase > 0) {
			
			work(sc);
			testCase--;
		}

	}
	
	public static void work(Scanner sc) {
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println((x == y) && (x > z) ? "YES\n" + x + " " + z + " " + z  : (x == z) && (x > y) ? "YES\n" + x + " " + y + " " + y : (y == z) && (y > x) ? "YES\n" + y + " " + x + " " + x : (x == y && x == z) ? "YES\n" + x + " " + x + " " + x : "NO");
	}
}

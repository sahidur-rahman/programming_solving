package codeforces;

import java.util.Collections;
import java.util.Scanner;

public class Round_634_B {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int testCase;

		testCase = sc.nextInt();

		while (testCase > 0) {

			calculate();
			testCase--;
		}

	}

	public static int calculate() {
		StringBuilder sb = new StringBuilder();
		int strL, subStrL, unqStrL, unqStrRpt, remStrL;

		strL = sc.nextInt();
		subStrL = sc.nextInt();
		unqStrL = sc.nextInt();

		unqStrRpt = strL / unqStrL;
		remStrL = strL % unqStrL;

		generateString(unqStrL, sb); //Generate Unique string
		sb.append(String.join("", Collections.nCopies(unqStrRpt - 1, sb.toString()))); // Repeat unique string
		generateString(remStrL, sb); // Generate remaining letters

		System.out.println(sb.toString());
		return 0;
	}

	public static void generateString(int size, StringBuilder sb) {

		for (int i = 1; i <= size; i ++) {
			sb.append(String.format("%c", 96 + i));
		}

	}
}

package shishir;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.tokenize();
		//myClass.myFunction();

	}

	void myFunction() {
		try {
			int[] a = new int[15];
			boolean[] b = new boolean[5];
			System.arraycopy(a, 2, b, 2, 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void tokenize() {
		Scanner sc = new Scanner(System.in);
//		String telephonNo = sc.nextLine();
		String telephonNo = "(088)01712";
		String[] firstPart;
		String secondPart;
		
		firstPart = telephonNo.split("\\(", 1);
		
		System.out.println(Arrays.deepToString(firstPart));
	}
}

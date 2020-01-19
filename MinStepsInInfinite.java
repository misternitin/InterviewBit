package interviewBit;

import java.util.Scanner;

public class MinStepsInInfinite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] A = new int[a];
		int[] B = new int[a];
		for (int i = 0; i < a; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		int length = 0;
		for (int i = 0; i < A.length; i++) {
			if (i + 1 < A.length) {
				System.out.println("LOL");
				if (Math.abs(A[i] - A[i + 1]) <= Math.abs(B[i] - B[i + 1])) {
					length += Math.abs(B[i] - B[i + 1]);
					// length+=Math.abs(A[i]-A[i+1]);
				} else {
					// length+=Math.abs(B[i]-B[i+1]);
					length += Math.abs(A[i] - A[i + 1]);
				}
			}
		}
		System.out.println(length);
	}
}


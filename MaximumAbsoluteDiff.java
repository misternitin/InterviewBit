package interviewBit;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumAbsoluteDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			A.add(sc.nextInt());
		}

		int maxami = Integer.MIN_VALUE;
		int minami = Integer.MAX_VALUE;
		int maxapi = Integer.MIN_VALUE;
		int minapi = Integer.MAX_VALUE;

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) - i > maxami)
				maxami = A.get(i) - i;
			if (A.get(i) - i < minami)
				minami = A.get(i) - i;
			if (A.get(i) + i > maxapi)
				maxapi = A.get(i) + i;
			if (A.get(i) + i < minapi)
				minapi = A.get(i) + i;
		}

		int max1 = Math.abs(maxami - minami);
		int max2 = Math.abs(maxapi - minapi);
		int log = Math.max(max1, max2);
		System.out.println(log);

	}
}

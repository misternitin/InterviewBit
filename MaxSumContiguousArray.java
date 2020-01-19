package interviewBit;

import java.util.Scanner;

public class MaxSumContiguousArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int A[]=new int[a];
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
		int max=A[0];
		int maxhere=A[0];
		for(int i=1;i<A.length;i++) {
			maxhere=Math.max(A[i], maxhere+A[i]);
			max=Math.max(max, maxhere);
		}
		System.out.println(max);
	}
}

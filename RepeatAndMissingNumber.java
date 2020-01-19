package interviewBit;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAndMissingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>();
		for(int i=0;i<t;i++) {
			int x=sc.nextInt();
			A.add(x);
		}
		
		int n=A.size();
		int sum=(n*(n+1))/2;
		int sumSq=(n*(n+1)*(2*n+1))/6;
		//System.out.println("sum :"+sum+"  sq:"+sumSq);
		
		int sumAc=0;
		for(int i:A) {
			sumAc+=i;
		//	System.out.println(i);
		}
		int sumAcSq=0;
		for(int i:A) {
			sumAcSq+=(i*i);
		}
		//System.out.println("SumAc:"+sumAc+" sq:"+sumAcSq);
		long d=sum-sumAc;
		int d2=sumSq-sumAcSq;
		long s= d2/d;
		int B=(int) (s+d)/(2);
		int A1=(int) ((s-d)/2);
		ArrayList<Integer> out=new ArrayList<Integer>();
		System.out.println("A :"+A1);
		System.out.println("B :"+B);
		out.add(A1);
		out.add(B);
		
	}
}

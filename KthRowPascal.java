package interviewBit;

import java.util.Scanner;

public class KthRowPascal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int[][] arr=new int[A+1][];
		arr[0]=new int[1];
		arr[0][0]=1;
		if(A==0) {
			//return arr[];
		}
		
		for(int i=1;i<=A;i++) {
			arr[i]=new int[i+1];
			//System.out.print(i);
			for(int j=0;j<=i;j++) {
				if(i==j)
					arr[i][j]=1;
				if(j-1<0)
					arr[i][j]=arr[i-1][j];
				if(j-1>=0 && i!=j)
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=1;i<=A;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}

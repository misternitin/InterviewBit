package interviewBit;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		int row;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		int[][] arr=new int[row][];
		arr[0]=new int[1];
		arr[0][0]=1;
	    for(int i=1;i<row;i++) {
	    	arr[i]=new int[i+1];
	    	for(int j=0;j<=i;j++) {
	    		//System.out.println(j);
	    		if(j-1>=0 && i!=j)
	    			arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
	    		if(j-1<0)
	    			arr[i][j]=arr[i-1][j];
	    		if(i==j)
	    			arr[i][j]=1;
	    	}
	    }
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<=i;j++) {
	    		System.out.print(arr[i][j]);
	    	}
	    	System.out.println();
	    }
	}
}

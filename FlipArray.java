package interviewBit;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		
		int[] arr=new int[A.length()];
        for(int i=0;i<A.length();i++) {
            arr[i]=Integer.parseInt(String.valueOf(A.charAt(i)));
        }
        
        int max=Integer.MIN_VALUE;
        int maxhere=0;
        int start=0, end=0, s=0;
        
        for(int i=0;i<arr.length;i++) {
            int item=arr[i];
            if(item==1) {
                item=-1;
            } else if(item==0) {
                item=1;
            }
            maxhere=maxhere+item;
            if(max<maxhere) {
                max=maxhere;
                start=s;
                end=i;
            }
            if(maxhere<0) {
                maxhere=0;
                s=i+1;
            }
                
        }
        ArrayList<Integer> output;
        if(max<0) {
            output=new ArrayList<Integer>();
        }
        else {
            start+=1;
            end+=1;
            output=new ArrayList<Integer>();
            output.add(start);
            output.add(end);
        }
		System.out.println("Start :"+start+" end:"+end);
	}
}

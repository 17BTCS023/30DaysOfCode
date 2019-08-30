package thirty_days_hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Day10 {
	
	// To count number of consecutive words
	
	public void consecutiveCount(int[] arr ) {
		int count = 0;
		int max = 0;
		for(int i =0; i < arr.length; i ++) {
			if(arr[i]==1) {
				count++;
				if(count>max) {
					max= count;
				}
			}
			else {
				count=0;
			}
			
		}
		System.out.println(max);
	}
	
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		
		Day10 obj = new Day10();
		 int n = scanner.nextInt();
		 int i = 0;
		 int[] binValue = new int[5];
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        scanner.close();
	        
	        while(n>0) {
	        	binValue[i]= n%2; 	// storing 0 or 1 into the array
	        	n= (n/2);   // making the number half
	        	i++;  	// increment the number
	        }
	        System.out.println(Arrays.toString(binValue));
	        obj.consecutiveCount(binValue);
	}
}

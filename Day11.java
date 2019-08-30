package thirty_days_hackerrank;

import java.util.Scanner;

// 				2D-Array
//------------------------------------------------------------------------------------------------------
public class Day11 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        int[][] arr = new int[6][6];
        int max=-100;
		int currentSum;
    	System.out.println("Input the array");
       // take the input
    	for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");// taking one line as an input splitting at spaces
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]); // converting String to an integer
                arr[i][j] = arrItem;
      
            }
        }
       
		// 
        System.out.println("Entering into hourglass");
        for(int i = 0; i < 4; i ++) {
        	//System.out.println("into i" + i); 
        	for(int j = 0; j < 4 ;j++) {
        		//System.out.println("into j" + j);
        		// calculating the hourglass sum
        		currentSum = (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
        		if(currentSum>max) {
            		max= currentSum;
            	}
        	}
        }
        System.out.println(max);
        scanner.close();

	}   
  }



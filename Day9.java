package thirty_days_hackerrank;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Day9 {

	    // Complete the factorial function below.
	    static int fact(int n) {
	        // base case
	        if(n<=1){
	            return 1;
	        }
	        //recursive case
	        else{
	            return n * fact(n-1);
	        }

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args){
	        

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int result = fact(n);
	        System.out.println(result);

	        scanner.close();
	    }
	}

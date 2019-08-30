package thirty_days_hackerrank;

// 				Separate the chars at even and odd places of the string

import java.util.Scanner;

public class Day6 {
	
	private void splitPrinter(String s) {
	    StringBuilder sO = new StringBuilder();
	    StringBuilder sE = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        if (i%2==0) {
	            sE.append(s.charAt(i));
	        } else {
	            sO.append(s.charAt(i));        
	        }
	    }
	    sE.append(" ");
	    sE.append(sO.toString());
	    System.out.println(sE.toString());
	}	
	

	public static void main(String args[]){
		
		// taking in the input
		
		Scanner Scan = new Scanner(System.in);
		int T = Scan.nextInt();
		Scan.nextLine();  // to eat the extra \n left by .nextInt
		Day6 obj = new Day6();
		for(int i =0; i<T ; i ++) {
			
			String str = Scan.nextLine();
			
			obj.splitPrinter(str);
			}
		Scan.close();	
			
		}
	}

// thing you have been searching for: scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

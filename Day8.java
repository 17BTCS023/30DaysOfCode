package thirty_days_hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//           							Dictionaries and HashMaps - 12th August 2019 / 11:05pm
//===================================================================================================================

public class Day8 {
	public static void main(String []argh) {
		Scanner scan = new Scanner(System.in);
		
		Map<String,Integer> phoneBook = new HashMap<String, Integer>(); // creating a map
		 //How many number of Mappings?
		int n = scan.nextInt();
		//scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i = 0; i <n; i++) {  // taking in the mappings
			
			String name = scan.next();  // NOTE: here we are only writing .next and not .nextLine to just take a single word
			//System.out.println(name);
			int phone = scan.nextInt();
			
			phoneBook.put(name, phone); // storing the key-value pair
			//System.out.println(phoneBook.toString());
		}
		while(scan.hasNext()) {
			String query =  scan.next();
			if(phoneBook.containsKey(query)==true) {
				System.out.println(phoneBook.get(query)); 
			}
			else {
				System.out.println("Not found");
			}
		}
		scan.close();
	}
}

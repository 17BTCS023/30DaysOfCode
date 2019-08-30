package thirty_days_hackerrank;
//         String to Integer
//=================================================================================================
import java.util.*;

	
	

	public class Day16 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        try{
	            int obj = Integer.parseInt(S); // Important
	            System.out.println(obj);
	        }
	        catch(Exception e){
	            System.out.println("Bad String");
	        }
	}
	}





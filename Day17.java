package thirty_days_hackerrank;

import java.util.Scanner;

class Calculator{
	int power(int n, int p) throws Exception {
		int result = (int) Math.pow(n, p);		
		
			if(n<0||p<0) {
				throw new Exception("n and p should be non-negative");
			}
	return result;
}
}
    

public class Day17{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i =0; i <t; i ++) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }
}

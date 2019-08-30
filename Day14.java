package thirty_days_hackerrank;

import java.util.Scanner;

//									Scope
//=====================================================================================================


class Difference {
  	private int[] elements; // the scope of this integer array is within this Difference class
  	public int maximumDifference;// and this variable also

	// Add your code here
    public Difference(int[] a){
    	elements = new int[a.length];  // allocating memory to the declared array
        for(int i =0 ; i <a.length; i++){
           elements[i] = Math.abs(a[i]);
        }
    }
    public void  computeDifference(){
        int sum=0;
        maximumDifference = 0;
        for(int i =0; i <elements.length; i++){
            int row = elements[i];
            for(int j =i+1; j <elements.length; j++){
                int col = elements[j];
                sum = Math.abs(row-col);
                if(sum > maximumDifference){
                    maximumDifference = sum;
                }
            }
        }
    }

} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

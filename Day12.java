package thirty_days_hackerrank;

import java.util.Scanner;

// 						Inheritance
//======================================================================================================

class Person{
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}	
}

class Student extends Person{
	private int[] testScores;
	
	// Constructor
	Student( String firstName, String lastName, int id, int[] arr ){
		super(firstName, lastName, id);   // This is how you access the constructor of the parent class

	    this.testScores = arr;
	}
	// method     - NOTE: Can't use if() statement inside a Switch(Argument) 
	public char calculate() {
		int sum = 0;
		for(int i =0; i < testScores.length; i++) {
			sum = sum + testScores[i]; 
		}
		int a = sum/testScores.length;
		 if(a>= 90&&a<=100) {
			return 'O';
			//return grade;
		 }
		else if(a>= 80&&a<90) {
			return 'E';
			//return grade;
		}
		else if(a>= 70&&a<80) {
			return 'A';
			//return grade;
		}
		else if(a>= 55&&a<70) {
			return 'P';
			//return grade;
		}
		else if(a>= 40&&a<55) {
			return 'D';
			//return grade;
		}
		else if(a<40) {
			return 'T';

		}
		//else {
			//System.out.println("Hi");
		//}
		return 0; //how does this line make a difference ?
		
	}
}

public class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}			

}

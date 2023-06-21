package Labs.Lab_02;//Author: Marisa Young
//Date: April 6, 2023
//Description: Lab 02 - Write a program that calculates mileage reimbursement for a salesperson at a rate of $0.35 per mile. 

import java.util.Scanner;

//class header
public class Lab_02 {

	public static void main(String[] args) {			
		
		System.out.println("Mileage Reimbursement Calculator");
		
		//declare several variables of the same double data type;
		double startOdometer, endOdometer, milesTraveled, totalReimbursement;
				//startOdometer = Beginning odometer reading;
				//endOdometer = End odometer reading;
				//milesTraveled = Total miles traveled = (end odometer - starting odometer);
				//totalReimbursement = total $ salesperson will be reimbursed for travel;
				

		//object of scanner class used to read a double value input from the keyboard and assign the value to the startOdometer and endOdometer variables
		Scanner keyboard = new Scanner(System.in);	
		
		//ask user to enter beginning odometer reading
		System.out.print("Enter beginning odometer reading: ");
		
		//stores user input value to startOdometer variable
		startOdometer = keyboard.nextDouble();
		
		//ask user to enter end odometer reading
		System.out.print("Enter ending odometer reading: ");
		
		//stores user input value to endOdometer variable
		endOdometer = keyboard.nextDouble();
		
		
		// final key word used as variable declaration to make the variable a named constant (cannot be changed during program execution);
		//reimbursement rate at $0.35 per mile traveled using double data type;
		final double REIMBURSEMENT_RATE = 0.35; 			
		
		
		milesTraveled = endOdometer - startOdometer;
		totalReimbursement = REIMBURSEMENT_RATE * milesTraveled;
		
		//round miles traveled and total reimbursement to nearest tenth decimal
		double roundedMilesTraveled = (double) Math.round(milesTraveled*100)/100;
		double roundedTotalReimbursement = (double) Math.round(totalReimbursement*100)/100;

		
		System.out.println("You traveled " + roundedMilesTraveled + " miles. At $" + REIMBURSEMENT_RATE + " per mile, your reimbursement is $" + roundedTotalReimbursement + ".");
		
		//close keyboard scanner 
		keyboard.close();

	}

}

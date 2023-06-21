package Labs.Lab_04;

import java.io.*;

/**
 * @author Marisa Young
 * Date: 04/17/2023
 * Description: Finding Primes
 */
public class Lab_04 {

	public static void main(String[] args) throws IOException {
		
		int limit = 1000; //max limit for 
		String fileName = "FindingPrimes.txt";
		boolean notPrime;
		
		PrintWriter outputFile = new PrintWriter(fileName);
		// for loop to increment number count until number is less than or equal to max limit 1000
		for (int number = 2; number <= limit; number++) {
			
			// set variable notPrime to false before second for loop
			notPrime = false;
			
			//for loop to check if number is prime or not 
			for (int getPrime = 2; getPrime <= number/2; getPrime++) {
				if (number % getPrime == 0) {
					notPrime = true;
					break;
				}
			}
			// if notPrime = false, number is prime, write this number to the file
			if (!notPrime) {
				outputFile.println(number + "\n");
				System.out.println(number + "\n");
				
			}
			
		}
	
		outputFile.close();

	}
	
}

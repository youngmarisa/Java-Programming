package Labs.Lab_07;

import java.util.Scanner;		//needed for scanner class
/*
  @author marisa young
 * date: 04/05/2023
 * description: Rainfall Program
 */


/**
 * The main class that contains the entry point of the program.
 */
public class Lab_07 {

	/**
	 * The main method where the program starts its execution.
	 *
	 * @param args The command-line arguments passed to the program.
	 */
	public static void main(String[] args) {

		
		//array of months
		String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		//array of rainfall
		double[] rain;
		
		//size of the array
		final int numMonths = 12;
		
		//create an array to hold that number of months;
		rain = new double[numMonths];
		
		getValues(rain, MONTHS);
		
		totalRainfall(rain);
		
		averageMonthlyRainfall(rain);
	
		mostRain(rain, MONTHS);
		
		leastRain(rain, MONTHS);
		
	}
	

	/**
	 * Reads the rainfall data from the user for each month.
	 *
	 * @param rain   The array to store the rainfall data.
	 * @param MONTHS The array containing the names of the months.
	 */
	public static void getValues(double[] rain, String[] MONTHS) {
		
		//Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the total rainfall for each month for the last " + MONTHS.length + " months.");
		
		for (int index = 0; index < rain.length; index++) {
			double rainfall;
            do {
            	System.out.println("Total rainfall in " + MONTHS[index] + ": ");
                rainfall = keyboard.nextDouble();
                if (rainfall < 0) {
                    System.out.println("Rainfall cannot be negative. Please try again.");
                }
            } while (rainfall < 0);

            rain[index] = rainfall;
			
		}
		
		keyboard.close();
		
		
	}
	
	
		

	/**
	 * Calculates and displays the total rainfall for the year.
	 *
	 * @param rain The array containing the rainfall data.
	 */
		public static void totalRainfall(double[] rain) {
			double total = 0; //initialize accumulator
			for (int index = 0; index < rain.length; index++) {

				total += rain[index];

			}
			System.out.printf("The average rainfall for the year: %.2f inches. \n", total);
		}
		
		
		
		/**
		 * Calculates and displays the average monthly rainfall for the year.
		 *
		 * @param rain The array containing the rainfall data.
		 */
		public static void averageMonthlyRainfall(double[] rain) {
			double total = 0; //initialize accumulator
			double average = 0; //will hold the average
			for (int index = 0; index < rain.length; index++) {

				total += rain[index];
				average = total / rain.length;
				
			}
			System.out.printf("The average rainfall for the year: %.2f inches. \n", average);
		}
		
		
		/**
		 * Finds and displays the month with the highest amount of rain.
		 *
		 * @param rain   The array containing the rainfall data.
		 * @param MONTHS The array containing the names of the months.
		 */
	    public static void mostRain(double[] rain, String[] MONTHS) {
	        double highest = rain[0];
	        int monthIndex = 0;
	        for (int index = 1; index < rain.length; index++) {
	            if (rain[index] > highest) {
	                highest = rain[index];
	                monthIndex = index;
	            }
	        }

	        System.out.printf("The month with the most amount of rain: " + MONTHS[monthIndex] + " (%.2f inches). \n", highest);
	    }
		
		/**
		 * Finds and displays the month with the least amount of rain.
		 *
		 * @param rain   The array containing the rainfall data.
		 * @param MONTHS The array containing the names of the months.
		 */
	    public static void leastRain(double[] rain, String[] MONTHS) {
	        double lowest = rain[0];
	        int monthIndex = 0;
	        for (int index = 1; index < rain.length; index++) {
	            if (rain[index] < lowest) {
	                lowest = rain[index];
	                monthIndex = index;
	            }
	        }
	        
	        System.out.printf("The month with the least amount of rain: " + MONTHS[monthIndex] + " (%.2f inches). \n", lowest);
	    }


	}



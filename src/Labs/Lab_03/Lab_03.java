package Labs.Lab_03;
//Author: Marisa Young
//Date: April 8, 2023
//Description: Lab 03 - Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program should display an error message.

import java.util.Scanner;


public class Lab_03 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

        // Prompt user for a number within the range of 1 through 10
        System.out.print("Enter a number within the range of 1 through 10: ");
        int number = keyboard.nextInt();        
        
        //Switch statement lets user input of number variable determine what Roman Numeral to print
		switch (number) {
			case 1 -> System.out.println("The Roman numeral version of " + number + " is I.");
			case 2 -> System.out.println("The Roman numeral version of " + number + " is II.");
			case 3 -> System.out.println("The Roman numeral version of " + number + " is III.");
			case 4 -> System.out.println("The Roman numeral version of " + number + " is IV.");
			case 5 -> System.out.println("The Roman numeral version of " + number + " is V.");
			case 6 -> System.out.println("The Roman numeral version of " + number + " is VI.");
			case 7 -> System.out.println("The Roman numeral version of " + number + " is VII.");
			case 8 -> System.out.println("The Roman numeral version of " + number + " is VIII.");
			case 9 -> System.out.println("The Roman numeral version of " + number + " is IX.");
			case 10 -> System.out.println("The Roman numeral version of " + number + " is X.");
			default -> System.out.println("Error: Number must be within the range of 1 through 10.");
		}

        keyboard.close();

	}

}

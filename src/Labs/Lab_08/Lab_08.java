package Labs.Lab_08;

import java.util.Scanner;
/**
 * @author marisayoung
 * Date: May 10, 2023
 * Description: Proper Case
 *
 */
public class Lab_08 {

	/**
	 * 
	 * @param args Prompts user to enter string and display string in proper case
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner object to read user input
		 Scanner keyboard = new Scanner(System.in);
		 	
		 	//Prompt user to enter a string
	        System.out.print("Enter a string: ");
	        
	        
	        String input = keyboard.nextLine();
	        
	        //call displayProperCase method to display string in proper case
	        ProperCase.displayProperCase(input);
	        
	        //Close keyboard
	        keyboard.close();

	}
	
	public class ProperCase {
	    /**
	     * Displays the string in proper case, where the first letter of each word is capitalized and the rest of the letters are lower case.
	     *
	     * @param input the input string
	     */
	    public static void displayProperCase(String input) {
	    	
	    	// Split the input string into individual words
	        String[] words = input.trim().split("\\s+");
	        
	        // Create a variable to store the final result
	        StringBuilder resultProperCase = new StringBuilder();
	        
	        // Iterate through each word
	        for (String word : words) {
	        	
	        	//Check if the word has at least one letter
	            if (word.length() > 0) {
	            	
	            	//Get the first letter of each word and turn it upper case
	                String firstLetter = word.substring(0, 1).toUpperCase();
	                
	                //Get remaining letters of the word and make them lower case
	                String remainingLetters = word.substring(1).toLowerCase();
	                
	                //Append first letter to rest of the word to the result variable
	                resultProperCase.append(firstLetter).append(remainingLetters).append(" ");
	            }
	        }
	        
	        // Display the result by converting it to a string and removing any trailing spaces
	        System.out.println(resultProperCase.toString().trim());
	    }
	}


}

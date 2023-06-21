package Projects.Project_01;

import java.util.Scanner;

/**
 * @author Marisa Young
 * Date: April 13, 2023
 * Description: Project 01 - Time Calculator
 *
 */
public class Project_01 {

	public static final int SECONDS_IN_MINUTE = 60;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_DAY = 86400;
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		

	        System.out.print("Enter the number of seconds: ");
	        
	        int totalSeconds = keyboard.nextInt();


        int days = totalSeconds / SECONDS_IN_DAY;
        int hours = (totalSeconds % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
        int minutes = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = totalSeconds % SECONDS_IN_MINUTE;

        System.out.printf("You entered %d seconds, which is ", totalSeconds);

        if (days > 0) {
            System.out.printf("%d day%s, ", days, days > 1 ? "s" : "");
        }

        if (hours > 0 || days > 0) {
            System.out.printf("%d hour%s, ", hours, hours > 1 ? "s" : "");
        }

        if (minutes > 0 || hours > 0 || days > 0) {
            System.out.printf("%d minute%s, ", minutes, minutes > 1 ? "s" : "");
        }
        
        if (seconds < 60) {
        	System.out.printf("%d second%s.\n", seconds, seconds > 1 ? "s" : "");
        } else if (seconds >= 0) {

        	System.out.printf("and %d second%s.\n", seconds, seconds > 1 ? "s" : "");
        }
  
        
        if (days == 0) {
        	System.out.printf("(%d:%02d:%02d hours)", hours, minutes, seconds);
        	
        } else {

       System.out.printf("(%d days %d:%02d:%02d hours)", days, hours, minutes, seconds);
       
        }

        keyboard.close();

	}

}

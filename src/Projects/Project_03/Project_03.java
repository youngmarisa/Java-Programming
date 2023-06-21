package Projects.Project_03;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author marisayoung
 * The Project_03 class- calculates flight times and distances between airports information gathered from user inputs.
 */
public class Project_03 {

	/**
	 * The main method- gathers user input to calculate flight details to save as an HTML file
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);

        // Prompt user for the number of legs and ground speed
        System.out.print("Enter the number of legs: ");
        int numLegs = keyboard.nextInt();
        int numAirports = numLegs + 1;
        Airport [] airports = new Airport[numAirports];
        
        System.out.print("Enter the ground speed (in knots): \n");
        int groundSpeed = keyboard.nextInt();

      

        // Gather airport information from the user
        for (int i = 0; i < numAirports; i++) {
        	
        	
        	System.out.printf("Enter the latitude for Airport %d: ", i + 1);
            double latitude = keyboard.nextDouble();
            System.out.printf("Enter the longitude for Airport %d: ", i + 1);
            double longitude = keyboard.nextDouble();
            keyboard.nextLine(); // Consume newline character
            System.out.printf("Enter the name for Airport %d: ", i + 1);
         	String name = keyboard.nextLine();
            airports[i] = new Airport(latitude, longitude, name);
            
            
        }
        
        keyboard.close();
        
        double totalDistanceNM = 0.0;
        double totalFlightTime = 0.0;
        
        //output to console
        System.out.println("Leg\tFrom\tTo\tDist\tTime (mins)");
        
        //output html file
        StringBuilder itineraryBuilder = new StringBuilder();
        itineraryBuilder.append("<html><head><title>Flight Itinerary</title></head><body>");
        itineraryBuilder.append("<h1>Flight Itinerary</h1>");
        itineraryBuilder.append("<table><tr><th>Leg</th><th>From</th><th>To</th><th>Dist</th><th>Time (mins)</th></tr>");
        
        
        for (int i = 0; i < numLegs; i++) {
        	
            double distanceNM = calcDistance(airports[i], airports[i + 1]);
            double flightTime = distanceNM / (groundSpeed / 60);

            totalDistanceNM += distanceNM;
            totalFlightTime += flightTime;
            
            //output to console
            System.out.printf("%d\t%s\t%s\t%.1f\t%.0f\n",
                    i + 1, airports[i].getName(), airports[i + 1].getName(), distanceNM, flightTime);
            
            //output to html file
            itineraryBuilder.append("<tr>");
            itineraryBuilder.append("<td>").append(i + 1).append("</td>");
            itineraryBuilder.append("<td>").append(airports[i].getName()).append("</td>");
            itineraryBuilder.append("<td>").append(airports[i + 1].getName()).append("</td>");
            itineraryBuilder.append("<td>").append(String.format("%.2f", distanceNM)).append("</td>");
            itineraryBuilder.append("<td>").append(String.format("%.2f", flightTime)).append("</td>");
            itineraryBuilder.append("</tr>");
        
        }
        
        //output to console
        System.out.printf("Total\t\t\t%.2f\t%.2f\n", totalDistanceNM, totalFlightTime);
        
        //output to html file
        itineraryBuilder.append("<tr><td colspan=\"3\">Total</td>");
        itineraryBuilder.append("<td>").append(String.format("%.2f", totalDistanceNM)).append("</td>");
        itineraryBuilder.append("<td>").append(String.format("%.2f", totalFlightTime)).append("</td>");
        itineraryBuilder.append("</tr>");
        itineraryBuilder.append("</table>");
        itineraryBuilder.append("</body></html>");

        String itineraryHtml = itineraryBuilder.toString();
        
        // Save the itinerary as an HTML file
        try (FileWriter fileWriter = new FileWriter("flight_itinerary.html")) {
            fileWriter.write(itineraryHtml);
            System.out.println("Flight itinerary saved as 'flight_itinerary.html'");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the flight itinerary.");
            e.printStackTrace();
        }

	
	}
	
    /**
     * Calculates the great-circle distance between two points on the earth's surface using the haversine formula
     *
     * @param latOrigin   the latitude of the origin point, in degrees
     * @param longOrigin  the longitude of the origin point, in degrees
     * @param latDestin   the latitude of the destination point, in degrees
     * @param longDestin  the longitude of the destination point, in degrees
     * @return the distance between the two points, in nautical miles
     */
    public static double calcDistance(double latOrigin, double longOrigin, double latDestin, double longDestin) {
        final double EARTH_RADIUS = 10800 / Math.PI;

        double lat1 = Math.toRadians(latOrigin);
        double long1 = Math.toRadians(longOrigin);
        double lat2 = Math.toRadians(latDestin);
        double long2 = Math.toRadians(longDestin);
        double deltaAngle = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
        double distance = EARTH_RADIUS * deltaAngle;
        return distance;
    }
    
    /**
     * Calculates the distance between two airports using their latitude and longitude.
     *
     * @param origin    the origin airport
     * @param destin    the destination airport
     * @return the distance between the two airports, in nautical miles
     */
    public static double calcDistance(Airport origin, Airport destin) {
        return calcDistance(origin.getLatitude(), origin.getLongitude(), destin.getLatitude(), destin.getLongitude());
    }
    
    /**
     * Calculates the distance between an airport and a set of latitude and longitude coordinates.
     *
     * @param origin        the origin airport
     * @param latDestin     the latitude of the destination point, in degrees
     * @param longDestin    the longitude of the destination point, in degrees
     * @return the distance between the airport and the coordinates, in nautical miles
     */
    public static double calcDistance(Airport origin, double latDestin, double longDestin) {
        return calcDistance(origin.getLatitude(), origin.getLongitude(), latDestin, longDestin);
    }

}

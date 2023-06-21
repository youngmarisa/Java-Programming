package Labs.Lab_09;

import java.util.Scanner;

/**
 * @author marisayoung
 * Date: 05/13/2023
 * Description: Recursion
 *
 */
public class Lab_09 {
	
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
    

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double latOrigin, latDestin, longOrigin, longDestin;
		
        System.out.print("Enter the origin latitude: ");
        latOrigin = keyboard.nextDouble();
        System.out.print("Enter the origin longitude: ");
        longOrigin = keyboard.nextDouble();
        System.out.print("Enter the destination latitude: ");
        latDestin = keyboard.nextDouble();
        System.out.print("Enter the destination longitude: ");
        longDestin = keyboard.nextDouble();
        
        keyboard.close();
        
     
        
        Airport origin = new Airport(latOrigin, longOrigin);
        Airport destin = new Airport(latDestin, longDestin);
        
        
        double distanceNM = calcDistance(origin, destin);
        double distanceSM = distanceNM * 1.15;
        
        
	     System.out.printf("Nautical Miles: %.1f NM\n", distanceNM);
	     System.out.printf("Statute Miles: %.1f SM", distanceSM);
        
		

	}

}

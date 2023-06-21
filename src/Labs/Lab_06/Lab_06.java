package Labs.Lab_06;
/*
  @author Marisa Young
 * @since 04/25/2023
 * Description: Calculate nautical miles and statute miles between an origin and destination airport.
 */

import java.util.Scanner;



/**
 * This class calculates the distance between two points on the earth's surface using the haversine formula. It also provides a main method to allow users to input two sets of latitude and longitude coordinates and see the distance between them in both nautical miles and statute miles.
 */
public class Lab_06 {
	
    /**
     * Calculates the great-circle distance between two points on the earth's surface using the haversine formula
     * @param latOrigin the latitude of the origin point, in degrees
     * @param longOrigin the longitude of the origin point, in degrees
     * @param latDestin the latitude of the destination point, in degrees
     * @param longDestin the longitude of the destination point, in degrees
     * @return the distance between the two points, in nautical miles
     */
    public static double calcDistance(double latOrigin, double longOrigin, double latDestin, double longDestin) {
        /* The radius of the earth in nautical miles */
    	final double EARTH_RADIUS = 10800 / Math.PI;
    	
        double lat1 = Math.toRadians(latOrigin);
        double long1 = Math.toRadians(longOrigin);
        double lat2 = Math.toRadians(latDestin);
        double long2 = Math.toRadians(longDestin);
        double deltaAngle = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
        return EARTH_RADIUS * deltaAngle;
    }
	

	/**
     * Main method
     * @param args Unused.
     */
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
        
        
        Airport coordinates = new Airport();
        
        coordinates.setLatitude1(latOrigin);
        coordinates.setLongitude1(longOrigin);
        coordinates.setLatitude2(latDestin);
        coordinates.setLongitude2(longDestin);
        
		
        coordinates.airportInfo();
		
		 double distanceNM = calcDistance(latOrigin, longOrigin, latDestin, longDestin);
	     double distanceSM = distanceNM * 1.15;
	     System.out.printf("Nautical Miles: %.1f NM\n", distanceNM);
	     System.out.printf("Statute Miles: %.1f SM", distanceSM);
		
	}
	



}

package Labs.Lab_05;

/*
  @author Marisa Young
 * Date: 04/22/2023
 * Description: Airport Information
*/

/**
 * This program demonstrates the use of the Airport class.
 */
public class Lab_05 {
	
	/**
     * Main method creates an instance of the Airport class and prints out the airport information.
     * @param args Unused.
     */
	public static void main(String[] args) {
		
		//create a new instance of the Airport class
		Airport sanDiegoAirport = new Airport();
		
		//set airport identifier, latitude, longitude, magnetic variation, and elevation for the San Diego Airport.
		sanDiegoAirport.setIdentifier("SAN");
		sanDiegoAirport.setLatitude(32.7335556);
		sanDiegoAirport.setLongitude(-117.1896667);
		sanDiegoAirport.setMagneticVariation(14);
		sanDiegoAirport.setElevation(16.8);
		
		sanDiegoAirport.airportInfo();
		
		//create another instance of the Airport class for the New York Airport.
		Airport newYorkAirport = new Airport("JFK", 40.6399278, -73.7786925, 13, 13);
		
		newYorkAirport.airportInfo();

	}

}

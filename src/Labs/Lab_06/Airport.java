package Labs.Lab_06;

/**
 * This class represents an airport with a origin coordinates and destination coordinates (latitude and longitude),
 * Latitude is positive to indicate is North of the Equator and negative when it's located in the southern hemisphere.
 * Longitude is negative to indicate is West and positive to indicate it's East of the Greenwich median.
 */
public class Airport {
	

	private double latitudeOrigin;
	private double longitudeOrigin;
	private double latitudeDestination;
	private double longitudeDestination;

	/**
	 * Creates a new Airport object with latitude and longitude values set to 0 for both the origin and destination points.
	 */
	public Airport(){

		this.latitudeOrigin = 0;
		this.longitudeOrigin = 0;
		this.latitudeDestination = 0;
		this.longitudeDestination = 0;

	}
	
    /**
     * Constructor for creating a new Airport instance.
     *
     * @param lat1        The origin airport latitude.
     * @param long1       The origin airport longitude.
     * @param lat2		  The destination airport latitude.
     * @param long2       The destination airport longitude.
     */
	public Airport(double lat1, double long1, double lat2, double long2 ) {

		this.latitudeOrigin = lat1;
		this.longitudeOrigin = long1;
		this.latitudeDestination = lat2;
		this.longitudeDestination = long2;

	}
	

	
	/**
     * Gets the origin airport latitude,
     * @return latitudeOrigin The origin airport latitude.
     */
	
	public double getLatitude1() {
		return latitudeOrigin;
	}
	
	/**
     * Gets the origin airport longitude.
     * @return longitudeOrigin The origin airport longitude.
     */
	
	public double getLongitude1() {
		return longitudeOrigin;
	}
	
	/**
     * Gets the destination airport latitude,
     * @return latitudeDestination The destination airport latitude.
     */
	
	public double getLatitude2() {
		return latitudeDestination;
	}
	
	/**
     * Gets the destination airport longitude.
     * @return longitudeDestination The destination airport longitude.
     */
	
	public double getLongitude2() {
		return longitudeDestination;
	}


	
	/**
     * Sets the origin airport latitude.
     * @param lat1 The new origin airport latitude.
     * @return latitudeOrigin Sets new origin airport lat to latitude parameter
     */
	
	public double setLatitude1(double lat1) {
		return this.latitudeOrigin = lat1;
	}
	
	/**
     * Sets the airport longitude.
     * @param long1 The new origin airport longitude.
     * @return longitudeOrigin Sets new origin  airport lng to longitude parameter
     */
	
	public double setLongitude1(double long1) {
		return this.longitudeOrigin = long1;
	}
	
	/**
     * Sets the airport latitude.
     * @param lat2 The new airport latitude.
     * @return latitudeDestination Sets new airport lat to latitude parameter
     */
	
	public double setLatitude2(double lat2) {
		return this.latitudeDestination = lat2;
	}
	
	/**
     * Sets the destination airport longitude.
     * @param long2 The new  destination airport longitude.
     * @return longitudeDestination Sets new destination airport lng to longitude parameter
     */
	
	public double setLongitude2(double long2) {
		return this.longitudeDestination = long2;
	}
	

	
    /**
     * Returns a string representation of the origin and destination airport coordinates.
     */
	public void airportInfo() {
		System.out.println(
				"Airport { " +
		                "Latitude Origin: " + latitudeOrigin +
		                ", Longitude Origin: " + longitudeOrigin +
		                ", Latitude Destination: " + latitudeDestination +
		                ", Longitude Destination: " + longitudeDestination +
		                " }"
		
		);
	}
	
}

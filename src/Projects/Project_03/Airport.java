package Projects.Project_03;

/**
 * This class represents an airport with a origin coordinates and destination coordinates (latitude and longitude),
 * Latitude is positive to indicate is North of the Equator and negative when it's located in the southern hemisphere.
 * Longitude is negative to indicate is West and positive to indicate it's East of the Greenwich median.
 * PROJECT 03
 */
public class Airport {
	

	private double latitude;
	private double longitude;
	private String name;

	/**
	 * Creates a new Airport object with latitude and longitude values set to 0 for both the origin and destination points.
	 */
	public Airport(){

		this.latitude = 0;
		this.longitude = 0;

	}
	
    /**
     * Constructor for creating a new Airport instance.
     *
     * @param latitude        The airport latitude.
     * @param longitude       The airport longitude.
     * @param name			  The airport name.	

     */
	public Airport(double latitude, double longitude, String name) {

		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;

	}
	

	

	
	/**
     * Gets the airport latitude,
     * @return latitude The airport latitude.
     */
	
	public double getLatitude() {
		return latitude;
	}
	
	/**
     * Gets the airport longitude.
     * @return longitude The airport longitude.
     */
	
	public double getLongitude() {
		return longitude;
	}
	
	/**
     * Gets the airport name.
     * @return name The airport name.
     */
	
	public String getName() {
		return name;
	}
	
	
	/**
     * Sets the airport latitude.
     * @param latitude The new airport latitude.
     * @return latitude Sets new airport latitude to latitude parameter
     */
	
	public double setLatitude(double latitude) {
		return this.latitude = latitude;
	}
	
	/**
     * Sets the airport longitude.
     * @param longitude The new airport longitude.
     * @return longitude Sets new airport longitude to longitude parameter
     */
	
	public double setLongitude(double longitude) {
		return this.longitude = longitude;
	}
	
	/**
     * Sets the name of the airport.
     * @param name The new airport name.
     * @return name Sets new airport name to name parameter
     */
	
	public String setName(String name) {
		return this.name = name;
	}
	

	
}

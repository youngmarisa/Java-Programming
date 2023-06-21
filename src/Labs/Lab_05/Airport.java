package Labs.Lab_05;

/**
 * This class represents an airport with an identifier, coordinates (latitude and longitude),
 * magnetic variation, and elevation above sea level in feet.
 * Latitude is positive to indicate is North of the Equator and negative when it's located in the southern hemisphere.
 * Longitude is negative to indicate is West and positive to indicate it's East of the Greenwich median.
 * Magnetic variation is indicated negative for West and positive for East. It is OK to have no magnetic variation.
 */


public class Airport {
	
	private String identifier;
	private double latitude;
	private double longitude;
	private double magneticVariation;
	private double elevation;
	
	public Airport(){
		this.identifier = "";
		this.latitude = 0;
		this.longitude = 0;
		this.magneticVariation = 0;
		this.elevation = 0;
	}
	
    /**
     * Constructor for creating a new Airport instance.
     *
     * @param id         The airport identifier.
     * @param lat        The airport latitude.
     * @param lng        The airport longitude.
     * @param mV		 The airport magnetic variation.
     * @param elev       The airport elevation.
     */
	
	public Airport(String id, double lat, double lng, double mV, double elev ) {
		this.identifier = id;
		this.latitude = lat;
		this.longitude = lng;
		this.magneticVariation = mV;
		this.elevation = elev;
	}
	
	/**
     * Gets the airport identifier.
     * @return The airport identifier.
     */
	
	public String getIdentifier(){
		return identifier;
	}
	
	/**
     * Gets the airport latitude,
     * @return The airport latitude.
     */
	
	public double getLatitude() {
		return latitude;
	}
	
	/**
     * Gets the airport longitude.
     * @return The airport longitude.
     */
	
	public double getLongitude() {
		return longitude;
	}
	
	/**
     * Gets the airport magnetic variation.
     * @return The airport magnetic variation.
     */
	
	public double getMagneticVariation() {
		return magneticVariation;
	}
	
	/**
     * Gets the airport elevation.
     * @return The airport elevation.
     */
	
	public double getElevation() {
		return elevation;
	}
	
	/**
     * Sets the airport identifier.
     * @param id The new airport identifier.
     * @return id Sets new airport id to identifier parameter
     */
	
	public String setIdentifier(String id) {
		return this.identifier = id;
	}
	
	/**
     * Sets the airport latitude.
     * @param lat The new airport latitude.
     * @return latitude Sets new airport lat to latitude parameter
     */
	
	public double setLatitude(double lat) {
		return this.latitude = lat;
	}
	
	/**
     * Sets the airport longitude.
     * @param lng The new airport longitude.
     * @return lng Sets new airport lng to longitude parameter
     */
	
	public double setLongitude(double lng) {
		return this.longitude = lng;
	}
	
	/**
     * Sets the airport magnetic variation.
     * @param mV The new airport magnetic variation.
     * @return magneticVariation Sets new airport mV to magneticVariation parameter
     */
	
	public double setMagneticVariation(double mV) {
		return this.magneticVariation = mV;
	}
	
	/**
     * Sets the airport elevation.
     * @param elev The new airport elevation
     * @return elevation Sets new airport elev to elevation parameter
     */
	
	public double setElevation(double elev) {
		return this.elevation = elev;
	}
	
    /**
     * Returns a string representation of the Airport instance.
     */
	public void airportInfo() {
		System.out.println(
				"Airport { " +
		                "Identifier: " + identifier +
		                ", Latitude: " + latitude +
		                ", Longitude: " + longitude +
		                ", Magnetic Variation: " + magneticVariation +
		                ", Elevation: " + elevation + " }"
		
		);
	}
	
	
	
	
}

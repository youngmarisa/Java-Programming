**AIRPORT DISTANCE CALCULATOR**

Modify your class Airport from Lab 05 with the static method: <br/>
* According to http://en.wikipedia.org/wiki/Great-circle_distanceLinks, the great circle distance based on two coordinates in nautical miles is given by *Distance = Radius * DeltaAngle*.
* The radius of the earth is a constant and its value in radians is *r = 10800 / PI*. Given 2 coordinates (Lat1, Long1, Lat2, and Long2) the formula can be re-written as: *DeltaAngle = acos(sin(Lat1) * sin(Lat2) + cos(Lat1) * cos(Lat2) * cos(Long1 – Long2))*. Because the coordinates on earth are given in degrees, you need to convert the degrees into radians by multiplying the degrees * PI / 180.

Create a *static* method called **calcDistance**, and it should take two sets of coordinates (**LatOrigin**, **LongOrigin**, **LatDestin**, and **LongDestin**) and it should return the distance in nautical miles using the formula above. Keep in mind the Greek symbols are not allowed in java.

In the *main* method, you will ask the user to enter two coordinates (LatOrigin, LongOrigin, LatDestin, LongDestin) and you will calculate the distance in nautical miles using the method above. Then you will display to the user the correspondent distance rounded to one decimal (i.e. 105.5 NM). Then, also display the distance in statute miles. This is the distance in nautical miles * 1.15.

To test your program, you can get some coordinates of known airports and calculate the distance between then. You can use http://www.airnav.com/airports/ to enter airport IDs.

For example:
* SAN indicates San Diego, and its coordinates are Lat = 32.7335556 and Long = -117.1896667 (http://www.airnav.com/airport/KSAN). 
* JFK is New York and its coordinates are Lat = 40.6397511, Long = -73.7789256.
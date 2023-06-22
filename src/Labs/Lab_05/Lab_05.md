**AIRPORT INFORMATION**

Create a class called Airport with the following fields: <br/>
* **Identifier**.
* Coordinates which consist of **Latitude** and **Longitude**. Latitude is positive to indicate is North of the Equator and negative when it's located in the southern hemisphere. Longitude is negative to indicate is West and positive to indicate it's East of the Greenwich median.
* A **magnetic variation** which also is indicated negative for West and positive for East. It is OK to have no magnetic variation.
* **Elevation** above sea level in feet.

For example San Diego airport has the values ID: SAN, Lat: 32.7335556, Long: -117.1896667, Var: 14, Elev: 16.8' (http://www.airnav.com/airport/SAN)

The class should have an accessor and mutator methods for each field. <br/>

When the Longitude is negative it is understood it’s on the West side of the Greenwich Meridian and when the Latitude is negative is understood it’s South of the Ecuador.
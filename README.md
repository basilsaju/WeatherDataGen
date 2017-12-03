# WeatherDataGen

This is a project to generate sample data for testing weather models. 
The output is of the following format:
city|latitude,longitude,altitude|timestamp|condition|temperature|pressure|humidity

Weather data points for 10 cities are generated for 4 seasons (summer, spring, winter, autumn). 

input parameters:
  1. location file location: city,latitude,longitude,altitude.
  2. min-max file location: city, season, minTemp, maxTemp, minPressure, maxPressure, minHumidity, maxHumidity.
  3. output file location.

### Logic Used:
A random date is generated for each season. From the input file, other parameters like temperature, pressure, humidity are randomly generated within the range specified in the input file. A weather condition is then calculated as per the values of pressure, humidity values and time of the day.

### Build:
mvn clean install

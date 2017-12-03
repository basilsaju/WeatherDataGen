package com.cba.weather.test;


import java.util.Date;

import com.cba.weather.RandomDateGenerator;
import com.cba.weather.RandomWeatherEventGenerator;
import com.cba.weather.SeasonEnum;
import com.cba.weather.WeatherEvent;

import junit.framework.TestCase;

/**
 * Unit Testing
 */


public class RandomGeneratorTest extends TestCase{
	 RandomDateGenerator randomDateGen;
	 RandomWeatherEventGenerator randomWeatherGen;
	 WeatherEvent weatherEvent;
    
    protected void setUp(){
        randomDateGen = new RandomDateGenerator();//new Date(2017,12,31),new Date(2018,01,30));
        randomWeatherGen = new RandomWeatherEventGenerator();
        randomDateGen.setdMax(new Date(2017,12,31));
        randomDateGen.setdMin(new Date());
        weatherEvent = new WeatherEvent(25, (float)(908.35), (float)(56.39),new Date(2018,12,28,13,00,00),"SUMMER");

    }

    @org.junit.Test
    public void testGenerate(){  	
    	assertNotNull(randomDateGen.generate());
    	assertNotNull(randomWeatherGen.getCondition(weatherEvent.getPressure(), weatherEvent.getHumidity(),SeasonEnum.SUMMER.toString(),weatherEvent.getTimeOfReading()));
    	assertEquals("sunny",randomWeatherGen.getCondition(weatherEvent.getPressure(), weatherEvent.getHumidity(),SeasonEnum.SUMMER.toString(),weatherEvent.getTimeOfReading()));
    }

    @Override
    protected void tearDown() throws Exception {
        randomDateGen = null;
        super.tearDown();
    }
}
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class City  {
	private String cityName;
	private Integer temperature;
	
	public City()
	{
		cityName = "";
		temperature = 0;
	}
	public City(String theCityName, int theTemperature)
	{
		this.cityName = theCityName;
		this.temperature = theTemperature;
	}
	
	public String getCityName()
	{
		return cityName;
	}
	public void setCityName(String newCityName)
	{
		this.cityName = newCityName;
	}
	public int getTemperature()
	{
		return temperature;
	}
	public void setTemperature(int newTemperature)
	{
		this.temperature = newTemperature;
	}
	
	@Override
	public String toString()
	{
		return (cityName + " " + temperature + "  C" );
	}
	
	 /**
     * Overloaded equals function to check if two cities are identical (temperature)
     *
     * */
	public boolean equals(City otherCity)
	{
			return(this.temperature == otherCity.temperature);
	}
	

	
	
}

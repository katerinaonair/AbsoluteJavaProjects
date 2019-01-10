import java.util.Comparator;

public class CitySortingComparator implements Comparator<City> {

	
		@Override
		  public int compare(City emp1, City emp2) {
		    int cityName = emp1.getCityName().compareTo(emp2.getCityName());
		    int compareTemperature = Integer.compare(emp1.getTemperature(), emp2.getTemperature());
		 // 3-level comparison using if-else block
	        if(cityName == 0) {
	            return ((cityName == 0) ? compareTemperature : cityName);
	        }
	        else {
	            return cityName;
	        }
		}

}

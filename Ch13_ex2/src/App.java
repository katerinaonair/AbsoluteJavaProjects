/*
 * Sorting list of objects on multiple fields using Comparator in Java
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<City> cityList = new ArrayList<City>();
		
		City c1 = new City("Bari", 5);
		City c2 = new City("Chita", 0);
		City c3 = new City("Mosca", 5);
		City c4 = new City("Leon", 2);
		City c5 = new City("Caserta", 5);
		
		cityList.add(c1);
		cityList.add(c2);
		cityList.add(c3);
		cityList.add(c4);
		cityList.add(c5);
		
		 // before Sorting: iterate using Iterator & while-loop
        Iterator<City> cityIterator = 
                cityList.iterator();
		
		while(cityIterator.hasNext())
		{
			System.out.println(cityIterator.next());
		}
		
		// sorting using Collections.sort(al, comparator);
        Collections.sort(cityList, 
                new CitySortingComparator());
		// after Sorting: iterate using enhanced for-loop
        System.out.println("\n\nAfter Sorting: iterate using"
                + " enhanced for-loop\n");
        for(City city : cityList) {
            System.out.println(city);
        }
        
		

		        
	}

}

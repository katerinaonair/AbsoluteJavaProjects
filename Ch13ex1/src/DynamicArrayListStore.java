import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayListStore {

	public static void main(String[] args) {
		ArrayList<String> storeList = new ArrayList<String>(10);
		
		System.out.println("Enter list etnries: ");
		
		boolean done = false;
		String next = null;
		String answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(!done)
		{
			System.out.println("Input an entry: ");
			next = keyboard.nextLine();
			storeList.add(next);
			System.out.println("More items to store?");
			answer = keyboard.nextLine();
			if(!(answer.equalsIgnoreCase("yes")))
				done = true;
		}
		
		for(String e: storeList)
			System.out.println(e + " ");
		
		System.out.println("Tre are " + storeList.size() + " elements in the list");
		
		System.out.println("Search for the item: ");

		String searchKey = keyboard.nextLine();
		if(storeList.contains(searchKey))
		{
			System.out.println("The item is found: " + searchKey);
		}
		else
		{
			System.out.println("Nothing is found ");
		}
		
		System.out.println("");
		for(String e: storeList)
			System.out.println(e + " ");
		System.out.println("Enter a word to replace: ");
		String replaceKey = keyboard.nextLine();
		System.out.println("Enter a new word to insert: ");
		String newKey = keyboard.nextLine();
		
 
		storeList.set( storeList.indexOf(replaceKey) , newKey);
 
        System.out.println(storeList);
        
        System.out.println("");
		for(String e: storeList)
			System.out.println(e + " ");
	}

}

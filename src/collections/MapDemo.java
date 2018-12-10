package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is used to store data in key value pairs
 * HashMap : it won't maintain any insertion order
 * LinkedHashMap : it will maintain insertion order
 * TreeMap : it will ascending or alphabatical order of keys
 */
public class MapDemo {

	public static void main(String[] args) {
//		Map<String, Integer> books = new HashMap<>();
//		Map<String, Integer> books = new LinkedHashMap<>();
		Map<String, Integer> books = new TreeMap<>();
//		the number of elements in a Map
		System.out.println(books.size());

//		check if a Map is empty or not
		System.out.println(books.isEmpty());

//		add the data to the map
		books.put("java", 10);
		books.put("c", 2);
		books.put("python", 10);
		books.put("java", 5);
		books.put("cpp", 3);

//		print the map on the console
		System.out.println(books);

//		retrieve the data using get(key)
		System.out.println("number of python books " + books.get("python"));

//		for loop 
//		retrieve all the keys of a map
		Set<String> keys = books.keySet();
		for (String key : keys) {
			System.out.println(key + " = " + books.get(key));
		}

		Collection<Integer> values = books.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		Set<Entry<String, Integer>> entrySet = books.entrySet();
		for (Entry<String, Integer> eachPair : entrySet) {
			System.out.println(eachPair.getKey() + "\t" + eachPair.getValue());

		}
		
//		remove a data from map
		books.remove("c");
		System.out.println(books);
		
		books.remove("cpp", 3);
		System.out.println(books);
		
//		update the data of a map
		books.put("java", 15);
		System.out.println(books);
		
		
//		remove all the elements of map
		books.clear();
		System.out.println(books);
	}

}

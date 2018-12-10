package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * set does not allow duplicate data
 * HashSet : it will not maintain any insertion order
 * LinkedHashSet : it will store insertion order
 * TreeSet : it will store the data in ascending order or alphabatical order
 */

public class SetDemo {
	public static void main(String[] args) {
//		create a set
//		Set<Integer> numbers = new HashSet<>();
//		Set<Integer> numbers = new LinkedHashSet<>();
		Set<Integer> numbers = new TreeSet<>();
		
//		find the number of elements in a set
		System.out.println(numbers.size());
		
//		to check a set is empty or not
		System.out.println(numbers.isEmpty());
		
//		add the data to the set
		numbers.add(12);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		numbers.add(12); //duplicate
		numbers.add(18);
		numbers.add(16); //duplicate
		
		System.out.println(numbers.size());
		
//		print the set on the console
		System.out.println(numbers);
		
//		retrieve the data using for each loop
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
//		retrieve the data using iterator method
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		add a set to another set
		Set<Integer> marks = new TreeSet<>();
		marks.add(89);
		marks.add(78);
		marks.add(77);
		marks.add(80);
		marks.add(81);
		
		
		numbers.addAll(marks);
		
		System.out.println("marks = "+marks);
		System.out.println("numbers = "+numbers);
		
//		removing data from the set
		numbers.remove(89);
		System.out.println("numbers = "+numbers);
		
		numbers.removeAll(marks);
		System.out.println("numbers = "+numbers);
		
//		serach for some data in a set
		System.out.println(numbers.contains(15));
		
//		remove all the data from a set
		numbers.clear();
		
		System.out.println("numbers = "+numbers);
		
	}

}

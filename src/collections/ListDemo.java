package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
//		add data to the list
		numbers.add(10);
		numbers.add(12);
		numbers.add(14);
		numbers.add(16);
		numbers.add(11);
		numbers.add(12);
		
//		get the number of elements of a list
		System.out.println(numbers.size());
		
//		print elements of a list
		System.out.println(numbers);
		
//		insert the data at a given index
		numbers.add(4, 25);
		System.out.println(numbers);
		
//		update the data at a given index
		numbers.set(4, 45);
		System.out.println(numbers);
		
//		get the data at a given index
		System.out.println(numbers.get(5));
		
//		iterate over the list to get all the data of the list
		for(int i =0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		for(Integer num : numbers) {
			System.out.println(num);
		}
		
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(110);
		nums.add(120);
		
		numbers.addAll(nums);
		System.out.println(numbers);
		
//		remove the data from the list
		numbers.remove(3);
		System.out.println(numbers);
		
		numbers.removeAll(nums);
		System.out.println(numbers);
		
//		insert a list at a given index
		numbers.addAll(4, nums);
		System.out.println(numbers);
		
//		search for a data in a list
		System.out.println("contains 15:"+numbers.contains(15));
		System.out.println("contains 12:"+numbers.contains(12));
		
//		remove all the data from the list
		numbers.clear();
		
//		verify a given list empty or not
		System.out.println(numbers.isEmpty());
		
		
	}
}

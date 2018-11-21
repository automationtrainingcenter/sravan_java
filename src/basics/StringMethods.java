package basics;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";

		String s3 = s1;
		String s4 = "KRISHNA";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println(s1.length());
		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println(s1.isEmpty()); // false
		System.out.println(s2.isEmpty()); // true
		
		/* concat(): combines two given strings */
		System.out.println(s1.concat(" webdriver"));
		
		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals("selenium")); //true
		System.out.println(s1.equals("SELENIUM")); // false
		
		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("selenium")); //true
		System.out.println(s1.equalsIgnoreCase("SELENIUM")); // true
		
		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s5.contains(s1)); //true
		System.out.println(s5.contains("Python")); //false

		/* toLowerCase(): converts given string to lower case */
		s4  = s4.toLowerCase();
		System.out.println(s4);

		/* toUpperCase(): converts given string to upper case */
		s4  = s4.toUpperCase();
		System.out.println(s4);
		
		/* charAt(): returns a character at a given index number */
		System.out.println(s1.charAt(4)); //index number start from 0

		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s1.indexOf('e')); // 1
		System.out.println(s1.indexOf('i')); //5
		System.out.println(s1.indexOf('z')); // -1

		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s5.startsWith("welcome")); //true
		System.out.println(s5.startsWith("HI")); //false

		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s5.endsWith("launguage")); //true
		System.out.println(s5.endsWith("python")); //false

		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s5.replace("Java", "Python"));
		

		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values Note: substring() will include the beginning
		 * index character and excludes ending index character
		 */
		System.out.println(s1.substring(4));
		System.out.println(s5.substring(15, 20));

		/* toCharArray() return an array of characters inside the given string */
		char[] characters = s1.toCharArray(); 
//		for(DatatypeOfArray varName : arrayVarName){ statements}
		for(char character : characters) {
				System.out.println(character);
		}
		
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
		
		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println("before trimming :"+s6);
		System.out.println("after trimming :"+s6.trim());

	}

}

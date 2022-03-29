package lec18_01_java_string_manipulation;

import java.util.Arrays;

public class UseOfString02 {

	public static void main(String[] args) {
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";

		// To compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this
		// string, false otherwise
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));

		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println(s3.equals(s4)); // how that can be solved, second way below--
		System.out.println(s3.equalsIgnoreCase(s4));

		// The java string trim() method eliminates leading and trailing spaces. 
		// To avoid white space: trim() -- (remove any leading and trailing whitespace) 
		System.out.println("\n------------------------------------------------------------------------\n");
		String s5 = "          HelloWorld.  ";
		System.out.println("After trimming: " + s5.trim()); // Please see line 57 for solution of removing white space present between words
		
		// can't remove white space Between Words
		System.out.println("\n------------------------------------------------------------------------\n");
		String s6 = "    Hello    World!    ";
		System.out.println("After trimming: " + s6.trim());
		
		// The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println("\n------------------------------------------------------------------------\n");
		String s7 = "Good morning";
		System.out.println("After replacing: " + s7.replace('m', 'M') );
		
		// replace() can't trim
		System.out.println("\n------------------------------------------------------------------------\n");
		String s8 = "      GooD Morning      ";
		System.out.println("After replacing: " + s8.replace('D', 'd') );
		
		System.out.println("\n------------------------------------------------------------------------\n");
		String s9 = "      Good MoRning      ";
		System.out.println("After triming and replacing: " + s9.trim().replace('R', 'r') );
		System.out.println("If the above methods are used, now the value of String is: " + s9);
		
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("After triming and replacing: " + s5.trim().replace('.', '!') );
		
		System.out.println("\n------------------------------------------------------------------------\n");
		String s10 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s10.replace("Hello!", "Welcome to Java.") );
		
		System.out.println("\n------------------------------------------------------------------------\n");
		String dateOfToday = "11/22/2021"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-') );		
		
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("After trimming: " + s6.trim().replace("   World!", "World!"));
		
		// The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("After replacing the complete String: " + s10.replaceAll(s10, "Hey Hey captian!"));
		
		// regular way of concatenation
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("Hello" + " World!");
		System.out.println(s1+s10);
		
		// Concatenation
		// The Java String class concat() method combines specified string at the end of this string. It returns a combined string.
		System.out.println("\n------------------------------------------------------------------------\n");
		String s11 = "My name is ";
		String s12 = "Tofael";
		System.out.println(s11.concat(s12));
		
		// You don't need to study below code (learn later)
		// Just learn use of split()
		// The java string split() method splits this string against a given regular expression and returns a char array.
		System.out.println("\n------------------------------------------------------------------------\n");
		String s13 = "I am a java developer";
		String [] words= s13.split(" ");
		System.out.println(Arrays.toString(words));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

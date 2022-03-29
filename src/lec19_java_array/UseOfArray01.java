package lec19_java_array;

import java.util.Arrays;

/*
 Array is a container which stores a group of the same data type element. 
 Array is index based and the first element of an array starts with the index 0. 
 The size of array is fixed once declared
 Arrays is a class, used to manipulate Array
 */

public class UseOfArray01 {

	public static void main(String[] args) {
		
		int [] age = new int [6]; // declaring size of the array, here 6
		// int [] age = {23, 93, 0, 127, 0, 90} ; // An array can be presented also this way
		
		// Array is fixed size (Array is static)
		// age is the array name
		// [] called container
		// Mixed data type can't be used, example: int and String can't mixed
		
		age[0] = 23;
		age[1] = 93;
		
		age[3] = 127;
		
		age[5] = 90;
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		System.out.println(age[5]);
		// System.out.println(age[6]);
		
		System.out.println("The length: " + age.length);
		
		// Arrays is a class, used to manipulate Array
		System.out.println(Arrays.toString(age));
		
		/*
		 * 
		 * Note: As we know that array does not accept mixed data type but if we try to
		 * put char in int[] array it will accept and when we print that index value it
		 * will show a strange numerical value. Though it looks like a int value but it
		 * is actually an ASCII value. At runtime char is converted to ASCII value. That
		 * means every char has a specific ASCII value. There is even a specific
		 * calculation in the ASCII table. Have a look at the table.
		 * 
		 */
		
		

	}

}

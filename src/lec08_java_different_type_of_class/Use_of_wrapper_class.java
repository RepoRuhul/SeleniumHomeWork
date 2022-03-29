package lec08_java_different_type_of_class;

/*

https://www.tutorialspoint.com/java/java_numbers.htm#:~:text=All%20the%20wrapper%20classes%20(Integer,taken%20care%20by%20the%20compiler.

-- Byte, Short, Integer, Long, Float, Double --- class -- Called Wrapper class
-- byte, short, int, long, float, double -- variable type
-- All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses (child) of the abstract class 'Number'. 
-- The object of the wrapper class contains or wraps its respective primitive data type. 

-- (no need) Converting primitive data types into object is called boxing, and this is taken care by the compiler.

 * */

// lec 8 is short because, added content in Lec 7-02
public class Use_of_wrapper_class {
	public static void main(String[] args) {

		System.out.println("\n................. Conversion from String to int .....................\n");
		String name = "100";
		System.out.println(name); // 100
		System.out.println(name+20); // 10020
		System.out.println(name+" "+20); // 100 20
		System.out.println(name+" "+20+10); // 100 2010
		System.out.println(name+" "+(20+10)); // 100 30
		// 20+25 is following Java Arithmetic Operators: addition
		System.out.println(20 + 25 + name + " " + 20 + 10 + (10 + 10) + 5 + 6); //45100 20102056
		System.out.println(7 + 3 + name + " " + 212 + 111900); //10100 212111900
		// Integer.parseInt(name) -- convert a String type variable to int type variable
		// important interview question
		System.out.println(7 + 3 + Integer.parseInt(name) + " " + 20 + 10 + (10 + 10) + 5 + 6); //110 20102056
		System.out.println(7 + 3 + Integer.parseInt(name) + 20 + 10 + (10 + 10) + 5 + 6); // 171
		
		System.out.println("\n................. Conversion from String to int (when not a pure number) .....................\n");
		String name2 = "100W";
		System.out.println(name2); //100W
		System.out.println(name2+20); //100W20
		System.out.println(name2+" "+20); //100W 20
		// System.out.println(Integer.parseInt(name2)+20);
		// When the number is not pure, conversion from String to Integer is not possible, important info
		// you learn this line from this page
				
		System.out.println("\n................. conversion from String to double .....................\n");
		String name3 = "3.15";
		System.out.println(name3); // 3.15
		System.out.println(name3 + 1.25); // 3.151.25
		System.out.println(name3 + "  " + 1.25); //3.15 1.25
		System.out.println(2.5 + 2.5 + name3 + "  " + 1.25 + 1.25); // 5.03.15 1.251.25 
		System.out.println(2.5 + 2.5 + name3 + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 5.03.15 2.500.51.05.0
		System.out.println(name3); // 3.15
		System.out.println(Double.parseDouble(name3)); // 3.15
		// an empty String below
		System.out.println(2.5 + 2.5 + Double.parseDouble(name3) + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 8.15 2.500.51.05.0
		System.out.println(2.5 + 2.5 + Double.parseDouble(name3) + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 17.15
		
		System.out.println("\n................. conversion from String to float .....................\n");
		String name4 = "3.15f";
		System.out.println(name4); // 3.15
		System.out.println(name4 + 1.25); // 3.15f1.25
		System.out.println(name4 + "  " + 1.25); // 3.15f 1.25
		System.out.println(2.5f + 2.5f + name4 + "  " + 1.25 + 1.25); // 5.03.15f  1.251.25
		System.out.println(2.5f + 2.5f + name4 + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 5.03.15f 2.50.51.05.0
		System.out.println(name4); // 3.15f
		System.out.println(Float.parseFloat(name4)); // 3.15
		System.out.println(2.5f + 2.5f + Float.parseFloat(name4)); // 8.15
		System.out.println(2.5f + 2.5f + Float.parseFloat(name4) + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 8.15  2.50.51.05.0
		// " " -- Empty String
		System.out.println(2.5f + 2.5f + Float.parseFloat(name4) + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 17.149999618530273
		// Why? because float + double happening here, if we use f for rest of them, it will show float value
		
		System.out.println("\n................. conversion from String to character .....................\n");
		// conversion from String to char (We will study it when we start String Manipulation)
		// String is a collection of Character
		// rather we find some different method
		char sex = Character.toLowerCase('M'); // you learn this line from this page
		System.out.println(sex);

		char direction = Character.toUpperCase('e'); // you learn this line from this page
		System.out.println(direction);

	}

}

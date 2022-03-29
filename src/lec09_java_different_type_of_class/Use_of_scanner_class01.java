package lec09_java_different_type_of_class;

import java.util.Scanner;

/*
System is a class, and 'in' is a property of InputStream class, that helps to input data in console
nextInt()  is a method of Scanner class (for int type)
nextLine() is a method of Scanner class (for String type)
close() is a method of Scanner class
To learn more: https://www.javatpoint.com/Scanner-class
*/

public class Use_of_scanner_class01 {

	public static void main(String[] args) {
		System.out.println("Please enter your age here: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.println("\nYour age is: "+age);
		scanner.close();
	}
}

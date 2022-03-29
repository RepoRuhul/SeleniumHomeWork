package lec02_java_basics;

// we are learning: String concatenation, very important and very easy!!!

public class HappyBirthDay {

	public static void main(String[] args) {
		// Print by a complete sentence as a String.
		// How you understand this is a String? when you see something inside double quotation
		System.out.println("Rowan Atkinson born today 01/06. Happy Birth day!");
		// Print by String concatenation
		// Concat is a verb
		// String concatenation -- Concat/connect multiple String
		System.out.println("Rowan Atkinson "+"born today 01/06. "+"Happy Birth day!");
		
		// the below is not String concatenation, other way to print same
		System.out.print("Rowan Atkinson ");
		System.out.print("born today 01/06. ");
		System.out.print("Happy Birth day!");

	}

}

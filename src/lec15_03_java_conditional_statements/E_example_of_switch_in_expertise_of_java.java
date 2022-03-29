package lec15_03_java_conditional_statements;

public class E_example_of_switch_in_expertise_of_java {

	public static void main(String[] args) {
		// Declaring String variable
		String MyLevelOfJava = "Intermediate";
		int level = 0;
		
		// Using String in Switch expression
		switch (MyLevelOfJava) {
		// Using String Literal in Switch case
		case "Beginner":
			level = 1; // Instead of sysout, we can also declared as variable
			break;

		case "Intermediate":
			level = 2;
			break;

		case "Expert":
			level = 3;
			break;

		case "Excellent":
			level = 4;
			break;

		default:
			level = 0;
			break;
		}

		System.out.println("My Level of Java is: " + level);
	}

}

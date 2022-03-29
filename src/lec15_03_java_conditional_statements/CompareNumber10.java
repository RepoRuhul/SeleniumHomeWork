package lec15_03_java_conditional_statements;

// Nested if condition 

public class CompareNumber10 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 17;
		int weight = 68;
		// applying condition on age and weight
		// Condition: To donate blood, you must be more than or equal to 18 years old and your weight should be more than 50 kg 
		
		if (age>=18) {		
			if (weight >50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}			
		} else{
			System.out.println("Your age should be more than 18");
		}		
		
	}

}

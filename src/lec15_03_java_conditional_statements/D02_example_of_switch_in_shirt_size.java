package lec15_03_java_conditional_statements;

public class D02_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'L';

		switch (size) {

		case 'S':
			System.out.println("We have your Small Size Shirt");
			break;

		case 'M':
			System.out.println("We have your Medium Size Shirt");
			break;

		case 'L':
			System.out.println("We have your Large Size Shirt");
			break;

		default:
			System.out.println("Sorry we don't have your shirt");
			break;
			
		}

	}

}

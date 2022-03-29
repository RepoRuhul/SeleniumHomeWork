package lec16_java_basics;

public class UseOfTryCatchBlock02 {
	public static void main(String[] args) {

		int a = 12;
		int b = 0;

		try {
			int division = a / b;
			System.out.println(division);
		} catch (ArithmeticException e) {
			System.out.println("The Exception is >>>>>> " + e);
		}

	}

}

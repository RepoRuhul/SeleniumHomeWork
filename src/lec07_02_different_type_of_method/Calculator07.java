package lec07_02_different_type_of_method;


public class Calculator07 {
	// Important interview question
	// Formula to convert String to int:
	// Integer.parseInt(b)
	public int addition (int a, String b) {
		int total1 = a+Integer.parseInt(b);
		System.out.println("Additon of a and b is: "+total1);
		return total1;
	}
	
	// Formula to convert String to double:
	// Double.parseDouble(h)
	public double division(double g, String h) {
		double total4 = g/Double.parseDouble(h); // slash is for division
		System.out.println("division of g and h is: "+total4);
		return total4;
	}
		
	public int subtraction(int c, double d) { // double: 9.67632768
		int total2 = c-(int)d;
		System.out.println("Subtraction of c and d is: "+total2);
		return total2;
	}
	
	public int multiplication(int e, float f) { // float: 9.2356f
		int total3 = e*(int)f;
		System.out.println("Multiplication of e and f is: "+total3);
		return total3;
	}

}







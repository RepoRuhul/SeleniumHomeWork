package lec07_01_java_constructor;

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		double myDouble = 9.6756756756; // default type
		int myInt = (int) myDouble;
		byte myByte = (byte) myDouble;
		System.out.println(myDouble); // output: 9.6756756756 -- double type
		System.out.println(myInt); // output: 9 -- int type
		System.out.println(myByte); // output: 9 -- byte type
	}

}

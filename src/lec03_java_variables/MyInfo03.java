package lec03_java_variables;

public class MyInfo03 {
	public String name = "Tofael Kabir";
	public byte age = 127;
	public short myYearlyHouseRent = 32767;
	public int myYearlySalary = 400006550;
	public long myBankBalance = 7865876537378463l; // you have to use l at the end of long type
	public float myHeight = 3.012f; // you have to use f at the end of float type
	public double myGrade = 3.678376676783;
	public char sex = 'M';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		// MyInfo is a class, myInfo is an object or reference variable - always start with lower case
		// = equal operator, new is a keyword
		// an object is created (myInfo) from MyInfo03 class which is new and MyInfo03 type
		// This action (when an object is created from the class) is called instantiation, (vvImp info)
		// Then we say the class (MyInfo03) is instantiated
		MyInfo03 myInfo= new MyInfo03();
		System.out.println(myInfo.name);
		System.out.println(myInfo.age);
		System.out.println(myInfo.name+myInfo.age);
		System.out.println("My Name: "+myInfo.name+", My Age: "+myInfo.age);			

	}

}

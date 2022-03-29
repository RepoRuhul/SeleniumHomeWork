package lec04_01_java_variables_initialized;

public class MyInfo {
	// variables initialized here
	public String name = "Tofael Kabir";
	public byte age = 127;
	public short myYearlyHouseRent = 32767;
	public int myYearlySalary = 400006550;
	public long myBankBalance = 7865876537378463l;
	public float myHeight = 3.012f;
	public double myGrade = 3.678376676783;
	public char sex = 'M';
	public boolean usCitizen = false;

	// Constructor declared
	public MyInfo() {
		System.out.println("My information is below-");
	}

	// method implemented
	public void myInfo() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + myYearlyHouseRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

// Generally we keep the main method execution in different class, thats why put it as comment
//	public static void main(String[] args) {
//		// MyInfo class is instantiated, always inside main method, not in other method
//		MyInfo info= new MyInfo(); // Constructor is initialized, when an object is created
//		info.myInfo();		
//  }

}

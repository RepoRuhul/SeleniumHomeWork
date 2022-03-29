package lec07_01_java_constructor;

// We can create parameterized constructor by -- select variables, right click
// The go to source -- generate constructor using fields
// Choose where you want to create it by choosing insertion point -- click Generate
// another way from top of the page -- select source -- follow same

public class MyInfo {
	// variables declared here
	public String name;
	public byte age;
	public short myYearlyHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
	
	// default Constructor declared 
	public MyInfo() {
		System.out.println("This below information is to know about my self");
	}
	
	// Parameterized Constructor declared
	public MyInfo(String name, byte age, short myYearlyHouseRent, int myYearlySalary, long myBankBalance,
			float myHeight, double myGrade, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.myYearlyHouseRent = myYearlyHouseRent;
		this.myYearlySalary = myYearlySalary;
		this.myBankBalance = myBankBalance;
		this.myHeight = myHeight;
		this.myGrade = myGrade;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + myYearlyHouseRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}

package lec04_02_java_variables_declared;

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

}

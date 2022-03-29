package lec04_02_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		// MyInfo class is instantiated, always inside main method, not in other method
		MyInfo myInfo1 = new MyInfo();  // Constructor is initialized, when an object is created
		myInfo1.name = "John"; // variables initialized from this line
		myInfo1.age = 90;
		myInfo1.myYearlyHouseRent = 30000;
		myInfo1.myYearlySalary = 300000;
		myInfo1.myBankBalance = 786872685648l;
		myInfo1.sex = 'M';
		myInfo1.myHeight = 1.90f;
		myInfo1.myGrade = 3.58473657348;
		myInfo1.usCitizen = true;
		myInfo1.myInfo(); // method initialized
		
		System.out.println("\n********************************************\n");
		
		MyInfo myInfo2 = new MyInfo(); 
		myInfo2.name = "Angelina";
		myInfo2.age = 50;
		myInfo2.myYearlyHouseRent = 31000;
		myInfo2.myYearlySalary = 4000000;
		myInfo2.myBankBalance = 556872685648l;
		myInfo2.sex = 'F';
		myInfo2.myHeight = 2.10f;
		myInfo2.myGrade = 3.00073657348;
		myInfo2.usCitizen = false;
		myInfo2.myInfo(); // method initialized
	}
}
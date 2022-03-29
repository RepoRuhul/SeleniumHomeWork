package lec16_java_basics;

public class Employee03 {
	
	public static String empName = "Tofael"; 
	public static int empId = 483;
	public static char empSex = 'M';
	public static boolean fullTimeEmployee = false;
	
	public static void employee() {
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee);
	}
	
	public static void main(String[] args) {	
		employee();
	}

}

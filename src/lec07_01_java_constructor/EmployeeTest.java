package lec07_01_java_constructor;

public class EmployeeTest {
	public static void main(String[] args) {
		// default Constructor is initialized
		Employee employee01 = new Employee(); 
		//Parameterized Constructor 01 is initialized	
		Employee employee02 = new Employee("Awal Zaman", 3421, 'M', true); // Here "Awal Zaman", 3421, 'M', true is an argument
		Employee employee03 = new Employee("Nuzaira Farin", 3422, 'F', false); 
		Employee employee04 = new Employee("Raihan Khan", 3423, 'M', false);
		Employee employee05 = new Employee("Nabila Hussain", 3424, 'F', true);
		Employee employee06 = new Employee("Arifur Rahman", 3425, 'M', false); // here constructor is iniatialized
		employee06.employee("Asma Ahmed", 3477, 'F', true); // here method is initialized
		employee06.employee("Tamanna Rahman", 3467, 'F', false); // here method is initialized
		
	}

}

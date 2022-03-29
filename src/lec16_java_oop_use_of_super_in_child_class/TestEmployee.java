package lec16_java_oop_use_of_super_in_child_class;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized for Employee Class ----------");
		Employee employee01 = new Employee();
		
		System.out.println("\n---------- parameterized constructor initialized for Employee Class ----------");
		Employee employee02 = new Employee("Tofael", 483, 'M', true);
		
		System.out.println("\n---------- void type method initialized for Employee Class ----------");
		employee02.empInfo();
		
		System.out.println("\n---------- parameterized method initialized for Employee Class ----------");
		employee02.employeeInfo("Showkot", 007, 'M', false);
		
		System.out.println("\n---------- default constructor initialized for MountSinai Class ----------");
		MountSinai mountSinai01 = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized for MountSinai Class ----------");
		MountSinai mountSinai02 = new MountSinai("Manhattan", 5);
		
		System.out.println("\n---------- void type method initialized for MountSinai Class ----------");
		mountSinai02.msInfo();
		
		System.out.println("\n---------- parameterized method initialized for MountSinai Class ----------");
		mountSinai02.mountSinaiInfo("Queens", 4);

	}

}

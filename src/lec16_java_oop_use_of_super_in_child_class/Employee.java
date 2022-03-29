package lec16_java_oop_use_of_super_in_child_class;

public class Employee extends MountSinai {
	public String empName;
	public int empId;
	public char sex;
	public boolean fullTimeEmp;

	// default constructor
	public Employee() {
		// we use super method to call the constructor of super (parent) class
		// try putting the super method (after sysout of default constructor)
		// Constructor call must be the first statement in a constructor of child
		// class--- [only one super() is used]
		// Either default or parameterized constructor can be called from super class,
		// not both
		// That's why the below line in comment out
		//super(); // represent the default constructor of parent class
		super("Bronx", 6); // representing the parameterized constructor of parent class

		// super keyword is used to call (initialize) the methods of super (Parent)
		// class
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 8);

		// super keyword is used to call (initialize) the variables of Parent class
		super.inNewYork = true;
		super.rating = 10.0f;
		System.out.println("This hospital is in NY? Ans: " + inNewYork + " and The rating is: " + rating);
		
		System.out.println("This is a default constructor from Employee class");
	}

	// parameterized constructor
	public Employee(String empName, int empId, char sex, boolean fullTimeEmp) {
		super("Brooklyn", 9);
		super.msInfo();
		super.mountSinaiInfo("Long Island", 13);
		super.inNewYork = false;
		super.rating = 8.37492f;
		System.out.println("This hospital is in NY? :" + inNewYork + " and The rating is: " + rating);

		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}

	// void type or no return method or non parameterized method
	public void empInfo() {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.msInfo();
		super.mountSinaiInfo("Terry town", 15);
		super.inNewYork = false;
		super.rating = 9.543f;
		System.out.println("This hospital is in NY? :" + inNewYork + "\nThe rating is: " + rating);

		System.out.println("This is a void type method from employee class");
	}

	// parameterized method
	public void employeeInfo(String empName, int empId, char sex, boolean fullTimeEmp) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.msInfo();
		super.mountSinaiInfo("Nasau", 25);
		super.inNewYork = false;
		super.rating = 9.543f;
		System.out.println("This hospital is in NY? :" + inNewYork + "\nThe rating is: " + rating);

		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}

}

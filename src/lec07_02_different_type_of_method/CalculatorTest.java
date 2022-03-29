package lec07_02_different_type_of_method;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator01 calculator01 = new Calculator01();
		calculator01.addition();
		calculator01.subtraction();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator02 calculator02 = new Calculator02();
		calculator02.addition();
		calculator02.subtraction();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator03 calculator03 = new Calculator03();
		calculator03.multiplication();
		calculator03.division(3.454f, 1.324f);
		calculator03.division(7.454f, 1.924f);
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator04 calculator04 = new Calculator04();
		calculator04.division();
		calculator04.multiplication();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator05 calculator05 = new Calculator05();
		calculator05.addition(234, 342);
		calculator05.addition(2114, 642);
		calculator05.subtraction(63427, 7687);
		calculator05.subtraction(3427, 787);
		calculator05.multiplication(23, 77);
		calculator05.multiplication(13, 97);
		calculator05.division(43, 33);
		calculator05.division(23, 3);
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator06 calculator06 = new Calculator06();
		calculator06.addition(234, 342);
		calculator06.addition(2114, 642);
		calculator06.subtraction(63427, 7687);
		calculator06.subtraction(3427, 787);
		calculator06.multiplication(23, 77);
		calculator06.multiplication(13, 97);
		calculator06.division(43, 33);
		calculator06.division(23, 3);
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator07 calculator07 = new Calculator07();
		calculator07.addition(23, "67");
		calculator07.division(9.6523627, "2.344");
		calculator07.subtraction(400, 2.9999);
		calculator07.multiplication(400, 2.99999f);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

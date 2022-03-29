package lec26_java_basics;


/*
how to see the font bigger? how to smaller (temporarily)
-- Command/control +
-- Command/control -

How to Enable Tasks in Eclipse IDE?
-- It is used to find out what kind of work is left behind and needs attention.
To see - go to --> Window (eclipse header) -- Show View -- Tasks
We have to Use 
//TODO ----------- write what need to do in future, or any important instruction to follow in future -------
 
How to remove some part of code or a method from SOMEwhere to ANYWhere?
-- Select that part, then alt/option + up/down arrow sign 

How to turn a lower case string to upper case string?
-- Select, then shift + Command/control + x
-- Select, then shift + Command/control +  y (to turn it back where it was)

How to move the cursor to a specific line?
-- Command/Control + L ----> Enter Line Number ---> Go to Line

How to use “toggle bread crumb”? 
-- find the symbol (small c) and click it from header. This helps to navigate faster without moving to Package explorer
 
 */

public class InfoJavaBasics {
	public static void isArmstrongNumber(int num) {
		System.out.println("The " + num + " is Armstrong Number ?");
		int cube = 0;
		int r; // Remainder
		int t; // total
		
		t = num;
		
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		
		if (t == cube) {
			System.out.println("this is armstrong number");
		} else {
			System.out.println("THIS IS NOT ARMSTRONG NUMBER");
		}
	}

	public static void main(String[] args) {
		isArmstrongNumber(123); // no
		isArmstrongNumber(153); // yes
		isArmstrongNumber(407); // yes

	}


}

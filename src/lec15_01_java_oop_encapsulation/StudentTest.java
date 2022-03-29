package lec15_01_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Alex J"); // We put argument in parameterized method to initialize it
		student.setStId(3654);
		student.setSex('M');
		student.setFulltimeSt(true);
		student.setGrade(3.4560f);
		
		System.out.println("Student Name: " + student.getStName() + ", \nID: " + student.getStId() + ", \nSex: "
				+ student.getSex() + ", \nFull Time student? : " + student.isFulltimeSt() + " \nGrade: " + student.getGrade());		

	}

}

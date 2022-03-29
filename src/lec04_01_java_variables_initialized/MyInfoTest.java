package lec04_01_java_variables_initialized;

public class MyInfoTest {

	public static void main(String[] args) {
		// MyInfo class is instantiated, always inside main method, not in other method
		MyInfo info= new MyInfo(); // Constructor is initialized, when an object is created
		info.myInfo();	// method initialized
	}
}
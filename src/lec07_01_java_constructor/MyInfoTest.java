package lec07_01_java_constructor;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo(); // Default Constructor initialized
		System.out.println("---------------------------------------------------------");		
		// Constructor can't recognize byte and short type, so we need casting
		MyInfo tofael = new MyInfo("Tofael", (byte)127, (short)32000, 63523575, 546357267465375l, 1.90f, 3.9877987, 'M', false ); // Parameterized Constructor initialized

	}

}

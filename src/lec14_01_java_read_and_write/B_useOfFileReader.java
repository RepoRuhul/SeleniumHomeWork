package lec14_01_java_read_and_write;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B_useOfFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\Students.txt";
		FileReader fileReader = new FileReader(path);
		System.out.println("FileReader find the location of the path as: " + path);
		// if FileReader can read the file, the above line will be executed
	}

}

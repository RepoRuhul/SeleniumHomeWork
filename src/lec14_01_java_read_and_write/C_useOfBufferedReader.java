package lec14_01_java_read_and_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C_useOfBufferedReader {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\Students.txt";
		FileReader fr = new FileReader(path); // when the class is instantiated, it can locate the file
		System.out.println("FileReader find the location of the path as: " + path);

		BufferedReader br = new BufferedReader(fr);
		String data = "";
		while ((data = br.readLine()) != null) {
			System.out.println("The BufferedReader read the file and got : " + data + " Thanks");
		}

	}

}

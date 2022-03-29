package lec14_01_java_read_and_write;

import java.io.File;

public class A_creatingFolderAndFile {

	public static void main(String[] args) {
		// for Mac user -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
		File folder = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT");
		folder.mkdir(); // method to create folder
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created");
			File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT\\Students.txt");
			try {
				file.createNewFile(); // method to create file
			} catch (Exception e) {
				System.out.println(e);
			}
			if (file.exists()) {
				System.out.println(file.getName() + " file is created");
			}

		}

	}

}

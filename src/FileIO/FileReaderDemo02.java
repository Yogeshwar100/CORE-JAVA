package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {

	public static void main(String[] args) {
		try {
			File file = new File("myFile.txt");
			FileReader fileReader = new FileReader(file);
			char[] ch = new char[(int) file.length()];//if length is beyond int range use read() method.
			fileReader.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

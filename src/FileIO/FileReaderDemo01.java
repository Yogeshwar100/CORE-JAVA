package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("myFile.txt");
			int i = fileReader.read();

			while (i != -1) {
				System.out.print((char) i);
				i = fileReader.read();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter=new FileWriter("myFile.txt",true);
			fileWriter.write(83);
			fileWriter.write("oftware\nSolutions");
			fileWriter.write('\n');
			char[] ch= {'a','b','c'};
			fileWriter.write(ch);
			fileWriter.write('\n');
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

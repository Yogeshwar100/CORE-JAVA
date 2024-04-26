package FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileDemo01 {

	public static void main(String[] args) {
		System.out.println("Creating file in CWD:");
		File f1 = new File("file1.txt"); //will not create file if not exists.
		System.out.println("file1.txt exists: " + f1.exists());
		if (!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("file1.txt created: " + f1.exists());
		System.out.println("file1.txt is a file? " + f1.isFile());
		System.out.println("file1.txt is a directory? " + f1.isDirectory());

		System.out.println("================");
		System.out.println("Creating directory in CWD:");
		File f2 = new File("DIR1");
		System.out.println("DIR1 exists: " + f2.exists());
		if (!f2.exists()) {
			f2.mkdir();
		}
		System.out.println("DIR1 created: " + f2.exists());
		System.out.println("DIR1 is a directory? " + f2.isDirectory());
		System.out.println("================");

		System.out.println("Creating directory and then file into it in CWD:");
		File f3 = new File("DIR2");
		System.out.println("DIR2 exists: " + f3.exists());
		if (!f3.exists()) {
			f3.mkdir();
		}
		System.out.println("DIR2 created: " + f3.exists());

		// File f4 = new File("Dir2", "file2.txt");
		// OR
		File f4 = new File(f3, "file2.txt");
		System.out.println("file exists: " + f4.exists());
		if (!f4.exists()) {
			try {
				f4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("file created: " + f4.exists());
		System.out.println("=========================");
		System.out.println("Creating file in specific location: ");
		File f5 = new File("D:\\DIR01", "file3.txt");
		try {
			f5.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file3.txt created: " + f5.exists());

		// f1.delete(); //delete file or directory

		System.out.println("=========================");

		System.out.println("Listing directory: ");
		String[] list = f3.list();// Lists files and sub-directories present in a specific directory
		int fileCount=0;
		int subDirCount=0;
		for (String s : list) {
			File file=new File(f3,s);
			if(file.isFile()) {
				fileCount++;
				System.out.println("file: "+file.getName());
			}else if(file.isDirectory()) {
				subDirCount++;
				System.out.println("directory: "+file.getName());
			}
		}
		System.out.println("Total number of files: "+fileCount+" "+"And Total number of sub-directories: "+subDirCount);
		System.out.println("=========================");
		long totalCharacters = f1.length();
		System.out.println(totalCharacters);
	}

}

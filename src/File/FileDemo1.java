package File;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		//Creating file
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile(); // new file created in this step
		System.out.println(f.exists());
		
		//Creating directory
		File f1 = new File("durga123");
		System.out.println(f1.exists());
		f1.mkdir();
		
		File f2 = new File(f1,"demo.txt"); 
		System.out.println(f2.exists());
		f2.createNewFile();  // creating demo.txt file inside f1 dir
		System.out.println(f2.exists());
		
		// creating files inside drives
		
		try {
			File f3 = new File("D://xyz","abc.txt");
			f3.createNewFile();
		} catch (Exception e) {
			e.getMessage();
			File f3 = new File("D://tool","abc.txt");
			System.out.println(f3.createNewFile());	
		}
	}
}

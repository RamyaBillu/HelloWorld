package exceptions_nov17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyToo {

	public static void main(String[] args) {
		FileInputStream fileinputstream = null;
		try {
			new FileInputStream("/home/ram.txt");
		} catch (FileNotFoundException e) {
			System.out.println("not found");

		} finally {

			System.out.println("end");
			if (fileinputstream != null) {
				try {

					fileinputstream.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
			}
		
	}
	}
}


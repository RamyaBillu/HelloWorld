package throwThrows_nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Manual {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class CheckedThrowThrows {
	public static void main(String args[]) {
		try {
			Manual manual = new Manual();
			manual.method();
		} catch (Exception e) {
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		}

		System.out.println("normal flow...");
	}

}

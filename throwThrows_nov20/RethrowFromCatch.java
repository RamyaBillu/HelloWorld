package throwThrows_nov20;

import java.io.IOException;

class First {
	void call() throws IOException {
		throw new IOException("device error");
	}
}

public class RethrowFromCatch {

	public static void main(String[] args) {

		try {
			First first = new First();
			first.call();
		} catch (Exception e) {
			System.out.println("exception handled");
			System.out.println(e.getMessage());
			try {
				throw new IOException("device error two");

			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}

			System.out.println("normal flow...");
		}

	}
}

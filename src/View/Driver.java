package View;

import language.Java;
import language.Language;

public class Driver {

	public static void main(String[] args) {
		String javaClass = "RunMe";
		Language j = new Java(javaClass);
		System.out.println(j.executeCommand(true));
	}

}

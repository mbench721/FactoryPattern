package language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

abstract public class Language {
	
	abstract public String executeCommand(boolean wait);
	private static String getLines(String name, InputStream in) throws IOException{
		String line = "", result = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		while ((line=reader.readLine())!=null) {
			result+=(name+" "+line+"\n");
		}
		return result;
	}
	
	public String printLines (String name, InputStream in) throws IOException {
		return getLines(name, in);
	}
	
	public Language () {}
}

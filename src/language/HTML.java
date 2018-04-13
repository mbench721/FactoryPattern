package language;

public class HTML extends Language {

	@Override
	public void generateSourceCode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String executeCommand(boolean wait) {
		String html = "C:\\Program Files\\Java\\jdk1.8.0_65\\bin\\javac.exe -d D:\\Users\\ZFleezy\\workspace\\FactoryPattern\\src\\HMLTOutput.html",
				result = "";
		try {
			Process pro = Runtime.getRuntime().exec(html);
			if (wait) {
				printLines(html + " stdout:", pro.getInputStream());
				printLines(html + " stderr:", pro.getErrorStream());
				pro.waitFor();
				result += (html + " exitValue() " + pro.exitValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}

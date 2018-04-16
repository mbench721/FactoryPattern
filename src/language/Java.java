package language;

public class Java extends Language {
	private String javaClass;

	public String getJavaClass() {
		return javaClass;
	}

	public void setJavaClass(String javaClass) {
		this.javaClass = javaClass;
	}


	public Java(String javaClass) {
		setJavaClass(javaClass);
	}


	@Override
	public String executeCommand(boolean wait) {
		String javac = "\"C:\\Program Files\\Java\\jdk1.8.0_65\\bin\\javac.exe\" -d \"D:\\Users\\ZFleezy\\workspace\\FactoryPattern\\bin\" \"D:\\Users\\ZFleezy\\workspace\\FactoryPattern\\src\\View\\" + javaClass + ".java\"", 
				java = "\"C:\\Program Files\\Java\\jdk1.8.0_65\\bin\\java\" -cp \"D:\\Users\\ZFleezy\\workspace\\FactoryPattern\\bin\" View."+javaClass, 
				result = "";
		try {
			Process pro = Runtime.getRuntime().exec(javac);
			if (wait) {
				result+=printLines(javac + " stdout:", pro.getInputStream())+"\n";
				result+=printLines(javac + " stderr:", pro.getErrorStream())+"\n";
				pro.waitFor();
				result += (javac + " exitValue() " + pro.exitValue() + "\n");
				pro = Runtime.getRuntime().exec(java);
				result+=printLines(java + " stdout:", pro.getInputStream())+ "\n";
				result+=printLines(java + " stderr:", pro.getErrorStream())+ "\n";
				pro.waitFor();
				result += (java + " exitValue() " + pro.exitValue() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}

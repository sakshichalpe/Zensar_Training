package string;
public class All_String {

	String s1="Zensar";
	String s2="Technology";
	
	public void concat(String s1,String s2) {
		String s3=s1.concat(s2);
		  System.out.println("String is:" + s3);
}
	public void length() {
		
		  System.out.println("Length of s2 id:" + s2.length() );

	}
	public void charAt(){
		  System.out.println("char of position is:" + s1.charAt(4));

	}
	public void indexof(){
		  System.out.println("" + s2.indexOf('g'));
	}
	public void campareTo(){
		  System.out.println("campare 1 string to another " + s1.compareTo(s2));

	}
	public void contain(){
		  System.out.println(" to check weather string contain 'sar' or not" + s1.contains("sar"));

	}
	public void endswith(){
		  System.out.println("string ends with 'r' or not" + s1.endsWith("r"));

	}
	public void replace (){
		  System.out.println("replace " + s2.replace("Training","Train"));

	}
	public void replaceAll(){
		  System.out.println("replaceAll " + s2.replaceAll("Technology", "Company"));

	}
	public void replaceFirst(){
		  System.out.println(" replaceFirst " + s2.replaceFirst("T","t" ));

	}
	public void tolowercase(){
		  System.out.println(" "+ s1.toLowerCase());

	}
	public void touppercase(){
		  System.out.println("conver " +s1.toUpperCase() );

	}
	public static void main(String[] args) {
		All_String a=new All_String();
		a.concat("Zensar","Training");
		a.length();
		a.charAt();
		a.campareTo();
		a.contain();
		a.replace();
		a.replaceAll();
		a.replaceFirst();
		a.tolowercase();
		a.touppercase();
		
	}

}

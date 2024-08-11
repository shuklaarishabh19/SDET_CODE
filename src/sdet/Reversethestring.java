package sdet;

public class Reversethestring {

	public static void main(String[] args) {
		String inputstring="Rishabh";
		String outputstring="";
		for(int i=inputstring.length()-1;i>=0;i--) {
			outputstring=outputstring + inputstring.charAt(i);
		}
		System.out.println(outputstring);

	}

}

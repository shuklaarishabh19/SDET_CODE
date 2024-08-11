package sdet;

public class countvowelandcosonant {

	public static void main(String[] args) {
		String a="Rishabh";
		
		 a=a.toLowerCase();
		System.out.println(a);
		int count=0;
		int ccount=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				count++;
			}
			else {
				ccount++;
			}
		}
		System.out.println(count);
		System.out.println(ccount);

	}

}

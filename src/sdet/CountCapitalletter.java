package sdet;

public class CountCapitalletter {

	public static void main(String[] args) {
		String a="RisHaMbhB";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);

	}

}

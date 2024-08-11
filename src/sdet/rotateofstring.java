package sdet;

public class rotateofstring {

	public static void main(String[] args) {
		String a="Mobikwik";
		String b="";
		int count=0;
		int j=2;
		for(int i=j;i<a.length();i++) {
			b=b+a.charAt(i);
			
								
		}
		
		System.out.println(b);
		for (count=0;count<j;count++) {
			b=b+a.charAt(count);
		}
		System.out.println(b);
	}

}

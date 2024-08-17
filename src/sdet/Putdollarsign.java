package sdet;

public class Putdollarsign {

	public static void main(String[] args) {
		String a="Mo ttto too";
		char o = 'o';
		
		String b="";
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) != o) {
				b=b+a.charAt(i);
				
			}
			else {
				for(int j=0;j<i;j++) {
					b=b+"$";
				}
			}
		}
		System.out.println(b);

	}

}

package sdet;

public class rotatewordwithoutinbuildfunction {
	
	public static String reverse(String c) {
		String rev="";
		for(int j=c.length()-1;j>=0;j--) {
			rev=rev+c.charAt(j);
		}
		return rev;
			
	}

	public static void main(String[] args) {
		StringBuffer st = new StringBuffer();
		String a= "my name is rishabh shukla";
		
		String[] b=a.split(" ");
		
		for(int i=0;i<b.length;i++) {
			if(i%2!=0) {
				st.append(reverse(b[i]));
				st.append(" ");
			}
			else {
				st.append(b[i]);
				st.append(" ");
							}
		}
		
		System.out.println(st);
		String s1="hello ";
		String s2="mf";
		
		System.out.println(s1+st);
		

	}

}

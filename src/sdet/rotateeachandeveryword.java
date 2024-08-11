package sdet;

public class rotateeachandeveryword {

	public static void main(String[] args) {
		String a="My name is rishabh shukla";
		
		String[] c=a.split(" ");
		

		for(int i=0;i<c.length;i++) {
			StringBuffer s= new StringBuffer(c[i]);
			c[i]=s.reverse().toString();
			
			
		}
		
		StringBuffer st= new StringBuffer();
		for(int j=0;j<c.length;j++) {
			st.append(c[j]);
			st.append(" ");
		}
		
		st.toString();
		System.out.println(st);

	}

}

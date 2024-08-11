package sdet;

import java.util.HashMap;

import javax.accessibility.AccessibleStreamable;

public class Wordscount {

	public static void main(String[] args) {
		String a="My name is Rishabh shukla";
		
		String[] b= a.split(" ");
		
		for(int i=0;i<b.length;i++) {
			if(i%2!=0) {
				StringBuffer s = new StringBuffer(b[i]);
				b[i]=s.reverse().toString();
				System.out.println(b[i]);
			}
			else {
				System.out.println(b[i]);
			}
			
		}
		
		StringBuffer m = new StringBuffer();
		for(int i=0;i<b.length;i++) {
			
			m.append(b[i]);
			m.append(" ");
		}
		
		String c=m.toString();
		System.out.println(c);
		
		

	}

}

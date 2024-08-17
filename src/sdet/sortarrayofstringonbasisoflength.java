package sdet;

import java.util.Arrays;

public class sortarrayofstringonbasisoflength {

	public static void main(String[] args) {
		String[] a= {"we","i","hello"};
		
		String temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].length()>a[j].length()) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}

	}

}

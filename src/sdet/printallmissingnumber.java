package sdet;

import java.util.ArrayList;

public class printallmissingnumber {

	public static void main(String[] args) {
		System.out.println("hello");
		int[] a= {1,2,4,5,6,9};
		ArrayList<Integer> b=new ArrayList<Integer>();		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i+1]-1 !=a[i]) {
				count=a[i];
				while(count<a[i]+1) {
					b.add(count+1);
				}
			}
		}
		System.out.println(b);
	}

}

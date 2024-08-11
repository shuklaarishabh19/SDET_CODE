package sdet;

import java.util.ArrayList;

public class squareofsortedarray {

	public static void main(String[] args) {
		int[] a= {1,3,5};
		ArrayList<Integer> b= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			b.add(a[i]*a[i]);
		}
		System.out.println(b);

	}

}

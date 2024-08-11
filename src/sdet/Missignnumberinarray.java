package sdet;

import java.util.ArrayList;

public class Missignnumberinarray {

	public static void main(String[] args) {
		int[] a= {5,6,9,10,12};
		
		ArrayList<Integer> b= new ArrayList<Integer>();
		
		for(int i=0; i<a.length-1;i++) {
			if((a[i+1]-1)!=a[i]) {
				b.add(a[i]+1);
			}
			
			
		}
		System.out.println(b);
		
		

	}

}

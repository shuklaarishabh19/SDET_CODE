package sdet;

import java.util.ArrayList;

public class convertanarraytoarraylist {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			arr.add(a[i]);
		}
		System.out.println(arr);
		

	}

}

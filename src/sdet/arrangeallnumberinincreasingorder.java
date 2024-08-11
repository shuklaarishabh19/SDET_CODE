package sdet;

import java.util.ArrayList;

public class arrangeallnumberinincreasingorder {

	public static void main(String[] args) {
		int[] a= {2,2,1,0,0,2,1};
		
		ArrayList<Integer> zero= new ArrayList<Integer>();
		ArrayList<Integer> one= new ArrayList<Integer>();
		ArrayList<Integer> two= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				zero.add(a[i]);
			}
			else if(a[i]==1){
				
					one.add(a[i]);
				
			}
			else{
				two.add(a[i]);
			}
		}
		zero.addAll(one);
		zero.addAll(two);
		for (int i :zero) {
			System.out.println(i);
		}
	}

}

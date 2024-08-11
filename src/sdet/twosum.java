package sdet;

import java.util.ArrayList;
import java.util.HashMap;

public class twosum {

	public static void main(String[] args) {
		int[] a= {2,3,4,7,8};
		int ele=5;
		int b;
		ArrayList<Integer> arr= new ArrayList<Integer>();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			map.put(a[i], 1);
		}
		for(int j=0;j<a.length;j++) {
			b=ele-a[j];
			if(map.containsKey(b)) {
				//System.out.println(b);
				arr.add(b);
				
			}
		}
		System.out.println(arr);
	
	
		
		
	}

}



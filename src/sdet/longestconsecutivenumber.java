package sdet;

import java.util.ArrayList;
import java.util.Collections;

public class longestconsecutivenumber {

	public static void main(String[] args) {
		
		
		int[] a= {7,1,2,3,4,5,8,9,5};
		int count=1;
		ArrayList arr=new ArrayList();
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==(a[i+1])-1) {
				count=count+1;
				//arr.add(count);
				
			}
			if(!(a[i]==(a[i+1])-1)) {
				arr.add(count);
				count=1;
			}
			
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		
		int len=arr.size();
		System.out.println(arr.get(len-1));

	}

}

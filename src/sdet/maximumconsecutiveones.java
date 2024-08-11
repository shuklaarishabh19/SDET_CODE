package sdet;

import java.util.ArrayList;

public class maximumconsecutiveones {

	public static void main(String[] args) {
		int[] a= {1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1};
		int count =1;
		ArrayList<Integer> b= new ArrayList<Integer>();
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1] && a[i]==1) {
				count=count+1;
//				if(i+1==a.length-1) {
//					b.add(count);
//					count=1;
//				}
			}
			if((a[i]!=a[i+1] && a[i]==1) || (a[i]==a[i+1]  && a[i]==1 && (i+1==a.length-1))) {
				b.add(count);
				count=1;
				
			}
			
			
			
		}
		System.out.println(b);

	}

}

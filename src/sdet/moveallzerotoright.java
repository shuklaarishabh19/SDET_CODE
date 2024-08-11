package sdet;

import java.util.ArrayList;

public class moveallzerotoright {

	public static void main(String[] args) {
		int[] a=new int[] {1,0,0,2,0,3};
		int count=0;
		ArrayList<Integer> b= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b.add(a[i]);
				count= count+1;
				
			}
			
		}
		for(int j=count;j<a.length;j++) {
			b.add(0);
		}
		System.out.println(b);
		
		

	}

}

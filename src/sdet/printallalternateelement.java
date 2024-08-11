package sdet;

import java.util.ArrayList;
import java.util.List;

public class printallalternateelement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b=new int[a.length];
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
//		for(int i=0;i<a.length;i++) { on the basis of index
//			if((i+1)%2==0) {
//				even.add(a[i]);
//			}
//			else {
//				odd.add(a[i]);
//			}
//		}
//		odd.addAll(even);
//		System.out.println(odd); 
		
		
		for(int i=0;i<a.length;i++) {     //on the basis of odd and even value
			if(a[i]%2==0) {
				even.add(a[i]);
			}
			else {
				odd.add(a[i]);
			}
		}
		odd.addAll(even);
		System.out.println(odd); 
		

}}

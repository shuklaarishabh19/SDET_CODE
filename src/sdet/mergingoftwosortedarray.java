package sdet;

import java.util.ArrayList;

public class mergingoftwosortedarray {

	public static void main(String[] args) {
		int[] arr1= {3,2,1,4};
		int[] arr2= {7,6,5,8};
		int a=arr1.length;
		int b=arr2.length;
//		int[] arr3= new int[a+b];
//		int m=arr3.length;
//		
//		int i=0,j=0,k=0;
//		
//		while(i<a) {
//			arr3[k++]= arr1[i++];
//		}
//		while(j<b) {
//			arr3[k++]=arr2[j++];
//		}
//		
//		Arrays.sort(arr3);
//		for(int k1=0;k1<m;k1++) {
//			System.out.print(arr3[k1]);
//		}
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		
		for(int i=0;i<a;i++) {
			arr.add(arr1[i]);
		}
		
		for(int j=0;j<a;j++) {
			arr.add(arr2[j]);
		}
		System.out.println(arr);
		Object[] m=arr.toArray();
		
		
		for(Object k: m) {
			System.out.print(k);
		}
		


	}

}

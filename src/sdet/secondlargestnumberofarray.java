package sdet;

import java.util.ArrayList;
import java.util.Collections;

public class secondlargestnumberofarray {

	public static void main(String[] args) {
		int[] a= {2,10,8,9};
		ArrayList b= new ArrayList();
		for(int i=0;i<a.length;i++) {
			b.add(a[i]);
		}
		Collections.sort(b);
		int z=b.size()-2;
		System.out.println(z);
		System.out.println(b.get(z));

	}

}

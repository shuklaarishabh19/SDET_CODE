package sdet;

import java.util.ArrayList;

public class covertarraylisttoarray {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);
		System.out.println(a);
		
		Object[] ob=a.toArray();
		
		for(int j=0;j<ob.length;j++) {
			System.out.print(ob[j]);
		}

	}

}

package sdet;

import java.util.HashMap;
import java.util.Iterator;

public class duplicateelementinarray {

	public static void main(String[] args) {
		int [] a= new int	[] {2,10,1,2,3,1,5,69,9,9,10,2,8};
//		for (int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(!(map.containsKey(a[i]))) {
				map.put(a[i], 1);
			}
			else {
				map.put(a[i], map.get(a[i])+1);
			}
		}
		Iterator<Integer> it= map.keySet().iterator();
	    while(it.hasNext()) {
	    	int c= it.next();
//	    	System.out.println(c +" "+ map.get(c));
	    	if(map.get(c)>1) {
	    		System.out.println(c);
	    	}
	    }
		
//		ArrayList<Integer> b= new ArrayList<Integer>();
//		Arrays.sort(a);
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i+1]==a[i]) {
//				b.add(a[i]);
//			}
//		}
//		System.out.println(b);
	    
	    

	}

}

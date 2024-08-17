package sdet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class twostringequalusingonehashmap {

	public static void main(String[] args) {
		String a="listenm";
		String b= "silent";
		int sum=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Map<Character ,Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)!=' ') {
			
			
			if(!(map.containsKey(a.charAt(i)))) {
				map.put(a.charAt(i),1);
				
			}
			else {
				map.put(a.charAt(i),map.get(a.charAt(i))+1);
			}
		}}
		
		for(int i=0;i<b.length();i++) {
			if(map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i), map.get(b.charAt(i))-1);
				
			}
		}
		System.out.println(map);
		
		Iterator<Character> itr = map.keySet().iterator();
		while(itr.hasNext()) {
		Character c= itr.next();
		sum=sum+map.get(c);
		
		
		}
		if(sum==0) {
			System.out.println("string are equal");
		}
		else {
			System.out.println("not");
		}
//		arr.add(map.get(c));
		
		}

	

}


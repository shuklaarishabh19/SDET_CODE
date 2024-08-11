package sdet;

import java.util.HashMap;


import java.util.Iterator;

public class countcharacterwithvalue {

	public static void main(String[] args) {
		String a ="aaabbccc";
		String b="";
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		for(int i=0;i<a.length();i++) {
			if(!(map.containsKey(a.charAt(i)))) {
				map.put(a.charAt(i), 1);
			}
			else {
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
		}
		
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext()) {
	    	char c= itr.next();
	    	System.out.print(c +""+ map.get(c));
	    }
		
	}

}

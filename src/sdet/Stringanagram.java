package sdet;

import java.util.HashMap;
import java.util.Map;

public class Stringanagram {

	public static void main(String[] args) {
		String a="listenm";
		String b= "silentmnm";
		
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
		
		Map<Character ,Integer> map1= new HashMap<Character, Integer>();
		for(int j=0;j<b.length();j++) {
			
			if(b.charAt(j)!=' ') {
			
			
			if(!(map1.containsKey(b.charAt(j)))) {
				map1.put(b.charAt(j),1);
				
			}
			else {
				map1.put(b.charAt(j),map1.get(b.charAt(j))+1);
			}
		}}
		
		if(map.equals(map1)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("no");
		}
		

	}

}


// .equal method comapare both key and values

// to comapre key map1.keySet().equals(map2.keySet()));

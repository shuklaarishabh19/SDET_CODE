package sdet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;



public class Occurenceofeachwordinsentence {

	public static void main(String[] args) {
		int first=0;
		int sec=0;
		int count =0;
		String a="success is is success mon";
		ArrayList<Integer> b= new ArrayList<Integer>();
		
		
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		String[] st=a.split(" ");
		
		for(String c:st) {
			if(!(map.containsKey(c))) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s+" "+ map.get(s));
		}
		
		
		

	}

}

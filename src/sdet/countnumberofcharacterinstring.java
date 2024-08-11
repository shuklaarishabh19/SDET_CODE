package sdet;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class countnumberofcharacterinstring {

	public static void main(String[] args) {
		String a="My name is Rishabh shukla";
		int count =1;
		a=a.toLowerCase();
		//a=a.replaceAll("\\s", "");  // relace all space with no space.
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
	    Iterator<Character> it= map.keySet().iterator();
	    while(it.hasNext()) {
	    	char c= it.next();
	    	System.out.println(c +" "+ map.get(c));
	    }
	    
		
		

	}

}


/// char[] strArray = inputString.toCharArray(); to conver sring to array

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Set<Integer> l1= new HashSet();     common element in both array
//		
		Integer[] a1= {1,2,3,2,1,5,6};
		Integer[] a2= {1,2,3,5};
//		//Integer[] a3= {1,2,3,4};
//		
//		HashSet<Integer> hs= new HashSet<Integer>();
//		HashSet<Integer> hs1= new HashSet<Integer>();
//		for(int i=0;i<a1.length;i++) {
//			hs.add(a1[i]);
//			
//		}
//		for(int j=0;j<a2.length;j++) {
//			hs1.add(a2[j]);
//			
//		}
//		System.out.println(hs);
//		
//		hs.addAll(hs1);
//		System.out.println(hs);
		
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<a1.length;i++) {
			if(!(map.containsKey(a1[i]))) {
				map.put(a1[i], 1);
			}
			else {
				map.put(a1[i], map.get(a1[i])+1);
			}
		}
		
		for(int j=0;j<a2.length;j++) {
			if(!(map.containsKey(a2[j]))) {
				map.put(a2[j], 1);
			}
			else {
				map.put(a2[j], map.get(a2[j])+1);
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
		
		

}

}

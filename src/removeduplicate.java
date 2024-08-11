import java.util.HashMap;
import java.util.Iterator;



public class removeduplicate {

	public static void main(String[] args) {
		int[] a= {9,5,5,1,5,4,7,8,8};
		int n=a.length;
		int[] temp= new int[n];
		int j=0;
		
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
		if(!(map.containsKey(a[i]))) {
			map.put(a[i], 1);
		}
		else {
			map.put(a[i], map.get(a[i])+1);
		}
		
		}
		Iterator<Integer> itr =  map.keySet().iterator();
		while(itr.hasNext()) {
			int m=itr.next();
			System.out.println(m);
		}
		

	}

}

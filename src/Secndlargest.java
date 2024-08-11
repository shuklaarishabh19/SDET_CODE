import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secndlargest {

	public static void main(String[] args) {
		Integer[] a= {5,4,3,2,8,1} ;

		List<Integer> a1=new ArrayList();
		for(int i=0 ; i<a.length;i++) {
			a1.add(a[i]);
			
		}
		//System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		//int j=a1.lastIndexOf(a1);
		
		System.out.println(a1.get(1));
		System.out.println(a1.size()-1);
}
}
import java.util.HashSet;

public class duplicateelement {

	public static void main(String[] args) {
		int[] a= {1,2,9,1,2,3,4,5,6,6,3,9,2,5,4,3,4,9,7,7};
		HashSet<Integer> b= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b.add(a[i]);
				}
			}
		}
		System.out.println(b);

	}

}

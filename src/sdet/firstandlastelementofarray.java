package sdet;

public class firstandlastelementofarray {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,2};
		int temp=2;
		int firstindex=-1;
		int lastindex=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==temp &&  firstindex==-1) {
				firstindex=i;
				
				//break;
			}
			if(a[i]==temp &&  firstindex!=-1 ) {
				lastindex=i;
				//
			}
		}
		System.out.println(firstindex);
		System.out.println(lastindex);

	}

}

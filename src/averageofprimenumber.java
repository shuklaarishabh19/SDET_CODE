import java.util.ArrayList;
import java.util.Scanner;

public class averageofprimenumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int j=sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=2;i<j;i++) {
			for(int k=1;k<i;k++) {
				if(k%i==0) {
				a.add(i);}
			}
		}
		System.out.println(a);

	}

}

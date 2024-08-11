package sdet;
import java.util.*;

public class primenumber {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				System.out.println("not prime number");
				flag=flag+1;
				break;
			} 
		}
		if(flag==0) {
			System.out.println("prime number");
		}
		
		

	}

}

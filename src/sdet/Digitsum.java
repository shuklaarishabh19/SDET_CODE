package sdet;
import java.util.*;

public class Digitsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int digit;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);

	}

}

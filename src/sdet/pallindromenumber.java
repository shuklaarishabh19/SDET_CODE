package sdet;
import java.util.*;
public class pallindromenumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int digit;
		int rev=0;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp==rev) {	
			System.out.println("pallindrome");
		}
		else {
			System.out.println("notpallindromes");
		}

	}

}

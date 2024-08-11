package sdet;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 sc.close();
		 System.out.println(num);
		int sum=0;
		int digit;
		int temp=num;
		while(num!=0) {
			//System.out.println("enter while");
			digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
			
		}
		else {
			System.out.println("not");
		}

	}

}

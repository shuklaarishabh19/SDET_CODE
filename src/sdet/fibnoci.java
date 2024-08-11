package sdet;
import java.util.*;

import java.util.Scanner;

public class fibnoci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);  // wee are not using println because if we use it it print no in next line.
		for(int i=2; i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;  //first we need to wrint this thing
			n2=n3;   // then this one
			
		}

	}

}

package sdet;

public class pattern2 {

	public static void main(String[] args) {
		int temp=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				temp=temp+1; 
				System.out.print(temp);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

package sdet;

public class pattern4 {

	public static void main(String[] args) {
		int temp=0;
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				temp=temp+1;
				System.out.print(j+1);
				System.out.print(" ");
				
			}
			System.out.println();
			
		}

	}

}

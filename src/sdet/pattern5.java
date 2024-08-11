package sdet;

public class pattern5 {

	public static void main(String[] args) {
		int temp=1;
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				
				System.out.print(temp);
				System.out.print("  ");
				temp=temp+1;
				
			}
			System.out.println();
			
		}

	}

}

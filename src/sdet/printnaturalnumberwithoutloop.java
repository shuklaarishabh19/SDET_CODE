package sdet;

public class printnaturalnumberwithoutloop {
	
	public static int recur(int num) {
		int i=0;
		if(num<=100) {
			return num;
		}
		System.out.println(num);
		return recur(i++);
		
	}

	public static void main(String[] args) {
		System.out.println(recur(1));

	}

}

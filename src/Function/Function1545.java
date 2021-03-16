package Function;

import java.util.Scanner;

public class Function1545 {

	public static void main(String[] args) {

		zero();
	}
	
	static void zero() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("zero");
		}else {
			System.out.println("non zero");
		}
		
	}

}

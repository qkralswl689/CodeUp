import java.util.*;
public class for_3 {

	public static void main(String[] args) {
		// น้มุ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1; i<=9; i++) {
			
			if(n >=1 && n<= 9) {
				int mult = n *i;
				System.out.printf("%d * %d = %s %n",n,i,mult);
			}
		}

	}

}

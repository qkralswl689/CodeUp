package If;
import java.util.*;

public class if_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a - b);
			
		}else if (a < b) {
			System.out.println(b -a);
		}else if (a == b) {
			System.out.println(a -b);

		}
		
	}

}
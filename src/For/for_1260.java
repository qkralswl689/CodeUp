package For;
import java.util.*;

public class for_1260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i =a; i<=b; i++) {
			if(a<=b && i%3 == 0) {
				sum += i;
		}
		
	}
		System.out.println(sum);
  }
}



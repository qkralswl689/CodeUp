import java.util.*;

public class if_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		
		if (a%2 != 0 ) {
			result = "odd";
		}else if(a%2 == 0) {
			result = "even";
		}
		System.out.println(result);
	}

}

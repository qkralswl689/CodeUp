package If;
import java.util.*;

public class if_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		if(a%7 == 0) {
			result = "multiple";
		}else if(a%7 != 0) {
			result = "not multiple";
		}
		System.out.println(result);
	}

}

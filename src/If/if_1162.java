package If;
import java.util.*;
public class if_1162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String result = "";
		
		int sum = a - b + c;
		if(sum%10 == 0) {
			result = "대박";
		}else {
			result = "그럭저럭";
		}
		System.out.println(result);
	}

}

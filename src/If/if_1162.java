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
			result = "���";
		}else {
			result = "�׷�����";
		}
		System.out.println(result);
	}

}

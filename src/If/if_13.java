package If;
import java.util.*;
public class if_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = "";
		
		if(a%2 != 0) {
			System.out.print("�汝�");
		}else {
			System.out.print("礎熱");
		}
		System.out.print("+");
		
		if(b%2 != 0) {
			System.out.print("�汝�");
		}else {
			System.out.print("礎熱");
		}
		System.out.print("=");
		
		if((a+b)%2 == 0) {
			result = "礎熱";
		}else if((a+b)%2 != 0){
			result = "�汝�";
		}
		System.out.print(result);

	}

}

import java.util.*;
public class if_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = "";
		
		if(a%2 != 0) {
			System.out.print("Ȧ��");
		}else {
			System.out.print("¦��");
		}
		System.out.print("+");
		
		if(b%2 != 0) {
			System.out.print("Ȧ��");
		}else {
			System.out.print("¦��");
		}
		System.out.print("=");
		
		if((a+b)%2 == 0) {
			result = "¦��";
		}else if((a+b)%2 != 0){
			result = "Ȧ��";
		}
		System.out.print(result);

	}

}

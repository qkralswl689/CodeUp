import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오.
	    String result = "";
		
		if (num < 10) {
			result = "small";
		}else {
			result = "big";
		}
		System.out.println(result);
		
	  }
		
	}



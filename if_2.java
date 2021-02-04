

import java.util.Scanner;

public class if_2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	// 10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
	String result = "";
	
	if (num < 10) {
		result = "small";
	}else {
		result = "";
	}
	System.out.println(result);
	
  }
	
}

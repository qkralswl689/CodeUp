package If;

import java.util.Scanner;

public class if_1168Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int g = sc.nextInt();
		
		// y는 g가 2보다 클 경우 2000년 생이고 작을경우엔 1900년생이다
		int y = (g>2)?2000:1900;
		
		 // y는 n나누기 10,000 한값을 저장한다
		y += n/10000;
		System.out.println(y);
		// 변수 age는 2021 년 - n나누기 10,000 한값 +1 을 저장한다
		int age = 2021-y+1;
		System.out.println(age);
	}
}

package If;

import java.util.Scanner;

public class If1170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int clas = sc.nextInt();
		int num = sc.nextInt();
		
		if(num<10) { // num이 10보다 작으면
			String a = "0"+num; // 문자열 변수 a 에 0과num을 문자열로 저장한다
			System.out.printf("%d%d%s",grade,clas,a);
		}else {
			System.out.printf("%d%d%d",grade,clas,num);
		}
		
	}

}

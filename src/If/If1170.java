package If;

import java.util.Scanner;

public class If1170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		int clas = sc.nextInt();
		int num = sc.nextInt();
		
		if(num<10) { // num�� 10���� ������
			String a = "0"+num; // ���ڿ� ���� a �� 0��num�� ���ڿ��� �����Ѵ�
			System.out.printf("%d%d%s",grade,clas,a);
		}else {
			System.out.printf("%d%d%d",grade,clas,num);
		}
		
	}

}

package If;

import java.util.Scanner;

public class if_1168Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int g = sc.nextInt();
		
		// y�� g�� 2���� Ŭ ��� 2000�� ���̰� ������쿣 1900����̴�
		int y = (g>2)?2000:1900;
		
		 // y�� n������ 10,000 �Ѱ��� �����Ѵ�
		y += n/10000;
		System.out.println(y);
		// ���� age�� 2021 �� - n������ 10,000 �Ѱ� +1 �� �����Ѵ�
		int age = 2021-y+1;
		System.out.println(age);
	}
}

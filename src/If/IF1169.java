package If;

import java.util.Scanner;

public class IF1169 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		int year = 2012+1; // 2012�⵵ ����
		
		int x = year - age;	// ���� x �� 2013 - �Է°�
		
		int z = (x>=2000)?3:1;	// ���� z �� x�� 2000���� ũ�ų� ������ 3 �̰� �ƴϸ� 1�̴�
		
		if(z>1) { // z�� 1���� ũ�ٸ�
			int o = x - 2000; // x���� 2000�� ����
			System.out.printf("%d %d",o,z);
		}else { // �ƴ϶��
			int o = x -1900; // x���� 1900�� ���� 
			System.out.printf("%d %d",o,z);
		}	
		
	}

}

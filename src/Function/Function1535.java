package Function;

import java.util.Scanner;

public class Function1535 {

	public static void main(String[] args) {
		
		f(); // �Լ� ȣ��
		
	}
	
	static void f() { // �Լ� ����

		Scanner sc = new Scanner(System.in); // Scanner��ü ����
		
		int n = sc.nextInt(); // �Է¹��� ���� ���� n�� ����
		int[] arr = new int[n]; // �Է¹��� ������ ���̸�ŭ ���� �迭����
		
		for(int i=0; i<n; i++) { // i�� 0���� n���� 1�������ϸ鼭 �ݺ��Ѵ�
			
			arr[i] = sc.nextInt(); // �迭arr�� �Է¹��� ���� �����Ѵ�
			
		}
		
		int max = arr[0]; // �������� max�� �� �迭�� 0�� �ε��� ������ �ʱ�ȭ
		
		for(int i=0; i<arr.length;i++) { // i�� 0���� �迭�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
			if(arr[i]>max) { // i�ε��� ���� max��(�迭�� 0�� �ε�����)���� ũ�ٸ� 
				max = arr[i]; //max������ �ش簪�� �����Ѵ�
			}
		}	
		for(int i=0; i<arr.length;i++) { // i�� 0���� �迭�� ���̸�ŭ 1�������ϸ鼭 �ݺ��Ѵ�
			if(arr[i]==max) { // i�ε��� ���� max���� ���ٸ�
				System.out.println(i+1); // i�ε��� + 1�� ���� ����ϰ�
				break; // for���� ����������
			}
		}
	}
}

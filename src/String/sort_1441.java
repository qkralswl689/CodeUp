package String;

import java.util.Arrays;
import java.util.Scanner;

public class sort_1441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� ���� Scanner ��ü ����
		
		int n = sc.nextInt(); // �Է� ���� ������ ���� n ����
		int[] arr = new int[n]; // �Է¹��� �� n ������ �迭 ����
		
		for(int i=0; i<n; i++) { // i�� 0���� �Է¹��� �� n ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			arr[i] = sc.nextInt(); // �Է¹��� ���� �迭 arr �� �����Ѵ�
			
		}
		Arrays.sort(arr); // Arrays.sort(arr) : �迭�� ������������ �����Ѵ�
		
		for(int i=0; i<arr.length; i++) { // i �� 0���� �迭�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
			System.out.println(arr[i]); // �迭�� ����Ѵ�
		}
	}

}

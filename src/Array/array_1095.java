package Array;
import java.util.*;
public class array_1095 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����
		int n = sc.nextInt(); // �Է¹��� �� ������ ���� n����
		int[] arr = new int[n]; // �Է¹��� ��n ���� ��ŭ�� �迭 arr ����
		
		for(int i=0; i<n;i++) { // i�� 0���� �Է°�n���� 1�������ϸ� �ݺ��ϸ鼭
			arr[i] = sc.nextInt(); // �迭 arr�� �Է°��� �����Ѵ�
		}
		int min = arr[0]; // ���� min ����� ���ÿ� �迭�� 0��° ������ �ʱ�ȭ
		for(int i=0;i<arr.length;i++) { // i�� �迭�� ���̸�ŭ 1�������ϸ鼭 �ݺ��Ѵ�
			if(arr[i]<min) { // i�� ���� min(�迭�� �ʱ�ȭ��= �迭�� 0��° ��)���� �۴ٸ�
				min = arr[i]; // ���� min �� �迭�� ���� �����Ѵ�
			}
		}System.out.println(min);
		
	}

}

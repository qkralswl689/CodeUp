package Array;
import java.util.*;
public class array_1402 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n]; // nũ���� �迭 arr����
		
		for(int i=0; i<n;i++) { // i�� 0���� �Է¹��� n���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			arr[i] = sc.nextInt(); // �迭 arr ��  �Է¹��� i���� �����Ѵ�
		}
		for(int i=arr.length-1; i>=0;i--) { // arr�� ���� ���ڸ� ���� 0�� �ɋ����� 1�� �����ϸ鼭 �ݺ��Ѵ�
			System.out.println(arr[i]);
		}
		
	}

}


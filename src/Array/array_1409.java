package Array;
import java.util.*;
public class array_1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // 10��¥�� �迭 arr ����
		
		for(int i=0; i<arr.length; i++) { // i��0���� �迭�� ���̸�ŭ 1�� �����ϸ鼭
			arr[i] = sc.nextInt(); // �ԷµȰ��� �迭 arr�� �����Ѵ�
			
		}
		int k = sc.nextInt(); // ���� k �� ���� �Է¹޾� �����Ѵ�
		System.out.print(arr[k-1]); // arr�迭�� �Է¹��� k -1 �� �ε��� �� �ִ� ���� ����Ѵ� 
									// �ε����� 0���� �����ϱ� ������ -1�� ���ش�
	}

}

import java.util.*;
public class array_1403_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) { // i�� �Էµ�n�� ������ 1�� �����ϸ鼭 �ݺ��Ͽ� arr[]�� �Է°��� �����Ѵ�
			arr[i] = sc.nextInt();
			
		}
		for(int j = 0; j<2; j++) { // j�� 0���� 2���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			for(int i=0; i<n; i++) // i�� 0���� �Է°�n���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			System.out.println(arr[i]); // �迭 arr[i] �� ����Ѵ�
		}
		
		
	}

}

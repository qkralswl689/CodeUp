package Array;
import java.util.*;
public class array_1403 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<2;i++) { // i�� 0���� 2���� 1�� �����ϸ鼭 �ݺ��Ѵ� =>�ݺ�Ƚ��
			for(int j=0; j<arr.length;j++) { // j�� 0���� �迭�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.println(arr[j]);
			}
		}
		
		
	}

}

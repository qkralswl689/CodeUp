package Array;
import java.util.*;
public class array_1402_answer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; // nũ���� �迭 arr����
		
		for(int i=0; i<n; i++) { // �Է¼��� n �ݺ��Ͽ� �Է¹��� �� �迭 arr�� ������
			arr[i] = sc.nextInt();	
			 //System.out.println(arr[i]);
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int k = j+1; k<arr.length; k++) {
		 		if(arr[j]<arr[k]) { // ���Ǽ�(k)�� ���Ǽ�(j)���� ũ�� �Ʒ� ���ǽ� ����
		 			int sum = arr[j]; // sum �� j�� ���� ,* ���� sum : �ڸ��̵��ϴ� �� ��� ����
		 			arr[j] = arr[k]; // j���� k ���� ������
		 			arr[k] = sum; // sum�� k���� �����Ѵ� (�ڸ��� �ٲ��) = > j<k �� �����ɶ����� �ݺ�
		 			
		 		}
		 	}
		}
		for(int i=0; i<arr.length; i++) { // ����� �迭�� ���������� ����Ѵ�
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}


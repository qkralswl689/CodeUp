import java.util.*;
public class array_1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) { // i�� 0���� �Էµ� n���� �ݺ��ϸ鼭
			arr[i] = sc.nextInt(); // �迭arr �� �Էµ� ���� �����Ѵ� 
		}
		
		for(int j=arr.length-1; j>=0;j--) { // j�� �迭�� ������ �ڸ����� 0���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			System.out.print(arr[j]+" ");
		}
	}

}



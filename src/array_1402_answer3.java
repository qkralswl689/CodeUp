import java.util.*;
public class array_1402_answer3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n]; // nũ���� �迭 arr����
		
		for(int i=0; i<n;i++) { // i�� 0���� �Է¹��� n���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			arr[i] = sc.nextInt(); // �迭 arr ��  �Է¹��� i���� �����Ѵ�
		}
		int max = arr[0]; // ū�� ���� ���� max ����
		for(int j=0;j<arr.length; j++) { // j�� 0���� �迭�� ���̸�ŭ 1�� �����ϸ� �ݺ��Ѵ�
			for(int k =j+1;k<arr.length; k++) { // k �� j��+1 ���� �迭�� ���̸�ŭ �����ϸ鼭 �ݺ��Ѵ�
				if(arr[j] < arr[k]) { // ���࿡ k(j+1)�� ���� j������ ũ�� 
					max = arr[j]; // ���� max�� j�� ���� �����ϰ�
					arr[j] = arr[k]; // j���� k(j+1)���� ���ٸ�
					arr[k] = max; // k(j+1)�� ���� ���� max�� �����Ѵ�
					
				}
			}
		}
		for(int i=0; i<arr.length; i++) { // i�� 0���� �迭�� ���̸�ŭ 1�� �����ϸ� �ݺ��Ѵ�
			System.out.print(arr[i]+ " "); // ����� ������ ����Ѵ�
		}System.out.println();
	}

}


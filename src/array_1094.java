import java.util.*;
public class array_1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) { // �迭�� ���ڸ�����  0��° ����� 1�� �پ��鼭 ���
			// arr.lenght-1 : �迭�� ����-1��ŭ�ؾ� ���� �� ����� ����
			System.out.print(arr[i]+" ");
			}System.out.println();
			
		}

	}



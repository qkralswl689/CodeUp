import java.util.*;
public class array_1402_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int n = sc.nextInt();
		int[] arr = new int[n]; //n�� ���̸��� �迭���� arr ����
        int a;
        
        for (int i=0; i<n; i++) { //n���� �ݺ�
        	arr[i] = sc.nextInt(); // i�� �迭������ ������ �Է¹޴´�
        } 
        
        for (int j=0; j<n/2; j++) {
        	a = arr[j]; // ���� a�� �迭���� ���� �����Ѵ�
        	arr[j] = arr[n-1-j]; // �迭���� arr�� j�ε��� ���� n�ǰ� -1 -j �ǰ��̴�
        	arr[n-1-j] = a; // ���� a�� �����Ѵ�
        }
        
        for (int k=0; k<n; k++) { //k�� n���� �ݺ�
        	System.out.print(arr[k]+" ");
        }

		

		}

}


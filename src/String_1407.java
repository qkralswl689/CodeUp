import java.util.Scanner;

public class String_1407 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����

		String str = sc.nextLine(); // �Է¹��� ���ڿ��� str������ �����Ѵ�
		
		String[] arr = str.split(" "); // ���ڿ� �迭 arr�� str�� ����� ���ڿ���  " "�� �������� ���� �и��Ͽ� �迭�� �Ҵ� 
		
		for(int i =0; i<arr.length; i++) { // i�� 0���� �迭�� ���̸�ŭ 1�������ϸ鼭 �ݺ��Ѵ�
			System.out.print(arr[i]); // �迭 ���
		}
 	}

}

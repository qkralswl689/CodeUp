import java.util.Scanner;
public class for_1353 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����
		int n = sc.nextInt(); // �Է¹����� ���� n �� �Ҵ�
		
		for(int i = 0; i<n; i++) { // �ݺ�Ƚ�� : i�� 0���� �Է¹��� n ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			for(int j = 0; j<i+1;j++) { // j�� 0���� i(�ݺ�Ƚ��)+1 ���� 1�������ϸ鼭 �ݺ��Ѵ�
				System.out.print("*");
			}System.out.println();
		}
		
	}

}

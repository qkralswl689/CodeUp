package For;
import java.util.Scanner;
public class for_1355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����
		int n = sc.nextInt(); // �Է¹����� ���� n �� �Ҵ�
		
		for(int i = 0; i<n; i++) { // �ݺ�Ƚ�� : i�� 0���� �Է¹��� n ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			for(int j = 0; j<i;j++) { // j�� 0���� i�� ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print(" ");
			}
			for(int j=n;j>i;j--) { // j�� �Է¹����� n���� i������ 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print("*");
			}System.out.println();
		}
		
	}

}

package For;
import java.util.*;
public class for_1351 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����
		int n = sc.nextInt(); // �Է¹��� �� ���� n�� ����
		int x = sc.nextInt(); // �Է¹��� �� ���� x�� ����
		for(int i=n; i<=x; i++) { // i�� �Է¹����� n ���� �Է¹����� x ���� 1�������ϸ鼭 �ݺ��Ѵ�
			for(int j=1; j<=9;j++) { // j�� 1���� 9���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.printf("%d*%d=%d%n",i,j,i*j); // 
			}
		}
	}

}

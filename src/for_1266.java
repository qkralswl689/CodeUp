import java.util.*;
public class for_1266 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� Ŭ������ Scanner ��ü ����
		int n = sc.nextInt(); // �Էµ� �� n�� ����
		int sum = 0; // �հ谪 ������ ���� ����
		
		for(int i=1; i<=n; i++) { // 1���� �Է¹��� n���� 1�� �����ϸ鼭 �ݺ�
			
			sum += sc.nextInt(); // i�� �� ��ŭ ���ڸ� �Է¹޾� sum��  �Է¹��� ������ �հ� ����
		
		}System.out.println(sum); // �Է¹��� ������ �հ� ���
		

	}
}
	

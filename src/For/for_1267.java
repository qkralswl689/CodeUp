package For;
import java.util.*;
public class for_1267 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� Ŭ������ Scanner ��ü ����
		int n = sc.nextInt(); // �Էµ� �� n�� ����
		int sum = 0; // n�ǰ� ������ ���� ����
		int num = 0; // sum���� ���ǿ� �´� �� ������ ���� ����
		for(int i=1; i<=n; i++) { // 1���� �Է¹��� n���� 1�� �����ϸ鼭 �ݺ�
			sum = sc.nextInt(); // �Էµ� ���� sum�� ����
			if(sum%5==0) { // sum�� ����� �� �߿� 5�� ������
				num += sum; // num�� ���� �����Ѵ�
			}
			
		}System.out.println(num); // num�� �հ� ���� ����Ѵ�
	}

}



package For;
import java.util.*;
public class for_1268 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� Ŭ���� Scanner ��ü ����
		int n = sc.nextInt(); // �� �Է¹޾� ���� n�� ����
		int sum = 0; // n�� ����ŭ �Էµ� �� sum������ ����
		int count = 0; // ���ǿ� �´� �� count������ ����
		for(int i=1;i<=n; i++) { // �Է¹��� n�� ����ŭ ������ �Է¹޾� sum������ ����
			sum = sc.nextInt();
			if(sum%2==0) { // sum�� ����� �� �߿� ¦���� �ִٸ�
				count++; // count������  ����������  ����
				
			}
		}System.out.println(count); // count������ �� ���

	}

}

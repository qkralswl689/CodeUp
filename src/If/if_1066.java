package If;
import java.util.*;
public class if_1066 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� Ŭ������ Scanner ��ü ����
		int a = sc.nextInt(); // ù��° ���� �Է� �� a�� ����
		int b = sc.nextInt(); // �ι�° ���� �Է� �� b�� ����
		int c = sc.nextInt(); // ����° ���� �Է� �� c�� ����
		
		String result = ""; // ���ڿ� ����� ���� ���� ����
		
		if(a%2==0) { // a�� ¦,Ȧ�� ���� �Ǵ�
			result = "even";
		}else {
			result = "odd";
		}
		System.out.println(result); // a�� �Ǵ� ����� ���
		if(b%2==0) { // b�� ¦,Ȧ�� ���� �Ǵ�
			result = "even";
		}else {
			result = "odd";
		}
		System.out.println(result); // b�� �Ǵ� ����� ���
		if(c%2==0) {// c�� ¦,Ȧ�� ���� �Ǵ�
			result = "even";
		}else {
			result = "odd";
		}
		System.out.println(result); // c�� �Ǵ� ����� ���
	}

}

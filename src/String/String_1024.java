package String;
import java.util.*;
public class String_1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // �Է� ���� Scanner ��ü ����
		String n = sc.nextLine(); // �Է¹��� ���ڿ��� ���� n�� �����Ѵ�
		
		for(int i=0; i<n.length(); i++) { // i�� 0���� ���ڿ��� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
			System.out.println("'"+n.charAt(i)+"'"); // charAt�Լ� ��� => charAt : Ư�� ��ġ�� �ִ� ���� ��ȯ
													
		}
		
	}

}

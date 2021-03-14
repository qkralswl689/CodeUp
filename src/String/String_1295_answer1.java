package String;
import java.util.*;
public class String_1295_answer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) { // �Է¹��� ���ڿ��� ���� ���·� ��ȯ�ؼ� �迭�� ����
			charArr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < charArr.length; i++) {
			
			if (charArr[i] < 'A' || charArr[i] > 'z') { // ���ĺ��� �ƴ� ��� ��ȯ���� ����
				continue;
			}
			
			// �빮�ڿ� �ҹ����� �ƽ�Ű �ڵ� ���̸�ŭ ���ϰų� ���ָ�
			// �ƽ�Ű �ڵ尪�� �𸣴��� ��/�ҹ��� ��ȯ�� ����
			
			if (charArr[i] >= 'a') {
				charArr[i] -= ('a' - 'A'); 
			} else {
				charArr[i] += ('a' - 'A');
			}
		}
		
		for (char x : charArr) { // for-each ������ ���
			System.out.print(x);
		}
		
	} // end main()
}	// end Main

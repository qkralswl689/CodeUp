import java.util.*;
public class String_1295 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c=' ';//���ڷ� ���� ����
		for(int i=0;i<s.length();i++){ // i�� 0���� �Է¹��� ���ڿ��� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
		    c=s.charAt(i);//���ڿ��� ���ڷ� => ���� ���� c�� s�� �Է¹������ڿ��� ���ڷ� ��ȯ�Ͽ� �����Ѵ�
		    if('A'<=c&&c<='Z'){ // ���࿡ c(����)�� �빮�� A ���� ũ�ų� �����鼭 �빮�� Z���� �۰ų� ������
		        c=Character.toLowerCase(c); // c(����)�� �ҹ��ڷ� ��ȯ�ϰ�
		    }
		    else if('a'<=c&&c<='z'){ // ���࿡ c(����)�� �ҹ��� a���� ũ�ų� �����鼭 �ҹ��� z ���� �۰ų� ������
		        c=Character.toUpperCase(c); // c(����)�� �빮�ڷ� ��ȯ�Ѵ�
		    }
		    System.out.print(c);
		}
    }
}



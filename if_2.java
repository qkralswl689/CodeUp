

import java.util.Scanner;

public class if_2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	// 10���� ���� ���� �ԷµǸ� small �� ���, 10�̻��̸� �ƹ��͵� ������� ���ÿ�.
	String result = "";
	
	if (num < 10) {
		result = "small";
	}else {
		result = "";
	}
	System.out.println(result);
	
  }
	
}

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 10���� ���� ������ �ԷµǸ� small �� ���, �� �̻��� ���� �ԷµǸ� big �� ����Ͻÿ�.
	    String result = "";
		
		if (num < 10) {
			result = "small";
		}else {
			result = "big";
		}
		System.out.println(result);
		
	  }
		
	}



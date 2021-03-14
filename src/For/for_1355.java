package For;
import java.util.Scanner;
public class for_1355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성
		int n = sc.nextInt(); // 입력받은값 변수 n 에 할당
		
		for(int i = 0; i<n; i++) { // 반복횟수 : i는 0부터 입력받은 n 까지 1씩 증가하면서 반복한다
			for(int j = 0; j<i;j++) { // j는 0부터 i값 까지 1씩 증가하면서 반복한다
				System.out.print(" ");
			}
			for(int j=n;j>i;j--) { // j는 입력받은값 n부터 i값까지 1씩 감소하면서 반복한다
				System.out.print("*");
			}System.out.println();
		}
		
	}

}

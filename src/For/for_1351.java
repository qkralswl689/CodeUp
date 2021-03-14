package For;
import java.util.*;
public class for_1351 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성
		int n = sc.nextInt(); // 입력받은 값 변수 n에 저장
		int x = sc.nextInt(); // 입력받은 값 변수 x에 저장
		for(int i=n; i<=x; i++) { // i는 입력받은값 n 부터 입력받은값 x 까지 1씩증가하면서 반복한다
			for(int j=1; j<=9;j++) { // j는 1부터 9까지 1씩 증가하면서 반복한다
				System.out.printf("%d*%d=%d%n",i,j,i*j); // 
			}
		}
	}

}

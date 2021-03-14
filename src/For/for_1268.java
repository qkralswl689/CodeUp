package For;
import java.util.*;
public class for_1268 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 Scanner 객체 생성
		int n = sc.nextInt(); // 값 입력받아 변수 n에 저장
		int sum = 0; // n의 값만큼 입력된 값 sum변수에 저장
		int count = 0; // 조건에 맞는 값 count변수에 저장
		for(int i=1;i<=n; i++) { // 입력받은 n의 값만큼 정수를 입력받아 sum변수에 저장
			sum = sc.nextInt();
			if(sum%2==0) { // sum에 저장된 값 중에 짝수가 있다면
				count++; // count변수에  증감식으로  저장
				
			}
		}System.out.println(count); // count변수의 값 출력

	}

}

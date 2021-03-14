package For;
import java.util.*;
public class for_1267 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 클래스인 Scanner 객체 생성
		int n = sc.nextInt(); // 입력된 값 n에 저장
		int sum = 0; // n의값 저장할 변수 선언
		int num = 0; // sum에서 조건에 맞는 값 저장할 변수 선언
		for(int i=1; i<=n; i++) { // 1부터 입력받은 n까지 1씩 증가하면서 반복
			sum = sc.nextInt(); // 입력된 값을 sum에 저장
			if(sum%5==0) { // sum에 저장된 값 중에 5의 배수라면
				num += sum; // num에 값을 저장한다
			}
			
		}System.out.println(num); // num의 합계 값을 출력한다
	}

}



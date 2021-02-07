import java.util.*;
public class for_1266 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 클래스인 Scanner 객체 생성
		int n = sc.nextInt(); // 입력된 값 n에 저장
		int sum = 0; // 합계값 저장할 변수 선언
		
		for(int i=1; i<=n; i++) { // 1부터 입력받은 n까지 1씩 증가하면서 반복
			
			sum += sc.nextInt(); // i의 값 많큼 숫자를 입력받아 sum에  입력받은 숫자의 합계 저장
		
		}System.out.println(sum); // 입력받은 숫자의 합계 출력
		

	}
}
	

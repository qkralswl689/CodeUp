package String;
import java.util.*;
public class String_1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력 받을 Scanner 객체 생성
		String n = sc.nextLine(); // 입력받은 문자열을 변수 n에 저장한다
		
		for(int i=0; i<n.length(); i++) { // i는 0부터 문자열의 길이만큼 1씩 증가하면서 반복한다
			System.out.println("'"+n.charAt(i)+"'"); // charAt함수 사용 => charAt : 특정 위치에 있는 문자 반환
													
		}
		
	}

}

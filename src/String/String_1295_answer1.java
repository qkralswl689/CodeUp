package String;
import java.util.*;
public class String_1295_answer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) { // 입력받은 문자열을 문자 형태로 변환해서 배열에 저장
			charArr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < charArr.length; i++) {
			
			if (charArr[i] < 'A' || charArr[i] > 'z') { // 알파벳이 아닐 경우 변환하지 않음
				continue;
			}
			
			// 대문자와 소문자의 아스키 코드 차이만큼 더하거나 빼주면
			// 아스키 코드값을 모르더라도 대/소문자 변환이 가능
			
			if (charArr[i] >= 'a') {
				charArr[i] -= ('a' - 'A'); 
			} else {
				charArr[i] += ('a' - 'A');
			}
		}
		
		for (char x : charArr) { // for-each 문으로 출력
			System.out.print(x);
		}
		
	} // end main()
}	// end Main

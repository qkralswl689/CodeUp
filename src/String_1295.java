import java.util.*;
public class String_1295 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c=' ';//문자로 담을 공간
		for(int i=0;i<s.length();i++){ // i는 0부터 입력받은 문자열의 길이만큼 1씩 증가하면서 반복한다
		    c=s.charAt(i);//문자열을 문자로 => 문자 변수 c에 s에 입력받은문자열을 문자로 변환하여 저장한다
		    if('A'<=c&&c<='Z'){ // 만약에 c(문자)가 대문자 A 보다 크거나 같으면서 대문자 Z보다 작거나 같으면
		        c=Character.toLowerCase(c); // c(문자)를 소문자로 변환하고
		    }
		    else if('a'<=c&&c<='z'){ // 만약에 c(문자)가 소문자 a보다 크거나 같으면서 소문자 z 보다 작거나 같으면
		        c=Character.toUpperCase(c); // c(문자)를 대문자로 변환한다
		    }
		    System.out.print(c);
		}
    }
}



import java.util.Scanner;

public class String_1407 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성

		String str = sc.nextLine(); // 입력받은 문자열을 str변수에 저장한다
		
		String[] arr = str.split(" "); // 문자열 배열 arr에 str에 저장된 문자열을  " "을 기준으로 각각 분리하여 배열에 할당 
		
		for(int i =0; i<arr.length; i++) { // i는 0부터 배열의 길이만큼 1씩증가하면서 반복한다
			System.out.print(arr[i]); // 배열 출력
		}
 	}

}

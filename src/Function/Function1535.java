package Function;

import java.util.Scanner;

public class Function1535 {

	public static void main(String[] args) {
		
		f(); // 함수 호출
		
	}
	
	static void f() { // 함수 생성

		Scanner sc = new Scanner(System.in); // Scanner객체 생성
		
		int n = sc.nextInt(); // 입력받은 정수 변수 n에 저장
		int[] arr = new int[n]; // 입력받은 정수의 길이만큼 정수 배열생성
		
		for(int i=0; i<n; i++) { // i는 0부터 n까지 1씩증가하면서 반복한다
			
			arr[i] = sc.nextInt(); // 배열arr에 입력받은 값을 저장한다
			
		}
		
		int max = arr[0]; // 정수변수 max의 값 배열의 0번 인덱스 값으로 초기화
		
		for(int i=0; i<arr.length;i++) { // i는 0부터 배열의 길이만큼 1씩 증가하면서 반복한다
			if(arr[i]>max) { // i인덱스 값이 max값(배열의 0번 인덱스값)보다 크다면 
				max = arr[i]; //max변수에 해당값을 저장한다
			}
		}	
		for(int i=0; i<arr.length;i++) { // i는 0부터 배열의 길이만큼 1씩증가하면서 반복한다
			if(arr[i]==max) { // i인덱스 값이 max값과 같다면
				System.out.println(i+1); // i인덱스 + 1의 값을 출력하고
				break; // for문을 빠져나간다
			}
		}
	}
}

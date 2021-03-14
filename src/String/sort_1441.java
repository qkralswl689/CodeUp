package String;

import java.util.Arrays;
import java.util.Scanner;

public class sort_1441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 받을 Scanner 객체 생성
		
		int n = sc.nextInt(); // 입력 값을 저장할 변수 n 선언
		int[] arr = new int[n]; // 입력받은 값 n 길이의 배열 생성
		
		for(int i=0; i<n; i++) { // i는 0부터 입력받은 값 n 까지 1씩 증가하면서 반복한다
			arr[i] = sc.nextInt(); // 입력받은 값을 배열 arr 에 저장한다
			
		}
		Arrays.sort(arr); // Arrays.sort(arr) : 배열을 오름차순으로 정렬한다
		
		for(int i=0; i<arr.length; i++) { // i 는 0부터 배열의 길이만큼 1씩 증가하면서 반복한다
			System.out.println(arr[i]); // 배열을 출력한다
		}
	}

}

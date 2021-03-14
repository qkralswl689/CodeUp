package Array;
import java.util.*;
public class array_1095 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성
		int n = sc.nextInt(); // 입력받을 값 저장할 변수 n선언
		int[] arr = new int[n]; // 입력받은 값n 길이 만큼의 배열 arr 생성
		
		for(int i=0; i<n;i++) { // i는 0부터 입력값n까지 1씩증가하며 반복하면서
			arr[i] = sc.nextInt(); // 배열 arr에 입력값을 저장한다
		}
		int min = arr[0]; // 변수 min 선언과 동시에 배열의 0번째 값으로 초기화
		for(int i=0;i<arr.length;i++) { // i는 배열의 길이만큼 1씩증가하면서 반복한다
			if(arr[i]<min) { // i의 값이 min(배열의 초기화값= 배열의 0번째 값)보다 작다면
				min = arr[i]; // 변수 min 에 배열의 값을 저장한다
			}
		}System.out.println(min);
		
	}

}

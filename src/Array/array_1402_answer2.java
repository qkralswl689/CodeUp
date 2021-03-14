package Array;
import java.util.*;
public class array_1402_answer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; // n크기의 배열 arr생성
		
		for(int i=0; i<n; i++) { // 입력숫자 n 반복하여 입력받은 값 배열 arr에 값저장
			arr[i] = sc.nextInt();	
			 //System.out.println(arr[i]);
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int k = j+1; k<arr.length; k++) {
		 		if(arr[j]<arr[k]) { // 뒤의수(k)가 앞의수(j)보다 크면 아래 조건식 실행
		 			int sum = arr[j]; // sum 에 j값 대입 ,* 변수 sum : 자리이동하는 값 잠깐 저장
		 			arr[j] = arr[k]; // j값과 k 값이 같으면
		 			arr[k] = sum; // sum에 k값을 대입한다 (자리가 바뀐다) = > j<k 가 만족될때까지 반복
		 			
		 		}
		 	}
		}
		for(int i=0; i<arr.length; i++) { // 저장된 배열을 순차적으로 출력한다
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}


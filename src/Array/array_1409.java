package Array;
import java.util.*;
public class array_1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // 10개짜리 배열 arr 선언
		
		for(int i=0; i<arr.length; i++) { // i는0부터 배열의 길이만큼 1씩 증가하면서
			arr[i] = sc.nextInt(); // 입력된값을 배열 arr에 저장한다
			
		}
		int k = sc.nextInt(); // 변수 k 에 값을 입력받아 저장한다
		System.out.print(arr[k-1]); // arr배열의 입력받은 k -1 의 인덱스 에 있는 값을 출력한다 
									// 인덱스는 0부터 시작하기 때문에 -1을 해준다
	}

}

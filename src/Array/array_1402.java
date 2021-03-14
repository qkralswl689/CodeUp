package Array;
import java.util.*;
public class array_1402 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n]; // n크기의 배열 arr생성
		
		for(int i=0; i<n;i++) { // i는 0부터 입력받은 n까지 1씩 증가하면서 반복한다
			arr[i] = sc.nextInt(); // 배열 arr 에  입력받은 i값을 저장한다
		}
		for(int i=arr.length-1; i>=0;i--) { // arr의 제일 뒷자리 부터 0이 될떄까지 1씩 감소하면서 반복한다
			System.out.println(arr[i]);
		}
		
	}

}


import java.util.*;
public class array_1403_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) { // i는 입력된n의 값까지 1씩 증가하면서 반복하여 arr[]에 입력값을 저장한다
			arr[i] = sc.nextInt();
			
		}
		for(int j = 0; j<2; j++) { // j는 0부터 2까지 1씩 증가하면서 반복한다
			for(int i=0; i<n; i++) // i는 0부터 입력값n까지 1씩 증가하면서 반복한다
			System.out.println(arr[i]); // 배열 arr[i] 를 출력한다
		}
		
		
	}

}

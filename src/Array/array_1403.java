package Array;
import java.util.*;
public class array_1403 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<2;i++) { // i는 0부터 2까지 1씩 증가하면서 반복한다 =>반복횟수
			for(int j=0; j<arr.length;j++) { // j는 0부터 배열의 길이만큼 1씩 증가하면서 반복한다
				System.out.println(arr[j]);
			}
		}
		
		
	}

}

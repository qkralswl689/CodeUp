import java.util.*;
public class array_1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) { // i는 0부터 입력된 n까지 반복하면서
			arr[i] = sc.nextInt(); // 배열arr 에 입력된 값을 저장한다 
		}
		
		for(int j=arr.length-1; j>=0;j--) { // j는 배열의 마지막 자리부터 0까지 1씩 감소하면서 반복한다
			System.out.print(arr[j]+" ");
		}
	}

}



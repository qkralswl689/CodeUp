import java.util.*;
public class array_1402_answer3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n]; // n크기의 배열 arr생성
		
		for(int i=0; i<n;i++) { // i는 0부터 입력받은 n까지 1씩 증가하면서 반복한다
			arr[i] = sc.nextInt(); // 배열 arr 에  입력받은 i값을 저장한다
		}
		int max = arr[0]; // 큰값 비교할 변수 max 선언
		for(int j=0;j<arr.length; j++) { // j는 0부터 배열의 길이만큼 1씩 증가하며 반복한다
			for(int k =j+1;k<arr.length; k++) { // k 는 j값+1 부터 배열의 길이만큼 증가하면서 반복한다
				if(arr[j] < arr[k]) { // 만약에 k(j+1)의 값이 j값보다 크면 
					max = arr[j]; // 변수 max에 j의 값을 저장하고
					arr[j] = arr[k]; // j값과 k(j+1)값이 같다면
					arr[k] = max; // k(j+1)의 값을 변수 max에 저장한다
					
				}
			}
		}
		for(int i=0; i<arr.length; i++) { // i는 0부터 배열의 길이만큼 1씩 증가하며 반복한다
			System.out.print(arr[i]+ " "); // 저장된 변수를 출력한다
		}System.out.println();
	}

}


import java.util.*;
public class array_1402_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int n = sc.nextInt();
		int[] arr = new int[n]; //n의 길이만금 배열변수 arr 선언
        int a;
        
        for (int i=0; i<n; i++) { //n까지 반복
        	arr[i] = sc.nextInt(); // i를 배열변수의 값으로 입력받는다
        } 
        
        for (int j=0; j<n/2; j++) {
        	a = arr[j]; // 변수 a에 배열변수 값을 대입한다
        	arr[j] = arr[n-1-j]; // 배열변수 arr의 j인덱스 값은 n의값 -1 -j 의값이다
        	arr[n-1-j] = a; // 변수 a에 대입한다
        }
        
        for (int k=0; k<n; k++) { //k는 n까지 반복
        	System.out.print(arr[k]+" ");
        }

		

		}

}


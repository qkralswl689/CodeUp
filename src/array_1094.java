import java.util.*;
public class array_1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) { // 배열의 끝자리부터  0번째 방까지 1씩 줄어들면서 출력
			// arr.lenght-1 : 배열의 길이-1만큼해야 가장 끝 방부터 시작
			System.out.print(arr[i]+" ");
			}System.out.println();
			
		}

	}



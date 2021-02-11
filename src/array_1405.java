import java.util.*;
public class array_1405 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int num = arr[0];
		for(int i=0; i<arr.length; i++) {
			for(int j = arr.length -1; j>=0; j--) {
				if(arr[i] > arr[j]) {
					num = arr[j];
					arr[j] = arr[i];
					arr[i] = num;
					
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}System.out.println();

	}
	
}

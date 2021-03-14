package Array;
import java.util.*;
public class array_1409_answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			//System.out.print(arr[i]);
		}
		
		int k= sc.nextInt();
		System.out.print(arr[k]+1);
	}

}

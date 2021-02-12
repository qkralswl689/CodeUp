import java.util.*;
public class array_1405 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int tmp=0;
		for(int i=0; i<arr.length;i++) {
			tmp =i;
			for(int j =0; j<arr.length; j++) {
				if(tmp != arr.length-1) {
					System.out.print(arr[tmp++]);
				}else if(tmp == arr.length-1) {
					System.out.print(arr[tmp]);
					tmp=0;
			}
			
			}System.out.println();
		}
		
			
	}
		
}
	


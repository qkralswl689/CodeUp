import java.util.*;
public class array_1402_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int n = sc.nextInt();
		int[] arr = new int[n]; //n의 길이만금 배열변수 arr 선언
        for(int i=0;i<n;i++) {
        	arr[i] = sc.nextInt();
        }
        int num = arr[0];
        
        	for(int i=0; i<arr.length; i++) {
        		for(int j=1;j<arr.length;j++) {
        			if(arr[j -1]>arr[j]) {
        				num = arr[j-1]; 
        				arr[j-1] = arr[j];
        				arr[j] =num;
        			}
        		}
        	}for(int i=0; i<arr.length; i++) {
        		System.out.println(arr[i]);
        	}
       
       
	}

}


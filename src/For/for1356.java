package For;
import java.util.Scanner;

public class for1356 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				if(i==0||i==n) {
					System.out.print("+");
				}			
			}System.out.println();
			for(int j=0;j<n;j++) {
				if(j==0||j==n) {
					System.out.print("*");
				}
				
			}for(int j=0;j<n-1;j++) {
				if(j==0||j==n) {
					System.out.print(" ");
				}
			
			}for(int j=0;j<n-1;j++) {
				if(j==0||j==n) {
					System.out.print("%");
				}
			}
		}
		
	}
}



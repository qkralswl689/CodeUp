package If;
import java.util.Scanner;
public class if_1167 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a<b && b<c) { 
			System.out.println(b);
		}
		if(a<c && c<b) {
			System.out.println(c);
		}
		if(b<a && a<c) {
			System.out.println(a);
		}
		if(b<c && c<a) {
			System.out.println(c);
		}
		if(c<a && a<b) {
			System.out.println(a);
		}
		if(c<b && b<a) {
			System.out.println(b);
		}else if(a==b && b==c) {
			System.out.println(b);
		}else if(a==b && b<c) {
			System.out.println(b);
		}else if (b==c && c<a) {
			System.out.println(c);
		}else if(c==a&&a<b) {
			System.out.println(a);
		}

	}

}

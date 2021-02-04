import java.util.*;

public class if_9 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		
		if(a>=50 && a<=70 || a%6 == 0) {
			result = "win";
		}else {
			result = "lose";
		}
		System.out.println(result);

	}

}

package If;
import java.util.*;

public class if_8 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		
		if(a>=30 && a<=40 || a>=60 && a<=70) {
			result = "win";
		}else {
			result = "lose";
		}
		System.out.println(result);

	}

}

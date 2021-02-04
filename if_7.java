import java.util.*;

public class if_7 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		String result = "";
		
		if(a >= 50 && a <= 60) {
			result = "win";
		}else {
			result = "lose";
		}
		System.out.println(result);

	}

}

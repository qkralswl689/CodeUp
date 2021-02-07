import java.util.*;

public class if_10{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		
				
		if(a == 1 || a ==3 || a ==5 || a ==7 ) {
			result = "oh my god";
		}else {
			result = "enjoy";
		}
		System.out.println(result);
	}

}

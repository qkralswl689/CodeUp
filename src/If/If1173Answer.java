package If;

import java.util.Scanner;

public class If1173Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int min = sc.nextInt();
		
		if(time>=0 && time<=23 && min>=0 && min<=59) {
			// time 이 0과 같거나 크고 23보다 작거나 같고, min이 0과 같거나 크고 59보다 작거나 같으면			
			if(min > 30 || min ==30) { // min 이 30보다 크거나 같으면
				min -= 30; // min 에서 30을 빼준다
			}else if(min <30){ // min이 30보다 크다면
				if(time == 0) { // time이 0인 경우
					time +=23; // time 에 23을 더하고
					min +=30; // min에 30을 더한다
				}else if(time >0){ // time이 0보다 크다면
					time --; // time에서 -1을 하고
					min +=30; //min에 30을 더한다
				}
			}System.out.printf("%d %d",time,min);
			
		}
	}

}

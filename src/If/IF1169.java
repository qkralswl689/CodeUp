package If;

import java.util.Scanner;

public class IF1169 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		int year = 2012+1; // 2012년도 기준
		
		int x = year - age;	// 변수 x 는 2013 - 입력값
		
		int z = (x>=2000)?3:1;	// 변수 z 는 x가 2000보다 크거나 같으면 3 이고 아니면 1이다
		
		if(z>1) { // z가 1보다 크다면
			int o = x - 2000; // x에서 2000을 빼고
			System.out.printf("%d %d",o,z);
		}else { // 아니라면
			int o = x -1900; // x에서 1900을 뺀다 
			System.out.printf("%d %d",o,z);
		}	
		
	}

}

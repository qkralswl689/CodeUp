package If;

import java.util.Scanner;

public class If1173Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int min = sc.nextInt();
		
		if(time>=0 && time<=23 && min>=0 && min<=59) {
			// time �� 0�� ���ų� ũ�� 23���� �۰ų� ����, min�� 0�� ���ų� ũ�� 59���� �۰ų� ������			
			if(min > 30 || min ==30) { // min �� 30���� ũ�ų� ������
				min -= 30; // min ���� 30�� ���ش�
			}else if(min <30){ // min�� 30���� ũ�ٸ�
				if(time == 0) { // time�� 0�� ���
					time +=23; // time �� 23�� ���ϰ�
					min +=30; // min�� 30�� ���Ѵ�
				}else if(time >0){ // time�� 0���� ũ�ٸ�
					time --; // time���� -1�� �ϰ�
					min +=30; //min�� 30�� ���Ѵ�
				}
			}System.out.printf("%d %d",time,min);
			
		}
	}

}

package day02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// if 문제
		
		/*
		 * 		이용 시간에 따라 요금을 책정하는 놀이기구가 있다
		 * 		기본요금은 3천원으로 시작하여 10분당 추가 요금 500원이 발생한다
		 * 		요금표는 아래와 같은 규칙으로 적용한다.
		 * 
		 * 		0 ~ 30		3000원
		 * 		31 ~ 40		3500원
		 * 		41 ~ 50		4000원
		 * 		...
		 * 
		 * 		이용시간을 분으로 입력받아서, 금액을 게산하여 출력하는 코드를 작성하세요.
		 */
		
//		1) 초기값 설정
		
		int time = 0,  fee = 3000;
		
//		2) 입력

		Scanner sc = new Scanner(System.in);
		System.out.print("이용한 시간 : ");
		time = sc.nextInt();

// 		3) 출력
		if(time > 30) {
			System.out.printf("총금액은 %d이다 ", fee + (((time - 31) / 10) + 1)*500);
		}else {
			System.out.printf("총급액은 %d이다", fee);
		}
			
		sc.close();
		
	}
}

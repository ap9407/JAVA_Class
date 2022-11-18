package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 		1층에서 15층 사이의 엘리베이터가 3개가 있습니다.
		 * 		사용자에게 현재 층을 입력받아서 가장 가까운 엘리베이터가 이동할수 있도록
		 * 		출력문을 만들어서 출력해주세요.
		 */
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15)+1;
		int n2 = ran.nextInt(15)+1;
		int n3 = ran.nextInt(15)+1;
		int current, min, cur1, cur2, cur3;
		
		System.out.println("층수는"+ n1 + " "  + n2 + " " + n3 );
		
		System.out.print("현재 몇층입니까? : ");
		current = sc.nextInt();
		
		cur1 = current - n1; 
		cur2 = current - n2; 
		cur3 = current - n3;
		
		cur1 = cur1 < 0 ? -cur1 : cur1;
		cur2 = cur2 < 0 ? -cur2 : cur2;
		cur3 = cur3 < 0 ? -cur3 : cur3;
		
		min = cur1;
		
		if(min > cur2)
			min = cur2;
			
		if(min > cur3)
			min = cur3;
			
		if(min == cur1) System.out.println("첫번째 엘리베이터가 움직입니다.");
		if(min == cur2) System.out.println("두번째 엘리베이터가 움직입니다.");
		if(min == cur3) System.out.println("세번째 엘리베이터가 움직입니다.");

			
		
		/*
		 * if(cur1 <= cur2 && cur1 <= cur3 ) { System.out.print(n1 + "층입니다"); }else
		 * if(cur2 <= cur1 && cur2 <= cur3) { System.out.print(n2 + "층입니다"); }else
		 * if(cur3 < cur1 && cur3 < cur2) { System.out.print(n3 + "층입니다"); }
		 */
		sc.close();
	}
}

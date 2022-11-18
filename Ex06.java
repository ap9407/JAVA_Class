package day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// if 문제

		// 1) 세 정수를 입력받아서, 그 중에서 최소값을 찾아서 출력하세요

		int a, b, c, min;
		System.out.print("정수를 입력하세요 :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println("최소값: " + min);

		/*
		 * if(a <= b && a <= c) { System.out.print(a); }else if(b <= a && b <= c) {
		 * System.out.print(b); }else if(c < a && c < b) { System.out.print(c); }
		 */

		// 2) 정수를 입력받아서, 정수의 절대값을 출력하는 코드를 작성하세요

		int num;
		System.out.print("정수를 입력하세요 : ");
		/*num = sc.nextInt();
		
		 * if (num < 0) { System.out.print("절대값은 " + -num + " 입니다"); } else {
		 * System.out.print("절대값은 " + num + " 입니다"); }
		 */

		System.out.println("2) 절대 값을 출력할 정수 입력: ");
		num = sc.nextInt();
		System.out.printf("%d의 절대값은 %d입니다\n\n", num, num < 0 ? -num : num);

		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요

		System.out.println("");

		int num2;
		System.out.print("정수를 입력하세요 : ");
		num2 = sc.nextInt();
		if (num2 % 2 != 0) {
			System.out.print(num2 + " 값은 홀수입니다");
		} else {
			System.out.print(num2 + " 값은 짝수입니다");
		}

		sc.close();
	}
}

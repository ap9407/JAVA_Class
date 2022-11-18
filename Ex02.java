package day03;

public class Ex02 {
	public static void main(String[] args) {

		// 대문자 A부터 Z까지 한줄에 출력하세요.
		// 각 글자는, 로 구분하고 마지막에는 콤마가 없어야합니다.
		
		// for문
		char ch1 = 'A';

		for (int i = 1; i <= 25; i++) {
			System.out.print(ch1 + ", ");
			ch1 += 1;
		}
		System.out.print("Z");
		
		System.out.println("");

		int i = 65;
		
		// while문
		while (true) {
			System.out.printf("%c", i);
			i++;
			if (i == 91) {
				break;
			}

			System.out.print(", ");
		}
		System.out.println("");
		
		// 선생님 풀이
		for(char ch2 = 'A'; ch2 <= 'Z'; ch2++) { 		//char도 1씩 증가하는게 가능하다.
			System.out.print(ch2);
			String next = (ch2 == 'Z') ? "\n" : ", ";
			System.out.print(next);
		}
	}
}

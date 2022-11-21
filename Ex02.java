package day04;

public class Ex02 {
	// y = f(x)
	static int getMaxNum(int a, int b, int c) {

		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	static int getReverseNumber(int a1) {
		int a2 = 0;

		while (true) {
			a2 += a1 % 10;
			a2 = a2 * 10;
			a1 = a1 / 10;
			if (a1 < 10) {
				return a1 + a2;
			// 반복문에서 return을 사용하면 바로 반복문을 멈출수있다.
			}
		}
	}

	static int getFee(int time) {
		int over = ((time - 21) / 10) * 500;
		return time > 30 ? 3000 + over : 3000;
		// 삼항 연산은 값을 결정하고, return 은 값을 반환하기 때문에
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있다.
	}

	static int getSummary(int x1, int x2) {
//		int x3 = 0;
//		for (int i = x1; i <= x2; i++) {
//			x3 += i;
//		}
//		return x3;
		return (x1 + x2) * (x2 - x1 + 1) / 2;
		//알고리즘의 정석!

	}

	public static void main(String[] args) {

		// 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요.
		int n1 = getMaxNum(2, 5, 3);
		System.out.println("n1 : " + n1);

		// 2) 정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요.(while)
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : " + n2);

		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요.(if)
		int n3 = getFee(40);
		System.out.println("n3 : " + n3);

		// 4) 두 정수 a, b를 전달받아서 a와 b사이의 모든 합계를 반환하는 함수를 작성하세요.(for)
		int n4 = getSummary(1, 100);
		System.out.println("n4 : " + n4);
	}
}

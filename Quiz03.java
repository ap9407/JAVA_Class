package day05;

public class Quiz03 {

//	static int minNum(int a, int b, int c) {
//		int min = 0;
//		min = a;
//		if (min > b)
//			min = b;
//		if (min > c)
//			min = c;
//
//		return min;
//	}
// ------------------ 1번 문제 --------------------------	
	// 배열이나 문자열의 인덱스는 항상 0부터 시작하여 길이 -1까지 존재한다.
	static int minNum(int... args) {
		int ret = 10000000;

		for (int i = 0; i < args.length; i++) {
			int num = args[i];
			if (ret > num) {
				ret = num;
			}
		}
		System.out.println(ret);
		return ret;
	}
// ------------------ 2번 문제 ---------------------------

	static int countNum(String str, char ch) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
//			1) = 하나는 대입연산이다. == 는 비교연산이다

			if (ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
// ------------------ 3번 문제 ---------------------------- 

	static boolean check(String str) {
		boolean flag = true;
		// 1) 길이가 일치하는가?
		if (str.length() != 19)
			flag = false;

		// 2) -의 개수가 일치하는가? (함수의 재사용)
		if (countNum(str, '-') != 3)
			flag = false;

		// 3) split으로 분리했을 때, 분리된 요소가 4개이고, 각 요소의 자릿수가 4인가?
//		String[] arr = str.split("-");	// arr[] = {"1234","1234","12345',"1234"}
//		System.out.println();
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].length() != 4) {
//				flag = false;
//				return flag;
//			}
//		}
//		return flag;

		// 3) split 으로 분리했을 때, 분리된 요소가 4개인가
		String[] arr = str.split("-");
		if (arr.length != 4)
			flag = false;

		// 4) split 으로 분리했을 때, 각 요소의 자리수가 4인가
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			System.out.println("s : " + s);
			if (s.length() != 4)
				flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// 1) 정수를 여러개 전달받아서, 최소값을 반환하는 함수를 작성하세요
		int n1 = minNum(10, 5, 11);
		System.out.println("n1 : " + n1);

		// 2) 문자열에서 특정 글자가 몇개 포함되어있는지 반환하는 함수를 작성하세요
		int n2 = countNum("Life is too short, you need phython", 'e');
		System.out.println("n2 : " + n2);

		// 3) 문자열 형태로 카드번호를 입력받아서, 길이가 맞는지 확인하는 함수를 작성하세요
		// 전체길이, -의 개수, 분리했을때 각 단위의 길이
		boolean b1 = check("1234-1234-1234-1234"); // true
		boolean b2 = check("867-2356123-1234567"); // false
		boolean b3 = check("930516-2345678"); // false
		boolean b4 = check("9334-238-43543-4444"); // false
		System.out.printf("%b, %b, %b, %b\n", b1, b2, b3, b4);

	}

}

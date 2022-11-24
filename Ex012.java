package array;

import java.util.Scanner;

public class Ex012 {
	static void show(String[] arr) {
		System.out.printf("arr[%s] :  ", arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? " \n" : " 의 단어뜻은 ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int length = 2;
		int length1 = 1;
		String[] arr = new String[length];
		String[] tmp;
		String input;

		show(arr);

		while (true) {
			System.out.print("입력 : ");
			input = sc.nextLine();
			if (input.equals("종료")) {
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null) {
					arr[i] = input;
					break;
				}
			}
			show(arr);

			if (arr[arr.length - 1] != null) {
				tmp = new String[arr.length + length1];
				for (int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;
			}

		}
		System.out.println("단어암기 끝");
		
		sc.close();
	}

}

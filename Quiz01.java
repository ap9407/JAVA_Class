package day02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[]args) {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요
		// 단, 주소는 띄워쓰기를 포함하여 입력 할 수 있어야 합니다.
		// 입출력에는 사용자의 입력에 따라 예외가 발생할 수 있기 때문에
		// 보통 IOException 처리를 해야하지만
		// Scanner는 내부 코드에서 예외 처리가 되어있어서, 예외 선언을 안해도 된다.
		
		// 1) 변수 선언
		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
			
		// 2) 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
//		age = sc.nextInt();
//		sc.nextLine();
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("주소를 입력하세요 : ");
		address = sc.nextLine();
		
		System.out.println("".contentEquals(address));
//		String name = request.getParameter("name");
//		String age = requqest.getParameter("age");
//		int_age = Integer.parseInt(age);
		
		// 3) 출력
		
		System.out.printf("이름은 %s입니다\n", name);
		System.out.printf("나이는 %d입니다\n", age);
		System.out.printf("주소는 %s입니다\n", address);
		
		
		// 4) 마무리
		
		sc.close();
		
	}

}

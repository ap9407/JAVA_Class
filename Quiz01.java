package day05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 사용자에게 userid, userpw를 입력받고,
		// ID/PW 모두 일치하면 [로그인성공]
		// ID는 일치하지만 PW가 일치하지 않으면 [비밀번호 오류]
		// ID가 일치하지 않으면 [계정을 찾을수없습니다.] 라고 출력하세요

		String id = "itbank";
		String pw = "it";

		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		userid = sc.nextLine();
		System.out.print("PW : ");
		userpw = sc.next();

		if (id.equals(userid)) {
			if (pw.equals(userpw))
				System.out.print("로그인 성공");
			else
				System.out.print("로그인 실패");
		} else {
			System.out.print("계정을 찾을 수 없습니다.");	
		}
		sc.close();
	}

}

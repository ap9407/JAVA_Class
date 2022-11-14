package day01;

public class Quiz01 {
	public static void main(String[] args) {

		long bank = 0, money = 10, day = 1;
		
		while (day<=30) {
			bank += money;
			System.out.printf("%d일차 : %,d\n", day, bank);
			money*= 2;
			day++;
		}
		System.out.printf("총액: %,d원\n", bank);
		 
		
		// 첫날에 은행에 돈을 10원 준비하여 입금한다.
		// 둘째날에는 이전날의 두배인 20원을 준비하여 입금한다.
		// 셋째날에는 이전날의 두배인 40원을 준비하여 입금한다.
		// 이런 식으로 30일동안 은행에 돈을 입금하면
		// 30일 이후 은행계좌에 입금된 금액의 총액은 얼마인가?
		// (단, 은행계좌에는 처음에 돈이 없었던 것으로 가정한다)
	}

}
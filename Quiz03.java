package day01;

public class Quiz03 {
	public static void main(String[]args) {
	
	int i = 0, sum = 0;
	
		for(i = 0; i < 1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("총합은"+sum+"입니다");
	}
}

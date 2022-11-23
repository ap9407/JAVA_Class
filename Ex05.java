package sort;

public class Ex05 {
	static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 배열 각 요소를 비교하여 정렬하기 위해 먼저 출력해보기

		int[] arr = { 2, 7, 8, 4, 6 }; 

		showArray(arr);

		// 정렬
		for (int i = 0; i < arr.length - 1; i++) { // 0, 1, 2, 3 
//		마지막 숫자는 비교할 대상이 없기때문에 뺀다!
			for (int j = i + 1; j < arr.length; j++) { 	// (i + 1) ~ 4 
// 			처음대상이 0번째이면 비교할 대상은 1번째 이어야 하기때문에 i + 1 을 해준다.
				
				System.out.printf("%d > %d : %b\n", arr[i], arr[j], arr[i] > arr[j]);
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println("\t교환 !!");
				}
			}
		}
		// 두 수를 비교하기 위해 비교 기준을 i로 정하고, 비교 대상을 j로 정하여
		// 기준과 대상의 크기에 따라 두 변수의 값을 교환하면서
		// 정렬을 수행하는 방식을 선택 정렬이라고 한다
		// (n 번째 칸에 맞는 가장 작은 값을 선택하여 위치시킨다)
		
		showArray(arr);
	}
}

//2 7 8 4 6
//2 4 8 7 6
//2 4 6 8 7
//2 4 6 7 8
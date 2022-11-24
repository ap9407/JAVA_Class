package array;

public class Quiz01 {

	static void guide(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int length = 5;
		int[][] arr = new int[length][length];
		int num = 0;
		int x, y;

		for (int i = 0; i < length; i++) {
			arr[0][i] = ++num;
		}

		length--;

		for (int i = 0; i < length; i++) {
			arr[i + 1][4] = ++num;
		}

		for (int i = 0; i < length; i++) {
			arr[4][3 - i] = ++num;
		}

		length--;
		for (int i = 0; i < length; i++) {
			arr[3 - i][0] = ++num;
		}
		
		for (int i = 0; i < length; i++) {
			arr[1][i + 1] = ++num;
		}
		
		length--;
		
		for (int i = 0; i < length; i++) {
			arr[i + 2][3] = ++num;
		}
		
		for (int i = 0; i < length; i++) {
			arr[3][2 - i] = ++num;
		}
		
		length--;
		
		for (int i = 0; i < length; i++) {
			arr[2][1] = ++num;
		}
		
		for (int i = 0; i < length; i++) {
			arr[2][2] = ++num;
		}

//		arr[0][0] = ++num;
//		arr[0][1] = ++num;
//		arr[0][2] = ++num;
//		arr[0][3] = ++num;
//		arr[0][4] = ++num;

//		arr[4][3] = ++num;
//		arr[4][2] = ++num;
//		arr[4][1] = ++num;
//		arr[4][0] = ++num;

//		arr[3][0] = ++num;
//		arr[2][0] = ++num;
//		arr[1][0] = ++num;

//		arr[1][1] = ++num;
//		arr[1][2] = ++num;
//		arr[1][3] = ++num;

//		arr[2][3] = ++num;
//		arr[3][3] = ++num;

//		arr[3][2] = ++num;
//		arr[3][1] = ++num;

//		arr[2][1] = ++num;

//		arr[2][2] = ++num;
		show(arr);

	}
}

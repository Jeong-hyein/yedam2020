
public class Array2Example {
	public static void main(String[] args) {
		int[] intAry = new int[5];

//		for (int i = 0; i < 5; i++) {
//			intAry[i] = i * 10 + 10;
//			System.out.println(intAry[i]);
//		}
//
//		System.out.println("배열의 범위내에서 값을 실행.");
//		for (int i = 0; i <= 5; i++) { // 배열범위를 벗어난 오류
//			System.out.println(intAry[i]);
//		}
//		//
		int[] intAry2 = new int[100];
		for (int i = 0; i < 100; i++) {
			intAry2[i] = (i + 1) * 5;
			System.out.print(intAry2[i] + " ");
			if (i % 5 == 4) {
				System.out.println();
			}

		}
		System.out.println("======================");
//		int i = 0;
//		while (i < 100) {
//			intAry2[i] = (i + 1) * 5;
//			System.out.print(intAry2[i] + " ");
//			if (i % 5 == 4) {
//				System.out.println();
//			}
//			i++;
//
//		}
		int i = 0;
		while (i < 100) {
			intAry2[i] = (i + 1) * 5;
			System.out.printf("%4d",intAry2[i]); //프린트 포맷지정
			if (i % 5 == 4) {
				System.out.println();
			}
			i++;

		}

	}// main
}

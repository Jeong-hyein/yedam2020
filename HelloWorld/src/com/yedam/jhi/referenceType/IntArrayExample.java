package com.yedam.jhi.referenceType;

public class IntArrayExample {
	public static void main(String[] args) {
		// 3행, 4열 [3][4]
		int[][] intAry = { { 2, 3, 4, 5 }, // 첫번째 배열
				   			{ 1, 2, 4 },
				   			{ 5, 8 } // -> 크기가 달라서 n*n으로 표현못함
							};
		// 배열이 3개가 들어가있음 -> intAry.length는 3
		System.out.println("intAry 크기: " + intAry.length);
		// intAry[0] = {2,3,4,5}-> intAry.length는 4
		System.out.println("intAry[0] 크기: " + intAry[0].length);
		System.out.println("intAry[1] 크기: " + intAry[1].length);
		System.out.println("intAry[2] 크기: " + intAry[2].length);

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.print(intAry[i][j]+ " ");

			} System.out.println();
		}

	}// main
}

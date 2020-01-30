package classes;

public class SortForExample {
	public static void main(String[] args) {
		int[] sortAry = { 15, 13, 20, 25, 7, 17 };

//		정렬전 출력
		System.out.println("정렬전");
		for (int i = 0; i < sortAry.length; i++) {
			System.out.print(sortAry[i] + " ");
		}
		System.out.println();

//		내림차순 정렬작업
		for (int i = 0; i < sortAry.length - 1; i++) {
			for (int j = 0; j < sortAry.length - 1; j++) {
				if (sortAry[j] > sortAry[j + 1]) {
					int temp = sortAry[j];
					sortAry[j] = sortAry[j + 1];
					sortAry[j + 1] = temp;

				}

			}

		}

//		내림차순 출력
		System.out.println("내림차순");
		for (int i = 0; i < sortAry.length; i++) {
			System.out.print(+sortAry[i] + " ");
		}
		System.out.println();

//		오름차순 정렬작업
		for (int i = 0; i < sortAry.length - 1; i++) {
			for (int j = 0; j < sortAry.length - 1; j++) {
				if (sortAry[j] < sortAry[j + 1]) {
					int temp = sortAry[j];
					sortAry[j] = sortAry[j + 1];
					sortAry[j + 1] = temp;

				}

			}

		}

//		오름차순 출력
		System.out.println("오름차순");
		for (int i = 0; i < sortAry.length; i++) {
			System.out.print(+sortAry[i] + " ");
		}

	}
}

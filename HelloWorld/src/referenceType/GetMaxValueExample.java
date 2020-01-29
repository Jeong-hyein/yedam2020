package referenceType;

public class GetMaxValueExample {
	public static void main(String[] args) {
		int[] intAry = { 8, 7, 10, 5, 9 };
		int max = 0;
//		for (int i = 0; i < 5; i++) {
//			if (max - intAry[i] > 0) {
//				max = max;
//			} else {
//				max = intAry[i];
//			}
//		System.out.println(max);
//		}
//		System.out.println("최대값은: " + max);

		for (int i = 0; i < intAry.length; i++) {
			if (max < intAry[i]) {
				max = intAry[i];
			}
		}
		System.out.println("최대값은: " + max);

		
		
		int[] intAry2 = { 10, 3, 80, 12, 9 };
		System.out.println("최대값은: " + getMaxValue(intAry2));

		
		
		int min = Integer.MIN_VALUE; // int가 가질수있는 최소값
//		int min = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (min > intAry[i]) {
				min = intAry[i];
			}
//		System.out.println(max);
		}
		System.out.println("최소값은: " + min);
	}// main

	public static int getMaxValue(int[] ary) {
		int max = 0;
		for (int i = 0; i < ary.length; i++) {
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		return max;
	}
}

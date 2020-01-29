package referenceType;

public class ArrayMethodExample {
	public static void main(String[] args) {
		int[] intAry = { 3, 7, 5, 8, 4 };
		System.out.println("배열의 크기: " + intAry.length);
		int sum = 0;
//		for (int i = 0; i < intAry.length; i++) {
//			sum = intAry[i] + sum;
//		}
		sum = sumArrayMethod(intAry);
		System.out.println("합은: " + sum);

		int[] intAry2 = { 13, 7, 25, 18, 4 };
		int sum2 = sumArrayMethod(intAry2);
//		for (int i = 0; i < 5; i++) {
//			sum = intAry2[i] + sum;
//		}
		System.out.println("합은: " + sum2);

		int[] intAry3 = { 33, 73, 35, 8, 4 };
		int sum3 = sumArrayMethod(intAry3);
	
//		for (int i = 0; i < 5; i++) {
//			sum = intAry3[i] + sum;
//			System.out.println(sum);
//	}
	System.out.println("합은: "+sum3);

}
// main
//	배열의 요소의 합을 계산하는 method, int타입을 리턴하겠다.

	public static int sumArrayMethod(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}

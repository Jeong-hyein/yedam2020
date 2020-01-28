
public class ForArrayExample {
	public static void main(String[] args) {
//		1) 배열크기가 100인 배열 intAry
//		(1~100 값을 담아주세요)
		int[] intAry = new int[100]; // 0의 값으로 초기화한다.
		for (int i = 0; i < 100; i++) {
			intAry[i] = i + 1;
		}

//		2) 배열의 홀수번째 위치에 있는 값을 합하는 for구문
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				sum = sum + intAry[i];
			}
		}
		System.out.println("sum의 합은: " + sum);
		System.out.println("=====================");
//		3) 홀수 값을 합하는 for 구문
		sum = 0;
		for (int i = 0; i < 100; i++) {
			if (intAry[i] % 2 == 1) {
				sum += intAry[i];
			}

		}
		System.out.println("홀수값 합은:" + sum);
	}// main
}

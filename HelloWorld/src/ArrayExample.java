
public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 2, 3, 4, 5 }; // 정수배열타입
//		int intArray[] = { 1, 2, 3 };
//		위 두 방식 다 사용가능하지만 첫번째 방식을 사용하자. 
		int[] int2Ary = new int[5];
		int2Ary[0] = 1;
		int2Ary[4] = 10;
//		int2Ary[5] = 10;  배열범위를 벗어난 에러
//		int[] int3Ary = null; 
//		int3Ary = new int[] {1,2,3}; 헷갈리니깐 두개는 안씀
		
		
		System.out.println(intAry[0]); // 첫번째 위치의 값을 보여줌
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println("================");
//		값을 변경할수도 있다.
		intAry[0] = 20; // 정수타입 -> 차이는 []의 차이
		intAry[1] = 30;
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);

		// intAry에 10,20,30,40의 값을 할당(대임)
		for (int i = 0; i < 4; i++) {
			intAry[i] = i * 10 + 10;
			System.out.println(intAry[i]);
		}

		System.out.println("-----------------");
		for (int i = 0; i < 4; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("++++++++++++++++++");
//		sum에 intAry값을 계속 더하는거
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			//인덱스 값으로 변환하는 변수: intAry[i],인덱스란 intAry[0],intAry[1]같은거
			sum = sum + intAry[i];
//			sum += intAry[i] 위의 식과 같음
//			sum = sum * intAry[i] 랑 sum *= intAry[i]라 같다.
		} System.out.println("sum값은: " + sum);

	}// main
}

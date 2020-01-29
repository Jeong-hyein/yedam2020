package referenceType;

public class CalculatorExample {
	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		sum(num1, num2);
//		minus(num1, num2);
//		multi(num1, num2);
//		divide(7, 3);
//		sum(30, 20);
//		print(5, "&&&"); // 매개변수에 들어가는 값은 매개값
		printStar(7, "+");
		sum(1,2);
		int r = sum2(1,3); //결과값을 r에 담겠다.
		System.out.println("r의 값은: " + r);
		
//		String ret = welcome("박규림");
//		System.out.println(ret);
		System.out.println(welcome("박규림"));
		
		
	}// main
		
//void:비어있다, 반환값이 없다. return 못쓴다.
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("두수의 합은: " + result);
	}

	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println("두수의 차이는: " + result);
	}

	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println("두수의 곱은: " + result);
	}

	public static void divide(int x, int y) {
		double result = (double) x / y;
		System.out.println("나눈 결과는: " + result);
	}
	// a: 매개변수, 메소드 안에서만 의미가 있다.
	public static void print(int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}

	public static void printStar(int a, String str) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str);
			}
			System.out.println();

		}
	}
	//반환값이 int : static int라고 적어준거
	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result; //메소드를 쓴 변수에 값을 담는다: return
	}
	
	public static String welcome(String name) {
		return "Hello " + name;
	}
	
	
	
	
	
}// class

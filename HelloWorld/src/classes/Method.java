package classes;

public class Method {
//	public static void main(String[] args) {
//		sum1(1,2);
//		sum(1,2); //-> 리턴값을 반환한다. 그걸 받는 인수가 필요
//		System.out.println(sum(1,2)); // -> 혹은 바로 출력
//		int i = sum(1,2);
//		System.out.println(i);
	
//	public void sum1(int a, int b) {
//		System.out.println(a + b);
//	}

//		
//		int num1 = 10, num2 = 15;
//		int sum = sum(num1,num2);
//		int result = sum(num1,num2) * minus(num1,num2);
//		System.out.println("결과값은: " + result);

//		메소드를 쓰기위해 필드를 정의한다.
	int leftField;
	int rightField;

	public int getLeftField() {
		return leftField;
	}
//	필드 leftField에 값을 넣는 메소드
	public void setLeftField(int leftField) {
		this.leftField = leftField;
	}

	public int getRightField() {
		return rightField;
	}

	public void setRightField(int rightField) {
		this.rightField = rightField;
	}

	// }//main
//	필드값을 계산
	public int thisSum() {
		return leftField + rightField;
	}

	public int thisMinus() {
		return leftField - rightField;
	}

//	메소드
//	매개값을 받아서 처리함

	public int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public int minus(int a, int b) {
		return a - b;
	}

}// class

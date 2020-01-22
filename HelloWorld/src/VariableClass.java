/* 1. variableclass 클래스 선언 (main)
 * class이름 첫글자 대문자 시작, 두번째 단어 첫글자도 대문자
 * 2. int sum, num1,num2,num3
 * 3. num1-> 100, num2-> 90, num3-> 80
 * 4. sum -> num1, num2, num3 할당
 * 5. sum의 값을 콘솔 화면에 출력.*/
public class VariableClass {
	public static void main(String[] args) {
		int sum, num1, num2, num3;
		num1 = 100;
		num2 = 90;
		num3 = 80;
		sum = num1 + num2 + num3;
		System.out.println(sum);
	}
}

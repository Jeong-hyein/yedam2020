
public class HelloWorld {
	/*
	 * 주석을 여러 주로 쓸수있다.
	 */
	public static void main(String[] args) {
		// Hello World ����ϴ� ����, ctrl+/:문장 제일 앞에 주석달기
		// ctrl+shift+f: 줄맞춤,ctrl+ 스페이스바:자동완성
		int age = 26; // age�� ���� 10�� ��ڴ� , = : ������ ���� ���ʿ� �ְڴ�
		int year = 2020;
		// Sysout에서 ctrl+스페이스바 -> System.out.println로 만들어줌
		// + : 오라클 concat역할, 두 문장을 연결
		// 실행: ctrl+f11
		System.out.println("Hello, World!");
		System.out.println("올해는" + year);
		System.out.println(year);
		System.out.println(year + age); // ���������� ���ϱ⸦ ��
		System.out.println("내 나이는" + age);
		System.out.println("올해는  " + year + "년");
		System.out.println("내 나이는  " + age + "살");
//		1월21일
//		int 변수 타입, 170.03을 쓰면 빨간줄 -> 값을 바꾸던가 int를 바꾸라함
		int height = 170;
		int weight = 65;
//		변수는 한번 선언 가능(중요)
//		short year = 2020; -> 에러가 나옴
//		초기화: 제일 먼저 값을 입력하는 것
//		값을 변경
		year = 2021;
		System.out.println(year);
//		대문자는 클래스명 항상 대문자 시작 밖에 없어.
//		변수선언규칙: 처음 소문자 다음 문자들의 첫글자는 대문자
//		에러안남. 두개 다른이름.
		int firstDayOfYear = 1;
		int firstdayofyear = 1;
//		long형임을 알려줘야함 숫자뒤 L
//		long height = 17000000000L;
//		int가 표현가능한 수를 알려줌
		System.out.println("int 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 최대값: " + Integer.MAX_VALUE);
		// int sum = 0;
		int firstValue = 2000000000;
		int secondValue = 1000000000;
//		연산을 큰 타입에 맞춰서 연산
//		int타입끼리 연산하면 연산을 int타입에 맞춰서 한더.
		// sum = firstValue + secondValue;
//		-1294967296나옴, int가 표현할수있는 값을 넘음
		long sum = 0;
		sum = (long) firstValue + secondValue;
		System.out.println("두수의 합은: " + sum);

		int num1, num2, num3;
//		초기화가 안되있어서 불가.
		// int summary = num1 + num2;
		num1 = 10;
		num2 = 20;
//		summary도 초기화를 해줘야하지만 변수 합으로 해도 된다.
		int summary = num1 + num2;
		System.out.println(summary);

	}
}

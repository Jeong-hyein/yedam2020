package classes;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
//		int a =10, b = 20;
//		int result = sum(a,b);
//		result = multi(a,b); //minus(a,b); divide(a,b);
//		
//		cal(10,20,"/");

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print("사칙연산 부호: +,-,*,/ q:종료 ");

			String operator = scn.nextLine();
			if (operator.equals("q")) {
				break;
			}

			System.out.println("첫번째 수 입력: ");
			int num1 = scn.nextInt();
			System.out.println("두번째 수 입력: ");
			int num2 = scn.nextInt();
			scn.nextLine();
			cal(num1, num2, operator);
		}
		System.out.println("종료.");
	}

	public static void cal(int a, int b, String oper) {
		double result = 0;
		if (oper.equals("+"))
			result = sum(a, b);
		else if (oper.equals("*"))
			result = multi(a, b);
		else if (oper.equals("-"))
			result = minus(a, b);
		else if (oper.equals("/"))
			result = divide(a, b);
		System.out.println("결과값은 " + result);
	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}

}

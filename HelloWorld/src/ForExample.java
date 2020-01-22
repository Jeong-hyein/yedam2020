/*
 * */
public class ForExample {
	public static void main(String[] args) {
		for (int i = 0; i < 26; i++) {
			char chr1;
			chr1 = (char) (65 + i);
			System.out.println(chr1);
		}

		/*
		 * 교수님 char chr = 65; for (int i = 0; i < 26; i++) { System.out.println(chr);
		 * chr = (char) (chr + 1);}
		 * 
		 * for(int i = 0; i < 26; i++){ System.out.println(chr++);}
		 * 
		 * B부터 나오게 하려면(위에서부터 순서대로 실행하기때문) chr = (char) (chr +1); System.out.println(chr
		 * + 1);
		 */
//		==의 반대 !=	
		boolean trueOrFalse = false;
		if (!trueOrFalse) {
			System.out.println("참입니다.");
		}
//for구문 안쓰면
		/*
		 * int sum = 0; sum = sum + 1; sum = sum + 2; sum = sum + 3; sum = sum + 4; sum
		 * = sum + 5; System.out.println("1~5까지 합: " + sum);
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합: " + sum);

		sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println("1~5까지의 합: " + sum);

//		for문 안의 if문
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("sum: " + sum + " i: " + i);
			}
		}
		System.out.println("1~100까지 짝수의 합: " + sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("sum: " + sum + ", i: " + i);
			}
		}
		System.out.println("1~10까지 짝수의 합: " + sum);

//		if뒤에 중괄호가 없으면 sum = sum + i만 반복, sys는 for문꺼
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				sum = sum + i;
			System.out.println("sum: " + sum + ", i: " + i);
		}
		
		int var1 = 5;
		for (int i = 1; i <= 9; i++) {
			System.out.println(var1+ "*" +i +"= " + (var1*i));
		}
		

	}// main
}// class

//p134
public class Exercise04 {

	public static void main(String[] args) {
		int num1, num2;
		while (true) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1+ ","+ num2 + ")"); // -> 5가 되는 애를 출력하고 빠져나옴
//			빠져나오는 조건
			if (num1 + num2 == 5) {
				break;
			}
//			System.out.println("(" + num1 + "," + num2 + ")"); -> 더해서 5가 되는애는 출력안됨

		}

	}// main

}

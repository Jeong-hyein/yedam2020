//구구단.
public class ForAndForExample {
	public static void main(String[] args) {
//		i=1일때 j는 1부터 9까지 반복, i=2일때 j는 1부터 9까지 반복
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*"+ j + " = " + (i*j));
			}
		}
//		구구단 옆으로 나열해서 출력하는거
//		ln: 엔터 프린트, print: 옆으로 쭉 나옴
//		System.out.println(); : 줄바꾸기
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*"+ i + " = " + (j*i) + "    ");
			} System.out.println();
		}

		
		
	}// main
}

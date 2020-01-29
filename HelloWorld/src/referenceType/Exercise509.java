package referenceType;

import java.util.Scanner;

public class Exercise509 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				studentNum = scanner.nextInt();
				System.out.println("학생수> " + studentNum);
				scores = new int[studentNum];
//			studentNum 대신 scores.length적어도됨
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) { 
					System.out.println("scores[" + i + "]:");
					int score = scanner.nextInt();
					scores[i] = scanner.nextInt();
//					System.out.println(scores[i]);
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[ " + i + "]: " + scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
//				int cnt = 0;
				double avg = 0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
//					cnt++;
					avg = (double) sum / studentNum;
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
//				System.out.println("평균 점수: " + (double) sum / studentNum);
			} else if (selectNo == 5) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");

	}

}// main 
//https://github.com/changhoLee12345/yedam2020/HelloWorld/src/referenceType/Exercise09
//구글에 이것이 자바다 5장 확인문제로 보기

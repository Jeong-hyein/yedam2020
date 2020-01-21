
public class HelloWorld {
	/*
	 * 여러 라인을 주석처리할 때 사용합니다.
	 * 작성자: 정혜인
	 */
  public static void main(String[] args) {
		// Hello World 출력하는 구문, ctrl+/:맨 앞에 주석이 생김
	    // ctrl+shift+f:줄맞춤,ctrl+스페이스바:자동완성
	    int age = 26; //age에 정수 10을 담겠다 , = : 오른쪽 값을 왼쪽에 넣겠다
	    int year = 2020;
	    //Sysout하고 컨트롤 스페이스바하면 System.out.println나옴
	    // + : 오라클의 concat기능, 두문장을 붙임
	    // 실행: ctrl+f11
		System.out.println("Hello, World!");
		System.out.println("올해는" + year);
		System.out.println(year);
		System.out.println(year + age); //정수끼리라서 더하기를 함
		System.out.println("나이는" + age);
		System.out.println("올해는 " + year+"년");
		System.out.println("내 나이는 " + age+ "입니다" );

	  }
}

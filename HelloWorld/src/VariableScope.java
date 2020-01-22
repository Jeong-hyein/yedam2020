//실행순서는 위에서부터 순서대로! {}는 순서에 영향주지X
public class VariableScope {
	public static void main(String[] args) {
		int sum, var1;
		
		if(true) { //false로 바꾸면 {}안에를 실행 안한다.
			int var2;
			var1 = 10;
			var2 = 20;
			sum = var1 + var2;
			System.out.println("두수의 합은: " + sum);
			var2 = 50;
			sum = var1 + var2;
			System.out.println("두수의 합은: " + sum); //var2에 50을 넣은거를 해서 sum계산
		}
//		var1은 main블럭 안에서 선어
		System.out.println(var1);
//		System.out.println(var2); var2는 if블럭 안에서 선언
		System.out.println(sum);
//		sum = 50; //다시 sum에 50을 넣고 다시 프린트
		System.out.println(sum);
		
		for(int i = 0; i < 5; i++ ) {
			var1 = var1 + 1;
			int var2 = 10; //위에 선언했지만 error안남 -> if절에 선언했기때문에
			System.out.println("var1: " + var1 + ", var2: " + var2);
			
		}
		//var2는 for문 안에 있기때문에 프린트 안됨.
		//System.out.println("var1: " + var1 + ", var2: " + var2);
		
	}
}

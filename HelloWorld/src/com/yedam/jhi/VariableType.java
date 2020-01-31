package com.yedam.jhi;

public class VariableType {
	public static void main(String[] args) {
		byte var1, var2;
//		byte sum;
		int sum;
		var1 = 55;
		var2 = 33;
		sum = var1 + var2; //+연산은 기본이 int, 정수연산 
//		var1+var2는 정수, sum은 byte라서 못넣음
//		sum을 int로 바꿔주면 error없어짐
		
	    char chr1 = 65; //문자를 담는건데 정수연산 가능
//	    A가 나옴 -> A~Z를 숫자로 가지고있음, 66은 B
//	    i++ , i를 1씩 더한다.
	    for ( int i = 0; i < 10; i++) {
	    	chr1 = (char) (chr1 +1);
	    	System.out.println(chr1); 
	    //(char): 강제 타입 변환, chr1이 char이기 때문에 char을 써
	    }
	    
	
	}

}

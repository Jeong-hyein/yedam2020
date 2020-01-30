package classes;

public class MethodExample {
	public static void main(String[] args) {
		Method m = new Method(); //m->leftField, rightField
		m.setLeftField(30); //m.leftField => 30
		m.setRightField(4); //m.rightField => 4
		int result = m.thisSum() //30+4
				+ m.thisMinus(); //30-4 // -> 매개값없다. 
		int result2 = m.sum(20, 10) * m.minus(30, 25); // -> 필드랑 상관없고 매개값을 받는거
		System.out.println("필드의 계산결과: " + result);
		System.out.println("두매개값의 계산결과: " + result2);
		result = m.thisSum() + m.thisMinus();
		result2 = m.sum(20,10) * m.minus(30, 25);
		m.setLeftField(100); //m.leftField => 100
		m.setRightField(50); //m.rightField => 50
		System.out.println(m.getLeftField());
		System.out.println("2필드의 계산결과: " + result);
		System.out.println(result2);
	}
}



package quiz05;

public class ComputerMain {

	/* 요구사항
	 * Calculator를 부모클래스로 선언하세요.
	 * Calculator를 상속받는 Computer클래스 생성 합니다.
	 * 
	 * Calculator의 멤버변수 result, pi를 선언하세요
	 * Calculator의 메서드
	 * multi(int) : int - result에 값을 곱하기 기능 
	 * div(int) :int - result에 값을 나누는 기능
	 * circle(int): dobule - pi를 이용해서 원의 넓이를 구하는 기능
	 * ------------------------------------------------------------------
	 * Computer 클래스의 메서드
	 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
	 * rect(double): double - 정사각형의 넓이 를 리턴
	 * rect(double, double) : double - 직사각형의 넓이 를 리턴
	 * rect(double, double, double) : double - 직육면체의 넓이 를 리턴
	 * 
	 * 
	 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
	 */

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		
		System.out.println(cal.multi(5));
		
		int div = cal.div(2);
		System.out.println(div);
		
		double o = cal.circle(5);
		System.out.println(o);
		
		System.out.println("----------------------");
		
		Computer com = new Computer();
		
		System.out.println(com.circle(5));
		
		double sq = com.rect(5);
		System.out.println(sq);

		double rec = com.rect(3, 4);
		System.out.println(rec);
		
		double cu = com.rect(4, 3, 5);
		System.out.println(cu);
		
		
		
		
		
		
	}
}

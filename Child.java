package overriding.basic;

public class Child extends Parent {

	// 메서드 오버라이딩 - 부모한테 물려받은 메서드를 동일한 형태로 재정의 하는 것(내용물을 바꿔서 사용하는 것)
	// 방법 - 똑같이 만들고 내용을 수정
	int method2() {
		System.out.println("자식의 재정의된 2번 메서드 실행");
		
		return 1;
	}
	
	void method3() {
		System.out.println("자식의 3번 메서드 실행");
	}
}

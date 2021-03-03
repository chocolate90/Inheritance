package quiz03;

public class MainClass_Game {

	public static void main(String[] args) {
		
		// Player 클래스를 부모 클래스로 생성 (공통 기능을 갖도록 처리)
		// 전사, 마법사는 Player를 상속받고
		// 각각의 생성자도 만든다.
		// 전사와 마법사의 객체 생성.
		
		Warrior war = new Warrior("전사", 300, 100, 30, 20);
		
		war.info();
		war.bash();
		
		System.out.println("------------------------");
		
		Wizard wiz = new Wizard("마법사", 200, 150, 40, 10);
		
		wiz.info();
		wiz.arrow();
	}
}

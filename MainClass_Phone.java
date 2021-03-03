package quiz04;

public class MainClass_Phone {

	public static void main(String[] args) {
		
		//Dmb폰 객체 생성
		DmbPhone dp = new DmbPhone("햅틱", "메탈그레이", 10);

		System.out.println("모델:" + dp.model + ", 색상:" + dp.color + ", 체널:" + dp.channel);
		
		System.out.println("-------------------------");
		//Phone클래스에서 상속받은 멤버 변수에 접근

		
		dp.model = "연아의햅틱";
		dp.color = "화이트";

		System.out.println("모델:" + dp.model + ", 색상:" + dp.color);
		
		System.out.println("--------------------------");
		//Phone에서 상속받은 메서드 호출

		dp.powerOn();
		dp.ring();
		dp.sendVoice("안녕");
		dp.recieveVoice("그래 안녕");
		dp.hangUp();
		dp.powerOff();

		System.out.println("--------------------------");
		//DmbPhone에서 선언한 메서드 호출
		dp.turnOnDmb(); //기능: TV를 켭니다 출력
		dp.changeChannel(7); //기능: channel변수를 전달받은 변수로 변경후 출력
		dp.turnOffDmb(); //기능: TV를 끕니다 출력
		dp.powerOff();


	}

}

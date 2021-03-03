package quiz03;

public class Warrior extends Player {

	Warrior(String i, int h, int m, int a, int ar) {
		
		id = i;
		hp = h;
		mp = m;
		attack = a;
		armor = ar;
	}
	
	// 전사의 고유한 skill
	void bash() {
		System.out.println("스킬사용");
	}
	
}

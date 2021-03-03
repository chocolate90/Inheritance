package quiz03;

public class Wizard extends Player {

	Wizard(String i, int h, int m, int a, int ar) {

		id = i;
		hp = h;
		mp = m;
		attack = a;
		armor = ar;
	}

	void arrow() {
		System.out.println("마법사 전용스킬");
	}


}

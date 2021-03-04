package overloading.basic;

public class BasicMain {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(1);
		b.input("가");
		b.input(1.1, 2);
		b.input(3, 3.14);
		int i = b.input(7, 4);
		System.out.println(i);
//		System.out.println(b.input(7, 4));
		b.input('A', 3, 6.9);
	}
}

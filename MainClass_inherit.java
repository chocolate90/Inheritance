package inherit.good;

public class MainClass_inherit {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.studentId = "123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "임재범";
		t.age = 40;
		t.subject = "음악";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name = "고길동";
		e.age = 50;
		e.department = "IT";
		System.out.println(e.info());
		
	}
}

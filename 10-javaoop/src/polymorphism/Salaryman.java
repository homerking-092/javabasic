package polymorphism;

public class Salaryman extends Person {
	private int salary;

	// super()를 이용해 초기화하는 생성자를 만드세연
	public Salaryman(String name, int age, int salary) {
		// 부모쪽의 생성자에게 넘겨주기 위해
		// 생성자 내부에서 super()를 사용한다
		// 자식쪽 생성자에서 super(전달자료1, 전달자료2...);
		// 를 사용하면 부모 생성자에게 전달된다
		super(name, age);
		this.salary = salary;
	}
	
	//상속받은 showPerson을 활용한 showSalaryman를 작성
	public void showSalaryman() {
		showPerson();
		System.out.println("월급: " + salary);
		System.out.println("-------------------");
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.printf("월급: %d만원\n", salary);
	}
}

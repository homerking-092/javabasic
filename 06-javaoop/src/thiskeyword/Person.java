package thiskeyword;

public class Person {
	//사람의 정보를 기입
	public String name;
	public int age;
	public int money;
	public String major;
	
	//생성자를 활용합니다
	public Person(String name, int age, int money, String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	
	//getInfo()를 이용해 조회
	public void getInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("소지금액: " + money);
		System.out.println("전공: " + major);
	}
}

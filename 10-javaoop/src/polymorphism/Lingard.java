package polymorphism;

public class Lingard extends Person {
	private int height;
	private String address;
	
	public Lingard(String name, int age, String address, int height) {
		super(name, age);
		this.address = address;		//이름, 나이를 가져오고
		this.height = height;		//주소, 키 추가
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.printf("키: %dcm\n", height);
		System.out.printf("소속팀: %s\n", address);
	}
}

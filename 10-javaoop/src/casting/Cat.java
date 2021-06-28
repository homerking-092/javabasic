package casting;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	
	//cat 행동에 해당하는 메서드를 추가
	public void cry() {
		System.out.println("냥이가 웁니다");
	}

	//sit은 오버라이딩 ㄱㄱ
	public void sit() {
		System.out.println("냥이가 앉아 있습니다");
	}
}

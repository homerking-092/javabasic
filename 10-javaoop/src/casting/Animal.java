package casting;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//동물 행동을 하나 메서드로 ㄱㄱ
	public void sit() {
		System.out.println("앉습니다");
	}
}

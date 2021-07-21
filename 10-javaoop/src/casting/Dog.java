package casting;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void bark() {
		System.out.println("개가 짖습니다");
	}
	public void sit() {
		System.out.println("개가 앉아 있습니다");
	}
		
}

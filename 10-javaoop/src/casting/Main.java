package casting;

public class Main {
	public static void main(String[] args) {
		//Animal 타입은 어떤 자료형이건 받을 수 있다
		Animal d1 = new Dog("댕댕이", 10);
		Animal c1 = new Cat("야옹이", 9);
		Animal a1 = new Animal("동물", 8);
		d1.sit();
		c1.sit();
		a1.sit();
		
		//자식타입을 베이스로 만든 부모타입 변수는
		//자식타입으로 강제로 바꿀 수 있다
		Cat cat = (Cat) c1;
		
		//원래타입으로 돌려놓으면 원래타입만의 메서드도 호출이 가능하다
		cat.cry();
		
		Dog dog = (Dog) d1;
		dog.bark();
		
		//근본이 Animal인 경우는 다른 타입으로 변형이 안된다
		Cat cat2 = (Cat) a1;
		cat2.cry();
		

	}
}

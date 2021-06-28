package casting;

public class MainInstanceof {
	public static void main(String[] args) {
		Animal c1 = new Cat("야옹이", 3);
		//현재 Animal 타입은 c1의 근본자료형이 Cat인지 검사
		System.out.println(c1 instanceof Cat);
		//현재 Animal 타입은 c1의 근본자료형이 Dog인지 검사
		System.out.println(c1 instanceof Dog);
		//현재 Animal 타입은 c1의 근본자료형이 Animal인지 검사
		System.out.println(c1 instanceof Animal);
	}
}

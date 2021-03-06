package structure;

public class Structure1 {
	public static void main(String[] args) {
		//Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은
		//아래와 같이 new 자료형(); 문법으로 생성한다
		Person a = new Person();
		
		//a라는 구조체에 이름, 나이, 폰번호를 입력한다
		a.name = "손흥민";
		a.age = 30;
		a.pNum = "010-1234-5678";
		a.address = "런던";
		//입력된 자료를 하나하나 출력
		System.out.println("이름: " + a.name);
		System.out.println("나이: " + a.age);
		System.out.println("번호: " + a.pNum);
		System.out.println("거주지역: " + a.address);
		
		System.out.println();
		//또 다른 사람을 만들어보자
		Person god = new Person();
		god.name = "황가드";
		god.age = 29;
		god.pNum = "010-123-4567";
		god.address = "아오지";
		//입력된 자료를 출력
		System.out.println("이름: " + god.name);
		System.out.println("나이: " + god.age);
		System.out.println("번호: " + god.pNum);
		System.out.println("거주지역: " + god.address);
	}
}

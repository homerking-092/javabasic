package structure;

public class Structure2 {
	
	//Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		System.out.println("번호 : " + p.pNum);
		//address 추가
		System.out.println("거주지역 : " + p.address);
		System.out.println("------------------");
	}
	
	//getCatInfo메서드를 만들어 고양이 정보를 조회할 수 있도록 ㄱㄱ
	 public static void getCatInfo(Cat c) {
		 System.out.println("이름 : " + c.name);
		 System.out.println("나이 : " + c.age);
		 System.out.println("품종 : " + c.breed);
		 System.out.println("-------------");
	 }
	
	public static void main(String[] args) {
		//고양이 생성
		Cat navi = new Cat();
		navi.name = "나비";
		navi.age = 2;
		navi.breed = "짬타";
		
		//고양이 정보 조회
		getCatInfo(navi);		
		
		
		//사람 두 명을 만들어 보자
		Person a = new Person();
		a.name = "손흥민";
		a.age = 20;
		a.pNum = "010-123-4567";
		a.address = "마드리드";

		getInfo(a);		//흥민이 조회
		
		Person b = new Person();
		b.name = "소농민";
		b.age = 30;
		b.pNum = "010-1231-4567";
		b.address = "런던";

		getInfo(b);		//농민이 조회
		
		
	}
}

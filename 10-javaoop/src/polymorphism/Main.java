package polymorphism;

public class Main {
	public static void main(String[] args) {
		//부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능
		Person a1 = new Salaryman("김영훈", 20, 6000);
		Person s1 = new Student("손흥민", 30, 4);
		Person l = new Lingard("황가드", 29, "웨스트햄", 175);
		
		//단 메서드는 Person을 베이스로 하는 객체는
		//Person에 정의된 메서드만 호출 가능
		a1.showPerson();
//		a1.showStudent();
		System.out.println();
		s1.showPerson();
//		s1.showStudent();
		System.out.println();
		l.showPerson();
		
		
		
						
	}
	
}

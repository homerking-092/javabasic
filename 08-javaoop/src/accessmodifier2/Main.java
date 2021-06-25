package accessmodifier2;

public class Main {
	public static void main(String[] args) {
		//Parent를 상속받은 Child 내부의 자료 조회
		Child c = new Child();
		
		System.out.println(c.a);	//1.public 자료
		//2.protected 자료 -- 같은 패키지 가능/ 다른 패키지에서 상속 받으면 가능
		//현재 Main.java와 같은 패키지 내부에 Parent, Child가 존재하므로
		//protected 접근 가능
		System.out.println(c.b);
		
//		System.out.println(c.c);	//3.private 자료 -- 같은 클래스 아니면 상속도 X
		
		System.out.println(c.d);	//4.default 자료	
		
		int b = 1;
		System.out.println(b);
		
	}
}

package abstract1;

//추상 클래스.
//abstract 선언이 붙은 클래스는 new를 이용한
//직접적인 객체 생성이 불가능하다
///추상 클래스와 추상 메서드는 하나
///클래스 안에 추상 메서드가 하나 이상으로 선언되면
///그 클래스는 추상 클래스
public abstract class Parent {
	public int a;
	
	public Parent() {
		this.a = 5;
	}
	
	//추상 메서드, 아래와 같이 실행문 없이 작성한다
	public abstract void getA();
	
	//추상 메서드 내부의 일반 클래스는 그냥 평범하게 작성한다
	public void getInfo() {
		System.out.println("일반 메서드입니다");
	}
}

package thiskeyword;

public class Main {
	public static void main(String[] args) {
		//this가 적용된 Person 생성하기
		//생성시 Ctrl + Space를 누르면 입력할 요소가 출력됨
		Person p = new Person("김영훈", 30, 1000, "신소재");
		p.getInfo();
		
		//Person객체를 하나 더 임의로 ㄱㄱ
		Person sony = new Person("손흥민", 30, 10000, "컴공");
		sony.getInfo();
		
	}
}

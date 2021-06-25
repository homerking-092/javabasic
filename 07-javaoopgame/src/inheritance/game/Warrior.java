package inheritance.game;

//Commoner 상속을 받아라
public class Warrior extends Commoner {
	//Commoner 상속으로 체력, 마나, 레벨, 아이디 수치는
	//이미 변수를 기입되어 있음
	//전사 클래스는 평민과 달리 물리공격력 수치를 부여받게 ㄱㄱ
	public int pm;	//물공
	
	//getInfo() 함수를 이름 그대로 다시 재정의
	public void getInfo() {
		System.out.println("전사 전직!");
		System.out.println("아이디: " + id);
		System.out.println("스탯정보");
		System.out.println("레벨: " + lv + 
						  ", 체력: " + hp + ", 마나: " + mp + ", 물뎀: " + pm +
						  ", 물방: " + ps + ", 마방: " + as);
	}
	
	//Warrior의 물리데미지 수치까지 같이 콘솔에 찍어주도록 작성
	public void paUp() {
		value = 100;
		pm += value;
		System.out.println();
		System.out.println("현재 물뎀: " + pm  + "(" + "+" + value + ")");
		System.out.println("물뎀이" + value + "만큼 증가했습니다");
	}
	
	public void skil1() {
		value = 100;
		mp -= value;
		System.out.println();
		System.out.println("mp를 사용해서 skill1을 사용했습니다");
		System.out.println("현재 mp: " + mp + "(" + "-" + value + ")");
	}
}

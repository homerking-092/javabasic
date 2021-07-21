package inheritance.game;

public class Archer extends Commoner {
	public int rg;	//사거리
	
	public void getInfo() {
		System.out.println("궁수 전직!");
		System.out.println("아이디: " + id);
		System.out.println("스탯정보");
		System.out.printf("레벨: " + lv + 
						  ", 체력: " + hp + ", 마나: " + mp +
						  ", 사거리: " + rg + ", 물방: " + ps + ", 마방: " + as);
	}
	
	public void lgUp() {
		value = 100;
		rg += value;
		System.out.println();
		System.out.println("현재 사거리: " + rg+ "(" + "+" + value + ")");
		System.out.println("사거리가 " + value + "만큼 증가했습니다");
	}
}

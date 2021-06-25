package inheritance.game;

public class Magician extends Commoner {
	public int ma;	//마뎀
	
	public void getInfo() {
		System.out.println("마법사 전직!");
		System.out.println("아이디: " + id);
		System.out.println("스탯정보");
		System.out.printf("레벨: " + lv + 
						  ", 체력: " + hp + ", 마나: " + mp +
						  ", 마뎀: " + ma + ", 물방: " + ps + ", 마방: " + as);
		}
	public void maUp() {
		value = 100;
		ma += value;
		System.out.println();
		System.out.println("현재 마뎀: " + ma  + "(" + "+" + value + ")");
		System.out.println("마뎀이" + value + "만큼 증가했습니다");
	}
}

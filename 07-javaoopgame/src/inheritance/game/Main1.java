package inheritance.game;

public class Main1 {
	public static void main(String[] args) {
		//초보자계정 하나를 생성하고 확인 ㄱㄱ
		Commoner chqh = new Commoner();
		chqh.id = "김초보";
		chqh.lv = 1;
		chqh.hp = 100;
		chqh.mp = 100;
		chqh.as = 10;
		chqh.ps = 10;
		chqh.exp = 10;
		chqh.getInfo();
//		chqh.byAt();
		chqh.hunt();
		chqh.hunt();
		chqh.hunt();
		chqh.hunt();
	}
}

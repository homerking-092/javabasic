package inheritance.game;

public class Main3 {
	public static void main(String[] args) {
		Magician m = new Magician();
		Archer a = new Archer();
		m.hp = 500;
		m.id = "김법사";
		m.lv = 8;
		m.mp = 1000;
		m.ma = 1000;
		m.as = 100;
		m.ps = 50;
		m.getInfo();
		m.maUp();
		System.out.println("-------------------");
		a.hp = 700;
		a.id = "김궁수";
		a.lv = 10;
		a.mp = 700;
		a.rg = 1000;
		a.as = 70;
		a.ps = 70;
		a.getInfo();
		a.lgUp();
		
	}
}

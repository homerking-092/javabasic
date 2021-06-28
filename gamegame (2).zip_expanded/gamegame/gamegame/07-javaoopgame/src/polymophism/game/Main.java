package polymophism.game;

public class Main {
	public static void main(String[] args) {
		Warrior w = new Warrior("김전사",100 ,10);
		Monster m1 = new Baron("김바론", 10, 10, 10);
		Monster m2 = new Baron("바론2", 20, 20, 20);
		Monster m3 = new Baron("바론3", 30, 30, 30);
		w.huntMonster(m1);
		m1.showMonster();
		w.showInfo();
		w.doubleAttack(m1);
		w.doubleAttack(m1);
		w.showInfo();
		
		
		
	}
}

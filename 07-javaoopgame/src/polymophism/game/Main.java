package polymophism.game;

public class Main {
	public static void main(String[] args) {
		Warrior w = new Warrior("김전사", 100, 10);
		Monster b1 = new Baron("김바론", 20, 20);
		w.showInfo();
		w.huntMonster(b1);
		
		
		
		
		
	}
}

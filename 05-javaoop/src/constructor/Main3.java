package constructor;

public class Main3 {
	public static void main(String[] args) {
		BasketballPlayer player1 = new BasketballPlayer("์กฐ๋จ", 180, 200, true);
		player1.shoot();
		BasketballPlayer player2 = new BasketballPlayer("์ํ", 170, 100, false);
		player2.shoot();
		
		for (int i = 0; i < 10; i++) {
			player1.shoot();
		}

	}
}

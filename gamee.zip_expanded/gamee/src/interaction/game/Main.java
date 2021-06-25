package interaction.game;

public class Main {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("김전사");
		Dragon d1 = new Dragon("드래곤1");
		Dragon d2 = new Dragon("드래곤2");
		
		w1.wInfo();
		w1.huntDragon(d1);		
		w1.huntDragon(d1);		
		w1.wInfo();
		w1.huntDragon(d2);		
		w1.huntDragon(d2);
		w1.wInfo();
		
		
		
	}

}

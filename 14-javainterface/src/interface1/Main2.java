package interface1;

public class Main2 {
	public static void main(String[] args) {
		Vehicle bus = new Bus(5);
		Vehicle ura = new Uracan("italy", 21);
		bus.showStatus();
		ura.showStatus();
		ura.accel();
		ura.showStatus();
		ura.breakSpeed();
		
		
	}
}

package constructor;

public class Main2 {
	public static void main(String[] args) {
		Cigarette camel = new Cigarette("카멜", 1990, 4000, true);
		Cigarette ms = new Cigarette("마쎄", 1990, 4500, true);
		Cigarette m = new Cigarette("말레", 1980, 4500, false);
		Cigarette dh = new Cigarette("던힐", 1950, 4500, true);
		
		camel.getInfo();
	}//end main2
}//end class

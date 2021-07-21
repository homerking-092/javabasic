package buyandsell;

public class Main {
	public static void main(String[] args) {
		Buyer b = new Buyer(2000);
//		b.showBuyer();
//		b.buyMango(3);
//		b.showBuyer();
//		b.buyMango(2);
//		b.showBuyer();
		
		System.out.println("---------------");
		Seller s = new Seller(2);
		s.showSeller();
		s.sellMango(1);
		s.showSeller();
	}
}

package buyandsell;

public class Main {

	public static void main(String[] args) {
		Seller seller = new Seller(20);
		seller.sellMango(100);
		seller.showSeller();
		seller.sellMango(15);
		seller.showSeller();
		

	}

}

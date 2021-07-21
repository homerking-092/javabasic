package buyandsell;

public class Main2 {

	public static void main(String[] args) {
		// 상인 2개 만들기
		Seller seller1 = new Seller(10);
		ShinemuscatSeller seller2 = new ShinemuscatSeller(10);
		// 구매자 1개 만들기
		Buyer buyer = new Buyer(50000);
		// 구매자 정보 확인
		buyer.showBuyer();
		// 1번상인 정보 확인
		seller1.showSeller();
		// 2번상인 정보 확인
		seller2.showSeller();
		// 1번 상인에게 구매자가 망고 구매
		buyer.buyMango(seller1, 3);
		// 2번 상인에게 구매자가 샤인머스캣 구매
		buyer.buyShinemuscat(seller2, 3);
		// 구매자 정보 확인
		buyer.showBuyer();
		// 1번상인 정보 확인
		seller1.showSeller();
		// 2번상인 정보 확인
		seller2.showSeller();
	}

}

package buyandsell;

public class Main2 {
	public static void main(String[] args) {
		//상인 2개 만들기
		Seller s1 = new Seller(10);
		Seller s2 = new Seller(10);
		
		//구매자 1개
		Buyer b = new Buyer(5000);
		
		//구매자 정보확인
		b.showBuyer();
		
		//1번상인 정보 확인
		s1.showSeller();
		
		//2번상인 정보 확인
		s2.showSeller();
		
		//1번 상인에게 구매자가 망고 구매
		b.buyMango(s1, 3);
		
		//구매자 정보 확인
		b.showBuyer();
		
		//1번상인 정보 확인
		s1.showSeller();
		
		//2번상인 정보 확인
		s2.showSeller();
		
	}
}

package buyandsell;

public class OrangeBuyer {
	private int money;
	private int orange;
	
	public OrangeBuyer(int money) {
		this.orange = 0;
		this.money = money;
	}
	
	
	
	public void buyOrange(OrangeSeller oSeller, int orange) {
		if (orange * 200 > money) {
			System.out.println("잔돈 부족");
			return;
		}
		if (oSeller.getOrange() < orange) {
			System.out.println("재고 부족");
			return;
		}
		
		oSeller.sellOrange(orange);
		
		this.money = money - (orange * 2000);
		this.orange += orange;
	}
	
	public void showOBuyer() {
		System.out.println("현재 보유금: " + money);
		System.out.println("산 망고 갯수: " + orange);
		System.out.println();
	}
}

package buyandsell;

public class OrangeSeller {
	private int money;
	private int orange;

	public OrangeSeller(int orange) {
		this.orange = orange;
		this.money = 0;
	}
	
	public int getOrange() {
		return orange;
	}

	// 판매시 오렌지갯수를 입력할 수 있고
	// 오렌지갯수 * 2000만큼의 돈이 올라가고
	// 오렌지는 판 갯수만큼 차감된다
	// 0 미만으로 오렌지가 줄어들 수 없다
	public void sellOrange(int orange) {
		if (this.orange < orange) {
			System.out.println("오렌지 부족");
			return;
		}
		this.money += orange * 2000;
		this.orange -= orange;

	}
	public void showOS() {
		System.out.println("현재 보유금: " + money);
		System.out.println("현재 보유 오란게: " + orange);
	}
}

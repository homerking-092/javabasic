package buyandsell;

public class Seller {
	//판매자
	//돈, 망고를 가진다
	private int money;
	private int mango;

	//생성자에서 망고갯수를 입력받을 수 있다
	//돈은 0으로 ㄱㄱ
	public Seller(int mango) {
		this.mango = mango;
		this.money = 0;
		
	}
	
	//망고개수를 buyer에서 확인할 수 있도록
	//getMango 게터를 생성
	public int getMango() {
		return mango;
	}
	
	
	//판매시 망고갯수를 입력할 수 있고
	//망고갯수 * 1000만큼의 돈이 올라가고
	//망고는 판 갯수만큼 차감된다
	//0 미만으로 망고가 줄어들 수 없다
	public void sellMango(int mango) {
//		if (mango < 0) {
//			mango = 0;
//			System.out.println("!!!");
//			return;
//		}
//		this.money = money + (mango * 1000);
//		this.mango = mango;
		
		if (this.mango < mango) {		//this.mango 지금 가진 망고
										//	   mango 팔 망고
			System.out.println("망고가 모자라");
			return;
		}
		this.money += mango * 1000;
		this.mango -= mango;
	}
	
	//showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있다
	public void showSeller() {
		System.out.println("현재 가진 돈: " + money);
		System.out.println("현재 망고 갯수: " + mango);
		System.out.println();
	}
}

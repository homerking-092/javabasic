package buyandsell;

public class Buyer {
	// 구매자
	// 구매자는 돈, 망고갯수를 멤버변수로 가진다
	// 은닉 구현의 위해서 private로 처리한다
	private int money;
	private int mango;
	private int orange;
	// 생성자는(int money)를 받아 돈을 초기화한다
	// 망고는 자동으로 0을 대입한다
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.orange = 0;
	}

	//buyMango는 망고를 삽니다(setter)
	//(int mango)로 망고 갯수를 입력 받으면, 망고 * 1000만큼의
	//돈을 차감하고 망고 변수에 그만큼 갯수를 늘려준다
	//현실에서 망고를 구매할 때 구매자가 가게를 고르지
	//가게에서 구매자를 선택하지 않으므로, Seller 변수를
	//Buyer가 고를수 있도록 파라미터 실정을 한다
	public void buyMango(Seller seller, int mango) {
		//조건식 : 망고 가격보다 내 돈이 적은 경우
		if (mango * 1000 > money) {
			System.out.println("잔돈 부족");
			return;
		}
		//조건식 : 구매할 망고 개수보다 판매자의 재고가 적은 경우
		if (seller.getMango() < mango) {
			System.out.println("재고가 부족");
			return;
		}
		//셀러쪽에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
		//동시에 사고 팔도록 처리해야 상호작용이 이루어진다
		seller.sellMango(mango);
		
		this.money = money - (mango * 1000);
		this.mango += mango;
	}
	
	//showBuyer는 구매자의 상태를 보여준다
	//money, mango 수치가 각각 몇인지 콘솔에 찍어준다
	public void showBuyer() {
		System.out.println("현재 가진 돈: " + money);
		System.out.println("산 망고 갯수: " + mango);
		System.out.println("산 오렌지 갯수: " + orange);
		System.out.println();
	}
}

package buyandsell;

public class ShinemuscatSeller {
	// 판매자
		// 돈, 샤인머스캣을 가집니다.
		private int money;
		private int shinemuscat;
		
		// 생성자에서 샤인머스캣 갯수를 입력받을 수 있습니다.
		// 돈은 0으로 넣어주세요.
		public ShinemuscatSeller(int shinemuscat) {
			this.money = 0;
			this.shinemuscat = shinemuscat;
		}
		
		// 판매시 망고갯수를 입력할 수 있고
		// 망고갯수 * 1000만큼의 돈이 올라가고
		// 망고는 판 갯수만큼 차감됩니다.
		// 0 미만으로 망고가 줄어들 수 없습니다.
		public void sellShinemuscat(int shinemuscat) {
			if(this.shinemuscat < shinemuscat) {
				System.out.println("샤인머스캣이 모자랍니다.");
				return;
			}
			this.money += shinemuscat * 5000;
			this.shinemuscat -= shinemuscat;
		}
		
		//showSeller 를 이용해 현재 남은 망고와 돈을 볼 수 있습니다.
		public void showSeller() {
			System.out.println("현재 소지금 : " + money);
			System.out.println("샤인머스캣 개수 : " + shinemuscat);
			System.out.println("-----------------");
		}
		
		// 망고개수를 buyer에서 확인할 수 있도록
		// getMango() 게터를 생성해줌.
		public int getShinemuscat() {
			return shinemuscat;
		}
}

package constructor;

public class BasketballPlayer {
	public String name;
	public int height;
	public int jumpPower;
	public boolean mercernary;

	public BasketballPlayer(String n, int h, int jp, boolean m) { // 생성자
		name = n;
		height = h;
		jumpPower = jp;
		mercernary = m;
		System.out.println("농구선수 생성 완료!");
		System.out.println("이름 : " + n + ", 키 : " + h + ", 점프력 : " + jp + ", 용병여부 : " + m);

	}//end BasketballPlayer(생성자)

	public void shoot() {
		if (height + jumpPower >= 300) {
			System.out.println(name + "은(는)" + "덩크슛에 성공했습니다");
		} else {
			System.out.println("골대에 닿지 않았습니다");
		}
		System.out.println("------------------------------------");
	}// end shoot()
}// end class


public class ChainTest {
	private int num;

	public ChainTest() {	// 생성자
		this.num = 10;
	}

	public int getNum() {
		return this.num;
	}

	public int plusNum() {
		return ++this.num;
	}

	public void showNum() {		// 리턴값 X
		System.out.println("num값: " + num);
	}

	public ChainTest plusThis() {
		this.num++;
		return this;
	}

}// end class

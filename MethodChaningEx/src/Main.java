
public class Main {
	public static void main(String[] args) {
		
		ChainTest test = new ChainTest();
		
		test.plusThis().plusThis().plusThis();
		
//		test.getNum().getNum();
		
		System.out.println(test.getNum());
		
//		System.out.println(test.showNum());
		
	}// end main
}// end class

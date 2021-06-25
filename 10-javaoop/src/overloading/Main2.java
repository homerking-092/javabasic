package overloading;

public class Main2 {
	public static void main(String[] args) {
		OverTest o1 = new OverTest();
		o1.showData();
		OverTest o2 = new OverTest("2번");
		o2.showData();
		OverTest o3 = new OverTest(3);
		o3.showData();
		OverTest o4 = new OverTest("4번", 4);
		o4.showData();
		
		
		
	}
}

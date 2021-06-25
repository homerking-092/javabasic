package constructor;

public class Cigarette {
	public String name;
	public int born;
	public int price;
	public boolean stork;
	
	public Cigarette(String n, int b, int p, boolean s) {
		name = n;
		born = b;
		price = p;
		stork = s;
		System.out.println("담배 : " + n + ", 생산년도 : " + b + 
						   "년" + ", 가격 : " + p + "원" + 
						   	", 재고여부: " + s);
		
		
	}//end Cigarette()
	public void getInfo() {
		System.out.println();
		System.out.println("19세 미만 청소년에게는 판매 금지!!");
		System.out.println("금연상담전화  1544 - 9030");
	}//end getInfo()
	
}//end class

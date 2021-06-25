package practice;

public class Ciga {
	public String name;		//담배이름
	public int born;		//생산년도
	public int price;		//담배가격
	public boolean stork;	//담배재고
	
	public Ciga(String n, int b, int p, boolean s) {
		name = n;
		born = b;
		price = p;
		stork = s;
		System.out.println("담배 : " + n + ", 생산년도 : " + b + "년" + ", 가격 : " + p + "원" +
						  ", 재고여부 : " + s);
		
		System.out.println("19세 미만 청소년에게는 판매 금지");
		System.out.println("금연상담전화 1544 - 9030");
	}
}

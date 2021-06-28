package static2;

public class Main {
	public static void main(String[] args) {
		Asean sony = new Asean(10, 10, 10, "손흥민");
		Asean lin = new Asean(20, 20, 20, "린가드");
		Asean bi = new Asean(30, 30, 30, "비닐신");
		Asean um = new Asean(40, 40, 40, "음바페");
		
		//Asean 조원 없이도 Asean 조별점수는 조회 가능
//		System.out.println("조별점수: " + Asean.score);
		System.out.println();
		
		sony.showAseanInfo();
		lin.showAseanInfo();
		bi.showAseanInfo();
		um.showAseanInfo();
		
	}
}

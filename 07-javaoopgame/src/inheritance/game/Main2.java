package inheritance.game;

public class Main2 {
	public static void main(String[] args) {
		//Warrior를 생성해서 각종 스탯을 입력해주고
		//getInfo()를 호출
		Warrior w = new Warrior();
		w.hp = 1000;
		w.id = "김전사";
		w.lv = 10;
		w.mp = 500;
		w.pm = 1000;
		w.as = 50;
		w.ps = 100;
		w.getInfo();
		w.paUp();
		w.skil1();
		
				
		//getInfo() 호출시 Commoner의 getInfo()는 무시
		//Warrior의 getInfo()가 우선적으로 호출
		
	}
}

package accessmodifier;

public class Main {
	public static void main(String[] args) {
		//전사를 하나 만들고 사냥을 3번 ㄱㄱ
		//사냥 3번 후에 전체 상태를 sysout을 이용해 출력
		Warrior w = new Warrior("김전사");
//		w.hp = 10000000;
		w.hunt();
		w.hunt();
		w.hunt();
		Warrior w2 = new Warrior("짱짱맨");
		w2.hunt();
		w2.hunt();
		
		
//		System.out.println("id: " + w.id);
//		System.out.println("케릭 스탯");
//		System.out.println("레벨: " + w.level);
//		System.out.println("체력: " + w.hp);
//		System.out.println("공격력: " + w.atk);
//		System.out.println("경험치: " + w.exp);
		
	}
}

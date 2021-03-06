package accessmodifier.game;

public class Commoner {
	private int lv;
	private int hp;
	private int mp;
	private String id;
	private int exp;
	
	public Commoner() {
		lv = 1;
		hp = 100;
		mp = 100;
		id = "김초보";
		exp = 0;
	}
	
	public Commoner(int lv, int hp, int mp, String id, int exp) {
		this.exp = exp;
		this.hp	= hp;
		this.id = id;
		this.lv = lv;
		this.mp = mp;
	}
	

	
	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	

	public void cInfo() {
		System.out.println(getId() + "의 스탯");
		System.out.println("레벨: " + getLv());
		System.out.println("hp: " + getHp());
		System.out.println("mp: " + getMp());
		System.out.println("경험치: " + getExp());
		System.out.println();
	}
	
	public void mpDown(int mpd) {
		mp -= mpd;
		
	}
	public int mpDown() {
		return mp;
	}
	
	public void lvUp() {
		if (getExp() >= 100) {
			setLv(getLv() + 1);
			System.out.println("레벨업이 되었습니다");
		}
	}
	
	public void hunt() {
		System.out.println("사냥이 시작되었습니다");
		int cnt = 10;
		if (getHp() > 50) {			//hp가 50을 초과할때
			setHp(getHp() - 20);	//hp가 20 까인다
		}else {						//hp가 50이하일때
			setHp(getHp() - 10);	//hp는 10까이고
			cnt *= 2;				//exp는 10 더 받는다
		}
		System.out.println("받은 경험치: " + cnt);
		exp += cnt;
		System.out.println("현재 체력: " + getHp());
		System.out.println("현재 경험치: " + getExp());
		System.out.println();
	}

	

	
}

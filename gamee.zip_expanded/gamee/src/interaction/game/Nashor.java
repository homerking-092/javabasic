package interaction.game;

public class Nashor {
	private int hp;
	private int atk;
	private int def;
	
	public Nashor() {
		this.hp = 10;
		this.atk = 2;
		this.def = 0;
	}
	// 유저가 공격했을때 내부에서 호출된 doBattle은
	// 유저공격력 uAtk을 받아서 자신의 체력을 그만큼 차감합니다. 
	// 단, 방어력 수치까지 고려해서 체력이 차감되며
	// 바론의 체력이 0이 되는 즉시 죽었다는 메세지를 같이 남깁니다.
	public void doBattle(int uAtk) {
		this.hp = (this.hp + this.def) - uAtk;
		if(this.hp <= 0) {
			System.out.println("바론이 죽었습니다.");
		}
	}
	public int getAtk() {
		return this.atk;
	}
	public int getHp() {
		return this.hp;
	}
	

}

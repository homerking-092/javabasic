package structure;

public class ClassMain {
	public static void main(String[] args) {
		//Person 2명을 만들자
		PersonClass ps1 = new PersonClass();
		PersonClass ps2 = new PersonClass();
		
		//Person 2명 정보를 직접 기입
		ps1.name = "김영훈";
		ps1.age = 30;
		ps1.pNum = "010-8971-2838";
		ps1.address = "서울";
		ps1.sex = "M";
		ps1.glasses = true;
		ps2.name = "손흥민";
		ps2.age = 30;
		ps2.pNum = "010-1234-5678";
		ps2.address = "런던";
		ps2.sex = "M";
		ps2.glasses = false;
		//정보 조회
		ps1.getInfo();
		System.out.println("==============");
		ps2.getInfo();
		
	}
}

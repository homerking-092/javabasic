package structure;

public class ClassMain2 {
	public static void main(String[] args) {
		
		//정보 입력
		PersonInfo sony = new PersonInfo();
//		sony.name = "sony";
//		sony.age = 30; 
//		sony.phone = "019-3291-2321";
//		sony.address = "북런던";
//		sony.sex = "M";
//		sony.aff = "토트넘";
		
		PersonInfo god = new PersonInfo();
		god.name = "황가드";
		god.age = 29;
		god.phone = "010-2321-4321";
		god.address = "런던";
		god.sex = "M";
		god.aff = "웨스트햄";
		
		//정보 조회
		sony.getInfo(); 
		System.out.println("---------------");
		god.getInfo(); 
		
	}
}

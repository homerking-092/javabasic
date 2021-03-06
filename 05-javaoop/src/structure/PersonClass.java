package structure;

public class PersonClass {
	//사람 정보를 Person처럼 정의
	//특성 하나를 추가
	public String name;
	public int age;
	public String pNum;
	public String address;
	//성별 추가
	public String sex;
	//안경 착용 유무
	public boolean glasses;
	
	//추가로 아까의 조회 메서드를 내부에 생성
	//클래스 내부에 생성할 때에는 static이 필요 없다
	//클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + age);
		System.out.println("번호 : " + pNum);
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + sex);
		System.out.println("안경 착용 : " + glasses);
	}//end getInfo
}//end class

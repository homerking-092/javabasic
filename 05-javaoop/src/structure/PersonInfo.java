package structure;

public class PersonInfo {
	public String name;
	public int age;
	public String phone;
	public String address;
	public String sex;
	public String aff;
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + sex);
		System.out.println("소속 : " + aff);
	}
}

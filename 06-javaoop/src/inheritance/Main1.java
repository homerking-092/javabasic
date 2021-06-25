package inheritance;

public class Main1 {
	public static void main(String[] args) {
		//Student가 Person을 상속했기 때문에
		//Student는 Person의 자원을 사용할 수 있다
		Student s1 = new Student();
		s1.name = "김영훈";
		s1.age = 30;
		s1.major = "신소재";
		
		s1.getPersonInfo();
		s1.getStudentInfo();
		
	}
}

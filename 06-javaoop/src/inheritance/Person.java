package inheritance;

//상속시 고려할 것은 논리구조이다
//모든 학생은 사람이다(O), 그러나 모든 사람은 학생이다(X)와 같이
//하나의 클래스가 다른 클래스의 바운더리에 완벽히 속하지만
//그 역이 성립하지 않을때 상속을 사용하면 된다
public class Person {
	public String name;
	public int age;
	
//	public Person(String n, int a) {	//생성자
//		name = n;
//		age = a;
//		System.out.println("사람");
//		System.out.println("이름 : " + n);
//		System.out.println("나이 : " + a);
//	}
	
	public void getPersonInfo() {
		System.out.println("이름은 " + name + "입니다");
		System.out.println("나이는 " + age + "세 입니다");
	}
}//end class

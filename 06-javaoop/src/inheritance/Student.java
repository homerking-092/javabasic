package inheritance;

public class Student extends Person {
	//공통속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의
	public String major;
	public int grader;
	
	public void upGrader() {
		grader++;
	}
	
	public void majorInfo() {
	}
	
	public void getStudentInfo() {
		getPersonInfo();
		System.out.println("전공은 " + major + " 입니다");
		
	}
}

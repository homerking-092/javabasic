package static2;

public class Asean {
	//중간고사, 기말고사, 출석, 조별과제 점수를 변수로 정의
	//단, 조별과제는 모든 객체가 공유하는 점수이며
	//나머지는 개별 객체가 가지는 변수
	private int mExam;
	private int fExam;
	private int attendence;
//	public static int gProject;
	private String name;
	//public시 일반 메서드에서 score조회 가능
	//private시 static 메서드에서만 조회 가능
//	public static int score = 20;
	private static int score = 20;		//힙 영역에 생성시 
										//스태틱공간에 따로 생성
	
	//생성자는 객체 생성시 중간고사, 기말고사, 출석점수를 받는다
	public Asean(int mExam, int fExam, int attendence, String name) {
		this.mExam = mExam;
		this.fExam = fExam;
		this.attendence = attendence;
		this.name = name;
	}
	
	//showAseanInfo()를 정의하라
	//이 메서드는 중간고사, 기말고사, 출결, 조별과제 성적을 콘솔에 출력
	public void showAseanInfo() {
		System.out.println("이름: " + name);
		System.out.println("중간고사 점수: " + mExam);
		System.out.println("기말고사 점수: " + mExam);
		System.out.println("출결 점수: " + attendence);
		System.out.println("조별과제 점수: " + score);
		System.out.println();
	}
	
	//Main.java를 생성하고 메인메서드 내부에 구성원을 최소 4인으로 만들어라
}

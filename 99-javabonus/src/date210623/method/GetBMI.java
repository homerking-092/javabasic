package date210623.method;

public class GetBMI {
	
	//getBMI 메서드를 만들어라
	//리턴 자료형은 double
	//입력은 double height, double weight를 받는다
	//bmi 공식은 몸무게/키(미터)^2
	//175cm의 경우 -> 1.75미터
	//메서드를 여기 작성한 후, 메인 내부에서
	//getBMI를 sysout으로 감싸서 결과값이 나오도록 ㄱㄱ
//	private double height;
//	private double weight;
	
	public static double getBMI(double height, double weight) {
//		return weight / (height / 100 * height / 100);
		double m = height * 0.01;
		double result = weight / (m * m);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getBMI(175, 64));
	}
}

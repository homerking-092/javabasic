import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// loop 변수에 입력된 정수 횟수만큼
		// "문자열 형태인 숫자"를 입력받게 하시오
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
//		String num = scan.next();		///공백을 기준으로 입력 받음
		String num = scan.nextLine();	///nextline 문자 전체 입력받음

		// 이 문자자료 num을 int loop 변수에 정수로 변환해 저장
		int loop = Integer.parseInt(num);	///문자를 숫자로 치환

		// "반복문을 실행합니다(횟수)"라는 문장이 콘솔에 출력되도록
		// while문을 작성하시오
		int count = 0; /// 사용자 입력을 받아줄 변수
		while (count < loop) {
			count += 1;
			System.out.println("반복문을 실행합니다\t" + count);
		}//end while

	}//end main
}//end class

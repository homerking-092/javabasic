import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		//Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		//문자열을 입력받는 경우
		String name = scan.nextLine();
		
		//실수를 입력받는 경우
		double height = scan.nextDouble();
		
		System.out.println(name + " " + height);
		scan.close();
	}
}

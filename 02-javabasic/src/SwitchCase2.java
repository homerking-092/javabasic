
public class SwitchCase2 {
	public static void main(String[] args) {
		//Math.random();을 이용해 난수를 하나 발급 받을수 있고
		//난수의 범위는 0초과 1미만
		double number = Math.random();
		
		//뒤에 숫자를 곱하면 윈하는 범위의 정수를 얻을 수 있다 (곱한 수 -1 까지)
		int intNum = (int)(Math.random() * 6 + 1);		// (+ 1)하면 1부터 뽑히네
		System.out.println(intNum);
		
		//Switch~Case문을 이용해서
		//식당 이름을 출력하는 출력하는 프로그램을 만들어라(최소 6개)
		
		switch (intNum) {
		case 0:
			System.out.println("클라우드캣");
			break;
		case 1:
			System.out.println("홍쉐프");
			break;
		case 2:
			System.out.println("들풀 서교동점");
			break;
		case 3:
			System.out.println("동경일식");
			break;
		case 4:
			System.out.println("윤서울");
			break;
		case 5:
			System.out.println("어메이징 농카이");
			break;
		}
		
	}//end main
}//end class

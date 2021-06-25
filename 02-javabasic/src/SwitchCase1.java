
public class SwitchCase1 {
	public static void main(String[] args) {
		//switch ~ case 구문은 변수에 들어있는 자료가 case문에
		//제시된 자료와 일치하는지 여부로 논리식을 실행합니다
		//	switch(변수){
		//	case 값1:
		//		실행문;
		//	case 값2:
		//		실행문.....;
		//}
		//와 같이 작성한다
		//마지막에 default문을 작성시 if~else문의 else처럼 가능하다
		
		int a = 7;
		switch (a) {
		case 1:							//a = 1일때
			System.out.println("one");
			break;						//case 별로 작성해야 코드가 줄줄이 실행되지 않음
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("???????");
			break;						//마지막 구문에는 작성할 필요는 없으나 일관성을 위해 작성
		}//end switchCase
	}//end main
}//end class

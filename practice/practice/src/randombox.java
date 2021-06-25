
public class randombox {
	public static void main(String[] args) {
		int intNum = (int) (Math.random() * 5 + 1);
		
		switch (intNum) {
		case 1:
			System.out.println("김밥헤븐");
			break;
		case 2:
			System.out.println("애쉴리");
			break;
		case 3:
			System.out.println("국밥");
			break;
		case 4:
			System.out.println("분식");
			break;
		case 5:
			System.out.println("냉면");
			break;
		default:
			System.out.println("걍 굶어라");
			break;
		}
		
	}
}

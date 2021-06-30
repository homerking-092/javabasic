package example;

public class ForStar {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		for (int i = 0; i < 8; i++) {
			for (int j = i; j < 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("------------");
		for (int i = 8; i > 0; i--) {
			for (int j = i; j < 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}//end main
}//end class

package example;

public class for_star {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
			}
			System.out.println("");
		}
	}//end main
}//end class

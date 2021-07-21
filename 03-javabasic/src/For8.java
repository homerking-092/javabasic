
public class For8 {
	public static void main(String[] args) {
		/*
		 *     *
		 * 	  **
		 *   ***
		 * 	****
		 */
		
		System.out.println("<for문 안에 if문>");
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < 4; j++) {
				if (i > j + 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("<이중for문을 이용해서>");
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}//end 전체 for문
		
		System.out.println("==================================");
		/*
		 * 	****
		 * 	 *** 
		 * 	  **   
		 * 	   *
		 */
		System.out.println("<이중for문>");
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("<for문 안 if>");
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i < j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		
		
	}//end main
}//end class

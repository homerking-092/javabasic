
public class stop {
	public static void main(String[] args) {
		Array ar = new Array();
		
		int a = 1;
		for (int num : ar.arr) {
			if (a == num) {
				System.out.println("1이 나와서 종료합니다");
				break;
			}
			System.out.println("이번 숫자는" + num );
		}
		
		outter: for (int i = 1; i <= 9; i++) {
			System.out.println(i + 1 + "단 출력");
			for (int j = 2; j <= 9; j++) {
				if (j > 5) {
					System.out.println("*6 이상은 직접 알아봐라");
					break outter;
				}
				System.out.printf("%d * %d = %d\t",j,i,j*i);
			}
			System.out.println();
		}
	}//end main
}//end class

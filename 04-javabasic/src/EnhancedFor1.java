
public class EnhancedFor1 {
	public static void main(String[] args) {
		//향상된 for문은 반복문 진행시 타켓으로 배열을 넣는다
		//이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼이다
		int[] arr1 = {100, 211, 339, 475, 591};
		
		for (int a: arr1) {
			System.out.print(a + ",");
		}
		System.out.println();
		System.out.println("---------------------");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);	//arr1[i]의 i : index번호
											//===> i번째 값
		}
	}//end main
}//end class

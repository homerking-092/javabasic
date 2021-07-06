package stringbuilder1;

public class Builder5 {
	public static void main(String[] args) {
		//다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해라
		//힌트 : 반복문 이용
		
		StringBuilder a = new StringBuilder("abcdefghejklmnopqrstuvwxyz");
		
		for (int i = 0; i < a.length(); i++) {
			if (i % 3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}//end main
}//end class

package stringbuilder1;

public class Builder7 {
	public static void main(String[] args) {
		//toString()은 내부 자료를 String으로 바꿔준다
		//Stringbuilder 자료형은 엄밀히 말하면 String이 아니기 때문에
		//다시 형 변환을 해줘야 한다
		StringBuilder str = new StringBuilder("가나다라마바사");
		
		//자료형 불일치
		//String hangul = (String) str;
		//String으로 교환시 toString();
		String hangul = str.toString();
		System.out.println(hangul);
		
		//String 자료형인 hangul을 다시 StringBuilder형으로 바꿔서
		//StringBuilder str2라는 변수에 저장 ㄱㄱ
		StringBuilder str2 = new StringBuilder(hangul);
		System.out.println(str2 + " + 1");
		
	}
}

package string1;

public class String2 {
	public static void main(String[] args) {
		//indexOf()는 특정 문자열의 시작 인덱스 값을 반환한다
		//만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴한다
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		System.out.println(get);
		
		//중복문자 처리
		get = tomato.indexOf("to", 1);
		System.out.println(get);
		
		//없는 문자열 처리
		get = tomato.indexOf("banana");
		System.out.println(get);
	}
}

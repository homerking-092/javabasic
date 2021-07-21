package stringbuilder1;

public class Builder8 {
	public static void main(String[] args) {
		//reserve()는 문자열을 인덱스 순으로 따졌을떄
		//역순으로 나열해준다
		StringBuilder str = new StringBuilder("zyxwvut");
		str.reverse();
		
		System.out.println(str);
	}
}

package string1;

public class String7 {
	public static void main(String[] args) {
		//toUpperCase()는 문자열 전체를 대문자로 바꾼다
		//대문자였던것은 대문자 유지, 소문자였던것은 대문자로 바꾼다
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		
		//toLowerCase()는 문자열 전체를 소문자로 바꾼다
		//소문자였던것은 소문자 유지, 대문자였던것은 소문자로 바꾼다
		System.out.println(hello.toLowerCase());
	}
}

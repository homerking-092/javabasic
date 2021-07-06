package string1;

public class String6 {
	public static void main(String[] args) {
		//substring()은 인덱스 기준으로 앞 문자열을 삭제한다
		//인덱스 번호를 두개 주면 처음 인덱스번호 ~ 두번째 인덱스번호 사이만 남겨준다
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);
		System.out.println(result);
		
		result = str.substring(10, 15);	//앞 파라미터는 포함, 뒤는 포함 x
		System.out.println(result);
	}
}

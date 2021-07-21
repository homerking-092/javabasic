package string1;

public class String4 {
	public static void main(String[] args) {
		//length()는 문자열의 길이를 알 수 있다
		//정소로 몇 글자인지 알려준다
		String name = "ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ";
		System.out.println(name.length());
		
		//replace는 찾아바꾸기
		//.replace("찾을단어", "바꿀단어"); 순으로 입력한다
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다";
		
		report.replace("김영수", "손흥민");	//report 초기화? 시키지 않으면 변경 X
											//리턴만 해주고 저장?은 안됨
		report = report.replace("김영수", "손흥민");
		System.out.println(report);
		
		name = name.replace("ㄱㄱ", "ㄴㄴ");
		System.out.println(name);
	}
}

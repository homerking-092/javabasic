
public class ParseInt {
	public static void main(String[] args) {
		//정수자료는 굳이 문자로 바꾸지 않아도
		//Systen.out.println() 구문 내에서 +로 문자와 연결시
		//자동으로 문자로 변경된다
		//그러나 문자 전체가 정수로만 이루어진 문자열을
		//정수로 치환하기 위해서는 별도의 문법을 사용한다
		String str = "2021";
		
		//Integer.parseInt(문자열)을 입력시 정수로 교환해준다
		int year = Integer.parseInt(str);
		
		System.out.println(year + 1);	//year(정수) + 1(정수)
		System.out.println(str + 1);	//str(문자열) + 1(정수)
	}//end main
}//end class

package stringbuilder1;

public class Builder6 {
	public static void main(String[] args) {
		//setChart()은 문자열에서 입력한 인덱스 번호의 문자를
		//다른 문자로 교체해준다
		//insert()는 뒤로 밀어내 공간을 확보했지만 setChart()는
		//그냥 그 위치의 문자를 덮어씌워버린다
		//setChartAt()도 역시 한 번에 한 글자에 대해서만 교체가 가능하다
		StringBuilder str = new StringBuilder("abcdefg");
		System.out.println(str);
		//setCharAt()으로 변경하는 단일 문자는 홑따옴표 '로 여닫는 부분을 작성해야 한다
		str.setCharAt(5, 'z');
		System.out.println(str);
	}
}

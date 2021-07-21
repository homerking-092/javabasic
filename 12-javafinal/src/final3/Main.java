package final3;

public class Main {
	public static void main(String[] args) {
		//final 변수를 사용하기 위한 Country 객체 생성 불필요
		//힐반적으로 상수를 쓰는 경우는
		//한 군데만 수정해도 전체 프로그램에 수정내용이
		//반영되게 만들고 싶을때 사용한다
		System.out.println(Counrty.KOREA);
		System.out.println(Counrty.CHINA);
		System.out.println(Counrty.STATES);
		System.out.println(Counrty.CANADA);
		
		//final로 선언시 초기화 ㄴㄴ
//		Counrty.KOREA = 100000000;
		
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
		System.out.println("한국 넓이는 " + Counrty.KOREA);
	}
}

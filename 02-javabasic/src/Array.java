
public class Array {
	public static void main(String[] args) {
		//배열은 일반 변수와 달리 하나의 변수명에 여러 값을
		//입력할 수 있고 자료형에 []를 붙이는 것으로 선언한다
		//배열은 크기를 정해서 생성할 수도 있고, 정하지 않고 생성할 수도 있는데
		//설정된 크기 이상으로 자료를 넣을수 없다
		//배열의 크기(저장가능 갯수)는 "배열의 길이"라 표현한다
		//배열명.length를 이용해 배열크기를 알수 있다
		//--String : 참조형
		
		//배열의 선언1(길이 확정 X)
		int a[] = {1, 2, 3, 4};	//a는 정수 여러개를 담을 수 있다
		System.out.println(a);	//a변수에 1, 2, 3, 4가 들어감
		//배열의 선언2(길이 확정 X)
		int[] b = {5, 6, 7, 8};	//b는 정수 여러개를 담을 수 있다
		System.out.println(b);	//b변수에 5, 6, 7, 8이 들어감
		
		//배열의 생성(길이 확정)		//전부 0으로 채워짐
		int[] c = new int[8];
		System.out.println(c);
		System.out.println("---------------");
		//배열의 길이는 .length로 알 수 있다
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		
		//주소값이 아닌 배열 전체를 볼 때는
		//.toString()을 사용한다
//		System.out.println(a);
//		System.out.println(b.toString());
//		System.out.println(c.toString());
	}//end main
}//end class

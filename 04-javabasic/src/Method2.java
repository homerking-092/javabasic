
public class Method2 {
	
	public static int add2(int a) {
		return a + 1;
	}
	public static void main(String[] args) {
		//반환자료가 void가 아닌 경우는 호출 위치에
		//return문 오른쪽 자료를 그대도 갖다 놓는다
		//자료를 반환하는 것이 꼭 console창에 표시됨을 의미하지는 않는다
		int b = add2(10);		//코드실행순서: 예외적으로 =는 오른쪽에서 왼쪽 
		System.out.println(b);
	}//end main
}//end class
